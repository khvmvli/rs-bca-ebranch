package o;

import java.lang.reflect.Method;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/SumberDanaPilihIdentitasSetunFragment_ViewBinding.class */
public final class SumberDanaPilihIdentitasSetunFragment_ViewBinding {
    static read e;
    public static final SumberDanaPilihIdentitasSetunFragment_ViewBinding c = new SumberDanaPilihIdentitasSetunFragment_ViewBinding();
    static final read b = new read(null, null, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/SumberDanaPilihIdentitasSetunFragment_ViewBinding$read.class */
    public static final class read {
        public final Method a;
        public final Method b;
        public final Method c;

        public read(Method method, Method method2, Method method3) {
            this.b = method;
            this.c = method2;
            this.a = method3;
        }
    }

    private SumberDanaPilihIdentitasSetunFragment_ViewBinding() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static read a(ReviewSetoranUbahFragment_ViewBinding reviewSetoranUbahFragment_ViewBinding) {
        try {
            read read2 = new read(Class.class.getDeclaredMethod("getModule", new Class[0]), reviewSetoranUbahFragment_ViewBinding.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), reviewSetoranUbahFragment_ViewBinding.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            e = read2;
            return read2;
        } catch (Exception e2) {
            read read3 = b;
            e = read3;
            return read3;
        }
    }
}
