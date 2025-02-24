package o;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.facebook.stetho.common.Utf8Charset;
import com.google.gson.JsonParseException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import o.Page6KLFragment;
import o.StockListBNResponse$MediaBrowserCompat$CustomActionResultReceiver;
import o.SubmitBankNotesResponse;
import o.setNotes;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
/* loaded from: classes-dex2jar.jar:o/StockListBNResponse.class */
public final class StockListBNResponse extends IntentService {
    public static final write d = new write((byte) 0);

    /* loaded from: classes-dex2jar.jar:o/StockListBNResponse$IconCompatParcelizer.class */
    static final class IconCompatParcelizer extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp>, Object> {
        int c;

        IconCompatParcelizer(ProsesTarikanFragment<? super IconCompatParcelizer> prosesTarikanFragment) {
            super(2, prosesTarikanFragment);
        }

        public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
            return new IconCompatParcelizer(prosesTarikanFragment);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp> prosesTarikanFragment) {
            return create(inquiryLoadDataSetunPresenter, prosesTarikanFragment).invokeSuspend(onCLickStatusNpwp.e);
        }

        public final Object invokeSuspend(Object obj) {
            ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.e;
            int i = this.c;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else if (obj instanceof Page6KLFragment.IconCompatParcelizer) {
                    throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
                }
            } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
                KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable kategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable = KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e;
                this.c = 1;
                if (KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.c().b((ProsesTarikanFragment) this) == reviewSetoranFragment_ViewBinding) {
                    return reviewSetoranFragment_ViewBinding;
                }
            } else {
                throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
            }
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/StockListBNResponse$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp>, Object> {
        int c;

        RemoteActionCompatParcelizer(ProsesTarikanFragment<? super RemoteActionCompatParcelizer> prosesTarikanFragment) {
            super(2, prosesTarikanFragment);
        }

        public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
            return new RemoteActionCompatParcelizer(prosesTarikanFragment);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp> prosesTarikanFragment) {
            return create(inquiryLoadDataSetunPresenter, prosesTarikanFragment).invokeSuspend(onCLickStatusNpwp.e);
        }

        public final Object invokeSuspend(Object obj) {
            ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.e;
            int i = this.c;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else if (obj instanceof Page6KLFragment.IconCompatParcelizer) {
                    throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
                }
            } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
                KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable kategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable = KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e;
                this.c = 1;
                if (KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.b().d((ProsesTarikanFragment) this) == reviewSetoranFragment_ViewBinding) {
                    return reviewSetoranFragment_ViewBinding;
                }
            } else {
                throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
            }
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/StockListBNResponse$StockBranch.class */
    public final class StockBranch {
        public static final StockBranch d = new StockBranch();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes-dex2jar.jar:o/StockListBNResponse$StockBranch$write.class */
        public static final class write extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, CharSequence> {
            public static final write d = new write();

            write() {
                super(1);
            }

            @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
            public final /* synthetic */ CharSequence a(String str) {
                String str2 = str;
                String str3 = "";
                subscribeReservationRescheduleEvent.e(str2, "");
                List<String> d2 = CheckOTPSessionPresenter.d((CharSequence) str2, new String[]{"="}, false, 0);
                String str4 = d2.get(0);
                if (d2.size() > 1) {
                    str3 = URLDecoder.decode(d2.get(1), Utf8Charset.NAME);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append(": ");
                sb.append(str3);
                return sb.toString();
            }
        }

        private StockBranch() {
        }

        public static String a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            try {
                DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
                subscribeReservationRescheduleEvent.d(newInstance, "");
                newInstance.setExpandEntityReferences(false);
                DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
                subscribeReservationRescheduleEvent.d(newDocumentBuilder, "");
                Charset defaultCharset = Charset.defaultCharset();
                subscribeReservationRescheduleEvent.d(defaultCharset, "");
                byte[] bytes = str.getBytes(defaultCharset);
                subscribeReservationRescheduleEvent.d(bytes, "");
                Document parse = newDocumentBuilder.parse(new InputSource(new ByteArrayInputStream(bytes)));
                subscribeReservationRescheduleEvent.d(parse, "");
                DOMSource dOMSource = new DOMSource(parse);
                StringWriter stringWriter = new StringWriter();
                StreamResult streamResult = new StreamResult(stringWriter);
                TransformerFactory newInstance2 = TransformerFactory.newInstance();
                newInstance2.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
                Transformer newTransformer = newInstance2.newTransformer();
                newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                newTransformer.setOutputProperty("indent", "yes");
                newTransformer.transform(dOMSource, streamResult);
                String obj = stringWriter.toString();
                subscribeReservationRescheduleEvent.d(obj, "");
                str = obj;
            } catch (IOException | TransformerException | SAXParseException e) {
            }
            return str;
        }

        public static String b(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            try {
                BN5PilihRekeningFragment_ViewBinding d2 = backEvent.d(new StringReader(str));
                SubmitBankNotesResponse.SubmitBankNotesDataOutput submitBankNotesDataOutput = SubmitBankNotesResponse.SubmitBankNotesDataOutput.b;
                String b = SubmitBankNotesResponse.SubmitBankNotesDataOutput.c().b(d2);
                subscribeReservationRescheduleEvent.d(b, "");
                str = b;
            } catch (JsonParseException e) {
            }
            return str;
        }

        public static String c(long j, boolean z) {
            if (j < 1000) {
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append(" B");
                return sb.toString();
            }
            double d2 = (double) j;
            int log = (int) (Math.log(d2) / Math.log(1000.0d));
            char charAt = "kMGTPE".charAt(log - 1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charAt);
            sb2.append("");
            String obj = sb2.toString();
            subscriberLoadDraftKirimanUangEvent subscriberloaddraftkirimanuangevent = subscriberLoadDraftKirimanUangEvent.d;
            String format = String.format(Locale.US, "%.1f %sB", Arrays.copyOf(new Object[]{Double.valueOf(d2 / Math.pow(1000.0d, (double) log)), obj}, 2));
            subscribeReservationRescheduleEvent.d(format, "");
            return format;
        }

        public static String d(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            if (CheckOTPSessionPresenter.a(str)) {
                return str;
            }
            str = onClickUbahDataAlamatIdentitas.c(CheckOTPSessionPresenter.d((CharSequence) str, new String[]{"&"}, false, 0), "\n", null, null, 0, null, write.d, 30);
            return str;
        }

        public static String d(List<GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable> list, boolean z) {
            String str = "";
            if (list != null) {
                str = onClickUbahDataAlamatIdentitas.c(list, "", null, null, 0, null, new StockListBNResponse$StockBranch$MediaBrowserCompat$CustomActionResultReceiver(z), 30);
                if (str == null) {
                    str = "";
                }
            }
            return str;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/StockListBNResponse$write.class */
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public StockListBNResponse() {
        super("Chucker-ClearDatabaseService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("EXTRA_ITEM_TO_CLEAR") : null;
        if (serializableExtra instanceof StockListBNResponse$MediaBrowserCompat$CustomActionResultReceiver.read) {
            KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable kategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable = KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e;
            Context applicationContext = getApplicationContext();
            subscribeReservationRescheduleEvent.d(applicationContext, "");
            KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e(applicationContext);
            GetAreaPresenter.a(LoginPresenter.e(ReservasiListChosenPresenter.a()), (ProsesTarikanFragment_ViewBinding) null, (KategoriTujuanTransaksiORPresenter) null, new IconCompatParcelizer(null), 3);
            setNotes.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setNotes.c;
            synchronized (setNotes.d()) {
                setNotes.d().clear();
                setNotes.b().clear();
                onCLickStatusNpwp onclickstatusnpwp = onCLickStatusNpwp.e;
            }
            new setNotes(this).d.cancel(1138);
        } else if (serializableExtra instanceof StockListBNResponse$MediaBrowserCompat$CustomActionResultReceiver.write) {
            KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable kategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable2 = KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e;
            Context applicationContext2 = getApplicationContext();
            subscribeReservationRescheduleEvent.d(applicationContext2, "");
            KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e(applicationContext2);
            GetAreaPresenter.a(LoginPresenter.e(ReservasiListChosenPresenter.a()), (ProsesTarikanFragment_ViewBinding) null, (KategoriTujuanTransaksiORPresenter) null, new RemoteActionCompatParcelizer(null), 3);
            new setNotes(this).d.cancel(3546);
        }
    }
}
