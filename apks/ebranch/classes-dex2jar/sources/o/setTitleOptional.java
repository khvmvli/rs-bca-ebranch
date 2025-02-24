package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import o.setHasNonEmbeddedTabs;
import o.setTransitioning;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes-dex2jar.jar:o/setTitleOptional.class */
class setTitleOptional extends setTransitioning {
    private RemoteActionCompatParcelizer a;
    private boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setTitleOptional$RemoteActionCompatParcelizer.class */
    public static class RemoteActionCompatParcelizer extends setTransitioning.IconCompatParcelizer {
        int[][] K;

        /* JADX INFO: Access modifiers changed from: package-private */
        public RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, setTitleOptional settitleoptional, Resources resources) {
            super(remoteActionCompatParcelizer, settitleoptional, resources);
            if (remoteActionCompatParcelizer != null) {
                this.K = remoteActionCompatParcelizer.K;
            } else {
                this.K = new int[b()];
            }
        }

        @Override // o.setTransitioning.IconCompatParcelizer
        public void b(int i, int i2) {
            b(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.K, 0, iArr, 0, i);
            this.K = iArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int d(int[] iArr, Drawable drawable) {
            int a = a(drawable);
            this.K[a] = iArr;
            return a;
        }

        @Override // o.setTransitioning.IconCompatParcelizer
        void d() {
            int[][] iArr = this.K;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.K[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.K = iArr2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int e(int[] iArr) {
            int[][] iArr2 = this.K;
            int a = a();
            for (int i = 0; i < a; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new setTitleOptional(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new setTitleOptional(this, resources);
        }
    }

    setTitleOptional() {
        this(null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTitleOptional(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (remoteActionCompatParcelizer != null) {
            e(remoteActionCompatParcelizer);
        }
    }

    setTitleOptional(RemoteActionCompatParcelizer remoteActionCompatParcelizer, Resources resources) {
        e(new RemoteActionCompatParcelizer(remoteActionCompatParcelizer, this, resources));
        onStateChange(getState());
    }

    private void b(TypedArray typedArray) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.a;
        remoteActionCompatParcelizer.c |= typedArray.getChangingConfigurations();
        remoteActionCompatParcelizer.L = typedArray.getBoolean(setHasNonEmbeddedTabs.write.A, remoteActionCompatParcelizer.L);
        remoteActionCompatParcelizer.r = typedArray.getBoolean(setHasNonEmbeddedTabs.write.y, remoteActionCompatParcelizer.r);
        remoteActionCompatParcelizer.y = typedArray.getInt(setHasNonEmbeddedTabs.write.z, remoteActionCompatParcelizer.y);
        remoteActionCompatParcelizer.w = typedArray.getInt(setHasNonEmbeddedTabs.write.B, remoteActionCompatParcelizer.w);
        remoteActionCompatParcelizer.t = typedArray.getBoolean(setHasNonEmbeddedTabs.write.v, remoteActionCompatParcelizer.t);
    }

    private void e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.a;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next2 == 3) {
                    return;
                }
                if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                    int[] iArr = setHasNonEmbeddedTabs.write.x;
                    TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                    int resourceId = obtainAttributes.getResourceId(setHasNonEmbeddedTabs.write.u, -1);
                    Drawable c = resourceId > 0 ? SearchView.e().c(context, resourceId) : null;
                    obtainAttributes.recycle();
                    int[] d = d(attributeSet);
                    Drawable drawable = c;
                    if (c == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next == 2) {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(xmlPullParser.getPositionDescription());
                            sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                            throw new XmlPullParserException(sb.toString());
                        }
                    }
                    remoteActionCompatParcelizer.d(d, drawable);
                }
            } else {
                return;
            }
        }
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        applyTheme(theme);
        onStateChange(getState());
    }

    public void c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int[] iArr = setHasNonEmbeddedTabs.write.w;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        setVisible(obtainAttributes.getBoolean(setHasNonEmbeddedTabs.write.C, true), true);
        b(obtainAttributes);
        a(resources);
        obtainAttributes.recycle();
        e(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public RemoteActionCompatParcelizer e() {
        return new RemoteActionCompatParcelizer(this.a, this, null);
    }

    int[] d(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            i = i;
            if (attributeNameResource != 0) {
                i = i;
                if (attributeNameResource != 16842960) {
                    i = i;
                    if (attributeNameResource != 16843161) {
                        iArr[i] = attributeSet.getAttributeBooleanValue(i2, false) ? attributeNameResource : -attributeNameResource;
                        i++;
                    }
                }
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setTransitioning
    public void e(setTransitioning.IconCompatParcelizer iconCompatParcelizer) {
        e(iconCompatParcelizer);
        if (iconCompatParcelizer instanceof RemoteActionCompatParcelizer) {
            this.a = (RemoteActionCompatParcelizer) iconCompatParcelizer;
        }
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.b && mutate() == this) {
            this.a.d();
            this.b = true;
        }
        return this;
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = onStateChange(iArr);
        int e = this.a.e(iArr);
        int i = e;
        if (e < 0) {
            i = this.a.e(StateSet.WILD_CARD);
        }
        return e(i) || onStateChange;
    }
}
