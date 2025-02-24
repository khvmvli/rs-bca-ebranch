package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o.IconCompatParcelizer;
import o.IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver;
import o.MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver;
/* loaded from: classes-dex2jar.jar:android/support/v4/media/MediaDescriptionCompat.class */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() { // from class: android.support.v4.media.MediaDescriptionCompat.4
        /* renamed from: a */
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.b(IconCompatParcelizer.d(parcel));
        }

        /* renamed from: d */
        public final MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };
    private Object a;
    private final Bundle b;
    private final Uri c;
    private final Bitmap d;
    private final CharSequence e;
    private final Uri f;
    private final CharSequence g;
    private final CharSequence i;
    private final String j;

    /* loaded from: classes-dex2jar.jar:android/support/v4/media/MediaDescriptionCompat$write.class */
    public static final class write {
        private CharSequence a;
        private Bundle b;
        private Bitmap c;
        private Uri d;
        private String e;
        private CharSequence f;
        private Uri i;
        private CharSequence j;

        public final write a(Bundle bundle) {
            this.b = bundle;
            return this;
        }

        public final write a(CharSequence charSequence) {
            this.j = charSequence;
            return this;
        }

        public final write a(String str) {
            this.e = str;
            return this;
        }

        public final write b(CharSequence charSequence) {
            this.f = charSequence;
            return this;
        }

        public final write c(Uri uri) {
            this.d = uri;
            return this;
        }

        public final write d(Bitmap bitmap) {
            this.c = bitmap;
            return this;
        }

        public final write d(Uri uri) {
            this.i = uri;
            return this;
        }

        public final write d(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public final MediaDescriptionCompat d() {
            return new MediaDescriptionCompat(this.e, this.f, this.j, this.a, this.c, this.d, this.b, this.i);
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.j = str;
        this.i = charSequence;
        this.g = charSequence2;
        this.e = charSequence3;
        this.d = bitmap;
        this.c = uri;
        this.b = bundle;
        this.f = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static android.support.v4.media.MediaDescriptionCompat b(java.lang.Object r3) {
        /*
            r0 = 0
            r4 = r0
            r0 = 0
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x00bc
            android.support.v4.media.MediaDescriptionCompat$write r0 = new android.support.v4.media.MediaDescriptionCompat$write
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            r1 = r3
            java.lang.String r1 = o.IconCompatParcelizer.c(r1)
            android.support.v4.media.MediaDescriptionCompat$write r0 = r0.a(r1)
            r0 = r6
            r1 = r3
            java.lang.CharSequence r1 = o.IconCompatParcelizer.f(r1)
            android.support.v4.media.MediaDescriptionCompat$write r0 = r0.b(r1)
            r0 = r6
            r1 = r3
            java.lang.CharSequence r1 = o.IconCompatParcelizer.h(r1)
            android.support.v4.media.MediaDescriptionCompat$write r0 = r0.a(r1)
            r0 = r6
            r1 = r3
            java.lang.CharSequence r1 = o.IconCompatParcelizer.e(r1)
            android.support.v4.media.MediaDescriptionCompat$write r0 = r0.d(r1)
            r0 = r6
            r1 = r3
            android.graphics.Bitmap r1 = o.IconCompatParcelizer.a(r1)
            android.support.v4.media.MediaDescriptionCompat$write r0 = r0.d(r1)
            r0 = r6
            r1 = r3
            android.net.Uri r1 = o.IconCompatParcelizer.d(r1)
            android.support.v4.media.MediaDescriptionCompat$write r0 = r0.c(r1)
            r0 = r3
            android.os.Bundle r0 = o.IconCompatParcelizer.b(r0)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L_0x0064
            r0 = r7
            android.support.v4.media.session.MediaSessionCompat.d(r0)
            r0 = r7
            java.lang.String r1 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            android.net.Uri r0 = (android.net.Uri) r0
            r4 = r0
            goto L_0x0066
        L_0x0064:
            r0 = 0
            r4 = r0
        L_0x0066:
            r0 = r4
            if (r0 == 0) goto L_0x008b
            r0 = r7
            java.lang.String r1 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x007d
            r0 = r7
            int r0 = r0.size()
            r1 = 2
            if (r0 == r1) goto L_0x008e
        L_0x007d:
            r0 = r7
            java.lang.String r1 = "android.support.v4.media.description.MEDIA_URI"
            r0.remove(r1)
            r0 = r7
            java.lang.String r1 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            r0.remove(r1)
        L_0x008b:
            r0 = r7
            r5 = r0
        L_0x008e:
            r0 = r6
            r1 = r5
            android.support.v4.media.MediaDescriptionCompat$write r0 = r0.a(r1)
            r0 = r4
            if (r0 == 0) goto L_0x00a1
            r0 = r6
            r1 = r4
            android.support.v4.media.MediaDescriptionCompat$write r0 = r0.d(r1)
            goto L_0x00b2
        L_0x00a1:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x00b2
            r0 = r6
            r1 = r3
            android.net.Uri r1 = o.MediaBrowserCompat$CustomActionResultReceiver.e(r1)
            android.support.v4.media.MediaDescriptionCompat$write r0 = r0.d(r1)
        L_0x00b2:
            r0 = r6
            android.support.v4.media.MediaDescriptionCompat r0 = r0.d()
            r4 = r0
            r0 = r4
            r1 = r3
            r0.a = r1
        L_0x00bc:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.b(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Object e() {
        Object obj = this.a;
        Object obj2 = obj;
        if (obj == null) {
            Object e = IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver.e();
            IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver.d(e, this.j);
            IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver.d(e, this.i);
            IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver.a(e, this.g);
            IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver.c(e, this.e);
            IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver.c(e, this.d);
            IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver.d(e, this.c);
            Bundle bundle = this.b;
            Bundle bundle2 = bundle;
            if (Build.VERSION.SDK_INT < 23) {
                bundle2 = bundle;
                if (this.f != null) {
                    bundle2 = bundle;
                    if (bundle == null) {
                        bundle2 = new Bundle();
                        bundle2.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                    }
                    bundle2.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f);
                }
            }
            IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver.c(e, bundle2);
            if (Build.VERSION.SDK_INT >= 23) {
                MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver.b(e, this.f);
            }
            obj2 = IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver.e(e);
            this.a = obj2;
        }
        return obj2;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.i);
        sb.append(", ");
        sb.append((Object) this.g);
        sb.append(", ");
        sb.append((Object) this.e);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IconCompatParcelizer.b(e(), parcel, i);
    }
}
