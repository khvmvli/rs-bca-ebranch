package o;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import java.util.HashMap;
import java.util.Map;
import o.CategoriesORResponse;
import o.setIncomeAmount;
/* loaded from: classes-dex2jar.jar:o/GetBranchROResponse$DetailBranch$$Parcelable.class */
public final class GetBranchROResponse$DetailBranch$$Parcelable implements Handler.Callback {
    private static final GetBranchROResponse$DetailBranch$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver d = new GetBranchROResponse$DetailBranch$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.GetBranchROResponse$DetailBranch$$Parcelable.2
        @Override // o.GetBranchROResponse$DetailBranch$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver
        public final CategoriesORResponse.Category d(Glide glide, setTimeZone settimezone, GetBranchReservationResponse$ReservationBranch$$Parcelable getBranchReservationResponse$ReservationBranch$$Parcelable, Context context) {
            return new CategoriesORResponse.Category(glide, settimezone, getBranchReservationResponse$ReservationBranch$$Parcelable, context);
        }
    };
    private final GetBranchROResponse$DetailBranch$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver a;
    private volatile CategoriesORResponse.Category b;
    private final setProvince f;
    private final Handler i;
    final Map<FragmentManager, GetCustAcctListResponse> c = new HashMap();
    final Map<isDetached, GetCustAcctListResponse$$Parcelable> e = new HashMap();
    private final setThumbTextPadding<View, Fragment> h = new setThumbTextPadding<>();
    private final setThumbTextPadding<View, android.app.Fragment> g = new setThumbTextPadding<>();
    private final Bundle j = new Bundle();

    public GetBranchROResponse$DetailBranch$$Parcelable(GetBranchROResponse$DetailBranch$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver getBranchROResponse$DetailBranch$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver, CategoriesORResponse$$Parcelable categoriesORResponse$$Parcelable) {
        this.a = getBranchROResponse$DetailBranch$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver == null ? d : getBranchROResponse$DetailBranch$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver;
        this.i = new Handler(Looper.getMainLooper(), this);
        this.f = (!GetBankSpecialRelationResponse$SpecialBank$$Parcelable.d || !GetBankSpecialRelationResponse$SpecialBank$$Parcelable.b) ? new setPhone() : categoriesORResponse$$Parcelable.d.containsKey(setIncomeAmount.write.class) ? new setFlagWeekendBankingSunday() : new setRegularKiosk();
    }

    @Deprecated
    private CategoriesORResponse.Category a(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        GetCustAcctListResponse d2 = d(fragmentManager, fragment);
        CategoriesORResponse.Category category = d2.a;
        CategoriesORResponse.Category category2 = category;
        if (category == null) {
            category2 = this.a.d(Glide.e(context), d2.b, d2.c, context);
            if (z) {
                category2.d();
            }
            d2.a = category2;
        }
        return category2;
    }

    private CategoriesORResponse.Category b(Activity activity) {
        if (getTxnNotes2.c()) {
            return d(activity.getApplicationContext());
        }
        if (activity instanceof getView) {
            return e((getView) activity);
        }
        if (!activity.isDestroyed()) {
            return a(activity, activity.getFragmentManager(), null, b((Context) activity));
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    private static boolean b(Context context) {
        Activity e = context instanceof Activity ? (Activity) context : context instanceof ContextWrapper ? e(((ContextWrapper) context).getBaseContext()) : null;
        return e == null || !e.isFinishing();
    }

    private CategoriesORResponse.Category c(Context context) {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = this.a.d(Glide.e(context.getApplicationContext()), new setFlagReservationCsoReguler(), new setPrioritasKiosk(), context.getApplicationContext());
                }
            }
        }
        return this.b;
    }

    private static Activity e(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    private CategoriesORResponse.Category e(Context context, isDetached isdetached, Fragment fragment, boolean z) {
        GetCustAcctListResponse$$Parcelable e = e(isdetached, fragment);
        CategoriesORResponse.Category category = e.c;
        CategoriesORResponse.Category category2 = category;
        if (category == null) {
            category2 = this.a.d(Glide.e(context), e.a, e.e, context);
            if (z) {
                category2.d();
            }
            e.c = category2;
        }
        return category2;
    }

    private CategoriesORResponse.Category e(getView getview) {
        if (getTxnNotes2.c()) {
            return d(getview.getApplicationContext());
        }
        if (!getview.isDestroyed()) {
            return e(getview, getview.l(), null, b((Context) getview));
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    private GetCustAcctListResponse$$Parcelable e(isDetached isdetached, Fragment fragment) {
        isDetached e;
        GetCustAcctListResponse$$Parcelable getCustAcctListResponse$$Parcelable = (GetCustAcctListResponse$$Parcelable) isdetached.findFragmentByTag("com.bumptech.glide.manager");
        GetCustAcctListResponse$$Parcelable getCustAcctListResponse$$Parcelable2 = getCustAcctListResponse$$Parcelable;
        if (getCustAcctListResponse$$Parcelable == null) {
            GetCustAcctListResponse$$Parcelable getCustAcctListResponse$$Parcelable3 = this.e.get(isdetached);
            getCustAcctListResponse$$Parcelable2 = getCustAcctListResponse$$Parcelable3;
            if (getCustAcctListResponse$$Parcelable3 == null) {
                getCustAcctListResponse$$Parcelable2 = new GetCustAcctListResponse$$Parcelable();
                getCustAcctListResponse$$Parcelable2.d = fragment;
                if (!(fragment == null || fragment.getContext() == null || (e = GetCustAcctListResponse$$Parcelable.e(fragment)) == null)) {
                    getCustAcctListResponse$$Parcelable2.d(fragment.getContext(), e);
                }
                this.e.put(isdetached, getCustAcctListResponse$$Parcelable2);
                getUserVisibleHint getuservisiblehint = new getUserVisibleHint(isdetached);
                getuservisiblehint.d(0, getCustAcctListResponse$$Parcelable2, "com.bumptech.glide.manager", 1);
                getuservisiblehint.c();
                this.i.obtainMessage(2, isdetached).sendToTarget();
            }
        }
        return getCustAcctListResponse$$Parcelable2;
    }

    public final CategoriesORResponse.Category d(Context context) {
        while (context != null) {
            if (getTxnNotes2.a() && !(context instanceof Application)) {
                if (context instanceof getView) {
                    return e((getView) context);
                }
                if (context instanceof Activity) {
                    return b((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        context = contextWrapper.getBaseContext();
                    }
                }
            }
            return c(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final GetCustAcctListResponse$$Parcelable d(isDetached isdetached) {
        return e(isdetached, null);
    }

    public GetCustAcctListResponse d(FragmentManager fragmentManager, android.app.Fragment fragment) {
        GetCustAcctListResponse getCustAcctListResponse = (GetCustAcctListResponse) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        GetCustAcctListResponse getCustAcctListResponse2 = getCustAcctListResponse;
        if (getCustAcctListResponse == null) {
            GetCustAcctListResponse getCustAcctListResponse3 = this.c.get(fragmentManager);
            getCustAcctListResponse2 = getCustAcctListResponse3;
            if (getCustAcctListResponse3 == null) {
                getCustAcctListResponse2 = new GetCustAcctListResponse();
                getCustAcctListResponse2.d(fragment);
                this.c.put(fragmentManager, getCustAcctListResponse2);
                fragmentManager.beginTransaction().add(getCustAcctListResponse2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.i.obtainMessage(1, fragmentManager).sendToTarget();
            }
        }
        return getCustAcctListResponse2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        int i = message.what;
        Object obj2 = null;
        boolean z = true;
        if (i == 1) {
            obj = (FragmentManager) message.obj;
            obj2 = this.c.remove(obj);
        } else if (i != 2) {
            z = false;
            obj = null;
        } else {
            obj = (isDetached) message.obj;
            obj2 = this.e.remove(obj);
        }
        if (z && obj2 == null && Log.isLoggable("RMRetriever", 5)) {
            StringBuilder sb = new StringBuilder("Failed to remove expected request manager fragment, manager: ");
            sb.append(obj);
            Log.w("RMRetriever", sb.toString());
        }
        return z;
    }
}
