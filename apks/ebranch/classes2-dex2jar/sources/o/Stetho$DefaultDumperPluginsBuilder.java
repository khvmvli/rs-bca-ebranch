package o;
/* loaded from: classes2-dex2jar.jar:o/Stetho$DefaultDumperPluginsBuilder.class */
final class Stetho$DefaultDumperPluginsBuilder {
    Stetho$DefaultDumperPluginsBuilder() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("--")) {
            return str.substring(2, str.length());
        }
        String str2 = str;
        if (str.startsWith("-")) {
            str2 = str.substring(1, str.length());
        }
        return str2;
    }
}
