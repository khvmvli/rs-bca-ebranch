package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.realm.internal.Property;
import o.setCheckMarkDrawable;
import o.setHasDecor$MediaBrowserCompat$CustomActionResultReceiver;
/* loaded from: classes-dex2jar.jar:androidx/appcompat/widget/SearchView$MediaBrowserCompat$ItemReceiver.class */
public class SearchView$MediaBrowserCompat$ItemReceiver extends setCheckMarkDrawable {
    final Runnable a;
    boolean b;
    SearchView c;
    private int d;

    public SearchView$MediaBrowserCompat$ItemReceiver(Context context) {
        this(context, null);
    }

    public SearchView$MediaBrowserCompat$ItemReceiver(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.s);
    }

    public SearchView$MediaBrowserCompat$ItemReceiver(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Runnable() { // from class: androidx.appcompat.widget.SearchView$MediaBrowserCompat$ItemReceiver.4
            @Override // java.lang.Runnable
            public final void run() {
                SearchView$MediaBrowserCompat$ItemReceiver searchView$MediaBrowserCompat$ItemReceiver = SearchView$MediaBrowserCompat$ItemReceiver.this;
                if (searchView$MediaBrowserCompat$ItemReceiver.b) {
                    ((InputMethodManager) searchView$MediaBrowserCompat$ItemReceiver.getContext().getSystemService("input_method")).showSoftInput(searchView$MediaBrowserCompat$ItemReceiver, 0);
                    searchView$MediaBrowserCompat$ItemReceiver.b = false;
                }
            }
        };
        this.d = getThreshold();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (!z) {
            this.b = false;
            removeCallbacks(this.a);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else if (inputMethodManager.isActive(this)) {
            this.b = false;
            removeCallbacks(this.a);
            inputMethodManager.showSoftInput(this, 0);
        } else {
            this.b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
                return;
            }
            return;
        }
        SearchView.c.c(this);
    }

    @Override // android.widget.AutoCompleteTextView
    public boolean enoughToFilter() {
        return this.d <= 0 || enoughToFilter();
    }

    @Override // o.setCheckMarkDrawable, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = onCreateInputConnection(editorInfo);
        if (this.b) {
            removeCallbacks(this.a);
            post(this.a);
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        onFinishInflate();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        setMinWidth((int) TypedValue.applyDimension(1, (float) ((i < 960 || i2 < 720 || configuration.orientation != 2) ? (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160 : Property.TYPE_SET), displayMetrics));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        onFocusChanged(z, i, rect);
        this.c.o();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState == null) {
                    return true;
                }
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            } else if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.c.clearFocus();
                    c(false);
                    return true;
                }
            }
        }
        return onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        onWindowFocusChanged(z);
        if (z && this.c.hasFocus() && getVisibility() == 0) {
            this.b = true;
            if (SearchView.b(getContext())) {
                e();
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    protected void replaceText(CharSequence charSequence) {
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i) {
        setThreshold(i);
        this.d = i;
    }
}
