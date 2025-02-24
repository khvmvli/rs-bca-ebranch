package o;

import androidx.lifecycle.LiveData;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/performDetach.class */
public final class performDetach<T> extends performDestroyView<T> {
    setSwitchPadding<LiveData<?>, read<?>> g = new setSwitchPadding<>();

    /* loaded from: classes-dex2jar.jar:o/performDetach$read.class */
    public static final class read<V> implements performLowMemory<V> {
        final LiveData<V> b;
        int d = -1;
        final performLowMemory<? super V> e;

        read(LiveData<V> liveData, performLowMemory<? super V> performlowmemory) {
            this.b = liveData;
            this.e = performlowmemory;
        }

        @Override // o.performLowMemory
        public final void e(V v) {
            if (this.d != this.b.h) {
                this.d = this.b.h;
                this.e.e(v);
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void c() {
        Iterator<Map.Entry<LiveData<?>, read<?>>> it = this.g.iterator();
        while (it.hasNext()) {
            read<?> value = it.next().getValue();
            value.b.d((performLowMemory<? super Object>) value);
        }
    }

    public final <S> void d(LiveData<S> liveData, performLowMemory<? super S> performlowmemory) {
        read<?> read2 = new read<>(liveData, performlowmemory);
        read<?> e = this.g.e(liveData, read2);
        if (e != null && e.e != performlowmemory) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        } else if (e == null) {
            if (this.a > 0) {
                read2.b.b(read2);
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void e() {
        Iterator<Map.Entry<LiveData<?>, read<?>>> it = this.g.iterator();
        while (it.hasNext()) {
            read<?> value = it.next().getValue();
            value.b.b(value);
        }
    }
}
