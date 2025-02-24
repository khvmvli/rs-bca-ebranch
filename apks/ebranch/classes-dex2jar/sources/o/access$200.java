package o;

import android.graphics.Typeface;
import android.os.Handler;
import o.access$000;
import o.createFragmentContainer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/access$200.class */
public final class access$200 {
    private final Handler b;
    private final createFragmentContainer.read e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public access$200(createFragmentContainer.read read, Handler handler) {
        this.e = read;
        this.b = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(access$000.IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer.a == 0) {
            final Typeface typeface = iconCompatParcelizer.c;
            final createFragmentContainer.read read = this.e;
            this.b.post(new Runnable() { // from class: o.access$200.1
                @Override // java.lang.Runnable
                public final void run() {
                    read.c(typeface);
                }
            });
            return;
        }
        final int i = iconCompatParcelizer.a;
        final createFragmentContainer.read read2 = this.e;
        this.b.post(new Runnable() { // from class: o.access$200.2
            @Override // java.lang.Runnable
            public final void run() {
                read2.c(i);
            }
        });
    }
}
