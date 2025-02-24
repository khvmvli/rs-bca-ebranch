package com.facebook.stetho.dumpapp.plugins;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.stetho.dumpapp.DumpUsageException;
import com.facebook.stetho.dumpapp.DumperContext;
import com.facebook.stetho.dumpapp.DumperPlugin;
import io.realm.CollectionUtils;
import java.io.File;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/dumpapp/plugins/SharedPreferencesDumperPlugin.class */
public class SharedPreferencesDumperPlugin implements DumperPlugin {
    private static final String NAME = "prefs";
    private static final String XML_SUFFIX = ".xml";
    private final Context mAppContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin$1  reason: invalid class name */
    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/dumpapp/plugins/SharedPreferencesDumperPlugin$1.class */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type = iArr;
            try {
                iArr[Type.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type[Type.INT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type[Type.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type[Type.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type[Type.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type[Type.SET.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/dumpapp/plugins/SharedPreferencesDumperPlugin$Type.class */
    public enum Type {
        BOOLEAN("boolean"),
        INT("int"),
        LONG("long"),
        FLOAT("float"),
        STRING("string"),
        SET(CollectionUtils.SET_TYPE);
        
        private final String name;

        Type(String str) {
            this.name = str;
        }

        public static StringBuilder appendNamesList(StringBuilder sb, String str) {
            Type[] values = values();
            boolean z = true;
            for (Type type : values) {
                if (z) {
                    z = false;
                } else {
                    sb.append(str);
                }
                sb.append(type.name);
            }
            return sb;
        }

        @Nullable
        public static Type of(String str) {
            Type[] values = values();
            for (Type type : values) {
                if (type.name.equals(str)) {
                    return type;
                }
            }
            return null;
        }
    }

    public SharedPreferencesDumperPlugin(Context context) {
        this.mAppContext = context.getApplicationContext();
    }

    private void doPrint(PrintStream printStream, List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mAppContext.getApplicationInfo().dataDir);
        sb.append("/shared_prefs");
        printRecursive(printStream, sb.toString(), "", list.isEmpty() ? "" : list.get(0), list.size() > 1 ? list.get(1) : "");
    }

    private void doUsage(PrintStream printStream) {
        printStream.println("Usage: dumpapp prefs <command> [command-options]");
        printStream.println("Usage: dumpapp prefs print [pathPrefix [keyPrefix]]");
        StringBuilder sb = new StringBuilder("       dumpapp prefs ");
        sb.append("write <path> <key> <");
        StringBuilder appendNamesList = Type.appendNamesList(sb, "|");
        appendNamesList.append("> <value>");
        printStream.println(appendNamesList);
        printStream.println();
        printStream.println("dumpapp prefs print: Print all matching values from the shared preferences");
        printStream.println();
        printStream.println("dumpapp prefs write: Writes a value to the shared preferences");
    }

    private void doWrite(List<String> list) throws DumpUsageException {
        Iterator<String> it = list.iterator();
        String nextArg = nextArg(it, "Expected <path>");
        String nextArg2 = nextArg(it, "Expected <key>");
        Type of = Type.of(nextArg(it, "Expected <type>"));
        if (of != null) {
            SharedPreferences.Editor edit = getSharedPreferences(nextArg).edit();
            switch (AnonymousClass1.$SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type[of.ordinal()]) {
                case 1:
                    edit.putBoolean(nextArg2, Boolean.valueOf(nextArgValue(it)).booleanValue());
                    break;
                case 2:
                    edit.putInt(nextArg2, Integer.valueOf(nextArgValue(it)).intValue());
                    break;
                case 3:
                    edit.putLong(nextArg2, Long.valueOf(nextArgValue(it)).longValue());
                    break;
                case 4:
                    edit.putFloat(nextArg2, Float.valueOf(nextArgValue(it)).floatValue());
                    break;
                case 5:
                    edit.putString(nextArg2, nextArgValue(it));
                    break;
                case 6:
                    putStringSet(edit, nextArg2, it);
                    break;
            }
            edit.commit();
            return;
        }
        throw new DumpUsageException(Type.appendNamesList(new StringBuilder("Usage: prefs write <path> <key> <type> <value>, where type is one of: "), ", ").toString());
    }

    private SharedPreferences getSharedPreferences(String str) {
        return this.mAppContext.getSharedPreferences(str, 4);
    }

    @Nonnull
    private static String nextArg(Iterator<String> it, String str) throws DumpUsageException {
        if (it.hasNext()) {
            return it.next();
        }
        throw new DumpUsageException(str);
    }

    @Nonnull
    private static String nextArgValue(Iterator<String> it) throws DumpUsageException {
        return nextArg(it, "Expected <value>");
    }

    private void printFile(PrintStream printStream, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        printStream.println(sb.toString());
        for (Map.Entry<String, ?> entry : getSharedPreferences(str).getAll().entrySet()) {
            if (entry.getKey().startsWith(str2)) {
                StringBuilder sb2 = new StringBuilder("  ");
                sb2.append(entry.getKey());
                sb2.append(" = ");
                sb2.append(entry.getValue());
                printStream.println(sb2.toString());
            }
        }
    }

    private void printRecursive(PrintStream printStream, String str, String str2, String str3, String str4) {
        String[] list;
        String str5;
        File file = new File(str, str2);
        if (file.isFile()) {
            if (str2.endsWith(XML_SUFFIX)) {
                printFile(printStream, str2.substring(0, str2.length() - 4), str4);
            }
        } else if (file.isDirectory() && (list = file.list()) != null) {
            for (int i = 0; i < list.length; i++) {
                if (TextUtils.isEmpty(str2)) {
                    str5 = list[i];
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(File.separator);
                    sb.append(list[i]);
                    str5 = sb.toString();
                }
                if (str5.startsWith(str3)) {
                    printRecursive(printStream, str, str5, str3, str4);
                }
            }
        }
    }

    private static void putStringSet(SharedPreferences.Editor editor, String str, Iterator<String> it) {
        HashSet hashSet = new HashSet();
        while (it.hasNext()) {
            hashSet.add(it.next());
        }
        editor.putStringSet(str, hashSet);
    }

    @Override // com.facebook.stetho.dumpapp.DumperPlugin
    public void dump(DumperContext dumperContext) throws DumpUsageException {
        PrintStream stdout = dumperContext.getStdout();
        List<String> argsAsList = dumperContext.getArgsAsList();
        String remove = argsAsList.isEmpty() ? "" : argsAsList.remove(0);
        if (remove.equals("print")) {
            doPrint(stdout, argsAsList);
        } else if (remove.equals("write")) {
            doWrite(argsAsList);
        } else {
            doUsage(stdout);
        }
    }

    @Override // com.facebook.stetho.dumpapp.DumperPlugin
    public String getName() {
        return NAME;
    }
}
