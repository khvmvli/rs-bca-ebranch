package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.field.FieldUtils;
/* loaded from: classes2-dex2jar.jar:org/joda/time/PeriodType.class */
public class PeriodType implements Serializable {
    private static PeriodType cDTime;
    private static PeriodType cDays;
    private static PeriodType cHours;
    private static PeriodType cMillis;
    private static PeriodType cMinutes;
    private static PeriodType cMonths;
    private static PeriodType cSeconds;
    private static PeriodType cStandard;
    private static PeriodType cTime;
    private static PeriodType cWeeks;
    private static PeriodType cYD;
    private static PeriodType cYDTime;
    private static PeriodType cYMD;
    private static PeriodType cYMDTime;
    private static PeriodType cYWD;
    private static PeriodType cYWDTime;
    private static PeriodType cYears;
    private static final long serialVersionUID = 2274324892792009998L;
    private final int[] iIndices;
    private final String iName;
    private final DurationFieldType[] iTypes;
    private static final Map<PeriodType, Object> cTypes = new HashMap(32);
    static int YEAR_INDEX = 0;
    static int MONTH_INDEX = 1;
    static int WEEK_INDEX = 2;
    static int DAY_INDEX = 3;
    static int HOUR_INDEX = 4;
    static int MINUTE_INDEX = 5;
    static int SECOND_INDEX = 6;
    static int MILLI_INDEX = 7;

    protected PeriodType(String str, DurationFieldType[] durationFieldTypeArr, int[] iArr) {
        this.iName = str;
        this.iTypes = durationFieldTypeArr;
        this.iIndices = iArr;
    }

    public static PeriodType dayTime() {
        PeriodType periodType = cDTime;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("DayTime", new DurationFieldType[]{DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{-1, -1, -1, 0, 1, 2, 3, 4});
            cDTime = periodType2;
        }
        return periodType2;
    }

