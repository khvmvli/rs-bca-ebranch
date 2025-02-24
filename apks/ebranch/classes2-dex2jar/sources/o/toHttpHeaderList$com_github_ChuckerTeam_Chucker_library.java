package o;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2-dex2jar.jar:o/toHttpHeaderList$com_github_ChuckerTeam_Chucker_library.class */
public class toHttpHeaderList$com_github_ChuckerTeam_Chucker_library extends newInitializerBuilder {
    public newInitializerBuilder d;

    public toHttpHeaderList$com_github_ChuckerTeam_Chucker_library(newInitializerBuilder newinitializerbuilder) {
        if (newinitializerbuilder != null) {
            this.d = newinitializerbuilder;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public newInitializerBuilder clearDeadline() {
        return this.d.clearDeadline();
    }

    public newInitializerBuilder clearTimeout() {
        return this.d.clearTimeout();
    }

    public long deadlineNanoTime() {
        return this.d.deadlineNanoTime();
    }

    public newInitializerBuilder deadlineNanoTime(long j) {
        return this.d.deadlineNanoTime(j);
    }

    public boolean hasDeadline() {
        return this.d.hasDeadline();
    }

    public void throwIfReached() throws IOException {
        this.d.throwIfReached();
    }

    public newInitializerBuilder timeout(long j, TimeUnit timeUnit) {
        return this.d.timeout(j, timeUnit);
    }

    public long timeoutNanos() {
        return this.d.timeoutNanos();
    }
}
