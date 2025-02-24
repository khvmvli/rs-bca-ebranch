package o;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* loaded from: classes-dex2jar.jar:o/setHasFixedSize.class */
public final class setHasFixedSize {
    public final Set<setHasFixedSize$MediaBrowserCompat$CustomActionResultReceiver> b;
    public final Map<String, RemoteActionCompatParcelizer> c;
    public final String d;
    public final Set<read> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setHasFixedSize$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements Comparable<IconCompatParcelizer> {
        final String b;
        final String c;
        final int d;
        final int e;

        IconCompatParcelizer(int i, int i2, String str, String str2) {
            this.d = i;
            this.e = i2;
            this.c = str;
            this.b = str2;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(IconCompatParcelizer iconCompatParcelizer) {
            IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
            int i = this.d - iconCompatParcelizer2.d;
            int i2 = i;
            if (i == 0) {
                i2 = this.e - iconCompatParcelizer2.e;
            }
            return i2;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setHasFixedSize$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        public final int a;
        public final String b;
        public final int c;
        public final String d;
        public final boolean e;
        public final String f;
        private final int g;

        public RemoteActionCompatParcelizer(String str, String str2, boolean z, int i, String str3, int i2) {
            this.d = str;
            this.f = str2;
            this.e = z;
            this.c = i;
            int i3 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i3 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i3 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.a = i3;
            this.b = str3;
            this.g = i2;
        }

        private static boolean c(String str, String str2) {
            boolean z;
            if (str2 == null) {
                return false;
            }
            if (str.equals(str2)) {
                return true;
            }
            if (str.length() != 0) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i < str.length()) {
                        char charAt = str.charAt(i);
                        if (i == 0 && charAt != '(') {
                            break;
                        }
                        if (charAt == '(') {
                            i2++;
                        } else {
                            i2 = i2;
                            if (charAt == ')') {
                                int i3 = i2 - 1;
                                i2 = i3;
                                if (i3 == 0) {
                                    i2 = i3;
                                    if (i != str.length() - 1) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        i++;
                    } else if (i2 == 0) {
                        z = true;
                    }
                }
            }
            z = false;
            if (z) {
                return str.substring(1, str.length() - 1).trim().equals(str2);
            }
            return false;
        }

        public final boolean equals(Object obj) {
            String str;
            String str2;
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            if (this.c != remoteActionCompatParcelizer.c || !this.d.equals(remoteActionCompatParcelizer.d) || this.e != remoteActionCompatParcelizer.e) {
                return false;
            }
            if (this.g == 1 && remoteActionCompatParcelizer.g == 2 && (str2 = this.b) != null && !c(str2, remoteActionCompatParcelizer.b)) {
                return false;
            }
            if (this.g == 2 && remoteActionCompatParcelizer.g == 1 && (str = remoteActionCompatParcelizer.b) != null && !c(str, this.b)) {
                return false;
            }
            int i = this.g;
            if (i != 0 && i == remoteActionCompatParcelizer.g) {
                String str3 = this.b;
                if (str3 != null) {
                    if (!c(str3, remoteActionCompatParcelizer.b)) {
                        return false;
                    }
                } else if (remoteActionCompatParcelizer.b != null) {
                    return false;
                }
            }
            if (this.a != remoteActionCompatParcelizer.a) {
                z = false;
            }
            return z;
        }

        public final int hashCode() {
            int hashCode = this.d.hashCode();
            return (((((hashCode * 31) + this.a) * 31) + (this.e ? 1231 : 1237)) * 31) + this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.d);
            sb.append("', type='");
            sb.append(this.f);
            sb.append("', affinity='");
            sb.append(this.a);
            sb.append("', notNull=");
            sb.append(this.e);
            sb.append(", primaryKeyPosition=");
            sb.append(this.c);
            sb.append(", defaultValue='");
            sb.append(this.b);
            sb.append("'}");
            return sb.toString();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setHasFixedSize$read.class */
    public static final class read {
        public final List<String> a;
        public final List<String> b;
        public final String c;
        public final String d;
        public final String e;

        public read(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.d = str;
            this.c = str2;
            this.e = str3;
            this.b = Collections.unmodifiableList(list);
            this.a = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read = (read) obj;
            if (this.d.equals(read.d) && this.c.equals(read.c) && this.e.equals(read.e) && this.b.equals(read.b)) {
                return this.a.equals(read.a);
            }
            return false;
        }

        public final int hashCode() {
            return (((((((this.d.hashCode() * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ForeignKey{referenceTable='");
            sb.append(this.d);
            sb.append("', onDelete='");
            sb.append(this.c);
            sb.append("', onUpdate='");
            sb.append(this.e);
            sb.append("', columnNames=");
            sb.append(this.b);
            sb.append(", referenceColumnNames=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    public setHasFixedSize(String str, Map<String, RemoteActionCompatParcelizer> map, Set<read> set, Set<setHasFixedSize$MediaBrowserCompat$CustomActionResultReceiver> set2) {
        this.d = str;
        this.c = Collections.unmodifiableMap(map);
        this.e = Collections.unmodifiableSet(set);
        this.b = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    private static List<IconCompatParcelizer> a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new IconCompatParcelizer(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static Set<read> a(setOnScrollListener setonscrolllistener, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder("PRAGMA foreign_key_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor d = setonscrolllistener.d(sb.toString());
        try {
            int columnIndex = d.getColumnIndex("id");
            int columnIndex2 = d.getColumnIndex("seq");
            int columnIndex3 = d.getColumnIndex("table");
            int columnIndex4 = d.getColumnIndex("on_delete");
            int columnIndex5 = d.getColumnIndex("on_update");
            List<IconCompatParcelizer> a = a(d);
            int count = d.getCount();
            for (int i = 0; i < count; i++) {
                d.moveToPosition(i);
                if (d.getInt(columnIndex2) == 0) {
                    int i2 = d.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (IconCompatParcelizer iconCompatParcelizer : a) {
                        if (iconCompatParcelizer.d == i2) {
                            arrayList.add(iconCompatParcelizer.c);
                            arrayList2.add(iconCompatParcelizer.b);
                        }
                    }
                    hashSet.add(new read(d.getString(columnIndex3), d.getString(columnIndex4), d.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            d.close();
        }
    }

    public static Map<String, RemoteActionCompatParcelizer> b(setOnScrollListener setonscrolllistener, String str) {
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        sb.append("`)");
        Cursor d = setonscrolllistener.d(sb.toString());
        HashMap hashMap = new HashMap();
        try {
            if (d.getColumnCount() > 0) {
                int columnIndex = d.getColumnIndex("name");
                int columnIndex2 = d.getColumnIndex("type");
                int columnIndex3 = d.getColumnIndex("notnull");
                int columnIndex4 = d.getColumnIndex("pk");
                int columnIndex5 = d.getColumnIndex("dflt_value");
                while (d.moveToNext()) {
                    String string = d.getString(columnIndex);
                    hashMap.put(string, new RemoteActionCompatParcelizer(string, d.getString(columnIndex2), d.getInt(columnIndex3) != 0, d.getInt(columnIndex4), d.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            d.close();
        }
    }

    private static setHasFixedSize$MediaBrowserCompat$CustomActionResultReceiver b(setOnScrollListener setonscrolllistener, String str, boolean z) {
        StringBuilder sb = new StringBuilder("PRAGMA index_xinfo(`");
        sb.append(str);
        sb.append("`)");
        Cursor d = setonscrolllistener.d(sb.toString());
        try {
            int columnIndex = d.getColumnIndex("seqno");
            int columnIndex2 = d.getColumnIndex("cid");
            int columnIndex3 = d.getColumnIndex("name");
            int columnIndex4 = d.getColumnIndex("desc");
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1) {
                d.close();
                return null;
            }
            TreeMap treeMap = new TreeMap();
            TreeMap treeMap2 = new TreeMap();
            while (d.moveToNext()) {
                if (d.getInt(columnIndex2) >= 0) {
                    int i = d.getInt(columnIndex);
                    String string = d.getString(columnIndex3);
                    String str2 = d.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                    treeMap.put(Integer.valueOf(i), string);
                    treeMap2.put(Integer.valueOf(i), str2);
                }
            }
            ArrayList arrayList = new ArrayList(treeMap.size());
            arrayList.addAll(treeMap.values());
            ArrayList arrayList2 = new ArrayList(treeMap2.size());
            arrayList2.addAll(treeMap2.values());
            return new setHasFixedSize$MediaBrowserCompat$CustomActionResultReceiver(str, z, arrayList, arrayList2);
        } finally {
            d.close();
        }
    }

    /* JADX WARN: Finally extract failed */
    public static Set<setHasFixedSize$MediaBrowserCompat$CustomActionResultReceiver> c(setOnScrollListener setonscrolllistener, String str) {
        StringBuilder sb = new StringBuilder("PRAGMA index_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor d = setonscrolllistener.d(sb.toString());
        try {
            int columnIndex = d.getColumnIndex("name");
            int columnIndex2 = d.getColumnIndex("origin");
            int columnIndex3 = d.getColumnIndex("unique");
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1) {
                d.close();
                return null;
            }
            HashSet hashSet = new HashSet();
            while (d.moveToNext()) {
                if ("c".equals(d.getString(columnIndex2))) {
                    String string = d.getString(columnIndex);
                    boolean z = true;
                    if (d.getInt(columnIndex3) != 1) {
                        z = false;
                    }
                    setHasFixedSize$MediaBrowserCompat$CustomActionResultReceiver b = b(setonscrolllistener, string, z);
                    if (b == null) {
                        d.close();
                        return null;
                    }
                    hashSet.add(b);
                }
            }
            d.close();
            return hashSet;
        } catch (Throwable th) {
            d.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        Set<setHasFixedSize$MediaBrowserCompat$CustomActionResultReceiver> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setHasFixedSize)) {
            return false;
        }
        setHasFixedSize sethasfixedsize = (setHasFixedSize) obj;
        String str = this.d;
        if (str != null) {
            if (!str.equals(sethasfixedsize.d)) {
                return false;
            }
        } else if (sethasfixedsize.d != null) {
            return false;
        }
        Map<String, RemoteActionCompatParcelizer> map = this.c;
        if (map != null) {
            if (!map.equals(sethasfixedsize.c)) {
                return false;
            }
        } else if (sethasfixedsize.c != null) {
            return false;
        }
        Set<read> set2 = this.e;
        if (set2 != null) {
            if (!set2.equals(sethasfixedsize.e)) {
                return false;
            }
        } else if (sethasfixedsize.e != null) {
            return false;
        }
        Set<setHasFixedSize$MediaBrowserCompat$CustomActionResultReceiver> set3 = this.b;
        if (set3 == null || (set = sethasfixedsize.b) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public final int hashCode() {
        String str = this.d;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Map<String, RemoteActionCompatParcelizer> map = this.c;
        int hashCode2 = map != null ? map.hashCode() : 0;
        Set<read> set = this.e;
        if (set != null) {
            i = set.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TableInfo{name='");
        sb.append(this.d);
        sb.append("', columns=");
        sb.append(this.c);
        sb.append(", foreignKeys=");
        sb.append(this.e);
        sb.append(", indices=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
