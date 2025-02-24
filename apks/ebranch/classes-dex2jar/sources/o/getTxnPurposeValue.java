package o;

import java.util.ArrayList;
import java.util.List;
import o.onFindViewById;
/* loaded from: classes-dex2jar.jar:o/getTxnPurposeValue.class */
public final class getTxnPurposeValue {
    private static final IconCompatParcelizer<Object> e = new IconCompatParcelizer<Object>() { // from class: o.getTxnPurposeValue.4
        @Override // o.getTxnPurposeValue.IconCompatParcelizer
        public final void a(Object obj) {
        }
    };

    /* loaded from: classes-dex2jar.jar:o/getTxnPurposeValue$IconCompatParcelizer.class */
    public interface IconCompatParcelizer<T> {
        void a(T t);
    }

    /* loaded from: classes-dex2jar.jar:o/getTxnPurposeValue$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        setBankStatesName j_();
    }

    /* loaded from: classes-dex2jar.jar:o/getTxnPurposeValue$read.class */
    public interface read<T> {
        T b();
    }

    public static <T extends RemoteActionCompatParcelizer> onFindViewById.write<T> a(int i, read<T> read2) {
        return new getTxnPurposeValue$MediaBrowserCompat$CustomActionResultReceiver(new onFindViewById.read(i), read2, e);
    }

    public static <T> onFindViewById.write<List<T>> c() {
        return new getTxnPurposeValue$MediaBrowserCompat$CustomActionResultReceiver(new onFindViewById.read(20), new read<List<T>>() { // from class: o.getTxnPurposeValue.5
            @Override // o.getTxnPurposeValue.read
            public final /* synthetic */ Object b() {
                return new ArrayList();
            }
        }, new IconCompatParcelizer<List<T>>() { // from class: o.getTxnPurposeValue.1
            @Override // o.getTxnPurposeValue.IconCompatParcelizer
            public final /* synthetic */ void a(Object obj) {
                ((List) obj).clear();
            }
        });
    }
}
