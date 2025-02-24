package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import o.newImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes2-dex2jar.jar:o/ListUtil.class */
public final class ListUtil {

    /* loaded from: classes2-dex2jar.jar:o/ListUtil$FiveItemImmutableList.class */
    public final class FiveItemImmutableList {
        public static final Object c = new Object();
        public final List<Object> a;

        public FiveItemImmutableList() {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            arrayList.add(null);
            this.a.size();
        }

        public final int c(Object obj) {
            for (int i = 0; i < this.a.size(); i++) {
                if (this.a.get(i) == obj) {
                    return i;
                }
            }
            return -1;
        }

        public final void d(int i, Object obj) {
            if (this.a.size() > i) {
                this.a.remove(i);
            }
            this.a.add(i, obj);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/ListUtil$FourItemImmutableList.class */
    public interface FourItemImmutableList<T> {
        Map<Class, T> c();
    }

    /* loaded from: classes2-dex2jar.jar:o/ListUtil$ImmutableArrayList.class */
    public final class ImmutableArrayList implements identityEquals<boolean[]> {
        @Override // o.ListUtil.ThreeItemImmutableList
        public final /* synthetic */ Object d(Parcel parcel) {
            boolean[] zArr;
            int readInt = parcel.readInt();
            if (readInt == -1) {
                zArr = null;
            } else {
                boolean[] zArr2 = new boolean[readInt];
                parcel.readBooleanArray(zArr2);
                zArr = zArr2;
            }
            return zArr;
        }

        @Override // o.ListUtil.ThreeItemImmutableList
        public final /* synthetic */ void d(Object obj, Parcel parcel) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr == null) {
                parcel.writeInt(-1);
                return;
            }
            parcel.writeInt(zArr.length);
            parcel.writeBooleanArray(zArr);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/ListUtil$ImmutableList.class */
    public abstract class ImmutableList<T> extends d<T, ArrayList<T>> {
        @Override // o.d
        public final /* synthetic */ Collection e() {
            return new ArrayList();
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/ListUtil$OneItemImmutableList.class */
    public final class OneItemImmutableList {
        private static final write c;

        /* loaded from: classes2-dex2jar.jar:o/ListUtil$OneItemImmutableList$RemoteActionCompatParcelizer.class */
        public interface RemoteActionCompatParcelizer<T> {
            Parcelable a(T t);
        }

        /* loaded from: classes2-dex2jar.jar:o/ListUtil$OneItemImmutableList$read.class */
        public static final class read<T> implements RemoteActionCompatParcelizer<T> {
            private final Constructor<? extends Parcelable> c;

            /* JADX WARN: Multi-variable type inference failed */
            public read(Class<T> cls, Class<? extends Parcelable> cls2) {
                try {
                    this.c = cls2.getConstructor(cls);
                } catch (NoSuchMethodException e) {
                    throw new ParcelerRuntimeException("Unable to create ParcelFactory Type", e);
                }
            }

            @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
            public final Parcelable a(T t) {
                try {
                    return (Parcelable) this.c.newInstance(t);
                } catch (IllegalAccessException e) {
                    throw new ParcelerRuntimeException("Unable to create ParcelFactory Type", e);
                } catch (InstantiationException e2) {
                    throw new ParcelerRuntimeException("Unable to create ParcelFactory Type", e2);
                } catch (InvocationTargetException e3) {
                    throw new ParcelerRuntimeException("Unable to create ParcelFactory Type", e3);
                }
            }
        }

        /* loaded from: classes2-dex2jar.jar:o/ListUtil$OneItemImmutableList$write.class */
        public static final class write {
            ConcurrentMap<Class, RemoteActionCompatParcelizer> d;

            private write() {
                this.d = new ConcurrentHashMap();
            }

            /* synthetic */ write(byte b) {
                this();
            }

            public static RemoteActionCompatParcelizer d(Class cls, ClassLoader classLoader) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(cls.getName());
                    sb.append("$$Parcelable");
                    return new read(cls, classLoader.loadClass(sb.toString()));
                } catch (ClassNotFoundException e) {
                    return null;
                }
            }
        }

        static {
            write write2 = new write((byte) 0);
            c = write2;
            write2.d.putAll(newImmutableList.a().c());
        }

        public static <T> Parcelable a(Class<? extends T> cls, T t) {
            if (t == null) {
                return null;
            }
            write write2 = c;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = write2.d.get(cls);
            RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
            if (remoteActionCompatParcelizer == null) {
                remoteActionCompatParcelizer2 = write.d(cls, cls.getClassLoader());
                if (Parcelable.class.isAssignableFrom(cls)) {
                    remoteActionCompatParcelizer2 = new newImmutableList.setContentHeight();
                }
                if (remoteActionCompatParcelizer2 != null) {
                    RemoteActionCompatParcelizer putIfAbsent = write2.d.putIfAbsent(cls, remoteActionCompatParcelizer2);
                    if (putIfAbsent != null) {
                        remoteActionCompatParcelizer2 = putIfAbsent;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Unable to find generated Parcelable class for ");
                    sb.append(cls.getName());
                    sb.append(", verify that your class is configured properly and that the Parcelable class ");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cls.getName());
                    sb2.append("$$Parcelable");
                    sb.append(sb2.toString());
                    sb.append(" is generated by Parceler.");
                    throw new ParcelerRuntimeException(sb.toString());
                }
            }
            return remoteActionCompatParcelizer2.a(t);
        }

        public static <T> T a(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            return (T) ((copyToImmutableList) parcelable).getParcel();
        }

        public static <T> Parcelable e(T t) {
            if (t == null) {
                return null;
            }
            return a(t.getClass(), t);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/ListUtil$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer<T> extends ListUtil$MediaBrowserCompat$CustomActionResultReceiver<T, Field> {
        private final Object e;

        private RemoteActionCompatParcelizer(Field field, Object obj) {
            super(field);
            this.e = obj;
        }

        /* synthetic */ RemoteActionCompatParcelizer(Field field, Object obj, byte b) {
            this(field, obj);
        }

        @Override // o.ListUtil$MediaBrowserCompat$CustomActionResultReceiver
        public final /* synthetic */ Object a(Field field) throws Exception {
            return field.get(this.e);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/ListUtil$ThreeItemImmutableList.class */
    public interface ThreeItemImmutableList<L, U extends L> {
        U d(Parcel parcel);

        void d(L l, Parcel parcel);
    }

    /* loaded from: classes2-dex2jar.jar:o/ListUtil$TwoItemImmutableList.class */
    public abstract class TwoItemImmutableList<K, V> extends v<K, V, LinkedHashMap<K, V>> {
        @Override // o.v
        public final /* synthetic */ Map a() {
            return new LinkedHashMap();
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/ListUtil$read.class */
    static final class read extends ListUtil$MediaBrowserCompat$CustomActionResultReceiver<Void, Field> {
        private final Object a;
        private final Object b;

        private read(Field field, Object obj, Object obj2) {
            super(field);
            this.b = obj;
            this.a = obj2;
        }

        /* synthetic */ read(Field field, Object obj, Object obj2, byte b) {
            this(field, obj, obj2);
        }

        @Override // o.ListUtil$MediaBrowserCompat$CustomActionResultReceiver
        public final /* synthetic */ Void a(Field field) throws Exception {
            field.set(this.b, this.a);
            return null;
        }
    }

    public static <T> T c(Class<?> cls, Object obj, String str) {
        try {
            return (T) AccessController.doPrivileged(new RemoteActionCompatParcelizer(cls.getDeclaredField(str), obj, (byte) 0));
        } catch (NoSuchFieldException e) {
            StringBuilder sb = new StringBuilder("NoSuchFieldException Exception during field injection: ");
            sb.append(str);
            sb.append(" in ");
            sb.append(obj.getClass());
            throw new ParcelerRuntimeException(sb.toString(), e);
        } catch (PrivilegedActionException e2) {
            throw new ParcelerRuntimeException("PrivilegedActionException Exception during field injection", e2);
        } catch (Exception e3) {
            throw new ParcelerRuntimeException("Exception during field injection", e3);
        }
    }

    public static void e(Class<?> cls, Object obj, String str, Object obj2) {
        try {
            AccessController.doPrivileged(new read(cls.getDeclaredField(str), obj, obj2, (byte) 0));
        } catch (NoSuchFieldException e) {
            StringBuilder sb = new StringBuilder("NoSuchFieldException Exception during field injection: ");
            sb.append(str);
            sb.append(" in ");
            sb.append(obj.getClass());
            throw new ParcelerRuntimeException(sb.toString(), e);
        } catch (PrivilegedActionException e2) {
            throw new ParcelerRuntimeException("PrivilegedActionException Exception during field injection", e2);
        } catch (Exception e3) {
            throw new ParcelerRuntimeException("Exception during field injection", e3);
        }
    }
}
