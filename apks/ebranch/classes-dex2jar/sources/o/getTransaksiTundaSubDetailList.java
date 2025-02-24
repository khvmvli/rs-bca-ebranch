package o;

import android.content.Context;
import java.util.concurrent.Executor;
import o.Account;
import o.getOccupationFlagFreeText;
import o.getOfficeAddress;
import o.getUpdatedAt;
import o.setTransaksiTundaSubDetailList;
/* loaded from: classes-dex2jar.jar:o/getTransaksiTundaSubDetailList.class */
final class getTransaksiTundaSubDetailList extends Account {
    private Page6JLFragment_ViewBinding<getHmCity> a;
    private Page6JLFragment_ViewBinding b;
    private Page6JLFragment_ViewBinding c;
    private Page6JLFragment_ViewBinding<Executor> d;
    private Page6JLFragment_ViewBinding<getHmVillage> e;
    private Page6JLFragment_ViewBinding<getOfficeCity> f;
    private Page6JLFragment_ViewBinding<getCitizen> g;
    private Page6JLFragment_ViewBinding<getJobOthers> h;
    private Page6JLFragment_ViewBinding<Context> i;
    private Page6JLFragment_ViewBinding j;
    private Page6JLFragment_ViewBinding<getKitasKitapNumber> k;
    private Page6JLFragment_ViewBinding<getLastEducation> l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getTransaksiTundaSubDetailList$write.class */
    public static final class write implements Account.read {
        private Context d;

        private write() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ write(byte b) {
            this();
        }

        @Override // o.Account.read
        public final Account b() {
            Context context = this.d;
            if (context != null) {
                return new getTransaksiTundaSubDetailList(context, (byte) 0);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(Context.class.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }

        @Override // o.Account.read
        public final /* bridge */ /* synthetic */ Account.read d(Context context) {
            this.d = context;
            return this;
        }
    }

    private getTransaksiTundaSubDetailList(Context context) {
        Page6JLFragment_ViewBinding<Executor> page6JLFragment_ViewBinding = setTransaksiTundaSubDetailList.read.c;
        this.d = !(page6JLFragment_ViewBinding instanceof getFlagIB) ? new getFlagIB<>(page6JLFragment_ViewBinding) : page6JLFragment_ViewBinding;
        if (context != null) {
            getFotoPribadi getfotopribadi = new getFotoPribadi(context);
            this.i = getfotopribadi;
            getEmailIB getemailib = new getEmailIB(getfotopribadi, getTypeID$MediaBrowserCompat$CustomActionResultReceiver.e, getUpdatedAt.write.e);
            this.c = getemailib;
            Page6JLFragment_ViewBinding getflagguest = new getFlagGuest(this.i, getemailib);
            this.b = !(getflagguest instanceof getFlagIB) ? new getFlagIB(getflagguest) : getflagguest;
            this.j = new getExpID<getResSubDistrict>(this.i, getOfficeAddress.write.a, getNpwp$MediaBrowserCompat$CustomActionResultReceiver.b) { // from class: o.realmGet$businessFieldFlagFreeText
                private final Page6JLFragment_ViewBinding<String> a;
                private final Page6JLFragment_ViewBinding<Integer> c;
                private final Page6JLFragment_ViewBinding<Context> d;

                {
                    this.d = r4;
                    this.a = r5;
                    this.c = r6;
                }

                @Override // o.Page6JLFragment_ViewBinding
                public final /* synthetic */ Object c() {
                    return new getResSubDistrict(this.d.c(), this.a.c(), this.c.c().intValue());
                }
            };
            Page6JLFragment_ViewBinding<getOfficeCity> getrespostcode = new getResPostCode(getTypeID$MediaBrowserCompat$CustomActionResultReceiver.e, getUpdatedAt.write.e, getOccupationFlagFreeText.write.a, this.j);
            this.f = !(getrespostcode instanceof getFlagIB) ? new getFlagIB<>(getrespostcode) : getrespostcode;
            getHmPostCode gethmpostcode = new getHmPostCode(getTypeID$MediaBrowserCompat$CustomActionResultReceiver.e);
            this.e = gethmpostcode;
            getHmPhoneNumber gethmphonenumber = new getHmPhoneNumber(this.i, this.f, gethmpostcode, getUpdatedAt.write.e);
            this.l = gethmphonenumber;
            Page6JLFragment_ViewBinding<Executor> page6JLFragment_ViewBinding2 = this.d;
            Page6JLFragment_ViewBinding page6JLFragment_ViewBinding3 = this.b;
            Page6JLFragment_ViewBinding<getOfficeCity> page6JLFragment_ViewBinding4 = this.f;
            this.a = new getHandPhoneNumber(page6JLFragment_ViewBinding2, page6JLFragment_ViewBinding3, gethmphonenumber, page6JLFragment_ViewBinding4, page6JLFragment_ViewBinding4);
            Page6JLFragment_ViewBinding<Context> page6JLFragment_ViewBinding5 = this.i;
            Page6JLFragment_ViewBinding page6JLFragment_ViewBinding6 = this.b;
            Page6JLFragment_ViewBinding<getOfficeCity> page6JLFragment_ViewBinding7 = this.f;
            this.h = new getKitasKitapFlag(page6JLFragment_ViewBinding5, page6JLFragment_ViewBinding6, page6JLFragment_ViewBinding7, this.l, this.d, page6JLFragment_ViewBinding7, getTypeID$MediaBrowserCompat$CustomActionResultReceiver.e);
            Page6JLFragment_ViewBinding<Executor> page6JLFragment_ViewBinding8 = this.d;
            Page6JLFragment_ViewBinding<getOfficeCity> page6JLFragment_ViewBinding9 = this.f;
            this.k = new getMaritalStatusValue(page6JLFragment_ViewBinding8, page6JLFragment_ViewBinding9, this.l, page6JLFragment_ViewBinding9);
            Page6JLFragment_ViewBinding<getCitizen> getaccttype = new getAcctType(getTypeID$MediaBrowserCompat$CustomActionResultReceiver.e, getUpdatedAt.write.e, this.a, this.h, this.k);
            this.g = !(getaccttype instanceof getFlagIB) ? new getFlagIB<>(getaccttype) : getaccttype;
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }

    /* synthetic */ getTransaksiTundaSubDetailList(Context context, byte b) {
        this(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.Account
    public final getCitizen b() {
        return this.g.c();
    }

    @Override // o.Account
    final getMaritalStatus e() {
        return this.f.c();
    }
}
