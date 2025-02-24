package o;
/* loaded from: classes-dex2jar.jar:o/Page6DTapresSFragment_ViewBinding.class */
public abstract class Page6DTapresSFragment_ViewBinding<T> implements Page6FLKTPFragment<T> {
    public static <T> Page6DTapresSFragment_ViewBinding<T> c(Page6ELFragment_ViewBinding<T> page6ELFragment_ViewBinding) {
        onChooseBahasa.b(page6ELFragment_ViewBinding, "source is null");
        Page6DTapresSFragment_ViewBinding<T> onfocuschangedatarekening = new onFocusChangeDataRekening<>(page6ELFragment_ViewBinding);
        Page6FLKTPFragment_ViewBinding page6FLKTPFragment_ViewBinding = ubahDataDiri.b;
        Page6DTapresSFragment_ViewBinding<T> page6DTapresSFragment_ViewBinding = onfocuschangedatarekening;
        if (page6FLKTPFragment_ViewBinding != null) {
            page6DTapresSFragment_ViewBinding = (Page6DTapresSFragment_ViewBinding) ubahDataDiri.c(page6FLKTPFragment_ViewBinding, onfocuschangedatarekening);
        }
        return page6DTapresSFragment_ViewBinding;
    }

    public static <T> Page6DTapresSFragment_ViewBinding<T> d(T t) {
        onChooseBahasa.b(t, "The item is null");
        Page6DTapresSFragment_ViewBinding<T> onclickdatarekening = new onClickDataRekening<>(t);
        Page6FLKTPFragment_ViewBinding page6FLKTPFragment_ViewBinding = ubahDataDiri.b;
        Page6DTapresSFragment_ViewBinding<T> page6DTapresSFragment_ViewBinding = onclickdatarekening;
        if (page6FLKTPFragment_ViewBinding != null) {
            page6DTapresSFragment_ViewBinding = (Page6DTapresSFragment_ViewBinding) ubahDataDiri.c(page6FLKTPFragment_ViewBinding, onclickdatarekening);
        }
        return page6DTapresSFragment_ViewBinding;
    }

    public final Page6DTapresSFragment_ViewBinding<T> c(ivfotoDiri ivfotodiri) {
        onChooseBahasa.b(ivfotodiri, "scheduler is null");
        Page6DTapresSFragment_ViewBinding<T> page6FSFragment_ViewBinding = new Page6FSFragment_ViewBinding<>(this, ivfotodiri);
        Page6FLKTPFragment_ViewBinding page6FLKTPFragment_ViewBinding = ubahDataDiri.b;
        Page6DTapresSFragment_ViewBinding<T> page6DTapresSFragment_ViewBinding = page6FSFragment_ViewBinding;
        if (page6FLKTPFragment_ViewBinding != null) {
            page6DTapresSFragment_ViewBinding = (Page6DTapresSFragment_ViewBinding) ubahDataDiri.c(page6FLKTPFragment_ViewBinding, page6FSFragment_ViewBinding);
        }
        return page6DTapresSFragment_ViewBinding;
    }

    public final Page6DTapresSFragment_ViewBinding<T> e(ivfotoDiri ivfotodiri) {
        onChooseBahasa.b(ivfotodiri, "scheduler is null");
        Page6DTapresSFragment_ViewBinding<T> onbuttonclicked = new onButtonClicked<>(this, ivfotodiri);
        Page6FLKTPFragment_ViewBinding page6FLKTPFragment_ViewBinding = ubahDataDiri.b;
        Page6DTapresSFragment_ViewBinding<T> page6DTapresSFragment_ViewBinding = onbuttonclicked;
        if (page6FLKTPFragment_ViewBinding != null) {
            page6DTapresSFragment_ViewBinding = (Page6DTapresSFragment_ViewBinding) ubahDataDiri.c(page6FLKTPFragment_ViewBinding, onbuttonclicked);
        }
        return page6DTapresSFragment_ViewBinding;
    }
}
