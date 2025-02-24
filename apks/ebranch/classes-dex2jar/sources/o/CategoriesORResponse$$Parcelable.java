package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/CategoriesORResponse$$Parcelable.class */
public final class CategoriesORResponse$$Parcelable {
    public final Map<Class<?>, Object> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CategoriesORResponse$$Parcelable$read.class */
    public static final class read {
        final Map<Class<?>, Object> d = new HashMap();
    }

    public CategoriesORResponse$$Parcelable(read read2) {
        this.d = Collections.unmodifiableMap(new HashMap(read2.d));
    }
}
