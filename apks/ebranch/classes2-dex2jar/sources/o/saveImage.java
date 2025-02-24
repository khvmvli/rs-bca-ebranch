package o;

import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* loaded from: classes2-dex2jar.jar:o/saveImage.class */
public final class saveImage {

    /* loaded from: classes2-dex2jar.jar:o/saveImage$read.class */
    static final class read {
        final boolean a;
        private final Class<?> d;

        private read(Class<?> cls, boolean z) {
            this.d = cls;
            this.a = z;
        }

        /* synthetic */ read(Class cls, boolean z, byte b) {
            this(cls, z);
        }

        public final boolean equals(Object obj) {
            boolean z = false;
            if (obj instanceof read) {
                read read = (read) obj;
                z = false;
                if (read.d.equals(this.d)) {
                    z = false;
                    if (read.a == this.a) {
                        z = true;
                    }
                }
            }
            return z;
        }

        public final int hashCode() {
            return ((this.d.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.a).hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/saveImage$write.class */
    public static final class write {
        final Component<?> e;
        final Set<write> d = new HashSet();
        final Set<write> c = new HashSet();

        write(Component<?> component) {
            this.e = component;
        }
    }

    saveImage() {
    }

    public static void b(List<Component<?>> list) {
        Set<write> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<Component<?>> it = list.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                Component<?> next = it.next();
                write write2 = new write(next);
                for (Class<? super Object> cls : next.getProvidedInterfaces()) {
                    read read2 = new read(cls, !next.isValue(), (byte) 0);
                    if (!hashMap.containsKey(read2)) {
                        hashMap.put(read2, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(read2);
                    if (set2.isEmpty() || read2.a) {
                        set2.add(write2);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                    }
                }
            } else {
                for (Set<write> set3 : hashMap.values()) {
                    for (write write3 : set3) {
                        for (Dependency dependency : write3.e.getDependencies()) {
                            if (dependency.isDirectInjection() && (set = (Set) hashMap.get(new read(dependency.getInterface(), dependency.isSet(), (byte) 0))) != null) {
                                for (write write4 : set) {
                                    write3.d.add(write4);
                                    write4.c.add(write3);
                                }
                            }
                        }
                    }
                }
                HashSet<write> hashSet = new HashSet();
                for (Set set4 : hashMap.values()) {
                    hashSet.addAll(set4);
                }
                Set<write> c = c(hashSet);
                while (!c.isEmpty()) {
                    write next2 = c.iterator().next();
                    c.remove(next2);
                    i++;
                    for (write write5 : next2.d) {
                        write5.c.remove(next2);
                        if (write5.c.isEmpty()) {
                            c.add(write5);
                        }
                    }
                }
                if (i != list.size()) {
                    ArrayList arrayList = new ArrayList();
                    for (write write6 : hashSet) {
                        if (!write6.c.isEmpty() && !write6.d.isEmpty()) {
                            arrayList.add(write6.e);
                        }
                    }
                    throw new DependencyCycleException(arrayList);
                }
                return;
            }
        }
    }

    private static Set<write> c(Set<write> set) {
        HashSet hashSet = new HashSet();
        for (write write2 : set) {
            if (write2.c.isEmpty()) {
                hashSet.add(write2);
            }
        }
        return hashSet;
    }
}
