package o;

import android.graphics.Color;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import o.requireParentFragment;
/* loaded from: classes-dex2jar.jar:o/setAllowReturnTransitionOverlap.class */
public final class setAllowReturnTransitionOverlap {
    private static final Comparator<write> h = new Comparator<write>() { // from class: o.setAllowReturnTransitionOverlap.3
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(write write2, write write3) {
            return write3.b() - write2.b();
        }
    };
    public final List<requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver> b;
    final int[] c;
    final requireParentFragment.IconCompatParcelizer[] d;
    final int[] e;
    private final float[] j = new float[3];
    final TimingLogger a = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setAllowReturnTransitionOverlap$write.class */
    public final class write {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int h;
        int i;
        int j;

        write(int i, int i2) {
            this.d = i;
            this.i = i2;
            c();
        }

        final int b() {
            return ((this.b - this.f) + 1) * ((this.c - this.h) + 1) * ((this.a - this.e) + 1);
        }

        final void c() {
            int[] iArr = setAllowReturnTransitionOverlap.this.c;
            int[] iArr2 = setAllowReturnTransitionOverlap.this.e;
            int i = Integer.MIN_VALUE;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = 0;
            for (int i8 = this.d; i8 <= this.i; i8++) {
                int i9 = iArr[i8];
                i7 += iArr2[i9];
                int d = setAllowReturnTransitionOverlap.d(i9);
                int e = setAllowReturnTransitionOverlap.e(i9);
                int b = setAllowReturnTransitionOverlap.b(i9);
                i = i;
                if (d > i) {
                    i = d;
                }
                i4 = i4;
                if (d < i4) {
                    i4 = d;
                }
                i2 = i2;
                if (e > i2) {
                    i2 = e;
                }
                i5 = i5;
                if (e < i5) {
                    i5 = e;
                }
                i3 = i3;
                if (b > i3) {
                    i3 = b;
                }
                i6 = i6;
                if (b < i6) {
                    i6 = b;
                }
            }
            this.f = i4;
            this.b = i;
            this.h = i5;
            this.c = i2;
            this.e = i6;
            this.a = i3;
            this.j = i7;
        }

        final requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver e() {
            int[] iArr = setAllowReturnTransitionOverlap.this.c;
            int[] iArr2 = setAllowReturnTransitionOverlap.this.e;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.d; i5 <= this.i; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i2 += i7;
                i += setAllowReturnTransitionOverlap.d(i6) * i7;
                i3 += setAllowReturnTransitionOverlap.e(i6) * i7;
                i4 += i7 * setAllowReturnTransitionOverlap.b(i6);
            }
            float f = (float) i2;
            return new requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver(setAllowReturnTransitionOverlap.e(Math.round(((float) i) / f), Math.round(((float) i3) / f), Math.round(((float) i4) / f)), i2);
        }
    }

    public setAllowReturnTransitionOverlap(int[] iArr, int i, requireParentFragment.IconCompatParcelizer[] iconCompatParcelizerArr) {
        this.d = iconCompatParcelizerArr;
        int[] iArr2 = new int[32768];
        this.e = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int blue = ((Color.blue(i3) >> 3) & 31) | (((Color.red(i3) >> 3) & 31) << 10) | (((Color.green(i3) >> 3) & 31) << 5);
            iArr[i2] = blue;
            iArr2[blue] = iArr2[blue] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int rgb = Color.rgb((((i5 >> 10) & 31) << 3) & 255, (((i5 >> 5) & 31) << 3) & 255, ((i5 & 31) << 3) & 255);
                isRound.a(rgb, this.j);
                if (c(rgb, this.j)) {
                    iArr2[i5] = 0;
                }
            }
            i4 = i4;
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.c = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            i6 = i6;
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 <= i) {
            this.b = new ArrayList();
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = iArr3[i8];
                this.b.add(new requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver(Color.rgb((((i9 >> 10) & 31) << 3) & 255, (((i9 >> 5) & 31) << 3) & 255, ((i9 & 31) << 3) & 255), iArr2[i9]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, h);
        priorityQueue.offer(new write(0, this.c.length - 1));
        e(priorityQueue, i);
        this.b = b(priorityQueue);
    }

    static int b(int i) {
        return i & 31;
    }

    private List<requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver> b(Collection<write> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (write write2 : collection) {
            requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver e = write2.e();
            if (!c(e.e, e.b())) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    private boolean c(int i, float[] fArr) {
        requireParentFragment.IconCompatParcelizer[] iconCompatParcelizerArr = this.d;
        if (iconCompatParcelizerArr == null || iconCompatParcelizerArr.length <= 0) {
            return false;
        }
        int length = iconCompatParcelizerArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (!this.d[i2].c(i, fArr)) {
                return true;
            }
        }
        return false;
    }

    static int d(int i) {
        return (i >> 10) & 31;
    }

    static void d(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            for (int i4 = i2; i4 <= i3; i4++) {
                int i5 = iArr[i4];
                iArr[i4] = (i5 & 31) | (((i5 >> 5) & 31) << 10) | (((i5 >> 10) & 31) << 5);
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i6 = iArr[i2];
                iArr[i2] = ((i6 >> 10) & 31) | ((i6 & 31) << 10) | (((i6 >> 5) & 31) << 5);
                i2++;
            }
        }
    }

    static int e(int i) {
        return (i >> 5) & 31;
    }

    static int e(int i, int i2, int i3) {
        return Color.rgb((i << 3) & 255, (i2 << 3) & 255, (i3 << 3) & 255);
    }

    private static void e(PriorityQueue<write> priorityQueue, int i) {
        write poll;
        int i2;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null) {
            int i3 = 0;
            if ((poll.i + 1) - poll.d > 1) {
                if ((poll.i + 1) - poll.d > 1) {
                    int i4 = poll.b - poll.f;
                    int i5 = poll.c - poll.h;
                    int i6 = poll.a - poll.e;
                    int i7 = (i4 < i5 || i4 < i6) ? (i5 < i4 || i5 < i6) ? -1 : -2 : -3;
                    int[] iArr = setAllowReturnTransitionOverlap.this.c;
                    int[] iArr2 = setAllowReturnTransitionOverlap.this.e;
                    d(iArr, i7, poll.d, poll.i);
                    Arrays.sort(iArr, poll.d, poll.i + 1);
                    d(iArr, i7, poll.d, poll.i);
                    int i8 = poll.j / 2;
                    int i9 = poll.d;
                    while (true) {
                        int i10 = poll.i;
                        if (i9 > i10) {
                            i2 = poll.d;
                            break;
                        }
                        i3 += iArr2[iArr[i9]];
                        if (i3 >= i8) {
                            i2 = Math.min(i10 - 1, i9);
                            break;
                        }
                        i9++;
                    }
                    write write2 = new write(i2 + 1, poll.i);
                    poll.i = i2;
                    poll.c();
                    priorityQueue.offer(write2);
                    priorityQueue.offer(poll);
                } else {
                    throw new IllegalStateException("Can not split a box with only 1 color");
                }
            } else {
                return;
            }
        }
    }
}
