package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import o.setCurrencyName;
/* loaded from: classes-dex2jar.jar:o/getNewRefNum.class */
public final class getNewRefNum extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<RemoteActionCompatParcelizer> {
    List<GetTxnTellerDetailResponse$TxnDetail$$Parcelable> b = new ArrayList();
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final read k;

    /* loaded from: classes-dex2jar.jar:o/getNewRefNum$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements View.OnClickListener {
        final setTxnPurposeType q;
        final /* synthetic */ getNewRefNum t;
        Long v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(getNewRefNum getnewrefnum, setTxnPurposeType settxnpurposetype) {
            super(settxnpurposetype.h);
            subscribeReservationRescheduleEvent.e(settxnpurposetype, "");
            this.t = getnewrefnum;
            this.q = settxnpurposetype;
            this.b.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Long l = this.v;
            if (l != null) {
                getNewRefNum getnewrefnum = this.t;
                long longValue = l.longValue();
                read read = getnewrefnum.k;
                if (read != null) {
                    c();
                    read.e(longValue);
                }
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getNewRefNum$read.class */
    public interface read {
        void e(long j);
    }

    public getNewRefNum(Context context, read read2) {
        subscribeReservationRescheduleEvent.e(context, "");
        this.k = read2;
        this.i = copyWindowDataInto.a(context, setCurrencyName.write.m);
        this.f = copyWindowDataInto.a(context, setCurrencyName.write.k);
        this.h = copyWindowDataInto.a(context, setCurrencyName.write.f213o);
        this.j = copyWindowDataInto.a(context, setCurrencyName.write.l);
        this.g = copyWindowDataInto.a(context, setCurrencyName.write.f);
        this.e = copyWindowDataInto.a(context, setCurrencyName.write.j);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ RemoteActionCompatParcelizer a(ViewGroup viewGroup, int i) {
        subscribeReservationRescheduleEvent.e(viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(setCurrencyName.read.i, viewGroup, false);
        int i2 = setCurrencyName.IconCompatParcelizer.f211o;
        TextView textView = (TextView) setRotation.a(inflate, i2);
        if (textView != null) {
            i2 = setCurrencyName.IconCompatParcelizer.m;
            TextView textView2 = (TextView) setRotation.a(inflate, i2);
            if (textView2 != null) {
                i2 = setCurrencyName.IconCompatParcelizer.q;
                setOptimizationLevel setoptimizationlevel = (setOptimizationLevel) setRotation.a(inflate, i2);
                if (setoptimizationlevel != null) {
                    i2 = setCurrencyName.IconCompatParcelizer.y;
                    TextView textView3 = (TextView) setRotation.a(inflate, i2);
                    if (textView3 != null) {
                        i2 = setCurrencyName.IconCompatParcelizer.B;
                        TextView textView4 = (TextView) setRotation.a(inflate, i2);
                        if (textView4 != null) {
                            i2 = setCurrencyName.IconCompatParcelizer.O;
                            TextView textView5 = (TextView) setRotation.a(inflate, i2);
                            if (textView5 != null) {
                                i2 = setCurrencyName.IconCompatParcelizer.R;
                                ImageView imageView = (ImageView) setRotation.a(inflate, i2);
                                if (imageView != null) {
                                    i2 = setCurrencyName.IconCompatParcelizer.ac;
                                    TextView textView6 = (TextView) setRotation.a(inflate, i2);
                                    if (textView6 != null) {
                                        setTxnPurposeType settxnpurposetype = new setTxnPurposeType((setMaxHeight) inflate, textView, textView2, setoptimizationlevel, textView3, textView4, textView5, imageView, textView6);
                                        subscribeReservationRescheduleEvent.d(settxnpurposetype, "");
                                        return new RemoteActionCompatParcelizer(this, settxnpurposetype);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022d  */
    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final /* synthetic */ void e(o.getNewRefNum.RemoteActionCompatParcelizer r7, int r8) {
        /*
        // Method dump skipped, instructions count: 711
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getNewRefNum.e(o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable, int):void");
    }
}
