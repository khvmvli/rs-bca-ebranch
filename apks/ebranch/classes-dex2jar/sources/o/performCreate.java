package o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o.onRequestPermissionsResult;
import o.setSwitchPadding;
/* loaded from: classes-dex2jar.jar:o/performCreate.class */
public class performCreate extends onRequestPermissionsResult {
    private boolean a;
    private final boolean b;
    public onRequestPermissionsResult.read d;
    private int e;
    private final WeakReference<performContextItemSelected> g;
    private boolean h;
    private setShowText<performActivityCreated, performCreate$MediaBrowserCompat$CustomActionResultReceiver> i;
    private ArrayList<onRequestPermissionsResult.read> j;

    public performCreate(performContextItemSelected performcontextitemselected) {
        this(performcontextitemselected, true);
    }

    private performCreate(performContextItemSelected performcontextitemselected, boolean z) {
        this.i = new setShowText<>();
        this.e = 0;
        this.a = false;
        this.h = false;
        this.j = new ArrayList<>();
        this.g = new WeakReference<>(performcontextitemselected);
        this.d = onRequestPermissionsResult.read.INITIALIZED;
        this.b = true;
    }

    private onRequestPermissionsResult.read a(performActivityCreated performactivitycreated) {
        setShowText<performActivityCreated, performCreate$MediaBrowserCompat$CustomActionResultReceiver> setshowtext = this.i;
        onRequestPermissionsResult.read read = null;
        setSwitchPadding.write<performActivityCreated, performCreate$MediaBrowserCompat$CustomActionResultReceiver> write = setshowtext.d.containsKey(performactivitycreated) ? setshowtext.d.get(performactivitycreated).a : null;
        onRequestPermissionsResult.read read2 = write != null ? write.getValue().b : null;
        if (!this.j.isEmpty()) {
            ArrayList<onRequestPermissionsResult.read> arrayList = this.j;
            read = arrayList.get(arrayList.size() - 1);
        }
        onRequestPermissionsResult.read read3 = this.d;
        if (read2 == null || read2.compareTo(read3) >= 0) {
            read2 = read3;
        }
        if (read != null && read.compareTo(read2) < 0) {
            read2 = read;
        }
        return read2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x001a, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void a(o.performContextItemSelected r5) {
        /*
            r4 = this;
            r0 = r4
            o.setShowText<o.performActivityCreated, o.performCreate$MediaBrowserCompat$CustomActionResultReceiver> r0 = r0.i
            r6 = r0
            o.setSwitchPadding$read r0 = new o.setSwitchPadding$read
            r1 = r0
            r2 = r6
            r1.<init>()
            r7 = r0
            r0 = r6
            java.util.WeakHashMap<o.setSwitchPadding$MediaBrowserCompat$SearchResultReceiver<K, V>, java.lang.Boolean> r0 = r0.a
            r1 = r7
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.put(r1, r2)
        L_0x001a:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x00cb
            r0 = r4
            boolean r0 = r0.h
            if (r0 != 0) goto L_0x00cb
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r8 = r0
            r0 = r8
            java.lang.Object r0 = r0.getValue()
            o.performCreate$MediaBrowserCompat$CustomActionResultReceiver r0 = (o.performCreate$MediaBrowserCompat$CustomActionResultReceiver) r0
            r6 = r0
        L_0x0040:
            r0 = r6
            o.onRequestPermissionsResult$read r0 = r0.b
            r1 = r4
            o.onRequestPermissionsResult$read r1 = r1.d
            int r0 = r0.compareTo(r1)
            if (r0 >= 0) goto L_0x001a
            r0 = r4
            boolean r0 = r0.h
            if (r0 != 0) goto L_0x001a
            r0 = r4
            o.setShowText<o.performActivityCreated, o.performCreate$MediaBrowserCompat$CustomActionResultReceiver> r0 = r0.i
            r9 = r0
            r0 = r8
            java.lang.Object r0 = r0.getKey()
            r10 = r0
            r0 = r9
            java.util.HashMap<K, o.setSwitchPadding$write<K, V>> r0 = r0.d
            r1 = r10
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x001a
            r0 = r6
            o.onRequestPermissionsResult$read r0 = r0.b
            r10 = r0
            r0 = r4
            java.util.ArrayList<o.onRequestPermissionsResult$read> r0 = r0.j
            r1 = r10
            boolean r0 = r0.add(r1)
            r0 = r6
            o.onRequestPermissionsResult$read r0 = r0.b
            o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver r0 = o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.c(r0)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L_0x00ac
            r0 = r6
            r1 = r5
            r2 = r10
            r0.a(r1, r2)
            r0 = r4
            java.util.ArrayList<o.onRequestPermissionsResult$read> r0 = r0.j
            r10 = r0
            r0 = r10
            r1 = r10
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.remove(r1)
            goto L_0x0040
        L_0x00ac:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "no event up from "
            r1.<init>(r2)
            r5 = r0
            r0 = r5
            r1 = r6
            o.onRequestPermissionsResult$read r1 = r1.b
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r2 = r5
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.performCreate.a(o.performContextItemSelected):void");
    }

    private void b() {
        performContextItemSelected performcontextitemselected = this.g.get();
        if (performcontextitemselected != null) {
            while (!d()) {
                this.h = false;
                if (this.d.compareTo(this.i.b.getValue().b) < 0) {
                    c(performcontextitemselected);
                }
                setSwitchPadding.write<performActivityCreated, performCreate$MediaBrowserCompat$CustomActionResultReceiver> write = this.i.c;
                if (!this.h && write != null && this.d.compareTo(write.getValue().b) > 0) {
                    a(performcontextitemselected);
                }
            }
            this.h = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0021, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void c(o.performContextItemSelected r6) {
        /*
            r5 = this;
            r0 = r5
            o.setShowText<o.performActivityCreated, o.performCreate$MediaBrowserCompat$CustomActionResultReceiver> r0 = r0.i
            r7 = r0
            o.setSwitchPadding$IconCompatParcelizer r0 = new o.setSwitchPadding$IconCompatParcelizer
            r1 = r0
            r2 = r7
            o.setSwitchPadding$write<K, V> r2 = r2.c
            r3 = r7
            o.setSwitchPadding$write<K, V> r3 = r3.b
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r7
            java.util.WeakHashMap<o.setSwitchPadding$MediaBrowserCompat$SearchResultReceiver<K, V>, java.lang.Boolean> r0 = r0.a
            r1 = r8
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.put(r1, r2)
        L_0x0021:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x00d3
            r0 = r5
            boolean r0 = r0.h
            if (r0 != 0) goto L_0x00d3
            r0 = r8
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r9 = r0
            r0 = r9
            java.lang.Object r0 = r0.getValue()
            o.performCreate$MediaBrowserCompat$CustomActionResultReceiver r0 = (o.performCreate$MediaBrowserCompat$CustomActionResultReceiver) r0
            r7 = r0
        L_0x0047:
            r0 = r7
            o.onRequestPermissionsResult$read r0 = r0.b
            r1 = r5
            o.onRequestPermissionsResult$read r1 = r1.d
            int r0 = r0.compareTo(r1)
            if (r0 <= 0) goto L_0x0021
            r0 = r5
            boolean r0 = r0.h
            if (r0 != 0) goto L_0x0021
            r0 = r5
            o.setShowText<o.performActivityCreated, o.performCreate$MediaBrowserCompat$CustomActionResultReceiver> r0 = r0.i
            r10 = r0
            r0 = r9
            java.lang.Object r0 = r0.getKey()
            r11 = r0
            r0 = r10
            java.util.HashMap<K, o.setSwitchPadding$write<K, V>> r0 = r0.d
            r1 = r11
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0021
            r0 = r7
            o.onRequestPermissionsResult$read r0 = r0.b
            o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver r0 = o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.d(r0)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L_0x00b4
            r0 = r10
            o.onRequestPermissionsResult$read r0 = r0.e()
            r11 = r0
            r0 = r5
            java.util.ArrayList<o.onRequestPermissionsResult$read> r0 = r0.j
            r1 = r11
            boolean r0 = r0.add(r1)
            r0 = r7
            r1 = r6
            r2 = r10
            r0.a(r1, r2)
            r0 = r5
            java.util.ArrayList<o.onRequestPermissionsResult$read> r0 = r0.j
            r11 = r0
            r0 = r11
            r1 = r11
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.remove(r1)
            goto L_0x0047
        L_0x00b4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "no event down from "
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r7
            o.onRequestPermissionsResult$read r1 = r1.b
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.performCreate.c(o.performContextItemSelected):void");
    }

    public static onRequestPermissionsResult.read d(onRequestPermissionsResult.read read, onRequestPermissionsResult.read read2) {
        onRequestPermissionsResult.read read3 = read;
        if (read2 != null) {
            read3 = read;
            if (read2.compareTo(read) < 0) {
                read3 = read2;
            }
        }
        return read3;
    }

    private boolean d() {
        boolean z = true;
        if (this.i.e == 0) {
            return true;
        }
        onRequestPermissionsResult.read read = this.i.b.getValue().b;
        onRequestPermissionsResult.read read2 = this.i.c.getValue().b;
        if (!(read == read2 && this.d == read2)) {
            z = false;
        }
        return z;
    }

    @Override // o.onRequestPermissionsResult
    public final onRequestPermissionsResult.read a() {
        return this.d;
    }

    public void b(String str) {
        if (this.b && !setQueryHint.c().a.d()) {
            StringBuilder sb = new StringBuilder("Method ");
            sb.append(str);
            sb.append(" must be called on the main thread");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void b(onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
        b("handleLifecycleEvent");
        b(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver.e());
    }

    public void b(onRequestPermissionsResult.read read) {
        if (this.d != read) {
            this.d = read;
            if (this.a || this.e != 0) {
                this.h = true;
                return;
            }
            this.a = true;
            b();
            this.a = false;
        }
    }

    @Override // o.onRequestPermissionsResult
    public final void c(performActivityCreated performactivitycreated) {
        performContextItemSelected performcontextitemselected;
        b("addObserver");
        performCreate$MediaBrowserCompat$CustomActionResultReceiver performcreate_mediabrowsercompat_customactionresultreceiver = new performCreate$MediaBrowserCompat$CustomActionResultReceiver(performactivitycreated, this.d == onRequestPermissionsResult.read.DESTROYED ? onRequestPermissionsResult.read.DESTROYED : onRequestPermissionsResult.read.INITIALIZED);
        if (this.i.e(performactivitycreated, performcreate_mediabrowsercompat_customactionresultreceiver) == null && (performcontextitemselected = this.g.get()) != null) {
            boolean z = this.e != 0 || this.a;
            onRequestPermissionsResult.read a = a(performactivitycreated);
            this.e++;
            while (performcreate_mediabrowsercompat_customactionresultreceiver.b.compareTo(a) < 0 && this.i.d.containsKey(performactivitycreated)) {
                this.j.add(performcreate_mediabrowsercompat_customactionresultreceiver.b);
                onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver c = onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.c(performcreate_mediabrowsercompat_customactionresultreceiver.b);
                if (c != null) {
                    performcreate_mediabrowsercompat_customactionresultreceiver.a(performcontextitemselected, c);
                    ArrayList<onRequestPermissionsResult.read> arrayList = this.j;
                    arrayList.remove(arrayList.size() - 1);
                    a = a(performactivitycreated);
                } else {
                    StringBuilder sb = new StringBuilder("no event up from ");
                    sb.append(performcreate_mediabrowsercompat_customactionresultreceiver.b);
                    throw new IllegalStateException(sb.toString());
                }
            }
            if (!z) {
                b();
            }
            this.e--;
        }
    }

    @Override // o.onRequestPermissionsResult
    public final void e(performActivityCreated performactivitycreated) {
        b("removeObserver");
        this.i.a(performactivitycreated);
    }
}
