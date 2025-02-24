package o;

import android.view.animation.Interpolator;
/* loaded from: classes2-dex2jar.jar:o/onChooseValueFasilitasPerlindungan.class */
public abstract class onChooseValueFasilitasPerlindungan implements Cloneable {
    Class b;
    float d;
    Interpolator c = null;
    boolean a = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/onChooseValueFasilitasPerlindungan$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends onChooseValueFasilitasPerlindungan {
        Object e;

        IconCompatParcelizer(float f, Object obj) {
            this.d = f;
            this.e = obj;
            this.a = obj != null;
            this.b = this.a ? obj.getClass() : Object.class;
        }

        @Override // o.onChooseValueFasilitasPerlindungan
        public final /* synthetic */ onChooseValueFasilitasPerlindungan a() {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.d, this.e);
            iconCompatParcelizer.c(e());
            return iconCompatParcelizer;
        }

        @Override // o.onChooseValueFasilitasPerlindungan
        public final void a(Object obj) {
            this.e = obj;
            this.a = obj != null;
        }

        @Override // o.onChooseValueFasilitasPerlindungan
        public final Object c() {
            return this.e;
        }

        @Override // o.onChooseValueFasilitasPerlindungan, java.lang.Object
        public final /* synthetic */ Object clone() throws CloneNotSupportedException {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.d, this.e);
            iconCompatParcelizer.c(e());
            return iconCompatParcelizer;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/onChooseValueFasilitasPerlindungan$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends onChooseValueFasilitasPerlindungan {
        float e;

        RemoteActionCompatParcelizer(float f) {
            this.d = f;
            this.b = Float.TYPE;
        }

        RemoteActionCompatParcelizer(float f, float f2) {
            this.d = f;
            this.e = f2;
            this.b = Float.TYPE;
            this.a = true;
        }

        @Override // o.onChooseValueFasilitasPerlindungan
        public final /* synthetic */ onChooseValueFasilitasPerlindungan a() {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.d, this.e);
            remoteActionCompatParcelizer.c(e());
            return remoteActionCompatParcelizer;
        }

        @Override // o.onChooseValueFasilitasPerlindungan
        public final void a(Object obj) {
            if (obj != null && obj.getClass() == Float.class) {
                this.e = ((Float) obj).floatValue();
                this.a = true;
            }
        }

        @Override // o.onChooseValueFasilitasPerlindungan
        public final Object c() {
            return Float.valueOf(this.e);
        }

        @Override // o.onChooseValueFasilitasPerlindungan, java.lang.Object
        public final /* synthetic */ Object clone() throws CloneNotSupportedException {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.d, this.e);
            remoteActionCompatParcelizer.c(e());
            return remoteActionCompatParcelizer;
        }
    }

    public static onChooseValueFasilitasPerlindungan a(float f, float f2) {
        return new RemoteActionCompatParcelizer(f, f2);
    }

    public static onChooseValueFasilitasPerlindungan b(float f) {
        return new IconCompatParcelizer(0.0f, null);
    }

    public static onChooseValueFasilitasPerlindungan b(float f, Object obj) {
        return new IconCompatParcelizer(f, obj);
    }

    public static onChooseValueFasilitasPerlindungan d(float f) {
        return new RemoteActionCompatParcelizer(0.0f);
    }

    public static onChooseValueFasilitasPerlindungan d(float f, int i) {
        return new onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver(f, i);
    }

    public static onChooseValueFasilitasPerlindungan e(float f) {
        return new onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver(0.0f);
    }

    /* renamed from: a */
    public abstract onChooseValueFasilitasPerlindungan clone();

    public abstract void a(Object obj);

    public abstract Object c();

    public final void c(Interpolator interpolator) {
        this.c = interpolator;
    }

    public final Interpolator e() {
        return this.c;
    }
}
