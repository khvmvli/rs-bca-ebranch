package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import o.checkSimpanNama;
import o.getSenderEmail;
import o.setCurrencyName;
import o.setSenderEmail;
/* loaded from: classes-dex2jar.jar:o/setNewRefNum.class */
public final class setNewRefNum extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<getSenderEmail> {
    public static final read b = new read((byte) 0);
    final ArrayList<setSenderEmail> e = new ArrayList<>();

    /* loaded from: classes-dex2jar.jar:o/setNewRefNum$read.class */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [o.getSenderEmail, o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable] */
    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ getSenderEmail a(ViewGroup viewGroup, int i) {
        getSenderEmail.read read2;
        subscribeReservationRescheduleEvent.e(viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            View inflate = from.inflate(setCurrencyName.read.k, viewGroup, false);
            if (inflate != null) {
                TextView textView = (TextView) inflate;
                setTxnSourceValue settxnsourcevalue = new setTxnSourceValue(textView, textView);
                subscribeReservationRescheduleEvent.d(settxnsourcevalue, "");
                read2 = new getSenderEmail.read(settxnsourcevalue);
            } else {
                throw new NullPointerException("rootView");
            }
        } else if (i != 2) {
            View inflate2 = from.inflate(setCurrencyName.read.l, viewGroup, false);
            int i2 = setCurrencyName.IconCompatParcelizer.a;
            ImageView imageView = (ImageView) setRotation.a(inflate2, i2);
            if (imageView != null) {
                setTxnPurposeValue settxnpurposevalue = new setTxnPurposeValue((FrameLayout) inflate2, imageView);
                subscribeReservationRescheduleEvent.d(settxnpurposevalue, "");
                read2 = new getSenderEmail.IconCompatParcelizer(settxnpurposevalue);
            } else {
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
            }
        } else {
            View inflate3 = from.inflate(setCurrencyName.read.h, viewGroup, false);
            if (inflate3 != null) {
                TextView textView2 = (TextView) inflate3;
                setTxnNotes2 settxnnotes2 = new setTxnNotes2(textView2, textView2);
                subscribeReservationRescheduleEvent.d(settxnnotes2, "");
                read2 = new getSenderEmail.RemoteActionCompatParcelizer(settxnnotes2);
            } else {
                throw new NullPointerException("rootView");
            }
        }
        return (setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) read2;
    }

    public final void b() {
        ArrayList<setSenderEmail> arrayList = this.e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof setSenderEmail.write) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList2;
        subscribeReservationRescheduleEvent.e(arrayList3, "");
        for (onClickedSetiapHari onclickedsetiaphari : new clickLanjut(new checkSimpanNama.MediaBrowserCompat.CustomActionResultReceiver(arrayList3))) {
            int i = onclickedsetiaphari.e;
            setSenderEmail.write write = (setSenderEmail.write) onclickedsetiaphari.c;
            boolean z = false;
            Object[] spans = write.d.getSpans(0, write.d.length() - 1, Object.class);
            subscribeReservationRescheduleEvent.d(spans, "");
            if (spans.length == 0) {
                z = true;
            }
            if (!z) {
                write.d.clearSpans();
                e(i + 1);
            }
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int d(int i) {
        int i2;
        setSenderEmail setsenderemail = this.e.get(i);
        if (setsenderemail instanceof setSenderEmail.RemoteActionCompatParcelizer) {
            i2 = 1;
        } else if (setsenderemail instanceof setSenderEmail.write) {
            i2 = 2;
        } else if (setsenderemail instanceof setSenderEmail$MediaBrowserCompat$CustomActionResultReceiver) {
            i2 = 3;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return i2;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(getSenderEmail getsenderemail, int i) {
        getSenderEmail getsenderemail2 = getsenderemail;
        subscribeReservationRescheduleEvent.e(getsenderemail2, "");
        setSenderEmail setsenderemail = this.e.get(i);
        subscribeReservationRescheduleEvent.d(setsenderemail, "");
        getsenderemail2.c(setsenderemail);
    }
}
