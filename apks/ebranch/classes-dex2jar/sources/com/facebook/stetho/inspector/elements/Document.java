package com.facebook.stetho.inspector.elements;

import android.os.SystemClock;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.ArrayListAccumulator;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.elements.ShadowDocument;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;
import com.facebook.stetho.inspector.helper.ThreadBoundProxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/elements/Document.class */
public final class Document extends ThreadBoundProxy {
    private AttributeListAccumulator mCachedAttributeAccumulator;
    private ChildEventingList mCachedChildEventingList;
    private ArrayListAccumulator<Object> mCachedChildrenAccumulator;
    private DocumentProvider mDocumentProvider;
    private final DocumentProviderFactory mFactory;
    private ShadowDocument mShadowDocument;
    private final ObjectIdMapper mObjectIdMapper = new DocumentObjectIdMapper();
    private int mReferenceCounter = 0;
    private UpdateListenerCollection mUpdateListeners = new UpdateListenerCollection();
    private final Queue<Object> mCachedUpdateQueue = new ArrayDeque();

    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/elements/Document$AttributeListAccumulator.class */
    public static final class AttributeListAccumulator extends ArrayList<String> implements AttributeAccumulator {
        @Override // com.facebook.stetho.inspector.elements.AttributeAccumulator
        public final void store(String str, String str2) {
            add(str);
            add(str2);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/elements/Document$ChildEventingList.class */
    public final class ChildEventingList extends ArrayList<Object> {
        private DocumentView mDocumentView;
        private Object mParentElement;
        private int mParentNodeId;

        private ChildEventingList() {
            Document.this = r4;
            this.mParentElement = null;
            this.mParentNodeId = -1;
        }

        public final void acquire(Object obj, DocumentView documentView) {
            this.mParentElement = obj;
            this.mParentNodeId = obj == null ? -1 : Document.this.mObjectIdMapper.getIdForObject(this.mParentElement).intValue();
            this.mDocumentView = documentView;
        }

        public final void addWithEvent(int i, Object obj, Accumulator<Object> accumulator) {
            Object obj2 = i == 0 ? null : get(i - 1);
            int intValue = obj2 == null ? -1 : Document.this.mObjectIdMapper.getIdForObject(obj2).intValue();
            add(i, obj);
            Document.this.mUpdateListeners.onChildNodeInserted(this.mDocumentView, obj, this.mParentNodeId, intValue, accumulator);
        }

        public final void release() {
            clear();
            this.mParentElement = null;
            this.mParentNodeId = -1;
            this.mDocumentView = null;
        }

        public final void removeWithEvent(int i) {
            Document.this.mUpdateListeners.onChildNodeRemoved(this.mParentNodeId, Document.this.mObjectIdMapper.getIdForObject(remove(i)).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/elements/Document$DocumentObjectIdMapper.class */
    public final class DocumentObjectIdMapper extends ObjectIdMapper {
        private DocumentObjectIdMapper() {
            Document.this = r4;
        }

        @Override // com.facebook.stetho.inspector.helper.ObjectIdMapper
        public final void onMapped(Object obj, int i) {
            Document.this.verifyThreadAccess();
            Document.this.mDocumentProvider.getNodeDescriptor(obj).hook(obj);
        }

        @Override // com.facebook.stetho.inspector.helper.ObjectIdMapper
        public final void onUnmapped(Object obj, int i) {
            Document.this.verifyThreadAccess();
            Document.this.mDocumentProvider.getNodeDescriptor(obj).unhook(obj);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/elements/Document$ProviderListener.class */
    final class ProviderListener implements DocumentProviderListener {
        private ProviderListener() {
            Document.this = r4;
        }

        @Override // com.facebook.stetho.inspector.elements.DocumentProviderListener
        public final void onAttributeModified(Object obj, String str, String str2) {
            Document.this.verifyThreadAccess();
            Document.this.mUpdateListeners.onAttributeModified(obj, str, str2);
        }

        @Override // com.facebook.stetho.inspector.elements.DocumentProviderListener
        public final void onAttributeRemoved(Object obj, String str) {
            Document.this.verifyThreadAccess();
            Document.this.mUpdateListeners.onAttributeRemoved(obj, str);
        }

        @Override // com.facebook.stetho.inspector.elements.DocumentProviderListener
        public final void onInspectRequested(Object obj) {
            Document.this.verifyThreadAccess();
            Document.this.mUpdateListeners.onInspectRequested(obj);
        }

        @Override // com.facebook.stetho.inspector.elements.DocumentProviderListener
        public final void onPossiblyChanged() {
            Document.this.updateTree();
        }
    }

    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/elements/Document$UpdateListener.class */
    public interface UpdateListener {
        void onAttributeModified(Object obj, String str, String str2);

        void onAttributeRemoved(Object obj, String str);

        void onChildNodeInserted(DocumentView documentView, Object obj, int i, int i2, Accumulator<Object> accumulator);

        void onChildNodeRemoved(int i, int i2);

        void onInspectRequested(Object obj);
    }

    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/elements/Document$UpdateListenerCollection.class */
    public class UpdateListenerCollection implements UpdateListener {
        private final List<UpdateListener> mListeners = new ArrayList();
        private volatile UpdateListener[] mListenersSnapshot;

        public UpdateListenerCollection() {
            Document.this = r5;
        }

        private UpdateListener[] getListenersSnapshot() {
            while (true) {
                UpdateListener[] updateListenerArr = this.mListenersSnapshot;
                if (updateListenerArr != null) {
                    return updateListenerArr;
                }
                synchronized (this) {
                    if (this.mListenersSnapshot == null) {
                        List<UpdateListener> list = this.mListeners;
                        this.mListenersSnapshot = (UpdateListener[]) list.toArray(new UpdateListener[list.size()]);
                        return this.mListenersSnapshot;
                    }
                }
            }
        }

        public void add(UpdateListener updateListener) {
            synchronized (this) {
                this.mListeners.add(updateListener);
                this.mListenersSnapshot = null;
            }
        }

        public void clear() {
            synchronized (this) {
                this.mListeners.clear();
                this.mListenersSnapshot = null;
            }
        }

        @Override // com.facebook.stetho.inspector.elements.Document.UpdateListener
        public void onAttributeModified(Object obj, String str, String str2) {
            for (UpdateListener updateListener : getListenersSnapshot()) {
                updateListener.onAttributeModified(obj, str, str2);
            }
        }

        @Override // com.facebook.stetho.inspector.elements.Document.UpdateListener
        public void onAttributeRemoved(Object obj, String str) {
            for (UpdateListener updateListener : getListenersSnapshot()) {
                updateListener.onAttributeRemoved(obj, str);
            }
        }

        @Override // com.facebook.stetho.inspector.elements.Document.UpdateListener
        public void onChildNodeInserted(DocumentView documentView, Object obj, int i, int i2, Accumulator<Object> accumulator) {
            for (UpdateListener updateListener : getListenersSnapshot()) {
                updateListener.onChildNodeInserted(documentView, obj, i, i2, accumulator);
            }
        }

        @Override // com.facebook.stetho.inspector.elements.Document.UpdateListener
        public void onChildNodeRemoved(int i, int i2) {
            for (UpdateListener updateListener : getListenersSnapshot()) {
                updateListener.onChildNodeRemoved(i, i2);
            }
        }

        @Override // com.facebook.stetho.inspector.elements.Document.UpdateListener
        public void onInspectRequested(Object obj) {
            for (UpdateListener updateListener : getListenersSnapshot()) {
                updateListener.onInspectRequested(obj);
            }
        }

        public void remove(UpdateListener updateListener) {
            synchronized (this) {
                this.mListeners.remove(updateListener);
                this.mListenersSnapshot = null;
            }
        }
    }

    public Document(DocumentProviderFactory documentProviderFactory) {
        super(documentProviderFactory);
        this.mFactory = documentProviderFactory;
    }

    private AttributeListAccumulator acquireCachedAttributeAccumulator() {
        AttributeListAccumulator attributeListAccumulator = this.mCachedAttributeAccumulator;
        AttributeListAccumulator attributeListAccumulator2 = attributeListAccumulator;
        if (attributeListAccumulator == null) {
            attributeListAccumulator2 = new AttributeListAccumulator();
        }
        this.mCachedChildrenAccumulator = null;
        return attributeListAccumulator2;
    }

    public ChildEventingList acquireChildEventingList(Object obj, DocumentView documentView) {
        ChildEventingList childEventingList = this.mCachedChildEventingList;
        ChildEventingList childEventingList2 = childEventingList;
        if (childEventingList == null) {
            childEventingList2 = new ChildEventingList();
        }
        this.mCachedChildEventingList = null;
        childEventingList2.acquire(obj, documentView);
        return childEventingList2;
    }

    private ArrayListAccumulator<Object> acquireChildrenAccumulator() {
        ArrayListAccumulator<Object> arrayListAccumulator = this.mCachedChildrenAccumulator;
        ArrayListAccumulator<Object> arrayListAccumulator2 = arrayListAccumulator;
        if (arrayListAccumulator == null) {
            arrayListAccumulator2 = new ArrayListAccumulator<>();
        }
        this.mCachedChildrenAccumulator = null;
        return arrayListAccumulator2;
    }

    private void applyDocumentUpdate(final ShadowDocument.Update update) {
        final ArrayList arrayList = new ArrayList();
        update.getGarbageElements(new Accumulator<Object>() { // from class: com.facebook.stetho.inspector.elements.Document.3
            @Override // com.facebook.stetho.common.Accumulator
            public void store(Object obj) {
                Integer num = (Integer) Util.throwIfNull(Document.this.mObjectIdMapper.getIdForObject(obj));
                if (update.getElementInfo(obj).parentElement == null) {
                    Document.this.mUpdateListeners.onChildNodeRemoved(Document.this.mObjectIdMapper.getIdForObject(Document.this.mShadowDocument.getElementInfo(obj).parentElement).intValue(), num.intValue());
                }
                arrayList.add(num);
            }
        });
        Collections.sort(arrayList);
        update.getChangedElements(new Accumulator<Object>() { // from class: com.facebook.stetho.inspector.elements.Document.4
            @Override // com.facebook.stetho.common.Accumulator
            public void store(Object obj) {
                ElementInfo elementInfo;
                Integer num = (Integer) Util.throwIfNull(Document.this.mObjectIdMapper.getIdForObject(obj));
                if (Collections.binarySearch(arrayList, num) < 0 && (elementInfo = Document.this.mShadowDocument.getElementInfo(obj)) != null && update.getElementInfo(obj).parentElement != elementInfo.parentElement) {
                    Document.this.mUpdateListeners.onChildNodeRemoved(Document.this.mObjectIdMapper.getIdForObject(elementInfo.parentElement).intValue(), num.intValue());
                }
            }
        });
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.mObjectIdMapper.removeObjectById(((Integer) arrayList.get(i)).intValue());
        }
        update.getChangedElements(new Accumulator<Object>() { // from class: com.facebook.stetho.inspector.elements.Document.5
            private final HashSet<Object> listenerInsertedElements = new HashSet<>();
            private Accumulator<Object> insertedElements = new Accumulator<Object>() { // from class: com.facebook.stetho.inspector.elements.Document.5.1
                @Override // com.facebook.stetho.common.Accumulator
                public void store(Object obj) {
                    if (update.isElementChanged(obj)) {
                        AnonymousClass5.this.listenerInsertedElements.add(obj);
                    }
                }
            };

            @Override // com.facebook.stetho.common.Accumulator
            public void store(Object obj) {
                ElementInfo elementInfo;
                if (Document.this.mObjectIdMapper.containsObject(obj) && !this.listenerInsertedElements.contains(obj)) {
                    ElementInfo elementInfo2 = Document.this.mShadowDocument.getElementInfo(obj);
                    ElementInfo elementInfo3 = update.getElementInfo(obj);
                    List<Object> emptyList = elementInfo2 != null ? elementInfo2.children : Collections.emptyList();
                    List<Object> list = elementInfo3.children;
                    ChildEventingList acquireChildEventingList = Document.this.acquireChildEventingList(obj, update);
                    int size2 = emptyList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Object obj2 = emptyList.get(i2);
                        if (Document.this.mObjectIdMapper.containsObject(obj2) && ((elementInfo = update.getElementInfo(obj2)) == null || elementInfo.parentElement == obj)) {
                            acquireChildEventingList.add(obj2);
                        }
                    }
                    Document.updateListenerChildren(acquireChildEventingList, list, this.insertedElements);
                    Document.this.releaseChildEventingList(acquireChildEventingList);
                }
            }
        });
        update.commit();
    }

    private void cleanUp() {
        this.mDocumentProvider.postAndWait(new Runnable() { // from class: com.facebook.stetho.inspector.elements.Document.2
            @Override // java.lang.Runnable
            public void run() {
                Document.this.mDocumentProvider.setListener(null);
                Document.this.mShadowDocument = null;
                Document.this.mObjectIdMapper.clear();
                Document.this.mDocumentProvider.dispose();
                Document.this.mDocumentProvider = null;
            }
        });
        this.mUpdateListeners.clear();
    }

    public ShadowDocument.Update createShadowDocumentUpdate() {
        verifyThreadAccess();
        if (this.mDocumentProvider.getRootElement() == this.mShadowDocument.getRootElement()) {
            ArrayListAccumulator<Object> acquireChildrenAccumulator = acquireChildrenAccumulator();
            ShadowDocument.UpdateBuilder beginUpdate = this.mShadowDocument.beginUpdate();
            this.mCachedUpdateQueue.add(this.mDocumentProvider.getRootElement());
            while (!this.mCachedUpdateQueue.isEmpty()) {
                Object remove = this.mCachedUpdateQueue.remove();
                NodeDescriptor nodeDescriptor = this.mDocumentProvider.getNodeDescriptor(remove);
                this.mObjectIdMapper.putObject(remove);
                nodeDescriptor.getChildren(remove, acquireChildrenAccumulator);
                int size = acquireChildrenAccumulator.size();
                int i = 0;
                while (i < size) {
                    Object obj = acquireChildrenAccumulator.get(i);
                    if (obj != null) {
                        this.mCachedUpdateQueue.add(obj);
                    } else {
                        LogUtil.e("%s.getChildren() emitted a null child at position %s for element %s", nodeDescriptor.getClass().getName(), Integer.toString(i), remove);
                        acquireChildrenAccumulator.remove(i);
                        i--;
                        size--;
                    }
                    i++;
                }
                beginUpdate.setElementChildren(remove, acquireChildrenAccumulator);
                acquireChildrenAccumulator.clear();
            }
            releaseChildrenAccumulator(acquireChildrenAccumulator);
            return beginUpdate.build();
        }
        throw new IllegalStateException();
    }

    private boolean doesElementMatch(Object obj, Pattern pattern) {
        AttributeListAccumulator acquireCachedAttributeAccumulator = acquireCachedAttributeAccumulator();
        NodeDescriptor nodeDescriptor = this.mDocumentProvider.getNodeDescriptor(obj);
        nodeDescriptor.getAttributes(obj, acquireCachedAttributeAccumulator);
        int size = acquireCachedAttributeAccumulator.size();
        for (int i = 0; i < size; i++) {
            if (pattern.matcher(acquireCachedAttributeAccumulator.get(i)).find()) {
                releaseCachedAttributeAccumulator(acquireCachedAttributeAccumulator);
                return true;
            }
        }
        releaseCachedAttributeAccumulator(acquireCachedAttributeAccumulator);
        return pattern.matcher(nodeDescriptor.getNodeName(obj)).find();
    }

    private void findMatches(Object obj, Pattern pattern, Accumulator<Integer> accumulator) {
        ElementInfo elementInfo = this.mShadowDocument.getElementInfo(obj);
        int size = elementInfo.children.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = elementInfo.children.get(i);
            if (doesElementMatch(obj2, pattern)) {
                accumulator.store(this.mObjectIdMapper.getIdForObject(obj2));
            }
            findMatches(obj2, pattern, accumulator);
        }
    }

    private void init() {
        DocumentProvider create = this.mFactory.create();
        this.mDocumentProvider = create;
        create.postAndWait(new Runnable() { // from class: com.facebook.stetho.inspector.elements.Document.1
            @Override // java.lang.Runnable
            public void run() {
                Document document = Document.this;
                document.mShadowDocument = new ShadowDocument(document.mDocumentProvider.getRootElement());
                Document.this.createShadowDocumentUpdate().commit();
                Document.this.mDocumentProvider.setListener(new ProviderListener());
            }
        });
    }

    private void releaseCachedAttributeAccumulator(AttributeListAccumulator attributeListAccumulator) {
        attributeListAccumulator.clear();
        if (this.mCachedAttributeAccumulator == null) {
            this.mCachedAttributeAccumulator = attributeListAccumulator;
        }
    }

    public void releaseChildEventingList(ChildEventingList childEventingList) {
        childEventingList.release();
        if (this.mCachedChildEventingList == null) {
            this.mCachedChildEventingList = childEventingList;
        }
    }

    private void releaseChildrenAccumulator(ArrayListAccumulator<Object> arrayListAccumulator) {
        arrayListAccumulator.clear();
        if (this.mCachedChildrenAccumulator == null) {
            this.mCachedChildrenAccumulator = arrayListAccumulator;
        }
    }

    public static void updateListenerChildren(ChildEventingList childEventingList, List<Object> list, Accumulator<Object> accumulator) {
        int i = 0;
        while (i <= childEventingList.size()) {
            if (i == childEventingList.size()) {
                if (i != list.size()) {
                    childEventingList.addWithEvent(i, list.get(i), accumulator);
                } else {
                    return;
                }
            } else if (i == list.size()) {
                childEventingList.removeWithEvent(i);
            } else {
                Object obj = childEventingList.get(i);
                Object obj2 = list.get(i);
                if (obj != obj2) {
                    int indexOf = childEventingList.indexOf(obj2);
                    if (indexOf == -1) {
                        childEventingList.addWithEvent(i, obj2, accumulator);
                    } else {
                        childEventingList.removeWithEvent(indexOf);
                        childEventingList.addWithEvent(i, obj2, accumulator);
                    }
                }
            }
            i++;
        }
    }

    public void updateTree() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ShadowDocument.Update createShadowDocumentUpdate = createShadowDocumentUpdate();
        boolean isEmpty = createShadowDocumentUpdate.isEmpty();
        if (isEmpty) {
            createShadowDocumentUpdate.abandon();
        } else {
            applyDocumentUpdate(createShadowDocumentUpdate);
        }
        LogUtil.d("Document.updateTree() completed in %s ms%s", Long.toString(SystemClock.elapsedRealtime() - elapsedRealtime), isEmpty ? " (no changes)" : "");
    }

    public final void addRef() {
        synchronized (this) {
            int i = this.mReferenceCounter;
            this.mReferenceCounter = i + 1;
            if (i == 0) {
                init();
            }
        }
    }

    public final void addUpdateListener(UpdateListener updateListener) {
        this.mUpdateListeners.add(updateListener);
    }

    public final void findMatchingElements(String str, Accumulator<Integer> accumulator) {
        verifyThreadAccess();
        findMatches(this.mDocumentProvider.getRootElement(), Pattern.compile(Pattern.quote(str), 2), accumulator);
    }

    public final DocumentView getDocumentView() {
        verifyThreadAccess();
        return this.mShadowDocument;
    }

    public final void getElementComputedStyles(Object obj, ComputedStyleAccumulator computedStyleAccumulator) {
        getNodeDescriptor(obj).getComputedStyles(obj, computedStyleAccumulator);
    }

    @Nullable
    public final Object getElementForNodeId(int i) {
        return this.mObjectIdMapper.getObjectForId(i);
    }

    public final void getElementStyleRuleNames(Object obj, StyleRuleNameAccumulator styleRuleNameAccumulator) {
        getNodeDescriptor(obj).getStyleRuleNames(obj, styleRuleNameAccumulator);
    }

    public final void getElementStyles(Object obj, String str, StyleAccumulator styleAccumulator) {
        getNodeDescriptor(obj).getStyles(obj, str, styleAccumulator);
    }

    @Nullable
    public final NodeDescriptor getNodeDescriptor(Object obj) {
        verifyThreadAccess();
        return this.mDocumentProvider.getNodeDescriptor(obj);
    }

    @Nullable
    public final Integer getNodeIdForElement(Object obj) {
        return this.mObjectIdMapper.getIdForObject(obj);
    }

    public final Object getRootElement() {
        verifyThreadAccess();
        Object rootElement = this.mDocumentProvider.getRootElement();
        if (rootElement == null) {
            throw new IllegalStateException();
        } else if (rootElement == this.mShadowDocument.getRootElement()) {
            return rootElement;
        } else {
            throw new IllegalStateException();
        }
    }

    public final void hideHighlight() {
        verifyThreadAccess();
        this.mDocumentProvider.hideHighlight();
    }

    public final void highlightElement(Object obj, int i) {
        verifyThreadAccess();
        this.mDocumentProvider.highlightElement(obj, i);
    }

    public final void release() {
        synchronized (this) {
            int i = this.mReferenceCounter;
            if (i > 0) {
                int i2 = i - 1;
                this.mReferenceCounter = i2;
                if (i2 == 0) {
                    cleanUp();
                }
            }
        }
    }

    public final void removeUpdateListener(UpdateListener updateListener) {
        this.mUpdateListeners.remove(updateListener);
    }

    public final void setAttributesAsText(Object obj, String str) {
        verifyThreadAccess();
        this.mDocumentProvider.setAttributesAsText(obj, str);
    }

    public final void setElementStyle(Object obj, String str, String str2, String str3) {
        getNodeDescriptor(obj).setStyle(obj, str, str2, str3);
    }

    public final void setInspectModeEnabled(boolean z) {
        verifyThreadAccess();
        this.mDocumentProvider.setInspectModeEnabled(z);
    }
}
