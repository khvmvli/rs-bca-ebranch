package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
/* loaded from: classes2-dex2jar.jar:org/joda/time/LocalDateTime$Property.class */
public final class LocalDateTime$Property extends AbstractReadableInstantFieldProperty {
    private static final long serialVersionUID = -358138762846288L;
    private transient DateTimeField iField;
    private transient LocalDateTime iInstant;

    LocalDateTime$Property(LocalDateTime localDateTime, DateTimeField dateTimeField) {
        this.iInstant = localDateTime;
        this.iField = dateTimeField;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.iInstant = (LocalDateTime) objectInputStream.readObject();
        this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.iInstant);
        objectOutputStream.writeObject(this.iField.getType());
    }

    public final LocalDateTime addToCopy(int i) {
        LocalDateTime localDateTime = this.iInstant;
        return localDateTime.withLocalMillis(this.iField.add(localDateTime.getLocalMillis(), i));
    }

    public final LocalDateTime addToCopy(long j) {
        LocalDateTime localDateTime = this.iInstant;
        return localDateTime.withLocalMillis(this.iField.add(localDateTime.getLocalMillis(), j));
    }

    public final LocalDateTime addWrapFieldToCopy(int i) {
        LocalDateTime localDateTime = this.iInstant;
        return localDateTime.withLocalMillis(this.iField.addWrapField(localDateTime.getLocalMillis(), i));
    }

    public final Chronology getChronology() {
        return this.iInstant.getChronology();
    }

    public final DateTimeField getField() {
        return this.iField;
    }

    public final LocalDateTime getLocalDateTime() {
        return this.iInstant;
    }

    public final long getMillis() {
        return this.iInstant.getLocalMillis();
    }

    public final LocalDateTime roundCeilingCopy() {
        LocalDateTime localDateTime = this.iInstant;
        return localDateTime.withLocalMillis(this.iField.roundCeiling(localDateTime.getLocalMillis()));
    }

    public final LocalDateTime roundFloorCopy() {
        LocalDateTime localDateTime = this.iInstant;
        return localDateTime.withLocalMillis(this.iField.roundFloor(localDateTime.getLocalMillis()));
    }

    public final LocalDateTime roundHalfCeilingCopy() {
        LocalDateTime localDateTime = this.iInstant;
        return localDateTime.withLocalMillis(this.iField.roundHalfCeiling(localDateTime.getLocalMillis()));
    }

    public final LocalDateTime roundHalfEvenCopy() {
        LocalDateTime localDateTime = this.iInstant;
        return localDateTime.withLocalMillis(this.iField.roundHalfEven(localDateTime.getLocalMillis()));
    }

    public final LocalDateTime roundHalfFloorCopy() {
        LocalDateTime localDateTime = this.iInstant;
        return localDateTime.withLocalMillis(this.iField.roundHalfFloor(localDateTime.getLocalMillis()));
    }

    public final LocalDateTime setCopy(int i) {
        LocalDateTime localDateTime = this.iInstant;
        return localDateTime.withLocalMillis(this.iField.set(localDateTime.getLocalMillis(), i));
    }

    public final LocalDateTime setCopy(String str) {
        return setCopy(str, null);
    }

    public final LocalDateTime setCopy(String str, Locale locale) {
        LocalDateTime localDateTime = this.iInstant;
        return localDateTime.withLocalMillis(this.iField.set(localDateTime.getLocalMillis(), str, locale));
    }

    public final LocalDateTime withMaximumValue() {
        return setCopy(getMaximumValue());
    }

    public final LocalDateTime withMinimumValue() {
        return setCopy(getMinimumValue());
    }
}