    public static PeriodType days() {
        PeriodType periodType = cDays;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Days", new DurationFieldType[]{DurationFieldType.days()}, new int[]{-1, -1, -1, 0, -1, -1, -1, -1});
            cDays = periodType2;
        }
        return periodType2;
    }

    public static PeriodType forFields(DurationFieldType[] durationFieldTypeArr) {
        synchronized (PeriodType.class) {
            if (durationFieldTypeArr != null) {
                try {
                    if (durationFieldTypeArr.length != 0) {
                        for (DurationFieldType durationFieldType : durationFieldTypeArr) {
                            if (durationFieldType == null) {
                                throw new IllegalArgumentException("Types array must not contain null");
                            }
                        }
                        Map<PeriodType, Object> map = cTypes;
                        if (map.isEmpty()) {
                            map.put(standard(), standard());
                            map.put(yearMonthDayTime(), yearMonthDayTime());
                            map.put(yearMonthDay(), yearMonthDay());
                            map.put(yearWeekDayTime(), yearWeekDayTime());
                            map.put(yearWeekDay(), yearWeekDay());
                            map.put(yearDayTime(), yearDayTime());
                            map.put(yearDay(), yearDay());
                            map.put(dayTime(), dayTime());
                            map.put(time(), time());
                            map.put(years(), years());
                            map.put(months(), months());
                            map.put(weeks(), weeks());
                            map.put(days(), days());
                            map.put(hours(), hours());
                            map.put(minutes(), minutes());
                            map.put(seconds(), seconds());
                            map.put(millis(), millis());
                        }
                        PeriodType periodType = new PeriodType(null, durationFieldTypeArr, null);
                        Object obj = map.get(periodType);
                        if (obj instanceof PeriodType) {
                            return (PeriodType) obj;
                        } else if (obj == null) {
                            PeriodType standard = standard();
                            ArrayList arrayList = new ArrayList(Arrays.asList(durationFieldTypeArr));
                            PeriodType periodType2 = standard;
                            if (!arrayList.remove(DurationFieldType.years())) {
                                periodType2 = standard.withYearsRemoved();
                            }
                            PeriodType periodType3 = periodType2;
                            if (!arrayList.remove(DurationFieldType.months())) {
                                periodType3 = periodType2.withMonthsRemoved();
                            }
                            PeriodType periodType4 = periodType3;
                            if (!arrayList.remove(DurationFieldType.weeks())) {
                                periodType4 = periodType3.withWeeksRemoved();
                            }
                            PeriodType periodType5 = periodType4;
                            if (!arrayList.remove(DurationFieldType.days())) {
                                periodType5 = periodType4.withDaysRemoved();
                            }
                            PeriodType periodType6 = periodType5;
                            if (!arrayList.remove(DurationFieldType.hours())) {
                                periodType6 = periodType5.withHoursRemoved();
                            }
                            PeriodType periodType7 = periodType6;
                            if (!arrayList.remove(DurationFieldType.minutes())) {
                                periodType7 = periodType6.withMinutesRemoved();
                            }
                            PeriodType periodType8 = periodType7;
                            if (!arrayList.remove(DurationFieldType.seconds())) {
                                periodType8 = periodType7.withSecondsRemoved();
                            }
                            PeriodType periodType9 = periodType8;
                            if (!arrayList.remove(DurationFieldType.millis())) {
                                periodType9 = periodType8.withMillisRemoved();
                            }
                            if (arrayList.size() <= 0) {
                                PeriodType periodType10 = new PeriodType(null, periodType9.iTypes, null);
                                PeriodType periodType11 = (PeriodType) map.get(periodType10);
                                if (periodType11 != null) {
                                    map.put(periodType10, periodType11);
                                    return periodType11;
                                }
                                map.put(periodType10, periodType9);
                                return periodType9;
                            }
                            map.put(periodType, arrayList);
                            StringBuilder sb = new StringBuilder();
                            sb.append("PeriodType does not support fields: ");
                            sb.append(arrayList);
                            throw new IllegalArgumentException(sb.toString());
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("PeriodType does not support fields: ");
                            sb2.append(obj);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IllegalArgumentException("Types array must not be null or empty");
        }
    }

    public static PeriodType hours() {
        PeriodType periodType = cHours;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Hours", new DurationFieldType[]{DurationFieldType.hours()}, new int[]{-1, -1, -1, -1, 0, -1, -1, -1});
            cHours = periodType2;
        }
        return periodType2;
    }

    public static PeriodType millis() {
        PeriodType periodType = cMillis;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Millis", new DurationFieldType[]{DurationFieldType.millis()}, new int[]{-1, -1, -1, -1, -1, -1, -1, 0});
            cMillis = periodType2;
        }
        return periodType2;
    }

    public static PeriodType minutes() {
        PeriodType periodType = cMinutes;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Minutes", new DurationFieldType[]{DurationFieldType.minutes()}, new int[]{-1, -1, -1, -1, -1, 0, -1, -1});
            cMinutes = periodType2;
        }
        return periodType2;
    }

    public static PeriodType months() {
        PeriodType periodType = cMonths;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Months", new DurationFieldType[]{DurationFieldType.months()}, new int[]{-1, 0, -1, -1, -1, -1, -1, -1});
            cMonths = periodType2;
        }
        return periodType2;
    }

    public static PeriodType seconds() {
        PeriodType periodType = cSeconds;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Seconds", new DurationFieldType[]{DurationFieldType.seconds()}, new int[]{-1, -1, -1, -1, -1, -1, 0, -1});
            cSeconds = periodType2;
        }
        return periodType2;
    }

    public static PeriodType standard() {
        PeriodType periodType = cStandard;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Standard", new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.months(), DurationFieldType.weeks(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{0, 1, 2, 3, 4, 5, 6, 7});
            cStandard = periodType2;
        }
        return periodType2;
    }

    public static PeriodType time() {
        PeriodType periodType = cTime;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Time", new DurationFieldType[]{DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{-1, -1, -1, -1, 0, 1, 2, 3});
            cTime = periodType2;
        }
        return periodType2;
    }

    public static PeriodType weeks() {
        PeriodType periodType = cWeeks;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Weeks", new DurationFieldType[]{DurationFieldType.weeks()}, new int[]{-1, -1, 0, -1, -1, -1, -1, -1});
            cWeeks = periodType2;
        }
        return periodType2;
    }

    private PeriodType withFieldRemoved(int i, String str) {
        int i2 = this.iIndices[i];
        if (i2 == -1) {
            return this;
        }
        DurationFieldType[] durationFieldTypeArr = new DurationFieldType[size() - 1];
        int i3 = 0;
        while (true) {
            DurationFieldType[] durationFieldTypeArr2 = this.iTypes;
            if (i3 >= durationFieldTypeArr2.length) {
                break;
            }
            if (i3 < i2) {
                durationFieldTypeArr[i3] = durationFieldTypeArr2[i3];
            } else if (i3 > i2) {
                durationFieldTypeArr[i3 - 1] = durationFieldTypeArr2[i3];
            }
            i3++;
        }
        int[] iArr = new int[8];
        for (int i4 = 0; i4 < 8; i4++) {
            if (i4 < i) {
                iArr[i4] = this.iIndices[i4];
            } else if (i4 > i) {
                int i5 = this.iIndices[i4];
                iArr[i4] = i5 == -1 ? -1 : i5 - 1;
            } else {
                iArr[i4] = -1;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(str);
        return new PeriodType(sb.toString(), durationFieldTypeArr, iArr);
    }

    public static PeriodType yearDay() {
        PeriodType periodType = cYD;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("YearDay", new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.days()}, new int[]{0, -1, -1, 1, -1, -1, -1, -1});
            cYD = periodType2;
        }
        return periodType2;
    }

    public static PeriodType yearDayTime() {
        PeriodType periodType = cYDTime;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("YearDayTime", new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{0, -1, -1, 1, 2, 3, 4, 5});
            cYDTime = periodType2;
        }
        return periodType2;
    }

    public static PeriodType yearMonthDay() {
        PeriodType periodType = cYMD;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("YearMonthDay", new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.months(), DurationFieldType.days()}, new int[]{0, 1, -1, 2, -1, -1, -1, -1});
            cYMD = periodType2;
        }
        return periodType2;
    }

    public static PeriodType yearMonthDayTime() {
        PeriodType periodType = cYMDTime;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("YearMonthDayTime", new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.months(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{0, 1, -1, 2, 3, 4, 5, 6});
            cYMDTime = periodType2;
        }
        return periodType2;
    }

    public static PeriodType yearWeekDay() {
        PeriodType periodType = cYWD;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("YearWeekDay", new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.weeks(), DurationFieldType.days()}, new int[]{0, -1, 1, 2, -1, -1, -1, -1});
            cYWD = periodType2;
        }
        return periodType2;
    }

    public static PeriodType yearWeekDayTime() {
        PeriodType periodType = cYWDTime;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("YearWeekDayTime", new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.weeks(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{0, -1, 1, 2, 3, 4, 5, 6});
            cYWDTime = periodType2;
        }
        return periodType2;
    }

    public static PeriodType years() {
        PeriodType periodType = cYears;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Years", new DurationFieldType[]{DurationFieldType.years()}, new int[]{0, -1, -1, -1, -1, -1, -1, -1});
            cYears = periodType2;
        }
        return periodType2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean addIndexedField(ReadablePeriod readablePeriod, int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return false;
        }
        int i3 = this.iIndices[i];
        if (i3 != -1) {
            iArr[i3] = FieldUtils.safeAdd(iArr[i3], i2);
            return true;
        }
        throw new UnsupportedOperationException("Field is not supported");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodType)) {
            return false;
        }
        return Arrays.equals(this.iTypes, ((PeriodType) obj).iTypes);
    }

    public DurationFieldType getFieldType(int i) {
        return this.iTypes[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getIndexedField(ReadablePeriod readablePeriod, int i) {
        int i2 = this.iIndices[i];
        return i2 == -1 ? 0 : readablePeriod.getValue(i2);
    }

    public String getName() {
        return this.iName;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            DurationFieldType[] durationFieldTypeArr = this.iTypes;
            if (i >= durationFieldTypeArr.length) {
                return i2;
            }
            i2 += durationFieldTypeArr[i].hashCode();
            i++;
        }
    }

    public int indexOf(DurationFieldType durationFieldType) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.iTypes[i] == durationFieldType) {
                return i;
            }
        }
        return -1;
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        return indexOf(durationFieldType) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setIndexedField(ReadablePeriod readablePeriod, int i, int[] iArr, int i2) {
        int i3 = this.iIndices[i];
        if (i3 != -1) {
            iArr[i3] = i2;
            return true;
        }
        throw new UnsupportedOperationException("Field is not supported");
    }

    public int size() {
        return this.iTypes.length;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder("PeriodType[");
        sb.append(getName());
        sb.append("]");
        return sb.toString();
    }

    public PeriodType withDaysRemoved() {
        return withFieldRemoved(3, "NoDays");
    }

    public PeriodType withHoursRemoved() {
        return withFieldRemoved(4, "NoHours");
    }

    public PeriodType withMillisRemoved() {
        return withFieldRemoved(7, "NoMillis");
    }

    public PeriodType withMinutesRemoved() {
        return withFieldRemoved(5, "NoMinutes");
    }

    public PeriodType withMonthsRemoved() {
        return withFieldRemoved(1, "NoMonths");
    }

    public PeriodType withSecondsRemoved() {
        return withFieldRemoved(6, "NoSeconds");
    }

    public PeriodType withWeeksRemoved() {
        return withFieldRemoved(2, "NoWeeks");
    }

    public PeriodType withYearsRemoved() {
        return withFieldRemoved(0, "NoYears");
    }
}
