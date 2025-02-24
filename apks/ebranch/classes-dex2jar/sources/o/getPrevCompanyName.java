package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.stetho.dumpapp.Framer;
/* loaded from: classes-dex2jar.jar:o/getPrevCompanyName.class */
public abstract class getPrevCompanyName extends getGender implements getPrevWorkPeriod {
    public getPrevCompanyName() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static getPrevWorkPeriod a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof getPrevWorkPeriod ? (getPrevWorkPeriod) queryLocalInterface : new getReferenceSalesCode(iBinder);
    }

    @Override // o.getGender
    protected final boolean d(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        getTotalSupplementCard gettotalsupplementcard;
        getTotalSupplementCard gettotalsupplementcard2 = null;
        getSelectedCardOptions getselectedcardoptions = null;
        getSelectedCardOptions getselectedcardoptions2 = null;
        getSelectedCardOptions getselectedcardoptions3 = null;
        getTotalSupplementCard gettotalsupplementcard3 = null;
        getTotalSupplementCard gettotalsupplementcard4 = null;
        getTotalSupplementCard gettotalsupplementcard5 = null;
        getTotalSupplementCard gettotalsupplementcard6 = null;
        getTotalSupplementCard gettotalsupplementcard7 = null;
        getTotalSupplementCard gettotalsupplementcard8 = null;
        realmGet$autodebetPercentage realmget_autodebetpercentage = null;
        getTotalSupplementCard gettotalsupplementcard9 = null;
        getTotalSupplementCard gettotalsupplementcard10 = null;
        getTotalSupplementCard gettotalsupplementcard11 = null;
        getTotalSupplementCard gettotalsupplementcard12 = null;
        getTotalSupplementCard gettotalsupplementcard13 = null;
        getTotalSupplementCard gettotalsupplementcard14 = null;
        switch (i) {
            case 1:
                c(realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(parcel.readStrongBinder()), (realmGet$bcaDebitCardType) getHmStayPeriod.c(parcel, realmGet$bcaDebitCardType.CREATOR), parcel.readLong());
                break;
            case 2:
                e(parcel.readString(), parcel.readString(), (Bundle) getHmStayPeriod.c(parcel, Bundle.CREATOR), getHmStayPeriod.a(parcel), getHmStayPeriod.a(parcel), parcel.readLong());
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) getHmStayPeriod.c(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    gettotalsupplementcard = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gettotalsupplementcard = queryLocalInterface instanceof getTotalSupplementCard ? (getTotalSupplementCard) queryLocalInterface : new getReferenceBranchCode(readStrongBinder);
                }
                d(readString, readString2, bundle, gettotalsupplementcard, parcel.readLong());
                break;
            case 4:
                d(parcel.readString(), parcel.readString(), realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(parcel.readStrongBinder()), getHmStayPeriod.a(parcel), parcel.readLong());
                break;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean a = getHmStayPeriod.a(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gettotalsupplementcard13 = queryLocalInterface2 instanceof getTotalSupplementCard ? (getTotalSupplementCard) queryLocalInterface2 : new getReferenceBranchCode(readStrongBinder2);
                }
                c(readString3, readString4, a, gettotalsupplementcard13);
                break;
            case 6:
                String readString5 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gettotalsupplementcard12 = queryLocalInterface3 instanceof getTotalSupplementCard ? (getTotalSupplementCard) queryLocalInterface3 : new getReferenceBranchCode(readStrongBinder3);
                }
                d(readString5, gettotalsupplementcard12);
                break;
            case 7:
                a(parcel.readString(), parcel.readLong());
                break;
            case 8:
                c((Bundle) getHmStayPeriod.c(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                e(parcel.readString(), parcel.readString(), (Bundle) getHmStayPeriod.c(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gettotalsupplementcard11 = queryLocalInterface4 instanceof getTotalSupplementCard ? (getTotalSupplementCard) queryLocalInterface4 : new getReferenceBranchCode(readStrongBinder4);
                }
                d(readString6, readString7, gettotalsupplementcard11);
                break;
            case 11:
                d(getHmStayPeriod.a(parcel), parcel.readLong());
                break;
            case 12:
                c(parcel.readLong());
                break;
            case 13:
                e(parcel.readLong());
                break;
            case 14:
                a(parcel.readLong());
                break;
            case 15:
                d(realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gettotalsupplementcard10 = queryLocalInterface5 instanceof getTotalSupplementCard ? (getTotalSupplementCard) queryLocalInterface5 : new getReferenceBranchCode(readStrongBinder5);
                }
                c(gettotalsupplementcard10);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gettotalsupplementcard9 = queryLocalInterface6 instanceof getTotalSupplementCard ? (getTotalSupplementCard) queryLocalInterface6 : new getReferenceBranchCode(readStrongBinder6);
                }
                b(gettotalsupplementcard9);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    realmget_autodebetpercentage = queryLocalInterface7 instanceof realmGet$autodebetPercentage ? (realmGet$autodebetPercentage) queryLocalInterface7 : new getReferenceSalesName(readStrongBinder7);
                }
                e(realmget_autodebetpercentage);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gettotalsupplementcard8 = queryLocalInterface8 instanceof getTotalSupplementCard ? (getTotalSupplementCard) queryLocalInterface8 : new getReferenceBranchCode(readStrongBinder8);
                }
                e(gettotalsupplementcard8);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gettotalsupplementcard7 = queryLocalInterface9 instanceof getTotalSupplementCard ? (getTotalSupplementCard) queryLocalInterface9 : new getReferenceBranchCode(readStrongBinder9);
                }
                a(gettotalsupplementcard7);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gettotalsupplementcard6 = queryLocalInterface10 instanceof getTotalSupplementCard ? (getTotalSupplementCard) queryLocalInterface10 : new getReferenceBranchCode(readStrongBinder10);
                }
                h(gettotalsupplementcard6);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gettotalsupplementcard5 = queryLocalInterface11 instanceof getTotalSupplementCard ? (getTotalSupplementCard) queryLocalInterface11 : new getReferenceBranchCode(readStrongBinder11);
                }
                d(gettotalsupplementcard5);
                break;
            case 23:
                e(parcel.readString(), parcel.readLong());
                break;
            case 24:
                b(parcel.readString(), parcel.readLong());
                break;
            case 25:
                b(realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                e(realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                d(realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(parcel.readStrongBinder()), (Bundle) getHmStayPeriod.c(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                c(realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                a(realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                d(realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(parcel.readStrongBinder()), parcel.readLong());
                break;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
                realmSet$noHpKontakPengirim d = realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gettotalsupplementcard4 = queryLocalInterface12 instanceof getTotalSupplementCard ? (getTotalSupplementCard) queryLocalInterface12 : new getReferenceBranchCode(readStrongBinder12);
                }
                d(d, gettotalsupplementcard4, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) getHmStayPeriod.c(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gettotalsupplementcard3 = queryLocalInterface13 instanceof getTotalSupplementCard ? (getTotalSupplementCard) queryLocalInterface13 : new getReferenceBranchCode(readStrongBinder13);
                }
                a(bundle2, gettotalsupplementcard3, parcel.readLong());
                break;
            case Framer.ENTER_FRAME_PREFIX:
                a(parcel.readInt(), parcel.readString(), realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(parcel.readStrongBinder()), realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(parcel.readStrongBinder()), realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    getselectedcardoptions3 = queryLocalInterface14 instanceof getSelectedCardOptions ? (getSelectedCardOptions) queryLocalInterface14 : new getTotalDependent(readStrongBinder14);
                }
                b(getselectedcardoptions3);
                break;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    getselectedcardoptions2 = queryLocalInterface15 instanceof getSelectedCardOptions ? (getSelectedCardOptions) queryLocalInterface15 : new getTotalDependent(readStrongBinder15);
                }
                c(getselectedcardoptions2);
                break;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    getselectedcardoptions = queryLocalInterface16 instanceof getSelectedCardOptions ? (getSelectedCardOptions) queryLocalInterface16 : new getTotalDependent(readStrongBinder16);
                }
                e(getselectedcardoptions);
                break;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
                e(getHmStayPeriod.b(parcel));
                break;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gettotalsupplementcard2 = queryLocalInterface17 instanceof getTotalSupplementCard ? (getTotalSupplementCard) queryLocalInterface17 : new getReferenceBranchCode(readStrongBinder17);
                }
                b(gettotalsupplementcard2, parcel.readInt());
                break;
            case 39:
                e(getHmStayPeriod.a(parcel));
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    gettotalsupplementcard14 = queryLocalInterface18 instanceof getTotalSupplementCard ? (getTotalSupplementCard) queryLocalInterface18 : new getReferenceBranchCode(readStrongBinder18);
                }
                j(gettotalsupplementcard14);
                break;
            case 41:
            default:
                return false;
            case 42:
                d((Bundle) getHmStayPeriod.c(parcel, Bundle.CREATOR));
                break;
            case 43:
                b(parcel.readLong());
                break;
            case 44:
                b((Bundle) getHmStayPeriod.c(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 45:
                d((Bundle) getHmStayPeriod.c(parcel, Bundle.CREATOR), parcel.readLong());
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
