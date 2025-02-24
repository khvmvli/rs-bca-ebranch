package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import o.setDropDownBackgroundResource;
import o.setInputType;
import o.setOnDismissListener;
/* loaded from: classes-dex2jar.jar:o/setSplitBackground.class */
final class setSplitBackground extends setBackgroundResource {
    private boolean a;
    private boolean b;
    setSelector c;
    boolean d;
    Window.Callback e;
    private final setInputType.IconCompatParcelizer j;
    private ArrayList<Object> h = new ArrayList<>();
    private final Runnable g = new Runnable() { // from class: o.setSplitBackground.4
        @Override // java.lang.Runnable
        public final void run() {
            setSplitBackground setsplitbackground = setSplitBackground.this;
            Menu i = setsplitbackground.i();
            setOnDismissListener setondismisslistener = i instanceof setOnDismissListener ? (setOnDismissListener) i : null;
            if (setondismisslistener != null && !setondismisslistener.p) {
                setondismisslistener.p = true;
                setondismisslistener.n = false;
                setondismisslistener.t = false;
            }
            try {
                i.clear();
                if (!setsplitbackground.e.onCreatePanelMenu(0, i) || !setsplitbackground.e.onPreparePanel(0, null, i)) {
                    i.clear();
                }
                if (setondismisslistener != null) {
                    setondismisslistener.p = false;
                    if (setondismisslistener.n) {
                        setondismisslistener.n = false;
                        setondismisslistener.e(setondismisslistener.t);
                    }
                }
            } catch (Throwable th) {
                if (setondismisslistener != null) {
                    setondismisslistener.p = false;
                    if (setondismisslistener.n) {
                        setondismisslistener.n = false;
                        setondismisslistener.e(setondismisslistener.t);
                    }
                }
                throw th;
            }
        }
    };

    /* loaded from: classes-dex2jar.jar:o/setSplitBackground$IconCompatParcelizer.class */
    final class IconCompatParcelizer extends setWindowTitle {
        public IconCompatParcelizer(Window.Callback callback) {
            super(callback);
        }

        @Override // o.setWindowTitle, android.view.Window.Callback
        public final View onCreatePanelView(int i) {
            return i == 0 ? new View(setSplitBackground.this.c.c()) : onCreatePanelView(i);
        }

        @Override // o.setWindowTitle, android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = onPreparePanel(i, view, menu);
            if (onPreparePanel && !setSplitBackground.this.d) {
                setSplitBackground.this.c.o();
                setSplitBackground.this.d = true;
            }
            return onPreparePanel;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setSplitBackground$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer implements setDropDownBackgroundResource.IconCompatParcelizer {
        private boolean d;

        RemoteActionCompatParcelizer() {
        }

        @Override // o.setDropDownBackgroundResource.IconCompatParcelizer
        public final void a(setOnDismissListener setondismisslistener, boolean z) {
            if (!this.d) {
                this.d = true;
                setSplitBackground.this.c.d();
                if (setSplitBackground.this.e != null) {
                    setSplitBackground.this.e.onPanelClosed(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cy, setondismisslistener);
                }
                this.d = false;
            }
        }

        @Override // o.setDropDownBackgroundResource.IconCompatParcelizer
        public final boolean a(setOnDismissListener setondismisslistener) {
            if (setSplitBackground.this.e == null) {
                return false;
            }
            setSplitBackground.this.e.onMenuOpened(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cy, setondismisslistener);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setSplitBackground$write.class */
    public final class write implements setOnDismissListener.RemoteActionCompatParcelizer {
        write() {
        }

        @Override // o.setOnDismissListener.RemoteActionCompatParcelizer
        public final boolean b(setOnDismissListener setondismisslistener, MenuItem menuItem) {
            return false;
        }

        @Override // o.setOnDismissListener.RemoteActionCompatParcelizer
        public final void e(setOnDismissListener setondismisslistener) {
            if (setSplitBackground.this.e == null) {
                return;
            }
            if (setSplitBackground.this.c.l()) {
                setSplitBackground.this.e.onPanelClosed(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cy, setondismisslistener);
            } else if (setSplitBackground.this.e.onPreparePanel(0, null, setondismisslistener)) {
                setSplitBackground.this.e.onMenuOpened(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cy, setondismisslistener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSplitBackground(setInputType setinputtype, CharSequence charSequence, Window.Callback callback) {
        AnonymousClass3 r0 = new setInputType.IconCompatParcelizer() { // from class: o.setSplitBackground.3
            @Override // o.setInputType.IconCompatParcelizer
            public final boolean b(MenuItem menuItem) {
                return setSplitBackground.this.e.onMenuItemSelected(0, menuItem);
            }
        };
        this.j = r0;
        this.c = new setQuery(setinputtype, false);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(callback);
        this.e = iconCompatParcelizer;
        this.c.b(iconCompatParcelizer);
        setinputtype.setOnMenuItemClickListener(r0);
        this.c.d(charSequence);
    }

    @Override // o.setBackgroundResource
    public final Context a() {
        return this.c.c();
    }

    @Override // o.setBackgroundResource
    public final void a(Drawable drawable) {
        this.c.a(drawable);
    }

    @Override // o.setBackgroundResource
    public final void a(CharSequence charSequence) {
        this.c.d(charSequence);
    }

    @Override // o.setBackgroundResource
    public final void a(boolean z) {
        if (z != this.b) {
            this.b = z;
            int size = this.h.size();
            for (int i = 0; i < size; i++) {
                this.h.get(i);
            }
        }
    }

    @Override // o.setBackgroundResource
    public final boolean a(int i, KeyEvent keyEvent) {
        Menu i2 = i();
        if (i2 == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        i2.setQwertyMode(z);
        return i2.performShortcut(i, keyEvent, 0);
    }

    @Override // o.setBackgroundResource
    public final void b(Configuration configuration) {
        b(configuration);
    }

    @Override // o.setBackgroundResource
    public final void b(boolean z) {
    }

    @Override // o.setBackgroundResource
    public final boolean b() {
        if (!this.c.h()) {
            return false;
        }
        this.c.a();
        return true;
    }

    @Override // o.setBackgroundResource
    public final boolean b(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1) {
            return true;
        }
        this.c.r();
        return true;
    }

    @Override // o.setBackgroundResource
    public final void c(int i) {
        this.c.b(i);
    }

    @Override // o.setBackgroundResource
    public final boolean c() {
        this.c.f().removeCallbacks(this.g);
        findFragmentByWho.c(this.c.f(), this.g);
        return true;
    }

    @Override // o.setBackgroundResource
    public final void d(CharSequence charSequence) {
        this.c.a(charSequence);
    }

    @Override // o.setBackgroundResource
    public final void d(boolean z) {
        this.c.e(((z ? 4 : 0) & 4) | (this.c.b() & -5));
    }

    @Override // o.setBackgroundResource
    public final boolean d() {
        return this.c.g();
    }

    @Override // o.setBackgroundResource
    public final int e() {
        return this.c.b();
    }

    @Override // o.setBackgroundResource
    public final void e(boolean z) {
    }

    @Override // o.setBackgroundResource
    public final boolean g() {
        return this.c.r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setBackgroundResource
    public final void h() {
        this.c.f().removeCallbacks(this.g);
    }

    Menu i() {
        if (!this.a) {
            this.c.b(new RemoteActionCompatParcelizer(), new write());
            this.a = true;
        }
        return this.c.i();
    }
}
