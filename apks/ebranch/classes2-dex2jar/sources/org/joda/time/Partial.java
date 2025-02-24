package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.base.AbstractPartial;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
/* loaded from: classes2-dex2jar.jar:org/joda/time/Partial.class */
public final class Partial extends AbstractPartial implements ReadablePartial, Serializable {
    private static final long serialVersionUID = 12324121189002L;
    private final Chronology iChronology;
    private transient DateTimeFormatter[] iFormatter;
    private final DateTimeFieldType[] iTypes;
    private final int[] iValues;

    /* loaded from: classes2-dex2jar.jar:org/joda/time/Partial$Property.class */
    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 53278362873888L;
        private final int iFieldIndex;
        private final Partial iPartial;

        Property(Partial partial, int i) {
            this.iPartial = partial;
            this.iFieldIndex = i;
        }

        public Partial addToCopy(int i) {
            return new Partial(this.iPartial, getField().add(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i));
        }

        public Partial addWrapFieldToCopy(int i) {
            return new Partial(this.iPartial, getField().addWrapField(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iPartial.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iPartial.getField(this.iFieldIndex);
        }

        public Partial getPartial() {
            return this.iPartial;
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iPartial;
        }

        public Partial setCopy(int i) {
            return new Partial(this.iPartial, getField().set(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i));
        }

        public Partial setCopy(String str) {
            return setCopy(str, null);
        }

        public Partial setCopy(String str, Locale locale) {
            return new Partial(this.iPartial, getField().set(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), str, locale));
        }

        public Partial withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public Partial withMinimumValue() {
            return setCopy(getMinimumValue());
        }
    }

    public Partial() {
        this((Chronology) null);
    }

    public Partial(Chronology chronology) {
        this.iChronology = DateTimeUtils.getChronology(chronology).withUTC();
        this.iTypes = new DateTimeFieldType[0];
        this.iValues = new int[0];
    }

    Partial(Chronology chronology, DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this.iChronology = chronology;
        this.iTypes = dateTimeFieldTypeArr;
        this.iValues = iArr;
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i) {
        this(dateTimeFieldType, i, (Chronology) null);
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i, Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        this.iChronology = withUTC;
        if (dateTimeFieldType != null) {
            this.iTypes = new DateTimeFieldType[]{dateTimeFieldType};
            int[] iArr = {i};
            this.iValues = iArr;
            withUTC.validate(this, iArr);
            return;
        }
        throw new IllegalArgumentException("The field type must not be null");
    }

    Partial(Partial partial, int[] iArr) {
        this.iChronology = partial.iChronology;
        this.iTypes = partial.iTypes;
        this.iValues = iArr;
    }

