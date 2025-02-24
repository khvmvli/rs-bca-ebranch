package o;

import com.bca.smartbranch.data.localdb.Warkat;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.realm.RealmFieldType;
import io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxy;
import io.realm.internal.ColumnInfo;
import java.io.IOException;
import o.GetTxnTellerDetailResponse;
/* loaded from: classes-dex2jar.jar:o/CC21AFormKartuKreditFragment.class */
public final class CC21AFormKartuKreditFragment implements onDismissUpdateDaftarTransfer {
    private static final subscribeChooseSubBCACardEvent e = new subscribeChooseSubBCACardEvent();
    private static final CC21CFormKartuKreditFragment a = new CC21CFormKartuKreditFragment();

    @Override // o.onDismissUpdateDaftarTransfer
    public final <T> BN5VerifikasiOTPFragment_ViewBinding<T> e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, showPekerjaanDialog<T> showpekerjaandialog) {
        if (RealmFieldType.class.isAssignableFrom(showpekerjaandialog.d)) {
            return new Page6GLFragment(bN5PilihNomorOTPFragment_ViewBinding, e, a);
        }
        if (showpekerjaandialog.d == com_bca_smartbranch_data_localdb_WarkatRealmProxy.WarkatColumnInfo.class) {
            return new Page6GLFragment_ViewBinding(bN5PilihNomorOTPFragment_ViewBinding, e, a);
        }
        if (showpekerjaandialog.d == com_bca_smartbranch_data_localdb_WarkatRealmProxy.class) {
            return new Page6HLFragment(bN5PilihNomorOTPFragment_ViewBinding, e, a);
        }
        if (showpekerjaandialog.d == GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable.class) {
            return new GetTxnTellerDetailResponse.TxnDetail.WarkatTunda(bN5PilihNomorOTPFragment_ViewBinding, e, a);
        }
        if (showpekerjaandialog.d == PenggantianKartuATMActivity.class) {
            return new PilihBankPenerbitActivity(bN5PilihNomorOTPFragment_ViewBinding, e, a);
        }
        if (showpekerjaandialog.d == ColumnInfo.ColumnDetails.class) {
            return new onClickKecamatan(bN5PilihNomorOTPFragment_ViewBinding, e, a);
        }
        if (showpekerjaandialog.d == Warkat.class) {
            return new CC20FormKartuKreditFragment_ViewBinding(bN5PilihNomorOTPFragment_ViewBinding, e, a) { // from class: o.DaftarTransferBTAdapter$DaftarTransferORVH_ViewBinding
                private CC21BFormKartuKreditFragment b;
                private CC21AFormKartuKreditFragment_ViewBinding c;
                private BN5PilihNomorOTPFragment_ViewBinding d;

                {
                    this.d = r4;
                    this.b = r5;
                    this.c = r6;
                }

                @Override // o.BN5VerifikasiOTPFragment_ViewBinding
                public final Object c(JsonReader jsonReader) throws IOException {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        return null;
                    }
                    Warkat warkat = new Warkat();
                    warkat.b(this.d, jsonReader, this.b);
                    return warkat;
                }

                @Override // o.BN5VerifikasiOTPFragment_ViewBinding
                public final void d(JsonWriter jsonWriter, Object obj) throws IOException {
                    if (obj == null) {
                        jsonWriter.nullValue();
                    } else {
                        ((Warkat) obj).c(this.d, jsonWriter, this.c);
                    }
                }
            };
        }
        return null;
    }
}
