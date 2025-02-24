package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import java.io.IOException;
import java.io.InputStream;
import o.createFragmentContainer;
import o.getSystemGestureInsets;
/* loaded from: classes-dex2jar.jar:o/getRootStableInsets.class */
public class getRootStableInsets extends isTypeVisible {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.isTypeVisible
    public Typeface a(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // o.isTypeVisible
    public Typeface c(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (r0 != null) goto L_0x0090;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
        if (r0 != null) goto L_0x0090;
     */
    @Override // o.isTypeVisible
    /* Code decompiled incorrectly, please refer to instructions dump */
    public android.graphics.Typeface c(android.content.Context r6, android.os.CancellationSignal r7, o.createFragmentContainer.IconCompatParcelizer[] r8, int r9) {
        /*
        // Method dump skipped, instructions count: 278
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRootStableInsets.c(android.content.Context, android.os.CancellationSignal, o.createFragmentContainer$IconCompatParcelizer[], int):android.graphics.Typeface");
    }

    @Override // o.isTypeVisible
    public Typeface c(Context context, getSystemGestureInsets.read read, Resources resources, int i) {
        int i2;
        FontFamily.Builder builder;
        Typeface typeface = null;
        try {
            getSystemGestureInsets.IconCompatParcelizer[] c = read.c();
            i2 = 0;
            builder = null;
            for (getSystemGestureInsets.IconCompatParcelizer iconCompatParcelizer : c) {
                try {
                    Font build = new Font.Builder(resources, iconCompatParcelizer.e()).setWeight(iconCompatParcelizer.c()).setSlant(iconCompatParcelizer.i() ? 1 : 0).setTtcIndex(iconCompatParcelizer.a()).setFontVariationSettings(iconCompatParcelizer.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException e) {
                }
            }
        } catch (Exception e2) {
        }
        if (builder == null) {
            return null;
        }
        int i3 = (i & 1) != 0 ? 700 : 400;
        if ((i & 2) != 0) {
            i2 = 1;
        }
        typeface = new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i3, i2)).build();
        return typeface;
    }

    @Override // o.isTypeVisible
    protected createFragmentContainer.IconCompatParcelizer d(createFragmentContainer.IconCompatParcelizer[] iconCompatParcelizerArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
