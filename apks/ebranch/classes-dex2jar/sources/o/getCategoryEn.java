package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o.CategoriesORResponse;
/* loaded from: classes-dex2jar.jar:o/getCategoryEn.class */
public final class getCategoryEn<TranscodeType> extends setBusinessField<getCategoryEn<TranscodeType>> implements Cloneable {
    protected static final GetPPUNumberResponse a = new GetPPUNumberResponse().e(DaftarTransferResponse.c).e(setCategories.LOW).d(true);
    private Object A;
    private final getCategories B;
    private boolean C;
    private boolean D;
    private Float E;
    private getCategoryEn<TranscodeType> F;
    private final CategoriesORResponse.Category G;
    private final Class<TranscodeType> H;
    private List<getTxnDetailsByNoreff<TranscodeType>> I;
    private getContentEn<?, ? super TranscodeType> N;
    private getCategoryEn<TranscodeType> u;
    private final Glide v;
    private final Context w;
    private boolean z = true;

    /* renamed from: o.getCategoryEn$2 */
    /* loaded from: classes-dex2jar.jar:o/getCategoryEn$2.class */
    public static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[setCategories.values().length];
            b = iArr;
            try {
                iArr[setCategories.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                b[setCategories.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                b[setCategories.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                b[setCategories.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            c = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                c[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                c[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
            try {
                c[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError e8) {
            }
            try {
                c[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError e9) {
            }
            try {
                c[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError e10) {
            }
            try {
                c[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError e11) {
            }
            try {
                c[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError e12) {
            }
        }
    }

    public getCategoryEn(Glide glide, CategoriesORResponse.Category category, Class<TranscodeType> cls, Context context) {
        this.v = glide;
        this.G = category;
        this.H = cls;
        this.w = context;
        this.N = category.a(cls);
        this.B = glide.b;
        for (getTxnDetailsByNoreff<Object> gettxndetailsbynoreff : category.a) {
            c(gettxndetailsbynoreff);
        }
        GetPPUNumberResponse e = category.e();
        if (e != null) {
            c(e);
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    private getNextCategory a(Object obj, getCurrencyName<TranscodeType> getcurrencyname, getTxnDetailsByNoreff<TranscodeType> gettxndetailsbynoreff, setNextCategory setnextcategory, getContentEn<?, ? super TranscodeType> getcontenten, setCategories setcategories, int i, int i2, setBusinessField<?> setbusinessfield, Executor executor) {
        getCategoryEn<TranscodeType> getcategoryen = this.F;
        if (getcategoryen != null) {
            if (!this.D) {
                getContentEn<?, ? super TranscodeType> getcontenten2 = getcategoryen.N;
                if (getcategoryen.z) {
                    getcontenten2 = getcontenten;
                }
                setCategories d = getcategoryen.g() ? this.F.d() : d(setcategories);
                int b = this.F.b();
                int e = this.F.e();
                int i3 = b;
                int i4 = e;
                if (getTxnNotes2.d(i, i2)) {
                    i3 = b;
                    i4 = e;
                    if (!this.F.j()) {
                        i3 = setbusinessfield.b();
                        i4 = setbusinessfield.e();
                    }
                }
                GetTxnTellerDetailKUResponse getTxnTellerDetailKUResponse = new GetTxnTellerDetailKUResponse(obj, setnextcategory);
                getNextCategory d2 = d(obj, getcurrencyname, gettxndetailsbynoreff, setbusinessfield, getTxnTellerDetailKUResponse, getcontenten, setcategories, i, i2, executor);
                this.D = true;
                getCategoryEn<TranscodeType> getcategoryen2 = this.F;
                getNextCategory d3 = getcategoryen2.d(obj, getcurrencyname, gettxndetailsbynoreff, getTxnTellerDetailKUResponse, getcontenten2, d, i3, i4, getcategoryen2, executor);
                this.D = false;
                getTxnTellerDetailKUResponse.a = d2;
                getTxnTellerDetailKUResponse.d = d3;
                return getTxnTellerDetailKUResponse;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.E == null) {
            return d(obj, getcurrencyname, gettxndetailsbynoreff, setbusinessfield, setnextcategory, getcontenten, setcategories, i, i2, executor);
        } else {
            GetTxnTellerDetailKUResponse getTxnTellerDetailKUResponse2 = new GetTxnTellerDetailKUResponse(obj, setnextcategory);
            getNextCategory d4 = d(obj, getcurrencyname, gettxndetailsbynoreff, setbusinessfield, getTxnTellerDetailKUResponse2, getcontenten, setcategories, i, i2, executor);
            getNextCategory d5 = d(obj, getcurrencyname, gettxndetailsbynoreff, setbusinessfield.clone().c(this.E.floatValue()), getTxnTellerDetailKUResponse2, getcontenten, d(setcategories), i, i2, executor);
            getTxnTellerDetailKUResponse2.a = d4;
            getTxnTellerDetailKUResponse2.d = d5;
            return getTxnTellerDetailKUResponse2;
        }
    }

    private getCategoryEn<TranscodeType> b(Object obj) {
        getCategoryEn<TranscodeType> getcategoryen = this;
        while (getcategoryen.c()) {
            getcategoryen = getcategoryen.clone();
        }
        getcategoryen.A = obj;
        getcategoryen.C = true;
        return getcategoryen.o();
    }

    private getCategoryEn<TranscodeType> c(getTxnDetailsByNoreff<TranscodeType> gettxndetailsbynoreff) {
        getCategoryEn<TranscodeType> getcategoryen = this;
        while (getcategoryen.c()) {
            getcategoryen = getcategoryen.clone();
        }
        if (gettxndetailsbynoreff != null) {
            if (getcategoryen.I == null) {
                getcategoryen.I = new ArrayList();
            }
            getcategoryen.I.add(gettxndetailsbynoreff);
        }
        return getcategoryen.o();
    }

    private getNextCategory d(Object obj, getCurrencyName<TranscodeType> getcurrencyname, getTxnDetailsByNoreff<TranscodeType> gettxndetailsbynoreff, setBusinessField<?> setbusinessfield, setNextCategory setnextcategory, getContentEn<?, ? super TranscodeType> getcontenten, setCategories setcategories, int i, int i2, Executor executor) {
        Context context = this.w;
        getCategories getcategories = this.B;
        return GetDaftarPekerjaanResponse$DataPekerjaanOutput$$Parcelable.e(context, getcategories, obj, this.A, this.H, setbusinessfield, i, i2, setcategories, getcurrencyname, gettxndetailsbynoreff, this.I, setnextcategory, getcategories.c, getcontenten.c, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private getNextCategory d(Object obj, getCurrencyName<TranscodeType> getcurrencyname, getTxnDetailsByNoreff<TranscodeType> gettxndetailsbynoreff, setNextCategory setnextcategory, getContentEn<?, ? super TranscodeType> getcontenten, setCategories setcategories, int i, int i2, setBusinessField<?> setbusinessfield, Executor executor) {
        setNextCategory setnextcategory2;
        getOccupation getoccupation;
        if (this.u != null) {
            setnextcategory2 = new getOccupation(obj, setnextcategory);
            getoccupation = setnextcategory2;
        } else {
            getoccupation = 0;
            setnextcategory2 = setnextcategory;
        }
        getNextCategory a2 = a(obj, getcurrencyname, gettxndetailsbynoreff, setnextcategory2, getcontenten, setcategories, i, i2, setbusinessfield, executor);
        if (getoccupation == 0) {
            return a2;
        }
        int b = this.u.b();
        int e = this.u.e();
        int i3 = b;
        int i4 = e;
        if (getTxnNotes2.d(i, i2)) {
            i3 = b;
            i4 = e;
            if (!this.u.j()) {
                i3 = setbusinessfield.b();
                i4 = setbusinessfield.e();
            }
        }
        getCategoryEn<TranscodeType> getcategoryen = this.u;
        getNextCategory d = getcategoryen.d(obj, getcurrencyname, gettxndetailsbynoreff, getoccupation, getcategoryen.N, getcategoryen.d(), i3, i4, this.u, executor);
        getoccupation.d = a2;
        getoccupation.b = d;
        return getoccupation;
    }

    private setCategories d(setCategories setcategories) {
        int i = AnonymousClass2.b[setcategories.ordinal()];
        if (i == 1) {
            return setCategories.NORMAL;
        }
        if (i == 2) {
            return setCategories.HIGH;
        }
        if (i == 3 || i == 4) {
            return setCategories.IMMEDIATE;
        }
        StringBuilder sb = new StringBuilder("unknown priority: ");
        sb.append(d());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: l */
    public getCategoryEn<TranscodeType> clone() {
        getCategoryEn<TranscodeType> a2 = clone();
        a2.N = a2.N.clone();
        if (a2.I != null) {
            a2.I = new ArrayList(a2.I);
        }
        getCategoryEn<TranscodeType> getcategoryen = a2.F;
        if (getcategoryen != null) {
            a2.F = getcategoryen.clone();
        }
        getCategoryEn<TranscodeType> getcategoryen2 = a2.u;
        if (getcategoryen2 != null) {
            a2.u = getcategoryen2.clone();
        }
        return a2;
    }

    public final getCategoryEn<TranscodeType> a(Bitmap bitmap) {
        return b(bitmap).c(new GetPPUNumberResponse().e(DaftarTransferResponse.d));
    }

    public final getCategoryEn<TranscodeType> a(Object obj) {
        return b(obj);
    }

    public <Y extends getCurrencyName<TranscodeType>> Y a(Y y, getTxnDetailsByNoreff<TranscodeType> gettxndetailsbynoreff, setBusinessField<?> setbusinessfield, Executor executor) {
        if (y == null) {
            throw new NullPointerException("Argument must not be null");
        } else if (this.C) {
            getNextCategory d = d(new Object(), y, gettxndetailsbynoreff, (setNextCategory) null, this.N, setbusinessfield.d(), setbusinessfield.b(), setbusinessfield.e(), setbusinessfield, executor);
            getNextCategory e = y.e();
            if (d.e(e)) {
                if (!(!setbusinessfield.h() && e.f())) {
                    if (e != null) {
                        if (!e.h()) {
                            e.e();
                        }
                        return y;
                    }
                    throw new NullPointerException("Argument must not be null");
                }
            }
            this.G.a((getCurrencyName<?>) y);
            y.e(d);
            CategoriesORResponse.Category category = this.G;
            synchronized (category) {
                category.f.e.add(y);
                GetBranchReservationResponse$ReservationBranch getBranchReservationResponse$ReservationBranch = category.d;
                getBranchReservationResponse$ReservationBranch.e.add(d);
                if (!getBranchReservationResponse$ReservationBranch.d) {
                    d.e();
                } else {
                    d.a();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    getBranchReservationResponse$ReservationBranch.a.add(d);
                }
            }
            return y;
        } else {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
    }

    public final GetTxnTellerDetailResponse<ImageView, TranscodeType> c(ImageView imageView) {
        getCategoryEn<TranscodeType> getcategoryen;
        getTxnNotes2.b();
        if (imageView != null) {
            if (!i() && f() && imageView.getScaleType() != null) {
                switch (AnonymousClass2.c[imageView.getScaleType().ordinal()]) {
                    case 1:
                        getcategoryen = clone().n();
                        break;
                    case 2:
                        getcategoryen = clone().k();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        getcategoryen = clone().m();
                        break;
                    case 6:
                        getcategoryen = clone().k();
                        break;
                }
                return (GetTxnTellerDetailResponse) a(this.B.d(imageView, this.H), null, getcategoryen, getReceiverPostalCode.e());
            }
            getcategoryen = this;
            return (GetTxnTellerDetailResponse) a(this.B.d(imageView, this.H), null, getcategoryen, getReceiverPostalCode.e());
        }
        throw new NullPointerException("Argument must not be null");
    }

    /* renamed from: d */
    public final getCategoryEn<TranscodeType> c(setBusinessField<?> setbusinessfield) {
        if (setbusinessfield != null) {
            return c(setbusinessfield);
        }
        throw new NullPointerException("Argument must not be null");
    }
}