    public Partial(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            this.iChronology = DateTimeUtils.getChronology(readablePartial.getChronology()).withUTC();
            this.iTypes = new DateTimeFieldType[readablePartial.size()];
            this.iValues = new int[readablePartial.size()];
            for (int i = 0; i < readablePartial.size(); i++) {
                this.iTypes[i] = readablePartial.getFieldType(i);
                this.iValues[i] = readablePartial.getValue(i);
            }
            return;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this(dateTimeFieldTypeArr, iArr, (Chronology) null);
    }

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr, Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        this.iChronology = withUTC;
        if (dateTimeFieldTypeArr == null) {
            throw new IllegalArgumentException("Types array must not be null");
        } else if (iArr == null) {
            throw new IllegalArgumentException("Values array must not be null");
        } else if (iArr.length != dateTimeFieldTypeArr.length) {
            throw new IllegalArgumentException("Values array must be the same length as the types array");
        } else if (dateTimeFieldTypeArr.length == 0) {
            this.iTypes = dateTimeFieldTypeArr;
            this.iValues = iArr;
        } else {
            int i = 0;
            for (int i2 = 0; i2 < dateTimeFieldTypeArr.length; i2++) {
                if (dateTimeFieldTypeArr[i2] == null) {
                    StringBuilder sb = new StringBuilder("Types array must not contain null: index ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            DurationField durationField = null;
            while (i < dateTimeFieldTypeArr.length) {
                DateTimeFieldType dateTimeFieldType = dateTimeFieldTypeArr[i];
                DurationField field = dateTimeFieldType.getDurationType().getField(this.iChronology);
                if (i > 0) {
                    if (field.isSupported()) {
                        int compareTo = durationField.compareTo(field);
                        if (compareTo < 0) {
                            StringBuilder sb2 = new StringBuilder("Types array must be in order largest-smallest: ");
                            sb2.append(dateTimeFieldTypeArr[i - 1].getName());
                            sb2.append(" < ");
                            sb2.append(dateTimeFieldType.getName());
                            throw new IllegalArgumentException(sb2.toString());
                        } else if (compareTo != 0) {
                            continue;
                        } else if (durationField.equals(field)) {
                            int i3 = i - 1;
                            DurationFieldType rangeDurationType = dateTimeFieldTypeArr[i3].getRangeDurationType();
                            DurationFieldType rangeDurationType2 = dateTimeFieldType.getRangeDurationType();
                            if (rangeDurationType == null) {
                                if (rangeDurationType2 == null) {
                                    StringBuilder sb3 = new StringBuilder("Types array must not contain duplicate: ");
                                    sb3.append(dateTimeFieldTypeArr[i3].getName());
                                    sb3.append(" and ");
                                    sb3.append(dateTimeFieldType.getName());
                                    throw new IllegalArgumentException(sb3.toString());
                                }
                            } else if (rangeDurationType2 != null) {
                                DurationField field2 = rangeDurationType.getField(this.iChronology);
                                DurationField field3 = rangeDurationType2.getField(this.iChronology);
                                if (field2.compareTo(field3) < 0) {
                                    StringBuilder sb4 = new StringBuilder("Types array must be in order largest-smallest: ");
                                    sb4.append(dateTimeFieldTypeArr[i3].getName());
                                    sb4.append(" < ");
                                    sb4.append(dateTimeFieldType.getName());
                                    throw new IllegalArgumentException(sb4.toString());
                                } else if (field2.compareTo(field3) == 0) {
                                    StringBuilder sb5 = new StringBuilder("Types array must not contain duplicate: ");
                                    sb5.append(dateTimeFieldTypeArr[i3].getName());
                                    sb5.append(" and ");
                                    sb5.append(dateTimeFieldType.getName());
                                    throw new IllegalArgumentException(sb5.toString());
                                }
                            } else {
                                StringBuilder sb6 = new StringBuilder("Types array must be in order largest-smallest: ");
                                sb6.append(dateTimeFieldTypeArr[i3].getName());
                                sb6.append(" < ");
                                sb6.append(dateTimeFieldType.getName());
                                throw new IllegalArgumentException(sb6.toString());
                            }
                        } else if (durationField.isSupported() && durationField.getType() != DurationFieldType.YEARS_TYPE) {
                            StringBuilder sb7 = new StringBuilder("Types array must be in order largest-smallest, for year-based fields, years is defined as being largest: ");
                            sb7.append(dateTimeFieldTypeArr[i - 1].getName());
                            sb7.append(" < ");
                            sb7.append(dateTimeFieldType.getName());
                            throw new IllegalArgumentException(sb7.toString());
                        }
                    } else if (durationField.isSupported()) {
                        StringBuilder sb8 = new StringBuilder("Types array must be in order largest-smallest: ");
                        sb8.append(dateTimeFieldTypeArr[i - 1].getName());
                        sb8.append(" < ");
                        sb8.append(dateTimeFieldType.getName());
                        throw new IllegalArgumentException(sb8.toString());
                    } else {
                        StringBuilder sb9 = new StringBuilder("Types array must not contain duplicate unsupported: ");
                        sb9.append(dateTimeFieldTypeArr[i - 1].getName());
                        sb9.append(" and ");
                        sb9.append(dateTimeFieldType.getName());
                        throw new IllegalArgumentException(sb9.toString());
                    }
                }
                i++;
                durationField = field;
            }
            this.iTypes = (DateTimeFieldType[]) dateTimeFieldTypeArr.clone();
            withUTC.validate(this, iArr);
            this.iValues = (int[]) iArr.clone();
        }
    }

    public final Chronology getChronology() {
        return this.iChronology;
    }

    public final DateTimeField getField(int i, Chronology chronology) {
        return this.iTypes[i].getField(chronology);
    }

    public final DateTimeFieldType getFieldType(int i) {
        return this.iTypes[i];
    }

    public final DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) this.iTypes.clone();
    }

