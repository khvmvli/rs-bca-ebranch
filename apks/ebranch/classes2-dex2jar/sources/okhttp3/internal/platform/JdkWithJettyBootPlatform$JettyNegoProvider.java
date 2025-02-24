package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import okhttp3.internal.Util;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/platform/JdkWithJettyBootPlatform$JettyNegoProvider.class */
class JdkWithJettyBootPlatform$JettyNegoProvider implements InvocationHandler {
    private final List<String> protocols;
    String selected;
    boolean unsupported;

    JdkWithJettyBootPlatform$JettyNegoProvider(List<String> list) {
        this.protocols = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        Object[] objArr2 = objArr;
        if (objArr == null) {
            objArr2 = Util.EMPTY_STRING_ARRAY;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.unsupported = true;
            return null;
        } else if (name.equals("protocols") && objArr2.length == 0) {
            return this.protocols;
        } else {
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr2.length == 1) {
                Object obj2 = objArr2[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.protocols.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.selected = str;
                            return str;
                        }
                    }
                    String str2 = this.protocols.get(0);
                    this.selected = str2;
                    return str2;
                }
            }
            if (!((name.equals("protocolSelected") || name.equals("selected")) && objArr2.length == 1)) {
                return method.invoke(this, objArr2);
            }
            this.selected = (String) objArr2[0];
            return null;
        }
    }
}
