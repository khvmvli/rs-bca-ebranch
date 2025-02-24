package com.scottyab.rootbeer.util;
/* loaded from: classes2-dex2jar.jar:com/scottyab/rootbeer/util/Utils.class */
public final class Utils {
    private Utils() throws InstantiationException {
        throw new InstantiationException("This class is not for instantiation");
    }

    public static boolean isSelinuxFlagInEnabled() {
        boolean z = false;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            z = "1".equals((String) cls.getMethod("get", String.class).invoke(cls, "ro.build.selinux"));
        } catch (Exception e) {
        }
        return z;
    }
}
