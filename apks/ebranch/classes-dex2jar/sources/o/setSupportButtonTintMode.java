package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import com.facebook.stetho.common.Utf8Charset;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setSupportButtonTintMode.class */
public class setSupportButtonTintMode extends DataSetObservable {
    static final String a = "ActivityChooserModel";
    final Context b;
    boolean d;
    final String e;
    private final List<setSupportButtonTintMode$MediaBrowserCompat$CustomActionResultReceiver> f;
    private read h;
    private RemoteActionCompatParcelizer i;
    private final List<IconCompatParcelizer> j;
    private int k;
    private boolean l;
    private Intent m;
    private final Object n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f272o;
    private boolean s;
    private static final Object g = new Object();
    private static final Map<String, setSupportButtonTintMode> c = new HashMap();

    /* loaded from: classes-dex2jar.jar:o/setSupportButtonTintMode$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements Comparable<IconCompatParcelizer> {
        public final ResolveInfo a;
        public float b;

        public IconCompatParcelizer(ResolveInfo resolveInfo) {
            this.a = resolveInfo;
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(IconCompatParcelizer iconCompatParcelizer) {
            return Float.floatToIntBits(iconCompatParcelizer.b) - Float.floatToIntBits(this.b);
        }

        @Override // java.lang.Object
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.b) == Float.floatToIntBits(((IconCompatParcelizer) obj).b);
        }

        @Override // java.lang.Object
        public final int hashCode() {
            return Float.floatToIntBits(this.b) + 31;
        }

        @Override // java.lang.Object
        public final String toString() {
            StringBuilder sb = new StringBuilder("[resolveInfo:");
            sb.append(this.a.toString());
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.b));
            sb.append("]");
            return sb.toString();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setSupportButtonTintMode$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        boolean d();
    }

    /* loaded from: classes-dex2jar.jar:o/setSupportButtonTintMode$read.class */
    public interface read {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setSupportButtonTintMode$write.class */
    public final class write extends AsyncTask<Object, Void, Void> {
        write() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public Void doInBackground(Object... objArr) {
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                FileOutputStream openFileOutput = setSupportButtonTintMode.this.b.openFileOutput(str, 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    try {
                        try {
                            newSerializer.setOutput(openFileOutput, null);
                            newSerializer.startDocument(Utf8Charset.NAME, Boolean.TRUE);
                            newSerializer.startTag(null, "historical-records");
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                setSupportButtonTintMode$MediaBrowserCompat$CustomActionResultReceiver setsupportbuttontintmode_mediabrowsercompat_customactionresultreceiver = (setSupportButtonTintMode$MediaBrowserCompat$CustomActionResultReceiver) list.remove(0);
                                newSerializer.startTag(null, "historical-record");
                                newSerializer.attribute(null, "activity", setsupportbuttontintmode_mediabrowsercompat_customactionresultreceiver.a.flattenToString());
                                newSerializer.attribute(null, "time", String.valueOf(setsupportbuttontintmode_mediabrowsercompat_customactionresultreceiver.c));
                                newSerializer.attribute(null, "weight", String.valueOf(setsupportbuttontintmode_mediabrowsercompat_customactionresultreceiver.e));
                                newSerializer.endTag(null, "historical-record");
                            }
                            newSerializer.endTag(null, "historical-records");
                            newSerializer.endDocument();
                            setSupportButtonTintMode.this.d = true;
                            if (openFileOutput == null) {
                                return null;
                            }
                        } catch (IOException e) {
                            String str2 = setSupportButtonTintMode.a;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error writing historical record file: ");
                            sb.append(setSupportButtonTintMode.this.e);
                            Log.e(str2, sb.toString(), e);
                            setSupportButtonTintMode.this.d = true;
                            if (openFileOutput == null) {
                                return null;
                            }
                        }
                    } catch (IllegalArgumentException e2) {
                        String str3 = setSupportButtonTintMode.a;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Error writing historical record file: ");
                        sb2.append(setSupportButtonTintMode.this.e);
                        Log.e(str3, sb2.toString(), e2);
                        setSupportButtonTintMode.this.d = true;
                        if (openFileOutput == null) {
                            return null;
                        }
                    } catch (IllegalStateException e3) {
                        String str4 = setSupportButtonTintMode.a;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Error writing historical record file: ");
                        sb3.append(setSupportButtonTintMode.this.e);
                        Log.e(str4, sb3.toString(), e3);
                        setSupportButtonTintMode.this.d = true;
                        if (openFileOutput == null) {
                            return null;
                        }
                    }
                    try {
                        openFileOutput.close();
                        return null;
                    } catch (IOException e4) {
                        return null;
                    }
                } catch (Throwable th) {
                    setSupportButtonTintMode.this.d = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e5) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e6) {
                String str5 = setSupportButtonTintMode.a;
                StringBuilder sb4 = new StringBuilder("Error writing historical record file: ");
                sb4.append(str);
                Log.e(str5, sb4.toString(), e6);
                return null;
            }
        }
    }

    private void a() {
        int size = this.f.size() - this.k;
        if (size > 0) {
            this.f272o = true;
            for (int i = 0; i < size; i++) {
                this.f.remove(0);
            }
        }
    }

    private boolean b(setSupportButtonTintMode$MediaBrowserCompat$CustomActionResultReceiver setsupportbuttontintmode_mediabrowsercompat_customactionresultreceiver) {
        boolean add = this.f.add(setsupportbuttontintmode_mediabrowsercompat_customactionresultreceiver);
        if (add) {
            this.f272o = true;
            a();
            if (this.l) {
                if (this.f272o) {
                    this.f272o = false;
                    if (!TextUtils.isEmpty(this.e)) {
                        new write().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f), this.e);
                    }
                }
                i();
                notifyChanged();
            } else {
                throw new IllegalStateException("No preceding call to #readHistoricalData");
            }
        }
        return add;
    }

    private void c() {
        boolean z;
        boolean z2 = true;
        if (!this.s || this.m == null) {
            z = false;
        } else {
            this.s = false;
            this.j.clear();
            List<ResolveInfo> queryIntentActivities = this.b.getPackageManager().queryIntentActivities(this.m, 0);
            int size = queryIntentActivities.size();
            for (int i = 0; i < size; i++) {
                this.j.add(new IconCompatParcelizer(queryIntentActivities.get(i)));
            }
            z = true;
        }
        if (!this.d || !this.f272o || TextUtils.isEmpty(this.e)) {
            z2 = false;
        } else {
            this.d = false;
            this.l = true;
            h();
        }
        a();
        if (z || z2) {
            i();
            notifyChanged();
        }
    }

    private void h() {
        FileInputStream openFileInput;
        XmlPullParser newPullParser;
        try {
            try {
                openFileInput = this.b.openFileInput(this.e);
                try {
                    try {
                        newPullParser = Xml.newPullParser();
                        newPullParser.setInput(openFileInput, Utf8Charset.NAME);
                        int i = 0;
                        while (i != 1 && i != 2) {
                            i = newPullParser.next();
                        }
                    } catch (XmlPullParserException e) {
                        String str = a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error reading historical recrod file: ");
                        sb.append(this.e);
                        Log.e(str, sb.toString(), e);
                        if (openFileInput == null) {
                            return;
                        }
                    }
                } catch (IOException e2) {
                    String str2 = a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error reading historical recrod file: ");
                    sb2.append(this.e);
                    Log.e(str2, sb2.toString(), e2);
                    if (openFileInput == null) {
                        return;
                    }
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List<setSupportButtonTintMode$MediaBrowserCompat$CustomActionResultReceiver> list = this.f;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            if (openFileInput == null) {
                                return;
                            }
                        } else if (!(next == 3 || next == 4)) {
                            if ("historical-record".equals(newPullParser.getName())) {
                                list.add(new setSupportButtonTintMode$MediaBrowserCompat$CustomActionResultReceiver(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                            } else {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                        }
                    }
                    try {
                        openFileInput.close();
                    } catch (IOException e3) {
                    }
                } else {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e5) {
        }
    }

    private boolean i() {
        if (this.h == null || this.m == null || this.j.isEmpty() || this.f.isEmpty()) {
            return false;
        }
        Collections.unmodifiableList(this.f);
        return true;
    }

    public final ResolveInfo a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.n) {
            c();
            resolveInfo = this.j.get(i).a;
        }
        return resolveInfo;
    }

    public final int b(ResolveInfo resolveInfo) {
        synchronized (this.n) {
            c();
            List<IconCompatParcelizer> list = this.j;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public final ResolveInfo b() {
        synchronized (this.n) {
            c();
            if (this.j.isEmpty()) {
                return null;
            }
            return this.j.get(0).a;
        }
    }

    public final void c(int i) {
        synchronized (this.n) {
            c();
            IconCompatParcelizer iconCompatParcelizer = this.j.get(i);
            IconCompatParcelizer iconCompatParcelizer2 = this.j.get(0);
            b(new setSupportButtonTintMode$MediaBrowserCompat$CustomActionResultReceiver(new ComponentName(iconCompatParcelizer.a.activityInfo.packageName, iconCompatParcelizer.a.activityInfo.name), System.currentTimeMillis(), iconCompatParcelizer2 != null ? (iconCompatParcelizer2.b - iconCompatParcelizer.b) + 5.0f : 1.0f));
        }
    }

    public final int d() {
        int size;
        synchronized (this.n) {
            c();
            size = this.f.size();
        }
        return size;
    }

    public final int e() {
        int size;
        synchronized (this.n) {
            c();
            size = this.j.size();
        }
        return size;
    }

    public final Intent e(int i) {
        synchronized (this.n) {
            if (this.m == null) {
                return null;
            }
            c();
            IconCompatParcelizer iconCompatParcelizer = this.j.get(i);
            ComponentName componentName = new ComponentName(iconCompatParcelizer.a.activityInfo.packageName, iconCompatParcelizer.a.activityInfo.name);
            Intent intent = new Intent(this.m);
            intent.setComponent(componentName);
            if (this.i != null) {
                new Intent(intent);
                if (this.i.d()) {
                    return null;
                }
            }
            b(new setSupportButtonTintMode$MediaBrowserCompat$CustomActionResultReceiver(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }
}
