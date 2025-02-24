package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:o/requireFragmentManager.class */
public final class requireFragmentManager {
    private static final Set<File> e = new HashSet();
    private static final boolean b = a(System.getProperty("java.vm.version"));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/requireFragmentManager$write.class */
    public static final class write {
        private static Object[] a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            return (Object[]) requireFragmentManager.a(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }

        static void d(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            Object obj = requireFragmentManager.b(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            requireFragmentManager.e(obj, "dexElements", a(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field b = requireFragmentManager.b(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) b.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    iOExceptionArr = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr, arrayList.size(), iOExceptionArr2.length);
                }
                b.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }
    }

    private static ApplicationInfo a(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e2) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method a(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException e2) {
            }
        }
        StringBuilder sb = new StringBuilder("Method ");
        sb.append(str);
        sb.append(" with parameters ");
        sb.append(Arrays.asList(clsArr));
        sb.append(" not found in ");
        sb.append(obj.getClass());
        throw new NoSuchMethodException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r0 > 0) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static boolean a(java.lang.String r5) {
        /*
            r0 = 0
            r6 = r0
            r0 = r6
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0072
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r1 = r0
            r2 = r5
            java.lang.String r3 = "."
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r8
            boolean r0 = r0.hasMoreTokens()
            r7 = r0
            r0 = 0
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L_0x0028
            r0 = r8
            java.lang.String r0 = r0.nextToken()
            r10 = r0
            goto L_0x002b
        L_0x0028:
            r0 = 0
            r10 = r0
        L_0x002b:
            r0 = r8
            boolean r0 = r0.hasMoreTokens()
            if (r0 == 0) goto L_0x0038
            r0 = r8
            java.lang.String r0 = r0.nextToken()
            r9 = r0
        L_0x0038:
            r0 = r6
            r7 = r0
            r0 = r10
            if (r0 == 0) goto L_0x0072
            r0 = r6
            r7 = r0
            r0 = r9
            if (r0 == 0) goto L_0x0072
            r0 = r10
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: NumberFormatException -> 0x006e
            r11 = r0
            r0 = r9
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: NumberFormatException -> 0x006e
            r12 = r0
            r0 = r11
            r1 = 2
            if (r0 > r1) goto L_0x0069
            r0 = r6
            r7 = r0
            r0 = r11
            r1 = 2
            if (r0 != r1) goto L_0x0072
            r0 = r6
            r7 = r0
            r0 = r12
            if (r0 <= 0) goto L_0x0072
        L_0x0069:
            r0 = 1
            r7 = r0
            goto L_0x0072
        L_0x006e:
            r10 = move-exception
            r0 = r6
            r7 = r0
        L_0x0072:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "VM with version "
            r1.<init>(r2)
            r10 = r0
            r0 = r10
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            if (r0 == 0) goto L_0x008e
            java.lang.String r0 = " has multidex support"
            r5 = r0
            goto L_0x0091
        L_0x008e:
            java.lang.String r0 = " does not have multidex support"
            r5 = r0
        L_0x0091:
            r0 = r10
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "MultiDex"
            r1 = r10
            java.lang.String r1 = r1.toString()
            int r0 = android.util.Log.i(r0, r1)
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.requireFragmentManager.a(java.lang.String):boolean");
    }

    private static File b(Context context, File file, String str) throws IOException {
        File file2;
        File file3 = new File(file, "code_cache");
        try {
            b(file3);
            file2 = file3;
        } catch (IOException e2) {
            file2 = new File(context.getFilesDir(), "code_cache");
            b(file2);
        }
        File file4 = new File(file2, str);
        b(file4);
        return file4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field b(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException e2) {
            }
        }
        StringBuilder sb = new StringBuilder("Field ");
        sb.append(str);
        sb.append(" not found in ");
        sb.append(obj.getClass());
        throw new NoSuchFieldException(sb.toString());
    }

    private static void b(Context context, File file, File file2, String str, String str2, boolean z) throws IOException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException {
        IOException e2;
        Set<File> set = e;
        synchronized (set) {
            if (!set.contains(file)) {
                set.add(file);
                StringBuilder sb = new StringBuilder("MultiDex is not guaranteed to work in SDK version ");
                sb.append(Build.VERSION.SDK_INT);
                sb.append(": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"");
                sb.append(System.getProperty("java.vm.version"));
                sb.append("\"");
                Log.w("MultiDex", sb.toString());
                ClassLoader e3 = e(context);
                if (e3 != null) {
                    c(context);
                    File b2 = b(context, file2, str);
                    restoreChildFragmentState restorechildfragmentstate = new restoreChildFragmentState(file, b2);
                    List<? extends File> c = restorechildfragmentstate.c(context, str2, false);
                    try {
                        if (!c.isEmpty()) {
                            write.d(e3, c, b2);
                        }
                    } catch (IOException e4) {
                        Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e4);
                        List<? extends File> c2 = restorechildfragmentstate.c(context, str2, true);
                        if (!c2.isEmpty()) {
                            write.d(e3, c2, b2);
                        }
                    }
                    try {
                        restorechildfragmentstate.close();
                        e2 = null;
                    } catch (IOException e5) {
                        e2 = e5;
                    }
                    if (e2 != null) {
                        throw e2;
                    }
                }
            }
        }
    }

    private static void b(File file) throws IOException {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                StringBuilder sb = new StringBuilder("Failed to create dir ");
                sb.append(file.getPath());
                sb.append(". Parent file is null.");
                Log.e("MultiDex", sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder("Failed to create dir ");
                sb2.append(file.getPath());
                sb2.append(". parent file is a dir ");
                sb2.append(parentFile.isDirectory());
                sb2.append(", a file ");
                sb2.append(parentFile.isFile());
                sb2.append(", exists ");
                sb2.append(parentFile.exists());
                sb2.append(", readable ");
                sb2.append(parentFile.canRead());
                sb2.append(", writable ");
                sb2.append(parentFile.canWrite());
                Log.e("MultiDex", sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder("Failed to create directory ");
            sb3.append(file.getPath());
            throw new IOException(sb3.toString());
        }
    }

    private static void c(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder sb = new StringBuilder("Clearing old secondary dex dir (");
            sb.append(file.getPath());
            sb.append(").");
            Log.i("MultiDex", sb.toString());
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder sb2 = new StringBuilder("Failed to list secondary dex dir content (");
                sb2.append(file.getPath());
                sb2.append(").");
                Log.w("MultiDex", sb2.toString());
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder sb3 = new StringBuilder("Trying to delete old file ");
                sb3.append(file2.getPath());
                sb3.append(" of size ");
                sb3.append(file2.length());
                Log.i("MultiDex", sb3.toString());
                if (!file2.delete()) {
                    StringBuilder sb4 = new StringBuilder("Failed to delete old file ");
                    sb4.append(file2.getPath());
                    Log.w("MultiDex", sb4.toString());
                } else {
                    StringBuilder sb5 = new StringBuilder("Deleted old file ");
                    sb5.append(file2.getPath());
                    Log.i("MultiDex", sb5.toString());
                }
            }
            if (!file.delete()) {
                StringBuilder sb6 = new StringBuilder("Failed to delete secondary dex dir ");
                sb6.append(file.getPath());
                Log.w("MultiDex", sb6.toString());
                return;
            }
            StringBuilder sb7 = new StringBuilder("Deleted old secondary dex dir ");
            sb7.append(file.getPath());
            Log.i("MultiDex", sb7.toString());
        }
    }

    public static void d(Context context) {
        Log.i("MultiDex", "Installing application");
        if (b) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        try {
            ApplicationInfo a = a(context);
            if (a == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            b(context, new File(a.sourceDir), new File(a.dataDir), "secondary-dexes", "", true);
            Log.i("MultiDex", "install done");
        } catch (Exception e2) {
            Log.e("MultiDex", "MultiDex installation failure", e2);
            StringBuilder sb = new StringBuilder("MultiDex installation failed (");
            sb.append(e2.getMessage());
            sb.append(").");
            throw new RuntimeException(sb.toString());
        }
    }

    private static ClassLoader e(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                return classLoader;
            }
            Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
            return null;
        } catch (RuntimeException e2) {
            Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e2);
            return null;
        }
    }

    static /* synthetic */ void e(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field b2 = b(obj, str);
        Object[] objArr2 = (Object[]) b2.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        b2.set(obj, objArr3);
    }
}
