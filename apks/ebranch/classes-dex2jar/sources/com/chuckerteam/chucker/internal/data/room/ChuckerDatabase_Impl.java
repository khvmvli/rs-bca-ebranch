package com.chuckerteam.chucker.internal.data.room;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AudioAttributesImplBaseParcelizer;
import o.Fragment$InstantiationException;
import o.FullLifecycleObserverAdapter;
import o.LinearLayoutManager;
import o.MasterFundSourcePurposeResponse;
import o.SavedStateHandleController;
import o.getFundSource;
import o.setCategorySttCode;
import o.setCategorySttDesc;
import o.setHasFixedSize;
import o.setOnScrollListener;
import o.setScrollingTouchSlop;
/* loaded from: classes-dex2jar.jar:com/chuckerteam/chucker/internal/data/room/ChuckerDatabase_Impl.class */
public final class ChuckerDatabase_Impl extends ChuckerDatabase {
    private volatile setCategorySttCode m;

    /* renamed from: o  reason: collision with root package name */
    private volatile getFundSource f67o;

    @Override // o.onActivityStopped
    public final setScrollingTouchSlop b(Fragment$InstantiationException fragment$InstantiationException) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(fragment$InstantiationException, new SavedStateHandleController.write(4) { // from class: com.chuckerteam.chucker.internal.data.room.ChuckerDatabase_Impl.3
            @Override // o.SavedStateHandleController.write
            public final void a(setOnScrollListener setonscrolllistener) {
                ChuckerDatabase_Impl.this.h = setonscrolllistener;
                ChuckerDatabase_Impl.this.c(setonscrolllistener);
                if (ChuckerDatabase_Impl.this.d != null) {
                    int size = ChuckerDatabase_Impl.this.d.size();
                    for (int i = 0; i < size; i++) {
                        ChuckerDatabase_Impl.this.d.get(i);
                    }
                }
            }

            @Override // o.SavedStateHandleController.write
            public final void b(setOnScrollListener setonscrolllistener) {
                if (ChuckerDatabase_Impl.this.d != null) {
                    int size = ChuckerDatabase_Impl.this.d.size();
                    for (int i = 0; i < size; i++) {
                        ChuckerDatabase_Impl.this.d.get(i);
                    }
                }
            }

            @Override // o.SavedStateHandleController.write
            public final void c(setOnScrollListener setonscrolllistener) {
                setonscrolllistener.b("DROP TABLE IF EXISTS `throwables`");
                setonscrolllistener.b("DROP TABLE IF EXISTS `transactions`");
                if (ChuckerDatabase_Impl.this.d != null) {
                    int size = ChuckerDatabase_Impl.this.d.size();
                    for (int i = 0; i < size; i++) {
                        ChuckerDatabase_Impl.this.d.get(i);
                    }
                }
            }

            @Override // o.SavedStateHandleController.write
            public final void d(setOnScrollListener setonscrolllistener) {
                setonscrolllistener.b("CREATE TABLE IF NOT EXISTS `throwables` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `tag` TEXT, `date` INTEGER, `clazz` TEXT, `message` TEXT, `content` TEXT)");
                setonscrolllistener.b("CREATE TABLE IF NOT EXISTS `transactions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `requestDate` INTEGER, `responseDate` INTEGER, `tookMs` INTEGER, `protocol` TEXT, `method` TEXT, `url` TEXT, `host` TEXT, `path` TEXT, `scheme` TEXT, `responseTlsVersion` TEXT, `responseCipherSuite` TEXT, `requestPayloadSize` INTEGER, `requestContentType` TEXT, `requestHeaders` TEXT, `requestBody` TEXT, `isRequestBodyPlainText` INTEGER NOT NULL, `responseCode` INTEGER, `responseMessage` TEXT, `error` TEXT, `responsePayloadSize` INTEGER, `responseContentType` TEXT, `responseHeaders` TEXT, `responseBody` TEXT, `isResponseBodyPlainText` INTEGER NOT NULL, `responseImageData` BLOB)");
                setonscrolllistener.b("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                setonscrolllistener.b("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3ad896fa3ec863e554b9890fab536763')");
            }

            /* JADX WARN: Finally extract failed */
            @Override // o.SavedStateHandleController.write
            public final void e(setOnScrollListener setonscrolllistener) {
                ArrayList<String> arrayList = new ArrayList();
                Cursor d = setonscrolllistener.d("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (d.moveToNext()) {
                    try {
                        arrayList.add(d.getString(0));
                    } catch (Throwable th) {
                        d.close();
                        throw th;
                    }
                }
                d.close();
                for (String str : arrayList) {
                    if (str.startsWith("room_fts_content_sync_")) {
                        StringBuilder sb = new StringBuilder("DROP TRIGGER IF EXISTS ");
                        sb.append(str);
                        setonscrolllistener.b(sb.toString());
                    }
                }
            }

            @Override // o.SavedStateHandleController.write
            public final SavedStateHandleController.read g(setOnScrollListener setonscrolllistener) {
                HashMap hashMap = new HashMap(6);
                hashMap.put("id", new setHasFixedSize.RemoteActionCompatParcelizer("id", "INTEGER", false, 1, null, 1));
                hashMap.put("tag", new setHasFixedSize.RemoteActionCompatParcelizer("tag", "TEXT", false, 0, null, 1));
                hashMap.put("date", new setHasFixedSize.RemoteActionCompatParcelizer("date", "INTEGER", false, 0, null, 1));
                hashMap.put("clazz", new setHasFixedSize.RemoteActionCompatParcelizer("clazz", "TEXT", false, 0, null, 1));
                hashMap.put("message", new setHasFixedSize.RemoteActionCompatParcelizer("message", "TEXT", false, 0, null, 1));
                hashMap.put("content", new setHasFixedSize.RemoteActionCompatParcelizer("content", "TEXT", false, 0, null, 1));
                setHasFixedSize sethasfixedsize = new setHasFixedSize("throwables", hashMap, new HashSet(0), new HashSet(0));
                setHasFixedSize sethasfixedsize2 = new setHasFixedSize("throwables", setHasFixedSize.b(setonscrolllistener, "throwables"), setHasFixedSize.a(setonscrolllistener, "throwables"), setHasFixedSize.c(setonscrolllistener, "throwables"));
                if (!sethasfixedsize.equals(sethasfixedsize2)) {
                    StringBuilder sb = new StringBuilder("throwables(com.chuckerteam.chucker.internal.data.entity.RecordedThrowable).\n Expected:\n");
                    sb.append(sethasfixedsize);
                    sb.append("\n Found:\n");
                    sb.append(sethasfixedsize2);
                    return new SavedStateHandleController.read(false, sb.toString());
                }
                HashMap hashMap2 = new HashMap(26);
                hashMap2.put("id", new setHasFixedSize.RemoteActionCompatParcelizer("id", "INTEGER", true, 1, null, 1));
                hashMap2.put("requestDate", new setHasFixedSize.RemoteActionCompatParcelizer("requestDate", "INTEGER", false, 0, null, 1));
                hashMap2.put("responseDate", new setHasFixedSize.RemoteActionCompatParcelizer("responseDate", "INTEGER", false, 0, null, 1));
                hashMap2.put("tookMs", new setHasFixedSize.RemoteActionCompatParcelizer("tookMs", "INTEGER", false, 0, null, 1));
                hashMap2.put("protocol", new setHasFixedSize.RemoteActionCompatParcelizer("protocol", "TEXT", false, 0, null, 1));
                hashMap2.put("method", new setHasFixedSize.RemoteActionCompatParcelizer("method", "TEXT", false, 0, null, 1));
                hashMap2.put("url", new setHasFixedSize.RemoteActionCompatParcelizer("url", "TEXT", false, 0, null, 1));
                hashMap2.put("host", new setHasFixedSize.RemoteActionCompatParcelizer("host", "TEXT", false, 0, null, 1));
                hashMap2.put("path", new setHasFixedSize.RemoteActionCompatParcelizer("path", "TEXT", false, 0, null, 1));
                hashMap2.put("scheme", new setHasFixedSize.RemoteActionCompatParcelizer("scheme", "TEXT", false, 0, null, 1));
                hashMap2.put("responseTlsVersion", new setHasFixedSize.RemoteActionCompatParcelizer("responseTlsVersion", "TEXT", false, 0, null, 1));
                hashMap2.put("responseCipherSuite", new setHasFixedSize.RemoteActionCompatParcelizer("responseCipherSuite", "TEXT", false, 0, null, 1));
                hashMap2.put("requestPayloadSize", new setHasFixedSize.RemoteActionCompatParcelizer("requestPayloadSize", "INTEGER", false, 0, null, 1));
                hashMap2.put("requestContentType", new setHasFixedSize.RemoteActionCompatParcelizer("requestContentType", "TEXT", false, 0, null, 1));
                hashMap2.put("requestHeaders", new setHasFixedSize.RemoteActionCompatParcelizer("requestHeaders", "TEXT", false, 0, null, 1));
                hashMap2.put("requestBody", new setHasFixedSize.RemoteActionCompatParcelizer("requestBody", "TEXT", false, 0, null, 1));
                hashMap2.put("isRequestBodyPlainText", new setHasFixedSize.RemoteActionCompatParcelizer("isRequestBodyPlainText", "INTEGER", true, 0, null, 1));
                hashMap2.put("responseCode", new setHasFixedSize.RemoteActionCompatParcelizer("responseCode", "INTEGER", false, 0, null, 1));
                hashMap2.put("responseMessage", new setHasFixedSize.RemoteActionCompatParcelizer("responseMessage", "TEXT", false, 0, null, 1));
                hashMap2.put("error", new setHasFixedSize.RemoteActionCompatParcelizer("error", "TEXT", false, 0, null, 1));
                hashMap2.put("responsePayloadSize", new setHasFixedSize.RemoteActionCompatParcelizer("responsePayloadSize", "INTEGER", false, 0, null, 1));
                hashMap2.put("responseContentType", new setHasFixedSize.RemoteActionCompatParcelizer("responseContentType", "TEXT", false, 0, null, 1));
                hashMap2.put("responseHeaders", new setHasFixedSize.RemoteActionCompatParcelizer("responseHeaders", "TEXT", false, 0, null, 1));
                hashMap2.put("responseBody", new setHasFixedSize.RemoteActionCompatParcelizer("responseBody", "TEXT", false, 0, null, 1));
                hashMap2.put("isResponseBodyPlainText", new setHasFixedSize.RemoteActionCompatParcelizer("isResponseBodyPlainText", "INTEGER", true, 0, null, 1));
                hashMap2.put("responseImageData", new setHasFixedSize.RemoteActionCompatParcelizer("responseImageData", "BLOB", false, 0, null, 1));
                setHasFixedSize sethasfixedsize3 = new setHasFixedSize("transactions", hashMap2, new HashSet(0), new HashSet(0));
                setHasFixedSize sethasfixedsize4 = new setHasFixedSize("transactions", setHasFixedSize.b(setonscrolllistener, "transactions"), setHasFixedSize.a(setonscrolllistener, "transactions"), setHasFixedSize.c(setonscrolllistener, "transactions"));
                if (sethasfixedsize3.equals(sethasfixedsize4)) {
                    return new SavedStateHandleController.read(true, null);
                }
                StringBuilder sb2 = new StringBuilder("transactions(com.chuckerteam.chucker.internal.data.entity.HttpTransaction).\n Expected:\n");
                sb2.append(sethasfixedsize3);
                sb2.append("\n Found:\n");
                sb2.append(sethasfixedsize4);
                return new SavedStateHandleController.read(false, sb2.toString());
            }
        }, "3ad896fa3ec863e554b9890fab536763", "ff9d4b6aab15b17c7fd7e9a0ef9f18c7");
        setScrollingTouchSlop.RemoteActionCompatParcelizer.read read = new setScrollingTouchSlop.RemoteActionCompatParcelizer.read(fragment$InstantiationException.a);
        read.d = fragment$InstantiationException.n;
        read.c = savedStateHandleController;
        return fragment$InstantiationException.p.d(read.a());
    }

