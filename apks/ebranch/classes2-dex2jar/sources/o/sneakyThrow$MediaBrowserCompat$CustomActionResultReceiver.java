package o;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
/* loaded from: classes2-dex2jar.jar:o/sneakyThrow$MediaBrowserCompat$CustomActionResultReceiver.class */
public class sneakyThrow$MediaBrowserCompat$CustomActionResultReceiver extends getText implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        sneakyThrow.d(getActivity(), getArguments());
    }

    public Dialog onCreateDialog(Bundle bundle) {
        getView activity = getActivity();
        Bundle arguments = getArguments();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(arguments.getString("de.greenrobot.eventbus.errordialog.title"));
        builder.setMessage(arguments.getString("de.greenrobot.eventbus.errordialog.message"));
        int i = sneakyThrow.a;
        if (i != 0) {
            builder.setIcon(i);
        }
        builder.setPositiveButton(17039370, this);
        return builder.create();
    }
}
