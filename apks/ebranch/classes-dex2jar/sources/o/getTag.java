package o;

import o.getSharedElementEnterTransition;
/* loaded from: classes-dex2jar.jar:o/getTag.class */
public final class getTag {
    double a;
    public double b;
    double c;
    double d;
    public boolean e;
    private final getSharedElementEnterTransition.IconCompatParcelizer f;
    private double g;
    private double h;
    private double i;
    double j;

    public getTag() {
        this.c = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.e = false;
        this.d = Double.MAX_VALUE;
        this.f = new getSharedElementEnterTransition.IconCompatParcelizer();
    }

    public getTag(float f) {
        this.c = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.e = false;
        this.d = Double.MAX_VALUE;
        this.f = new getSharedElementEnterTransition.IconCompatParcelizer();
        this.d = (double) f;
    }

    private void a() {
        if (!this.e) {
            if (this.d != Double.MAX_VALUE) {
                double d = this.b;
                if (d > 1.0d) {
                    double d2 = -d;
                    double d3 = this.c;
                    this.g = (d2 * d3) + (d3 * Math.sqrt((d * d) - 1.0d));
                    double d4 = this.b;
                    double d5 = -d4;
                    double d6 = this.c;
                    this.i = (d5 * d6) - (d6 * Math.sqrt((d4 * d4) - 1.0d));
                } else if (d >= 0.0d && d < 1.0d) {
                    this.h = this.c * Math.sqrt(1.0d - (d * d));
                }
                this.e = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    public final getTag b(float f) {
        if (f > 0.0f) {
            this.c = Math.sqrt((double) f);
            this.e = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final getSharedElementEnterTransition.IconCompatParcelizer c(double d, double d2, long j) {
        double d3;
        double d4;
        a();
        double d5 = ((double) j) / 1000.0d;
        double d6 = d - this.d;
        double d7 = this.b;
        int i = (d7 > 1.0d ? 1 : (d7 == 1.0d ? 0 : -1));
        if (i > 0) {
            double d8 = this.i;
            double d9 = ((d8 * d6) - d2) / (d8 - this.g);
            double d10 = d6 - d9;
            d3 = (Math.pow(2.718281828459045d, d8 * d5) * d10) + (Math.pow(2.718281828459045d, this.g * d5) * d9);
            double d11 = this.i;
            double pow = Math.pow(2.718281828459045d, d11 * d5);
            double d12 = this.g;
            d4 = (d10 * d11 * pow) + (d9 * d12 * Math.pow(2.718281828459045d, d12 * d5));
        } else if (i == 0) {
            double d13 = this.c;
            double d14 = d2 + (d13 * d6);
            double d15 = d6 + (d14 * d5);
            d3 = Math.pow(2.718281828459045d, (-d13) * d5) * d15;
            double pow2 = Math.pow(2.718281828459045d, (-this.c) * d5);
            double d16 = -this.c;
            d4 = (d15 * pow2 * d16) + (d14 * Math.pow(2.718281828459045d, d5 * d16));
        } else {
            double d17 = this.c;
            double d18 = (1.0d / this.h) * ((d7 * d17 * d6) + d2);
            d3 = Math.pow(2.718281828459045d, (-d7) * d17 * d5) * ((Math.cos(this.h * d5) * d6) + (Math.sin(this.h * d5) * d18));
            double d19 = this.c;
            double d20 = -d19;
            double d21 = this.b;
            double pow3 = Math.pow(2.718281828459045d, (-d21) * d19 * d5);
            double d22 = this.h;
            double d23 = -d22;
            double sin = Math.sin(d22 * d5);
            double d24 = this.h;
            d4 = (d20 * d3 * d21) + (((d23 * d6 * sin) + (d18 * d24 * Math.cos(d24 * d5))) * pow3);
        }
        this.f.e = (float) (d3 + this.d);
        this.f.d = (float) d4;
        return this.f;
    }
}
