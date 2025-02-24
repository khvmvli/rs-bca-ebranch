package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzkn;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import o.realmGet;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/setAccounts.class */
public final class setAccounts extends realmSet$isMember {
    public setAccounts(realmSet$kirimanUangs realmset_kirimanuangs) {
        super(realmset_kirimanuangs);
    }

    private static final String a(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v2, types: [long] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static java.util.List<java.lang.Long> a(java.util.BitSet r6) {
        /*
            r0 = r6
            int r0 = r0.length()
            r1 = 63
            int r0 = r0 + r1
            r1 = 64
            int r0 = r0 / r1
            r7 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r8 = r0
            r0 = 0
            r9 = r0
        L_0x0016:
            r0 = r9
            r1 = r7
            if (r0 >= r1) goto L_0x006d
            r0 = 0
            r10 = r0
            r0 = 0
            r12 = r0
        L_0x0021:
            r0 = r12
            r1 = 64
            if (r0 >= r1) goto L_0x005d
            r0 = r9
            r1 = 64
            int r0 = r0 * r1
            r1 = r12
            int r0 = r0 + r1
            r13 = r0
            r0 = r13
            r1 = r6
            int r1 = r1.length()
            if (r0 < r1) goto L_0x003d
            goto L_0x005d
        L_0x003d:
            r0 = r10
            r14 = r0
            r0 = r6
            r1 = r13
            boolean r0 = r0.get(r1)
            if (r0 == 0) goto L_0x0053
            r0 = r10
            r1 = 1
            r2 = r12
            long r1 = r1 << r2
            long r0 = r0 | r1
            r14 = r0
        L_0x0053:
            int r12 = r12 + 1
            r0 = r14
            r10 = r0
            goto L_0x0021
        L_0x005d:
            r0 = r8
            r1 = r10
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.add(r1)
            int r9 = r9 + 1
            goto L_0x0016
        L_0x006d:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAccounts.a(java.util.BitSet):java.util.List");
    }

    public static <Builder extends realmGet.cardGroupType> Builder a(Builder builder, byte[] bArr) throws zzkn {
        setEmergencyContactPhoneNumber a = setEmergencyContactPhoneNumber.a();
        return a != null ? (Builder) builder.d(bArr, a) : (Builder) builder.a(bArr);
    }

    private final void a(StringBuilder sb, int i, realmGet.flagReferalCode flagreferalcode) {
        if (flagreferalcode != null) {
            c(sb, i);
            sb.append("filter {\n");
            if (flagreferalcode.h()) {
                e(sb, i, "complement", Boolean.valueOf(flagreferalcode.i()));
            }
            if (flagreferalcode.f()) {
                e(sb, i, "param_name", this.q.w().c(flagreferalcode.j()));
            }
            if (flagreferalcode.d()) {
                int i2 = i + 1;
                realmGet.identityCardNumber c = flagreferalcode.c();
                if (c != null) {
                    c(sb, i2);
                    sb.append("string_filter {\n");
                    if (c.d()) {
                        e(sb, i2, "match_type", c.e().name());
                    }
                    if (c.c()) {
                        e(sb, i2, "expression", c.h());
                    }
                    if (c.i()) {
                        e(sb, i2, "case_sensitive", Boolean.valueOf(c.j()));
                    }
                    if (c.f() > 0) {
                        c(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String str : c.g()) {
                            c(sb, i2 + 2);
                            sb.append(str);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    c(sb, i2);
                    sb.append("}\n");
                }
            }
            if (flagreferalcode.a()) {
                e(sb, i + 1, "number_filter", flagreferalcode.g());
            }
            c(sb, i);
            sb.append("}\n");
        }
    }

    public static final void a(realmSet.autodebetAccountNumber autodebetaccountnumber, String str, Object obj) {
        List a = autodebetaccountnumber.a();
        int i = 0;
        while (true) {
            if (i >= a.size()) {
                i = -1;
                break;
            } else if (str.equals(((realmSet.birthPlace) a.get(i)).d())) {
                break;
            } else {
                i++;
            }
        }
        realmGet.totalDependent c = realmSet.birthPlace.c();
        c.b(str);
        if (obj instanceof Long) {
            c.c(((Long) obj).longValue());
        } else if (obj instanceof String) {
            c.a((String) obj);
        } else if (obj instanceof Double) {
            c.d(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            c.d(b((Bundle[]) obj));
        }
        if (i >= 0) {
            autodebetaccountnumber.e(i, c);
        } else {
            autodebetaccountnumber.b(c);
        }
    }

    static List<realmSet.birthPlace> b(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                realmGet.totalDependent c = realmSet.birthPlace.c();
                for (String str : bundle.keySet()) {
                    realmGet.totalDependent c2 = realmSet.birthPlace.c();
                    c2.b(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        c2.c(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        c2.a((String) obj);
                    } else if (obj instanceof Double) {
                        c2.d(((Double) obj).doubleValue());
                    }
                    c.e(c2);
                }
                if (c.b() > 0) {
                    arrayList.add(c.v());
                }
            }
        }
        return arrayList;
    }

    public static boolean b(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static realmGet.tipeNasabah c(getCreditCardOptions getcreditcardoptions) {
        Bundle bundle = new Bundle();
        String str = "app";
        for (String str2 : getcreditcardoptions.c().keySet()) {
            Object e = getcreditcardoptions.e(str2);
            String str3 = str;
            if ("_o".equals(str2)) {
                str3 = str;
                if (e != null) {
                    str3 = e.toString();
                }
            }
            if (e == null) {
                bundle.putString(str2, null);
                str = str3;
            } else if (e instanceof Long) {
                bundle.putLong(str2, ((Long) e).longValue());
                str = str3;
            } else if (e instanceof Double) {
                bundle.putDouble(str2, ((Double) e).doubleValue());
                str = str3;
            } else {
                bundle.putString(str2, e.toString());
                str = str3;
            }
        }
        String c = realmSet$SenderName.c(getcreditcardoptions.a());
        String str4 = c;
        if (c == null) {
            str4 = getcreditcardoptions.a();
        }
        return new realmGet.tipeNasabah(str4, new realmGet.nomorRekening(bundle), str, getcreditcardoptions.d());
    }

    private static final void c(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static final void c(StringBuilder sb, int i, String str, realmSet.currCompanyPosition currcompanyposition) {
        if (currcompanyposition != null) {
            c(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (currcompanyposition.i() != 0) {
                c(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l : currcompanyposition.h()) {
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l);
                    i2++;
                }
                sb.append('\n');
            }
            if (currcompanyposition.d() != 0) {
                c(sb, 4);
                sb.append("status: ");
                int i3 = 0;
                for (Long l2 : currcompanyposition.c()) {
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i3++;
                }
                sb.append('\n');
            }
            if (currcompanyposition.g() != 0) {
                c(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i4 = 0;
                for (realmGet.referalCode referalcode : currcompanyposition.f()) {
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(referalcode.b() ? Integer.valueOf(referalcode.e()) : null);
                    sb.append(":");
                    sb.append(referalcode.c() ? Long.valueOf(referalcode.j()) : null);
                    i4++;
                }
                sb.append("}\n");
            }
            if (currcompanyposition.k() != 0) {
                c(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i5 = 0;
                for (realmSet.currOfficeBusinessField currofficebusinessfield : currcompanyposition.j()) {
                    if (i5 != 0) {
                        sb.append(", ");
                    }
                    sb.append(currofficebusinessfield.c() ? Integer.valueOf(currofficebusinessfield.e()) : null);
                    sb.append(": [");
                    int i6 = 0;
                    for (Long l3 : currofficebusinessfield.a()) {
                        long longValue = l3.longValue();
                        if (i6 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue);
                        i6++;
                    }
                    sb.append("]");
                    i5++;
                }
                sb.append("}\n");
            }
            c(sb, 3);
            sb.append("}\n");
        }
    }

    public static final Object d(realmGet.selectedCardOptions selectedcardoptions, String str) {
        realmSet.birthPlace e = e(selectedcardoptions, str);
        if (e == null) {
            return null;
        }
        if (e.b()) {
            return e.h();
        }
        if (e.i()) {
            return Long.valueOf(e.g());
        }
        if (e.k()) {
            return Double.valueOf(e.l());
        }
        if (e.n() <= 0) {
            return null;
        }
        List<realmSet.birthPlace> o2 = e.o();
        ArrayList arrayList = new ArrayList();
        for (realmSet.birthPlace birthplace : o2) {
            if (birthplace != null) {
                Bundle bundle = new Bundle();
                for (realmSet.birthPlace birthplace2 : birthplace.o()) {
                    if (birthplace2.b()) {
                        bundle.putString(birthplace2.d(), birthplace2.h());
                    } else if (birthplace2.i()) {
                        bundle.putLong(birthplace2.d(), birthplace2.g());
                    } else if (birthplace2.k()) {
                        bundle.putDouble(birthplace2.d(), birthplace2.l());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final boolean d(realmGet.tipeNasabah tipenasabah, setCreditCards setcreditcards) {
        setFotoKtp.b(tipenasabah);
        setFotoKtp.b(setcreditcards);
        return !TextUtils.isEmpty(setcreditcards.c) || !TextUtils.isEmpty(setcreditcards.s);
    }

    public static int e(realmSet.birthDate birthdate, String str) {
        for (int i = 0; i < birthdate.k(); i++) {
            if (str.equals(birthdate.i(i).b())) {
                return i;
            }
        }
        return -1;
    }

    public static final realmSet.birthPlace e(realmGet.selectedCardOptions selectedcardoptions, String str) {
        for (realmSet.birthPlace birthplace : selectedcardoptions.c()) {
            if (birthplace.d().equals(str)) {
                return birthplace;
            }
        }
        return null;
    }

    private static final void e(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            c(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append('\n');
        }
    }

    private static final void e(StringBuilder sb, int i, String str, realmGet.hmKelurahan hmkelurahan) {
        if (hmkelurahan != null) {
            c(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (hmkelurahan.e()) {
                e(sb, i, "comparison_type", hmkelurahan.d().name());
            }
            if (hmkelurahan.c()) {
                e(sb, i, "match_as_float", Boolean.valueOf(hmkelurahan.h()));
            }
            if (hmkelurahan.j()) {
                e(sb, i, "comparison_value", hmkelurahan.i());
            }
            if (hmkelurahan.g()) {
                e(sb, i, "min_comparison_value", hmkelurahan.f());
            }
            if (hmkelurahan.l()) {
                e(sb, i, "max_comparison_value", hmkelurahan.n());
            }
            c(sb, i);
            sb.append("}\n");
        }
    }

    private final void e(StringBuilder sb, int i, List<realmSet.birthPlace> list) {
        if (list != null) {
            int i2 = i + 1;
            for (realmSet.birthPlace birthplace : list) {
                if (birthplace != null) {
                    c(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    e(sb, i2, "name", birthplace.a() ? this.q.w().c(birthplace.d()) : null);
                    e(sb, i2, "string_value", birthplace.b() ? birthplace.h() : null);
                    e(sb, i2, "int_value", birthplace.i() ? Long.valueOf(birthplace.g()) : null);
                    if (birthplace.k()) {
                        d = Double.valueOf(birthplace.l());
                    }
                    e(sb, i2, "double_value", d);
                    if (birthplace.n() > 0) {
                        e(sb, i2, birthplace.o());
                    }
                    c(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    public static boolean e(List<Long> list, int i) {
        return i < list.size() * 64 && (list.get(i / 64).longValue() & (1 << (i % 64))) != 0;
    }

    public final String a(realmGet.flagCardKrisFlyer flagcardkrisflyer) {
        if (flagcardkrisflyer == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (flagcardkrisflyer.a()) {
            e(sb, 0, "filter_id", Integer.valueOf(flagcardkrisflyer.e()));
        }
        e(sb, 0, "event_name", this.q.w().b(flagcardkrisflyer.c()));
        String a = a(flagcardkrisflyer.j(), flagcardkrisflyer.m(), flagcardkrisflyer.n());
        if (!a.isEmpty()) {
            e(sb, 0, "filter_type", a);
        }
        if (flagcardkrisflyer.h()) {
            e(sb, 1, "event_count_filter", flagcardkrisflyer.i());
        }
        if (flagcardkrisflyer.f() > 0) {
            sb.append("  filters {\n");
            for (realmGet.flagReferalCode flagreferalcode : flagcardkrisflyer.g()) {
                a(sb, 2, flagreferalcode);
            }
        }
        c(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    public final String a(realmGet.hmKecamatan hmkecamatan) {
        if (hmkecamatan == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (hmkecamatan.d()) {
            e(sb, 0, "filter_id", Integer.valueOf(hmkecamatan.b()));
        }
        e(sb, 0, "property_name", this.q.w().e(hmkecamatan.c()));
        String a = a(hmkecamatan.j(), hmkecamatan.g(), hmkecamatan.h());
        if (!a.isEmpty()) {
            e(sb, 0, "filter_type", a);
        }
        a(sb, 1, hmkecamatan.i());
        sb.append("}\n");
        return sb.toString();
    }

    public final void a(realmSet.currOfficeExtensionNumber currofficeextensionnumber, Object obj) {
        setFotoKtp.b(obj);
        currofficeextensionnumber.b();
        currofficeextensionnumber.c();
        currofficeextensionnumber.a();
        if (obj instanceof String) {
            currofficeextensionnumber.c((String) obj);
        } else if (obj instanceof Long) {
            currofficeextensionnumber.e(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            currofficeextensionnumber.d(((Double) obj).doubleValue());
        } else {
            this.q.s_().b().e("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX WARN: Finally extract failed */
    final <T extends Parcelable> T b(byte[] bArr, Parcelable.Creator<T> creator) {
        Parcel obtain;
        if (bArr == null) {
            return null;
        }
        try {
            obtain = Parcel.obtain();
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                T createFromParcel = creator.createFromParcel(obtain);
                obtain.recycle();
                return createFromParcel;
            } catch (SafeParcelReader.ParseException e) {
                this.q.s_().b().b("Failed to load parcelable from buffer");
                obtain.recycle();
                return null;
            }
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final boolean b(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.q.q_().e() - j) > j2;
    }

    public final long c(byte[] bArr) {
        setFotoKtp.b(bArr);
        this.q.u().r_();
        MessageDigest d = setAcctNo.d();
        if (d != null) {
            return setAcctNo.d(d.digest(bArr));
        }
        this.q.s_().b().b("Failed to get MD5");
        return 0;
    }

    public final String d(realmSet.bcaDebitCardNumber bcadebitcardnumber) {
        if (bcadebitcardnumber == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (realmSet.bcaAccountNumber bcaaccountnumber : bcadebitcardnumber.b()) {
            if (bcaaccountnumber != null) {
                c(sb, 1);
                sb.append("bundle {\n");
                if (bcaaccountnumber.D()) {
                    e(sb, 1, "protocol_version", Integer.valueOf(bcaaccountnumber.L()));
                }
                e(sb, 1, "platform", bcaaccountnumber.Y());
                if (bcaaccountnumber.c()) {
                    e(sb, 1, "gmp_version", Long.valueOf(bcaaccountnumber.h()));
                }
                if (bcaaccountnumber.j()) {
                    e(sb, 1, "uploading_gmp_version", Long.valueOf(bcaaccountnumber.g()));
                }
                if (bcaaccountnumber.H()) {
                    e(sb, 1, "dynamite_version", Long.valueOf(bcaaccountnumber.I()));
                }
                if (bcaaccountnumber.v()) {
                    e(sb, 1, "config_version", Long.valueOf(bcaaccountnumber.C()));
                }
                e(sb, 1, "gmp_app_id", bcaaccountnumber.r());
                e(sb, 1, "admob_app_id", bcaaccountnumber.G());
                e(sb, 1, "app_id", bcaaccountnumber.a());
                e(sb, 1, "app_version", bcaaccountnumber.d());
                if (bcaaccountnumber.w()) {
                    e(sb, 1, "app_version_major", Integer.valueOf(bcaaccountnumber.u()));
                }
                e(sb, 1, "firebase_instance_id", bcaaccountnumber.x());
                if (bcaaccountnumber.l()) {
                    e(sb, 1, "dev_cert_hash", Long.valueOf(bcaaccountnumber.m()));
                }
                e(sb, 1, "app_store", bcaaccountnumber.ae());
                if (bcaaccountnumber.R()) {
                    e(sb, 1, "upload_timestamp_millis", Long.valueOf(bcaaccountnumber.Q()));
                }
                if (bcaaccountnumber.U()) {
                    e(sb, 1, "start_timestamp_millis", Long.valueOf(bcaaccountnumber.V()));
                }
                if (bcaaccountnumber.T()) {
                    e(sb, 1, "end_timestamp_millis", Long.valueOf(bcaaccountnumber.W()));
                }
                if (bcaaccountnumber.X()) {
                    e(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(bcaaccountnumber.ab()));
                }
                if (bcaaccountnumber.ac()) {
                    e(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(bcaaccountnumber.Z()));
                }
                e(sb, 1, "app_instance_id", bcaaccountnumber.n());
                e(sb, 1, "resettable_device_id", bcaaccountnumber.i());
                e(sb, 1, "ds_id", bcaaccountnumber.B());
                if (bcaaccountnumber.f()) {
                    e(sb, 1, "limited_ad_tracking", Boolean.valueOf(bcaaccountnumber.o()));
                }
                e(sb, 1, "os_version", bcaaccountnumber.aa());
                e(sb, 1, "device_model", bcaaccountnumber.af());
                e(sb, 1, "user_default_language", bcaaccountnumber.ag());
                if (bcaaccountnumber.ad()) {
                    e(sb, 1, "time_zone_offset_minutes", Integer.valueOf(bcaaccountnumber.ah()));
                }
                if (bcaaccountnumber.k()) {
                    e(sb, 1, "bundle_sequential_index", Integer.valueOf(bcaaccountnumber.q()));
                }
                if (bcaaccountnumber.t()) {
                    e(sb, 1, "service_upload", Boolean.valueOf(bcaaccountnumber.s()));
                }
                e(sb, 1, "health_monitor", bcaaccountnumber.p());
                if (!this.q.t().c((String) null, realmSet.hasDone.ab) && bcaaccountnumber.A() && bcaaccountnumber.z() != 0) {
                    e(sb, 1, "android_id", Long.valueOf(bcaaccountnumber.z()));
                }
                if (bcaaccountnumber.E()) {
                    e(sb, 1, "retry_counter", Integer.valueOf(bcaaccountnumber.F()));
                }
                if (bcaaccountnumber.N()) {
                    e(sb, 1, "consent_signals", bcaaccountnumber.M());
                }
                List<realmSet.currOfficeCity> O = bcaaccountnumber.O();
                if (O != null) {
                    for (realmSet.currOfficeCity currofficecity : O) {
                        if (currofficecity != null) {
                            c(sb, 2);
                            sb.append("user_property {\n");
                            e(sb, 2, "set_timestamp_millis", currofficecity.d() ? Long.valueOf(currofficecity.c()) : null);
                            e(sb, 2, "name", this.q.w().e(currofficecity.b()));
                            e(sb, 2, "string_value", currofficecity.h());
                            e(sb, 2, "int_value", currofficecity.i() ? Long.valueOf(currofficecity.j()) : null);
                            e(sb, 2, "double_value", currofficecity.g() ? Double.valueOf(currofficecity.m()) : null);
                            c(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<realmGet.referenceBranchCode> y = bcaaccountnumber.y();
                if (y != null) {
                    for (realmGet.referenceBranchCode referencebranchcode : y) {
                        if (referencebranchcode != null) {
                            c(sb, 2);
                            sb.append("audience_membership {\n");
                            if (referencebranchcode.d()) {
                                e(sb, 2, "audience_id", Integer.valueOf(referencebranchcode.c()));
                            }
                            if (referencebranchcode.g()) {
                                e(sb, 2, "new_audience", Boolean.valueOf(referencebranchcode.f()));
                            }
                            c(sb, 2, "current_data", referencebranchcode.e());
                            if (referencebranchcode.h()) {
                                c(sb, 2, "previous_data", referencebranchcode.j());
                            }
                            c(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<realmGet.selectedCardOptions> K = bcaaccountnumber.K();
                if (K != null) {
                    for (realmGet.selectedCardOptions selectedcardoptions : K) {
                        if (selectedcardoptions != null) {
                            c(sb, 2);
                            sb.append("event {\n");
                            e(sb, 2, "name", this.q.w().b(selectedcardoptions.e()));
                            if (selectedcardoptions.j()) {
                                e(sb, 2, "timestamp_millis", Long.valueOf(selectedcardoptions.f()));
                            }
                            if (selectedcardoptions.g()) {
                                e(sb, 2, "previous_timestamp_millis", Long.valueOf(selectedcardoptions.i()));
                            }
                            if (selectedcardoptions.h()) {
                                e(sb, 2, "count", Integer.valueOf(selectedcardoptions.k()));
                            }
                            if (selectedcardoptions.a() != 0) {
                                e(sb, 2, selectedcardoptions.c());
                            }
                            c(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                c(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    public final List<Long> e(List<Long> list, List<Integer> list2) {
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                this.q.s_().c().e("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.q.s_().c().a("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ -1)));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (size2 >= 0 && ((Long) arrayList.get(size2)).longValue() == 0) {
            size2--;
            size = size2;
        }
        return arrayList.subList(0, size);
    }

    public final realmGet.selectedCardOptions e(realmGet.sumberDana sumberdana) {
        realmSet.autodebetAccountNumber d = realmGet.selectedCardOptions.d();
        d.d(sumberdana.a);
        realmGet.tanggalJatuhTempo tanggaljatuhtempo = new realmGet.tanggalJatuhTempo(sumberdana.j);
        while (tanggaljatuhtempo.hasNext()) {
            String e = tanggaljatuhtempo.e();
            realmGet.totalDependent c = realmSet.birthPlace.c();
            c.b(e);
            Object d2 = sumberdana.j.d(e);
            setFotoKtp.b(d2);
            e(c, d2);
            d.b(c);
        }
        return d.v();
    }

    public final void e(realmGet.totalDependent totaldependent, Object obj) {
        setFotoKtp.b(obj);
        totaldependent.a();
        totaldependent.d();
        totaldependent.c();
        totaldependent.e();
        if (obj instanceof String) {
            totaldependent.a((String) obj);
        } else if (obj instanceof Long) {
            totaldependent.c(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            totaldependent.d(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            totaldependent.d(b((Bundle[]) obj));
        } else {
            this.q.s_().b().e("Ignoring invalid (type) event param value", obj);
        }
    }

    public final byte[] e(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.q.s_().b().e("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // o.realmSet$isMember
    protected final boolean n() {
        return false;
    }
}
