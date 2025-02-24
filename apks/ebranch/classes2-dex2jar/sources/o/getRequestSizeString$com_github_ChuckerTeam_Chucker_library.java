package o;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlinx.coroutines.internal.MainDispatcherFactory;
/* loaded from: classes2-dex2jar.jar:o/getRequestSizeString$com_github_ChuckerTeam_Chucker_library.class */
public final class getRequestSizeString$com_github_ChuckerTeam_Chucker_library {
    public static final getRequestSizeString$com_github_ChuckerTeam_Chucker_library a = new getRequestSizeString$com_github_ChuckerTeam_Chucker_library();

    private getRequestSizeString$com_github_ChuckerTeam_Chucker_library() {
    }

    private static List<String> c(URL url) {
        String obj = url.toString();
        if (CheckOTPSessionPresenter.a(obj, "jar", false)) {
            String c = CheckOTPSessionPresenter.c(obj, "jar:file:", (String) null, 2);
            subscribeReservationRescheduleEvent.e(c, "");
            subscribeReservationRescheduleEvent.e(c, "");
            int d = CheckOTPSessionPresenter.d(c, '!', 0, false);
            String str = c;
            if (d != -1) {
                str = c.substring(0, d);
                subscribeReservationRescheduleEvent.d(str, "");
            }
            String c2 = CheckOTPSessionPresenter.c(obj, "!/", (String) null, 2);
            JarFile jarFile = new JarFile(str, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(c2)), "UTF-8"));
                List<String> e = e(bufferedReader);
                T1TransaksiTarikanFragment_ViewBinding.a(bufferedReader, null);
                try {
                    jarFile.close();
                    return e;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        jarFile.close();
                        throw th3;
                    } catch (Throwable th4) {
                        subscribeReservationRescheduleEvent.e(th2, "");
                        subscribeReservationRescheduleEvent.e(th4, "");
                        if (th2 != th4) {
                            clickOrangLain.c.a(th2, th4);
                        }
                        throw th2;
                    }
                }
            }
        } else {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> e2 = e(bufferedReader2);
                T1TransaksiTarikanFragment_ViewBinding.a(bufferedReader2, null);
                return e2;
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    T1TransaksiTarikanFragment_ViewBinding.a(bufferedReader2, th5);
                    throw th6;
                }
            }
        }
    }

    private static List<String> e(BufferedReader bufferedReader) {
        boolean z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return onClickUbahDataAlamatIdentitas.b(linkedHashSet);
            }
            subscribeReservationRescheduleEvent.e(readLine, "");
            subscribeReservationRescheduleEvent.e("#", "");
            subscribeReservationRescheduleEvent.e(readLine, "");
            boolean z2 = false;
            int a2 = CheckOTPSessionPresenter.a(readLine, "#", 0, false, 6);
            String str = readLine;
            if (a2 != -1) {
                str = readLine.substring(0, a2);
                subscribeReservationRescheduleEvent.d(str, "");
            }
            if (str != null) {
                String obj = CheckOTPSessionPresenter.c(str).toString();
                String str2 = obj;
                int i = 0;
                while (true) {
                    if (i >= str2.length()) {
                        z = true;
                        break;
                    }
                    char charAt = str2.charAt(i);
                    if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                        z = false;
                        break;
                    }
                    i++;
                }
                if (z) {
                    if (str2.length() > 0) {
                        z2 = true;
                    }
                    if (z2) {
                        linkedHashSet.add(obj);
                    }
                } else {
                    throw new IllegalArgumentException(subscribeReservationRescheduleEvent.b("Illegal service provider class name: ", obj).toString());
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    private final <S> List<S> e(Class<S> cls, ClassLoader classLoader) {
        ArrayList arrayList;
        Set set;
        try {
            ArrayList list = Collections.list(classLoader.getResources(subscribeReservationRescheduleEvent.b("META-INF/services/", cls.getName())));
            subscribeReservationRescheduleEvent.d(list, "");
            ArrayList<URL> arrayList2 = list;
            ArrayList arrayList3 = new ArrayList();
            for (URL url : arrayList2) {
                onClickUbahDataAlamatIdentitas.c(arrayList3, c(url));
            }
            ArrayList arrayList4 = arrayList3;
            subscribeReservationRescheduleEvent.e(arrayList4, "");
            if (arrayList4 instanceof Collection) {
                ArrayList arrayList5 = arrayList4;
                int size = arrayList5.size();
                if (size == 0) {
                    set = (Set) updateDataDiri.e;
                } else if (size != 1) {
                    set = (Set) onClickUbahDataAlamatIdentitas.d(arrayList4, new LinkedHashSet(onChooseMataUangEvent.b(arrayList5.size())));
                } else {
                    set = Collections.singleton(arrayList4 instanceof List ? arrayList4.get(0) : arrayList4.iterator().next());
                    subscribeReservationRescheduleEvent.d(set, "");
                }
            } else {
                Set set2 = (Set) onClickUbahDataAlamatIdentitas.d(arrayList4, new LinkedHashSet());
                subscribeReservationRescheduleEvent.e(set2, "");
                int size2 = set2.size();
                if (size2 != 0) {
                    set = set2;
                    if (size2 == 1) {
                        set = Collections.singleton(set2.iterator().next());
                        subscribeReservationRescheduleEvent.d(set, "");
                    }
                } else {
                    set = (Set) updateDataDiri.e;
                }
            }
        } catch (Throwable th) {
            arrayList = onClickUbahDataAlamatIdentitas.b(ServiceLoader.load(cls, classLoader));
        }
        if (!set.isEmpty()) {
            Set<String> set3 = set;
            int i = 10;
            subscribeReservationRescheduleEvent.e(set3, "");
            if (set3 instanceof Collection) {
                i = set3.size();
            }
            ArrayList arrayList6 = new ArrayList(i);
            for (String str : set3) {
                Class<?> cls2 = Class.forName(str, false, classLoader);
                if (cls.isAssignableFrom(cls2)) {
                    arrayList6.add(cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
                } else {
                    StringBuilder sb = new StringBuilder("Expected service of class ");
                    sb.append(cls);
                    sb.append(", but found ");
                    sb.append(cls2);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
            arrayList = arrayList6;
            return arrayList;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }

    public final List<MainDispatcherFactory> c() {
        ArrayList arrayList;
        MainDispatcherFactory mainDispatcherFactory;
        if (!getResponseCipherSuite.e()) {
            return e(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList2 = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException e) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList2.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException e2) {
            }
            if (mainDispatcherFactory2 != null) {
                arrayList2.add(mainDispatcherFactory2);
            }
            arrayList = arrayList2;
        } catch (Throwable th) {
            arrayList = e(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        return arrayList;
    }
}
