package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes2-dex2jar.jar:o/CC26CFormKartuKreditFragment.class */
public final class CC26CFormKartuKreditFragment {
    private static final int[] d = {16843490};
    private static final int[] a = {16843489};
    private static final int[] c = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};

    /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
        if (r9 == null) goto L_0x0153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010f, code lost:
        if (r12 == null) goto L_0x0153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0112, code lost:
        r0 = new o.CC26BFormKartuKreditFragment_ViewBinding[r12.size()];
        r0 = r12.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012b, code lost:
        if (r0.hasNext() == false) goto L_0x0141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012e, code lost:
        r0[r16] = (o.CC26BFormKartuKreditFragment_ViewBinding) r0.next();
        r16 = r16 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0143, code lost:
        if (r10 != 0) goto L_0x014e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0146, code lost:
        r9.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014e, code lost:
        r9.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0155, code lost:
        return r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static o.CC26BFormKartuKreditFragment_ViewBinding a(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7, android.util.AttributeSet r8, o.CC26BFormKartuKreditFragment r9, int r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        // Method dump skipped, instructions count: 342
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CC26CFormKartuKreditFragment.a(android.content.Context, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, o.CC26BFormKartuKreditFragment, int):o.CC26BFormKartuKreditFragment_ViewBinding");
    }

    private static onClickUbahDataKartuTambahan3 a(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        onClickUbahDataKartuTambahan3 onclickubahdatakartutambahan3 = new onClickUbahDataKartuTambahan3();
        c(context, attributeSet, onclickubahdatakartutambahan3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
        onclickubahdatakartutambahan3.b(obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
        return onclickubahdatakartutambahan3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
        if (r18 <= 31) goto L_0x00be;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0170  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static o.onClickUbahDataPekerjaan c(android.content.Context r6, android.util.AttributeSet r7, o.onClickUbahDataPekerjaan r8) throws android.content.res.Resources.NotFoundException {
        /*
        // Method dump skipped, instructions count: 693
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CC26CFormKartuKreditFragment.c(android.content.Context, android.util.AttributeSet, o.onClickUbahDataPekerjaan):o.onClickUbahDataPekerjaan");
    }

    public static CC26BFormKartuKreditFragment_ViewBinding e(Context context, int i) throws Resources.NotFoundException {
        Throwable th;
        XmlPullParserException e;
        XmlResourceParser xmlResourceParser;
        IOException e2;
        XmlResourceParser xmlResourceParser2;
        XmlResourceParser animation;
        try {
            xmlResourceParser2 = null;
            xmlResourceParser = null;
            try {
                animation = context.getResources().getAnimation(i);
            } catch (IOException e3) {
                e2 = e3;
            } catch (XmlPullParserException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            CC26BFormKartuKreditFragment_ViewBinding a2 = a(context, animation, Xml.asAttributeSet(animation), null, 0);
            if (animation != null) {
                animation.close();
            }
            return a2;
        } catch (IOException e5) {
            e2 = e5;
            xmlResourceParser2 = animation;
            StringBuilder sb = new StringBuilder("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(sb.toString());
            notFoundException.initCause(e2);
            throw notFoundException;
        } catch (XmlPullParserException e6) {
            e = e6;
            xmlResourceParser = animation;
            StringBuilder sb2 = new StringBuilder("Can't load animation resource ID #0x");
            sb2.append(Integer.toHexString(i));
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(sb2.toString());
            notFoundException2.initCause(e);
            throw notFoundException2;
        } catch (Throwable th3) {
            th = th3;
            if (animation != null) {
                animation.close();
            }
            throw th;
        }
    }
}
