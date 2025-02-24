package org.joda.time.chrono;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.joda.time.DateTimeZone;
/* loaded from: classes2-dex2jar.jar:org/joda/time/chrono/ISOChronology$Stub.class */
final class ISOChronology$Stub implements Serializable {
    private static final long serialVersionUID = -6212696554273812441L;
    private transient DateTimeZone iZone;

    ISOChronology$Stub(DateTimeZone dateTimeZone) {
        this.iZone = dateTimeZone;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.iZone = (DateTimeZone) objectInputStream.readObject();
    }

    private Object readResolve() {
        return ISOChronology.getInstance(this.iZone);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.iZone);
    }
}
