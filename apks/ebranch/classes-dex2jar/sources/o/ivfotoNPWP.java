package o;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
/* loaded from: classes-dex2jar.jar:o/ivfotoNPWP.class */
public final class ivfotoNPWP<T> extends BN5VerifikasiOTPFragment_ViewBinding<T> {
    private BN5VerifikasiOTPFragment_ViewBinding<T> a;
    final BN5PilihNomorOTPFragment_ViewBinding b;
    private final ivfotoNPWP<T>.read c = new read(this, (byte) 0);
    private final subscribeSubmitBankNotesEvent<T> d;
    private final onChooseUpdateDaftarTransfer<T> e;
    private final onDismissUpdateDaftarTransfer g;
    private final showPekerjaanDialog<T> i;

    /* loaded from: classes-dex2jar.jar:o/ivfotoNPWP$read.class */
    final class read {
        private read() {
        }

        /* synthetic */ read(ivfotoNPWP ivfotonpwp, byte b) {
            this();
        }
    }

    public ivfotoNPWP(onChooseUpdateDaftarTransfer<T> onchooseupdatedaftartransfer, subscribeSubmitBankNotesEvent<T> subscribesubmitbanknotesevent, BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, showPekerjaanDialog<T> showpekerjaandialog, onDismissUpdateDaftarTransfer ondismissupdatedaftartransfer) {
        this.e = onchooseupdatedaftartransfer;
        this.d = subscribesubmitbanknotesevent;
        this.b = bN5PilihNomorOTPFragment_ViewBinding;
        this.i = showpekerjaandialog;
        this.g = ondismissupdatedaftartransfer;
    }

    private BN5VerifikasiOTPFragment_ViewBinding<T> a() {
        BN5VerifikasiOTPFragment_ViewBinding<T> bN5VerifikasiOTPFragment_ViewBinding = this.a;
        BN5VerifikasiOTPFragment_ViewBinding<T> bN5VerifikasiOTPFragment_ViewBinding2 = bN5VerifikasiOTPFragment_ViewBinding;
        if (bN5VerifikasiOTPFragment_ViewBinding == null) {
            bN5VerifikasiOTPFragment_ViewBinding2 = this.b.d(this.g, this.i);
            this.a = bN5VerifikasiOTPFragment_ViewBinding2;
        }
        return bN5VerifikasiOTPFragment_ViewBinding2;
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final T c(JsonReader jsonReader) throws IOException {
        if (this.d == null) {
            return a().c(jsonReader);
        }
        if (CC10KTPFormKartuKreditFragment_ViewBinding.a(jsonReader) instanceof onSelectNoRek) {
            return null;
        }
        subscribeSubmitBankNotesEvent<T> subscribesubmitbanknotesevent = this.d;
        Type type = this.i.e;
        return subscribesubmitbanknotesevent.a();
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final void d(JsonWriter jsonWriter, T t) throws IOException {
        onChooseUpdateDaftarTransfer<T> onchooseupdatedaftartransfer = this.e;
        if (onchooseupdatedaftartransfer == null) {
            a().d(jsonWriter, t);
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            Type type = this.i.e;
            showStatusTempatTinggalDialog.H.d(jsonWriter, onchooseupdatedaftartransfer.e());
        }
    }
}
