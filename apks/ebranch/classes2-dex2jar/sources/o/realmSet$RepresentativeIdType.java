package o;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzd;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import o.realmGet;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/realmSet$RepresentativeIdType.class */
public final class realmSet$RepresentativeIdType extends realmSet$nameTransaksi {
    private Boolean b;
    private final realmSet$kirimanUangs c;
    private String d = null;

    public realmSet$RepresentativeIdType(realmSet$kirimanUangs realmset_kirimanuangs, String str) {
        setFotoKtp.b(realmset_kirimanuangs);
        this.c = realmset_kirimanuangs;
    }

    private final void b(setCreditCards setcreditcards, boolean z) {
        setFotoKtp.b(setcreditcards);
        setFotoKtp.c(setcreditcards.d);
        e(setcreditcards.d, false);
        this.c.y().d(setcreditcards.c, setcreditcards.s, setcreditcards.v);
    }

    private final void e(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.b == null) {
                        if (!"com.google.android.gms".equals(this.d) && !getTipeNasabahPengirim.b(this.c.t_(), Binder.getCallingUid()) && !realmGet.kitasKitapFlag.e(this.c.t_()).d(Binder.getCallingUid())) {
                            z2 = false;
                            this.b = Boolean.valueOf(z2);
                        }
                        z2 = true;
                        this.b = Boolean.valueOf(z2);
                    }
                    if (this.b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.c.s_().b().e("Measurement Service called with invalid calling package. appId", setIsInputAtmPemrek.d(str));
                    throw e;
                }
            }
            if (this.d == null && realmGet.lastEducation.uidHasPackageName(this.c.t_(), Binder.getCallingUid(), str)) {
                this.d = str;
            }
            if (!str.equals(this.d)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
            return;
        }
        this.c.s_().b().b("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final void e(realmGet.tipeNasabah tipenasabah, setCreditCards setcreditcards) {
        this.c.d();
        this.c.b(tipenasabah, setcreditcards);
    }

    public final /* synthetic */ void a(String str, Bundle bundle) {
        realmGet.nomorHp r = this.c.r();
        r.r_();
        r.v();
        byte[] am = r.h.t().e(new realmGet.sumberDana(r.q, "", str, "dep", 0, 0, bundle)).am();
        r.q.s_().i().a("Saving default event parameters, appId, data size", r.q.w().b(str), Integer.valueOf(am.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", am);
        try {
            if (r.r().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                r.q.s_().b().e("Failed to insert default event parameters (got -1). appId", setIsInputAtmPemrek.d(str));
            }
        } catch (SQLiteException e) {
            r.q.s_().b().a("Error storing default event parameters. appId", setIsInputAtmPemrek.d(str), e);
        }
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final void a(setCreditCards setcreditcards) {
        b(setcreditcards, false);
        c(new Runnable(setcreditcards) { // from class: o.realmSet$ReceiverAlias
            final /* synthetic */ setCreditCards d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.d = r5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                realmSet$RepresentativeIdType.this.c.d();
                realmSet$RepresentativeIdType.this.c.b(this.d);
            }
        });
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final List<getNomorHp> b(String str, String str2, String str3) {
        e(str, true);
        try {
            return (List) this.c.o_().b(new Callable<List<getNomorHp>>(str, str2, str3) { // from class: o.realmSet$FlagSameReceiverSenderData
                final /* synthetic */ String a;
                final /* synthetic */ String c;
                final /* synthetic */ String e;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = r5;
                    this.e = r6;
                    this.c = r7;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ List<getNomorHp> call() throws Exception {
                    realmSet$RepresentativeIdType.this.c.d();
                    return realmSet$RepresentativeIdType.this.c.r().b(this.a, this.e, this.c);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            this.c.s_().b().e("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    public final realmGet.tipeNasabah b(realmGet.tipeNasabah tipenasabah, setCreditCards setcreditcards) {
        realmGet.nomorRekening nomorrekening;
        if (!(!Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(tipenasabah.e) || (nomorrekening = tipenasabah.a) == null || nomorrekening.d() == 0)) {
            String a = tipenasabah.a.a("_cis");
            if ("referrer broadcast".equals(a) || "referrer API".equals(a)) {
                this.c.s_().g().e("Event has been filtered ", tipenasabah.toString());
                return new realmGet.tipeNasabah("_cmpx", tipenasabah.a, tipenasabah.d, tipenasabah.c);
            }
        }
        return tipenasabah;
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final void b(Bundle bundle, setCreditCards setcreditcards) {
        b(setcreditcards, false);
        String str = setcreditcards.d;
        setFotoKtp.b(str);
        c(new Runnable(this, str, bundle) { // from class: o.realmGet$TxnAmount
            private final realmSet$RepresentativeIdType b;
            private final Bundle c;
            private final String d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = r4;
                this.d = r5;
                this.c = r6;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.a(this.d, this.c);
            }
        });
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final void b(getNomorHp getnomorhp) {
        setFotoKtp.b(getnomorhp);
        setFotoKtp.b(getnomorhp.d);
        setFotoKtp.c(getnomorhp.e);
        e(getnomorhp.e, true);
        c(new Runnable(new getNomorHp(getnomorhp)) { // from class: o.realmGet$isLongForm
            final /* synthetic */ getNomorHp d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.d = r5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                realmSet$RepresentativeIdType.this.c.d();
                if (this.d.d.a() == null) {
                    realmSet$RepresentativeIdType.this.c.b(this.d);
                } else {
                    realmSet$RepresentativeIdType.this.c.c(this.d);
                }
            }
        });
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final void b(realmGet.tipeNasabah tipenasabah, String str, String str2) {
        setFotoKtp.b(tipenasabah);
        setFotoKtp.c(str);
        e(str, true);
        c(new Runnable(tipenasabah, str) { // from class: o.realmSet$RecurringVar
            final /* synthetic */ String a;
            final /* synthetic */ realmGet.tipeNasabah e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r5;
                this.a = r6;
            }

            @Override // java.lang.Runnable
            public final void run() {
                realmSet$RepresentativeIdType.this.c.d();
                realmSet$RepresentativeIdType.this.c.b(this.e, this.a);
            }
        });
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final void b(setCreditCards setcreditcards) {
        setFotoKtp.c(setcreditcards.d);
        setFotoKtp.b(setcreditcards.u);
        realmSet$FlagRepresentativeTransaction realmset_flagrepresentativetransaction = new Runnable(setcreditcards) { // from class: o.realmSet$FlagRepresentativeTransaction
            final /* synthetic */ setCreditCards b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = r5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                realmSet$RepresentativeIdType.this.c.d();
                realmSet$kirimanUangs realmset_kirimanuangs = realmSet$RepresentativeIdType.this.c;
                setCreditCards setcreditcards2 = this.b;
                realmset_kirimanuangs.o_().r_();
                realmset_kirimanuangs.w();
                setFotoKtp.c(setcreditcards2.d);
                getTanggalJatuhTempo d = getTanggalJatuhTempo.d(setcreditcards2.u);
                getTanggalJatuhTempo b = realmset_kirimanuangs.b(setcreditcards2.d);
                realmset_kirimanuangs.s_().i().a("Setting consent, package, consent", setcreditcards2.d, d);
                realmset_kirimanuangs.b(setcreditcards2.d, d);
                if (d.e(b)) {
                    realmset_kirimanuangs.a(setcreditcards2);
                }
            }
        };
        setFotoKtp.b(realmset_flagrepresentativetransaction);
        if (this.c.o_().a()) {
            realmset_flagrepresentativetransaction.run();
        } else {
            this.c.o_().a(realmset_flagrepresentativetransaction);
        }
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final String c(setCreditCards setcreditcards) {
        b(setcreditcards, false);
        return this.c.e(setcreditcards);
    }

    final void c(Runnable runnable) {
        setFotoKtp.b(runnable);
        if (this.c.o_().a()) {
            runnable.run();
        } else {
            this.c.o_().b(runnable);
        }
    }

    public final void c(realmGet.tipeNasabah tipenasabah, setCreditCards setcreditcards) {
        if (!this.c.g().f(setcreditcards.d)) {
            e(tipenasabah, setcreditcards);
            return;
        }
        this.c.s_().i().e("EES config found for", setcreditcards.d);
        realmGet$RepresentativeName g = this.c.g();
        String str = setcreditcards.d;
        realmGet.KategoriTujuanTransaksi.e();
        getNationality getnationality = null;
        if (g.q.t().c((String) null, realmSet.hasDone.F)) {
            getnationality = TextUtils.isEmpty(str) ? null : (getNationality) g.b.e(str);
        }
        if (getnationality != null) {
            try {
                Bundle e = tipenasabah.a.e();
                HashMap hashMap = new HashMap();
                for (String str2 : e.keySet()) {
                    Object obj = e.get(str2);
                    if (obj != null) {
                        hashMap.put(str2, obj);
                    }
                }
                String a = realmSet$SenderName.a(tipenasabah.e);
                String str3 = a;
                if (a == null) {
                    str3 = tipenasabah.e;
                }
                if (getnationality.d(new getCreditCardOptions(str3, tipenasabah.c, hashMap))) {
                    if (getnationality.e()) {
                        this.c.s_().i().e("EES edited event", tipenasabah.e);
                        e(setAccounts.c(getnationality.b().e()), setcreditcards);
                    } else {
                        e(tipenasabah, setcreditcards);
                    }
                    if (getnationality.a()) {
                        for (getCreditCardOptions getcreditcardoptions : getnationality.b().a()) {
                            this.c.s_().i().e("EES logging created event", getcreditcardoptions.a());
                            e(setAccounts.c(getcreditcardoptions), setcreditcards);
                        }
                        return;
                    }
                    return;
                }
            } catch (zzd e2) {
                this.c.s_().b().a("EES error. appId, eventName", setcreditcards.c, tipenasabah.e);
            }
            this.c.s_().i().e("EES was not applied to event", tipenasabah.e);
            e(tipenasabah, setcreditcards);
            return;
        }
        this.c.s_().i().e("EES not loaded for", setcreditcards.d);
        e(tipenasabah, setcreditcards);
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final void c(realmSet$tarikans realmset_tarikans, setCreditCards setcreditcards) {
        setFotoKtp.b(realmset_tarikans);
        b(setcreditcards, false);
        c(new Runnable(realmset_tarikans, setcreditcards) { // from class: o.realmSet$RecurringEndDate
            final /* synthetic */ setCreditCards a;
            final /* synthetic */ realmSet$tarikans e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r5;
                this.a = r6;
            }

            @Override // java.lang.Runnable
            public final void run() {
                realmSet$RepresentativeIdType.this.c.d();
                if (this.e.a() == null) {
                    realmSet$RepresentativeIdType.this.c.d(this.e, this.a);
                } else {
                    realmSet$RepresentativeIdType.this.c.b(this.e, this.a);
                }
            }
        });
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final List<realmSet$tarikans> d(String str, String str2, String str3, boolean z) {
        e(str, true);
        try {
            List<realmSet$verified> list = (List) this.c.o_().b(new Callable<List<realmSet$verified>>(str, str2, str3) { // from class: o.realmGet$Type
                final /* synthetic */ String b;
                final /* synthetic */ String c;
                final /* synthetic */ String e;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.c = r5;
                    this.b = r6;
                    this.e = r7;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ List<realmSet$verified> call() throws Exception {
                    realmSet$RepresentativeIdType.this.c.d();
                    return realmSet$RepresentativeIdType.this.c.r().a(this.c, this.b, this.e);
                }
            }).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (realmSet$verified realmset_verified : list) {
                if (z || !setAcctNo.c(realmset_verified.d)) {
                    arrayList.add(new realmSet$tarikans(realmset_verified));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.c.s_().b().a("Failed to get user properties as. appId", setIsInputAtmPemrek.d(str), e);
            return Collections.emptyList();
        }
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final void d(realmGet.tipeNasabah tipenasabah, setCreditCards setcreditcards) {
        setFotoKtp.b(tipenasabah);
        b(setcreditcards, false);
        c(new Runnable(tipenasabah, setcreditcards) { // from class: o.realmSet$ReceiverAccount
            final /* synthetic */ setCreditCards c;
            final /* synthetic */ realmGet.tipeNasabah d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.d = r5;
                this.c = r6;
            }

            @Override // java.lang.Runnable
            public final void run() {
                realmGet.tipeNasabah b = realmSet$RepresentativeIdType.this.b(this.d, this.c);
                realmGet.KategoriTujuanTransaksi.e();
                if (realmSet$RepresentativeIdType.this.c.i().c((String) null, realmSet.hasDone.F)) {
                    realmSet$RepresentativeIdType.this.c(b, this.c);
                } else {
                    realmSet$RepresentativeIdType.this.e(b, this.c);
                }
            }
        });
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final void d(setCreditCards setcreditcards) {
        setFotoKtp.c(setcreditcards.d);
        e(setcreditcards.d, false);
        c(new Runnable(setcreditcards) { // from class: o.realmSet$FlagSaveToSourceAccountList
            final /* synthetic */ setCreditCards a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = r5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                realmSet$RepresentativeIdType.this.c.d();
                realmSet$RepresentativeIdType.this.c.a(this.a);
            }
        });
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final List<getNomorHp> e(String str, String str2, setCreditCards setcreditcards) {
        b(setcreditcards, false);
        String str3 = setcreditcards.d;
        setFotoKtp.b(str3);
        try {
            return (List) this.c.o_().b(new Callable<List<getNomorHp>>(str3, str, str2) { // from class: o.realmGet$currency
                final /* synthetic */ String a;
                final /* synthetic */ String b;
                final /* synthetic */ String e;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.b = r5;
                    this.a = r6;
                    this.e = r7;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ List<getNomorHp> call() throws Exception {
                    realmSet$RepresentativeIdType.this.c.d();
                    return realmSet$RepresentativeIdType.this.c.r().b(this.b, this.a, this.e);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            this.c.s_().b().e("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final List<realmSet$tarikans> e(String str, String str2, boolean z, setCreditCards setcreditcards) {
        b(setcreditcards, false);
        String str3 = setcreditcards.d;
        setFotoKtp.b(str3);
        try {
            List<realmSet$verified> list = (List) this.c.o_().b(new Callable<List<realmSet$verified>>(str3, str, str2) { // from class: o.realmSet$FlagDaftarTransfer
                final /* synthetic */ String a;
                final /* synthetic */ String d;
                final /* synthetic */ String e;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.e = r5;
                    this.a = r6;
                    this.d = r7;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ List<realmSet$verified> call() throws Exception {
                    realmSet$RepresentativeIdType.this.c.d();
                    return realmSet$RepresentativeIdType.this.c.r().a(this.e, this.a, this.d);
                }
            }).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (realmSet$verified realmset_verified : list) {
                if (z || !setAcctNo.c(realmset_verified.d)) {
                    arrayList.add(new realmSet$tarikans(realmset_verified));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.c.s_().b().a("Failed to query user properties. appId", setIsInputAtmPemrek.d(setcreditcards.d), e);
            return Collections.emptyList();
        }
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final List<realmSet$tarikans> e(setCreditCards setcreditcards, boolean z) {
        b(setcreditcards, false);
        String str = setcreditcards.d;
        setFotoKtp.b(str);
        try {
            List<realmSet$verified> list = (List) this.c.o_().b(new Callable<List<realmSet$verified>>(str) { // from class: o.realmSet$RecurringValue
                final /* synthetic */ String e;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.e = r5;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ List<realmSet$verified> call() throws Exception {
                    realmSet$RepresentativeIdType.this.c.d();
                    return realmSet$RepresentativeIdType.this.c.r().c(this.e);
                }
            }).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (realmSet$verified realmset_verified : list) {
                if (z || !setAcctNo.c(realmset_verified.d)) {
                    arrayList.add(new realmSet$tarikans(realmset_verified));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.c.s_().b().a("Failed to get user properties. appId", setIsInputAtmPemrek.d(setcreditcards.d), e);
            return null;
        }
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final void e(long j, String str, String str2, String str3) {
        c(new Runnable(str2, str3, str, j) { // from class: o.realmSet$SenderAddress
            final /* synthetic */ String a;
            final /* synthetic */ String c;
            final /* synthetic */ long d;
            final /* synthetic */ String e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.c = r6;
                this.e = r7;
                this.a = r8;
                this.d = r9;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str4 = this.c;
                if (str4 == null) {
                    realmSet$RepresentativeIdType.this.c.f().I().a(this.e, (getAcctNo) null);
                    return;
                }
                realmSet$RepresentativeIdType.this.c.f().I().a(this.e, new getAcctNo(this.a, str4, this.d));
            }
        });
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final void e(getNomorHp getnomorhp, setCreditCards setcreditcards) {
        setFotoKtp.b(getnomorhp);
        setFotoKtp.b(getnomorhp.d);
        b(setcreditcards, false);
        getNomorHp getnomorhp2 = new getNomorHp(getnomorhp);
        getnomorhp2.e = setcreditcards.d;
        c(new Runnable(getnomorhp2, setcreditcards) { // from class: o.realmGet$SenderPhone
            final /* synthetic */ getNomorHp d;
            final /* synthetic */ setCreditCards e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.d = r5;
                this.e = r6;
            }

            @Override // java.lang.Runnable
            public final void run() {
                realmSet$RepresentativeIdType.this.c.d();
                if (this.d.d.a() == null) {
                    realmSet$RepresentativeIdType.this.c.b(this.d, this.e);
                } else {
                    realmSet$RepresentativeIdType.this.c.e(this.d, this.e);
                }
            }
        });
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final void e(setCreditCards setcreditcards) {
        b(setcreditcards, false);
        c(new Runnable(setcreditcards) { // from class: o.realmSet$FlagTxnBerkala
            final /* synthetic */ setCreditCards e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                realmSet$RepresentativeIdType.this.c.d();
                realmSet$kirimanUangs realmset_kirimanuangs = realmSet$RepresentativeIdType.this.c;
                setCreditCards setcreditcards2 = this.e;
                realmset_kirimanuangs.o_().r_();
                realmset_kirimanuangs.w();
                setFotoKtp.c(setcreditcards2.d);
                realmset_kirimanuangs.d(setcreditcards2);
            }
        });
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final byte[] e(realmGet.tipeNasabah tipenasabah, String str) {
        setFotoKtp.c(str);
        setFotoKtp.b(tipenasabah);
        e(str, true);
        this.c.s_().h().e("Log and bundle. event", this.c.x().b(tipenasabah.e));
        long c = this.c.q_().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.c.o_().c(new Callable<byte[]>(tipenasabah, str) { // from class: o.realmSet$ReceiverName
                final /* synthetic */ realmGet.tipeNasabah a;
                final /* synthetic */ String e;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = r5;
                    this.e = r6;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ byte[] call() throws Exception {
                    realmSet$kirimanUangs realmset_kirimanuangs;
                    realmSet$verified realmset_verified;
                    long j;
                    realmGet.sumberDanaCode sumberdanacode;
                    realmSet$RepresentativeIdType.this.c.d();
                    realmSet$Email q = realmSet$RepresentativeIdType.this.c.q();
                    realmGet.tipeNasabah tipenasabah2 = this.a;
                    String str2 = this.e;
                    q.r_();
                    realmGet$TxnPurpose.c();
                    setFotoKtp.b(tipenasabah2);
                    setFotoKtp.c(str2);
                    byte[] bArr2 = null;
                    if (!q.q.t().c(str2, realmSet.hasDone.u)) {
                        q.q.s_().h().e("Generating ScionPayload disabled. packageName", str2);
                        bArr2 = new byte[0];
                    } else if ("_iap".equals(tipenasabah2.e) || "_iapx".equals(tipenasabah2.e)) {
                        realmSet.bcaDebitCardType a = realmSet.bcaDebitCardNumber.a();
                        q.h.r().p();
                        try {
                            realmGet$TxnSource d = q.h.r().d(str2);
                            if (d == null) {
                                q.q.s_().h().e("Log and bundle not available. package_name", str2);
                                bArr2 = new byte[0];
                                realmset_kirimanuangs = q.h;
                            } else if (!d.d()) {
                                q.q.s_().h().e("Log and bundle disabled. package_name", str2);
                                bArr2 = new byte[0];
                                realmset_kirimanuangs = q.h;
                            } else {
                                realmSet.birthDate e = realmSet.bcaAccountNumber.e();
                                e.c(1);
                                e.e("android");
                                if (!TextUtils.isEmpty(d.u())) {
                                    e.g(d.u());
                                }
                                if (!TextUtils.isEmpty(d.H())) {
                                    e.d((String) setFotoKtp.b(d.H()));
                                }
                                if (!TextUtils.isEmpty(d.I())) {
                                    e.f((String) setFotoKtp.b(d.I()));
                                }
                                if (d.G() != -2147483648L) {
                                    e.b((int) d.G());
                                }
                                e.d(d.F());
                                e.j(d.b());
                                String x = d.x();
                                String w = d.w();
                                getTipeTujuanTransaksiPenerima.b();
                                if (q.q.t().c(d.u(), realmSet.hasDone.N)) {
                                    String A = d.A();
                                    if (!TextUtils.isEmpty(x)) {
                                        e.o(x);
                                    } else if (!TextUtils.isEmpty(A)) {
                                        e.n(A);
                                    } else if (!TextUtils.isEmpty(w)) {
                                        e.k(w);
                                    }
                                } else if (!TextUtils.isEmpty(x)) {
                                    e.o(x);
                                } else if (!TextUtils.isEmpty(w)) {
                                    e.k(w);
                                }
                                getTanggalJatuhTempo b = q.h.b(str2);
                                e.a(d.e());
                                if (q.q.a() && q.q.t().b(e.b()) && b.c() && !TextUtils.isEmpty(null)) {
                                    e.m((String) null);
                                }
                                e.p(b.a());
                                if (b.c()) {
                                    Pair<String, Boolean> d2 = q.h.v().d(d.u(), b);
                                    if (d.q() && !TextUtils.isEmpty((CharSequence) d2.first)) {
                                        try {
                                            e.i(realmSet$Email.a((String) d2.first, Long.toString(tipenasabah2.c)));
                                            if (d2.second != null) {
                                                e.a(((Boolean) d2.second).booleanValue());
                                            }
                                        } catch (SecurityException e2) {
                                            q.q.s_().h().e("Resettable device id encryption failed", e2.getMessage());
                                            bArr2 = new byte[0];
                                            realmset_kirimanuangs = q.h;
                                        }
                                    }
                                }
                                q.q.G().s();
                                e.c(Build.MODEL);
                                q.q.G().s();
                                e.a(Build.VERSION.RELEASE);
                                e.a((int) q.q.G().d());
                                e.b(q.q.G().b());
                                try {
                                    if (b.d() && d.y() != null) {
                                        e.h(realmSet$Email.a((String) setFotoKtp.b(d.y()), Long.toString(tipenasabah2.c)));
                                    }
                                    if (!TextUtils.isEmpty(d.D())) {
                                        e.l((String) setFotoKtp.b(d.D()));
                                    }
                                    String u = d.u();
                                    List c2 = q.h.r().c(u);
                                    Iterator it = c2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            realmset_verified = null;
                                            break;
                                        }
                                        realmset_verified = (realmSet$verified) it.next();
                                        if ("_lte".equals(realmset_verified.d)) {
                                            break;
                                        }
                                    }
                                    if (realmset_verified == null || realmset_verified.e == null) {
                                        realmSet$verified realmset_verified2 = new realmSet$verified(u, "auto", "_lte", q.q.q_().e(), 0L);
                                        c2.add(realmset_verified2);
                                        q.h.r().e(realmset_verified2);
                                    }
                                    setAccounts t = q.h.t();
                                    t.q.s_().i().b("Checking account type status for ad personalization signals");
                                    if (t.q.G().j()) {
                                        String u2 = d.u();
                                        setFotoKtp.b(u2);
                                        if (d.q() && t.h.g().a(u2)) {
                                            t.q.s_().h().b("Turning off ad personalization due to account type");
                                            Iterator it2 = c2.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    if ("_npa".equals(((realmSet$verified) it2.next()).d)) {
                                                        it2.remove();
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                            c2.add(new realmSet$verified(u2, "auto", "_npa", t.q.q_().e(), 1L));
                                        }
                                    }
                                    realmSet.currOfficeCity[] currofficecityArr = new realmSet.currOfficeCity[c2.size()];
                                    for (int i = 0; i < c2.size(); i++) {
                                        realmSet.currOfficeExtensionNumber e3 = realmSet.currOfficeCity.e();
                                        e3.b(((realmSet$verified) c2.get(i)).d);
                                        e3.b(((realmSet$verified) c2.get(i)).a);
                                        q.h.t().a(e3, ((realmSet$verified) c2.get(i)).e);
                                        currofficecityArr[i] = (realmSet.currOfficeCity) e3.v();
                                    }
                                    e.d(Arrays.asList(currofficecityArr));
                                    setDescTransaksi c3 = setDescTransaksi.c(tipenasabah2);
                                    q.q.u().c(c3.b, q.h.r().a(str2));
                                    q.q.u().c(c3, q.q.t().a(str2));
                                    Bundle bundle = c3.b;
                                    bundle.putLong("_c", 1);
                                    q.q.s_().h().b("Marking in-app purchase as real-time");
                                    bundle.putLong("_r", 1);
                                    bundle.putString("_o", tipenasabah2.d);
                                    if (q.q.u().i(e.b())) {
                                        q.q.u().e(bundle, "_dbg", 1L);
                                        q.q.u().e(bundle, "_r", 1L);
                                    }
                                    realmGet.sumberDanaCode e4 = q.h.r().e(str2, tipenasabah2.e);
                                    if (e4 == null) {
                                        sumberdanacode = new realmGet.sumberDanaCode(str2, tipenasabah2.e, 0, 0, 0, tipenasabah2.c, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                                        j = 0;
                                    } else {
                                        j = e4.h;
                                        sumberdanacode = e4.b(tipenasabah2.c);
                                    }
                                    q.h.r().e(sumberdanacode);
                                    realmGet.sumberDana sumberdana = new realmGet.sumberDana(q.q, tipenasabah2.d, str2, tipenasabah2.e, tipenasabah2.c, j, bundle);
                                    realmSet.autodebetAccountNumber d3 = realmGet.selectedCardOptions.d();
                                    d3.c(sumberdana.c);
                                    d3.b(sumberdana.e);
                                    d3.d(sumberdana.a);
                                    realmGet.tanggalJatuhTempo tanggaljatuhtempo = new realmGet.tanggalJatuhTempo(sumberdana.j);
                                    while (tanggaljatuhtempo.hasNext()) {
                                        String e5 = tanggaljatuhtempo.e();
                                        realmGet.totalDependent c4 = realmSet.birthPlace.c();
                                        c4.b(e5);
                                        Object d4 = sumberdana.j.d(e5);
                                        if (d4 != null) {
                                            q.h.t().e(c4, d4);
                                            d3.b(c4);
                                        }
                                    }
                                    e.b(d3);
                                    realmSet.ccOtherBankAccounts e6 = realmSet.currCompanyName.e();
                                    realmSet.autodebetPercentage b2 = realmGet.totalSupplementCard.b();
                                    b2.c(sumberdanacode.a);
                                    b2.c(tipenasabah2.e);
                                    e6.c(b2);
                                    e.e(e6);
                                    e.a(q.h.s().c(d.u(), Collections.emptyList(), e.n(), Long.valueOf(d3.i()), Long.valueOf(d3.i())));
                                    if (d3.c()) {
                                        e.f(d3.i());
                                        e.g(d3.i());
                                    }
                                    long B = d.B();
                                    int i2 = (B > 0 ? 1 : (B == 0 ? 0 : -1));
                                    if (i2 != 0) {
                                        e.o(B);
                                    }
                                    long C = d.C();
                                    if (C != 0) {
                                        e.n(C);
                                    } else if (i2 != 0) {
                                        e.n(B);
                                    }
                                    d.h();
                                    e.e((int) d.c());
                                    q.q.t().e();
                                    e.c(42004);
                                    e.i(q.q.q_().e());
                                    Boolean bool = Boolean.TRUE;
                                    e.d(true);
                                    a.d(e);
                                    d.l(e.q());
                                    d.n(e.p());
                                    q.h.r().b(d);
                                    q.h.r().q();
                                    try {
                                        bArr2 = q.h.t().e(a.v().am());
                                    } catch (IOException e7) {
                                        q.q.s_().b().a("Data loss. Failed to bundle and serialize. appId", setIsInputAtmPemrek.d(str2), e7);
                                        bArr2 = null;
                                    }
                                } catch (SecurityException e8) {
                                    q.q.s_().h().e("app instance id encryption failed", e8.getMessage());
                                    bArr2 = new byte[0];
                                    realmset_kirimanuangs = q.h;
                                }
                            }
                            realmset_kirimanuangs.r().s();
                        } finally {
                            q.h.r().s();
                        }
                    } else {
                        q.q.s_().h().a("Generating a payload for this event is not available. package_name, event_name", str2, tipenasabah2.e);
                    }
                    return bArr2;
                }
            }).get();
            byte[] bArr2 = bArr;
            if (bArr == null) {
                this.c.s_().b().e("Log and bundle returned null. appId", setIsInputAtmPemrek.d(str));
                bArr2 = new byte[0];
            }
            this.c.s_().h().b("Log and bundle processed. event, size, time_ms", this.c.x().b(tipenasabah.e), Integer.valueOf(bArr2.length), Long.valueOf((this.c.q_().c() / 1000000) - c));
            return bArr2;
        } catch (InterruptedException | ExecutionException e) {
            this.c.s_().b().b("Failed to log and bundle. appId, event, error", setIsInputAtmPemrek.d(str), this.c.x().b(tipenasabah.e), e);
            return null;
        }
    }
}
