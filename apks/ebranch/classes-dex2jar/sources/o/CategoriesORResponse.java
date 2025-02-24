package o;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import o.setFlagReservationTellerPrioritas;
/* loaded from: classes-dex2jar.jar:o/CategoriesORResponse.class */
public enum CategoriesORResponse {
    LOW(0.5f),
    NORMAL(1.0f),
    HIGH(1.5f);
    
    private final float e;

    /* loaded from: classes-dex2jar.jar:o/CategoriesORResponse$Category.class */
    public final class Category implements ComponentCallbacks2, setVendorKiosk {
        private static final GetPPUNumberResponse g;
        private static final GetPPUNumberResponse h = new GetPPUNumberResponse().e(DaftarTransferResponse.c).e(setCategories.LOW).d(true);
        private static final GetPPUNumberResponse i;
        final CopyOnWriteArrayList<getTxnDetailsByNoreff<Object>> a;
        final setTimeZone b;
        protected final Context c;
        final GetBranchReservationResponse$ReservationBranch d;
        protected final Glide e;
        final GetDaftarPekerjaanResponse f;
        private final Runnable j;
        private final setFlagReservationTellerPrioritas k;
        private final GetBranchReservationResponse$ReservationBranch$$Parcelable l;
        private GetPPUNumberResponse m;

        /* renamed from: o */
        private boolean f81o;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes-dex2jar.jar:o/CategoriesORResponse$Category$RemoteActionCompatParcelizer.class */
        public final class RemoteActionCompatParcelizer implements setFlagReservationTellerPrioritas.IconCompatParcelizer {
            private final GetBranchReservationResponse$ReservationBranch a;

            RemoteActionCompatParcelizer(GetBranchReservationResponse$ReservationBranch getBranchReservationResponse$ReservationBranch) {
                Category.this = r4;
                this.a = getBranchReservationResponse$ReservationBranch;
            }

            @Override // o.setFlagReservationTellerPrioritas.IconCompatParcelizer
            public final void a(boolean z) {
                if (z) {
                    synchronized (Category.this) {
                        GetBranchReservationResponse$ReservationBranch getBranchReservationResponse$ReservationBranch = this.a;
                        for (getNextCategory getnextcategory : getTxnNotes2.c(getBranchReservationResponse$ReservationBranch.e)) {
                            if (!getnextcategory.f() && !getnextcategory.d()) {
                                getnextcategory.a();
                                if (!getBranchReservationResponse$ReservationBranch.d) {
                                    getnextcategory.e();
                                } else {
                                    getBranchReservationResponse$ReservationBranch.a.add(getnextcategory);
                                }
                            }
                        }
                    }
                }
            }
        }

        static {
            GetPPUNumberResponse e = new GetPPUNumberResponse().e(Bitmap.class);
            e.f = true;
            i = e;
            GetPPUNumberResponse e2 = new GetPPUNumberResponse().e(getProvince.class);
            e2.f = true;
            g = e2;
        }

        public Category(Glide glide, setTimeZone settimezone, GetBranchReservationResponse$ReservationBranch$$Parcelable getBranchReservationResponse$ReservationBranch$$Parcelable, Context context) {
            this(glide, settimezone, getBranchReservationResponse$ReservationBranch$$Parcelable, new GetBranchReservationResponse$ReservationBranch(), glide.c, context);
        }

