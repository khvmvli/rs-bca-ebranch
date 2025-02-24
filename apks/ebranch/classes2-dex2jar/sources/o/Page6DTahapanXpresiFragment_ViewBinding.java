package o;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.TypeCastException;
import o.Page6DTahapanBCAFragment_ViewBinding;
import o.Page6DTahapanBCASFragment_ViewBinding;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes2-dex2jar.jar:o/Page6DTahapanXpresiFragment_ViewBinding.class */
public final class Page6DTahapanXpresiFragment_ViewBinding extends LayoutInflater {
    private static final Set<String> a;
    private static final onChooseValueSumberPenghasilan b;
    public static final IconCompatParcelizer e = new IconCompatParcelizer((byte) 0);
    private final onClickCardPlatinum c;
    private final boolean d;
    private boolean f;
    private boolean g;
    private final onClickCardPlatinum i;

    /* loaded from: classes2-dex2jar.jar:o/Page6DTahapanXpresiFragment_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        static final /* synthetic */ BeneficiaryBankDetailPresenter[] e = {(BeneficiaryBankDetailPresenter) subscriberLoadDraftBankTransferEvent.b(new subscriberDeleteTmpListTeller(subscriberLoadDraftBankTransferEvent.a(IconCompatParcelizer.class), "CONSTRUCTOR_ARGS_FIELD", "getCONSTRUCTOR_ARGS_FIELD()Ljava/lang/reflect/Field;"))};

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static final /* synthetic */ Field a(IconCompatParcelizer iconCompatParcelizer) {
            onChooseValueSumberPenghasilan onchoosevaluesumberpenghasilan = Page6DTahapanXpresiFragment_ViewBinding.b;
            IconCompatParcelizer iconCompatParcelizer2 = Page6DTahapanXpresiFragment_ViewBinding.e;
            return (Field) onchoosevaluesumberpenghasilan.d();
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/Page6DTahapanXpresiFragment_ViewBinding$MediaDescriptionCompat.class */
    public static final class MediaDescriptionCompat implements onClickCardPlatinum {
        private final LayoutInflater.Factory e;

        public MediaDescriptionCompat(LayoutInflater.Factory factory) {
            subscribeReservationRescheduleEvent.b(factory, "");
            this.e = factory;
        }

        public final View a(View view, String str, Context context, AttributeSet attributeSet) {
            subscribeReservationRescheduleEvent.b(str, "");
            subscribeReservationRescheduleEvent.b(context, "");
            return this.e.onCreateView(str, context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/Page6DTahapanXpresiFragment_ViewBinding$MediaMetadataCompat.class */
    public static final class MediaMetadataCompat extends Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$MediaItem {
        private final Page6DTahapanXpresiFragment_ViewBinding a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(LayoutInflater.Factory2 factory2, Page6DTahapanXpresiFragment_ViewBinding page6DTahapanXpresiFragment_ViewBinding) {
            super(factory2);
            subscribeReservationRescheduleEvent.b(factory2, "");
            subscribeReservationRescheduleEvent.b(page6DTahapanXpresiFragment_ViewBinding, "");
            this.a = page6DTahapanXpresiFragment_ViewBinding;
        }

        @Override // o.Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$MediaItem
        public final View a(View view, String str, Context context, AttributeSet attributeSet) {
            subscribeReservationRescheduleEvent.b(str, "");
            subscribeReservationRescheduleEvent.b(context, "");
            return this.a.e(c().onCreateView(view, str, context, attributeSet), str, context, attributeSet);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/Page6DTahapanXpresiFragment_ViewBinding$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<Field> {
        public static final RemoteActionCompatParcelizer b = new RemoteActionCompatParcelizer();

        RemoteActionCompatParcelizer() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Field declaredField = LayoutInflater.class.getDeclaredField("mConstructorArgs");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return declaredField;
            }
            throw new IllegalArgumentException("No constructor arguments field found in LayoutInflater!".toString());
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/Page6DTahapanXpresiFragment_ViewBinding$read.class */
    static final class read extends Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$SearchResultReceiver {
        private final MediaMetadataCompat a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(LayoutInflater.Factory2 factory2, Page6DTahapanXpresiFragment_ViewBinding page6DTahapanXpresiFragment_ViewBinding) {
            super(factory2);
            subscribeReservationRescheduleEvent.b(factory2, "");
            subscribeReservationRescheduleEvent.b(page6DTahapanXpresiFragment_ViewBinding, "");
            this.a = new MediaMetadataCompat(factory2, page6DTahapanXpresiFragment_ViewBinding);
        }

        @Override // o.Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$SearchResultReceiver, android.view.LayoutInflater.Factory2
        public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            subscribeReservationRescheduleEvent.b(str, "");
            subscribeReservationRescheduleEvent.b(context, "");
            Page6DTahapanBCASFragment_ViewBinding.read read = Page6DTahapanBCASFragment_ViewBinding.e;
            Page6DTahapanBCASFragment_ViewBinding a = Page6DTahapanBCASFragment_ViewBinding.a();
            Page6DTahapanBCASFragment_ViewBinding page6DTahapanBCASFragment_ViewBinding = a;
            if (a == null) {
                page6DTahapanBCASFragment_ViewBinding = new Page6DTahapanBCASFragment_ViewBinding.IconCompatParcelizer().b();
                Page6DTahapanBCASFragment_ViewBinding.a(page6DTahapanBCASFragment_ViewBinding);
            }
            Page6DTahapanBCAFragment page6DTahapanBCAFragment = new Page6DTahapanBCAFragment(str, context, attributeSet, view, this.a);
            subscribeReservationRescheduleEvent.b(page6DTahapanBCAFragment, "");
            return new Page6DTapresFragment_ViewBinding(page6DTahapanBCASFragment_ViewBinding.c, 0, page6DTahapanBCAFragment).e(page6DTahapanBCAFragment).b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/Page6DTahapanXpresiFragment_ViewBinding$write.class */
    public static final class write implements onClickCardPlatinum {
        private final Page6DTahapanXpresiFragment_ViewBinding b;

        public write(Page6DTahapanXpresiFragment_ViewBinding page6DTahapanXpresiFragment_ViewBinding) {
            subscribeReservationRescheduleEvent.b(page6DTahapanXpresiFragment_ViewBinding, "");
            this.b = page6DTahapanXpresiFragment_ViewBinding;
        }

        public final View a(View view, String str, Context context, AttributeSet attributeSet) {
            View view2;
            View createView;
            subscribeReservationRescheduleEvent.b(str, "");
            subscribeReservationRescheduleEvent.b(context, "");
            Iterator it = Page6DTahapanXpresiFragment_ViewBinding.a.iterator();
            View view3 = null;
            while (true) {
                view2 = view3;
                if (!it.hasNext()) {
                    break;
                }
                try {
                    createView = this.b.createView(str, (String) it.next(), attributeSet);
                    view3 = createView;
                } catch (ClassNotFoundException e) {
                    view3 = view3;
                }
                if (createView != null) {
                    view2 = createView;
                    break;
                }
            }
            View view4 = view2;
            if (view2 == null) {
                view4 = this.b.d(str, attributeSet);
            }
            return view4;
        }
    }

    static {
        String[] strArr = {"android.widget.", "android.webkit."};
        subscribeReservationRescheduleEvent.e(strArr, "");
        subscribeReservationRescheduleEvent.e(strArr, "");
        a = (Set) Page6MLFragment.d(strArr, new LinkedHashSet(onChooseMataUangEvent.b(2)));
        pilihNoRek pilihnorek = RemoteActionCompatParcelizer.b;
        subscribeReservationRescheduleEvent.e(pilihnorek, "");
        b = new Page6KLFragment_ViewBinding(pilihnorek, (Object) null, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Page6DTahapanXpresiFragment_ViewBinding(LayoutInflater layoutInflater, Context context, boolean z) {
        super(layoutInflater, context);
        subscribeReservationRescheduleEvent.b(layoutInflater, "");
        subscribeReservationRescheduleEvent.b(context, "");
        this.d = Build.VERSION.SDK_INT > 28 || setSmoothScrollingEnabled.a();
        this.c = new write(this);
        this.i = new onClickCardPlatinum(this) { // from class: o.Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver
            private final Page6DTahapanXpresiFragment_ViewBinding b;

            {
                subscribeReservationRescheduleEvent.b(r4, "");
                this.b = r4;
            }

            public final View a(View view, String str, Context context2, AttributeSet attributeSet) {
                subscribeReservationRescheduleEvent.b(str, "");
                subscribeReservationRescheduleEvent.b(context2, "");
                return this.b.e(view, str, attributeSet);
            }
        };
        Page6DTahapanBCASFragment_ViewBinding.read read2 = Page6DTahapanBCASFragment_ViewBinding.e;
        Page6DTahapanBCASFragment_ViewBinding a2 = Page6DTahapanBCASFragment_ViewBinding.a();
        Page6DTahapanBCASFragment_ViewBinding page6DTahapanBCASFragment_ViewBinding = a2;
        if (a2 == null) {
            page6DTahapanBCASFragment_ViewBinding = new Page6DTahapanBCASFragment_ViewBinding.IconCompatParcelizer().b();
            Page6DTahapanBCASFragment_ViewBinding.a(page6DTahapanBCASFragment_ViewBinding);
        }
        this.f = page6DTahapanBCASFragment_ViewBinding.d;
        if (!z) {
            if (getFactory2() != null && !(getFactory2() instanceof Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$SearchResultReceiver)) {
                setFactory2(getFactory2());
            }
            if (getFactory() != null && !(getFactory() instanceof Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$ItemReceiver)) {
                setFactory(getFactory());
            }
        }
    }

    public final View d(String str, AttributeSet attributeSet) {
        View view;
        try {
            view = onCreateView(str, attributeSet);
        } catch (ClassNotFoundException e2) {
            view = null;
        }
        return view;
    }

    public final View e(View view, String str, Context context, AttributeSet attributeSet) {
        Field field;
        Page6DTahapanBCASFragment_ViewBinding.read read2 = Page6DTahapanBCASFragment_ViewBinding.e;
        Page6DTahapanBCASFragment_ViewBinding a2 = Page6DTahapanBCASFragment_ViewBinding.a();
        Page6DTahapanBCASFragment_ViewBinding page6DTahapanBCASFragment_ViewBinding = a2;
        if (a2 == null) {
            page6DTahapanBCASFragment_ViewBinding = new Page6DTahapanBCASFragment_ViewBinding.IconCompatParcelizer().b();
            Page6DTahapanBCASFragment_ViewBinding.a(page6DTahapanBCASFragment_ViewBinding);
        }
        if (!page6DTahapanBCASFragment_ViewBinding.b) {
            return view;
        }
        View view2 = view;
        if (view == null) {
            view2 = view;
            if (CheckOTPSessionPresenter.d(str, '.', 0, false) >= 0) {
                if (this.d) {
                    view2 = cloneInContext(context).createView(str, null, attributeSet);
                } else {
                    IconCompatParcelizer iconCompatParcelizer = e;
                    Object obj = IconCompatParcelizer.a(iconCompatParcelizer).get(this);
                    if (obj != null) {
                        Object[] objArr = (Object[]) obj;
                        Object obj2 = objArr[0];
                        objArr[0] = context;
                        Field a3 = IconCompatParcelizer.a(iconCompatParcelizer);
                        subscribeReservationRescheduleEvent.b(a3, "");
                        subscribeReservationRescheduleEvent.b(this, "");
                        subscribeReservationRescheduleEvent.b(objArr, "");
                        try {
                            a3.set(this, objArr);
                        } catch (IllegalAccessException e2) {
                        }
                        try {
                            view = createView(str, null, attributeSet);
                            objArr[0] = obj2;
                            field = IconCompatParcelizer.a(iconCompatParcelizer);
                        } catch (ClassNotFoundException e3) {
                            objArr[0] = obj2;
                            field = IconCompatParcelizer.a(e);
                        } catch (Throwable th) {
                            objArr[0] = obj2;
                            Field a4 = IconCompatParcelizer.a(e);
                            subscribeReservationRescheduleEvent.b(a4, "");
                            subscribeReservationRescheduleEvent.b(this, "");
                            subscribeReservationRescheduleEvent.b(objArr, "");
                            try {
                                a4.set(this, objArr);
                            } catch (IllegalAccessException e4) {
                            }
                            throw th;
                        }
                        subscribeReservationRescheduleEvent.b(field, "");
                        subscribeReservationRescheduleEvent.b(this, "");
                        subscribeReservationRescheduleEvent.b(objArr, "");
                        try {
                            field.set(this, objArr);
                            view2 = view;
                        } catch (IllegalAccessException e5) {
                            view2 = view;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any>");
                    }
                }
            }
        }
        return view2;
    }

    public final View e(View view, String str, AttributeSet attributeSet) {
        View view2;
        try {
            view2 = onCreateView(view, str, attributeSet);
        } catch (ClassNotFoundException e2) {
            view2 = null;
        }
        return view2;
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        subscribeReservationRescheduleEvent.b(context, "");
        return new Page6DTahapanXpresiFragment_ViewBinding(this, context, true);
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i, ViewGroup viewGroup, boolean z) {
        View inflate = inflate(i, viewGroup, z);
        if (inflate != null && this.f) {
            inflate.setTag(Page6DTahapanBCAFragment_ViewBinding.read.b, Integer.valueOf(i));
        }
        return inflate;
    }

    @Override // android.view.LayoutInflater
    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        Method method;
        subscribeReservationRescheduleEvent.b(xmlPullParser, "");
        if (!this.g) {
            Page6DTahapanBCASFragment_ViewBinding.read read2 = Page6DTahapanBCASFragment_ViewBinding.e;
            Page6DTahapanBCASFragment_ViewBinding a2 = Page6DTahapanBCASFragment_ViewBinding.a();
            Page6DTahapanBCASFragment_ViewBinding page6DTahapanBCASFragment_ViewBinding = a2;
            if (a2 == null) {
                page6DTahapanBCASFragment_ViewBinding = new Page6DTahapanBCASFragment_ViewBinding.IconCompatParcelizer().b();
                Page6DTahapanBCASFragment_ViewBinding.a(page6DTahapanBCASFragment_ViewBinding);
            }
            if (page6DTahapanBCASFragment_ViewBinding.a) {
                if (!(getContext() instanceof LayoutInflater.Factory2)) {
                    this.g = true;
                } else {
                    subscribeReservationRescheduleEvent.b(LayoutInflater.class, "");
                    subscribeReservationRescheduleEvent.b("setPrivateFactory", "");
                    Method[] methods = LayoutInflater.class.getMethods();
                    int length = methods.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            method = null;
                            break;
                        }
                        method = methods[i];
                        subscribeReservationRescheduleEvent.a(method, "");
                        if (subscribeReservationRescheduleEvent.b(method.getName(), "setPrivateFactory")) {
                            method.setAccessible(true);
                            break;
                        }
                        i++;
                    }
                    Object[] objArr = new Object[1];
                    Context context = getContext();
                    if (context != null) {
                        objArr[0] = new read((LayoutInflater.Factory2) context, this);
                        subscribeReservationRescheduleEvent.b(this, "");
                        subscribeReservationRescheduleEvent.b(objArr, "");
                        if (method != null) {
                            try {
                                method.invoke(this, Arrays.copyOf(objArr, 1));
                            } catch (IllegalAccessException e2) {
                                Log.d("ReflectionUtils", "Can't access method using reflection", e2);
                            } catch (InvocationTargetException e3) {
                                Log.d("ReflectionUtils", "Can't invoke method using reflection", e3);
                            }
                        }
                        this.g = true;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater.Factory2");
                    }
                }
            }
        }
        View inflate = inflate(xmlPullParser, viewGroup, z);
        subscribeReservationRescheduleEvent.a(inflate, "");
        return inflate;
    }

    @Override // android.view.LayoutInflater
    protected final View onCreateView(View view, String str, AttributeSet attributeSet) throws ClassNotFoundException {
        subscribeReservationRescheduleEvent.b(str, "");
        Page6DTahapanBCASFragment_ViewBinding.read read2 = Page6DTahapanBCASFragment_ViewBinding.e;
        Page6DTahapanBCASFragment_ViewBinding a2 = Page6DTahapanBCASFragment_ViewBinding.a();
        Page6DTahapanBCASFragment_ViewBinding page6DTahapanBCASFragment_ViewBinding = a2;
        if (a2 == null) {
            page6DTahapanBCASFragment_ViewBinding = new Page6DTahapanBCASFragment_ViewBinding.IconCompatParcelizer().b();
            Page6DTahapanBCASFragment_ViewBinding.a(page6DTahapanBCASFragment_ViewBinding);
        }
        Context context = getContext();
        subscribeReservationRescheduleEvent.a(context, "");
        Page6DTahapanBCAFragment page6DTahapanBCAFragment = new Page6DTahapanBCAFragment(str, context, attributeSet, view, this.i);
        subscribeReservationRescheduleEvent.b(page6DTahapanBCAFragment, "");
        return new Page6DTapresFragment_ViewBinding(page6DTahapanBCASFragment_ViewBinding.c, 0, page6DTahapanBCAFragment).e(page6DTahapanBCAFragment).b;
    }

    @Override // android.view.LayoutInflater
    protected final View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        subscribeReservationRescheduleEvent.b(str, "");
        Page6DTahapanBCASFragment_ViewBinding.read read2 = Page6DTahapanBCASFragment_ViewBinding.e;
        Page6DTahapanBCASFragment_ViewBinding a2 = Page6DTahapanBCASFragment_ViewBinding.a();
        Page6DTahapanBCASFragment_ViewBinding page6DTahapanBCASFragment_ViewBinding = a2;
        if (a2 == null) {
            page6DTahapanBCASFragment_ViewBinding = new Page6DTahapanBCASFragment_ViewBinding.IconCompatParcelizer().b();
            Page6DTahapanBCASFragment_ViewBinding.a(page6DTahapanBCASFragment_ViewBinding);
        }
        Context context = getContext();
        subscribeReservationRescheduleEvent.a(context, "");
        Page6DTahapanBCAFragment page6DTahapanBCAFragment = new Page6DTahapanBCAFragment(str, context, attributeSet, null, this.c, 8);
        subscribeReservationRescheduleEvent.b(page6DTahapanBCAFragment, "");
        return new Page6DTapresFragment_ViewBinding(page6DTahapanBCASFragment_ViewBinding.c, 0, page6DTahapanBCAFragment).e(page6DTahapanBCAFragment).b;
    }

    @Override // android.view.LayoutInflater
    public final void setFactory(LayoutInflater.Factory factory) {
        subscribeReservationRescheduleEvent.b(factory, "");
        Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$ItemReceiver page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$ItemReceiver = factory;
        if (!(factory instanceof Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$ItemReceiver)) {
            page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$ItemReceiver = new Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$ItemReceiver(factory);
        }
        setFactory(page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$ItemReceiver);
    }

    @Override // android.view.LayoutInflater
    public final void setFactory2(LayoutInflater.Factory2 factory2) {
        subscribeReservationRescheduleEvent.b(factory2, "");
        Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$SearchResultReceiver page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$SearchResultReceiver = factory2;
        if (!(factory2 instanceof Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$SearchResultReceiver)) {
            page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$SearchResultReceiver = new Page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$SearchResultReceiver(factory2);
        }
        setFactory2(page6DTahapanXpresiFragment_ViewBinding$MediaBrowserCompat$SearchResultReceiver);
    }
}
