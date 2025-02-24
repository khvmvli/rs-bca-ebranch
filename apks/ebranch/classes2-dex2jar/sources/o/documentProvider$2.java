package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:o/documentProvider$2.class */
final class documentProvider$2 extends ThreadLocal<documentProvider$IconCompatParcelizer> {
    final /* synthetic */ documentProvider c;

    documentProvider$2(documentProvider documentprovider) {
        this.c = documentprovider;
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ documentProvider$IconCompatParcelizer initialValue() {
        return new Object() { // from class: o.documentProvider$IconCompatParcelizer
            boolean a;
            final List<Object> b = new ArrayList();
            Object c;
            boolean d;
            boolean e;
            store f;
        };
    }
}
