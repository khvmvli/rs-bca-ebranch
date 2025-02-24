package o;

import com.google.gson.stream.JsonReader;
import java.io.IOException;
/* loaded from: classes2-dex2jar.jar:o/BaseFragmentKotlin.class */
public abstract class BaseFragmentKotlin {
    public static BaseFragmentKotlin INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader) throws IOException;
}
