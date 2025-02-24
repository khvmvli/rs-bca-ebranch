package o;

import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes-dex2jar.jar:o/getSumberDanaTransaksiCode.class */
public final class getSumberDanaTransaksiCode {
    private static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean d(String str) {
        return str == null || str.trim().isEmpty();
    }
}
