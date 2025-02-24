package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.BahasaLayananDialog;
import o.PilihRekeningDialog;
import o.PilihRekeningDialog_ViewBinding;
import o.PilihRekeningSumberDanaDialog;
import o.Tarikan;
import o.realmGet;
import o.setJatuhTempo;
import o.setLocalClearingCodeBank;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/analytics/FirebaseAnalytics.class */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics zza;
    private final realmGet.emergencyContactOfficeExt zzb;
    private ExecutorService zzc;

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/analytics/FirebaseAnalytics$ConsentStatus.class */
    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/analytics/FirebaseAnalytics$ConsentType.class */
    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/analytics/FirebaseAnalytics$Event.class */
    public static class Event {
        public static final String ADD_PAYMENT_INFO;
        public static final String ADD_SHIPPING_INFO;
        public static final String ADD_TO_CART;
        public static final String ADD_TO_WISHLIST;
        public static final String AD_IMPRESSION;
        public static final String APP_OPEN;
        public static final String BEGIN_CHECKOUT;
        public static final String CAMPAIGN_DETAILS;
        @Deprecated
        public static final String CHECKOUT_PROGRESS;
        public static final String EARN_VIRTUAL_CURRENCY;
        @Deprecated
        public static final String ECOMMERCE_PURCHASE;
        public static final String GENERATE_LEAD;
        public static final String JOIN_GROUP;
        public static final String LEVEL_END;
        public static final String LEVEL_START;
        public static final String LEVEL_UP;
        public static final String LOGIN;
        public static final String POST_SCORE;
        @Deprecated
        public static final String PRESENT_OFFER;
        public static final String PURCHASE;
        @Deprecated
        public static final String PURCHASE_REFUND;
        public static final String REFUND;
        public static final String REMOVE_FROM_CART;
        public static final String SCREEN_VIEW;
        public static final String SEARCH;
        public static final String SELECT_CONTENT;
        public static final String SELECT_ITEM;
        public static final String SELECT_PROMOTION;
        @Deprecated
        public static final String SET_CHECKOUT_OPTION;
        public static final String SHARE;
        public static final String SIGN_UP;
        public static final String SPEND_VIRTUAL_CURRENCY;
        public static final String TUTORIAL_BEGIN;
        public static final String TUTORIAL_COMPLETE;
        public static final String UNLOCK_ACHIEVEMENT;
        public static final String VIEW_CART;
        public static final String VIEW_ITEM;
        public static final String VIEW_ITEM_LIST;
        public static final String VIEW_PROMOTION;
        public static final String VIEW_SEARCH_RESULTS;

        protected Event() {
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/analytics/FirebaseAnalytics$Param.class */
    public static class Param {
        public static final String ACHIEVEMENT_ID;
        public static final String ACLID;
        public static final String AD_FORMAT;
        public static final String AD_PLATFORM;
        public static final String AD_SOURCE;
        public static final String AD_UNIT_NAME;
        public static final String AFFILIATION;
        public static final String CAMPAIGN;
        public static final String CHARACTER;
        @Deprecated
        public static final String CHECKOUT_OPTION;
        @Deprecated
        public static final String CHECKOUT_STEP;
        public static final String CONTENT;
        public static final String CONTENT_TYPE;
        public static final String COUPON;
        public static final String CP1;
        public static final String CREATIVE_NAME;
        public static final String CREATIVE_SLOT;
        public static final String CURRENCY;
        public static final String DESTINATION;
        public static final String DISCOUNT;
        public static final String END_DATE;
        public static final String EXTEND_SESSION;
        public static final String FLIGHT_NUMBER;
        public static final String GROUP_ID;
        public static final String INDEX;
        public static final String ITEMS;
        public static final String ITEM_BRAND;
        public static final String ITEM_CATEGORY;
        public static final String ITEM_CATEGORY2;
        public static final String ITEM_CATEGORY3;
        public static final String ITEM_CATEGORY4;
        public static final String ITEM_CATEGORY5;
        public static final String ITEM_ID;
        @Deprecated
        public static final String ITEM_LIST;
        public static final String ITEM_LIST_ID;
        public static final String ITEM_LIST_NAME;
        @Deprecated
        public static final String ITEM_LOCATION_ID;
        public static final String ITEM_NAME;
        public static final String ITEM_VARIANT;
        public static final String LEVEL;
        public static final String LEVEL_NAME;
        public static final String LOCATION;
        public static final String LOCATION_ID;
        public static final String MEDIUM;
        public static final String METHOD;
        public static final String NUMBER_OF_NIGHTS;
        public static final String NUMBER_OF_PASSENGERS;
        public static final String NUMBER_OF_ROOMS;
        public static final String ORIGIN;
        public static final String PAYMENT_TYPE;
        public static final String PRICE;
        public static final String PROMOTION_ID;
        public static final String PROMOTION_NAME;
        public static final String QUANTITY;
        public static final String SCORE;
        public static final String SCREEN_CLASS;
        public static final String SCREEN_NAME;
        public static final String SEARCH_TERM;
        public static final String SHIPPING;
        public static final String SHIPPING_TIER;
        @Deprecated
        public static final String SIGN_UP_METHOD;
        public static final String SOURCE;
        public static final String START_DATE;
        public static final String SUCCESS;
        public static final String TAX;
        public static final String TERM;
        public static final String TRANSACTION_ID;
        public static final String TRAVEL_CLASS;
        public static final String VALUE;
        public static final String VIRTUAL_CURRENCY_NAME;

        protected Param() {
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/analytics/FirebaseAnalytics$UserProperty.class */
    public static class UserProperty {
        public static final String ALLOW_AD_PERSONALIZATION_SIGNALS;
        public static final String SIGN_UP_METHOD;

        protected UserProperty() {
        }
    }

    public FirebaseAnalytics(realmGet.emergencyContactOfficeExt emergencycontactofficeext) {
        if (emergencycontactofficeext != null) {
            this.zzb = emergencycontactofficeext;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (zza == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (zza == null) {
                        zza = new FirebaseAnalytics(realmGet.emergencyContactOfficeExt.e(context, (String) null, (String) null, (String) null, (Bundle) null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zza;
    }

    public static Tarikan getScionFrontendApiImplementation(Context context, Bundle bundle) {
        realmGet.emergencyContactOfficeExt e = realmGet.emergencyContactOfficeExt.e(context, (String) null, (String) null, (String) null, bundle);
        if (e == null) {
            return null;
        }
        return new PilihRekeningDialog_ViewBinding(e);
    }

    public final setJatuhTempo<String> getAppInstanceId() {
        ExecutorService executorService;
        try {
            synchronized (FirebaseAnalytics.class) {
                if (this.zzc == null) {
                    this.zzc = new PilihRekeningSumberDanaDialog(TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                executorService = this.zzc;
            }
            return setLocalClearingCodeBank.c(executorService, new PilihRekeningDialog(this));
        } catch (RuntimeException e) {
            this.zzb.d(5, "Failed to schedule task for getAppInstanceId", (Object) null, (Object) null, (Object) null);
            BahasaLayananDialog bahasaLayananDialog = new BahasaLayananDialog();
            bahasaLayananDialog.c(e);
            return bahasaLayananDialog;
        }
    }

    public final String getFirebaseInstanceId() {
        try {
            return (String) setLocalClearingCodeBank.b(FirebaseInstallations.getInstance().getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException e3) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public final void logEvent(String str, Bundle bundle) {
        this.zzb.a(str, bundle);
    }

    public final void resetAnalyticsData() {
        this.zzb.b();
    }

    public final void setAnalyticsCollectionEnabled(boolean z) {
        this.zzb.e(Boolean.valueOf(z));
    }

    public final void setConsent(Map<ConsentType, ConsentStatus> map) {
        Bundle bundle = new Bundle();
        ConsentStatus consentStatus = map.get(ConsentType.AD_STORAGE);
        if (consentStatus != null) {
            int ordinal = consentStatus.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        ConsentStatus consentStatus2 = map.get(ConsentType.ANALYTICS_STORAGE);
        if (consentStatus2 != null) {
            int ordinal2 = consentStatus2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        this.zzb.d(bundle);
    }

    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.zzb.b(activity, str, str2);
    }

    public final void setDefaultEventParameters(Bundle bundle) {
        this.zzb.a(bundle);
    }

    public final void setSessionTimeoutDuration(long j) {
        this.zzb.a(j);
    }

    public final void setUserId(String str) {
        this.zzb.a(str);
    }

    public final void setUserProperty(String str, String str2) {
        this.zzb.b((String) null, str, str2, false);
    }
}
