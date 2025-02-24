package o;

import android.os.SystemClock;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/getIncomeAmount.class */
public abstract class getIncomeAmount implements View.OnClickListener {
    public static final write g = new write((byte) 0);
    private long c;

    /* loaded from: classes-dex2jar.jar:o/getIncomeAmount$write.class */
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public abstract void b(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        subscribeReservationRescheduleEvent.e(view, "");
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.c;
        this.c = uptimeMillis;
        if (uptimeMillis - j >= 500) {
            b(view);
        }
    }
}
