package o;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes2-dex2jar.jar:o/BuildConfig.class */
public final class BuildConfig extends AbstractList<setResponseMessage> implements RandomAccess {
    final int[] a;
    final setResponseMessage[] e;

    private BuildConfig(setResponseMessage[] setresponsemessageArr, int[] iArr) {
        this.e = setresponsemessageArr;
        this.a = iArr;
    }

    private static void a(long j, setResponseContentType setresponsecontenttype, int i, List<setResponseMessage> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        if (i2 < i3) {
            for (int i6 = i2; i6 < i3; i6++) {
                if (list.get(i6).g() < i) {
                    throw new AssertionError();
                }
            }
            setResponseMessage setresponsemessage = list.get(i2);
            setResponseMessage setresponsemessage2 = list.get(i3 - 1);
            if (i == setresponsemessage.g()) {
                i4 = list2.get(i2).intValue();
                i2++;
                setresponsemessage = list.get(i2);
            } else {
                i4 = -1;
            }
            if (setresponsemessage.a(i) != setresponsemessage2.a(i)) {
                int i7 = 1;
                for (int i8 = i2 + 1; i8 < i3; i8++) {
                    i7 = i7;
                    if (list.get(i8 - 1).a(i) != list.get(i8).a(i)) {
                        i7++;
                    }
                }
                long j2 = ((long) (i7 << 1)) + j + ((long) ((int) (setresponsecontenttype.b / 4))) + 2;
                setresponsecontenttype.d(i7);
                setresponsecontenttype.d(i4);
                for (int i9 = i2; i9 < i3; i9++) {
                    byte a = list.get(i9).a(i);
                    if (i9 == i2 || a != list.get(i9 - 1).a(i)) {
                        setresponsecontenttype.d(a & 255);
                    }
                }
                setResponseContentType setresponsecontenttype2 = new setResponseContentType();
                while (i2 < i3) {
                    byte a2 = list.get(i2).a(i);
                    int i10 = i2 + 1;
                    i2 = i10;
                    while (true) {
                        if (i2 >= i3) {
                            i2 = i3;
                            break;
                        }
                        if (a2 != list.get(i2).a(i)) {
                            break;
                        }
                        i2++;
                    }
                    if (i10 == i2 && i + 1 == list.get(i2).g()) {
                        setresponsecontenttype.d(list2.get(i2).intValue());
                    } else {
                        setresponsecontenttype.d((int) (-(((long) ((int) (setresponsecontenttype2.b / 4))) + j2)));
                        a(j2, setresponsecontenttype2, i + 1, list, i2, i2, list2);
                    }
                }
                setresponsecontenttype.write(setresponsecontenttype2, setresponsecontenttype2.b);
                return;
            }
            int min = Math.min(setresponsemessage.g(), setresponsemessage2.g());
            int i11 = 0;
            int i12 = i;
            while (i12 < min && setresponsemessage.a(i12) == setresponsemessage2.a(i12)) {
                i11++;
                i12++;
            }
            long j3 = 1 + j + ((long) ((int) (setresponsecontenttype.b / 4))) + 2 + ((long) i11);
            setresponsecontenttype.d(-i11);
            setresponsecontenttype.d(i4);
            int i13 = i;
            while (true) {
                i5 = i + i11;
                if (i13 >= i5) {
                    break;
                }
                setresponsecontenttype.d(setresponsemessage.a(i13) & 255);
                i13++;
            }
            if (i2 + 1 != i3) {
                setResponseContentType setresponsecontenttype3 = new setResponseContentType();
                setresponsecontenttype.d((int) (-(((long) ((int) (setresponsecontenttype3.b / 4))) + j3)));
                a(j3, setresponsecontenttype3, i5, list, i2, i3, list2);
                setresponsecontenttype.write(setresponsecontenttype3, setresponsecontenttype3.b);
            } else if (i5 == list.get(i2).g()) {
                setresponsecontenttype.d(list2.get(i2).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x013f, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static o.BuildConfig d(o.setResponseMessage... r9) {
        /*
        // Method dump skipped, instructions count: 445
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BuildConfig.d(o.setResponseMessage[]):o.BuildConfig");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.e[i];
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.e.length;
    }
}
