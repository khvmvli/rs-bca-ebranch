package o;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.LiveData;
import io.realm.internal.Property;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o.requireArguments;
import o.requireContext;
/* loaded from: classes-dex2jar.jar:o/requireHost.class */
public final class requireHost extends requireArguments {
    static boolean a;
    private final performContextItemSelected d;
    private final requireHost$MediaBrowserCompat$CustomActionResultReceiver e;

    /* loaded from: classes-dex2jar.jar:o/requireHost$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer<D> extends performDestroyView<D> implements requireContext.RemoteActionCompatParcelizer<D> {
        write<D> f;
        final requireContext<D> g;
        final Bundle i;
        final int j;
        private performContextItemSelected l;

        /* renamed from: o */
        private requireContext<D> f191o;

        @Override // o.performDestroyView, androidx.lifecycle.LiveData
        public final void a(D d) {
            a(d);
            requireContext<D> requirecontext = this.f191o;
            if (requirecontext != null) {
                requirecontext.j = true;
                requirecontext.g = false;
                requirecontext.c = false;
                requirecontext.b = false;
                requirecontext.d = false;
                this.f191o = null;
            }
        }

        final void b() {
            performContextItemSelected performcontextitemselected = this.l;
            write<D> write = this.f;
            if (performcontextitemselected != null && write != null) {
                d((performLowMemory) write);
                a(performcontextitemselected, write);
            }
        }

        @Override // androidx.lifecycle.LiveData
        public final void c() {
            if (requireHost.a) {
                StringBuilder sb = new StringBuilder("  Stopping: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.g.g = false;
        }

        public final requireContext<D> d(boolean z) {
            if (requireHost.a) {
                StringBuilder sb = new StringBuilder("  Destroying: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.g.c = true;
            write<D> write = this.f;
            if (write != null) {
                d((performLowMemory) write);
                if (write.b && requireHost.a) {
                    StringBuilder sb2 = new StringBuilder("  Resetting: ");
                    sb2.append(write.e);
                    Log.v("LoaderManager", sb2.toString());
                }
            }
            requireContext<D> requirecontext = this.g;
            requireContext.RemoteActionCompatParcelizer<D> remoteActionCompatParcelizer = requirecontext.e;
            if (remoteActionCompatParcelizer == null) {
                throw new IllegalStateException("No listener register");
            } else if (remoteActionCompatParcelizer == this) {
                requirecontext.e = null;
                if (write != null) {
                    boolean z2 = write.b;
                }
                requireContext<D> requirecontext2 = this.g;
                requirecontext2.j = true;
                requirecontext2.g = false;
                requirecontext2.c = false;
                requirecontext2.b = false;
                requirecontext2.d = false;
                return this.f191o;
            } else {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public final void d(performLowMemory<? super D> performlowmemory) {
            d((performLowMemory) performlowmemory);
            this.l = null;
            this.f = null;
        }

        @Override // androidx.lifecycle.LiveData
        public final void e() {
            if (requireHost.a) {
                StringBuilder sb = new StringBuilder("  Starting: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            requireContext<D> requirecontext = this.g;
            requirecontext.g = true;
            requirecontext.j = false;
            requirecontext.c = false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.j);
            sb.append(" : ");
            onAttach.d(this.g, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/requireHost$write.class */
    public static final class write<D> implements performLowMemory<D> {
        boolean b;
        private final requireArguments.RemoteActionCompatParcelizer<D> c;
        final requireContext<D> e;

        @Override // o.performLowMemory
        public final void e(D d) {
            if (requireHost.a) {
                StringBuilder sb = new StringBuilder("  onLoadFinished in ");
                sb.append(this.e);
                sb.append(": ");
                StringBuilder sb2 = new StringBuilder(64);
                onAttach.d(d, sb2);
                sb2.append("}");
                sb.append(sb2.toString());
                Log.v("LoaderManager", sb.toString());
            }
            this.b = true;
        }

        public final String toString() {
            return this.c.toString();
        }
    }

    public requireHost(performContextItemSelected performcontextitemselected, performPrimaryNavigationFragmentChanged performprimarynavigationfragmentchanged) {
        this.d = performcontextitemselected;
        this.e = requireHost$MediaBrowserCompat$CustomActionResultReceiver.c(performprimarynavigationfragmentchanged);
    }

    @Override // o.requireArguments
    public final void a() {
        requireHost$MediaBrowserCompat$CustomActionResultReceiver requirehost_mediabrowsercompat_customactionresultreceiver = this.e;
        int b = requirehost_mediabrowsercompat_customactionresultreceiver.e.b();
        for (int i = 0; i < b; i++) {
            requirehost_mediabrowsercompat_customactionresultreceiver.e.e(i).b();
        }
    }

    @Override // o.requireArguments
    @Deprecated
    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        requireHost$MediaBrowserCompat$CustomActionResultReceiver requirehost_mediabrowsercompat_customactionresultreceiver = this.e;
        if (requirehost_mediabrowsercompat_customactionresultreceiver.e.b() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            String obj = sb.toString();
            for (int i = 0; i < requirehost_mediabrowsercompat_customactionresultreceiver.e.b(); i++) {
                IconCompatParcelizer e = requirehost_mediabrowsercompat_customactionresultreceiver.e.e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(requirehost_mediabrowsercompat_customactionresultreceiver.e.c(i));
                printWriter.print(": ");
                printWriter.println(e.toString());
                printWriter.print(obj);
                printWriter.print("mId=");
                printWriter.print(e.j);
                printWriter.print(" mArgs=");
                printWriter.println(e.i);
                printWriter.print(obj);
                printWriter.print("mLoader=");
                printWriter.println(e.g);
                requireContext<D> requirecontext = e.g;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append("  ");
                String obj2 = sb2.toString();
                printWriter.print(obj2);
                printWriter.print("mId=");
                printWriter.print(requirecontext.a);
                printWriter.print(" mListener=");
                printWriter.println(requirecontext.e);
                if (requirecontext.g || requirecontext.b || requirecontext.d) {
                    printWriter.print(obj2);
                    printWriter.print("mStarted=");
                    printWriter.print(requirecontext.g);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(requirecontext.b);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(requirecontext.d);
                }
                if (requirecontext.c || requirecontext.j) {
                    printWriter.print(obj2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(requirecontext.c);
                    printWriter.print(" mReset=");
                    printWriter.println(requirecontext.j);
                }
                if (e.f != null) {
                    printWriter.print(obj);
                    printWriter.print("mCallbacks=");
                    printWriter.println(e.f);
                    write<D> write2 = e.f;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(obj);
                    sb3.append("  ");
                    printWriter.print(sb3.toString());
                    printWriter.print("mDeliveredData=");
                    printWriter.println(write2.b);
                }
                printWriter.print(obj);
                printWriter.print("mData=");
                Object obj3 = e.g;
                Object obj4 = e.c;
                if (obj4 == LiveData.e) {
                    obj4 = null;
                }
                StringBuilder sb4 = new StringBuilder(64);
                onAttach.d(obj4, sb4);
                sb4.append("}");
                printWriter.println(sb4.toString());
                printWriter.print(obj);
                printWriter.print("mStarted=");
                printWriter.println(e.a > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) Property.TYPE_ARRAY);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        onAttach.d(this.d, sb);
        sb.append("}}");
        return sb.toString();
    }
}
