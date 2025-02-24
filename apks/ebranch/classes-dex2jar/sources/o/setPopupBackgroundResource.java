package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
/* loaded from: classes-dex2jar.jar:o/setPopupBackgroundResource.class */
public class setPopupBackgroundResource extends ImageButton {
    private final setImageDrawable d;
    private final setDropDownVerticalOffset e;

    public setPopupBackgroundResource(Context context) {
        this(context, null);
    }

    public setPopupBackgroundResource(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.F);
    }

    public setPopupBackgroundResource(Context context, AttributeSet attributeSet, int i) {
        super(setMaxWidth.c(context), attributeSet, i);
        setOnCloseListener.e(this, getContext());
        setImageDrawable setimagedrawable = new setImageDrawable(this);
        this.d = setimagedrawable;
        setimagedrawable.c(attributeSet, i);
        setDropDownVerticalOffset setdropdownverticaloffset = new setDropDownVerticalOffset(this);
        this.e = setdropdownverticaloffset;
        setdropdownverticaloffset.a(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        drawableStateChanged();
        setImageDrawable setimagedrawable = this.d;
        if (setimagedrawable != null) {
            setimagedrawable.e();
        }
        setDropDownVerticalOffset setdropdownverticaloffset = this.e;
        if (setdropdownverticaloffset != null) {
            setdropdownverticaloffset.a();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.e.e() && hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        setBackgroundDrawable(drawable);
        setImageDrawable setimagedrawable = this.d;
        if (setimagedrawable != null) {
            setimagedrawable.e(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundResource(i);
        setImageDrawable setimagedrawable = this.d;
        if (setimagedrawable != null) {
            setimagedrawable.a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap);
        setDropDownVerticalOffset setdropdownverticaloffset = this.e;
        if (setdropdownverticaloffset != null) {
            setdropdownverticaloffset.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        setImageDrawable(drawable);
        setDropDownVerticalOffset setdropdownverticaloffset = this.e;
        if (setdropdownverticaloffset != null) {
            setdropdownverticaloffset.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.e.b(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        setImageURI(uri);
        setDropDownVerticalOffset setdropdownverticaloffset = this.e;
        if (setdropdownverticaloffset != null) {
            setdropdownverticaloffset.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setImageDrawable setimagedrawable = this.d;
        if (setimagedrawable != null) {
            setimagedrawable.d(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setImageDrawable setimagedrawable = this.d;
        if (setimagedrawable != null) {
            setimagedrawable.e(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        setDropDownVerticalOffset setdropdownverticaloffset = this.e;
        if (setdropdownverticaloffset != null) {
            setdropdownverticaloffset.e(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        setDropDownVerticalOffset setdropdownverticaloffset = this.e;
        if (setdropdownverticaloffset != null) {
            setdropdownverticaloffset.b(mode);
        }
    }
}
