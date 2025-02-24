package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.Locale;
import o.BaseDialogKotlin;
/* loaded from: classes2-dex2jar.jar:o/LogoutDialog.class */
public class LogoutDialog extends setPopupBackgroundDrawable {
    private boolean a;
    private final Rect b;

    public LogoutDialog(Context context) {
        this(context, null);
    }

    public LogoutDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.p);
    }

    public LogoutDialog(Context context, AttributeSet attributeSet, int i) {
        super(MataUangDialog_ViewBinding.a(context, attributeSet, i, 0), attributeSet, i);
        this.b = new Rect();
        TypedArray c = GuestWarningWebViewDialog_ViewBinding.c(context, attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.gP, i, BaseDialogKotlin.MediaDescriptionCompat.f12o, new int[0]);
        setTextInputLayoutFocusedRectEnabled(c.getBoolean(BaseDialogKotlin$MediaSessionCompat$Token.gS, false));
        c.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LogoutDialog_ViewBinding a() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof LogoutDialog_ViewBinding) {
                return (LogoutDialog_ViewBinding) parent;
            }
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        getFocusedRect(rect);
        LogoutDialog_ViewBinding a = a();
        if (a != null && this.a && rect != null) {
            a.getFocusedRect(this.b);
            rect.bottom = this.b.bottom;
        }
    }

    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = getGlobalVisibleRect(rect, point);
        LogoutDialog_ViewBinding a = a();
        if (!(a == null || !this.a || rect == null)) {
            a.getGlobalVisibleRect(this.b, point);
            rect.bottom = this.b.bottom;
        }
        return globalVisibleRect;
    }

    public CharSequence getHint() {
        LogoutDialog_ViewBinding a = a();
        if (a == null || !a.r) {
            return getHint();
        }
        return a.t ? a.s : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() {
        onAttachedToWindow();
        LogoutDialog_ViewBinding a = a();
        if (a != null && a.r && getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            LogoutDialog_ViewBinding a = a();
            CharSequence charSequence = null;
            if (a != null) {
                charSequence = null;
                if (a.t) {
                    charSequence = a.s;
                }
            }
            editorInfo.hintText = charSequence;
        }
        return onCreateInputConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        LogoutDialog_ViewBinding a = a();
        if (Build.VERSION.SDK_INT < 23 && a != null) {
            Editable text = getText();
            CharSequence charSequence = a.t ? a.s : null;
            boolean isEmpty = TextUtils.isEmpty(text);
            boolean isEmpty2 = TextUtils.isEmpty(charSequence);
            setLabelFor(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.ac);
            String str = "";
            String charSequence2 = isEmpty2 ^ true ? charSequence.toString() : "";
            if (!isEmpty) {
                StringBuilder sb = new StringBuilder();
                sb.append((Object) text);
                if (!TextUtils.isEmpty(charSequence2)) {
                    StringBuilder sb2 = new StringBuilder(", ");
                    sb2.append(charSequence2);
                    str = sb2.toString();
                }
                sb.append(str);
                str = sb.toString();
            } else if (!TextUtils.isEmpty(charSequence2)) {
                str = charSequence2;
            }
            accessibilityNodeInfo.setText(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = requestRectangleOnScreen(rect);
        LogoutDialog_ViewBinding a = a();
        if (a != null && this.a) {
            this.b.set(0, a.getHeight() - getResources().getDimensionPixelOffset(BaseDialogKotlin.read.U), a.getWidth(), a.getHeight());
            a.requestRectangleOnScreen(this.b, true);
        }
        return requestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.a = z;
    }
}
