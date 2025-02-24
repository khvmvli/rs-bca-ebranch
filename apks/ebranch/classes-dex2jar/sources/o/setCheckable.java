package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import o.ComponentActivity$4;
/* loaded from: classes-dex2jar.jar:o/setCheckable.class */
public final class setCheckable {

    /* loaded from: classes-dex2jar.jar:o/setCheckable$read.class */
    public static final class read extends ComponentActivity$4<String, Uri> {
        @Override // o.ComponentActivity$4
        public final /* bridge */ /* synthetic */ ComponentActivity$4.read<Uri> c(Context context, String str) {
            return null;
        }

        @Override // o.ComponentActivity$4
        public final /* synthetic */ Intent d(Context context, String str) {
            return new Intent("android.intent.action.CREATE_DOCUMENT").setType("*/*").putExtra("android.intent.extra.TITLE", str);
        }

        @Override // o.ComponentActivity$4
        public final /* synthetic */ Uri e(int i, Intent intent) {
            if (intent == null || i != -1) {
                return null;
            }
            return intent.getData();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setCheckable$write.class */
    public static final class write extends ComponentActivity$4<Intent, ComponentActivity$3> {
        @Override // o.ComponentActivity$4
        public final /* bridge */ /* synthetic */ Intent d(Context context, Intent intent) {
            return intent;
        }

        @Override // o.ComponentActivity$4
        public final /* synthetic */ ComponentActivity$3 e(int i, Intent intent) {
            return new ComponentActivity$3(i, intent);
        }
    }
}
