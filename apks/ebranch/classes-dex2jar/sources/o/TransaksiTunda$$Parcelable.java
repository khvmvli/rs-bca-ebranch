package o;

import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/TransaksiTunda$$Parcelable.class */
public abstract class TransaksiTunda$$Parcelable {

    /* loaded from: classes-dex2jar.jar:o/TransaksiTunda$$Parcelable$IconCompatParcelizer.class */
    public static abstract class IconCompatParcelizer {
        public abstract IconCompatParcelizer a(Integer num);

        public abstract IconCompatParcelizer b(long j);

        public abstract IconCompatParcelizer c(List<TransaksiTundaDetail> list);

        public abstract TransaksiTunda$$Parcelable c();

        public abstract IconCompatParcelizer d(String str);

        public abstract IconCompatParcelizer d(getTxbType gettxbtype);

        public abstract IconCompatParcelizer e(long j);

        public abstract IconCompatParcelizer e(setTxbDateFormatted settxbdateformatted);
    }

    @Encodable.Field(name = "logEvent")
    public abstract List<TransaksiTundaDetail> a();

    public abstract String b();

    public abstract getTxbType c();

    public abstract setTxbDateFormatted d();

    public abstract Integer e();

    public abstract long i();

    public abstract long j();
}
