package o;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
/* loaded from: classes-dex2jar.jar:o/realmGet$officeAddress.class */
public class realmGet$officeAddress extends Activity implements DialogInterface.OnCancelListener {
    protected int b = 0;

    public static Intent b(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, realmGet$officeAddress.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.b = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                realmGet$resCity a = realmGet$resCity.a(this);
                if (i2 == -1) {
                    Handler handler = a.e;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i2 == 0) {
                    realmGet$jobValue realmget_jobvalue = new realmGet$jobValue(13, null);
                    int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                    if (!a.b.d(a.d, realmget_jobvalue, intExtra)) {
                        Handler handler2 = a.e;
                        handler2.sendMessage(handler2.obtainMessage(5, intExtra, 0, realmget_jobvalue));
                    }
                }
            }
        } else if (i == 2) {
            this.b = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.b = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        onCreate(bundle);
        if (bundle != null) {
            this.b = bundle.getInt("resolution");
        }
        if (this.b != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.b = 1;
                } catch (ActivityNotFoundException e) {
                    if (extras.getBoolean("notify_manager", true)) {
                        realmGet$resCity a = realmGet$resCity.a(this);
                        realmGet$jobValue realmget_jobvalue = new realmGet$jobValue(22, null);
                        int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                        if (!a.b.d(a.d, realmget_jobvalue, intExtra)) {
                            Handler handler = a.e;
                            handler.sendMessage(handler.obtainMessage(5, intExtra, 0, realmget_jobvalue));
                        }
                    } else {
                        String obj = pendingIntent.toString();
                        StringBuilder sb = new StringBuilder("Activity not found while launching ");
                        sb.append(obj);
                        sb.append(".");
                        String obj2 = sb.toString();
                        String str = obj2;
                        if (Build.FINGERPRINT.contains("generic")) {
                            str = obj2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        Log.e("GoogleApiActivity", str, e);
                    }
                    this.b = 1;
                    finish();
                } catch (IntentSender.SendIntentException e2) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                    finish();
                }
            } else if (num != null) {
                realmGet$jobOthers.a.b(this, num.intValue(), 2, this);
                this.b = 1;
            } else {
                throw new NullPointerException("null reference");
            }
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.b);
        onSaveInstanceState(bundle);
    }
}
