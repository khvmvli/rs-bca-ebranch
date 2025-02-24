package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
/* loaded from: classes2-dex2jar.jar:org/joda/time/DateTime$Property.class */
public final class DateTime$Property extends AbstractReadableInstantFieldProperty {
    private static final long serialVersionUID = -6983323811635733510L;
    private DateTimeField iField;
    private DateTime iInstant;

    DateTime$Property(DateTime dateTime, DateTimeField dateTimeField) {
        this.iInstant = dateTime;
        this.iField = dateTimeField;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.iInstant = (DateTime) objectInputStream.readObject();
        this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.iInstant);
        objectOutputStream.writeObject(this.iField.getType());
    }

    public final DateTime addToCopy(int i) {
        DateTime dateTime = this.iInstant;
        return dateTime.withMillis(this.iField.add(dateTime.getMillis(), i));
    }

    public final DateTime addToCopy(long j) {
        DateTime dateTime = this.iInstant;
        return dateTime.withMillis(this.iField.add(dateTime.getMillis(), j));
    }

    public final DateTime addWrapFieldToCopy(int i) {
        DateTime dateTime = this.iInstant;
        return dateTime.withMillis(this.iField.addWrapField(dateTime.getMillis(), i));
    }

    public final Chronology getChronology() {
        return this.iInstant.getChronology();
    }

    public final DateTime getDateTime() {
        return this.iInstant;
    }

    public final DateTimeField getField() {
        return this.iField;
    }

    public final long getMillis() {
        return this.iInstant.getMillis();
    }

    public final DateTime roundCeilingCopy() {
        DateTime dateTime = this.iInstant;
        return dateTime.withMillis(this.iField.roundCeiling(dateTime.getMillis()));
    }

    public final DateTime roundFloorCopy() {
        DateTime dateTime = this.iInstant;
        return dateTime.withMillis(this.iField.roundFloor(dateTime.getMillis()));
    }

    public final DateTime roundHalfCeilingCopy() {
        DateTime dateTime = this.iInstant;
        return dateTime.withMillis(this.iField.roundHalfCeiling(dateTime.getMillis()));
    }

    public final DateTime roundHalfEvenCopy() {
        DateTime dateTime = this.iInstant;
        return dateTime.withMillis(this.iField.roundHalfEven(dateTime.getMillis()));
    }

    public final DateTime roundHalfFloorCopy() {
        DateTime dateTime = this.iInstant;
        return dateTime.withMillis(this.iField.roundHalfFloor(dateTime.getMillis()));
    }

    public final DateTime setCopy(int i) {
        DateTime dateTime = this.iInstant;
        return dateTime.withMillis(this.iField.set(dateTime.getMillis(), i));
    }

    public final DateTime setCopy(String str) {
        return setCopy(str, null);
    }

    public final DateTime setCopy(String str, Locale locale) {
        DateTime dateTime = this.iInstant;
        return dateTime.withMillis(this.iField.set(dateTime.getMillis(), str, locale));
    }

    public final DateTime withMaximumValue() {
        try {
            return setCopy(getMaximumValue());
        } catch (RuntimeException e) {
            if (IllegalInstantException.isIllegalInstant(e)) {
                return new DateTime(getChronology().getZone().previousTransition(getMillis() + 86400000), getChronology());
            }
            throw e;
        }
    }

    public final DateTime withMinimumValue() {
        try {
            return setCopy(getMinimumValue());
        } catch (RuntimeException e) {
            if (IllegalInstantException.isIllegalInstant(e)) {
                return new DateTime(getChronology().getZone().nextTransition(getMillis() - 86400000), getChronology());
            }
            throw e;
        }
    }
}
