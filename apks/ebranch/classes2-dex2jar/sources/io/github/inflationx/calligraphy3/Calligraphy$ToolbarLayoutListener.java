package io.github.inflationx.calligraphy3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import o.setInputType;
/* loaded from: classes2-dex2jar.jar:io/github/inflationx/calligraphy3/Calligraphy$ToolbarLayoutListener.class */
class Calligraphy$ToolbarLayoutListener implements ViewTreeObserver.OnGlobalLayoutListener {
    static String BLANK = " ";
    private final WeakReference<Calligraphy> mCalligraphyFactory;
    private final WeakReference<Context> mContextRef;
    private final WeakReference<setInputType> mToolbarReference;
    private final CharSequence originalSubTitle;

    private Calligraphy$ToolbarLayoutListener(Calligraphy calligraphy, Context context, setInputType setinputtype) {
        this.mCalligraphyFactory = new WeakReference<>(calligraphy);
        this.mContextRef = new WeakReference<>(context);
        this.mToolbarReference = new WeakReference<>(setinputtype);
        this.originalSubTitle = setinputtype.h;
        setinputtype.setSubtitle(BLANK);
    }

    private void removeSelf(setInputType setinputtype) {
        setinputtype.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        setInputType setinputtype = this.mToolbarReference.get();
        Context context = this.mContextRef.get();
        Calligraphy calligraphy = this.mCalligraphyFactory.get();
        if (setinputtype != null) {
            if (calligraphy == null || context == null) {
                removeSelf(setinputtype);
                return;
            }
            int childCount = setinputtype.getChildCount();
            if (childCount != 0) {
                for (int i = 0; i < childCount; i++) {
                    calligraphy.onViewCreated(setinputtype.getChildAt(i), context, (AttributeSet) null);
                }
            }
            removeSelf(setinputtype);
            setinputtype.setSubtitle(this.originalSubTitle);
        }
    }
}
