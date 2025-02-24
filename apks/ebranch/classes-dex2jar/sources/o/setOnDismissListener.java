package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes-dex2jar.jar:o/setOnDismissListener.class */
public class setOnDismissListener implements WindowInsetsCompat$Impl29 {
    private static final int[] r = {1, 4, 5, 3, 2, 0};
    public RemoteActionCompatParcelizer b;
    setExpandActivityOverflowButtonDrawable c;
    public final Context e;
    CharSequence g;
    View h;
    Drawable j;

    /* renamed from: o */
    public boolean f250o;
    private ContextMenu.ContextMenuInfo q;
    private boolean u;
    private final Resources x;
    private boolean y;
    public int a = 0;
    public boolean p = false;
    public boolean n = false;
    public boolean t = false;
    boolean k = false;
    private boolean w = false;
    private ArrayList<setExpandActivityOverflowButtonDrawable> B = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<setDropDownBackgroundResource>> s = new CopyOnWriteArrayList<>();
    private boolean v = false;
    ArrayList<setExpandActivityOverflowButtonDrawable> m = new ArrayList<>();
    private ArrayList<setExpandActivityOverflowButtonDrawable> D = new ArrayList<>();
    boolean f = true;
    public ArrayList<setExpandActivityOverflowButtonDrawable> d = new ArrayList<>();
    public ArrayList<setExpandActivityOverflowButtonDrawable> l = new ArrayList<>();
    public boolean i = true;

    /* loaded from: classes-dex2jar.jar:o/setOnDismissListener$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        boolean b(setOnDismissListener setondismisslistener, MenuItem menuItem);

        void e(setOnDismissListener setondismisslistener);
    }

    /* loaded from: classes-dex2jar.jar:o/setOnDismissListener$read.class */
    public interface read {
        boolean c(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable);
    }

    public setOnDismissListener(Context context) {
        this.e = context;
        this.x = context.getResources();
        this.u = this.x.getConfiguration().keyboard != 1 ? dump.c(ViewConfiguration.get(this.e), this.e) : false;
    }

