package o;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import o.setGuidelineBegin;
/* loaded from: classes-dex2jar.jar:o/ParseException.class */
public class ParseException {

    /* loaded from: classes-dex2jar.jar:o/ParseException$IconCompatParcelizer.class */
    public static class IconCompatParcelizer extends ParseException$MediaBrowserCompat$SearchResultReceiver {
        private IconCompat c;
        private boolean f;
        private Bitmap j;

        /* renamed from: o.ParseException$IconCompatParcelizer$IconCompatParcelizer */
        /* loaded from: classes-dex2jar.jar:o/ParseException$IconCompatParcelizer$IconCompatParcelizer.class */
        static class C0003IconCompatParcelizer {
            static void d(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }

            static void e(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }
        }

        /* loaded from: classes-dex2jar.jar:o/ParseException$IconCompatParcelizer$read.class */
        static class read {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        public IconCompatParcelizer b(Bitmap bitmap) {
            this.j = bitmap;
            return this;
        }

        public IconCompatParcelizer c(Bitmap bitmap) {
            this.c = bitmap == null ? null : IconCompat.d(bitmap);
            this.f = true;
            return this;
        }

        @Override // o.ParseException$MediaBrowserCompat$SearchResultReceiver
        protected String e() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // o.ParseException$MediaBrowserCompat$SearchResultReceiver
        public void e(OperationCanceledException operationCanceledException) {
            Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(operationCanceledException.d()).setBigContentTitle(this.e).bigPicture(this.j);
            if (this.f) {
                Context context = null;
                if (this.c != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        if (operationCanceledException instanceof consumeSystemWindowInsets) {
                            context = ((consumeSystemWindowInsets) operationCanceledException).b();
                        }
                        read.a(bigPicture, this.c.c(context));
                    } else if (this.c.d() == 1) {
                        C0003IconCompatParcelizer.e(bigPicture, this.c.b());
                    }
                }
                C0003IconCompatParcelizer.e(bigPicture, null);
            }
            if (this.b) {
                C0003IconCompatParcelizer.d(bigPicture, this.a);
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/ParseException$RemoteActionCompatParcelizer.class */
    public static class RemoteActionCompatParcelizer {
        int A;
        public ArrayList<consumeStableInsets> B;
        getDisplayCutout C;
        Notification D;
        int E;
        boolean F;
        int G;
        Notification H;
        int I;
        String J;
        CharSequence[] K;
        boolean L;
        CharSequence M;
        boolean N;
        CharSequence O;
        String P;
        ParseException$MediaBrowserCompat$SearchResultReceiver Q;
        RemoteViews R;
        Icon S;
        long T;
        boolean U;
        int W;
        public ArrayList<ParseException$MediaBrowserCompat$CustomActionResultReceiver> a;
        boolean b;
        read c;
        int d;
        RemoteViews e;
        boolean f;
        boolean g;
        String h;
        int i;
        String j;
        CharSequence k;
        CharSequence l;
        RemoteViews m;
        CharSequence n;

        /* renamed from: o */
        PendingIntent f125o;
        Bundle p;
        String q;
        PendingIntent r;
        public Context s;
        int t;
        ArrayList<ParseException$MediaBrowserCompat$CustomActionResultReceiver> u;
        boolean v;
        boolean w;
        RemoteViews x;
        Bitmap y;
        @Deprecated
        public ArrayList<String> z;

        @Deprecated
        public RemoteActionCompatParcelizer(Context context) {
            this(context, null);
        }

        public RemoteActionCompatParcelizer(Context context, String str) {
            this.a = new ArrayList<>();
            this.B = new ArrayList<>();
            this.u = new ArrayList<>();
            this.N = true;
            this.w = false;
            this.i = 0;
            this.W = 0;
            this.d = 0;
            this.t = 0;
            Notification notification = new Notification();
            this.D = notification;
            this.s = context;
            this.j = str;
            notification.when = System.currentTimeMillis();
            this.D.audioStreamType = -1;
            this.G = 0;
            this.z = new ArrayList<>();
            this.b = true;
        }

        private Bitmap a(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            if (bitmap != null) {
                if (Build.VERSION.SDK_INT >= 27) {
                    bitmap2 = bitmap;
                } else {
                    Resources resources = this.s.getResources();
                    int dimensionPixelSize = resources.getDimensionPixelSize(setGuidelineBegin.IconCompatParcelizer.c);
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(setGuidelineBegin.IconCompatParcelizer.b);
                    if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                        return bitmap;
                    }
                    double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
                }
            }
            return bitmap2;
        }

        public static CharSequence a(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            CharSequence charSequence2 = charSequence;
            if (charSequence.length() > 5120) {
                charSequence2 = charSequence.subSequence(0, 5120);
            }
            return charSequence2;
        }

        private void e(int i, boolean z) {
            if (z) {
                Notification notification = this.D;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.D;
            notification2.flags = (i ^ -1) & notification2.flags;
        }

        public Bundle a() {
            if (this.p == null) {
                this.p = new Bundle();
            }
            return this.p;
        }

        public RemoteActionCompatParcelizer a(int i) {
            this.i = i;
            return this;
        }

        public RemoteActionCompatParcelizer a(ParseException$MediaBrowserCompat$SearchResultReceiver parseException$MediaBrowserCompat$SearchResultReceiver) {
            if (this.Q != parseException$MediaBrowserCompat$SearchResultReceiver) {
                this.Q = parseException$MediaBrowserCompat$SearchResultReceiver;
                if (parseException$MediaBrowserCompat$SearchResultReceiver != null) {
                    parseException$MediaBrowserCompat$SearchResultReceiver.d(this);
                }
            }
            return this;
        }

        public RemoteActionCompatParcelizer a(boolean z) {
            this.w = z;
            return this;
        }

        public Notification b() {
            return new consumeSystemWindowInsets(this).e();
        }

        public RemoteActionCompatParcelizer b(int i) {
            this.A = i;
            return this;
        }

        public RemoteActionCompatParcelizer b(PendingIntent pendingIntent) {
            this.D.deleteIntent = pendingIntent;
            return this;
        }

        public RemoteActionCompatParcelizer b(CharSequence charSequence) {
            this.n = a(charSequence);
            return this;
        }

        public RemoteActionCompatParcelizer b(String str) {
            this.j = str;
            return this;
        }

        public RemoteActionCompatParcelizer b(boolean z) {
            this.N = z;
            return this;
        }

        public RemoteActionCompatParcelizer c(int i) {
            this.G = i;
            return this;
        }

        public RemoteActionCompatParcelizer c(PendingIntent pendingIntent) {
            this.f125o = pendingIntent;
            return this;
        }

        public RemoteActionCompatParcelizer c(CharSequence charSequence) {
            this.D.tickerText = a(charSequence);
            return this;
        }

        public RemoteActionCompatParcelizer c(long[] jArr) {
            this.D.vibrate = jArr;
            return this;
        }

        public RemoteActionCompatParcelizer d(int i) {
            this.D.defaults = i;
            if ((i & 4) != 0) {
                this.D.flags |= 1;
            }
            return this;
        }

        public RemoteActionCompatParcelizer d(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.a.add(new ParseException$MediaBrowserCompat$CustomActionResultReceiver(i, charSequence, pendingIntent));
            return this;
        }

        public RemoteActionCompatParcelizer d(long j) {
            this.D.when = j;
            return this;
        }

        public RemoteActionCompatParcelizer d(Bitmap bitmap) {
            this.y = a(bitmap);
            return this;
        }

        public RemoteActionCompatParcelizer d(CharSequence charSequence) {
            this.k = a(charSequence);
            return this;
        }

        public RemoteActionCompatParcelizer e(int i) {
            this.D.icon = i;
            return this;
        }

        public RemoteActionCompatParcelizer e(int i, int i2, int i3) {
            this.D.ledARGB = i;
            this.D.ledOnMS = i2;
            this.D.ledOffMS = i3;
            int i4 = (this.D.ledOnMS == 0 || this.D.ledOffMS == 0) ? 0 : 1;
            Notification notification = this.D;
            notification.flags = i4 | (notification.flags & -2);
            return this;
        }

        public RemoteActionCompatParcelizer e(Uri uri) {
            this.D.sound = uri;
            this.D.audioStreamType = -1;
            this.D.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        public RemoteActionCompatParcelizer e(boolean z) {
            e(16, z);
            return this;
        }

        public RemoteActionCompatParcelizer i(int i) {
            this.W = i;
            return this;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/ParseException$read.class */
    public static final class read {
        private int a;
        private int b;
        private IconCompat c;
        private PendingIntent d;
        private int e;
        private PendingIntent f;
        private String h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes-dex2jar.jar:o/ParseException$read$IconCompatParcelizer.class */
        public static class IconCompatParcelizer {
            static Notification.BubbleMetadata c(read read) {
                if (read == null || read.g() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(read.e().h()).setIntent(read.g()).setDeleteIntent(read.a()).setAutoExpandBubble(read.c()).setSuppressNotification(read.i());
                if (read.b() != 0) {
                    suppressNotification.setDesiredHeight(read.b());
                }
                if (read.d() != 0) {
                    suppressNotification.setDesiredHeightResId(read.d());
                }
                return suppressNotification.build();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes-dex2jar.jar:o/ParseException$read$write.class */
        public static class write {
            static Notification.BubbleMetadata a(read read) {
                if (read == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = read.f() != null ? new Notification.BubbleMetadata.Builder(read.f()) : new Notification.BubbleMetadata.Builder(read.g(), read.e().h());
                builder.setDeleteIntent(read.a()).setAutoExpandBubble(read.c()).setSuppressNotification(read.i());
                if (read.b() != 0) {
                    builder.setDesiredHeight(read.b());
                }
                if (read.d() != 0) {
                    builder.setDesiredHeightResId(read.d());
                }
                return builder.build();
            }
        }

        public static Notification.BubbleMetadata e(read read) {
            if (read == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                return write.a(read);
            }
            if (Build.VERSION.SDK_INT == 29) {
                return IconCompatParcelizer.c(read);
            }
            return null;
        }

        public final PendingIntent a() {
            return this.d;
        }

        public final int b() {
            return this.b;
        }

        public final boolean c() {
            boolean z = true;
            if ((this.a & 1) == 0) {
                z = false;
            }
            return z;
        }

        public final int d() {
            return this.e;
        }

        public final IconCompat e() {
            return this.c;
        }

        public final String f() {
            return this.h;
        }

        public final PendingIntent g() {
            return this.f;
        }

        public final boolean i() {
            return (this.a & 2) != 0;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/ParseException$write.class */
    public static class write extends ParseException$MediaBrowserCompat$SearchResultReceiver {
        private CharSequence c;

        @Override // o.ParseException$MediaBrowserCompat$SearchResultReceiver
        public void b(Bundle bundle) {
            b(bundle);
        }

        public write c(CharSequence charSequence) {
            this.c = RemoteActionCompatParcelizer.a(charSequence);
            return this;
        }

        @Override // o.ParseException$MediaBrowserCompat$SearchResultReceiver
        protected String e() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // o.ParseException$MediaBrowserCompat$SearchResultReceiver
        public void e(OperationCanceledException operationCanceledException) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(operationCanceledException.d()).setBigContentTitle(this.e).bigText(this.c);
            if (this.b) {
                bigText.setSummaryText(this.a);
            }
        }
    }

    public static Bundle e(Notification notification) {
        return notification.extras;
    }
}
