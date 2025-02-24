package o;
/* loaded from: classes-dex2jar.jar:o/setBcaAccountNumber.class */
final class setBcaAccountNumber extends realmSet$referenceBranchCode {
    private final setBcaDebitCardNumber e = new setBcaDebitCardNumber();

    @Override // o.realmSet$referenceBranchCode
    public final void d(Throwable th, Throwable th2) {
        if (th2 != th) {
            this.e.d(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
