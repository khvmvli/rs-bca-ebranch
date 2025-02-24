package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.greenrobot.eventbus.ThreadMode;
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes-dex2jar.jar:o/Stetho$Initializer$RealSocketHandlerFactory.class */
public @interface Stetho$Initializer$RealSocketHandlerFactory {
    int b() default 0;

    boolean c() default false;

    ThreadMode e() default ThreadMode.POSTING;
}
