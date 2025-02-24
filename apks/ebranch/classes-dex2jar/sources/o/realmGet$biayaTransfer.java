package o;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmGet$biayaTransfer.class */
public final class realmGet$biayaTransfer implements ValueEncoderContext {
    private FieldDescriptor c;
    private final getStatusPendudukPenerima d;
    private boolean e = false;
    private boolean b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmGet$biayaTransfer(getStatusPendudukPenerima getstatuspendudukpenerima) {
        this.d = getstatuspendudukpenerima;
    }

    private final void c() {
        if (!this.e) {
            this.e = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    public final ValueEncoderContext add(double d) throws IOException {
        c();
        this.d.b(this.c, d, this.b);
        return this;
    }

    public final ValueEncoderContext add(float f) throws IOException {
        c();
        this.d.a(this.c, f, this.b);
        return this;
    }

    public final ValueEncoderContext add(int i) throws IOException {
        c();
        this.d.e(this.c, i, this.b);
        return this;
    }

    public final ValueEncoderContext add(long j) throws IOException {
        c();
        this.d.e(this.c, j, this.b);
        return this;
    }

    public final ValueEncoderContext add(String str) throws IOException {
        c();
        this.d.d(this.c, str, this.b);
        return this;
    }

    public final ValueEncoderContext add(boolean z) throws IOException {
        c();
        this.d.e(this.c, z ? 1 : 0, this.b);
        return this;
    }

    public final ValueEncoderContext add(byte[] bArr) throws IOException {
        c();
        this.d.d(this.c, bArr, this.b);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(FieldDescriptor fieldDescriptor, boolean z) {
        this.e = false;
        this.c = fieldDescriptor;
        this.b = z;
    }
}
