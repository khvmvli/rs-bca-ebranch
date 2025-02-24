package o;

import android.util.SparseArray;
/* loaded from: classes-dex2jar.jar:o/setTypeDraft.class */
public abstract class setTypeDraft {

    /* loaded from: classes-dex2jar.jar:o/setTypeDraft$IconCompatParcelizer.class */
    public enum IconCompatParcelizer {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        
        public static final SparseArray<IconCompatParcelizer> x;
        public final int v;

        static {
            IconCompatParcelizer iconCompatParcelizer = UNKNOWN_MOBILE_SUBTYPE;
            IconCompatParcelizer iconCompatParcelizer2 = GPRS;
            IconCompatParcelizer iconCompatParcelizer3 = EDGE;
            IconCompatParcelizer iconCompatParcelizer4 = UMTS;
            IconCompatParcelizer iconCompatParcelizer5 = CDMA;
            IconCompatParcelizer iconCompatParcelizer6 = EVDO_0;
            IconCompatParcelizer iconCompatParcelizer7 = EVDO_A;
            IconCompatParcelizer iconCompatParcelizer8 = RTT;
            IconCompatParcelizer iconCompatParcelizer9 = HSDPA;
            IconCompatParcelizer iconCompatParcelizer10 = HSUPA;
            IconCompatParcelizer iconCompatParcelizer11 = HSPA;
            IconCompatParcelizer iconCompatParcelizer12 = IDEN;
            IconCompatParcelizer iconCompatParcelizer13 = EVDO_B;
            IconCompatParcelizer iconCompatParcelizer14 = LTE;
            IconCompatParcelizer iconCompatParcelizer15 = EHRPD;
            IconCompatParcelizer iconCompatParcelizer16 = HSPAP;
            IconCompatParcelizer iconCompatParcelizer17 = GSM;
            IconCompatParcelizer iconCompatParcelizer18 = TD_SCDMA;
            IconCompatParcelizer iconCompatParcelizer19 = IWLAN;
            IconCompatParcelizer iconCompatParcelizer20 = LTE_CA;
            SparseArray<IconCompatParcelizer> sparseArray = new SparseArray<>();
            x = sparseArray;
            sparseArray.put(0, iconCompatParcelizer);
            sparseArray.put(1, iconCompatParcelizer2);
            sparseArray.put(2, iconCompatParcelizer3);
            sparseArray.put(3, iconCompatParcelizer4);
            sparseArray.put(4, iconCompatParcelizer5);
            sparseArray.put(5, iconCompatParcelizer6);
            sparseArray.put(6, iconCompatParcelizer7);
            sparseArray.put(7, iconCompatParcelizer8);
            sparseArray.put(8, iconCompatParcelizer9);
            sparseArray.put(9, iconCompatParcelizer10);
            sparseArray.put(10, iconCompatParcelizer11);
            sparseArray.put(11, iconCompatParcelizer12);
            sparseArray.put(12, iconCompatParcelizer13);
            sparseArray.put(13, iconCompatParcelizer14);
            sparseArray.put(14, iconCompatParcelizer15);
            sparseArray.put(15, iconCompatParcelizer16);
            sparseArray.put(16, iconCompatParcelizer17);
            sparseArray.put(17, iconCompatParcelizer18);
            sparseArray.put(18, iconCompatParcelizer19);
            sparseArray.put(19, iconCompatParcelizer20);
        }

        IconCompatParcelizer(int i) {
            this.v = i;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setTypeDraft$read.class */
    public static abstract class read {
        public abstract read a(IconCompatParcelizer iconCompatParcelizer);

        public abstract setTypeDraft a();

        public abstract read d(write write);
    }

    /* loaded from: classes-dex2jar.jar:o/setTypeDraft$write.class */
    public enum write {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        
        public static final SparseArray<write> s;
        public final int v;

        static {
            write write = MOBILE;
            write write2 = WIFI;
            write write3 = MOBILE_MMS;
            write write4 = MOBILE_SUPL;
            write write5 = MOBILE_DUN;
            write write6 = MOBILE_HIPRI;
            write write7 = WIMAX;
            write write8 = BLUETOOTH;
            write write9 = DUMMY;
            write write10 = ETHERNET;
            write write11 = MOBILE_FOTA;
            write write12 = MOBILE_IMS;
            write write13 = MOBILE_CBS;
            write write14 = WIFI_P2P;
            write write15 = MOBILE_IA;
            write write16 = MOBILE_EMERGENCY;
            write write17 = PROXY;
            write write18 = VPN;
            write write19 = NONE;
            SparseArray<write> sparseArray = new SparseArray<>();
            s = sparseArray;
            sparseArray.put(0, write);
            sparseArray.put(1, write2);
            sparseArray.put(2, write3);
            sparseArray.put(3, write4);
            sparseArray.put(4, write5);
            sparseArray.put(5, write6);
            sparseArray.put(6, write7);
            sparseArray.put(7, write8);
            sparseArray.put(8, write9);
            sparseArray.put(9, write10);
            sparseArray.put(10, write11);
            sparseArray.put(11, write12);
            sparseArray.put(12, write13);
            sparseArray.put(13, write14);
            sparseArray.put(14, write15);
            sparseArray.put(15, write16);
            sparseArray.put(16, write17);
            sparseArray.put(17, write18);
            sparseArray.put(-1, write19);
        }

        write(int i) {
            this.v = i;
        }
    }

    public abstract IconCompatParcelizer a();

    public abstract write b();
}