    public final DateTimeFormatter getFormatter() {
        DateTimeFormatter[] dateTimeFormatterArr = this.iFormatter;
        DateTimeFormatter[] dateTimeFormatterArr2 = dateTimeFormatterArr;
        if (dateTimeFormatterArr == null) {
            if (size() == 0) {
                return null;
            }
            dateTimeFormatterArr2 = new DateTimeFormatter[2];
            try {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.iTypes));
                dateTimeFormatterArr2[0] = ISODateTimeFormat.forFields(arrayList, true, false);
                if (arrayList.size() == 0) {
                    dateTimeFormatterArr2[1] = dateTimeFormatterArr2[0];
                }
            } catch (IllegalArgumentException e) {
            }
            this.iFormatter = dateTimeFormatterArr2;
        }
        return dateTimeFormatterArr2[0];
    }

    public final int getValue(int i) {
        return this.iValues[i];
    }

    public final int[] getValues() {
        return (int[]) this.iValues.clone();
    }

    public final boolean isMatch(ReadableInstant readableInstant) {
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        int i = 0;
        while (true) {
            DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
            if (i >= dateTimeFieldTypeArr.length) {
                return true;
            }
            if (dateTimeFieldTypeArr[i].getField(instantChronology).get(instantMillis) != this.iValues[i]) {
                return false;
            }
            i++;
        }
    }

    public final boolean isMatch(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            int i = 0;
            while (true) {
                DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
                if (i >= dateTimeFieldTypeArr.length) {
                    return true;
                }
                if (readablePartial.get(dateTimeFieldTypeArr[i]) != this.iValues[i]) {
                    return false;
                }
                i++;
            }
        } else {
            throw new IllegalArgumentException("The partial must not be null");
        }
    }

    public final Partial minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public final Partial plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public final Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    public final int size() {
        return this.iTypes.length;
    }

    @Override // java.lang.Object
    public final String toString() {
        DateTimeFormatter[] dateTimeFormatterArr = this.iFormatter;
        DateTimeFormatter[] dateTimeFormatterArr2 = dateTimeFormatterArr;
        if (dateTimeFormatterArr == null) {
            getFormatter();
            DateTimeFormatter[] dateTimeFormatterArr3 = this.iFormatter;
            dateTimeFormatterArr2 = dateTimeFormatterArr3;
            if (dateTimeFormatterArr3 == null) {
                return toStringList();
            }
        }
        DateTimeFormatter dateTimeFormatter = dateTimeFormatterArr2[1];
        return dateTimeFormatter == null ? toStringList() : dateTimeFormatter.print(this);
    }

    public final String toString(String str) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).print(this);
    }

    public final String toString(String str, Locale locale) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public final String toStringList() {
        int size = size();
        StringBuilder sb = new StringBuilder(size * 20);
        sb.append('[');
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.iTypes[i].getName());
            sb.append('=');
            sb.append(this.iValues[i]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final Partial with(DateTimeFieldType dateTimeFieldType, int i) {
        int i2;
        if (dateTimeFieldType != null) {
            int indexOf = indexOf(dateTimeFieldType);
            if (indexOf == -1) {
                int length = this.iTypes.length + 1;
                DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[length];
                int[] iArr = new int[length];
                DurationField field = dateTimeFieldType.getDurationType().getField(this.iChronology);
                if (field.isSupported()) {
                    int i3 = 0;
                    while (true) {
                        DateTimeFieldType[] dateTimeFieldTypeArr2 = this.iTypes;
                        i2 = i3;
                        if (i3 >= dateTimeFieldTypeArr2.length) {
                            break;
                        }
                        DateTimeFieldType dateTimeFieldType2 = dateTimeFieldTypeArr2[i3];
                        DurationField field2 = dateTimeFieldType2.getDurationType().getField(this.iChronology);
                        if (field2.isSupported()) {
                            int compareTo = field.compareTo(field2);
                            if (compareTo <= 0) {
                                if (compareTo == 0) {
                                    if (dateTimeFieldType.getRangeDurationType() != null) {
                                        if (dateTimeFieldType2.getRangeDurationType() != null && dateTimeFieldType.getRangeDurationType().getField(this.iChronology).compareTo(dateTimeFieldType2.getRangeDurationType().getField(this.iChronology)) > 0) {
                                            i2 = i3;
                                            break;
                                        }
                                    } else {
                                        i2 = i3;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                i2 = i3;
                                break;
                            }
                        }
                        i3++;
                    }
                } else {
                    i2 = 0;
                }
                System.arraycopy(this.iTypes, 0, dateTimeFieldTypeArr, 0, i2);
                System.arraycopy(this.iValues, 0, iArr, 0, i2);
                dateTimeFieldTypeArr[i2] = dateTimeFieldType;
                iArr[i2] = i;
                int i4 = i2 + 1;
                int i5 = (length - i2) - 1;
                System.arraycopy(this.iTypes, i2, dateTimeFieldTypeArr, i4, i5);
                System.arraycopy(this.iValues, i2, iArr, i4, i5);
                Partial partial = new Partial(dateTimeFieldTypeArr, iArr, this.iChronology);
                this.iChronology.validate(partial, iArr);
                return partial;
            } else if (i == getValue(indexOf)) {
                return this;
            } else {
                return new Partial(this, getField(indexOf).set(this, indexOf, getValues(), i));
            }
        } else {
            throw new IllegalArgumentException("The field type must not be null");
        }
    }

    public final Partial withChronologyRetainFields(Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (withUTC == getChronology()) {
            return this;
        }
        Partial partial = new Partial(withUTC, this.iTypes, this.iValues);
        withUTC.validate(partial, this.iValues);
        return partial;
    }

    public final Partial withField(DateTimeFieldType dateTimeFieldType, int i) {
        int indexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i == getValue(indexOfSupported)) {
            return this;
        }
        return new Partial(this, getField(indexOfSupported).set(this, indexOfSupported, getValues(), i));
    }

    public final Partial withFieldAddWrapped(DurationFieldType durationFieldType, int i) {
        int indexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new Partial(this, getField(indexOfSupported).addWrapPartial(this, indexOfSupported, getValues(), i));
    }

    public final Partial withFieldAdded(DurationFieldType durationFieldType, int i) {
        int indexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new Partial(this, getField(indexOfSupported).add(this, indexOfSupported, getValues(), i));
    }

    public final Partial withPeriodAdded(ReadablePeriod readablePeriod, int i) {
        if (readablePeriod == null || i == 0) {
            return this;
        }
        int[] values = getValues();
        for (int i2 = 0; i2 < readablePeriod.size(); i2++) {
            int indexOf = indexOf(readablePeriod.getFieldType(i2));
            values = values;
            if (indexOf >= 0) {
                values = getField(indexOf).add(this, indexOf, values, FieldUtils.safeMultiply(readablePeriod.getValue(i2), i));
            }
        }
        return new Partial(this, values);
    }

    public final Partial without(DateTimeFieldType dateTimeFieldType) {
        int indexOf = indexOf(dateTimeFieldType);
        if (indexOf == -1) {
            return this;
        }
        int size = size() - 1;
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[size];
        int size2 = size() - 1;
        int[] iArr = new int[size2];
        System.arraycopy(this.iTypes, 0, dateTimeFieldTypeArr, 0, indexOf);
        int i = indexOf + 1;
        System.arraycopy(this.iTypes, i, dateTimeFieldTypeArr, indexOf, size - indexOf);
        System.arraycopy(this.iValues, 0, iArr, 0, indexOf);
        System.arraycopy(this.iValues, i, iArr, indexOf, size2 - indexOf);
        Partial partial = new Partial(this.iChronology, dateTimeFieldTypeArr, iArr);
        this.iChronology.validate(partial, iArr);
        return partial;
    }
}
