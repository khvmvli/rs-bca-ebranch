package okhttp3;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:okhttp3/MediaType.class */
public final class MediaType {
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    @Nullable
    private final String charset;
    private final String mediaType;
    private final String subtype;
    private final String type;
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    private MediaType(String str, String str2, String str3, @Nullable String str4) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.charset = str4;
    }

    public static MediaType get(String str) {
        Matcher matcher = TYPE_SUBTYPE.matcher(str);
        if (matcher.lookingAt()) {
            String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            Matcher matcher2 = PARAMETER.matcher(str);
            String str2 = null;
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group = matcher2.group(1);
                    str2 = str2;
                    if (group != null) {
                        if (!group.equalsIgnoreCase("charset")) {
                            str2 = str2;
                        } else {
                            String group2 = matcher2.group(2);
                            if (group2 != null) {
                                str2 = group2;
                                if (group2.startsWith("'")) {
                                    str2 = group2;
                                    if (group2.endsWith("'")) {
                                        str2 = group2;
                                        if (group2.length() > 2) {
                                            str2 = group2.substring(1, group2.length() - 1);
                                        }
                                    }
                                }
                            } else {
                                str2 = matcher2.group(3);
                            }
                            if (str2 != null && !str2.equalsIgnoreCase(str2)) {
                                StringBuilder sb = new StringBuilder("Multiple charsets defined: \"");
                                sb.append(str2);
                                sb.append("\" and: \"");
                                sb.append(str2);
                                sb.append("\" for: \"");
                                sb.append(str);
                                sb.append('\"');
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                    sb2.append(str.substring(end));
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            return new MediaType(str, lowerCase, lowerCase2, str2);
        }
        StringBuilder sb3 = new StringBuilder("No subtype found for: \"");
        sb3.append(str);
        sb3.append('\"');
        throw new IllegalArgumentException(sb3.toString());
    }

    @Nullable
    public static MediaType parse(String str) {
        try {
            return get(str);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    @Nullable
    public final Charset charset() {
        return charset(null);
    }

    @Nullable
    public final Charset charset(@Nullable Charset charset) {
        Charset charset2;
        try {
            String str = this.charset;
            charset2 = charset;
            if (str != null) {
                charset2 = Charset.forName(str);
            }
        } catch (IllegalArgumentException e) {
            charset2 = charset;
        }
        return charset2;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof MediaType) && ((MediaType) obj).mediaType.equals(this.mediaType);
    }

    public final int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String subtype() {
        return this.subtype;
    }

    public final String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }
}
