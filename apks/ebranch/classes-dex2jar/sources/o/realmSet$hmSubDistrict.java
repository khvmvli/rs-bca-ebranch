package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmSet$hmSubDistrict.class */
public final class realmSet$hmSubDistrict {
    private final realmGet$job b;
    private final realmGet$religion d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ realmSet$hmSubDistrict(realmGet$religion realmget_religion, realmGet$job realmget_job, realmSet$incomeSource realmset_incomesource) {
        this.d = realmget_religion;
        this.b = realmget_job;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof realmSet$hmSubDistrict)) {
            return false;
        }
        realmSet$hmSubDistrict realmset_hmsubdistrict = (realmSet$hmSubDistrict) obj;
        return setFlagIB.d(this.d, realmset_hmsubdistrict.d) && setFlagIB.d(this.b, realmset_hmsubdistrict.b);
    }

    public final int hashCode() {
        return setFlagIB.b(this.d, this.b);
    }

    public final String toString() {
        return setFlagIB.e(this).b("key", this.d).b("feature", this.b).toString();
    }
}
