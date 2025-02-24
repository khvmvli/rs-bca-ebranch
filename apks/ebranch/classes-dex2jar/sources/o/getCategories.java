package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.Glide$MediaBrowserCompat$CustomActionResultReceiver;
import com.bumptech.glide.Registry;
import java.util.List;
import java.util.Map;
import o.GetTxnTellerDetailKUResponse;
import o.GetTxnTellerDetailResponse;
/* loaded from: classes-dex2jar.jar:o/getCategories.class */
public final class getCategories extends ContextWrapper {
    static final getContentEn<?, ?> e = new setCardType();
    final Map<Class<?>, getContentEn<?, ?>> a;
    final List<getTxnDetailsByNoreff<Object>> b;
    final CustDataResponse$Phone$$Parcelable c;
    public final DetailTransactionResponse d;
    public final int f;
    private GetPPUNumberResponse g;
    public final Registry h;
    private final Glide$MediaBrowserCompat$CustomActionResultReceiver i;
    public final CategoriesORResponse$$Parcelable j;

    /* renamed from: o */
    private final GetTxnTellerDetailResponse.TxnDetail f141o;

    public getCategories(Context context, DetailTransactionResponse detailTransactionResponse, Registry registry, GetTxnTellerDetailResponse.TxnDetail txnDetail, Glide$MediaBrowserCompat$CustomActionResultReceiver glide$MediaBrowserCompat$CustomActionResultReceiver, Map<Class<?>, getContentEn<?, ?>> map, List<getTxnDetailsByNoreff<Object>> list, CustDataResponse$Phone$$Parcelable custDataResponse$Phone$$Parcelable, CategoriesORResponse$$Parcelable categoriesORResponse$$Parcelable, int i) {
        super(context.getApplicationContext());
        this.d = detailTransactionResponse;
        this.h = registry;
        this.f141o = txnDetail;
        this.i = glide$MediaBrowserCompat$CustomActionResultReceiver;
        this.b = list;
        this.a = map;
        this.c = custDataResponse$Phone$$Parcelable;
        this.j = categoriesORResponse$$Parcelable;
        this.f = i;
    }

    public final GetPPUNumberResponse a() {
        GetPPUNumberResponse getPPUNumberResponse;
        synchronized (this) {
            if (this.g == null) {
                GetPPUNumberResponse a = this.i.a();
                a.f = true;
                this.g = a;
            }
            getPPUNumberResponse = this.g;
        }
        return getPPUNumberResponse;
    }

    public final <X> GetTxnTellerDetailResponse<ImageView, X> d(ImageView imageView, Class<X> cls) {
        if (Bitmap.class.equals(cls)) {
            return new GetTxnTellerDetailKUResponse.TxnDetail(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new setSenderAddress2(imageView);
        }
        StringBuilder sb = new StringBuilder("Unhandled class: ");
        sb.append(cls);
        sb.append(", try .as*(Class).transcode(ResourceTranscoder)");
        throw new IllegalArgumentException(sb.toString());
    }
}
