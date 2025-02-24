package o;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResultRegistry$1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import o.ComponentActivity$3;
import o.ComponentActivity$4;
import o.ComponentActivity$5;
import o.PlaybackStateCompat;
import o.onRequestPermissionsResult;
import o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver;
import o.performContextItemSelected;
/* loaded from: classes-dex2jar.jar:o/ComponentActivity$5.class */
public abstract class ComponentActivity$5 {
    public Random f = new Random();
    public final Map<Integer, String> h = new HashMap();
    public final Map<String, Integer> e = new HashMap();
    private final Map<String, ComponentActivity$5$MediaBrowserCompat$CustomActionResultReceiver> b = new HashMap();
    public ArrayList<String> a = new ArrayList<>();
    public final transient Map<String, read<?>> c = new HashMap();
    public final Map<String, Object> d = new HashMap();
    public final Bundle g = new Bundle();

    /* loaded from: classes-dex2jar.jar:o/ComponentActivity$5$read.class */
    public static final class read<O> {
        public final PlaybackStateCompat.CustomAction<O> c;
        final ComponentActivity$4<?, O> d;

        public read(PlaybackStateCompat.CustomAction<O> customAction, ComponentActivity$4<?, O> componentActivity$4) {
            this.c = customAction;
            this.d = componentActivity$4;
        }
    }

    private <O> void a(String str, int i, Intent intent, read<O> read2) {
        if (read2 == null || read2.c == null) {
            this.d.remove(str);
            this.g.putParcelable(str, new ComponentActivity$3(i, intent));
            return;
        }
        read2.c.a(read2.d.e(i, intent));
    }

