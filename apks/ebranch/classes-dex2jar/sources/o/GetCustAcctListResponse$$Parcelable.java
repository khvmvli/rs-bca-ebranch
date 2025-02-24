package o;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.CategoriesORResponse;
/* loaded from: classes-dex2jar.jar:o/GetCustAcctListResponse$$Parcelable.class */
public class GetCustAcctListResponse$$Parcelable extends Fragment {
    final setFlagReservationTellerReguler a;
    private final Set<GetCustAcctListResponse$$Parcelable> b;
    CategoriesORResponse.Category c;
    Fragment d;
    final GetBranchReservationResponse$ReservationBranch$$Parcelable e;
    private GetCustAcctListResponse$$Parcelable g;

    /* loaded from: classes-dex2jar.jar:o/GetCustAcctListResponse$$Parcelable$read.class */
    final class read implements GetBranchReservationResponse$ReservationBranch$$Parcelable {
        read() {
        }

        @Override // o.GetBranchReservationResponse$ReservationBranch$$Parcelable
        public final Set<CategoriesORResponse.Category> a() {
            Set<GetCustAcctListResponse$$Parcelable> d = GetCustAcctListResponse$$Parcelable.this.d();
            HashSet hashSet = new HashSet(d.size());
            for (GetCustAcctListResponse$$Parcelable getCustAcctListResponse$$Parcelable : d) {
                if (getCustAcctListResponse$$Parcelable.c != null) {
                    hashSet.add(getCustAcctListResponse$$Parcelable.c);
                }
            }
            return hashSet;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(toString());
            sb.append("{fragment=");
            sb.append(GetCustAcctListResponse$$Parcelable.this);
            sb.append("}");
            return sb.toString();
        }
    }

    public GetCustAcctListResponse$$Parcelable() {
        this(new setFlagReservationTellerReguler());
    }

    private GetCustAcctListResponse$$Parcelable(setFlagReservationTellerReguler setflagreservationtellerreguler) {
        this.e = new read();
        this.b = new HashSet();
        this.a = setflagreservationtellerreguler;
    }

    private boolean b(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        Fragment fragment2 = parentFragment;
        Fragment fragment3 = fragment;
        if (parentFragment == null) {
            fragment2 = this.d;
            fragment3 = fragment;
        }
        while (true) {
            Fragment parentFragment2 = fragment3.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(fragment2)) {
                return true;
            }
            fragment3 = fragment3.getParentFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static isDetached e(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    final Set<GetCustAcctListResponse$$Parcelable> d() {
        GetCustAcctListResponse$$Parcelable getCustAcctListResponse$$Parcelable = this.g;
        if (getCustAcctListResponse$$Parcelable == null) {
            return Collections.emptySet();
        }
        if (equals(getCustAcctListResponse$$Parcelable)) {
            return Collections.unmodifiableSet(this.b);
        }
        HashSet hashSet = new HashSet();
        for (GetCustAcctListResponse$$Parcelable getCustAcctListResponse$$Parcelable2 : this.g.d()) {
            Fragment parentFragment = getCustAcctListResponse$$Parcelable2.getParentFragment();
            Fragment fragment = parentFragment;
            if (parentFragment == null) {
                fragment = getCustAcctListResponse$$Parcelable2.d;
            }
            if (b(fragment)) {
                hashSet.add(getCustAcctListResponse$$Parcelable2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Context context, isDetached isdetached) {
        GetCustAcctListResponse$$Parcelable getCustAcctListResponse$$Parcelable = this.g;
        if (getCustAcctListResponse$$Parcelable != null) {
            getCustAcctListResponse$$Parcelable.b.remove(this);
            this.g = null;
        }
        GetCustAcctListResponse$$Parcelable d = Glide.e(context).h.d(isdetached);
        this.g = d;
        if (!equals(d)) {
            this.g.b.add(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        onAttach(context);
        Fragment fragment = this;
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        isDetached fragmentManager = fragment.getFragmentManager();
        if (fragmentManager != null) {
            try {
                d(getContext(), fragmentManager);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        onDestroy();
        this.a.a();
        GetCustAcctListResponse$$Parcelable getCustAcctListResponse$$Parcelable = this.g;
        if (getCustAcctListResponse$$Parcelable != null) {
            getCustAcctListResponse$$Parcelable.b.remove(this);
            this.g = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        onDetach();
        this.d = null;
        GetCustAcctListResponse$$Parcelable getCustAcctListResponse$$Parcelable = this.g;
        if (getCustAcctListResponse$$Parcelable != null) {
            getCustAcctListResponse$$Parcelable.b.remove(this);
            this.g = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        onStart();
        this.a.c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        onStop();
        this.a.e();
    }

    @Override // androidx.fragment.app.Fragment, java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        Fragment fragment = parentFragment;
        if (parentFragment == null) {
            fragment = this.d;
        }
        sb.append(fragment);
        sb.append("}");
        return sb.toString();
    }
}