        private Category(Glide glide, setTimeZone settimezone, GetBranchReservationResponse$ReservationBranch$$Parcelable getBranchReservationResponse$ReservationBranch$$Parcelable, GetBranchReservationResponse$ReservationBranch getBranchReservationResponse$ReservationBranch, setFlagReservationCsoSolitaire setflagreservationcsosolitaire, Context context) {
            this.f = new GetDaftarPekerjaanResponse();
            AnonymousClass1 r0 = new Runnable() { // from class: o.CategoriesORResponse.Category.1
                @Override // java.lang.Runnable
                public final void run() {
                    Category.this.b.c(Category.this);
                }
            };
            this.j = r0;
            this.e = glide;
            this.b = settimezone;
            this.l = getBranchReservationResponse$ReservationBranch$$Parcelable;
            this.d = getBranchReservationResponse$ReservationBranch;
            this.c = context;
            setFlagReservationTellerPrioritas d = setflagreservationcsosolitaire.d(context.getApplicationContext(), new RemoteActionCompatParcelizer(getBranchReservationResponse$ReservationBranch));
            this.k = d;
            if (getTxnNotes2.c()) {
                getTxnNotes2.c(r0);
            } else {
                settimezone.c(this);
            }
            settimezone.c(d);
            this.a = new CopyOnWriteArrayList<>(glide.b.b);
            GetPPUNumberResponse a = glide.b.a();
            synchronized (this) {
                GetPPUNumberResponse a2 = a.clone();
                if (a2.f && !a2.i) {
                    throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
                }
                a2.i = true;
                a2.f = true;
                this.m = a2;
            }
            synchronized (glide.e) {
                if (!glide.e.contains(this)) {
                    glide.e.add(this);
                } else {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
            }
        }

        private void e(getCurrencyName<?> getcurrencyname) {
            boolean b = b(getcurrencyname);
            getNextCategory e = getcurrencyname.e();
            if (!b && !this.e.e(getcurrencyname) && e != null) {
                getcurrencyname.e((getNextCategory) null);
                e.a();
            }
        }

        private void f() {
            synchronized (this) {
                GetBranchReservationResponse$ReservationBranch getBranchReservationResponse$ReservationBranch = this.d;
                getBranchReservationResponse$ReservationBranch.d = true;
                for (getNextCategory getnextcategory : getTxnNotes2.c(getBranchReservationResponse$ReservationBranch.e)) {
                    if (getnextcategory.h() || getnextcategory.f()) {
                        getnextcategory.a();
                        getBranchReservationResponse$ReservationBranch.a.add(getnextcategory);
                    }
                }
            }
        }

        public final <T> getContentEn<?, T> a(Class<T> cls) {
            getCategories getcategories = this.e.b;
            getContentEn<?, ?> getcontenten = getcategories.a.get(cls);
            getContentEn<?, ?> getcontenten2 = getcontenten;
            if (getcontenten == null) {
                Iterator<Map.Entry<Class<?>, getContentEn<?, ?>>> it = getcategories.a.entrySet().iterator();
                while (true) {
                    getcontenten2 = getcontenten;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<Class<?>, getContentEn<?, ?>> next = it.next();
                    if (next.getKey().isAssignableFrom(cls)) {
                        getcontenten = next.getValue();
                    }
                }
            }
            getContentEn<?, T> getcontenten3 = (getContentEn<?, T>) getcontenten2;
            if (getcontenten2 == null) {
                getcontenten3 = (getContentEn<?, T>) getCategories.e;
            }
            return getcontenten3;
        }

        @Override // o.setVendorKiosk
        public final void a() {
            synchronized (this) {
                synchronized (this) {
                    GetBranchReservationResponse$ReservationBranch getBranchReservationResponse$ReservationBranch = this.d;
                    getBranchReservationResponse$ReservationBranch.d = true;
                    for (getNextCategory getnextcategory : getTxnNotes2.c(getBranchReservationResponse$ReservationBranch.e)) {
                        if (getnextcategory.h()) {
                            getnextcategory.g();
                            getBranchReservationResponse$ReservationBranch.a.add(getnextcategory);
                        }
                    }
                }
            }
            this.f.a();
        }

        public final void a(getCurrencyName<?> getcurrencyname) {
            if (getcurrencyname != null) {
                e(getcurrencyname);
            }
        }

        public final getCategoryEn<Bitmap> b() {
            return new getCategoryEn(this.e, this, Bitmap.class, this.c).c(i);
        }

        public final boolean b(getCurrencyName<?> getcurrencyname) {
            synchronized (this) {
                getNextCategory e = getcurrencyname.e();
                if (e == null) {
                    return true;
                }
                if (!this.d.b(e)) {
                    return false;
                }
                this.f.e.remove(getcurrencyname);
                getcurrencyname.e((getNextCategory) null);
                return true;
            }
        }

        @Override // o.setVendorKiosk
        public final void c() {
            synchronized (this) {
                this.f.c();
                for (getCurrencyName<?> getcurrencyname : getTxnNotes2.c(this.f.e)) {
                    if (getcurrencyname != null) {
                        e(getcurrencyname);
                    }
                }
                this.f.e.clear();
                GetBranchReservationResponse$ReservationBranch getBranchReservationResponse$ReservationBranch = this.d;
                for (getNextCategory getnextcategory : getTxnNotes2.c(getBranchReservationResponse$ReservationBranch.e)) {
                    getBranchReservationResponse$ReservationBranch.b(getnextcategory);
                }
                getBranchReservationResponse$ReservationBranch.a.clear();
                this.b.a(this);
                this.b.a(this.k);
                getTxnNotes2.a(this.j);
                Glide glide = this.e;
                synchronized (glide.e) {
                    if (glide.e.contains(this)) {
                        glide.e.remove(this);
                    } else {
                        throw new IllegalStateException("Cannot unregister not yet registered manager");
                    }
                }
            }
        }

        @Override // o.setVendorKiosk
        public final void d() {
            synchronized (this) {
                synchronized (this) {
                    GetBranchReservationResponse$ReservationBranch getBranchReservationResponse$ReservationBranch = this.d;
                    getBranchReservationResponse$ReservationBranch.d = false;
                    for (getNextCategory getnextcategory : getTxnNotes2.c(getBranchReservationResponse$ReservationBranch.e)) {
                        if (!getnextcategory.f() && !getnextcategory.h()) {
                            getnextcategory.e();
                        }
                    }
                    getBranchReservationResponse$ReservationBranch.a.clear();
                }
            }
            this.f.d();
        }

        public final GetPPUNumberResponse e() {
            GetPPUNumberResponse getPPUNumberResponse;
            synchronized (this) {
                getPPUNumberResponse = this.m;
            }
            return getPPUNumberResponse;
        }

        public final getCategoryEn<Drawable> e(Bitmap bitmap) {
            return new getCategoryEn(this.e, this, Drawable.class, this.c).a(bitmap);
        }

        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i2) {
            if (i2 == 60 && this.f81o) {
                synchronized (this) {
                    f();
                    for (Category category : this.l.a()) {
                        category.f();
                    }
                }
            }
        }

        @Override // java.lang.Object
        public final String toString() {
            String obj;
            synchronized (this) {
                StringBuilder sb = new StringBuilder();
                sb.append(toString());
                sb.append("{tracker=");
                sb.append(this.d);
                sb.append(", treeNode=");
                sb.append(this.l);
                sb.append("}");
                obj = sb.toString();
            }
            return obj;
        }
    }

    CategoriesORResponse(float f) {
        this.e = f;
    }
}
