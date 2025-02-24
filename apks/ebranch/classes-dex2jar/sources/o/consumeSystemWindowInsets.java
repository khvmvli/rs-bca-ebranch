package o;

import android.app.Notification;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import io.realm.internal.Property;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.ParseException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/consumeSystemWindowInsets.class */
public class consumeSystemWindowInsets implements OperationCanceledException {
    private RemoteViews a;
    private RemoteViews b;
    private final Notification.Builder d;
    private final ParseException.RemoteActionCompatParcelizer e;
    private int g;
    private RemoteViews i;
    private final Context j;
    private final List<Bundle> c = new ArrayList();
    private final Bundle h = new Bundle();

    /* JADX INFO: Access modifiers changed from: package-private */
    public consumeSystemWindowInsets(ParseException.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.e = remoteActionCompatParcelizer;
        this.j = remoteActionCompatParcelizer.s;
        if (Build.VERSION.SDK_INT >= 26) {
            this.d = new Notification.Builder(remoteActionCompatParcelizer.s, remoteActionCompatParcelizer.j);
        } else {
            this.d = new Notification.Builder(remoteActionCompatParcelizer.s);
        }
        Notification notification = remoteActionCompatParcelizer.D;
        this.d.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteActionCompatParcelizer.R).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(remoteActionCompatParcelizer.n).setContentText(remoteActionCompatParcelizer.k).setContentInfo(remoteActionCompatParcelizer.l).setContentIntent(remoteActionCompatParcelizer.f125o).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(remoteActionCompatParcelizer.r, (notification.flags & Property.TYPE_ARRAY) != 0).setLargeIcon(remoteActionCompatParcelizer.y).setNumber(remoteActionCompatParcelizer.A).setProgress(remoteActionCompatParcelizer.E, remoteActionCompatParcelizer.I, remoteActionCompatParcelizer.F);
        this.d.setSubText(remoteActionCompatParcelizer.O).setUsesChronometer(remoteActionCompatParcelizer.U).setPriority(remoteActionCompatParcelizer.G);
        Iterator<ParseException$MediaBrowserCompat$CustomActionResultReceiver> it = remoteActionCompatParcelizer.a.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        if (remoteActionCompatParcelizer.p != null) {
            this.h.putAll(remoteActionCompatParcelizer.p);
        }
        this.a = remoteActionCompatParcelizer.m;
        this.b = remoteActionCompatParcelizer.e;
        this.d.setShowWhen(remoteActionCompatParcelizer.N);
        this.d.setLocalOnly(remoteActionCompatParcelizer.w).setGroup(remoteActionCompatParcelizer.q).setGroupSummary(remoteActionCompatParcelizer.v).setSortKey(remoteActionCompatParcelizer.P);
        this.g = remoteActionCompatParcelizer.t;
        this.d.setCategory(remoteActionCompatParcelizer.h).setColor(remoteActionCompatParcelizer.i).setVisibility(remoteActionCompatParcelizer.W).setPublicVersion(remoteActionCompatParcelizer.H).setSound(notification.sound, notification.audioAttributes);
        List<String> b = Build.VERSION.SDK_INT < 28 ? b(c(remoteActionCompatParcelizer.B), remoteActionCompatParcelizer.z) : remoteActionCompatParcelizer.z;
        if (b != null && !b.isEmpty()) {
            for (String str : b) {
                this.d.addPerson(str);
            }
        }
        this.i = remoteActionCompatParcelizer.x;
        if (remoteActionCompatParcelizer.u.size() > 0) {
            Bundle bundle = remoteActionCompatParcelizer.a().getBundle("android.car.EXTENSIONS");
            Bundle bundle2 = bundle == null ? new Bundle() : bundle;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i = 0; i < remoteActionCompatParcelizer.u.size(); i++) {
                bundle4.putBundle(Integer.toString(i), copyRootViewBounds.a(remoteActionCompatParcelizer.u.get(i)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            remoteActionCompatParcelizer.a().putBundle("android.car.EXTENSIONS", bundle2);
            this.h.putBundle("android.car.EXTENSIONS", bundle3);
        }
        if (Build.VERSION.SDK_INT >= 23 && remoteActionCompatParcelizer.S != null) {
            this.d.setSmallIcon(remoteActionCompatParcelizer.S);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.d.setExtras(remoteActionCompatParcelizer.p).setRemoteInputHistory(remoteActionCompatParcelizer.K);
            if (remoteActionCompatParcelizer.m != null) {
                this.d.setCustomContentView(remoteActionCompatParcelizer.m);
            }
            if (remoteActionCompatParcelizer.e != null) {
                this.d.setCustomBigContentView(remoteActionCompatParcelizer.e);
            }
            if (remoteActionCompatParcelizer.x != null) {
                this.d.setCustomHeadsUpContentView(remoteActionCompatParcelizer.x);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.d.setBadgeIconType(remoteActionCompatParcelizer.d).setSettingsText(remoteActionCompatParcelizer.M).setShortcutId(remoteActionCompatParcelizer.J).setTimeoutAfter(remoteActionCompatParcelizer.T).setGroupAlertBehavior(remoteActionCompatParcelizer.t);
            if (remoteActionCompatParcelizer.f) {
                this.d.setColorized(remoteActionCompatParcelizer.g);
            }
            if (!TextUtils.isEmpty(remoteActionCompatParcelizer.j)) {
                this.d.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Iterator<consumeStableInsets> it2 = remoteActionCompatParcelizer.B.iterator();
            while (it2.hasNext()) {
                consumeStableInsets next = it2.next();
                this.d.addPerson(new Person.Builder().setName(next.a).setIcon(next.c != null ? next.c.h() : null).setUri(next.i).setKey(next.e).setBot(next.b).setImportant(next.d).build());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.d.setAllowSystemGeneratedContextualActions(remoteActionCompatParcelizer.b);
            this.d.setBubbleMetadata(ParseException.read.e(remoteActionCompatParcelizer.c));
            if (remoteActionCompatParcelizer.C != null) {
                this.d.setLocusId(remoteActionCompatParcelizer.C.b());
            }
        }
        if (remoteActionCompatParcelizer.L) {
            if (this.e.v) {
                this.g = 2;
            } else {
                this.g = 1;
            }
            this.d.setVibrate(null);
            this.d.setSound(null);
            notification.defaults &= -2;
            notification.defaults &= -3;
            this.d.setDefaults(notification.defaults);
            if (Build.VERSION.SDK_INT >= 26) {
                if (TextUtils.isEmpty(this.e.q)) {
                    this.d.setGroup("silent");
                }
                this.d.setGroupAlertBehavior(this.g);
            }
        }
    }

    private static List<String> b(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        setThumbTintMode setthumbtintmode = new setThumbTintMode(list.size() + list2.size());
        setthumbtintmode.addAll(list);
        setthumbtintmode.addAll(list2);
        return new ArrayList(setthumbtintmode);
    }

    private void b(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    private void b(ParseException$MediaBrowserCompat$CustomActionResultReceiver parseException$MediaBrowserCompat$CustomActionResultReceiver) {
        IconCompat d = parseException$MediaBrowserCompat$CustomActionResultReceiver.d();
        Notification.Action.Builder builder = Build.VERSION.SDK_INT >= 23 ? new Notification.Action.Builder(d != null ? d.h() : null, parseException$MediaBrowserCompat$CustomActionResultReceiver.i(), parseException$MediaBrowserCompat$CustomActionResultReceiver.c()) : new Notification.Action.Builder(d != null ? d.e() : 0, parseException$MediaBrowserCompat$CustomActionResultReceiver.i(), parseException$MediaBrowserCompat$CustomActionResultReceiver.c());
        if (parseException$MediaBrowserCompat$CustomActionResultReceiver.a() != null) {
            for (RemoteInput remoteInput : WindowInsetsCompat$Impl.b(parseException$MediaBrowserCompat$CustomActionResultReceiver.a())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = parseException$MediaBrowserCompat$CustomActionResultReceiver.e() != null ? new Bundle(parseException$MediaBrowserCompat$CustomActionResultReceiver.e()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", parseException$MediaBrowserCompat$CustomActionResultReceiver.b());
        if (Build.VERSION.SDK_INT >= 24) {
            builder.setAllowGeneratedReplies(parseException$MediaBrowserCompat$CustomActionResultReceiver.b());
        }
        bundle.putInt("android.support.action.semanticAction", parseException$MediaBrowserCompat$CustomActionResultReceiver.f());
        if (Build.VERSION.SDK_INT >= 28) {
            builder.setSemanticAction(parseException$MediaBrowserCompat$CustomActionResultReceiver.f());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setContextual(parseException$MediaBrowserCompat$CustomActionResultReceiver.j());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", parseException$MediaBrowserCompat$CustomActionResultReceiver.g());
        builder.addExtras(bundle);
        this.d.addAction(builder.build());
    }

    private static List<String> c(List<consumeStableInsets> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (consumeStableInsets consumestableinsets : list) {
            String str = consumestableinsets.i;
            if (str == null) {
                if (consumestableinsets.a != null) {
                    StringBuilder sb = new StringBuilder("name:");
                    sb.append((Object) consumestableinsets.a);
                    str = sb.toString();
                } else {
                    str = "";
                }
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context b() {
        return this.j;
    }

    protected Notification c() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.d.build();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Notification build = this.d.build();
            if (this.g != 0) {
                if (!(build.getGroup() == null || (build.flags & Property.TYPE_DICTIONARY) == 0 || this.g != 2)) {
                    b(build);
                }
                if (build.getGroup() != null && (build.flags & Property.TYPE_DICTIONARY) == 0 && this.g == 1) {
                    b(build);
                }
            }
            return build;
        }
        this.d.setExtras(this.h);
        Notification build2 = this.d.build();
        RemoteViews remoteViews = this.a;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.b;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.i;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.g != 0) {
            if (!(build2.getGroup() == null || (build2.flags & Property.TYPE_DICTIONARY) == 0 || this.g != 2)) {
                b(build2);
            }
            if (build2.getGroup() != null && (build2.flags & Property.TYPE_DICTIONARY) == 0 && this.g == 1) {
                b(build2);
            }
        }
        return build2;
    }

    @Override // o.OperationCanceledException
    public Notification.Builder d() {
        return this.d;
    }

    public Notification e() {
        Bundle e;
        RemoteViews b;
        RemoteViews a;
        ParseException$MediaBrowserCompat$SearchResultReceiver parseException$MediaBrowserCompat$SearchResultReceiver = this.e.Q;
        if (parseException$MediaBrowserCompat$SearchResultReceiver != null) {
            parseException$MediaBrowserCompat$SearchResultReceiver.e(this);
        }
        RemoteViews c = parseException$MediaBrowserCompat$SearchResultReceiver != null ? parseException$MediaBrowserCompat$SearchResultReceiver.c(this) : null;
        Notification c2 = c();
        if (c != null) {
            c2.contentView = c;
        } else if (this.e.m != null) {
            c2.contentView = this.e.m;
        }
        if (!(parseException$MediaBrowserCompat$SearchResultReceiver == null || (a = parseException$MediaBrowserCompat$SearchResultReceiver.a(this)) == null)) {
            c2.bigContentView = a;
        }
        if (!(parseException$MediaBrowserCompat$SearchResultReceiver == null || (b = this.e.Q.b(this)) == null)) {
            c2.headsUpContentView = b;
        }
        if (!(parseException$MediaBrowserCompat$SearchResultReceiver == null || (e = ParseException.e(c2)) == null)) {
            parseException$MediaBrowserCompat$SearchResultReceiver.b(e);
        }
        return c2;
    }
}
