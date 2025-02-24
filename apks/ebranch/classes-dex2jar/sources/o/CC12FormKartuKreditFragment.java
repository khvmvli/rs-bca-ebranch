package o;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/CC12FormKartuKreditFragment.class */
public final class CC12FormKartuKreditFragment extends JsonWriter {
    private static final Writer d = new Writer() { // from class: o.CC12FormKartuKreditFragment.3
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };
    private static final onChooseTipeNasabah e = new onChooseTipeNasabah("closed");
    private String c;
    public final List<BN5PilihRekeningFragment_ViewBinding> b = new ArrayList();
    public BN5PilihRekeningFragment_ViewBinding a = onSelectNoRek.b;

    public CC12FormKartuKreditFragment() {
        super(d);
    }

    private void d(BN5PilihRekeningFragment_ViewBinding bN5PilihRekeningFragment_ViewBinding) {
        if (this.c != null) {
            if (!(bN5PilihRekeningFragment_ViewBinding instanceof onSelectNoRek) || getSerializeNulls()) {
                List<BN5PilihRekeningFragment_ViewBinding> list = this.b;
                requestOTP requestotp = (requestOTP) list.get(list.size() - 1);
                String str = this.c;
                BaseFragment<String, BN5PilihRekeningFragment_ViewBinding> baseFragment = requestotp.a;
                BN5PilihRekeningFragment_ViewBinding bN5PilihRekeningFragment_ViewBinding2 = bN5PilihRekeningFragment_ViewBinding;
                if (bN5PilihRekeningFragment_ViewBinding == null) {
                    bN5PilihRekeningFragment_ViewBinding2 = onSelectNoRek.b;
                }
                baseFragment.put(str, bN5PilihRekeningFragment_ViewBinding2);
            }
            this.c = null;
        } else if (this.b.isEmpty()) {
            this.a = bN5PilihRekeningFragment_ViewBinding;
        } else {
            List<BN5PilihRekeningFragment_ViewBinding> list2 = this.b;
            BN5PilihRekeningFragment_ViewBinding bN5PilihRekeningFragment_ViewBinding3 = list2.get(list2.size() - 1);
            if (bN5PilihRekeningFragment_ViewBinding3 instanceof BN5VerifikasiOTPFragment) {
                BN5VerifikasiOTPFragment bN5VerifikasiOTPFragment = (BN5VerifikasiOTPFragment) bN5PilihRekeningFragment_ViewBinding3;
                BN5PilihRekeningFragment_ViewBinding bN5PilihRekeningFragment_ViewBinding4 = bN5PilihRekeningFragment_ViewBinding;
                if (bN5PilihRekeningFragment_ViewBinding == null) {
                    bN5PilihRekeningFragment_ViewBinding4 = onSelectNoRek.b;
                }
                bN5VerifikasiOTPFragment.c.add(bN5PilihRekeningFragment_ViewBinding4);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginArray() throws IOException {
        BN5VerifikasiOTPFragment bN5VerifikasiOTPFragment = new BN5VerifikasiOTPFragment();
        d(bN5VerifikasiOTPFragment);
        this.b.add(bN5VerifikasiOTPFragment);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginObject() throws IOException {
        requestOTP requestotp = new requestOTP();
        d(requestotp);
        this.b.add(requestotp);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.b.isEmpty()) {
            this.b.add(e);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endArray() throws IOException {
        if (this.b.isEmpty() || this.c != null) {
            throw new IllegalStateException();
        }
        List<BN5PilihRekeningFragment_ViewBinding> list = this.b;
        if (list.get(list.size() - 1) instanceof BN5VerifikasiOTPFragment) {
            List<BN5PilihRekeningFragment_ViewBinding> list2 = this.b;
            list2.remove(list2.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endObject() throws IOException {
        if (this.b.isEmpty() || this.c != null) {
            throw new IllegalStateException();
        }
        List<BN5PilihRekeningFragment_ViewBinding> list = this.b;
        if (list.get(list.size() - 1) instanceof requestOTP) {
            List<BN5PilihRekeningFragment_ViewBinding> list2 = this.b;
            list2.remove(list2.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public final void flush() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter name(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.b.isEmpty() || this.c != null) {
            throw new IllegalStateException();
        } else {
            List<BN5PilihRekeningFragment_ViewBinding> list = this.b;
            if (list.get(list.size() - 1) instanceof requestOTP) {
                this.c = str;
                return this;
            }
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter nullValue() throws IOException {
        d(onSelectNoRek.b);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(double d2) throws IOException {
        if (isLenient() || (!Double.isNaN(d2) && !Double.isInfinite(d2))) {
            d(new onChooseTipeNasabah(Double.valueOf(d2)));
            return this;
        }
        StringBuilder sb = new StringBuilder("JSON forbids NaN and infinities: ");
        sb.append(d2);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(long j) throws IOException {
        d(new onChooseTipeNasabah(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        d(new onChooseTipeNasabah(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                StringBuilder sb = new StringBuilder("JSON forbids NaN and infinities: ");
                sb.append(number);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        d(new onChooseTipeNasabah(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        d(new onChooseTipeNasabah(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(boolean z) throws IOException {
        d(new onChooseTipeNasabah(Boolean.valueOf(z)));
        return this;
    }
}
