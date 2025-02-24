package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
/* loaded from: classes2-dex2jar.jar:o/indexOf.class */
public final class indexOf {

    /* loaded from: classes2-dex2jar.jar:o/indexOf$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void b(File file);

        void c(Exception exc);
    }

    /* loaded from: classes2-dex2jar.jar:o/indexOf$read.class */
    public static final class read {
        private Context a;

        private read(Context context) {
            this.a = context;
        }

        public /* synthetic */ read(Context context, byte b) {
            this(context);
        }
    }

    private static void a(Intent intent, Activity activity, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        try {
            File e = readProcessName.e(activity, intent.getData());
            indexOf$MediaBrowserCompat$CustomActionResultReceiver indexof_mediabrowsercompat_customactionresultreceiver = indexOf$MediaBrowserCompat$CustomActionResultReceiver.DOCUMENTS;
            PreferenceManager.getDefaultSharedPreferences(activity).getInt("pl.aprilapps.easyphotopicker.type", 0);
            remoteActionCompatParcelizer.b(e);
        } catch (Exception e2) {
            e2.printStackTrace();
            indexOf$MediaBrowserCompat$CustomActionResultReceiver indexof_mediabrowsercompat_customactionresultreceiver2 = indexOf$MediaBrowserCompat$CustomActionResultReceiver.DOCUMENTS;
            PreferenceManager.getDefaultSharedPreferences(activity).getInt("pl.aprilapps.easyphotopicker.type", 0);
            remoteActionCompatParcelizer.c(e2);
        }
    }

    public static Intent b(Context context, int i) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("pl.aprilapps.easyphotopicker.type", i).commit();
        return new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    }

    public static void c(int i, int i2, Intent intent, Activity activity, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (i != 7460 && i != 7458 && i != 7459 && i != 7457) {
            return;
        }
        if (i2 == -1) {
            if (i == 7457) {
                a(intent, activity, remoteActionCompatParcelizer);
            } else if (i == 7458) {
                e(intent, activity, remoteActionCompatParcelizer);
            } else if (i == 7459) {
                c(activity, remoteActionCompatParcelizer);
            } else if (intent == null || intent.getData() == null) {
                c(activity, remoteActionCompatParcelizer);
            } else {
                a(intent, activity, remoteActionCompatParcelizer);
            }
        } else if (i == 7457) {
            indexOf$MediaBrowserCompat$CustomActionResultReceiver indexof_mediabrowsercompat_customactionresultreceiver = indexOf$MediaBrowserCompat$CustomActionResultReceiver.DOCUMENTS;
            PreferenceManager.getDefaultSharedPreferences(activity).getInt("pl.aprilapps.easyphotopicker.type", 0);
        } else if (i == 7458) {
            indexOf$MediaBrowserCompat$CustomActionResultReceiver indexof_mediabrowsercompat_customactionresultreceiver2 = indexOf$MediaBrowserCompat$CustomActionResultReceiver.GALLERY;
            PreferenceManager.getDefaultSharedPreferences(activity).getInt("pl.aprilapps.easyphotopicker.type", 0);
        } else if (i == 7459) {
            indexOf$MediaBrowserCompat$CustomActionResultReceiver indexof_mediabrowsercompat_customactionresultreceiver3 = indexOf$MediaBrowserCompat$CustomActionResultReceiver.CAMERA;
            PreferenceManager.getDefaultSharedPreferences(activity).getInt("pl.aprilapps.easyphotopicker.type", 0);
        } else if (intent == null || intent.getData() == null) {
            indexOf$MediaBrowserCompat$CustomActionResultReceiver indexof_mediabrowsercompat_customactionresultreceiver4 = indexOf$MediaBrowserCompat$CustomActionResultReceiver.CAMERA;
            PreferenceManager.getDefaultSharedPreferences(activity).getInt("pl.aprilapps.easyphotopicker.type", 0);
        } else {
            indexOf$MediaBrowserCompat$CustomActionResultReceiver indexof_mediabrowsercompat_customactionresultreceiver5 = indexOf$MediaBrowserCompat$CustomActionResultReceiver.DOCUMENTS;
            PreferenceManager.getDefaultSharedPreferences(activity).getInt("pl.aprilapps.easyphotopicker.type", 0);
        }
    }

    private static void c(Activity activity, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        try {
            File file = null;
            String string = PreferenceManager.getDefaultSharedPreferences(activity).getString("pl.aprilapps.easyphotopicker.photo_uri", null);
            if (!TextUtils.isEmpty(string)) {
                activity.revokeUriPermission(Uri.parse(string), 3);
            }
            String string2 = PreferenceManager.getDefaultSharedPreferences(activity).getString("pl.aprilapps.easyphotopicker.last_photo", null);
            if (string2 != null) {
                file = new File(string2);
            }
            if (file == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Unable to get the picture returned from camera");
                indexOf$MediaBrowserCompat$CustomActionResultReceiver indexof_mediabrowsercompat_customactionresultreceiver = indexOf$MediaBrowserCompat$CustomActionResultReceiver.CAMERA;
                PreferenceManager.getDefaultSharedPreferences(activity).getInt("pl.aprilapps.easyphotopicker.type", 0);
                remoteActionCompatParcelizer.c(illegalStateException);
            } else {
                indexOf$MediaBrowserCompat$CustomActionResultReceiver indexof_mediabrowsercompat_customactionresultreceiver2 = indexOf$MediaBrowserCompat$CustomActionResultReceiver.CAMERA;
                PreferenceManager.getDefaultSharedPreferences(activity).getInt("pl.aprilapps.easyphotopicker.type", 0);
                remoteActionCompatParcelizer.b(file);
            }
            PreferenceManager.getDefaultSharedPreferences(activity).edit().remove("pl.aprilapps.easyphotopicker.last_photo").remove("pl.aprilapps.easyphotopicker.photo_uri").apply();
        } catch (Exception e) {
            e.printStackTrace();
            indexOf$MediaBrowserCompat$CustomActionResultReceiver indexof_mediabrowsercompat_customactionresultreceiver3 = indexOf$MediaBrowserCompat$CustomActionResultReceiver.CAMERA;
            PreferenceManager.getDefaultSharedPreferences(activity).getInt("pl.aprilapps.easyphotopicker.type", 0);
            remoteActionCompatParcelizer.c(e);
        }
    }

    private static void e(Intent intent, Activity activity, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        try {
            File e = readProcessName.e(activity, intent.getData());
            indexOf$MediaBrowserCompat$CustomActionResultReceiver indexof_mediabrowsercompat_customactionresultreceiver = indexOf$MediaBrowserCompat$CustomActionResultReceiver.GALLERY;
            PreferenceManager.getDefaultSharedPreferences(activity).getInt("pl.aprilapps.easyphotopicker.type", 0);
            remoteActionCompatParcelizer.b(e);
        } catch (Exception e2) {
            e2.printStackTrace();
            indexOf$MediaBrowserCompat$CustomActionResultReceiver indexof_mediabrowsercompat_customactionresultreceiver2 = indexOf$MediaBrowserCompat$CustomActionResultReceiver.GALLERY;
            PreferenceManager.getDefaultSharedPreferences(activity).getInt("pl.aprilapps.easyphotopicker.type", 0);
            remoteActionCompatParcelizer.c(e2);
        }
    }
}
