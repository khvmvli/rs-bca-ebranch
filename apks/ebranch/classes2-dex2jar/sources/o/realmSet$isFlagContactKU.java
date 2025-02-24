package o;
/* loaded from: classes2-dex2jar.jar:o/realmSet$isFlagContactKU.class */
public final class realmSet$isFlagContactKU implements Runnable {
    final /* synthetic */ realmSet$userPhoto d;
    final /* synthetic */ realmSet$kirimanUangs e;

    public realmSet$isFlagContactKU(realmSet$kirimanUangs realmset_kirimanuangs, realmSet$userPhoto realmset_userphoto) {
        this.e = realmset_kirimanuangs;
        this.d = realmset_userphoto;
    }

    @Override // java.lang.Runnable
    public final void run() {
        realmSet$kirimanUangs.b(this.e, this.d);
        this.e.j();
    }
}
