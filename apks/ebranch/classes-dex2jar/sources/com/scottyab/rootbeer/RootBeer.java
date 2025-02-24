package com.scottyab.rootbeer;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.scottyab.rootbeer.util.QLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
/* loaded from: classes-dex2jar.jar:com/scottyab/rootbeer/RootBeer.class */
public class RootBeer {
    private boolean loggingEnabled = true;
    private final Context mContext;

    public RootBeer(Context context) {
        this.mContext = context;
    }

    private boolean isAnyPackageFromListInstalled(List<String> list) {
        PackageManager packageManager = this.mContext.getPackageManager();
        boolean z = false;
        for (String str : list) {
            try {
                packageManager.getPackageInfo(str, 0);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" ROOT management app detected!");
                QLog.e(sb.toString());
                z = true;
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return z;
    }

    private String[] mountReader() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("mount").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            QLog.e(e);
            return null;
        }
    }

    private String[] propsReader() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            QLog.e(e);
            return null;
        }
    }

    public boolean canLoadNativeLibrary() {
        return new RootBeerNative().wasNativeLibraryLoaded();
    }

    public boolean checkForBinary(String str) {
        String[] paths = Const.getPaths();
        boolean z = false;
        for (String str2 : paths) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            String obj = sb.toString();
            if (new File(str2, str).exists()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(" binary detected!");
                QLog.v(sb2.toString());
                z = true;
            }
        }
        return z;
    }

    public boolean checkForBusyBoxBinary() {
        return checkForBinary("busybox");
    }

    public boolean checkForDangerousProps() {
        HashMap hashMap = new HashMap();
        hashMap.put("ro.debuggable", "1");
        hashMap.put("ro.secure", "0");
        String[] propsReader = propsReader();
        if (propsReader == null) {
            return false;
        }
        boolean z = false;
        for (String str : propsReader) {
            for (String str2 : hashMap.keySet()) {
                if (str.contains(str2)) {
                    String str3 = (String) hashMap.get(str2);
                    StringBuilder sb = new StringBuilder("[");
                    sb.append(str3);
                    sb.append("]");
                    String obj = sb.toString();
                    if (str.contains(obj)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(" = ");
                        sb2.append(obj);
                        sb2.append(" detected!");
                        QLog.v(sb2.toString());
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public boolean checkForMagiskBinary() {
        return checkForBinary("magisk");
    }

    public boolean checkForNativeLibraryReadAccess() {
        try {
            new RootBeerNative().setLogDebugMessages(this.loggingEnabled);
            return true;
        } catch (UnsatisfiedLinkError e) {
            return false;
        }
    }

    public boolean checkForRWPaths() {
        String[] mountReader = mountReader();
        if (mountReader == null) {
            return false;
        }
        boolean z = false;
        for (String str : mountReader) {
            String[] split = str.split(" ");
            if (split.length < 4) {
                StringBuilder sb = new StringBuilder("Error formatting mount line: ");
                sb.append(str);
                QLog.e(sb.toString());
                z = z;
            } else {
                String str2 = split[1];
                String str3 = split[3];
                String[] strArr = Const.pathsThatShouldNotBeWritable;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    z = z;
                    if (i < length) {
                        String str4 = strArr[i];
                        z = z;
                        if (str2.equalsIgnoreCase(str4)) {
                            String[] split2 = str3.split(",");
                            int length2 = split2.length;
                            int i2 = 0;
                            while (true) {
                                z = z;
                                if (i2 >= length2) {
                                    break;
                                } else if (split2[i2].equalsIgnoreCase("rw")) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str4);
                                    sb2.append(" path is mounted with rw permissions! ");
                                    sb2.append(str);
                                    QLog.v(sb2.toString());
                                    z = true;
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        i++;
                    }
                }
            }
        }
        return z;
    }

    public boolean checkForRootNative() {
        boolean z = false;
        if (!canLoadNativeLibrary()) {
            QLog.e("We could not load the native library to test for root");
            return false;
        }
        String[] paths = Const.getPaths();
        int length = paths.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(paths[i]);
            sb.append("su");
            strArr[i] = sb.toString();
        }
        RootBeerNative rootBeerNative = new RootBeerNative();
        try {
            rootBeerNative.setLogDebugMessages(this.loggingEnabled);
            if (rootBeerNative.checkForRoot(strArr) > 0) {
                z = true;
            }
        } catch (UnsatisfiedLinkError e) {
        }
        return z;
    }

    public boolean checkForSuBinary() {
        return checkForBinary("su");
    }

    public boolean checkSuExists() {
        Process process;
        boolean z = false;
        try {
            process = Runtime.getRuntime().exec(new String[]{"which", "su"});
            try {
                if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null) {
                    z = true;
                }
                if (process != null) {
                    process.destroy();
                }
                return z;
            } catch (Throwable th) {
                if (process == null) {
                    return false;
                }
                process.destroy();
                return false;
            }
        } catch (Throwable th2) {
            process = null;
        }
    }

    public boolean detectPotentiallyDangerousApps() {
        return detectPotentiallyDangerousApps(null);
    }

    public boolean detectPotentiallyDangerousApps(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(Const.knownDangerousAppsPackages));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return isAnyPackageFromListInstalled(arrayList);
    }

    public boolean detectRootCloakingApps() {
        return detectRootCloakingApps(null) || (canLoadNativeLibrary() && !checkForNativeLibraryReadAccess());
    }

    public boolean detectRootCloakingApps(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(Const.knownRootCloakingPackages));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return isAnyPackageFromListInstalled(arrayList);
    }

    public boolean detectRootManagementApps() {
        return detectRootManagementApps(null);
    }

    public boolean detectRootManagementApps(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(Const.knownRootAppsPackages));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return isAnyPackageFromListInstalled(arrayList);
    }

    public boolean detectTestKeys() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    public boolean isRooted() {
        return detectRootManagementApps() || detectPotentiallyDangerousApps() || checkForBinary("su") || checkForDangerousProps() || checkForRWPaths() || detectTestKeys() || checkSuExists() || checkForRootNative() || checkForMagiskBinary();
    }

    public boolean isRootedWithBusyBoxCheck() {
        return detectRootManagementApps() || detectPotentiallyDangerousApps() || checkForBinary("su") || checkForBinary("busybox") || checkForDangerousProps() || checkForRWPaths() || detectTestKeys() || checkSuExists() || checkForRootNative() || checkForMagiskBinary();
    }

    public boolean isRootedWithoutBusyBoxCheck() {
        return isRooted();
    }

    public void setLogging(boolean z) {
        this.loggingEnabled = z;
        QLog.LOGGING_LEVEL = z ? 5 : 0;
    }
}
