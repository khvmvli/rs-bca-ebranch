package o;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import o.getExitTransitionCallback;
import o.onSaveInstanceState;
/* loaded from: classes-dex2jar.jar:o/setFirstBaselineToTopHeight.class */
final class setFirstBaselineToTopHeight {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setFirstBaselineToTopHeight$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        /* JADX WARN: Finally extract failed */
        static boolean b(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                findFragmentByWho.a(textView, new onSaveInstanceState.read(dragEvent.getClipData(), 3).e());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        static boolean d(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            findFragmentByWho.a(view, new onSaveInstanceState.read(dragEvent.getClipData(), 3).e());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 24 || dragEvent.getLocalState() != null || findFragmentByWho.p(view) == null) {
            return false;
        }
        Activity c = c(view);
        if (c == null) {
            StringBuilder sb = new StringBuilder("Can't handle drop: no activity: view=");
            sb.append(view);
            Log.i("ReceiveContent", sb.toString());
            return false;
        } else if (dragEvent.getAction() == 1) {
            return !(view instanceof TextView);
        } else {
            if (dragEvent.getAction() != 3) {
                return false;
            }
            return view instanceof TextView ? IconCompatParcelizer.b(dragEvent, (TextView) view, c) : IconCompatParcelizer.d(dragEvent, view, c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(TextView textView, int i) {
        int i2 = 0;
        if ((i != 16908322 && i != 16908337) || findFragmentByWho.p(textView) == null) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return true;
        }
        onSaveInstanceState.read read = new onSaveInstanceState.read(primaryClip, 1);
        if (i != 16908322) {
            i2 = 1;
        }
        findFragmentByWho.a(textView, read.c(i2).e());
        return true;
    }

    static Activity c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static getExitTransitionCallback.RemoteActionCompatParcelizer d(final View view) {
        return new getExitTransitionCallback.RemoteActionCompatParcelizer() { // from class: o.setFirstBaselineToTopHeight.3
            @Override // o.getExitTransitionCallback.RemoteActionCompatParcelizer
            public boolean e(getEnterTransitionCallback getentertransitioncallback, int i, Bundle bundle) {
                boolean z = true;
                Bundle bundle2 = bundle;
                if (Build.VERSION.SDK_INT >= 25) {
                    bundle2 = bundle;
                    if ((i & 1) != 0) {
                        try {
                            getentertransitioncallback.d();
                            InputContentInfo inputContentInfo = (InputContentInfo) getentertransitioncallback.e();
                            Bundle bundle3 = bundle == null ? new Bundle() : new Bundle(bundle);
                            bundle3.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                            bundle2 = bundle3;
                        } catch (Exception e) {
                            Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e);
                            return false;
                        }
                    }
                }
                if (findFragmentByWho.a(view, new onSaveInstanceState.read(new ClipData(getentertransitioncallback.c(), new ClipData.Item(getentertransitioncallback.a())), 2).e(getentertransitioncallback.b()).c(bundle2).e()) != null) {
                    z = false;
                }
                return z;
            }
        };
    }
}
