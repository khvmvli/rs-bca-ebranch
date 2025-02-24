package o;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
/* loaded from: classes-dex2jar.jar:o/consumeDisplayCutout.class */
public final class consumeDisplayCutout {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/consumeDisplayCutout$RemoteActionCompatParcelizer.class */
    public static class RemoteActionCompatParcelizer {
        static void d(Intent intent, ArrayList<Uri> arrayList) {
            CharSequence charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.TEXT");
            String stringExtra = intent.getStringExtra("android.intent.extra.HTML_TEXT");
            ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(charSequenceExtra, stringExtra, null, arrayList.get(0)));
            int size = arrayList.size();
            for (int i = 1; i < size; i++) {
                clipData.addItem(new ClipData.Item(arrayList.get(i)));
            }
            intent.setClipData(clipData);
            intent.addFlags(1);
        }

        static void e(Intent intent) {
            intent.setClipData(null);
            intent.setFlags(intent.getFlags() & -2);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/consumeDisplayCutout$read.class */
    public static class read {
        private final Context a;
        private ArrayList<String> b;
        private CharSequence c;
        private ArrayList<String> d;
        private final Intent e;
        private ArrayList<String> h;
        private ArrayList<Uri> j;

        public read(Context context) {
            Activity activity;
            this.a = context;
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.e = action;
            action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.e.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
                this.e.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
            }
        }

        private void d(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.e.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.e.putExtra(str, strArr);
        }

        @Deprecated
        public static read e(Activity activity) {
            return new read(activity);
        }

        public read b(Uri uri) {
            this.j = null;
            if (uri != null) {
                d(uri);
            }
            return this;
        }

        public read b(CharSequence charSequence) {
            this.e.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        public read b(String str) {
            if (this.h == null) {
                this.h = new ArrayList<>();
            }
            this.h.add(str);
            return this;
        }

        public void b() {
            this.a.startActivity(d());
        }

        public read c(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public read c(String str) {
            this.e.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        public Intent d() {
            return Intent.createChooser(e(), this.c);
        }

        public read d(Uri uri) {
            if (this.j == null) {
                this.j = new ArrayList<>();
            }
            this.j.add(uri);
            return this;
        }

        public read d(String str) {
            this.e.setType(str);
            return this;
        }

        public Intent e() {
            ArrayList<String> arrayList = this.h;
            if (arrayList != null) {
                d("android.intent.extra.EMAIL", arrayList);
                this.h = null;
            }
            ArrayList<String> arrayList2 = this.d;
            if (arrayList2 != null) {
                d("android.intent.extra.CC", arrayList2);
                this.d = null;
            }
            ArrayList<String> arrayList3 = this.b;
            if (arrayList3 != null) {
                d("android.intent.extra.BCC", arrayList3);
                this.b = null;
            }
            ArrayList<Uri> arrayList4 = this.j;
            boolean z = true;
            if (arrayList4 == null || arrayList4.size() <= 1) {
                z = false;
            }
            if (!z) {
                this.e.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.j;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.e.removeExtra("android.intent.extra.STREAM");
                    RemoteActionCompatParcelizer.e(this.e);
                } else {
                    this.e.putExtra("android.intent.extra.STREAM", this.j.get(0));
                    RemoteActionCompatParcelizer.d(this.e, this.j);
                }
            } else {
                this.e.setAction("android.intent.action.SEND_MULTIPLE");
                this.e.putParcelableArrayListExtra("android.intent.extra.STREAM", this.j);
                RemoteActionCompatParcelizer.d(this.e, this.j);
            }
            return this.e;
        }
    }
}
