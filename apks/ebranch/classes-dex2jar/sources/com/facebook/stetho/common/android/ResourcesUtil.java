package com.facebook.stetho.common.android;

import android.content.res.Resources;
import com.facebook.stetho.common.LogUtil;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/common/android/ResourcesUtil.class */
public class ResourcesUtil {
    private ResourcesUtil() {
    }

    private static String getFallbackIdString(int i) {
        StringBuilder sb = new StringBuilder("#");
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }

    public static String getIdString(@Nullable Resources resources, int i) throws Resources.NotFoundException {
        String str;
        if (resources == null) {
            return getFallbackIdString(i);
        }
        String str2 = "";
        if (getResourcePackageId(i) != 127) {
            str2 = resources.getResourcePackageName(i);
            str = ":";
        } else {
            str = "";
        }
        String resourceTypeName = resources.getResourceTypeName(i);
        String resourceEntryName = resources.getResourceEntryName(i);
        StringBuilder sb = new StringBuilder(str2.length() + 1 + str.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
        sb.append("@");
        sb.append(str2);
        sb.append(str);
        sb.append(resourceTypeName);
        sb.append("/");
        sb.append(resourceEntryName);
        return sb.toString();
    }

    @Nonnull
    public static String getIdStringQuietly(Object obj, @Nullable Resources resources, int i) {
        try {
            return getIdString(resources, i);
        } catch (Resources.NotFoundException e) {
            String fallbackIdString = getFallbackIdString(i);
            StringBuilder sb = new StringBuilder("Unknown identifier encountered on ");
            sb.append(obj);
            sb.append(": ");
            sb.append(fallbackIdString);
            LogUtil.w(sb.toString());
            return fallbackIdString;
        }
    }

    private static int getResourcePackageId(int i) {
        return i >>> 24;
    }
}
