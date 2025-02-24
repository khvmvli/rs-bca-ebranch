package o;

import android.content.Context;
import android.os.Parcelable;
/* loaded from: classes-dex2jar.jar:o/setDropDownBackgroundResource.class */
public interface setDropDownBackgroundResource {

    /* loaded from: classes-dex2jar.jar:o/setDropDownBackgroundResource$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void a(setOnDismissListener setondismisslistener, boolean z);

        boolean a(setOnDismissListener setondismisslistener);
    }

    int a();

    boolean a(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable);

    boolean a(setTextAppearance settextappearance);

    void b(Parcelable parcelable);

    void c(IconCompatParcelizer iconCompatParcelizer);

    void c(boolean z);

    boolean c(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable);

    void e(Context context, setOnDismissListener setondismisslistener);

    void e(setOnDismissListener setondismisslistener, boolean z);

    boolean e();

    Parcelable i();
}