    private int c(String str) {
        Integer num = this.e.get(str);
        if (num != null) {
            return num.intValue();
        }
        int nextInt = this.f.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (this.h.containsKey(Integer.valueOf(i))) {
                nextInt = this.f.nextInt(2147418112);
            } else {
                this.h.put(Integer.valueOf(i), str);
                this.e.put(str, Integer.valueOf(i));
                return i;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> ActivityResultRegistry$1<I> b(final String str, final ComponentActivity$4<I, O> componentActivity$4, PlaybackStateCompat.CustomAction<O> customAction) {
        final int c = c(str);
        this.c.put(str, new read<>(customAction, componentActivity$4));
        if (this.d.containsKey(str)) {
            Object obj = this.d.get(str);
            this.d.remove(str);
            customAction.a(obj);
        }
        ComponentActivity$3 componentActivity$3 = (ComponentActivity$3) this.g.getParcelable(str);
        if (componentActivity$3 != null) {
            this.g.remove(str);
            customAction.a(componentActivity$4.e(componentActivity$3.b, componentActivity$3.c));
        }
        return new ActivityResultRegistry$1<I>() { // from class: o.ComponentActivity$5.1
            @Override // o.ActivityResultRegistry$1
            public final void d() {
                ComponentActivity$5.this.e(str);
            }

            @Override // o.ActivityResultRegistry$1
            public final void e(I i, setFitsSystemWindows setfitssystemwindows) {
                ComponentActivity$5.this.a.add(str);
                Integer num = ComponentActivity$5.this.e.get(str);
                ComponentActivity$5.this.b(num != null ? num.intValue() : c, componentActivity$4, i, setfitssystemwindows);
            }
        };
    }

    public abstract <I, O> void b(int i, ComponentActivity$4<I, O> componentActivity$4, I i2, setFitsSystemWindows setfitssystemwindows);

    public final <I, O> ActivityResultRegistry$1<I> c(final String str, performContextItemSelected performcontextitemselected, final ComponentActivity$4<I, O> componentActivity$4, PlaybackStateCompat.CustomAction<O> customAction) {
        onRequestPermissionsResult lifecycle = performcontextitemselected.getLifecycle();
        if (!(lifecycle.a().compareTo(onRequestPermissionsResult.read.STARTED) >= 0)) {
            final int c = c(str);
            ComponentActivity$5$MediaBrowserCompat$CustomActionResultReceiver componentActivity$5$MediaBrowserCompat$CustomActionResultReceiver = this.b.get(str);
            ComponentActivity$5$MediaBrowserCompat$CustomActionResultReceiver componentActivity$5$MediaBrowserCompat$CustomActionResultReceiver2 = componentActivity$5$MediaBrowserCompat$CustomActionResultReceiver;
            if (componentActivity$5$MediaBrowserCompat$CustomActionResultReceiver == null) {
                componentActivity$5$MediaBrowserCompat$CustomActionResultReceiver2 = new ComponentActivity$5$MediaBrowserCompat$CustomActionResultReceiver(lifecycle);
            }
            ActivityResultRegistry$1 activityResultRegistry$1 = new onResume(str, customAction, componentActivity$4) { // from class: androidx.activity.result.ActivityResultRegistry$1
                final /* synthetic */ String a;
                final /* synthetic */ PlaybackStateCompat.CustomAction b;
                final /* synthetic */ ComponentActivity$4 e;

                {
                    this.a = r5;
                    this.b = r6;
                    this.e = r7;
                }

                @Override // o.onResume
                public final void b(performContextItemSelected performcontextitemselected2, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
                    if (onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_START.equals(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver)) {
                        ComponentActivity$5.this.c.put(this.a, new ComponentActivity$5.read<>(this.b, this.e));
                        if (ComponentActivity$5.this.d.containsKey(this.a)) {
                            Object obj = ComponentActivity$5.this.d.get(this.a);
                            ComponentActivity$5.this.d.remove(this.a);
                            this.b.a(obj);
                        }
                        ComponentActivity$3 componentActivity$3 = (ComponentActivity$3) ComponentActivity$5.this.g.getParcelable(this.a);
                        if (componentActivity$3 != null) {
                            ComponentActivity$5.this.g.remove(this.a);
                            this.b.a(this.e.e(componentActivity$3.b, componentActivity$3.c));
                        }
                    } else if (onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_STOP.equals(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver)) {
                        ComponentActivity$5.this.c.remove(this.a);
                    } else if (onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_DESTROY.equals(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver)) {
                        ComponentActivity$5.this.e(this.a);
                    }
                }
            };
            componentActivity$5$MediaBrowserCompat$CustomActionResultReceiver2.c.c(activityResultRegistry$1);
            componentActivity$5$MediaBrowserCompat$CustomActionResultReceiver2.e.add(activityResultRegistry$1);
            this.b.put(str, componentActivity$5$MediaBrowserCompat$CustomActionResultReceiver2);
            return new ActivityResultRegistry$1<I>() { // from class: o.ComponentActivity$5.5
                @Override // o.ActivityResultRegistry$1
                public final void d() {
                    ComponentActivity$5.this.e(str);
                }

                @Override // o.ActivityResultRegistry$1
                public final void e(I i, setFitsSystemWindows setfitssystemwindows) {
                    ComponentActivity$5.this.a.add(str);
                    Integer num = ComponentActivity$5.this.e.get(str);
                    ComponentActivity$5.this.b(num != null ? num.intValue() : c, componentActivity$4, i, setfitssystemwindows);
                }
            };
        }
        StringBuilder sb = new StringBuilder("LifecycleOwner ");
        sb.append(performcontextitemselected);
        sb.append(" is attempting to register while current state is ");
        sb.append(lifecycle.a());
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString());
    }

    public final boolean c(int i, int i2, Intent intent) {
        String str = this.h.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.a.remove(str);
        a(str, i2, intent, this.c.get(str));
        return true;
    }

    public final void e(String str) {
        Integer remove;
        if (!this.a.contains(str) && (remove = this.e.remove(str)) != null) {
            this.h.remove(remove);
        }
        this.c.remove(str);
        if (this.d.containsKey(str)) {
            StringBuilder sb = new StringBuilder("Dropping pending result for request ");
            sb.append(str);
            sb.append(": ");
            sb.append(this.d.get(str));
            Log.w("ActivityResultRegistry", sb.toString());
            this.d.remove(str);
        }
        if (this.g.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(this.g.getParcelable(str));
            Log.w("ActivityResultRegistry", sb2.toString());
            this.g.remove(str);
        }
        ComponentActivity$5$MediaBrowserCompat$CustomActionResultReceiver componentActivity$5$MediaBrowserCompat$CustomActionResultReceiver = this.b.get(str);
        if (componentActivity$5$MediaBrowserCompat$CustomActionResultReceiver != null) {
            componentActivity$5$MediaBrowserCompat$CustomActionResultReceiver.b();
            this.b.remove(str);
        }
    }
}
