package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Deprecated
/* loaded from: classes-dex2jar.jar:o/GetTxnTellerDetailResponse.class */
public abstract class GetTxnTellerDetailResponse<T extends View, Z> extends GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable<Z> {
    private static boolean b;
    private static int c = CardType$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver.b;
    protected final T a;
    private View.OnAttachStateChangeListener d;
    private boolean e;
    private boolean f;
    private final RemoteActionCompatParcelizer i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/GetTxnTellerDetailResponse$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        static Integer b;
        write a;
        final View c;
        boolean d;
        final List<GetTxnTellerDetailResponse$$Parcelable> e = new ArrayList();

        /* loaded from: classes-dex2jar.jar:o/GetTxnTellerDetailResponse$RemoteActionCompatParcelizer$write.class */
        public static final class write implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<RemoteActionCompatParcelizer> c;

            write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                this.c = new WeakReference<>(remoteActionCompatParcelizer);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    StringBuilder sb = new StringBuilder("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                    Log.v("ViewTarget", sb.toString());
                }
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.c.get();
                if (remoteActionCompatParcelizer == null) {
                    return true;
                }
                remoteActionCompatParcelizer.d();
                return true;
            }
        }

        RemoteActionCompatParcelizer(View view) {
            this.c = view;
        }

        private int e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.d && this.c.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.c.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.c.getContext();
            if (b == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    b = Integer.valueOf(Math.max(point.x, point.y));
                } else {
                    throw new NullPointerException("Argument must not be null");
                }
            }
            return b.intValue();
        }

        private boolean e(int i, int i2) {
            boolean z = false;
            if (i > 0 || i == Integer.MIN_VALUE) {
                z = false;
                if (i2 > 0 || i2 == Integer.MIN_VALUE) {
                    z = true;
                }
            }
            return z;
        }

        int a() {
            int paddingTop = this.c.getPaddingTop();
            int paddingBottom = this.c.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            return e(this.c.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop + paddingBottom);
        }

        int b() {
            int paddingLeft = this.c.getPaddingLeft();
            int paddingRight = this.c.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            return e(this.c.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft + paddingRight);
        }

        final void d() {
            if (!this.e.isEmpty()) {
                int b2 = b();
                int a = a();
                if (e(b2, a)) {
                    Iterator it = new ArrayList(this.e).iterator();
                    while (it.hasNext()) {
                        ((GetTxnTellerDetailResponse$$Parcelable) it.next()).c(b2, a);
                    }
                    e();
                }
            }
        }

        final void e() {
            ViewTreeObserver viewTreeObserver = this.c.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.a);
            }
            this.a = null;
            this.e.clear();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/GetTxnTellerDetailResponse$TxnDetail.class */
    public final class TxnDetail {

        /* loaded from: classes-dex2jar.jar:o/GetTxnTellerDetailResponse$TxnDetail$Representative.class */
        public final class Representative {
            public String a;
            public String b;
            public String c;
            public Long d;
            public String e;
            private Long f;

            public Representative(Long l, String str, Long l2, String str2, String str3, String str4) {
                this.f = l;
                this.c = str;
                this.d = l2;
                this.a = str2;
                this.e = str3;
                this.b = str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Representative)) {
                    return false;
                }
                Representative representative = (Representative) obj;
                return subscribeReservationRescheduleEvent.b(this.f, representative.f) && subscribeReservationRescheduleEvent.b((Object) this.c, (Object) representative.c) && subscribeReservationRescheduleEvent.b(this.d, representative.d) && subscribeReservationRescheduleEvent.b((Object) this.a, (Object) representative.a) && subscribeReservationRescheduleEvent.b((Object) this.e, (Object) representative.e) && subscribeReservationRescheduleEvent.b((Object) this.b, (Object) representative.b);
            }

            public final int hashCode() {
                Long l = this.f;
                int i = 0;
                int hashCode = l == null ? 0 : l.hashCode();
                String str = this.c;
                int hashCode2 = str == null ? 0 : str.hashCode();
                Long l2 = this.d;
                int hashCode3 = l2 == null ? 0 : l2.hashCode();
                String str2 = this.a;
                int hashCode4 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.e;
                int hashCode5 = str3 == null ? 0 : str3.hashCode();
                String str4 = this.b;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("RecordedThrowable(id=");
                sb.append(this.f);
                sb.append(", tag=");
                sb.append(this.c);
                sb.append(", date=");
                sb.append(this.d);
                sb.append(", clazz=");
                sb.append(this.a);
                sb.append(", message=");
                sb.append(this.e);
                sb.append(", content=");
                sb.append(this.b);
                sb.append(')');
                return sb.toString();
            }
        }

        /* loaded from: classes-dex2jar.jar:o/GetTxnTellerDetailResponse$TxnDetail$WarkatTunda.class */
        public final class WarkatTunda extends BN5VerifikasiOTPFragment_ViewBinding implements CC20FormKartuKreditFragment_ViewBinding {
            private BN5PilihNomorOTPFragment_ViewBinding a;
            private CC21BFormKartuKreditFragment b;
            private CC21AFormKartuKreditFragment_ViewBinding c;

            public WarkatTunda(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, CC21BFormKartuKreditFragment cC21BFormKartuKreditFragment, CC21AFormKartuKreditFragment_ViewBinding cC21AFormKartuKreditFragment_ViewBinding) {
                this.a = bN5PilihNomorOTPFragment_ViewBinding;
                this.b = cC21BFormKartuKreditFragment;
                this.c = cC21AFormKartuKreditFragment_ViewBinding;
            }

            @Override // o.BN5VerifikasiOTPFragment_ViewBinding
            public final Object c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    return null;
                }
                GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable = new GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable();
                getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable.e(this.a, jsonReader, this.b);
                return getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable;
            }

            @Override // o.BN5VerifikasiOTPFragment_ViewBinding
            public final void d(JsonWriter jsonWriter, Object obj) throws IOException {
                if (obj == null) {
                    jsonWriter.nullValue();
                } else {
                    ((GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable) obj).a(this.a, jsonWriter, this.c);
                }
            }
        }
    }

    public GetTxnTellerDetailResponse(T t) {
        if (t != null) {
            this.a = t;
            this.i = new RemoteActionCompatParcelizer(t);
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // o.GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable, o.getCurrencyName
    public void b(Drawable drawable) {
        b(drawable);
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.d;
        if (onAttachStateChangeListener != null && !this.e) {
            this.a.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.e = true;
        }
    }

    @Override // o.getCurrencyName
    public final void b(GetTxnTellerDetailResponse$$Parcelable getTxnTellerDetailResponse$$Parcelable) {
        this.i.e.remove(getTxnTellerDetailResponse$$Parcelable);
    }

    @Override // o.GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable, o.getCurrencyName
    public void c(Drawable drawable) {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        c(drawable);
        this.i.e();
        if (!this.f && (onAttachStateChangeListener = this.d) != null && this.e) {
            this.a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.e = false;
        }
    }

    @Override // o.GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable, o.getCurrencyName
    public final getNextCategory e() {
        getNextCategory getnextcategory;
        Object tag = this.a.getTag(c);
        if (tag == null) {
            getnextcategory = null;
        } else if (tag instanceof getNextCategory) {
            getnextcategory = (getNextCategory) tag;
        } else {
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return getnextcategory;
    }

    @Override // o.getCurrencyName
    public final void e(GetTxnTellerDetailResponse$$Parcelable getTxnTellerDetailResponse$$Parcelable) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.i;
        int b2 = remoteActionCompatParcelizer.b();
        int a = remoteActionCompatParcelizer.a();
        boolean z = false;
        if (b2 > 0 || b2 == Integer.MIN_VALUE) {
            z = false;
            if (a > 0 || a == Integer.MIN_VALUE) {
                z = true;
            }
        }
        if (z) {
            getTxnTellerDetailResponse$$Parcelable.c(b2, a);
            return;
        }
        if (!remoteActionCompatParcelizer.e.contains(getTxnTellerDetailResponse$$Parcelable)) {
            remoteActionCompatParcelizer.e.add(getTxnTellerDetailResponse$$Parcelable);
        }
        if (remoteActionCompatParcelizer.a == null) {
            ViewTreeObserver viewTreeObserver = remoteActionCompatParcelizer.c.getViewTreeObserver();
            RemoteActionCompatParcelizer.write write = new RemoteActionCompatParcelizer.write(remoteActionCompatParcelizer);
            remoteActionCompatParcelizer.a = write;
            viewTreeObserver.addOnPreDrawListener(write);
        }
    }

    @Override // o.GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable, o.getCurrencyName
    public final void e(getNextCategory getnextcategory) {
        b = true;
        this.a.setTag(c, getnextcategory);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target for: ");
        sb.append(this.a);
        return sb.toString();
    }
}
