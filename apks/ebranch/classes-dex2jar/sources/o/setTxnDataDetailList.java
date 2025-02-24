package o;
/* loaded from: classes-dex2jar.jar:o/setTxnDataDetailList.class */
public final class setTxnDataDetailList implements setReceiverAddress<byte[]> {
    @Override // o.setReceiverAddress
    public final int a() {
        return 1;
    }

    @Override // o.setReceiverAddress
    public final /* bridge */ /* synthetic */ int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // o.setReceiverAddress
    public final /* bridge */ /* synthetic */ byte[] b(int i) {
        return new byte[i];
    }

    @Override // o.setReceiverAddress
    public final String b() {
        return "ByteArrayPool";
    }
}
