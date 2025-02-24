package com.mobsandgeeks.saripaar;

import com.mobsandgeeks.saripaar.annotation.Order;
import java.lang.reflect.Field;
import java.util.Comparator;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/SaripaarFieldsComparator.class */
final class SaripaarFieldsComparator implements Comparator<Field> {
    private boolean mOrderedFields = true;

    SaripaarFieldsComparator() {
    }

    final boolean areOrderedFields() {
        return this.mOrderedFields;
    }

    public final int compare(Field field, Field field2) {
        Order annotation = field.getAnnotation(Order.class);
        Order annotation2 = field2.getAnnotation(Order.class);
        int i = 0;
        if (annotation == null || annotation2 == null) {
            this.mOrderedFields = false;
        } else {
            int value = annotation.value();
            int value2 = annotation2.value();
            if (value != value2) {
                i = value > value2 ? 1 : -1;
            }
        }
        return i;
    }
}
