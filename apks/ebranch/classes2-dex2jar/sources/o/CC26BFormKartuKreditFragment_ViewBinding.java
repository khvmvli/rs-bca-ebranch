package o;

import android.view.animation.Interpolator;
import java.util.ArrayList;
/* loaded from: classes2-dex2jar.jar:o/CC26BFormKartuKreditFragment_ViewBinding.class */
public abstract class CC26BFormKartuKreditFragment_ViewBinding implements Cloneable {
    ArrayList<RemoteActionCompatParcelizer> d = null;

    /* loaded from: classes2-dex2jar.jar:o/CC26BFormKartuKreditFragment_ViewBinding$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void b(CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding);

        void c(CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding);
    }

    /* renamed from: a */
    public CC26BFormKartuKreditFragment_ViewBinding clone() {
        try {
            CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding = (CC26BFormKartuKreditFragment_ViewBinding) clone();
            ArrayList<RemoteActionCompatParcelizer> arrayList = this.d;
            if (arrayList != null) {
                cC26BFormKartuKreditFragment_ViewBinding.d = new ArrayList<>();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    cC26BFormKartuKreditFragment_ViewBinding.d.add(arrayList.get(i));
                }
            }
            return cC26BFormKartuKreditFragment_ViewBinding;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void a(Object obj) {
    }

    public void d() {
    }

    public abstract void d(Interpolator interpolator);
}
