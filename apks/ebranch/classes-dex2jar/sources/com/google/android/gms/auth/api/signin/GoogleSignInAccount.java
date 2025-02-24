package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.getNoTelpKontakPengirim;
import o.getSaranaPembayaranPengirim;
import o.setFotoPribadi;
import o.setHmAddress;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@Deprecated
/* loaded from: classes-dex2jar.jar:com/google/android/gms/auth/api/signin/GoogleSignInAccount.class */
public class GoogleSignInAccount extends setFotoPribadi implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new Parcelable.Creator() { // from class: o.realmGet$debitCardType
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            int a2 = SafeParcelReader.a(parcel);
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Uri uri = null;
            String str5 = null;
            String str6 = null;
            ArrayList arrayList = null;
            String str7 = null;
            String str8 = null;
            long j = 0;
            int i = 0;
            while (parcel.dataPosition() < a2) {
                int b = SafeParcelReader.b(parcel);
                switch (SafeParcelReader.b(b)) {
                    case 1:
                        i = SafeParcelReader.k(parcel, b);
                        break;
                    case 2:
                        str = SafeParcelReader.b(parcel, b);
                        break;
                    case 3:
                        str2 = SafeParcelReader.b(parcel, b);
                        break;
                    case 4:
                        str3 = SafeParcelReader.b(parcel, b);
                        break;
                    case 5:
                        str4 = SafeParcelReader.b(parcel, b);
                        break;
                    case 6:
                        uri = (Uri) SafeParcelReader.b(parcel, b, Uri.CREATOR);
                        break;
                    case 7:
                        str5 = SafeParcelReader.b(parcel, b);
                        break;
                    case 8:
                        j = SafeParcelReader.r(parcel, b);
                        break;
                    case 9:
                        str6 = SafeParcelReader.b(parcel, b);
                        break;
                    case 10:
                        arrayList = SafeParcelReader.c(parcel, b, Scope.CREATOR);
                        break;
                    case 11:
                        str7 = SafeParcelReader.b(parcel, b);
                        break;
                    case 12:
                        str8 = SafeParcelReader.b(parcel, b);
                        break;
                    default:
                        SafeParcelReader.p(parcel, b);
                        break;
                }
            }
            SafeParcelReader.d(parcel, a2);
            return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new GoogleSignInAccount[i];
        }
    };
    public static final getNoTelpKontakPengirim a = getSaranaPembayaranPengirim.d;
    final int b;
    private final String c;
    final List d;
    private final String e;
    private final long f;
    private final String g;
    private final String h;
    private String i;
    private final Uri j;
    private final String k;
    private final String m;
    private final Set n = new HashSet();

    /* renamed from: o */
    private final String f68o;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.b = i;
        this.c = str;
        this.e = str2;
        this.h = str3;
        this.g = str4;
        this.j = uri;
        this.i = str5;
        this.f = j;
        this.f68o = str6;
        this.d = list;
        this.m = str7;
        this.k = str8;
    }

    public static GoogleSignInAccount a(String str) throws JSONException {
        boolean isEmpty = TextUtils.isEmpty(str);
        String str2 = null;
        if (isEmpty) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        long longValue = Long.valueOf(parseLong).longValue();
        if (!TextUtils.isEmpty(string)) {
            GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, longValue, string, new ArrayList(hashSet), optString6, optString7);
            if (jSONObject.has("serverAuthCode")) {
                str2 = jSONObject.optString("serverAuthCode");
            }
            googleSignInAccount.i = str2;
            return googleSignInAccount;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public final Account d() {
        String str = this.h;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public final Set<Scope> e() {
        HashSet hashSet = new HashSet(this.d);
        hashSet.addAll(this.n);
        return hashSet;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f68o.equals(this.f68o)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.d);
        hashSet.addAll(googleSignInAccount.n);
        HashSet hashSet2 = new HashSet(this.d);
        hashSet2.addAll(this.n);
        return hashSet.equals(hashSet2);
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = this.f68o.hashCode();
        HashSet hashSet = new HashSet(this.d);
        hashSet.addAll(this.n);
        return ((hashCode + 527) * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        int i2 = this.b;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        String str = this.c;
        if (str != null) {
            parcel.writeInt(-65534);
            parcel.writeInt(0);
            int dataPosition2 = parcel.dataPosition();
            parcel.writeString(str);
            int dataPosition3 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition2 - 4);
            parcel.writeInt(dataPosition3 - dataPosition2);
            parcel.setDataPosition(dataPosition3);
        }
        String str2 = this.e;
        if (str2 != null) {
            parcel.writeInt(-65533);
            parcel.writeInt(0);
            int dataPosition4 = parcel.dataPosition();
            parcel.writeString(str2);
            int dataPosition5 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition4 - 4);
            parcel.writeInt(dataPosition5 - dataPosition4);
            parcel.setDataPosition(dataPosition5);
        }
        String str3 = this.h;
        if (str3 != null) {
            parcel.writeInt(-65532);
            parcel.writeInt(0);
            int dataPosition6 = parcel.dataPosition();
            parcel.writeString(str3);
            int dataPosition7 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition6 - 4);
            parcel.writeInt(dataPosition7 - dataPosition6);
            parcel.setDataPosition(dataPosition7);
        }
        String str4 = this.g;
        if (str4 != null) {
            parcel.writeInt(-65531);
            parcel.writeInt(0);
            int dataPosition8 = parcel.dataPosition();
            parcel.writeString(str4);
            int dataPosition9 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition8 - 4);
            parcel.writeInt(dataPosition9 - dataPosition8);
            parcel.setDataPosition(dataPosition9);
        }
        Uri uri = this.j;
        if (uri != null) {
            parcel.writeInt(-65530);
            parcel.writeInt(0);
            int dataPosition10 = parcel.dataPosition();
            uri.writeToParcel(parcel, i);
            int dataPosition11 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition10 - 4);
            parcel.writeInt(dataPosition11 - dataPosition10);
            parcel.setDataPosition(dataPosition11);
        }
        String str5 = this.i;
        if (str5 != null) {
            parcel.writeInt(-65529);
            parcel.writeInt(0);
            int dataPosition12 = parcel.dataPosition();
            parcel.writeString(str5);
            int dataPosition13 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition12 - 4);
            parcel.writeInt(dataPosition13 - dataPosition12);
            parcel.setDataPosition(dataPosition13);
        }
        long j = this.f;
        parcel.writeInt(524296);
        parcel.writeLong(j);
        String str6 = this.f68o;
        if (str6 != null) {
            parcel.writeInt(-65527);
            parcel.writeInt(0);
            int dataPosition14 = parcel.dataPosition();
            parcel.writeString(str6);
            int dataPosition15 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition14 - 4);
            parcel.writeInt(dataPosition15 - dataPosition14);
            parcel.setDataPosition(dataPosition15);
        }
        setHmAddress.a(parcel, 10, this.d, false);
        String str7 = this.m;
        if (str7 != null) {
            parcel.writeInt(-65525);
            parcel.writeInt(0);
            int dataPosition16 = parcel.dataPosition();
            parcel.writeString(str7);
            int dataPosition17 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition16 - 4);
            parcel.writeInt(dataPosition17 - dataPosition16);
            parcel.setDataPosition(dataPosition17);
        }
        String str8 = this.k;
        if (str8 != null) {
            parcel.writeInt(-65524);
            parcel.writeInt(0);
            int dataPosition18 = parcel.dataPosition();
            parcel.writeString(str8);
            int dataPosition19 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition18 - 4);
            parcel.writeInt(dataPosition19 - dataPosition18);
            parcel.setDataPosition(dataPosition19);
        }
        int dataPosition20 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition - 4);
        parcel.writeInt(dataPosition20 - dataPosition);
        parcel.setDataPosition(dataPosition20);
    }
}
