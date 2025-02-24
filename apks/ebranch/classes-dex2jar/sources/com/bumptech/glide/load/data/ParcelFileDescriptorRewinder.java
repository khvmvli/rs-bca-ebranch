package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;
import o.setReservationTime;
import o.setReservationTime$MediaBrowserCompat$CustomActionResultReceiver;
/* loaded from: classes-dex2jar.jar:com/bumptech/glide/load/data/ParcelFileDescriptorRewinder.class */
public final class ParcelFileDescriptorRewinder implements setReservationTime<ParcelFileDescriptor> {
    public final InternalRewinder b;

    /* loaded from: classes-dex2jar.jar:com/bumptech/glide/load/data/ParcelFileDescriptorRewinder$InternalRewinder.class */
    public static final class InternalRewinder {
        private final ParcelFileDescriptor b;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.b = parcelFileDescriptor;
        }

        public final ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.b.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.b;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bumptech/glide/load/data/ParcelFileDescriptorRewinder$write.class */
    public static final class write implements setReservationTime$MediaBrowserCompat$CustomActionResultReceiver<ParcelFileDescriptor> {
        @Override // o.setReservationTime$MediaBrowserCompat$CustomActionResultReceiver
        public final Class<ParcelFileDescriptor> c() {
            return ParcelFileDescriptor.class;
        }

        @Override // o.setReservationTime$MediaBrowserCompat$CustomActionResultReceiver
        public final /* synthetic */ setReservationTime<ParcelFileDescriptor> d(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.b = new InternalRewinder(parcelFileDescriptor);
    }

    @Override // o.setReservationTime
    public final /* synthetic */ ParcelFileDescriptor a() throws IOException {
        return this.b.rewind();
    }

    @Override // o.setReservationTime
    public final void d() {
    }
}
