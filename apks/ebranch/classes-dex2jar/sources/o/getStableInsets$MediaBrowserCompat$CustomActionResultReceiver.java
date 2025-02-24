package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getStableInsets$MediaBrowserCompat$CustomActionResultReceiver.class */
final class getStableInsets$MediaBrowserCompat$CustomActionResultReceiver {
    final int[] c;
    final float[] d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getStableInsets$MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        this.c = new int[]{i, i2};
        this.d = new float[]{0.0f, 1.0f};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getStableInsets$MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3) {
        this.c = new int[]{i, i2, i3};
        this.d = new float[]{0.0f, 0.5f, 1.0f};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getStableInsets$MediaBrowserCompat$CustomActionResultReceiver(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.c = new int[size];
        this.d = new float[size];
        for (int i = 0; i < size; i++) {
            this.c[i] = list.get(i).intValue();
            this.d[i] = list2.get(i).floatValue();
        }
    }
}
