package o;
/* loaded from: classes2-dex2jar.jar:o/LogoutDialog_ViewBinding$2.class */
final class LogoutDialog_ViewBinding$2 implements Runnable {
    final /* synthetic */ LogoutDialog_ViewBinding e;

    LogoutDialog_ViewBinding$2(LogoutDialog_ViewBinding logoutDialog_ViewBinding) {
        this.e = logoutDialog_ViewBinding;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o.clickedOk, android.view.View] */
    @Override // java.lang.Runnable
    public final void run() {
        this.e.l.performClick();
        this.e.l.jumpDrawablesToCurrentState();
    }
}
