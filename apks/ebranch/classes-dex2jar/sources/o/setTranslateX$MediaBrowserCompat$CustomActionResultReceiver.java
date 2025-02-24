package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.util.AttributeSet;
import java.util.ArrayList;
import o.setTranslateX;
import org.xmlpull.v1.XmlPullParser;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setTranslateX$MediaBrowserCompat$CustomActionResultReceiver.class */
public class setTranslateX$MediaBrowserCompat$CustomActionResultReceiver extends setTranslateX.RemoteActionCompatParcelizer {
    final Matrix a;
    float b;
    int c;
    final Matrix d;
    final ArrayList<setTranslateX.RemoteActionCompatParcelizer> e;
    private String f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int[] m;

    /* renamed from: o  reason: collision with root package name */
    private float f285o;

    public setTranslateX$MediaBrowserCompat$CustomActionResultReceiver() {
        super();
        this.a = new Matrix();
        this.e = new ArrayList<>();
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 0.0f;
        this.i = 1.0f;
        this.g = 1.0f;
        this.f285o = 0.0f;
        this.k = 0.0f;
        this.d = new Matrix();
        this.f = null;
    }

    public setTranslateX$MediaBrowserCompat$CustomActionResultReceiver(setTranslateX$MediaBrowserCompat$CustomActionResultReceiver settranslatex_mediabrowsercompat_customactionresultreceiver, setThumbTextPadding<String, Object> setthumbtextpadding) {
        super();
        setTranslateX.IconCompatParcelizer iconCompatParcelizer;
        this.a = new Matrix();
        this.e = new ArrayList<>();
        this.b = 0.0f;
        this.j = 0.0f;
        this.h = 0.0f;
        this.i = 1.0f;
        this.g = 1.0f;
        this.f285o = 0.0f;
        this.k = 0.0f;
        Matrix matrix = new Matrix();
        this.d = matrix;
        this.f = null;
        this.b = settranslatex_mediabrowsercompat_customactionresultreceiver.b;
        this.j = settranslatex_mediabrowsercompat_customactionresultreceiver.j;
        this.h = settranslatex_mediabrowsercompat_customactionresultreceiver.h;
        this.i = settranslatex_mediabrowsercompat_customactionresultreceiver.i;
        this.g = settranslatex_mediabrowsercompat_customactionresultreceiver.g;
        this.f285o = settranslatex_mediabrowsercompat_customactionresultreceiver.f285o;
        this.k = settranslatex_mediabrowsercompat_customactionresultreceiver.k;
        this.m = settranslatex_mediabrowsercompat_customactionresultreceiver.m;
        String str = settranslatex_mediabrowsercompat_customactionresultreceiver.f;
        this.f = str;
        this.c = settranslatex_mediabrowsercompat_customactionresultreceiver.c;
        if (str != null) {
            setthumbtextpadding.put(str, this);
        }
        matrix.set(settranslatex_mediabrowsercompat_customactionresultreceiver.d);
        ArrayList<setTranslateX.RemoteActionCompatParcelizer> arrayList = settranslatex_mediabrowsercompat_customactionresultreceiver.e;
        for (int i = 0; i < arrayList.size(); i++) {
            setTranslateX.RemoteActionCompatParcelizer remoteActionCompatParcelizer = arrayList.get(i);
            if (remoteActionCompatParcelizer instanceof setTranslateX$MediaBrowserCompat$CustomActionResultReceiver) {
                this.e.add(new setTranslateX$MediaBrowserCompat$CustomActionResultReceiver((setTranslateX$MediaBrowserCompat$CustomActionResultReceiver) remoteActionCompatParcelizer, setthumbtextpadding));
            } else {
                if (remoteActionCompatParcelizer instanceof setTranslateX.read) {
                    iconCompatParcelizer = new setTranslateX.read((setTranslateX.read) remoteActionCompatParcelizer);
                } else if (remoteActionCompatParcelizer instanceof setTranslateX.write) {
                    iconCompatParcelizer = new setTranslateX.write((setTranslateX.write) remoteActionCompatParcelizer);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.e.add(iconCompatParcelizer);
                if (iconCompatParcelizer.n != null) {
                    setthumbtextpadding.put(iconCompatParcelizer.n, iconCompatParcelizer);
                }
            }
        }
    }

    private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        this.m = null;
        this.b = isVisible.e(typedArray, xmlPullParser, "rotation", 5, this.b);
        this.j = typedArray.getFloat(1, this.j);
        this.h = typedArray.getFloat(2, this.h);
        this.i = isVisible.e(typedArray, xmlPullParser, "scaleX", 3, this.i);
        this.g = isVisible.e(typedArray, xmlPullParser, "scaleY", 4, this.g);
        this.f285o = isVisible.e(typedArray, xmlPullParser, "translateX", 6, this.f285o);
        this.k = isVisible.e(typedArray, xmlPullParser, "translateY", 7, this.k);
        String string = typedArray.getString(0);
        if (string != null) {
            this.f = string;
        }
        c();
    }

    private void c() {
        this.d.reset();
        this.d.postTranslate(-this.j, -this.h);
        this.d.postScale(this.i, this.g);
        this.d.postRotate(this.b, 0.0f, 0.0f);
        this.d.postTranslate(this.f285o + this.j, this.k + this.h);
    }

    @Override // o.setTranslateX.RemoteActionCompatParcelizer
    public boolean a(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.e.size(); i++) {
            z |= this.e.get(i).a(iArr);
        }
        return z;
    }

    public void d(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
        int[] iArr = getRotation.h;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        a(obtainAttributes, xmlPullParser);
        obtainAttributes.recycle();
    }

    @Override // o.setTranslateX.RemoteActionCompatParcelizer
    public boolean d() {
        for (int i = 0; i < this.e.size(); i++) {
            if (this.e.get(i).d()) {
                return true;
            }
        }
        return false;
    }

    public String getGroupName() {
        return this.f;
    }

    public Matrix getLocalMatrix() {
        return this.d;
    }

    public float getPivotX() {
        return this.j;
    }

    public float getPivotY() {
        return this.h;
    }

    public float getRotation() {
        return this.b;
    }

    public float getScaleX() {
        return this.i;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.f285o;
    }

    public float getTranslateY() {
        return this.k;
    }

    public void setPivotX(float f) {
        if (f != this.j) {
            this.j = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.b) {
            this.b = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f285o) {
            this.f285o = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.k) {
            this.k = f;
            c();
        }
    }
}
