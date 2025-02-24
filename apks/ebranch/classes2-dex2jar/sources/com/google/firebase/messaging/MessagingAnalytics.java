package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import io.realm.RealmFieldTypeConstants;
import java.util.concurrent.ExecutionException;
import o.ValueTodayDialog_ViewBinding;
import o.getBanknoteCondition;
import o.getFlagRating;
import o.getStatusType;
import o.getSubToken;
import o.getTxbDate;
import o.setLocalClearingCodeBank;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/messaging/MessagingAnalytics.class */
public class MessagingAnalytics {
    static boolean deliveryMetricsExportToBigQueryEnabled() {
        ApplicationInfo applicationInfo;
        try {
            FirebaseApp.getInstance();
            Context applicationContext = FirebaseApp.getInstance().getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), RealmFieldTypeConstants.LIST_OFFSET)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return false;
                }
                return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
            } catch (PackageManager.NameNotFoundException e) {
                return false;
            }
        } catch (IllegalStateException e2) {
            Log.i(Constants.TAG, "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    static MessagingClientEvent eventToProto(MessagingClientEvent.Event event, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        Bundle bundle = extras;
        if (extras == null) {
            bundle = Bundle.EMPTY;
        }
        MessagingClientEvent.Builder newBuilder = MessagingClientEvent.newBuilder();
        newBuilder.setTtl(getTtl(bundle));
        newBuilder.setEvent(event);
        newBuilder.setInstanceId(getInstanceId(bundle));
        newBuilder.setPackageName(getPackageName());
        newBuilder.setSdkPlatform(MessagingClientEvent.SDKPlatform.ANDROID);
        newBuilder.setMessageType(getMessageTypeForFirelog(bundle));
        String messageId = getMessageId(bundle);
        if (messageId != null) {
            newBuilder.setMessageId(messageId);
        }
        String topic = getTopic(bundle);
        if (topic != null) {
            newBuilder.setTopic(topic);
        }
        String collapseKey = getCollapseKey(bundle);
        if (collapseKey != null) {
            newBuilder.setCollapseKey(collapseKey);
        }
        String messageLabel = getMessageLabel(bundle);
        if (messageLabel != null) {
            newBuilder.setAnalyticsLabel(messageLabel);
        }
        String composerLabel = getComposerLabel(bundle);
        if (composerLabel != null) {
            newBuilder.setComposerLabel(composerLabel);
        }
        long projectNumber = getProjectNumber(bundle);
        if (projectNumber > 0) {
            newBuilder.setProjectNumber(projectNumber);
        }
        return newBuilder.build();
    }

    static String getCollapseKey(Bundle bundle) {
        return bundle.getString(Constants.MessagePayloadKeys.COLLAPSE_KEY);
    }

    static String getComposerId(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.COMPOSER_ID);
    }

    static String getComposerLabel(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.COMPOSER_LABEL);
    }

    static String getInstanceId(Bundle bundle) {
        String string = bundle.getString(Constants.MessagePayloadKeys.TO);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) setLocalClearingCodeBank.a(FirebaseInstallations.getInstance(FirebaseApp.getInstance()).getId());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    static String getMessageChannel(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.MESSAGE_CHANNEL);
    }

    static String getMessageId(Bundle bundle) {
        String string = bundle.getString(Constants.MessagePayloadKeys.MSGID);
        return string == null ? bundle.getString(Constants.MessagePayloadKeys.MSGID_SERVER) : string;
    }

    static String getMessageLabel(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.MESSAGE_LABEL);
    }

    static String getMessageTime(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.MESSAGE_TIMESTAMP);
    }

    static MessagingClientEvent.MessageType getMessageTypeForFirelog(Bundle bundle) {
        return (bundle == null || !NotificationParams.isNotification(bundle)) ? MessagingClientEvent.MessageType.DATA_MESSAGE : MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
    }

    static String getMessageTypeForScion(Bundle bundle) {
        return true != NotificationParams.isNotification(bundle) ? "data" : "display";
    }

    static String getPackageName() {
        return FirebaseApp.getInstance().getApplicationContext().getPackageName();
    }

    static long getProjectNumber(Bundle bundle) {
        if (bundle.containsKey(Constants.MessagePayloadKeys.SENDER_ID)) {
            try {
                return Long.parseLong(bundle.getString(Constants.MessagePayloadKeys.SENDER_ID));
            } catch (NumberFormatException e) {
                Log.w(Constants.TAG, "error parsing project number", e);
            }
        }
        FirebaseApp instance = FirebaseApp.getInstance();
        String gcmSenderId = instance.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            try {
                return Long.parseLong(gcmSenderId);
            } catch (NumberFormatException e2) {
                Log.w(Constants.TAG, "error parsing sender ID", e2);
            }
        }
        String applicationId = instance.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            try {
                return Long.parseLong(applicationId);
            } catch (NumberFormatException e3) {
                Log.w(Constants.TAG, "error parsing app ID", e3);
                return 0;
            }
        } else {
            String[] split = applicationId.split(":");
            if (split.length < 2) {
                return 0;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e4) {
                Log.w(Constants.TAG, "error parsing app ID", e4);
                return 0;
            }
        }
    }

    static String getTopic(Bundle bundle) {
        String string = bundle.getString(Constants.MessagePayloadKeys.FROM);
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    static int getTtl(Bundle bundle) {
        Object obj = bundle.get(Constants.MessagePayloadKeys.TTL);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(valueOf);
            Log.w(Constants.TAG, sb.toString());
            return 0;
        }
    }

    static String getUseDeviceTime(Bundle bundle) {
        if (bundle.containsKey(Constants.AnalyticsKeys.MESSAGE_USE_DEVICE_TIME)) {
            return bundle.getString(Constants.AnalyticsKeys.MESSAGE_USE_DEVICE_TIME);
        }
        return null;
    }

    private static boolean isDirectBootMessage(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    public static void logNotificationDismiss(Intent intent) {
        logToScion(Constants.ScionAnalytics.EVENT_NOTIFICATION_DISMISS, intent.getExtras());
    }

    public static void logNotificationForeground(Intent intent) {
        logToScion(Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND, intent.getExtras());
    }

    public static void logNotificationOpen(Bundle bundle) {
        setUserPropertyIfRequired(bundle);
        logToScion(Constants.ScionAnalytics.EVENT_NOTIFICATION_OPEN, bundle);
    }

    public static void logNotificationReceived(Intent intent) {
        if (shouldUploadScionMetrics(intent)) {
            logToScion(Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE, intent.getExtras());
        }
        if (shouldUploadFirelogAnalytics(intent)) {
            logToFirelog(MessagingClientEvent.Event.MESSAGE_DELIVERED, intent, FirebaseMessaging.getTransportFactory());
        }
    }

    private static void logToFirelog(MessagingClientEvent.Event event, Intent intent, getStatusType getstatustype) {
        if (getstatustype == null) {
            Log.e(Constants.TAG, "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        MessagingClientEvent eventToProto = eventToProto(event, intent);
        if (eventToProto != null) {
            try {
                getSubToken b = getstatustype.b(Constants.FirelogAnalytics.FCM_LOG_SOURCE, new getFlagRating("proto"), ValueTodayDialog_ViewBinding.a);
                MessagingClientEventExtension.Builder newBuilder = MessagingClientEventExtension.newBuilder();
                newBuilder.setMessagingClientEvent(eventToProto);
                b.a(new getBanknoteCondition((Integer) null, newBuilder.build(), getTxbDate.a));
            } catch (RuntimeException e) {
                Log.w(Constants.TAG, "Failed to send big query analytics payload.", e);
            }
        }
    }

    static void logToScion(String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        Bundle bundle3 = new Bundle();
        String composerId = getComposerId(bundle2);
        if (composerId != null) {
            bundle3.putString("_nmid", composerId);
        }
        String composerLabel = getComposerLabel(bundle2);
        if (composerLabel != null) {
            bundle3.putString(Constants.ScionAnalytics.PARAM_MESSAGE_NAME, composerLabel);
        }
        String messageLabel = getMessageLabel(bundle2);
        if (!TextUtils.isEmpty(messageLabel)) {
            bundle3.putString(Constants.ScionAnalytics.PARAM_LABEL, messageLabel);
        }
        String messageChannel = getMessageChannel(bundle2);
        if (!TextUtils.isEmpty(messageChannel)) {
            bundle3.putString(Constants.ScionAnalytics.PARAM_MESSAGE_CHANNEL, messageChannel);
        }
        String topic = getTopic(bundle2);
        if (topic != null) {
            bundle3.putString(Constants.ScionAnalytics.PARAM_TOPIC, topic);
        }
        String messageTime = getMessageTime(bundle2);
        if (messageTime != null) {
            try {
                bundle3.putInt(Constants.ScionAnalytics.PARAM_MESSAGE_TIME, Integer.parseInt(messageTime));
            } catch (NumberFormatException e) {
                Log.w(Constants.TAG, "Error while parsing timestamp in GCM event", e);
            }
        }
        String useDeviceTime = getUseDeviceTime(bundle2);
        if (useDeviceTime != null) {
            try {
                bundle3.putInt(Constants.ScionAnalytics.PARAM_MESSAGE_DEVICE_TIME, Integer.parseInt(useDeviceTime));
            } catch (NumberFormatException e2) {
                Log.w(Constants.TAG, "Error while parsing use_device_time in GCM event", e2);
            }
        }
        String messageTypeForScion = getMessageTypeForScion(bundle2);
        if (Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE.equals(str) || Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND.equals(str)) {
            bundle3.putString(Constants.ScionAnalytics.PARAM_MESSAGE_TYPE, messageTypeForScion);
        }
        if (Log.isLoggable(Constants.TAG, 3)) {
            String valueOf = String.valueOf(bundle3);
            StringBuilder sb = new StringBuilder(str.length() + 37 + String.valueOf(valueOf).length());
            sb.append("Logging to scion event=");
            sb.append(str);
            sb.append(" scionPayload=");
            sb.append(valueOf);
            Log.d(Constants.TAG, sb.toString());
        }
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
        if (analyticsConnector != null) {
            analyticsConnector.logEvent(Constants.ScionAnalytics.ORIGIN_FCM, str, bundle3);
        } else {
            Log.w(Constants.TAG, "Unable to log event: analytics library is missing");
        }
    }

    static void setDeliveryMetricsExportToBigQuery(boolean z) {
        FirebaseApp.getInstance().getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z).apply();
    }

    private static void setUserPropertyIfRequired(Bundle bundle) {
        if (bundle != null) {
            if ("1".equals(bundle.getString(Constants.AnalyticsKeys.TRACK_CONVERSIONS))) {
                AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
                if (Log.isLoggable(Constants.TAG, 3)) {
                    Log.d(Constants.TAG, "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if (analyticsConnector != null) {
                    String string = bundle.getString(Constants.AnalyticsKeys.COMPOSER_ID);
                    analyticsConnector.setUserProperty(Constants.ScionAnalytics.ORIGIN_FCM, Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION, string);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", "Firebase");
                    bundle2.putString("medium", "notification");
                    bundle2.putString("campaign", string);
                    analyticsConnector.logEvent(Constants.ScionAnalytics.ORIGIN_FCM, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle2);
                    return;
                }
                Log.w(Constants.TAG, "Unable to set user property for conversion tracking:  analytics library is missing");
            } else if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "Received event with track-conversion=false. Do not set user property");
            }
        }
    }

    public static boolean shouldUploadFirelogAnalytics(Intent intent) {
        if (intent == null || isDirectBootMessage(intent)) {
            return false;
        }
        return deliveryMetricsExportToBigQueryEnabled();
    }

    public static boolean shouldUploadScionMetrics(Intent intent) {
        if (intent == null || isDirectBootMessage(intent)) {
            return false;
        }
        return shouldUploadScionMetrics(intent.getExtras());
    }

    public static boolean shouldUploadScionMetrics(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString(Constants.AnalyticsKeys.ENABLED));
    }
}
