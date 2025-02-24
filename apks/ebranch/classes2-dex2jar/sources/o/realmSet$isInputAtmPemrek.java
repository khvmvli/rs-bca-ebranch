package o;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:o/realmSet$isInputAtmPemrek.class */
public interface realmSet$isInputAtmPemrek extends IInterface {
    void a(setCreditCards setcreditcards) throws RemoteException;

    List<getNomorHp> b(String str, String str2, String str3) throws RemoteException;

    void b(Bundle bundle, setCreditCards setcreditcards) throws RemoteException;

    void b(getNomorHp getnomorhp) throws RemoteException;

    void b(realmGet.tipeNasabah tipenasabah, String str, String str2) throws RemoteException;

    void b(setCreditCards setcreditcards) throws RemoteException;

    String c(setCreditCards setcreditcards) throws RemoteException;

    void c(realmSet$tarikans realmset_tarikans, setCreditCards setcreditcards) throws RemoteException;

    List<realmSet$tarikans> d(String str, String str2, String str3, boolean z) throws RemoteException;

    void d(realmGet.tipeNasabah tipenasabah, setCreditCards setcreditcards) throws RemoteException;

    void d(setCreditCards setcreditcards) throws RemoteException;

    List<getNomorHp> e(String str, String str2, setCreditCards setcreditcards) throws RemoteException;

    List<realmSet$tarikans> e(String str, String str2, boolean z, setCreditCards setcreditcards) throws RemoteException;

    List<realmSet$tarikans> e(setCreditCards setcreditcards, boolean z) throws RemoteException;

    void e(long j, String str, String str2, String str3) throws RemoteException;

    void e(getNomorHp getnomorhp, setCreditCards setcreditcards) throws RemoteException;

    void e(setCreditCards setcreditcards) throws RemoteException;

    byte[] e(realmGet.tipeNasabah tipenasabah, String str) throws RemoteException;
}
