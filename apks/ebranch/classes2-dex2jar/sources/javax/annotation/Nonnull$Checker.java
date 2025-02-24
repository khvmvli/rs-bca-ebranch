package javax.annotation;

import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;
/* loaded from: classes2-dex2jar.jar:javax/annotation/Nonnull$Checker.class */
public class Nonnull$Checker implements TypeQualifierValidator<Nonnull> {
    public When forConstantValue(Nonnull nonnull, Object obj) {
        return obj == null ? When.NEVER : When.ALWAYS;
    }
}
