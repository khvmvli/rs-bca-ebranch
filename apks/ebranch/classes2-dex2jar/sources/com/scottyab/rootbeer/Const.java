package com.scottyab.rootbeer;

import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes2-dex2jar.jar:com/scottyab/rootbeer/Const.class */
public final class Const {
    public static final String BINARY_BUSYBOX = "busybox";
    public static final String BINARY_SU = "su";
    public static final String[] knownRootAppsPackages = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"};
    public static final String[] knownDangerousAppsPackages = {"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.chelpus.luckypatcher"};
    public static final String[] knownRootCloakingPackages = {"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot"};
    public static final String[] suPaths = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"};
    public static final String[] pathsThatShouldNotBeWritable = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};

    private Const() throws InstantiationException {
        throw new InstantiationException("This class is not for instantiation");
    }

    static String[] getPaths() {
        ArrayList arrayList = new ArrayList(Arrays.asList(suPaths));
        String str = System.getenv("PATH");
        if (str == null || "".equals(str)) {
            return (String[]) arrayList.toArray(new String[0]);
        }
        String[] split = str.split(":");
        for (String str2 : split) {
            String str3 = str2;
            if (!str2.endsWith("/")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append('/');
                str3 = sb.toString();
            }
            if (!arrayList.contains(str3)) {
                arrayList.add(str3);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
