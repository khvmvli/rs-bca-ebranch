package o;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes-dex2jar.jar:o/performStop.class */
public final class performStop {
    private final read d;
    private final performPrimaryNavigationFragmentChanged e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/performStop$IconCompatParcelizer.class */
    public static abstract class IconCompatParcelizer extends performStop$MediaBrowserCompat$CustomActionResultReceiver implements read {
        @Override // o.performStop.read
        public <T extends performPictureInPictureModeChanged> T e(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends performPictureInPictureModeChanged> T e(String str, Class<T> cls);
    }

    /* loaded from: classes-dex2jar.jar:o/performStop$RemoteActionCompatParcelizer.class */
    public static class RemoteActionCompatParcelizer implements read {
        static RemoteActionCompatParcelizer c;

        @Override // o.performStop.read
        public <T extends performPictureInPictureModeChanged> T e(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder("Cannot create an instance of ");
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (InstantiationException e2) {
                StringBuilder sb2 = new StringBuilder("Cannot create an instance of ");
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/performStop$read.class */
    public interface read {
        <T extends performPictureInPictureModeChanged> T e(Class<T> cls);
    }

    /* loaded from: classes-dex2jar.jar:o/performStop$write.class */
    public static final class write extends RemoteActionCompatParcelizer {
        static write a;
        private Application e;

        public write(Application application) {
            this.e = application;
        }

        @Override // o.performStop.RemoteActionCompatParcelizer, o.performStop.read
        public final <T extends performPictureInPictureModeChanged> T e(Class<T> cls) {
            if (!onInflate.class.isAssignableFrom(cls)) {
                return (T) e(cls);
            }
            try {
                return cls.getConstructor(Application.class).newInstance(this.e);
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder("Cannot create an instance of ");
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (InstantiationException e2) {
                StringBuilder sb2 = new StringBuilder("Cannot create an instance of ");
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            } catch (NoSuchMethodException e3) {
                StringBuilder sb3 = new StringBuilder("Cannot create an instance of ");
                sb3.append(cls);
                throw new RuntimeException(sb3.toString(), e3);
            } catch (InvocationTargetException e4) {
                StringBuilder sb4 = new StringBuilder("Cannot create an instance of ");
                sb4.append(cls);
                throw new RuntimeException(sb4.toString(), e4);
            }
        }
    }

    public performStop(performPrimaryNavigationFragmentChanged performprimarynavigationfragmentchanged, read read2) {
        this.d = read2;
        this.e = performprimarynavigationfragmentchanged;
    }

    private <T extends performPictureInPictureModeChanged> T e(String str, Class<T> cls) {
        T t = (T) this.e.b.get(str);
        if (cls.isInstance(t)) {
            read read2 = this.d;
            if (read2 instanceof performStop$MediaBrowserCompat$CustomActionResultReceiver) {
                ((performStop$MediaBrowserCompat$CustomActionResultReceiver) read2).c(t);
            }
            return t;
        }
        read read3 = this.d;
        T t2 = read3 instanceof IconCompatParcelizer ? (T) ((IconCompatParcelizer) read3).e(str, cls) : (T) read3.e(cls);
        this.e.b(str, t2);
        return t2;
    }

    public final <T extends performPictureInPictureModeChanged> T c(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sb = new StringBuilder("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return (T) e(sb.toString(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
