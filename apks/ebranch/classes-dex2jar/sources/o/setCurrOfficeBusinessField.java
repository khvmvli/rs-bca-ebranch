package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setCurrOfficeBusinessField.class */
public final class setCurrOfficeBusinessField extends setCurrOfficePhoneNumber {
    private final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCurrOfficeBusinessField(byte[] bArr, int i, int i2) {
        super(bArr);
        d(0, i2, bArr.length);
        this.e = i2;
    }

    @Override // o.setCurrOfficePhoneNumber, o.setCurrOfficePostCode
    final byte a(int i) {
        return this.b[i];
    }

    @Override // o.setCurrOfficePhoneNumber, o.setCurrOfficePostCode
    public final int b() {
        return this.e;
    }

    @Override // o.setCurrOfficePhoneNumber, o.setCurrOfficePostCode
    public final byte d(int i) {
        int i2 = this.e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // o.setCurrOfficePhoneNumber
    protected final int e() {
        return 0;
    }
}
