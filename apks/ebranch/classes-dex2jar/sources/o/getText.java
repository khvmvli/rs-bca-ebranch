package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import o.performViewCreated;
import o.registerForContextMenu;
import o.setEdgeEffectFactory;
/* loaded from: classes-dex2jar.jar:o/getText.class */
public class getText extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID;
    private static final String SAVED_CANCELABLE;
    private static final String SAVED_DIALOG_STATE_TAG;
    private static final String SAVED_INTERNAL_DIALOG_SHOWING;
    private static final String SAVED_SHOWS_DIALOG;
    private static final String SAVED_STYLE;
    private static final String SAVED_THEME;
    public static final int STYLE_NORMAL;
    public static final int STYLE_NO_FRAME;
    public static final int STYLE_NO_INPUT;
    public static final int STYLE_NO_TITLE;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDismissed;
    private Handler mHandler;
    private boolean mShownByMe;
    private boolean mViewDestroyed;
    private Runnable mDismissRunnable = new Runnable() { // from class: o.getText.1
        @Override // java.lang.Runnable
        public final void run() {
            getText.this.mOnDismissListener.onDismiss(getText.this.mDialog);
        }
    };
    private DialogInterface.OnCancelListener mOnCancelListener = new DialogInterface.OnCancelListener() { // from class: o.getText.5
        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            if (getText.this.mDialog != null) {
                getText gettext = getText.this;
                gettext.onCancel(gettext.mDialog);
            }
        }
    };
    private DialogInterface.OnDismissListener mOnDismissListener = new DialogInterface.OnDismissListener() { // from class: o.getText.2
        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            if (getText.this.mDialog != null) {
                getText gettext = getText.this;
                gettext.onDismiss(gettext.mDialog);
            }
        }
    };
    private int mStyle = 0;
    private int mTheme = 0;
    private boolean mCancelable = true;
    private boolean mShowsDialog = true;
    private int mBackStackId = -1;
    private performLowMemory<performContextItemSelected> mObserver = new performLowMemory<performContextItemSelected>() { // from class: o.getText.4
        @Override // o.performLowMemory
        public final /* synthetic */ void e(performContextItemSelected performcontextitemselected) {
            if (performcontextitemselected != null && getText.this.mShowsDialog) {
                View requireView = getText.this.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (getText.this.mDialog != null) {
                    if (isDetached.a(3)) {
                        StringBuilder sb = new StringBuilder("DialogFragment ");
                        sb.append(this);
                        sb.append(" setting the content view on ");
                        sb.append(getText.this.mDialog);
                        Log.d("FragmentManager", sb.toString());
                    }
                    getText.this.mDialog.setContentView(requireView);
                }
            }
        }
    };
    private boolean mDialogCreated = false;

    public getText() {
    }

    public getText(int i) {
        super(i);
    }

    private void dismissInternal(boolean z, boolean z2) {
        if (!this.mDismissed) {
            this.mDismissed = true;
            this.mShownByMe = false;
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.mDialog.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.mHandler.getLooper()) {
                        onDismiss(this.mDialog);
                    } else {
                        this.mHandler.post(this.mDismissRunnable);
                    }
                }
            }
            this.mViewDestroyed = true;
            if (this.mBackStackId >= 0) {
                isDetached parentFragmentManager = getParentFragmentManager();
                int i = this.mBackStackId;
                if (i >= 0) {
                    parentFragmentManager.e(new isDetached$MediaBrowserCompat$CustomActionResultReceiver(parentFragmentManager, null, i, 1), false);
                    this.mBackStackId = -1;
                    return;
                }
                StringBuilder sb = new StringBuilder("Bad id: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            getUserVisibleHint getuservisiblehint = new getUserVisibleHint(getParentFragmentManager());
            getuservisiblehint.c(this);
            if (z) {
                getuservisiblehint.c();
            } else {
                getuservisiblehint.b();
            }
        }
    }

    private void prepareDialog(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog onCreateDialog = onCreateDialog(bundle);
                this.mDialog = onCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(onCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
            } finally {
                this.mCreatingDialog = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public getViewModelStore createFragmentContainer() {
        final getViewModelStore createFragmentContainer = createFragmentContainer();
        return new getViewModelStore() { // from class: o.getText.3
            @Override // o.getViewModelStore
            public final boolean d() {
                return createFragmentContainer.d() || getText.this.onHasView();
            }

            @Override // o.getViewModelStore
            public final View e(int i) {
                return createFragmentContainer.d() ? createFragmentContainer.e(i) : getText.this.onFindViewById(i);
            }
        };
    }

    public void dismiss() {
        dismissInternal(false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        onAttach(context);
        getViewLifecycleOwnerLiveData().b(this.mObserver);
        if (!this.mShownByMe) {
            this.mDismissed = false;
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (isDetached.a(3)) {
            StringBuilder sb = new StringBuilder("onCreateDialog called for DialogFragment ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        return new Dialog(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().d(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.mViewDestroyed) {
            if (isDetached.a(3)) {
                StringBuilder sb = new StringBuilder("onDismiss called for DialogFragment ");
                sb.append(this);
                Log.d("FragmentManager", sb.toString());
            }
            dismissInternal(true, true);
        }
    }

    View onFindViewById(int i) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        if (!this.mShowsDialog || this.mCreatingDialog) {
            if (isDetached.a(2)) {
                StringBuilder sb = new StringBuilder("getting layout inflater for DialogFragment ");
                sb.append(this);
                String obj = sb.toString();
                if (!this.mShowsDialog) {
                    StringBuilder sb2 = new StringBuilder("mShowsDialog = false: ");
                    sb2.append(obj);
                    Log.d("FragmentManager", sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder("mCreatingDialog = true: ");
                    sb3.append(obj);
                    Log.d("FragmentManager", sb3.toString());
                }
            }
            return onGetLayoutInflater;
        }
        prepareDialog(bundle);
        if (isDetached.a(2)) {
            StringBuilder sb4 = new StringBuilder("get layout inflater for DialogFragment ");
            sb4.append(this);
            sb4.append(" from dialog context");
            Log.d("FragmentManager", sb4.toString());
        }
        Dialog dialog = this.mDialog;
        LayoutInflater layoutInflater = onGetLayoutInflater;
        if (dialog != null) {
            layoutInflater = onGetLayoutInflater.cloneInContext(dialog.getContext());
        }
        return layoutInflater;
    }

    boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, onSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(SAVED_STYLE, i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt(SAVED_THEME, i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean(SAVED_CANCELABLE, z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            decorView.setTag(registerForContextMenu.write.e, this);
            decorView.setTag(performViewCreated.read.e, this);
            decorView.setTag(setEdgeEffectFactory.RemoteActionCompatParcelizer.b, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        onViewStateRestored(bundle);
        if (this.mDialog != null && bundle != null && (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) != null) {
            this.mDialog.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.mDialog != null && bundle != null && (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) != null) {
            this.mDialog.onRestoreInstanceState(bundle2);
        }
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        StringBuilder sb = new StringBuilder("DialogFragment ");
        sb.append(this);
        sb.append(" does not have a Dialog.");
        throw new IllegalStateException(sb.toString());
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void setStyle(int i, int i2) {
        if (isDetached.a(2)) {
            StringBuilder sb = new StringBuilder("Setting style and theme for DialogFragment ");
            sb.append(this);
            sb.append(" to ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            Log.d("FragmentManager", sb.toString());
        }
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = 16973913;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    public void setupDialog(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int show(isResumed isresumed, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        isresumed.d(0, this, str, 1);
        this.mViewDestroyed = false;
        int b = isresumed.b();
        this.mBackStackId = b;
        return b;
    }

    public void show(isDetached isdetached, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(isdetached);
        getuservisiblehint.d(0, this, str, 1);
        getuservisiblehint.b();
    }

    public void showNow(isDetached isdetached, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(isdetached);
        getuservisiblehint.d(0, this, str, 1);
        getuservisiblehint.a();
    }
}
