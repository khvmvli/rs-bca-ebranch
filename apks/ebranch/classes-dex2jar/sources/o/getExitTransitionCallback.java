package o;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
/* loaded from: classes-dex2jar.jar:o/getExitTransitionCallback.class */
public final class getExitTransitionCallback {

    /* loaded from: classes-dex2jar.jar:o/getExitTransitionCallback$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        boolean e(getEnterTransitionCallback getentertransitioncallback, int i, Bundle bundle);
    }

    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, final RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (inputConnection == null) {
            throw new IllegalArgumentException("inputConnection must be non-null");
        } else if (editorInfo == null) {
            throw new IllegalArgumentException("editorInfo must be non-null");
        } else if (remoteActionCompatParcelizer != null) {
            return Build.VERSION.SDK_INT >= 25 ? new InputConnectionWrapper(inputConnection, false) { // from class: o.getExitTransitionCallback.4
                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
                    if (remoteActionCompatParcelizer.e(getEnterTransitionCallback.e(inputContentInfo), i, bundle)) {
                        return true;
                    }
                    return commitContent(inputContentInfo, i, bundle);
                }
            } : getExitAnim.b(editorInfo).length == 0 ? inputConnection : new InputConnectionWrapper(inputConnection, false) { // from class: o.getExitTransitionCallback.5
                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public boolean performPrivateCommand(String str, Bundle bundle) {
                    if (getExitTransitionCallback.b(str, bundle, remoteActionCompatParcelizer)) {
                        return true;
                    }
                    return performPrivateCommand(str, bundle);
                }
            };
        } else {
            throw new IllegalArgumentException("onCommitContentListener must be non-null");
        }
    }

    static boolean b(String str, Bundle bundle, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        boolean z;
        ResultReceiver resultReceiver;
        Throwable th;
        ResultReceiver resultReceiver2;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z = false;
        } else if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            return false;
        } else {
            z = true;
        }
        try {
            resultReceiver2 = (ResultReceiver) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = null;
        }
        try {
            Uri uri = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
            Uri uri2 = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
            int i = bundle.getInt(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
            Bundle bundle2 = (Bundle) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
            boolean z2 = false;
            if (uri != null) {
                z2 = false;
                if (clipDescription != null) {
                    z2 = remoteActionCompatParcelizer.e(new getEnterTransitionCallback(uri, clipDescription, uri2), i, bundle2);
                }
            }
            if (resultReceiver2 != null) {
                int i2 = z2 ? 1 : 0;
                int i3 = z2 ? 1 : 0;
                int i4 = z2 ? 1 : 0;
                int i5 = z2 ? 1 : 0;
                resultReceiver2.send(i2, null);
            }
            return z2;
        } catch (Throwable th3) {
            th = th3;
            resultReceiver = resultReceiver2;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            }
            throw th;
        }
    }
}
