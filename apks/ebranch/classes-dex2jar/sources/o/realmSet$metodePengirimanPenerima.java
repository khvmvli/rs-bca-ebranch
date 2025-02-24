package o;

import java.lang.annotation.Annotation;
/* loaded from: classes-dex2jar.jar:o/realmSet$metodePengirimanPenerima.class */
public final class realmSet$metodePengirimanPenerima {
    private int d;
    private final EnumC0028realmSet$statusPendudukPenerima e = EnumC0028realmSet$statusPendudukPenerima.DEFAULT;

    public final realmSet$tipeNasabahPenerimaId c() {
        return new realmSet$tipeNasabahPenerimaId(this.d, this.e) { // from class: o.realmSet$biayaTransfer
            private final int b;
            private final EnumC0028realmSet$statusPendudukPenerima d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = r4;
                this.d = r5;
            }

            @Override // java.lang.annotation.Annotation
            public final Class<? extends Annotation> annotationType() {
                return realmSet$tipeNasabahPenerimaId.class;
            }

            @Override // o.realmSet$tipeNasabahPenerimaId
            public final EnumC0028realmSet$statusPendudukPenerima c() {
                return this.d;
            }

            @Override // o.realmSet$tipeNasabahPenerimaId
            public final int e() {
                return this.b;
            }

            @Override // java.lang.annotation.Annotation, java.lang.Object
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof realmSet$tipeNasabahPenerimaId)) {
                    return false;
                }
                realmSet$tipeNasabahPenerimaId realmset_tipenasabahpenerimaid = (realmSet$tipeNasabahPenerimaId) obj;
                return this.b == realmset_tipenasabahpenerimaid.e() && this.d.equals(realmset_tipenasabahpenerimaid.c());
            }

            @Override // java.lang.annotation.Annotation, java.lang.Object
            public final int hashCode() {
                return (this.b ^ 14552422) + (this.d.hashCode() ^ 2041407134);
            }

            @Override // java.lang.annotation.Annotation, java.lang.Object
            public final String toString() {
                return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + this.d + ')';
            }
        };
    }

    public final realmSet$metodePengirimanPenerima e(int i) {
        this.d = i;
        return this;
    }
}
