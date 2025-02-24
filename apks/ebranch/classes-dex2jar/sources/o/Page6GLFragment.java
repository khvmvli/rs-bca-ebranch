package o;

import com.facebook.stetho.dumpapp.Framer;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.realm.RealmFieldType;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/Page6GLFragment.class */
public final class Page6GLFragment extends BN5VerifikasiOTPFragment_ViewBinding implements CC20FormKartuKreditFragment_ViewBinding {
    private CC21BFormKartuKreditFragment a;
    private CC21AFormKartuKreditFragment_ViewBinding b;
    private BN5PilihNomorOTPFragment_ViewBinding c;

    public Page6GLFragment(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, CC21BFormKartuKreditFragment cC21BFormKartuKreditFragment, CC21AFormKartuKreditFragment_ViewBinding cC21AFormKartuKreditFragment_ViewBinding) {
        this.c = bN5PilihNomorOTPFragment_ViewBinding;
        this.a = cC21BFormKartuKreditFragment;
        this.b = cC21AFormKartuKreditFragment_ViewBinding;
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final Object c(JsonReader jsonReader) throws IOException {
        switch (this.a.b(jsonReader)) {
            case 2:
                return RealmFieldType.INTEGER_LIST;
            case 3:
                return RealmFieldType.STRING_TO_LINK_MAP;
            case 4:
                return RealmFieldType.STRING_TO_DECIMAL128_MAP;
            case 5:
                return RealmFieldType.STRING;
            case 6:
            case 7:
            case 12:
            case 13:
            case 15:
            case 16:
            case 18:
            case 21:
            case 29:
            case Framer.ENTER_FRAME_PREFIX:
            case 34:
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
            case 39:
            case 43:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S:
            case 57:
            case 59:
            case 61:
            case 64:
            case 68:
            case 72:
            case 75:
            case 76:
            case 77:
            case 79:
            case 81:
            default:
                return null;
            case 8:
                return RealmFieldType.DATE_LIST;
            case 9:
                return RealmFieldType.UUID_LIST;
            case 10:
                return RealmFieldType.MIXED;
            case 11:
                return RealmFieldType.DECIMAL128;
            case 14:
                return RealmFieldType.MIXED_LIST;
            case 17:
                return RealmFieldType.STRING_TO_MIXED_MAP;
            case 19:
                return RealmFieldType.STRING_TO_INTEGER_MAP;
            case 20:
                return RealmFieldType.STRING_LIST;
            case 22:
                return RealmFieldType.BINARY_LIST;
            case 23:
                return RealmFieldType.DATE_SET;
            case 24:
                return RealmFieldType.STRING_TO_FLOAT_MAP;
            case 25:
                return RealmFieldType.DECIMAL128_LIST;
            case 26:
                return RealmFieldType.STRING_TO_BINARY_MAP;
            case 27:
                return RealmFieldType.STRING_TO_DOUBLE_MAP;
            case 28:
                return RealmFieldType.BINARY_SET;
            case 30:
                return RealmFieldType.BOOLEAN_SET;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
                return RealmFieldType.LINKING_OBJECTS;
            case 32:
                return RealmFieldType.INTEGER_SET;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
                return RealmFieldType.STRING_TO_STRING_MAP;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
                return RealmFieldType.BINARY;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC:
                return RealmFieldType.BOOLEAN_LIST;
            case 40:
                return RealmFieldType.BOOLEAN;
            case 41:
                return RealmFieldType.STRING_SET;
            case 42:
                return RealmFieldType.FLOAT_SET;
            case 44:
                return RealmFieldType.UUID_SET;
            case 53:
                return RealmFieldType.OBJECT_ID_SET;
            case 54:
                return RealmFieldType.DOUBLE;
            case 55:
                return RealmFieldType.OBJECT_ID;
            case 56:
                return RealmFieldType.LIST;
            case 58:
                return RealmFieldType.STRING_TO_OBJECT_ID_MAP;
            case 60:
                return RealmFieldType.DATE;
            case 62:
                return RealmFieldType.DOUBLE_LIST;
            case 63:
                return RealmFieldType.INTEGER;
            case 65:
                return RealmFieldType.STRING_TO_DATE_MAP;
            case 66:
                return RealmFieldType.OBJECT_ID_LIST;
            case 67:
                return RealmFieldType.STRING_TO_BOOLEAN_MAP;
            case 69:
                return RealmFieldType.FLOAT_LIST;
            case 70:
                return RealmFieldType.STRING_TO_UUID_MAP;
            case 71:
                return RealmFieldType.MIXED_SET;
            case 73:
                return RealmFieldType.OBJECT;
            case 74:
                return RealmFieldType.LINK_SET;
            case 78:
                return RealmFieldType.DECIMAL128_SET;
            case 80:
                return RealmFieldType.FLOAT;
            case 82:
                return RealmFieldType.TYPED_LINK;
            case 83:
                return RealmFieldType.UUID;
            case 84:
                return RealmFieldType.DOUBLE_SET;
        }
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final void d(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.b.b(jsonWriter, obj == RealmFieldType.STRING_LIST ? 38 : obj == RealmFieldType.BOOLEAN_SET ? 80 : obj == RealmFieldType.MIXED ? 37 : obj == RealmFieldType.STRING_TO_BOOLEAN_MAP ? 18 : obj == RealmFieldType.BINARY_SET ? 84 : obj == RealmFieldType.BOOLEAN_LIST ? 33 : obj == RealmFieldType.DECIMAL128_SET ? 48 : obj == RealmFieldType.UUID_SET ? 83 : obj == RealmFieldType.DATE_LIST ? 39 : obj == RealmFieldType.DECIMAL128_LIST ? 40 : obj == RealmFieldType.STRING_TO_DATE_MAP ? 59 : obj == RealmFieldType.LINK_SET ? 55 : obj == RealmFieldType.UUID ? 46 : obj == RealmFieldType.INTEGER ? 4 : obj == RealmFieldType.INTEGER_SET ? 42 : obj == RealmFieldType.DATE_SET ? 67 : obj == RealmFieldType.STRING_TO_LINK_MAP ? 2 : obj == RealmFieldType.STRING_TO_STRING_MAP ? 30 : obj == RealmFieldType.UUID_LIST ? 81 : obj == RealmFieldType.OBJECT ? 72 : obj == RealmFieldType.BOOLEAN ? 50 : obj == RealmFieldType.STRING_SET ? 31 : obj == RealmFieldType.DATE ? 16 : obj == RealmFieldType.INTEGER_LIST ? 71 : obj == RealmFieldType.STRING_TO_UUID_MAP ? 35 : obj == RealmFieldType.DOUBLE_SET ? 79 : obj == RealmFieldType.LIST ? 7 : obj == RealmFieldType.DECIMAL128 ? 76 : obj == RealmFieldType.OBJECT_ID_LIST ? 23 : obj == RealmFieldType.FLOAT ? 28 : obj == RealmFieldType.STRING_TO_BINARY_MAP ? 29 : obj == RealmFieldType.OBJECT_ID_SET ? 51 : obj == RealmFieldType.MIXED_SET ? 64 : obj == RealmFieldType.BINARY ? 15 : obj == RealmFieldType.FLOAT_LIST ? 56 : obj == RealmFieldType.STRING_TO_MIXED_MAP ? 60 : obj == RealmFieldType.OBJECT_ID ? 75 : obj == RealmFieldType.STRING_TO_DOUBLE_MAP ? 43 : obj == RealmFieldType.DOUBLE ? 74 : obj == RealmFieldType.LINKING_OBJECTS ? 45 : obj == RealmFieldType.STRING_TO_FLOAT_MAP ? 36 : obj == RealmFieldType.DOUBLE_LIST ? 77 : obj == RealmFieldType.FLOAT_SET ? 54 : obj == RealmFieldType.STRING_TO_INTEGER_MAP ? 12 : obj == RealmFieldType.MIXED_LIST ? 19 : obj == RealmFieldType.BINARY_LIST ? 26 : obj == RealmFieldType.TYPED_LINK ? 66 : obj == RealmFieldType.STRING ? 58 : obj == RealmFieldType.STRING_TO_DECIMAL128_MAP ? 0 : obj == RealmFieldType.STRING_TO_OBJECT_ID_MAP ? 61 : -1);
        }
    }
}
