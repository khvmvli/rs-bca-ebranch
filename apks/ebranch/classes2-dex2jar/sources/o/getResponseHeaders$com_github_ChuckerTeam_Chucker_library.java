package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2-dex2jar.jar:o/getResponseHeaders$com_github_ChuckerTeam_Chucker_library.class */
public class getResponseHeaders$com_github_ChuckerTeam_Chucker_library {
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(getResponseHeaders$com_github_ChuckerTeam_Chucker_library.class, Object.class, "_next");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(getResponseHeaders$com_github_ChuckerTeam_Chucker_library.class, Object.class, "_prev");
    private static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(getResponseHeaders$com_github_ChuckerTeam_Chucker_library.class, Object.class, "_removedRef");

    public final void d(getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library) {
        Object obj;
        boolean z;
        do {
            getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library2 = (getResponseHeaders$com_github_ChuckerTeam_Chucker_library) getresponseheaders_com_github_chuckerteam_chucker_library._prev;
            while (true) {
                obj = this._next;
                if (!(obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                    break;
                }
                ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(this);
            }
            if (obj == getresponseheaders_com_github_chuckerteam_chucker_library) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(getresponseheaders_com_github_chuckerteam_chucker_library, getresponseheaders_com_github_chuckerteam_chucker_library2, this)) {
                        if (atomicReferenceFieldUpdater.get(getresponseheaders_com_github_chuckerteam_chucker_library) != getresponseheaders_com_github_chuckerteam_chucker_library2) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z);
        if (d()) {
            getresponseheaders_com_github_chuckerteam_chucker_library.a(null);
        }
    }

    public static getResponseHeaders$com_github_ChuckerTeam_Chucker_library e(getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library) {
        while (getresponseheaders_com_github_chuckerteam_chucker_library.d()) {
            getresponseheaders_com_github_chuckerteam_chucker_library = (getResponseHeaders$com_github_ChuckerTeam_Chucker_library) getresponseheaders_com_github_chuckerteam_chucker_library._prev;
        }
        return getresponseheaders_com_github_chuckerteam_chucker_library;
    }

    public boolean E_() {
        boolean z;
        getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library;
        boolean z2;
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                getresponseheaders_com_github_chuckerteam_chucker_library = null;
                z = true;
                if (obj instanceof getResponsePayloadSize) {
                    getresponseheaders_com_github_chuckerteam_chucker_library = ((getResponsePayloadSize) obj).a;
                    break;
                } else if (obj == this) {
                    getresponseheaders_com_github_chuckerteam_chucker_library = (getResponseHeaders$com_github_ChuckerTeam_Chucker_library) obj;
                    break;
                } else {
                    getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library2 = (getResponseHeaders$com_github_ChuckerTeam_Chucker_library) obj;
                    getResponsePayloadSize getresponsepayloadsize = (getResponsePayloadSize) getresponseheaders_com_github_chuckerteam_chucker_library2._removedRef;
                    getResponsePayloadSize getresponsepayloadsize2 = getresponsepayloadsize;
                    if (getresponsepayloadsize == null) {
                        getresponsepayloadsize2 = new getResponsePayloadSize(getresponseheaders_com_github_chuckerteam_chucker_library2);
                        a.lazySet(getresponseheaders_com_github_chuckerteam_chucker_library2, getresponsepayloadsize2);
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, getresponsepayloadsize2)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                z2 = false;
                                break;
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    if (z2) {
                        getresponseheaders_com_github_chuckerteam_chucker_library2.a(null);
                        break;
                    }
                }
            } else {
                ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(this);
            }
        }
        if (getresponseheaders_com_github_chuckerteam_chucker_library != null) {
            z = false;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
        r0 = o.getResponseHeaders$com_github_ChuckerTeam_Chucker_library.e;
        r0 = ((o.getResponsePayloadSize) r0).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
        if (r0.compareAndSet(r9, r8, r0) == false) goto L_0x00ad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
        if (r0.get(r9) == r8) goto L_0x009a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00be, code lost:
        if (r12 == false) goto L_0x0000;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final o.getResponseHeaders$com_github_ChuckerTeam_Chucker_library a(o.getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library r6) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getResponseHeaders$com_github_ChuckerTeam_Chucker_library.a(o.getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library):o.getResponseHeaders$com_github_ChuckerTeam_Chucker_library");
    }

    public final boolean b(getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library) {
        b.lazySet(getresponseheaders_com_github_chuckerteam_chucker_library, this);
        e.lazySet(getresponseheaders_com_github_chuckerteam_chucker_library, this);
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                boolean z = false;
                if (obj != this) {
                    return false;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, this, getresponseheaders_com_github_chuckerteam_chucker_library)) {
                        if (atomicReferenceFieldUpdater.get(this) != this) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    getresponseheaders_com_github_chuckerteam_chucker_library.d(this);
                    return true;
                }
            } else {
                ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(this);
            }
        }
    }

    public final Object c() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                return obj;
            }
            ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(this);
        }
    }

    public boolean d() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                return obj instanceof getResponsePayloadSize;
            }
            ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(this);
        }
    }

    public final getResponseHeaders$com_github_ChuckerTeam_Chucker_library h() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                return getRequestPayloadSize.b(obj);
            }
            ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(this);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('@');
        sb.append((Object) Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }
}