    private setExpandActivityOverflowButtonDrawable a(int i, KeyEvent keyEvent) {
        ArrayList<setExpandActivityOverflowButtonDrawable> arrayList = this.B;
        arrayList.clear();
        c(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean h = h();
        for (int i2 = 0; i2 < size; i2++) {
            setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = arrayList.get(i2);
            char alphabeticShortcut = h ? setexpandactivityoverflowbuttondrawable.getAlphabeticShortcut() : setexpandactivityoverflowbuttondrawable.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (h && alphabeticShortcut == '\b' && i == 67))) {
                return setexpandactivityoverflowbuttondrawable;
            }
        }
        return null;
    }

    private boolean b(setTextAppearance settextappearance, setDropDownBackgroundResource setdropdownbackgroundresource) {
        boolean z = false;
        if (this.s.isEmpty()) {
            return false;
        }
        if (setdropdownbackgroundresource != null) {
            z = setdropdownbackgroundresource.a(settextappearance);
        }
        Iterator<WeakReference<setDropDownBackgroundResource>> it = this.s.iterator();
        while (it.hasNext()) {
            WeakReference<setDropDownBackgroundResource> next = it.next();
            setDropDownBackgroundResource setdropdownbackgroundresource2 = next.get();
            if (setdropdownbackgroundresource2 == null) {
                this.s.remove(next);
            } else if (!z) {
                z = setdropdownbackgroundresource2.a(settextappearance);
            }
        }
        return z;
    }

    private static int c(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = r;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private static int c(ArrayList<setExpandActivityOverflowButtonDrawable> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).j <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    private void c(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.x;
        if (view != null) {
            this.h = view;
            this.g = null;
            this.j = null;
        } else {
            if (i > 0) {
                this.g = resources.getText(i);
            } else if (charSequence != null) {
                this.g = charSequence;
            }
            if (i2 > 0) {
                this.j = copyWindowDataInto.b(this.e, i2);
            } else if (drawable != null) {
                this.j = drawable;
            }
            this.h = null;
        }
        e(false);
    }

    private void c(List<setExpandActivityOverflowButtonDrawable> list, int i, KeyEvent keyEvent) {
        boolean h = h();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.m.size();
            for (int i2 = 0; i2 < size; i2++) {
                setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = this.m.get(i2);
                if (setexpandactivityoverflowbuttondrawable.hasSubMenu()) {
                    ((setOnDismissListener) setexpandactivityoverflowbuttondrawable.getSubMenu()).c(list, i, keyEvent);
                }
                char alphabeticShortcut = h ? setexpandactivityoverflowbuttondrawable.getAlphabeticShortcut() : setexpandactivityoverflowbuttondrawable.getNumericShortcut();
                if (((modifiers & 69647) == ((h ? setexpandactivityoverflowbuttondrawable.getAlphabeticModifiers() : setexpandactivityoverflowbuttondrawable.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (h && alphabeticShortcut == '\b' && i == 67)) && setexpandactivityoverflowbuttondrawable.isEnabled())) {
                    list.add(setexpandactivityoverflowbuttondrawable);
                }
            }
        }
    }

    private void d(int i, boolean z) {
        if (i >= 0 && i < this.m.size()) {
            this.m.remove(i);
            if (z) {
                e(true);
            }
        }
    }

    public final setOnDismissListener a(int i) {
        c(0, null, i, null, null);
        return this;
    }

    public final void a() {
        ArrayList<setExpandActivityOverflowButtonDrawable> e = e();
        if (this.i) {
            Iterator<WeakReference<setDropDownBackgroundResource>> it = this.s.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<setDropDownBackgroundResource> next = it.next();
                setDropDownBackgroundResource setdropdownbackgroundresource = next.get();
                if (setdropdownbackgroundresource == null) {
                    this.s.remove(next);
                } else {
                    z |= setdropdownbackgroundresource.e();
                }
            }
            if (z) {
                this.d.clear();
                this.l.clear();
                int size = e.size();
                for (int i = 0; i < size; i++) {
                    setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = e.get(i);
                    if ((setexpandactivityoverflowbuttondrawable.b & 32) == 32) {
                        this.d.add(setexpandactivityoverflowbuttondrawable);
                    } else {
                        this.l.add(setexpandactivityoverflowbuttondrawable);
                    }
                }
            } else {
                this.d.clear();
                this.l.clear();
                this.l.addAll(e());
            }
            this.i = false;
        }
    }

    public final void a(Bundle bundle) {
        Parcelable i;
        if (!this.s.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<setDropDownBackgroundResource>> it = this.s.iterator();
            while (it.hasNext()) {
                WeakReference<setDropDownBackgroundResource> next = it.next();
                setDropDownBackgroundResource setdropdownbackgroundresource = next.get();
                if (setdropdownbackgroundresource == null) {
                    this.s.remove(next);
                } else {
                    int a = setdropdownbackgroundresource.a();
                    if (a > 0 && (i = setdropdownbackgroundresource.i()) != null) {
                        sparseArray.put(a, i);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    public final void a(setDropDownBackgroundResource setdropdownbackgroundresource) {
        Iterator<WeakReference<setDropDownBackgroundResource>> it = this.s.iterator();
        while (it.hasNext()) {
            WeakReference<setDropDownBackgroundResource> next = it.next();
            setDropDownBackgroundResource setdropdownbackgroundresource2 = next.get();
            if (setdropdownbackgroundresource2 == null || setdropdownbackgroundresource2 == setdropdownbackgroundresource) {
                this.s.remove(next);
            }
        }
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return b(0, 0, 0, this.x.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return b(i, i2, i3, this.x.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return b(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return b(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.e.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        int i5 = 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
            i5 = 0;
        }
        while (i5 < size) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
            i5++;
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.x.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.x.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = (setExpandActivityOverflowButtonDrawable) b(i, i2, i3, charSequence);
        setTextAppearance settextappearance = new setTextAppearance(this.e, this, setexpandactivityoverflowbuttondrawable);
        setexpandactivityoverflowbuttondrawable.l = settextappearance;
        settextappearance.setHeaderTitle(setexpandactivityoverflowbuttondrawable.getTitle());
        return settextappearance;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final Context b() {
        return this.e;
    }

    protected final MenuItem b(int i, int i2, int i3, CharSequence charSequence) {
        int c = c(i3);
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = new setExpandActivityOverflowButtonDrawable(this, i, i2, i3, c, charSequence, this.a);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.q;
        if (contextMenuInfo != null) {
            setexpandactivityoverflowbuttondrawable.e = contextMenuInfo;
        }
        ArrayList<setExpandActivityOverflowButtonDrawable> arrayList = this.m;
        arrayList.add(c(arrayList, c), setexpandactivityoverflowbuttondrawable);
        e(true);
        return setexpandactivityoverflowbuttondrawable;
    }

    public final setOnDismissListener b(int i) {
        c(i, null, 0, null, null);
        return this;
    }

    public final void b(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            sparseArray = sparseArray;
            if (actionView != null) {
                sparseArray = sparseArray;
                if (actionView.getId() != -1) {
                    SparseArray<? extends Parcelable> sparseArray2 = sparseArray;
                    if (sparseArray == null) {
                        sparseArray2 = new SparseArray<>();
                    }
                    actionView.saveHierarchyState(sparseArray2);
                    sparseArray = sparseArray2;
                    if (item.isActionViewExpanded()) {
                        bundle.putInt("android:menu:expandedactionview", item.getItemId());
                        sparseArray = sparseArray2;
                    }
                }
            }
            if (item.hasSubMenu()) {
                ((setTextAppearance) item.getSubMenu()).b(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(c(), sparseArray);
        }
    }

    public String c() {
        return "android:menu:actionviewstates";
    }

    public final setOnDismissListener c(Drawable drawable) {
        c(0, null, 0, drawable, null);
        return this;
    }

    public final void c(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(c());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((setTextAppearance) item.getSubMenu()).c(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public boolean c(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        boolean z;
        if (this.s.isEmpty()) {
            return false;
        }
        if (!this.p) {
            this.p = true;
            this.n = false;
            this.t = false;
        }
        Iterator<WeakReference<setDropDownBackgroundResource>> it = this.s.iterator();
        boolean z2 = false;
        while (true) {
            z = z2;
            if (!it.hasNext()) {
                break;
            }
            WeakReference<setDropDownBackgroundResource> next = it.next();
            setDropDownBackgroundResource setdropdownbackgroundresource = next.get();
            if (setdropdownbackgroundresource == null) {
                this.s.remove(next);
            } else {
                z = setdropdownbackgroundresource.a(setexpandactivityoverflowbuttondrawable);
                z2 = z;
                if (z) {
                    break;
                }
            }
        }
        this.p = false;
        if (this.n) {
            this.n = false;
            e(this.t);
        }
        if (z) {
            this.c = setexpandactivityoverflowbuttondrawable;
        }
        return z;
    }

    @Override // android.view.Menu
    public void clear() {
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = this.c;
        if (setexpandactivityoverflowbuttondrawable != null) {
            d(setexpandactivityoverflowbuttondrawable);
        }
        this.m.clear();
        e(true);
    }

    public void clearHeader() {
        this.j = null;
        this.g = null;
        this.h = null;
        e(false);
    }

    @Override // android.view.Menu
    public void close() {
        d(true);
    }

    public setOnDismissListener d() {
        return this;
    }

    public final setOnDismissListener d(View view) {
        c(0, null, 0, null, view);
        return this;
    }

    public final setOnDismissListener d(CharSequence charSequence) {
        c(0, charSequence, 0, null, null);
        return this;
    }

    public final void d(setDropDownBackgroundResource setdropdownbackgroundresource) {
        Context context = this.e;
        this.s.add(new WeakReference<>(setdropdownbackgroundresource));
        setdropdownbackgroundresource.e(context, this);
        this.i = true;
    }

    public final void d(boolean z) {
        if (!this.w) {
            this.w = true;
            Iterator<WeakReference<setDropDownBackgroundResource>> it = this.s.iterator();
            while (it.hasNext()) {
                WeakReference<setDropDownBackgroundResource> next = it.next();
                setDropDownBackgroundResource setdropdownbackgroundresource = next.get();
                if (setdropdownbackgroundresource == null) {
                    this.s.remove(next);
                } else {
                    setdropdownbackgroundresource.e(this, z);
                }
            }
            this.w = false;
        }
    }

    public final boolean d(MenuItem menuItem, setDropDownBackgroundResource setdropdownbackgroundresource, int i) {
        boolean z;
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = (setExpandActivityOverflowButtonDrawable) menuItem;
        if (setexpandactivityoverflowbuttondrawable == null || !setexpandactivityoverflowbuttondrawable.isEnabled()) {
            return false;
        }
        boolean e = setexpandactivityoverflowbuttondrawable.e();
        onCreateDialog oncreatedialog = setexpandactivityoverflowbuttondrawable.c;
        boolean z2 = oncreatedialog != null && oncreatedialog.d();
        if (setexpandactivityoverflowbuttondrawable.a()) {
            boolean expandActionView = e | setexpandactivityoverflowbuttondrawable.expandActionView();
            z = expandActionView;
            if (expandActionView) {
                d(true);
                z = expandActionView;
            }
        } else if (setexpandactivityoverflowbuttondrawable.hasSubMenu() || z2) {
            if ((i & 4) == 0) {
                d(false);
            }
            if (!setexpandactivityoverflowbuttondrawable.hasSubMenu()) {
                setTextAppearance settextappearance = new setTextAppearance(this.e, this, setexpandactivityoverflowbuttondrawable);
                setexpandactivityoverflowbuttondrawable.l = settextappearance;
                settextappearance.setHeaderTitle(setexpandactivityoverflowbuttondrawable.getTitle());
            }
            setTextAppearance settextappearance2 = (setTextAppearance) setexpandactivityoverflowbuttondrawable.getSubMenu();
            if (z2) {
                oncreatedialog.e(settextappearance2);
            }
            boolean b = e | b(settextappearance2, setdropdownbackgroundresource);
            z = b;
            if (!b) {
                d(true);
                z = b;
            }
        } else {
            z = e;
            if ((i & 1) == 0) {
                d(true);
                z = e;
            }
        }
        return z;
    }

    public boolean d(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        boolean z;
        boolean z2 = false;
        if (!this.s.isEmpty()) {
            if (this.c != setexpandactivityoverflowbuttondrawable) {
                z2 = false;
            } else {
                if (!this.p) {
                    this.p = true;
                    this.n = false;
                    this.t = false;
                }
                Iterator<WeakReference<setDropDownBackgroundResource>> it = this.s.iterator();
                boolean z3 = false;
                while (true) {
                    z = z3;
                    if (!it.hasNext()) {
                        break;
                    }
                    WeakReference<setDropDownBackgroundResource> next = it.next();
                    setDropDownBackgroundResource setdropdownbackgroundresource = next.get();
                    if (setdropdownbackgroundresource == null) {
                        this.s.remove(next);
                    } else {
                        z = setdropdownbackgroundresource.c(setexpandactivityoverflowbuttondrawable);
                        z3 = z;
                        if (z) {
                            break;
                        }
                    }
                }
                this.p = false;
                if (this.n) {
                    this.n = false;
                    e(this.t);
                }
                if (z) {
                    this.c = null;
                }
                z2 = z;
            }
        }
        return z2;
    }

    public final ArrayList<setExpandActivityOverflowButtonDrawable> e() {
        if (!this.f) {
            return this.D;
        }
        this.D.clear();
        int size = this.m.size();
        for (int i = 0; i < size; i++) {
            setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = this.m.get(i);
            if (setexpandactivityoverflowbuttondrawable.isVisible()) {
                this.D.add(setexpandactivityoverflowbuttondrawable);
            }
        }
        this.f = false;
        this.i = true;
        return this.D;
    }

    public void e(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.b = remoteActionCompatParcelizer;
    }

    public void e(boolean z) {
        if (!this.p) {
            if (z) {
                this.f = true;
                this.i = true;
            }
            if (!this.s.isEmpty()) {
                if (!this.p) {
                    this.p = true;
                    this.n = false;
                    this.t = false;
                }
                Iterator<WeakReference<setDropDownBackgroundResource>> it = this.s.iterator();
                while (it.hasNext()) {
                    WeakReference<setDropDownBackgroundResource> next = it.next();
                    setDropDownBackgroundResource setdropdownbackgroundresource = next.get();
                    if (setdropdownbackgroundresource == null) {
                        this.s.remove(next);
                    } else {
                        setdropdownbackgroundresource.c(z);
                    }
                }
                this.p = false;
                if (this.n) {
                    this.n = false;
                    e(this.t);
                    return;
                }
                return;
            }
            return;
        }
        this.n = true;
        if (z) {
            this.t = true;
        }
    }

    public boolean e(setOnDismissListener setondismisslistener, MenuItem menuItem) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.b;
        return remoteActionCompatParcelizer != null && remoteActionCompatParcelizer.b(setondismisslistener, menuItem);
    }

    public boolean f() {
        return this.u;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = this.m.get(i2);
            if (setexpandactivityoverflowbuttondrawable.getItemId() == i) {
                return setexpandactivityoverflowbuttondrawable;
            }
            if (setexpandactivityoverflowbuttondrawable.hasSubMenu() && (findItem = setexpandactivityoverflowbuttondrawable.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.m.get(i);
    }

    public boolean h() {
        return this.y;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f250o) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.m.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return a(i, keyEvent) != null;
    }

    public boolean j() {
        return this.v;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return d(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        setExpandActivityOverflowButtonDrawable a = a(i, keyEvent);
        boolean d = a != null ? d(a, null, i2) : false;
        if ((i2 & 2) != 0) {
            d(true);
        }
        return d;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.m.get(i2).getGroupId() == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.m.size();
            for (int i3 = 0; i3 < size2 - i2 && this.m.get(i2).getGroupId() == i; i3++) {
                d(i2, false);
            }
            e(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.m.get(i2).getItemId() == i) {
                break;
            } else {
                i2++;
            }
        }
        d(i2, true);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.m.size();
        for (int i2 = 0; i2 < size; i2++) {
            setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = this.m.get(i2);
            if (setexpandactivityoverflowbuttondrawable.getGroupId() == i) {
                setexpandactivityoverflowbuttondrawable.b = (setexpandactivityoverflowbuttondrawable.b & -5) | (z2 ? 4 : 0);
                setexpandactivityoverflowbuttondrawable.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.v = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.m.size();
        for (int i2 = 0; i2 < size; i2++) {
            setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = this.m.get(i2);
            if (setexpandactivityoverflowbuttondrawable.getGroupId() == i) {
                setexpandactivityoverflowbuttondrawable.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.m.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = this.m.get(i2);
            z2 = z2;
            if (setexpandactivityoverflowbuttondrawable.getGroupId() == i) {
                z2 = z2;
                if (setexpandactivityoverflowbuttondrawable.e(z)) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            e(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.y = z;
        e(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.m.size();
    }
}
