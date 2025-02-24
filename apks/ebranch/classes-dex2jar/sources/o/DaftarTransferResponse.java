package o;

import java.security.MessageDigest;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/DaftarTransferResponse.class */
public abstract class DaftarTransferResponse {
    public static final DaftarTransferResponse a = new DaftarTransferResponse() { // from class: o.DaftarTransferResponse.2
        @Override // o.DaftarTransferResponse
        public final boolean c() {
            return true;
        }

        @Override // o.DaftarTransferResponse
        public final boolean d() {
            return true;
        }

        @Override // o.DaftarTransferResponse
        public final boolean d(boolean z, setNextCategoryCd setnextcategorycd, setCategoryIn setcategoryin) {
            return (setnextcategorycd == setNextCategoryCd.RESOURCE_DISK_CACHE || setnextcategorycd == setNextCategoryCd.MEMORY_CACHE) ? false : true;
        }

        @Override // o.DaftarTransferResponse
        public final boolean e(setNextCategoryCd setnextcategorycd) {
            return setnextcategorycd == setNextCategoryCd.REMOTE;
        }
    };
    public static final DaftarTransferResponse d = new DaftarTransferResponse() { // from class: o.DaftarTransferResponse.4
        @Override // o.DaftarTransferResponse
        public final boolean c() {
            return false;
        }

        @Override // o.DaftarTransferResponse
        public final boolean d() {
            return false;
        }

        @Override // o.DaftarTransferResponse
        public final boolean d(boolean z, setNextCategoryCd setnextcategorycd, setCategoryIn setcategoryin) {
            return false;
        }

        @Override // o.DaftarTransferResponse
        public final boolean e(setNextCategoryCd setnextcategorycd) {
            return false;
        }
    };
    public static final DaftarTransferResponse c = new DaftarTransferResponse() { // from class: o.DaftarTransferResponse.5
        @Override // o.DaftarTransferResponse
        public final boolean c() {
            return true;
        }

        @Override // o.DaftarTransferResponse
        public final boolean d() {
            return false;
        }

        @Override // o.DaftarTransferResponse
        public final boolean d(boolean z, setNextCategoryCd setnextcategorycd, setCategoryIn setcategoryin) {
            return false;
        }

        @Override // o.DaftarTransferResponse
        public final boolean e(setNextCategoryCd setnextcategorycd) {
            return (setnextcategorycd == setNextCategoryCd.DATA_DISK_CACHE || setnextcategorycd == setNextCategoryCd.MEMORY_CACHE) ? false : true;
        }
    };
    public static final DaftarTransferResponse b = new DaftarTransferResponse() { // from class: o.DaftarTransferResponse.1
        @Override // o.DaftarTransferResponse
        public final boolean c() {
            return false;
        }

        @Override // o.DaftarTransferResponse
        public final boolean d() {
            return true;
        }

        @Override // o.DaftarTransferResponse
        public final boolean d(boolean z, setNextCategoryCd setnextcategorycd, setCategoryIn setcategoryin) {
            return (setnextcategorycd == setNextCategoryCd.RESOURCE_DISK_CACHE || setnextcategorycd == setNextCategoryCd.MEMORY_CACHE) ? false : true;
        }

        @Override // o.DaftarTransferResponse
        public final boolean e(setNextCategoryCd setnextcategorycd) {
            return false;
        }
    };
    public static final DaftarTransferResponse e = new DaftarTransferResponse() { // from class: o.DaftarTransferResponse.3
        @Override // o.DaftarTransferResponse
        public final boolean c() {
            return true;
        }

        @Override // o.DaftarTransferResponse
        public final boolean d() {
            return true;
        }

        @Override // o.DaftarTransferResponse
        public final boolean d(boolean z, setNextCategoryCd setnextcategorycd, setCategoryIn setcategoryin) {
            return ((z && setnextcategorycd == setNextCategoryCd.DATA_DISK_CACHE) || setnextcategorycd == setNextCategoryCd.LOCAL) && setcategoryin == setCategoryIn.TRANSFORMED;
        }

        @Override // o.DaftarTransferResponse
        public final boolean e(setNextCategoryCd setnextcategorycd) {
            return setnextcategorycd == setNextCategoryCd.REMOTE;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/DaftarTransferResponse$DaftarTransferOutput.class */
    public final class DaftarTransferOutput implements setCode {
        private final int a;
        private final Object b;
        private int c;
        private final CategoryResponse d;
        private final Map<Class<?>, getReservationDate<?>> f;
        private final Class<?> g;
        private final setCode h;
        private final int i;
        private final Class<?> j;

        public DaftarTransferOutput(Object obj, setCode setcode, int i, int i2, Map<Class<?>, getReservationDate<?>> map, Class<?> cls, Class<?> cls2, CategoryResponse categoryResponse) {
            if (obj != null) {
                this.b = obj;
                if (setcode != null) {
                    this.h = setcode;
                    this.i = i;
                    this.a = i2;
                    if (map != null) {
                        this.f = map;
                        if (cls != null) {
                            this.g = cls;
                            if (cls2 != null) {
                                this.j = cls2;
                                if (categoryResponse != null) {
                                    this.d = categoryResponse;
                                    return;
                                }
                                throw new NullPointerException("Argument must not be null");
                            }
                            throw new NullPointerException("Transcode class must not be null");
                        }
                        throw new NullPointerException("Resource class must not be null");
                    }
                    throw new NullPointerException("Argument must not be null");
                }
                throw new NullPointerException("Signature must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }

        @Override // o.setCode
        public final void e(MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }

        @Override // o.setCode
        public final boolean equals(Object obj) {
            boolean z = false;
            if (obj instanceof DaftarTransferOutput) {
                DaftarTransferOutput daftarTransferOutput = (DaftarTransferOutput) obj;
                z = false;
                if (this.b.equals(daftarTransferOutput.b)) {
                    z = false;
                    if (this.h.equals(daftarTransferOutput.h)) {
                        z = false;
                        if (this.a == daftarTransferOutput.a) {
                            z = false;
                            if (this.i == daftarTransferOutput.i) {
                                z = false;
                                if (this.f.equals(daftarTransferOutput.f)) {
                                    z = false;
                                    if (this.g.equals(daftarTransferOutput.g)) {
                                        z = false;
                                        if (this.j.equals(daftarTransferOutput.j)) {
                                            z = false;
                                            if (this.d.equals(daftarTransferOutput.d)) {
                                                z = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return z;
        }

        @Override // o.setCode
        public final int hashCode() {
            if (this.c == 0) {
                int hashCode = this.b.hashCode();
                this.c = hashCode;
                int hashCode2 = (((((hashCode * 31) + this.h.hashCode()) * 31) + this.i) * 31) + this.a;
                this.c = hashCode2;
                int hashCode3 = (hashCode2 * 31) + this.f.hashCode();
                this.c = hashCode3;
                int hashCode4 = (hashCode3 * 31) + this.g.hashCode();
                this.c = hashCode4;
                int hashCode5 = (hashCode4 * 31) + this.j.hashCode();
                this.c = hashCode5;
                this.c = (hashCode5 * 31) + this.d.hashCode();
            }
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EngineKey{model=");
            sb.append(this.b);
            sb.append(", width=");
            sb.append(this.i);
            sb.append(", height=");
            sb.append(this.a);
            sb.append(", resourceClass=");
            sb.append(this.g);
            sb.append(", transcodeClass=");
            sb.append(this.j);
            sb.append(", signature=");
            sb.append(this.h);
            sb.append(", hashCode=");
            sb.append(this.c);
            sb.append(", transformations=");
            sb.append(this.f);
            sb.append(", options=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }
    }

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean d(boolean z, setNextCategoryCd setnextcategorycd, setCategoryIn setcategoryin);

    public abstract boolean e(setNextCategoryCd setnextcategorycd);
}
