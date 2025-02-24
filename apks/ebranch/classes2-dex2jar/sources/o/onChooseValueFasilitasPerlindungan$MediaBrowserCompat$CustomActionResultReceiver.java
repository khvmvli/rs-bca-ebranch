package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver extends onChooseValueFasilitasPerlindungan {
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver(float f) {
        this.d = f;
        this.b = Integer.TYPE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver(float f, int i) {
        this.d = f;
        this.e = i;
        this.b = Integer.TYPE;
        this.a = true;
    }

    @Override // o.onChooseValueFasilitasPerlindungan
    public final /* synthetic */ onChooseValueFasilitasPerlindungan a() {
        onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver = new onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver(this.d, this.e);
        onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver.c(e());
        return onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver;
    }

    @Override // o.onChooseValueFasilitasPerlindungan
    public final void a(Object obj) {
        if (obj != null && obj.getClass() == Integer.class) {
            this.e = ((Integer) obj).intValue();
            this.a = true;
        }
    }

    @Override // o.onChooseValueFasilitasPerlindungan
    public final Object c() {
        return Integer.valueOf(this.e);
    }

    @Override // o.onChooseValueFasilitasPerlindungan, java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver = new onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver(this.d, this.e);
        onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver.c(e());
        return onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver;
    }
}
