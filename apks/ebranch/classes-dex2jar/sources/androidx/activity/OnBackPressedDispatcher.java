package androidx.activity;

import java.util.ArrayDeque;
import java.util.Iterator;
import o.MediaSessionCompat$ResultReceiverWrapper;
import o.RatingCompat;
import o.onRequestPermissionsResult;
import o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver;
import o.onResume;
import o.performContextItemSelected;
/* loaded from: classes-dex2jar.jar:androidx/activity/OnBackPressedDispatcher.class */
public final class OnBackPressedDispatcher {
    final ArrayDeque<RatingCompat> c;
    private final Runnable e;

    /* loaded from: classes-dex2jar.jar:androidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable.class */
    public class LifecycleOnBackPressedCancellable implements onResume, MediaSessionCompat$ResultReceiverWrapper {
        private final RatingCompat a;
        private MediaSessionCompat$ResultReceiverWrapper b;
        private final onRequestPermissionsResult c;

        LifecycleOnBackPressedCancellable(onRequestPermissionsResult onrequestpermissionsresult, RatingCompat ratingCompat) {
            OnBackPressedDispatcher.this = r4;
            this.c = onrequestpermissionsresult;
            this.a = ratingCompat;
            onrequestpermissionsresult.c(this);
        }

        @Override // o.MediaSessionCompat$ResultReceiverWrapper
        public final void a() {
            this.c.e(this);
            this.a.d.remove(this);
            MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = this.b;
            if (mediaSessionCompat$ResultReceiverWrapper != null) {
                mediaSessionCompat$ResultReceiverWrapper.a();
                this.b = null;
            }
        }

        @Override // o.onResume
        public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
            if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                RatingCompat ratingCompat = this.a;
                onBackPressedDispatcher.c.add(ratingCompat);
                write write = new write(ratingCompat);
                ratingCompat.d.add(write);
                this.b = write;
            } else if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_STOP) {
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = this.b;
                if (mediaSessionCompat$ResultReceiverWrapper != null) {
                    mediaSessionCompat$ResultReceiverWrapper.a();
                }
            } else if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_DESTROY) {
                a();
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/activity/OnBackPressedDispatcher$write.class */
    final class write implements MediaSessionCompat$ResultReceiverWrapper {
        private final RatingCompat d;

        write(RatingCompat ratingCompat) {
            OnBackPressedDispatcher.this = r4;
            this.d = ratingCompat;
        }

        @Override // o.MediaSessionCompat$ResultReceiverWrapper
        public final void a() {
            OnBackPressedDispatcher.this.c.remove(this.d);
            this.d.d.remove(this);
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.c = new ArrayDeque<>();
        this.e = runnable;
    }

    public final void a() {
        Iterator<RatingCompat> descendingIterator = this.c.descendingIterator();
        while (descendingIterator.hasNext()) {
            RatingCompat next = descendingIterator.next();
            if (next.b) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(performContextItemSelected performcontextitemselected, RatingCompat ratingCompat) {
        onRequestPermissionsResult lifecycle = performcontextitemselected.getLifecycle();
        if (lifecycle.a() != onRequestPermissionsResult.read.DESTROYED) {
            ratingCompat.d.add(new LifecycleOnBackPressedCancellable(lifecycle, ratingCompat));
        }
    }
}
