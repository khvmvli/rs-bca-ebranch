package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$sumberDanaCode.class */
final class realmGet$sumberDanaCode {
    final long a;
    final long b;
    final long c;
    final String d;
    final String e;
    final Long f;
    final long g;
    final long h;
    final Long i;
    final Long j;
    final Boolean l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmGet$sumberDanaCode(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        setFotoKtp.c(str);
        setFotoKtp.c(str2);
        boolean z = false;
        setFotoKtp.b(j >= 0);
        setFotoKtp.b(j2 >= 0);
        setFotoKtp.b(j3 >= 0);
        setFotoKtp.b(j5 >= 0 ? true : z);
        this.e = str;
        this.d = str2;
        this.a = j;
        this.c = j2;
        this.b = j3;
        this.h = j4;
        this.g = j5;
        this.f = l;
        this.i = l2;
        this.j = l3;
        this.l = bool;
    }

    final realmGet$sumberDanaCode b(long j) {
        return new realmGet$sumberDanaCode(this.e, this.d, this.a, this.c, this.b, j, this.g, this.f, this.i, this.j, this.l);
    }

    final realmGet$sumberDanaCode b(Long l, Long l2, Boolean bool) {
        if (bool != null && !bool.booleanValue()) {
            bool = null;
        }
        return new realmGet$sumberDanaCode(this.e, this.d, this.a, this.c, this.b, this.h, this.g, this.f, l, l2, bool);
    }

    final realmGet$sumberDanaCode e(long j, long j2) {
        return new realmGet$sumberDanaCode(this.e, this.d, this.a, this.c, this.b, this.h, j, Long.valueOf(j2), this.i, this.j, this.l);
    }
}
