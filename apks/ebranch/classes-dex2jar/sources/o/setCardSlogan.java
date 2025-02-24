package o;

import android.os.CountDownTimer;
/* loaded from: classes-dex2jar.jar:o/setCardSlogan.class */
public final class setCardSlogan {
    private static setCardSlogan c = new setCardSlogan();
    private read a;
    public String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setCardSlogan$read.class */
    public final class read extends CountDownTimer {
        public read() {
            super(300000, 1000);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            documentProvider.b().d(new UbahPINActivity_ViewBinding(setCardSlogan.this.b));
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
        }
    }

    private setCardSlogan() {
    }

    public static setCardSlogan e() {
        return c;
    }

    public final void c() {
        read read2 = this.a;
        if (read2 == null) {
            read read3 = new read();
            this.a = read3;
            read3.start();
            return;
        }
        read2.start();
    }

    public final void d() {
        read read2 = this.a;
        read read3 = read2;
        if (read2 == null) {
            read3 = new read();
            this.a = read3;
        }
        read3.cancel();
    }
}
