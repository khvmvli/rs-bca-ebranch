package o;

import io.realm.internal.Property;
/* loaded from: classes-dex2jar.jar:o/Page6DTahapanXpresiSFragment_ViewBinding.class */
public abstract class Page6DTahapanXpresiSFragment_ViewBinding<T> {
    static final int a = Math.max(16, Integer.getInteger("rx2.buffer-size", (int) Property.TYPE_ARRAY).intValue());

    public static <T> Page6DTahapanXpresiSFragment_ViewBinding<T> a(T t) {
        onChooseBahasa.b(t, "item is null");
        Page6DTahapanXpresiSFragment_ViewBinding<T> page6FLPasporFragment_ViewBinding = new Page6FLPasporFragment_ViewBinding<>(t);
        Page6FLKTPFragment_ViewBinding page6FLKTPFragment_ViewBinding = ubahDataDiri.a;
        Page6DTahapanXpresiSFragment_ViewBinding<T> page6DTahapanXpresiSFragment_ViewBinding = page6FLPasporFragment_ViewBinding;
        if (page6FLKTPFragment_ViewBinding != null) {
            page6DTahapanXpresiSFragment_ViewBinding = (Page6DTahapanXpresiSFragment_ViewBinding) ubahDataDiri.c(page6FLKTPFragment_ViewBinding, page6FLPasporFragment_ViewBinding);
        }
        return page6DTahapanXpresiSFragment_ViewBinding;
    }

    public static <T> Page6DTahapanXpresiSFragment_ViewBinding<T> c(showPelajarPage<T> showpelajarpage, Page6DTapresFragment page6DTapresFragment) {
        onChooseBahasa.b(showpelajarpage, "source is null");
        onChooseBahasa.b(page6DTapresFragment, "mode is null");
        Page6DTahapanXpresiSFragment_ViewBinding<T> onclicknegarapaspor = new onClickNegaraPaspor<>(showpelajarpage, page6DTapresFragment);
        Page6FLKTPFragment_ViewBinding page6FLKTPFragment_ViewBinding = ubahDataDiri.a;
        Page6DTahapanXpresiSFragment_ViewBinding<T> page6DTahapanXpresiSFragment_ViewBinding = onclicknegarapaspor;
        if (page6FLKTPFragment_ViewBinding != null) {
            page6DTahapanXpresiSFragment_ViewBinding = (Page6DTahapanXpresiSFragment_ViewBinding) ubahDataDiri.c(page6FLKTPFragment_ViewBinding, onclicknegarapaspor);
        }
        return page6DTahapanXpresiSFragment_ViewBinding;
    }

    public final Page6DTahapanXpresiSFragment_ViewBinding<T> a(ivfotoDiri ivfotodiri) {
        onChooseBahasa.b(ivfotodiri, "scheduler is null");
        Page6DTahapanXpresiSFragment_ViewBinding<T> onchoosevaluejeniskartuevent = new onChooseValueJenisKartuEvent<>(this, ivfotodiri);
        Page6FLKTPFragment_ViewBinding page6FLKTPFragment_ViewBinding = ubahDataDiri.a;
        Page6DTahapanXpresiSFragment_ViewBinding<T> page6DTahapanXpresiSFragment_ViewBinding = onchoosevaluejeniskartuevent;
        if (page6FLKTPFragment_ViewBinding != null) {
            page6DTahapanXpresiSFragment_ViewBinding = (Page6DTahapanXpresiSFragment_ViewBinding) ubahDataDiri.c(page6FLKTPFragment_ViewBinding, onchoosevaluejeniskartuevent);
        }
        return page6DTahapanXpresiSFragment_ViewBinding;
    }

    public final Page6DTahapanXpresiSFragment_ViewBinding<T> d(ivfotoDiri ivfotodiri) {
        onChooseBahasa.b(ivfotodiri, "scheduler is null");
        Page6DTahapanXpresiSFragment_ViewBinding<T> showdatarekening = new showDataRekening<>(this, ivfotodiri, this instanceof onClickNegaraPaspor);
        Page6FLKTPFragment_ViewBinding page6FLKTPFragment_ViewBinding = ubahDataDiri.a;
        Page6DTahapanXpresiSFragment_ViewBinding<T> page6DTahapanXpresiSFragment_ViewBinding = showdatarekening;
        if (page6FLKTPFragment_ViewBinding != null) {
            page6DTahapanXpresiSFragment_ViewBinding = (Page6DTahapanXpresiSFragment_ViewBinding) ubahDataDiri.c(page6FLKTPFragment_ViewBinding, showdatarekening);
        }
        return page6DTahapanXpresiSFragment_ViewBinding;
    }
}
