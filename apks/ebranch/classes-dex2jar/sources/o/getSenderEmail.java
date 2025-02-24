package o;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import o.MasterFundSourcePurposeResponse$$Parcelable;
import o.setCurrencyName;
import o.setSenderEmail;
/* loaded from: classes-dex2jar.jar:o/getSenderEmail.class */
public abstract class getSenderEmail extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {

    /* loaded from: classes-dex2jar.jar:o/getSenderEmail$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends getSenderEmail {
        private static final write t = new write((byte) 0);
        private final setTxnPurposeValue q;

        /* loaded from: classes-dex2jar.jar:o/getSenderEmail$IconCompatParcelizer$write.class */
        static final class write {
            private write() {
            }

            public /* synthetic */ write(byte b) {
                this();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public IconCompatParcelizer(o.setTxnPurposeValue r5) {
            /*
                r4 = this;
                r0 = r5
                java.lang.String r1 = ""
                o.subscribeReservationRescheduleEvent.e(r0, r1)
                r0 = r5
                android.widget.FrameLayout r0 = r0.e
                r6 = r0
                r0 = r6
                java.lang.String r1 = ""
                o.subscribeReservationRescheduleEvent.d(r0, r1)
                r0 = r4
                r1 = r6
                android.view.View r1 = (android.view.View) r1
                r2 = 0
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r5
                r0.q = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getSenderEmail.IconCompatParcelizer.<init>(o.setTxnPurposeValue):void");
        }

        @Override // o.getSenderEmail
        public final void c(setSenderEmail setsenderemail) {
            MasterFundSourcePurposeResponse$$Parcelable masterFundSourcePurposeResponse$$Parcelable;
            subscribeReservationRescheduleEvent.e(setsenderemail, "");
            if (setsenderemail instanceof setSenderEmail$MediaBrowserCompat$CustomActionResultReceiver) {
                setSenderEmail$MediaBrowserCompat$CustomActionResultReceiver setsenderemail_mediabrowsercompat_customactionresultreceiver = (setSenderEmail$MediaBrowserCompat$CustomActionResultReceiver) setsenderemail;
                this.q.d.setImageBitmap(setsenderemail_mediabrowsercompat_customactionresultreceiver.e);
                FrameLayout frameLayout = this.q.e;
                Double d = setsenderemail_mediabrowsercompat_customactionresultreceiver.a;
                if (d == null) {
                    masterFundSourcePurposeResponse$$Parcelable = null;
                } else if (d.doubleValue() < 0.25d) {
                    MasterFundSourcePurposeResponse$$Parcelable.RemoteActionCompatParcelizer remoteActionCompatParcelizer = MasterFundSourcePurposeResponse$$Parcelable.d;
                    Context context = this.b.getContext();
                    subscribeReservationRescheduleEvent.d(context, "");
                    masterFundSourcePurposeResponse$$Parcelable = MasterFundSourcePurposeResponse$$Parcelable.RemoteActionCompatParcelizer.b(context, setCurrencyName.write.e, setCurrencyName.write.b, setCurrencyName$MediaBrowserCompat$CustomActionResultReceiver.a);
                } else {
                    MasterFundSourcePurposeResponse$$Parcelable.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = MasterFundSourcePurposeResponse$$Parcelable.d;
                    Context context2 = this.b.getContext();
                    subscribeReservationRescheduleEvent.d(context2, "");
                    masterFundSourcePurposeResponse$$Parcelable = MasterFundSourcePurposeResponse$$Parcelable.RemoteActionCompatParcelizer.b(context2, setCurrencyName.write.c, setCurrencyName.write.d, setCurrencyName$MediaBrowserCompat$CustomActionResultReceiver.a);
                }
                frameLayout.setBackground(masterFundSourcePurposeResponse$$Parcelable);
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getSenderEmail$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends getSenderEmail {
        private final setTxnNotes2 t;

        /* JADX WARN: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public RemoteActionCompatParcelizer(o.setTxnNotes2 r5) {
            /*
                r4 = this;
                r0 = r5
                java.lang.String r1 = ""
                o.subscribeReservationRescheduleEvent.e(r0, r1)
                r0 = r5
                android.widget.TextView r0 = r0.b
                r6 = r0
                r0 = r6
                java.lang.String r1 = ""
                o.subscribeReservationRescheduleEvent.d(r0, r1)
                r0 = r4
                r1 = r6
                android.view.View r1 = (android.view.View) r1
                r2 = 0
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r5
                r0.t = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getSenderEmail.RemoteActionCompatParcelizer.<init>(o.setTxnNotes2):void");
        }

        @Override // o.getSenderEmail
        public final void c(setSenderEmail setsenderemail) {
            subscribeReservationRescheduleEvent.e(setsenderemail, "");
            if (setsenderemail instanceof setSenderEmail.write) {
                this.t.c.setText(((setSenderEmail.write) setsenderemail).d);
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getSenderEmail$read.class */
    public static final class read extends getSenderEmail {
        private final setTxnSourceValue t;

        /* JADX WARN: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public read(o.setTxnSourceValue r5) {
            /*
                r4 = this;
                r0 = r5
                java.lang.String r1 = ""
                o.subscribeReservationRescheduleEvent.e(r0, r1)
                r0 = r5
                android.widget.TextView r0 = r0.a
                r6 = r0
                r0 = r6
                java.lang.String r1 = ""
                o.subscribeReservationRescheduleEvent.d(r0, r1)
                r0 = r4
                r1 = r6
                android.view.View r1 = (android.view.View) r1
                r2 = 0
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r5
                r0.t = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getSenderEmail.read.<init>(o.setTxnSourceValue):void");
        }

        @Override // o.getSenderEmail
        public final void c(setSenderEmail setsenderemail) {
            subscribeReservationRescheduleEvent.e(setsenderemail, "");
            if (setsenderemail instanceof setSenderEmail.RemoteActionCompatParcelizer) {
                this.t.b.setText(((setSenderEmail.RemoteActionCompatParcelizer) setsenderemail).b);
            }
        }
    }

    private getSenderEmail(View view) {
        super(view);
    }

    public /* synthetic */ getSenderEmail(View view, byte b) {
        this(view);
    }

    public abstract void c(setSenderEmail setsenderemail);
}
