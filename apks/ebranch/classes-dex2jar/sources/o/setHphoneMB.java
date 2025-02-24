package o;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.fragment.app.Fragment;
/* loaded from: classes-dex2jar.jar:o/setHphoneMB.class */
public abstract class setHphoneMB implements DialogInterface.OnClickListener {
    public static setHphoneMB a(Activity activity, Intent intent, int i) {
        return new setIncomeSourceOthers(intent, activity, i);
    }

    public static setHphoneMB c(Fragment fragment, Intent intent, int i) {
        return new setIncomeSourceValue(intent, fragment, i);
    }

    public static setHphoneMB e(realmGet$religionValue realmget_religionvalue, Intent intent, int i) {
        return new setIncomeSource(intent, realmget_religionvalue, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
