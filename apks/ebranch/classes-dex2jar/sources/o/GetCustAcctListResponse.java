package o;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.Glide;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.CategoriesORResponse;
@Deprecated
/* loaded from: classes-dex2jar.jar:o/GetCustAcctListResponse.class */
public final class GetCustAcctListResponse extends Fragment {
    CategoriesORResponse.Category a;
    final setFlagReservationTellerReguler b;
    final GetBranchReservationResponse$ReservationBranch$$Parcelable c;
    private final Set<GetCustAcctListResponse> d;
    private Fragment e;
    private GetCustAcctListResponse g;

    /* loaded from: classes-dex2jar.jar:o/GetCustAcctListResponse$AccountData.class */
    public abstract class AccountData extends getAccountType {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/GetCustAcctListResponse$read.class */
    public final class read implements GetBranchReservationResponse$ReservationBranch$$Parcelable {
        read() {
            GetCustAcctListResponse.this = r4;
        }

        @Override // o.GetBranchReservationResponse$ReservationBranch$$Parcelable
        public final Set<CategoriesORResponse.Category> a() {
            Set<GetCustAcctListResponse> c = GetCustAcctListResponse.this.c();
            HashSet hashSet = new HashSet(c.size());
            for (GetCustAcctListResponse getCustAcctListResponse : c) {
                if (getCustAcctListResponse.a != null) {
                    hashSet.add(getCustAcctListResponse.a);
                }
            }
            return hashSet;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(toString());
            sb.append("{fragment=");
            sb.append(GetCustAcctListResponse.this);
            sb.append("}");
            return sb.toString();
        }
    }

    public GetCustAcctListResponse() {
        this(new setFlagReservationTellerReguler());
    }

    private GetCustAcctListResponse(setFlagReservationTellerReguler setflagreservationtellerreguler) {
        this.c = new read();
        this.d = new HashSet();
        this.b = setflagreservationtellerreguler;
    }

    private void c(Activity activity) {
        GetCustAcctListResponse getCustAcctListResponse = this.g;
        if (getCustAcctListResponse != null) {
            getCustAcctListResponse.d.remove(this);
            this.g = null;
        }
        GetCustAcctListResponse d = Glide.e(activity).h.d(activity.getFragmentManager(), null);
        this.g = d;
        if (!equals(d)) {
            this.g.d.add(this);
        }
    }

    private boolean c(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    final Set<GetCustAcctListResponse> c() {
        if (equals(this.g)) {
            return Collections.unmodifiableSet(this.d);
        }
        if (this.g == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (GetCustAcctListResponse getCustAcctListResponse : this.g.c()) {
            if (c(getCustAcctListResponse.getParentFragment())) {
                hashSet.add(getCustAcctListResponse);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public final void d(Fragment fragment) {
        this.e = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            c(fragment.getActivity());
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        onAttach(activity);
        try {
            c(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        onDestroy();
        this.b.a();
        GetCustAcctListResponse getCustAcctListResponse = this.g;
        if (getCustAcctListResponse != null) {
            getCustAcctListResponse.d.remove(this);
            this.g = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        onDetach();
        GetCustAcctListResponse getCustAcctListResponse = this.g;
        if (getCustAcctListResponse != null) {
            getCustAcctListResponse.d.remove(this);
            this.g = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        onStart();
        this.b.c();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        onStop();
        this.b.e();
    }

    @Override // android.app.Fragment, java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        Fragment fragment = parentFragment;
        if (parentFragment == null) {
            fragment = this.e;
        }
        sb.append(fragment);
        sb.append("}");
        return sb.toString();
    }
}
