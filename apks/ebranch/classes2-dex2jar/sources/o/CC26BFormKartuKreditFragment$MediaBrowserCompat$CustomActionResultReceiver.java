package o;

import java.util.ArrayList;
import o.CC26BFormKartuKreditFragment;
/* loaded from: classes2-dex2jar.jar:o/CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver.class */
final class CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver implements Cloneable {
    public CC26BFormKartuKreditFragment_ViewBinding e;
    public ArrayList<CC26BFormKartuKreditFragment.RemoteActionCompatParcelizer> b = null;
    public ArrayList<CC26BFormKartuKreditFragment.RemoteActionCompatParcelizer> h = null;
    public ArrayList<CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver> a = null;
    public ArrayList<CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver> d = null;
    public boolean c = false;

    public CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver(CC26BFormKartuKreditFragment_ViewBinding cC26BFormKartuKreditFragment_ViewBinding) {
        this.e = cC26BFormKartuKreditFragment_ViewBinding;
    }

    /* renamed from: a */
    public final CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver clone() {
        try {
            CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver = (CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver) clone();
            cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver.e = this.e.clone();
            return cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public final void c(CC26BFormKartuKreditFragment.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (this.b == null) {
            this.b = new ArrayList<>();
            this.a = new ArrayList<>();
        }
        this.b.add(remoteActionCompatParcelizer);
        if (!this.a.contains(remoteActionCompatParcelizer.c)) {
            this.a.add(remoteActionCompatParcelizer.c);
        }
        CC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver = remoteActionCompatParcelizer.c;
        if (cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver.d == null) {
            cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver.d = new ArrayList<>();
        }
        cC26BFormKartuKreditFragment$MediaBrowserCompat$CustomActionResultReceiver.d.add(this);
    }
}
