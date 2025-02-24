package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import o.isConsumed;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes-dex2jar.jar:o/setPivotX.class */
public class setPivotX {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setPivotX$RemoteActionCompatParcelizer.class */
    public static class RemoteActionCompatParcelizer implements TypeEvaluator<isConsumed.IconCompatParcelizer[]> {
        private isConsumed.IconCompatParcelizer[] c;

        RemoteActionCompatParcelizer() {
        }

        /* renamed from: e */
        public isConsumed.IconCompatParcelizer[] evaluate(float f, isConsumed.IconCompatParcelizer[] iconCompatParcelizerArr, isConsumed.IconCompatParcelizer[] iconCompatParcelizerArr2) {
            if (isConsumed.d(iconCompatParcelizerArr, iconCompatParcelizerArr2)) {
                if (!isConsumed.d(this.c, iconCompatParcelizerArr)) {
                    this.c = isConsumed.a(iconCompatParcelizerArr);
                }
                for (int i = 0; i < iconCompatParcelizerArr.length; i++) {
                    isConsumed.IconCompatParcelizer iconCompatParcelizer = this.c[i];
                    isConsumed.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizerArr[i];
                    isConsumed.IconCompatParcelizer iconCompatParcelizer3 = iconCompatParcelizerArr2[i];
                    iconCompatParcelizer.a = (char) iconCompatParcelizer2.a;
                    int i2 = 0;
                    while (true) {
                        float[] fArr = iconCompatParcelizer2.c;
                        if (i2 < fArr.length) {
                            iconCompatParcelizer.c[i2] = (fArr[i2] * (1.0f - f)) + (iconCompatParcelizer3.c[i2] * f);
                            i2++;
                        }
                    }
                }
                return this.c;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (a(r7) != false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static int a(android.content.res.TypedArray r3, int r4, int r5) {
        /*
            r0 = r3
            r1 = r4
            android.util.TypedValue r0 = r0.peekValue(r1)
            r6 = r0
            r0 = 1
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0015
            r0 = 1
            r4 = r0
            goto L_0x0017
        L_0x0015:
            r0 = 0
            r4 = r0
        L_0x0017:
            r0 = r4
            if (r0 == 0) goto L_0x0024
            r0 = r6
            int r0 = r0.type
            r9 = r0
            goto L_0x0027
        L_0x0024:
            r0 = 0
            r9 = r0
        L_0x0027:
            r0 = r3
            r1 = r5
            android.util.TypedValue r0 = r0.peekValue(r1)
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0037
            r0 = r7
            r5 = r0
            goto L_0x0039
        L_0x0037:
            r0 = 0
            r5 = r0
        L_0x0039:
            r0 = r5
            if (r0 == 0) goto L_0x0046
            r0 = r3
            int r0 = r0.type
            r7 = r0
            goto L_0x0049
        L_0x0046:
            r0 = 0
            r7 = r0
        L_0x0049:
            r0 = r4
            if (r0 == 0) goto L_0x0055
            r0 = r9
            boolean r0 = a(r0)
            if (r0 != 0) goto L_0x0067
        L_0x0055:
            r0 = r8
            r4 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0069
            r0 = r8
            r4 = r0
            r0 = r7
            boolean r0 = a(r0)
            if (r0 == 0) goto L_0x0069
        L_0x0067:
            r0 = 3
            r4 = r0
        L_0x0069:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPivotX.a(android.content.res.TypedArray, int, int):int");
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, int i, float f) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser;
        try {
            XmlResourceParser xmlResourceParser2 = null;
            XmlResourceParser xmlResourceParser3 = null;
            xmlResourceParser = null;
            try {
                XmlResourceParser animation = resources.getAnimation(i);
                xmlResourceParser = animation;
                xmlResourceParser2 = animation;
                xmlResourceParser3 = animation;
                Animator b = b(context, resources, theme, animation, f);
                if (animation != null) {
                    animation.close();
                }
                return b;
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder("Can't load animation resource ID #0x");
                sb.append(Integer.toHexString(i));
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(sb.toString());
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (XmlPullParserException e2) {
                StringBuilder sb2 = new StringBuilder("Can't load animation resource ID #0x");
                sb2.append(Integer.toHexString(i));
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(sb2.toString());
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x000e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static android.animation.Animator a(android.content.Context r12, android.content.res.Resources r13, android.content.res.Resources.Theme r14, org.xmlpull.v1.XmlPullParser r15, android.util.AttributeSet r16, android.animation.AnimatorSet r17, int r18, float r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        // Method dump skipped, instructions count: 450
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPivotX.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static ObjectAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        c(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    private static void a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        float length;
        PropertyValuesHolder propertyValuesHolder;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            length = f3 + pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
            f3 = length;
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (length / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = length / ((float) (min - 1));
        int i = 0;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            i2 = i2;
            if (i3 < arrayList.size()) {
                i2 = i2;
                if (f2 > ((Float) arrayList.get(i3)).floatValue()) {
                    pathMeasure2.nextContour();
                    i2 = i3;
                }
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, propertyValuesHolder);
        }
    }

    private static boolean a(int i) {
        return i >= 28 && i <= 31;
    }

    private static Animator b(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) throws XmlPullParserException, IOException {
        return a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    private static void b(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String d = isVisible.d(typedArray, xmlPullParser, "pathData", 1);
        if (d != null) {
            String d2 = isVisible.d(typedArray, xmlPullParser, "propertyXName", 2);
            String d3 = isVisible.d(typedArray, xmlPullParser, "propertyYName", 3);
            if (d2 == null && d3 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(typedArray.getPositionDescription());
                sb.append(" propertyXName or propertyYName is needed for PathData");
                throw new InflateException(sb.toString());
            }
            a(isConsumed.d(d), objectAnimator, f * 0.5f, d2, d3);
            return;
        }
        objectAnimator.setPropertyName(isVisible.d(typedArray, xmlPullParser, "propertyName", 0));
    }

    public static Animator c(Context context, int i) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i) : e(context, context.getResources(), context.getTheme(), i);
    }

    private static Keyframe c(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
        if (r0 != null) goto L_0x00ba;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02be  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static android.animation.PropertyValuesHolder c(android.content.res.TypedArray r7, int r8, int r9, int r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 722
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPivotX.c(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    private static ValueAnimator c(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        int[] iArr = getRotation.c;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int[] iArr2 = getRotation.f;
        TypedArray obtainAttributes2 = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
        ValueAnimator valueAnimator2 = valueAnimator;
        if (valueAnimator == null) {
            valueAnimator2 = new ValueAnimator();
        }
        d(valueAnimator2, obtainAttributes, obtainAttributes2, f, xmlPullParser);
        int c = isVisible.c(obtainAttributes, xmlPullParser, "interpolator", 0, 0);
        if (c > 0) {
            valueAnimator2.setInterpolator(setPivotY.d(context, c));
        }
        obtainAttributes.recycle();
        if (obtainAttributes2 != null) {
            obtainAttributes2.recycle();
        }
        return valueAnimator2;
    }

    private static void c(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    private static int d(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        int[] iArr = getRotation.e;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        TypedValue c = isVisible.c(obtainAttributes, xmlPullParser, "value", 0);
        int i = 0;
        if (c != null) {
            i = 0;
            if (a(c.type)) {
                i = 3;
            }
        }
        obtainAttributes.recycle();
        return i;
    }

    private static void d(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long d = (long) isVisible.d(typedArray, xmlPullParser, "duration", 1, 300);
        long d2 = (long) isVisible.d(typedArray, xmlPullParser, "startOffset", 2, 0);
        int d3 = isVisible.d(typedArray, xmlPullParser, "valueType", 7, 4);
        int i = d3;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null) {
            i = d3;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
                int i2 = d3;
                if (d3 == 4) {
                    i2 = a(typedArray, 5, 6);
                }
                PropertyValuesHolder c = c(typedArray, i2, 5, 6, "");
                i = i2;
                if (c != null) {
                    valueAnimator.setValues(c);
                    i = i2;
                }
            }
        }
        valueAnimator.setDuration(d);
        valueAnimator.setStartDelay(d2);
        valueAnimator.setRepeatCount(isVisible.d(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(isVisible.d(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            b(valueAnimator, typedArray2, i, f, xmlPullParser);
        }
    }

    private static PropertyValuesHolder[] d(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            i = 0;
            if (eventType == 3 || eventType == 1) {
                break;
            } else if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    int[] iArr = getRotation.j;
                    TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                    String d = isVisible.d(obtainAttributes, xmlPullParser, "propertyName", 3);
                    int d2 = isVisible.d(obtainAttributes, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder e = e(context, resources, theme, xmlPullParser, d, d2);
                    PropertyValuesHolder propertyValuesHolder = e;
                    if (e == null) {
                        propertyValuesHolder = c(obtainAttributes, d2, 0, 1, d);
                    }
                    arrayList = arrayList;
                    if (propertyValuesHolder != null) {
                        arrayList = arrayList;
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(propertyValuesHolder);
                    }
                    obtainAttributes.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[size];
            while (true) {
                propertyValuesHolderArr = propertyValuesHolderArr2;
                if (i >= size) {
                    break;
                }
                propertyValuesHolderArr2[i] = (PropertyValuesHolder) arrayList.get(i);
                i++;
            }
        }
        return propertyValuesHolderArr;
    }

    public static Animator e(Context context, Resources resources, Resources.Theme theme, int i) throws Resources.NotFoundException {
        return a(context, resources, theme, i, 1.0f);
    }

    private static Keyframe e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int[] iArr = getRotation.e;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        float e = isVisible.e(obtainAttributes, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue c = isVisible.c(obtainAttributes, xmlPullParser, "value", 0);
        boolean z = c != null;
        int i2 = i;
        if (i == 4) {
            i2 = (!z || !a(c.type)) ? 0 : 3;
        }
        Keyframe ofInt = z ? i2 != 0 ? (i2 == 1 || i2 == 3) ? Keyframe.ofInt(e, isVisible.d(obtainAttributes, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(e, isVisible.e(obtainAttributes, xmlPullParser, "value", 0, 0.0f)) : i2 == 0 ? Keyframe.ofFloat(e) : Keyframe.ofInt(e);
        int c2 = isVisible.c(obtainAttributes, xmlPullParser, "interpolator", 1, 0);
        if (c2 > 0) {
            ofInt.setInterpolator(setPivotY.d(context, c2));
        }
        obtainAttributes.recycle();
        return ofInt;
    }

    private static PropertyValuesHolder e(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        ArrayList arrayList = null;
        int i2 = i;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                int i3 = i2;
                if (i2 == 4) {
                    i3 = d(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe e = e(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i3, xmlPullParser);
                arrayList = arrayList;
                if (e != null) {
                    arrayList = arrayList;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(e);
                }
                xmlPullParser.next();
                i2 = i3;
            }
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolder = null;
            if (size > 0) {
                Keyframe keyframe = (Keyframe) arrayList.get(0);
                Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
                float fraction = keyframe2.getFraction();
                int i4 = size;
                if (fraction < 1.0f) {
                    if (fraction < 0.0f) {
                        keyframe2.setFraction(1.0f);
                        i4 = size;
                    } else {
                        arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                        i4 = size + 1;
                    }
                }
                float fraction2 = keyframe.getFraction();
                int i5 = i4;
                if (fraction2 != 0.0f) {
                    if (fraction2 < 0.0f) {
                        keyframe.setFraction(0.0f);
                        i5 = i4;
                    } else {
                        arrayList.add(0, c(keyframe, 0.0f));
                        i5 = i4 + 1;
                    }
                }
                Keyframe[] keyframeArr = new Keyframe[i5];
                arrayList.toArray(keyframeArr);
                for (int i6 = 0; i6 < i5; i6++) {
                    Keyframe keyframe3 = keyframeArr[i6];
                    if (keyframe3.getFraction() < 0.0f) {
                        if (i6 == 0) {
                            keyframe3.setFraction(0.0f);
                        } else {
                            int i7 = i5 - 1;
                            if (i6 == i7) {
                                keyframe3.setFraction(1.0f);
                            } else {
                                int i8 = i6 + 1;
                                int i9 = i6;
                                while (i8 < i7 && keyframeArr[i8].getFraction() < 0.0f) {
                                    i9 = i8;
                                    i8++;
                                }
                                c(keyframeArr, keyframeArr[i9 + 1].getFraction() - keyframeArr[i6 - 1].getFraction(), i6, i9);
                            }
                        }
                    }
                }
                PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
                propertyValuesHolder = ofKeyframe;
                if (i2 == 3) {
                    ofKeyframe.setEvaluator(getTranslateX.b());
                    propertyValuesHolder = ofKeyframe;
                }
            }
        }
        return propertyValuesHolder;
    }
}
