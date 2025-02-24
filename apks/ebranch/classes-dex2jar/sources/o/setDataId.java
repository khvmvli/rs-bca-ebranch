package o;

import o.setFlagBooking;
/* loaded from: classes-dex2jar.jar:o/setDataId.class */
final class setDataId extends setFlagBooking {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final Integer f216o;

    /* loaded from: classes-dex2jar.jar:o/setDataId$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends setFlagBooking.write {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;
        private Integer k;
        private String n;

        @Override // o.setFlagBooking.write
        public final setFlagBooking.write a(String str) {
            this.e = str;
            return this;
        }

        @Override // o.setFlagBooking.write
        public final setFlagBooking.write b(String str) {
            this.b = str;
            return this;
        }

        @Override // o.setFlagBooking.write
        public final setFlagBooking.write c(String str) {
            this.c = str;
            return this;
        }

        @Override // o.setFlagBooking.write
        public final setFlagBooking.write d(Integer num) {
            this.k = num;
            return this;
        }

        @Override // o.setFlagBooking.write
        public final setFlagBooking.write d(String str) {
            this.d = str;
            return this;
        }

        @Override // o.setFlagBooking.write
        public final setFlagBooking d() {
            return new setDataId(this.k, this.i, this.e, this.a, this.n, this.f, this.h, this.d, this.g, this.c, this.j, this.b, (byte) 0);
        }

        @Override // o.setFlagBooking.write
        public final setFlagBooking.write e(String str) {
            this.a = str;
            return this;
        }

        @Override // o.setFlagBooking.write
        public final setFlagBooking.write f(String str) {
            this.j = str;
            return this;
        }

        @Override // o.setFlagBooking.write
        public final setFlagBooking.write g(String str) {
            this.h = str;
            return this;
        }

        @Override // o.setFlagBooking.write
        public final setFlagBooking.write h(String str) {
            this.i = str;
            return this;
        }

        @Override // o.setFlagBooking.write
        public final setFlagBooking.write i(String str) {
            this.g = str;
            return this;
        }

        @Override // o.setFlagBooking.write
        public final setFlagBooking.write j(String str) {
            this.f = str;
            return this;
        }

        @Override // o.setFlagBooking.write
        public final setFlagBooking.write m(String str) {
            this.n = str;
            return this;
        }
    }

    private setDataId(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f216o = num;
        this.g = str;
        this.a = str2;
        this.c = str3;
        this.n = str4;
        this.f = str5;
        this.i = str6;
        this.d = str7;
        this.j = str8;
        this.b = str9;
        this.h = str10;
        this.e = str11;
    }

    /* synthetic */ setDataId(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte b) {
        this(num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    @Override // o.setFlagBooking
    public final String a() {
        return this.c;
    }

    @Override // o.setFlagBooking
    public final String b() {
        return this.b;
    }

    @Override // o.setFlagBooking
    public final String c() {
        return this.d;
    }

    @Override // o.setFlagBooking
    public final String d() {
        return this.a;
    }

    @Override // o.setFlagBooking
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setFlagBooking)) {
            return false;
        }
        setFlagBooking setflagbooking = (setFlagBooking) obj;
        Integer num = this.f216o;
        if (num != null ? num.equals(setflagbooking.k()) : setflagbooking.k() == null) {
            String str = this.g;
            if (str != null ? str.equals(setflagbooking.h()) : setflagbooking.h() == null) {
                String str2 = this.a;
                if (str2 != null ? str2.equals(setflagbooking.d()) : setflagbooking.d() == null) {
                    String str3 = this.c;
                    if (str3 != null ? str3.equals(setflagbooking.a()) : setflagbooking.a() == null) {
                        String str4 = this.n;
                        if (str4 != null ? str4.equals(setflagbooking.l()) : setflagbooking.l() == null) {
                            String str5 = this.f;
                            if (str5 != null ? str5.equals(setflagbooking.f()) : setflagbooking.f() == null) {
                                String str6 = this.i;
                                if (str6 != null ? str6.equals(setflagbooking.j()) : setflagbooking.j() == null) {
                                    String str7 = this.d;
                                    if (str7 != null ? str7.equals(setflagbooking.c()) : setflagbooking.c() == null) {
                                        String str8 = this.j;
                                        if (str8 != null ? str8.equals(setflagbooking.i()) : setflagbooking.i() == null) {
                                            String str9 = this.b;
                                            if (str9 != null ? str9.equals(setflagbooking.b()) : setflagbooking.b() == null) {
                                                String str10 = this.h;
                                                if (str10 != null ? str10.equals(setflagbooking.g()) : setflagbooking.g() == null) {
                                                    String str11 = this.e;
                                                    return str11 != null ? z : z;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        z = false;
    }

    @Override // o.setFlagBooking
    public final String f() {
        return this.f;
    }

    @Override // o.setFlagBooking
    public final String g() {
        return this.h;
    }

    @Override // o.setFlagBooking
    public final String h() {
        return this.g;
    }

    public final int hashCode() {
        Integer num = this.f216o;
        int i = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        String str = this.g;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.a;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.c;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.n;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.f;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.i;
        int hashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.d;
        int hashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.j;
        int hashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.b;
        int hashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.h;
        int hashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.e;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return ((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ hashCode11) * 1000003) ^ i;
    }

    @Override // o.setFlagBooking
    public final String i() {
        return this.j;
    }

    @Override // o.setFlagBooking
    public final String j() {
        return this.i;
    }

    @Override // o.setFlagBooking
    public final Integer k() {
        return this.f216o;
    }

    @Override // o.setFlagBooking
    public final String l() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f216o);
        sb.append(", model=");
        sb.append(this.g);
        sb.append(", hardware=");
        sb.append(this.a);
        sb.append(", device=");
        sb.append(this.c);
        sb.append(", product=");
        sb.append(this.n);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.i);
        sb.append(", fingerprint=");
        sb.append(this.d);
        sb.append(", locale=");
        sb.append(this.j);
        sb.append(", country=");
        sb.append(this.b);
        sb.append(", mccMnc=");
        sb.append(this.h);
        sb.append(", applicationBuild=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
