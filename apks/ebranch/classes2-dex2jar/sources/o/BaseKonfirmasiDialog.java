package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:o/BaseKonfirmasiDialog.class */
public class BaseKonfirmasiDialog {
    public final setCollapseIcon<String, BidangPekerjaanDialog_ViewBinding> c = new setCollapseIcon<>();
    public final setCollapseIcon<String, PropertyValuesHolder[]> a = new setCollapseIcon<>();

    private static BaseKonfirmasiDialog a(List<Animator> list) {
        BaseKonfirmasiDialog baseKonfirmasiDialog = new BaseKonfirmasiDialog();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(baseKonfirmasiDialog, list.get(i));
        }
        return baseKonfirmasiDialog;
    }

    private static void a(BaseKonfirmasiDialog baseKonfirmasiDialog, Animator animator) {
        TimeInterpolator timeInterpolator;
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            baseKonfirmasiDialog.a.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                timeInterpolator = unbindViews.d;
            } else if (interpolator instanceof AccelerateInterpolator) {
                timeInterpolator = unbindViews.a;
            } else {
                timeInterpolator = interpolator;
                if (interpolator instanceof DecelerateInterpolator) {
                    timeInterpolator = unbindViews.e;
                }
            }
            BidangPekerjaanDialog_ViewBinding bidangPekerjaanDialog_ViewBinding = new BidangPekerjaanDialog_ViewBinding(startDelay, duration, timeInterpolator);
            bidangPekerjaanDialog_ViewBinding.b = objectAnimator.getRepeatCount();
            bidangPekerjaanDialog_ViewBinding.a = objectAnimator.getRepeatMode();
            baseKonfirmasiDialog.c.put(propertyName, bidangPekerjaanDialog_ViewBinding);
            return;
        }
        StringBuilder sb = new StringBuilder("Animator must be an ObjectAnimator: ");
        sb.append(animator);
        throw new IllegalArgumentException(sb.toString());
    }

    public static BaseKonfirmasiDialog b(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return a(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return a(arrayList);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            Log.w("MotionSpec", sb.toString(), e);
            return null;
        }
    }

    public final <T> ObjectAnimator a(String str, T t, Property<T, ?> property) {
        boolean z = true;
        if (this.a.get(str) != null) {
            PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) this.a.get(str);
            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
            for (int i = 0; i < propertyValuesHolderArr.length; i++) {
                propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
            }
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, propertyValuesHolderArr2);
            ofPropertyValuesHolder.setProperty(property);
            if (this.c.get(str) == null) {
                z = false;
            }
            if (z) {
                ((BidangPekerjaanDialog_ViewBinding) this.c.get(str)).b(ofPropertyValuesHolder);
                return ofPropertyValuesHolder;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final BidangPekerjaanDialog_ViewBinding c(String str) {
        if (this.c.get(str) != null) {
            return (BidangPekerjaanDialog_ViewBinding) this.c.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final PropertyValuesHolder[] d(String str) {
        if (this.a.get(str) != null) {
            PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) this.a.get(str);
            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
            for (int i = 0; i < propertyValuesHolderArr.length; i++) {
                propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
            }
            return propertyValuesHolderArr2;
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseKonfirmasiDialog)) {
            return false;
        }
        return this.c.equals(((BaseKonfirmasiDialog) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.c);
        sb.append("}\n");
        return sb.toString();
    }
}