    @Override // o.onActivityStopped
    public final FullLifecycleObserverAdapter c() {
        return new FullLifecycleObserverAdapter(this, new HashMap(0), new HashMap(0), "throwables", "transactions");
    }

    @Override // o.onActivityStopped
    public final Set<Class<? extends AudioAttributesImplBaseParcelizer>> f() {
        return new HashSet();
    }

    @Override // o.onActivityStopped
    public final List<LinearLayoutManager> i() {
        return Arrays.asList(new LinearLayoutManager[0]);
    }

    @Override // o.onActivityStopped
    public final Map<Class<?>, List<Class<?>>> j() {
        HashMap hashMap = new HashMap();
        hashMap.put(setCategorySttCode.class, setCategorySttDesc.e());
        hashMap.put(getFundSource.class, MasterFundSourcePurposeResponse.d());
        return hashMap;
    }

    @Override // com.chuckerteam.chucker.internal.data.room.ChuckerDatabase
    public final getFundSource k() {
        getFundSource getfundsource;
        if (this.f67o != null) {
            return this.f67o;
        }
        synchronized (this) {
            if (this.f67o == null) {
                this.f67o = new MasterFundSourcePurposeResponse(this);
            }
            getfundsource = this.f67o;
        }
        return getfundsource;
    }

    @Override // com.chuckerteam.chucker.internal.data.room.ChuckerDatabase
    public final setCategorySttCode n() {
        setCategorySttCode setcategorysttcode;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new setCategorySttDesc(this);
            }
            setcategorysttcode = this.m;
        }
        return setcategorysttcode;
    }
}
