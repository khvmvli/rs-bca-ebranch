package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:o/performOptionsMenuClosed.class */
public final class performOptionsMenuClosed {
    private static final Class[] d = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver a;
    private final Map<String, Object<?>> b;
    final Map<String, Object> c;
    final Map<String, setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver> e;

    public performOptionsMenuClosed() {
        this.e = new HashMap();
        this.b = new HashMap();
        this.a = new setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.performOptionsMenuClosed.3
            @Override // o.setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver
            public final Bundle c() {
                for (Map.Entry entry : new HashMap(performOptionsMenuClosed.this.e).entrySet()) {
                    performOptionsMenuClosed.this.c((String) entry.getKey(), ((setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver) entry.getValue()).c());
                }
                Set<String> keySet = performOptionsMenuClosed.this.c.keySet();
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(performOptionsMenuClosed.this.c.get(str));
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("keys", arrayList);
                bundle.putParcelableArrayList("values", arrayList2);
                return bundle;
            }
        };
        this.c = new HashMap();
    }

    private performOptionsMenuClosed(Map<String, Object> map) {
        this.e = new HashMap();
        this.b = new HashMap();
        this.a = new setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.performOptionsMenuClosed.3
            @Override // o.setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver
            public final Bundle c() {
                for (Map.Entry entry : new HashMap(performOptionsMenuClosed.this.e).entrySet()) {
                    performOptionsMenuClosed.this.c((String) entry.getKey(), ((setOnFlingListener$MediaBrowserCompat$CustomActionResultReceiver) entry.getValue()).c());
                }
                Set<String> keySet = performOptionsMenuClosed.this.c.keySet();
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(performOptionsMenuClosed.this.c.get(str));
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("keys", arrayList);
                bundle.putParcelableArrayList("values", arrayList2);
                return bundle;
            }
        };
        this.c = new HashMap(map);
    }

    public static performOptionsMenuClosed b(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new performOptionsMenuClosed();
        }
        HashMap hashMap = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new performOptionsMenuClosed(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
        }
        return new performOptionsMenuClosed(hashMap);
    }

    public final <T> void c(String str, T t) {
        if (t != null) {
            for (Class cls : d) {
                if (!cls.isInstance(t)) {
                }
            }
            StringBuilder sb = new StringBuilder("Can't put value with type ");
            sb.append(t.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        performDestroyView performdestroyview = (performDestroyView) this.b.get(str);
        if (performdestroyview != null) {
            performdestroyview.a(t);
        } else {
            this.c.put(str, t);
        }
    }
}
