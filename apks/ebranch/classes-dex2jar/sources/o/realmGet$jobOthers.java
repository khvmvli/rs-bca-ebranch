package o;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import o.ParseException;
import o.realmGet$currentPage;
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {setTotalBiayaTransfer.class, setTipeNasabahPengirimId.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes-dex2jar.jar:o/realmGet$jobOthers.class */
public final class realmGet$jobOthers extends realmGet$incomeSourceValue {
    private String i;
    private static final Object e = new Object();
    public static final realmGet$jobOthers a = new realmGet$jobOthers();
    public static final int d = realmGet$incomeSourceValue.b;

    public static realmGet$jobOthers a() {
        return a;
    }

    public static Dialog c(Context context, int i, setHphoneMB sethphonemb, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        AlertDialog.Builder builder2 = builder;
        if (builder == null) {
            builder2 = new AlertDialog.Builder(context);
        }
        builder2.setMessage(setHmRW.b(context, i));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        String a2 = setHmRW.a(context, i);
        if (a2 != null) {
            DialogInterface.OnClickListener onClickListener2 = sethphonemb;
            if (sethphonemb == null) {
                onClickListener2 = onClickListener;
            }
            builder2.setPositiveButton(a2, onClickListener2);
        }
        String e2 = setHmRW.e(context, i);
        if (e2 != null) {
            builder2.setTitle(e2);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder2.create();
    }

    public static void c(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof getView) {
            realmGet$kitasKitapNumber.e(dialog, onCancelListener).show(((getView) activity).l(), str);
            return;
        }
        realmGet$incomeSourceOthers.c(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @Override // o.realmGet$incomeSourceValue
    public final Intent a(Context context, int i, String str) {
        return a(context, i, str);
    }

    @Override // o.realmGet$incomeSourceValue
    public final boolean a(int i) {
        return a(i);
    }

    @Override // o.realmGet$incomeSourceValue
    public final String b(int i) {
        return b(i);
    }

    @ResultIgnorabilityUnspecified
    public final boolean b(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog c = c(activity, i, setHphoneMB.a(activity, a(activity, i, "d"), i2), onCancelListener, null);
        if (c == null) {
            return false;
        }
        c(activity, c, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @ResultIgnorabilityUnspecified
    public final boolean b(Activity activity, realmGet$religionValue realmget_religionvalue, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog c = c(activity, i, setHphoneMB.e(realmget_religionvalue, a(activity, i, "d"), 2), onCancelListener, null);
        if (c == null) {
            return false;
        }
        c(activity, c, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @Override // o.realmGet$incomeSourceValue
    public final int c(Context context, int i) {
        return c(context, i);
    }

    @ResultIgnorabilityUnspecified
    public final realmSet$incomeSourceValue c(Context context, realmSet$job realmset_job) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        realmSet$incomeSourceValue realmset_incomesourcevalue = new realmSet$incomeSourceValue(realmset_job);
        setTanggalJatuhTempoTransaksi.e(context, realmset_incomesourcevalue, intentFilter);
        realmset_incomesourcevalue.c(context);
        if (realmGet$lastEducation.b(context, "com.google.android.gms")) {
            return realmset_incomesourcevalue;
        }
        realmset_job.d();
        realmset_incomesourcevalue.e();
        return null;
    }

    public final void c(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        String str;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            new realmGet$noReff(this, context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            String c = setHmRW.c(context, i);
            String d2 = setHmRW.d(context, i);
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            if (systemService != null) {
                NotificationManager notificationManager = (NotificationManager) systemService;
                ParseException.RemoteActionCompatParcelizer a2 = new ParseException.RemoteActionCompatParcelizer(context).a(true).e(true).b((CharSequence) c).a(new ParseException.write().c(d2));
                if (getSumberDanaTransaksi.e(context.getPackageManager())) {
                    a2.e(context.getApplicationInfo().icon).c(2);
                    if (getSumberDanaTransaksi.d(context)) {
                        a2.d(realmGet$currentPage$MediaBrowserCompat$CustomActionResultReceiver.d, resources.getString(realmGet$currentPage.write.f179o), pendingIntent);
                    } else {
                        a2.c(pendingIntent);
                    }
                } else {
                    a2.e(17301642).c(resources.getString(realmGet$currentPage.write.g)).d(System.currentTimeMillis()).c(pendingIntent).d(d2);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        synchronized (e) {
                            str = this.i;
                        }
                        String str2 = str;
                        if (str == null) {
                            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                            String string = context.getResources().getString(realmGet$currentPage.write.f);
                            if (notificationChannel == null) {
                                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                            } else if (!string.contentEquals(notificationChannel.getName())) {
                                notificationChannel.setName(string);
                                notificationManager.createNotificationChannel(notificationChannel);
                            }
                            str2 = "com.google.android.gms.availability";
                        }
                        a2.b(str2);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                Notification b = a2.b();
                if (i == 1 || i == 2 || i == 3) {
                    realmGet$lastEducation.e.set(false);
                    i2 = 10436;
                } else {
                    i2 = 39789;
                }
                notificationManager.notify(i2, b);
                return;
            }
            throw new NullPointerException("null reference");
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    @Override // o.realmGet$incomeSourceValue
    @ResultIgnorabilityUnspecified
    public final int d(Context context) {
        return d(context);
    }

    public final void d(Context context, int i) {
        c(context, i, b(context, i, 0, "n"));
    }

    public final boolean d(Context context, realmGet$jobValue realmget_jobvalue, int i) {
        if (realmGet$accType.c(context)) {
            return false;
        }
        PendingIntent e2 = realmget_jobvalue.a != 0 && realmget_jobvalue.c != null ? realmget_jobvalue.c : e(context, realmget_jobvalue.a, 0);
        if (e2 == null) {
            return false;
        }
        c(context, realmget_jobvalue.a, PendingIntent.getActivity(context, 0, realmGet$officeAddress.b(context, e2, i, true), setWaktuPengirimanTransaksi.e | 134217728));
        return true;
    }

    public final Dialog e(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(setHmRW.b(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        c(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @Override // o.realmGet$incomeSourceValue
    public final PendingIntent e(Context context, int i, int i2) {
        return e(context, i, i2);
    }
}
