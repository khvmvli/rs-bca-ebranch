package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.Isbn;
import o.pilihNorekPengirim;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/IsbnRule.class */
public class IsbnRule extends AnnotationRule<Isbn, String> {
    protected IsbnRule(Isbn isbn) {
        super(isbn);
    }

    public boolean isValid(String str) {
        pilihNorekPengirim e = pilihNorekPengirim.e();
        boolean z = true;
        if (!(e.e.d(str) != null)) {
            z = true;
            if (!(e.a.d(str) != null)) {
                z = false;
            }
        }
        return z;
    }
}
