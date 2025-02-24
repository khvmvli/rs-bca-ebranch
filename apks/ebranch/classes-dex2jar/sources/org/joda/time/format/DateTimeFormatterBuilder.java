package org.joda.time.format;

import com.facebook.stetho.websocket.CloseCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;
/* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeFormatterBuilder.class */
public class DateTimeFormatterBuilder {
    private ArrayList<Object> iElementPairs = new ArrayList<>();
    private Object iFormatter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeFormatterBuilder$CharacterLiteral.class */
    public static class CharacterLiteral implements InternalPrinter, InternalParser {
        private final char iValue;

        CharacterLiteral(char c) {
            this.iValue = (char) c;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            char upperCase;
            char upperCase2;
            if (i >= charSequence.length()) {
                return i ^ -1;
            }
            char charAt = charSequence.charAt(i);
            char c = this.iValue;
            return (charAt == c || (upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(c)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i + 1 : i ^ -1;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeFormatterBuilder$Composite.class */
    public static class Composite implements InternalPrinter, InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;
        private final int iPrintedLengthEstimate;
        private final InternalPrinter[] iPrinters;

        Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (arrayList.contains(null) || arrayList.isEmpty()) {
                this.iPrinters = null;
                this.iPrintedLengthEstimate = 0;
            } else {
                int size = arrayList.size();
                this.iPrinters = new InternalPrinter[size];
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    InternalPrinter internalPrinter = (InternalPrinter) arrayList.get(i2);
                    i += internalPrinter.estimatePrintedLength();
                    this.iPrinters[i2] = internalPrinter;
                }
                this.iPrintedLengthEstimate = i;
            }
            if (arrayList2.contains(null) || arrayList2.isEmpty()) {
                this.iParsers = null;
                this.iParsedLengthEstimate = 0;
                return;
            }
            int size2 = arrayList2.size();
            this.iParsers = new InternalParser[size2];
            int i3 = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                InternalParser internalParser = (InternalParser) arrayList2.get(i4);
                i3 += internalParser.estimateParsedLength();
                this.iParsers[i4] = internalParser;
            }
            this.iParsedLengthEstimate = i3;
        }

        private void addArrayToList(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        private void decompose(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof Composite) {
                    addArrayToList(list2, ((Composite) obj).iPrinters);
                } else {
                    list2.add(obj);
                }
                Object obj2 = list.get(i + 1);
                if (obj2 instanceof Composite) {
                    addArrayToList(list3, ((Composite) obj2).iParsers);
                } else {
                    list3.add(obj2);
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iPrintedLengthEstimate;
        }

        boolean isParser() {
            return this.iParsers != null;
        }

        boolean isPrinter() {
            return this.iPrinters != null;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            InternalParser[] internalParserArr = this.iParsers;
            if (internalParserArr != null) {
                int length = internalParserArr.length;
                for (int i2 = 0; i2 < length && i >= 0; i2++) {
                    i = internalParserArr[i2].parseInto(dateTimeParserBucket, charSequence, i);
                }
                return i;
            }
            throw new UnsupportedOperationException();
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr != null) {
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                for (InternalPrinter internalPrinter : internalPrinterArr) {
                    internalPrinter.printTo(appendable, j, chronology, i, dateTimeZone, locale);
                }
                return;
            }
            throw new UnsupportedOperationException();
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr != null) {
                Locale locale2 = locale;
                if (locale == null) {
                    locale2 = Locale.getDefault();
                }
                for (InternalPrinter internalPrinter : internalPrinterArr) {
                    internalPrinter.printTo(appendable, readablePartial, locale2);
                }
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeFormatterBuilder$FixedNumber.class */
    static class FixedNumber extends PaddedNumber {
        protected FixedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z, i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
            if (r0 == '+') goto L_0x0047;
         */
        @Override // org.joda.time.format.DateTimeFormatterBuilder.NumberFormatter, org.joda.time.format.InternalParser
        /* Code decompiled incorrectly, please refer to instructions dump */
        public int parseInto(org.joda.time.format.DateTimeParserBucket r6, java.lang.CharSequence r7, int r8) {
            /*
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                int r0 = r0.parseInto(r1, r2, r3)
                r9 = r0
                r0 = r9
                if (r0 >= 0) goto L_0x0011
                r0 = r9
                return r0
            L_0x0011:
                r0 = r5
                int r0 = r0.iMaxParsedDigits
                r1 = r8
                int r0 = r0 + r1
                r10 = r0
                r0 = r9
                r11 = r0
                r0 = r9
                r1 = r10
                if (r0 == r1) goto L_0x006c
                r0 = r10
                r12 = r0
                r0 = r5
                boolean r0 = r0.iSigned
                if (r0 == 0) goto L_0x004d
                r0 = r7
                r1 = r8
                char r0 = r0.charAt(r1)
                r8 = r0
                r0 = r8
                r1 = 45
                if (r0 == r1) goto L_0x0047
                r0 = r10
                r12 = r0
                r0 = r8
                r1 = 43
                if (r0 != r1) goto L_0x004d
            L_0x0047:
                r0 = r10
                r1 = 1
                int r0 = r0 + r1
                r12 = r0
            L_0x004d:
                r0 = r9
                r1 = r12
                if (r0 <= r1) goto L_0x005b
                r0 = r12
                r1 = 1
                int r0 = r0 + r1
                r1 = -1
                r0 = r0 ^ r1
                return r0
            L_0x005b:
                r0 = r9
                r11 = r0
                r0 = r9
                r1 = r12
                if (r0 >= r1) goto L_0x006c
                r0 = r9
                r1 = -1
                r0 = r0 ^ r1
                r11 = r0
            L_0x006c:
                r0 = r11
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.FixedNumber.parseInto(org.joda.time.format.DateTimeParserBucket, java.lang.CharSequence, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeFormatterBuilder$Fraction.class */
    public static class Fraction implements InternalPrinter, InternalParser {
        private final DateTimeFieldType iFieldType;
        protected int iMaxDigits;
        protected int iMinDigits;

        protected Fraction(DateTimeFieldType dateTimeFieldType, int i, int i2) {
            this.iFieldType = dateTimeFieldType;
            int i3 = i2 > 18 ? 18 : i2;
            this.iMinDigits = i;
            this.iMaxDigits = i3;
        }

        private long[] getFractionData(long j, DateTimeField dateTimeField) {
            long j2;
            long unitMillis = dateTimeField.getDurationField().getUnitMillis();
            int i = this.iMaxDigits;
            while (true) {
                switch (i) {
                    case 1:
                        j2 = 10;
                        break;
                    case 2:
                        j2 = 100;
                        break;
                    case 3:
                        j2 = 1000;
                        break;
                    case 4:
                        j2 = 10000;
                        break;
                    case 5:
                        j2 = 100000;
                        break;
                    case 6:
                        j2 = 1000000;
                        break;
                    case 7:
                        j2 = 10000000;
                        break;
                    case 8:
                        j2 = 100000000;
                        break;
                    case 9:
                        j2 = 1000000000;
                        break;
                    case 10:
                        j2 = 10000000000L;
                        break;
                    case 11:
                        j2 = 100000000000L;
                        break;
                    case 12:
                        j2 = 1000000000000L;
                        break;
                    case 13:
                        j2 = 10000000000000L;
                        break;
                    case 14:
                        j2 = 100000000000000L;
                        break;
                    case 15:
                        j2 = 1000000000000000L;
                        break;
                    case 16:
                        j2 = 10000000000000000L;
                        break;
                    case 17:
                        j2 = 100000000000000000L;
                        break;
                    case 18:
                        j2 = 1000000000000000000L;
                        break;
                    default:
                        j2 = 1;
                        break;
                }
                if ((unitMillis * j2) / j2 == unitMillis) {
                    return new long[]{(j * j2) / unitMillis, (long) i};
                }
                i--;
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            char charAt;
            DateTimeField field = this.iFieldType.getField(dateTimeParserBucket.getChronology());
            int min = Math.min(this.iMaxDigits, charSequence.length() - i);
            long unitMillis = field.getDurationField().getUnitMillis() * 10;
            long j = 0;
            int i2 = 0;
            while (i2 < min && (charAt = charSequence.charAt(i + i2)) >= '0' && charAt <= '9') {
                i2++;
                unitMillis /= 10;
                j += ((long) (charAt - '0')) * unitMillis;
            }
            long j2 = j / 10;
            if (i2 != 0 && j2 <= 2147483647L) {
                dateTimeParserBucket.saveField(new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), MillisDurationField.INSTANCE, field.getDurationField()), (int) j2);
                return i + i2;
            }
            return i ^ -1;
        }

        protected void printTo(Appendable appendable, long j, Chronology chronology) throws IOException {
            DateTimeField field = this.iFieldType.getField(chronology);
            int i = this.iMinDigits;
            try {
                long remainder = field.remainder(j);
                if (remainder == 0) {
                    while (true) {
                        i--;
                        if (i >= 0) {
                            appendable.append('0');
                        } else {
                            return;
                        }
                    }
                } else {
                    long[] fractionData = getFractionData(remainder, field);
                    long j2 = fractionData[0];
                    int i2 = (int) fractionData[1];
                    String num = (2147483647L & j2) == j2 ? Integer.toString((int) j2) : Long.toString(j2);
                    int length = num.length();
                    while (length < i2) {
                        appendable.append('0');
                        i--;
                        i2--;
                    }
                    if (i < i2) {
                        int i3 = i2;
                        int i4 = length;
                        while (i < i3 && i4 > 1 && num.charAt(i4 - 1) == '0') {
                            i3--;
                            i4--;
                        }
                        if (i4 < num.length()) {
                            for (int i5 = 0; i5 < i4; i5++) {
                                appendable.append(num.charAt(i5));
                            }
                            return;
                        }
                    }
                    appendable.append(num);
                }
            } catch (RuntimeException e) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, i);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            printTo(appendable, j, chronology);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            printTo(appendable, readablePartial.getChronology().set(readablePartial, 0), readablePartial.getChronology());
        }
    }

    /* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeFormatterBuilder$MatchingParser.class */
    static class MatchingParser implements InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;

        MatchingParser(InternalParser[] internalParserArr) {
            this.iParsers = internalParserArr;
            int length = internalParserArr.length;
            int i = 0;
            while (true) {
                int i2 = length - 1;
                if (i2 >= 0) {
                    InternalParser internalParser = internalParserArr[i2];
                    length = i2;
                    if (internalParser != null) {
                        int estimateParsedLength = internalParser.estimateParsedLength();
                        length = i2;
                        if (estimateParsedLength > i) {
                            i = estimateParsedLength;
                            length = i2;
                        }
                    }
                } else {
                    this.iParsedLengthEstimate = i;
                    return;
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a6, code lost:
            return r0;
         */
        @Override // org.joda.time.format.InternalParser
        /* Code decompiled incorrectly, please refer to instructions dump */
        public int parseInto(org.joda.time.format.DateTimeParserBucket r6, java.lang.CharSequence r7, int r8) {
            /*
            // Method dump skipped, instructions count: 283
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.MatchingParser.parseInto(org.joda.time.format.DateTimeParserBucket, java.lang.CharSequence, int):int");
        }
    }

    /* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeFormatterBuilder$NumberFormatter.class */
    static abstract class NumberFormatter implements InternalPrinter, InternalParser {
        protected final DateTimeFieldType iFieldType;
        protected final int iMaxParsedDigits;
        protected final boolean iSigned;

        NumberFormatter(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.iFieldType = dateTimeFieldType;
            this.iMaxParsedDigits = i;
            this.iSigned = z;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            boolean z;
            boolean z2;
            int i2;
            int i3;
            int min = Math.min(this.iMaxParsedDigits, charSequence.length() - i);
            boolean z3 = false;
            boolean z4 = false;
            int i4 = 0;
            while (true) {
                z = z3;
                z2 = z4;
                if (i4 >= min) {
                    break;
                }
                int i5 = i + i4;
                char charAt = charSequence.charAt(i5);
                if (i4 == 0 && ((charAt == '-' || charAt == '+') && this.iSigned)) {
                    z3 = charAt == '-';
                    z4 = charAt == '+';
                    int i6 = i4 + 1;
                    z = z3;
                    z2 = z4;
                    if (i6 >= min) {
                        break;
                    }
                    char charAt2 = charSequence.charAt(i5 + 1);
                    z = z3;
                    z2 = z4;
                    if (charAt2 < '0') {
                        break;
                    }
                    z = z3;
                    z2 = z4;
                    if (charAt2 > '9') {
                        break;
                    }
                    min = Math.min(min + 1, charSequence.length() - i);
                    i4 = i6;
                } else {
                    z = z3;
                    z2 = z4;
                    if (charAt < '0') {
                        break;
                    } else if (charAt > '9') {
                        z = z3;
                        z2 = z4;
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            if (i4 == 0) {
                return i ^ -1;
            }
            if (i4 < 9) {
                int i7 = (z || z2) ? i + 1 : i;
                int i8 = i7 + 1;
                try {
                    i3 = charSequence.charAt(i7) - '0';
                    int i9 = i + i4;
                    while (i8 < i9) {
                        char charAt3 = charSequence.charAt(i8);
                        i8++;
                        i3 = (((i3 << 3) + (i3 << 1)) + charAt3) - 48;
                    }
                    if (z) {
                        i3 = -i3;
                    }
                    i2 = i9;
                } catch (StringIndexOutOfBoundsException e) {
                    return i ^ -1;
                }
            } else if (z2) {
                i2 = i + i4;
                i3 = Integer.parseInt(charSequence.subSequence(i + 1, i2).toString());
            } else {
                i2 = i + i4;
                i3 = Integer.parseInt(charSequence.subSequence(i, i2).toString());
            }
            dateTimeParserBucket.saveField(this.iFieldType, i3);
            return i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeFormatterBuilder$PaddedNumber.class */
    public static class PaddedNumber extends NumberFormatter {
        protected final int iMinPrintedDigits;

        protected PaddedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z, int i2) {
            super(dateTimeFieldType, i, z);
            this.iMinPrintedDigits = i2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendPaddedInteger(appendable, this.iFieldType.getField(chronology).get(j), this.iMinPrintedDigits);
            } catch (RuntimeException e) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendPaddedInteger(appendable, readablePartial.get(this.iFieldType), this.iMinPrintedDigits);
                    return;
                } catch (RuntimeException e) {
                }
            }
            DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeFormatterBuilder$StringLiteral.class */
    public static class StringLiteral implements InternalPrinter, InternalParser {
        private final String iValue;

        StringLiteral(String str) {
            this.iValue = str;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            return DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i, this.iValue) ? i + this.iValue.length() : i ^ -1;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeFormatterBuilder$TextField.class */
    public static class TextField implements InternalPrinter, InternalParser {
        private static Map<Locale, Map<DateTimeFieldType, Object[]>> cParseCache = new ConcurrentHashMap();
        private final DateTimeFieldType iFieldType;
        private final boolean iShort;

        TextField(DateTimeFieldType dateTimeFieldType, boolean z) {
            this.iFieldType = dateTimeFieldType;
            this.iShort = z;
        }

        private String print(long j, Chronology chronology, Locale locale) {
            DateTimeField field = this.iFieldType.getField(chronology);
            return this.iShort ? field.getAsShortText(j, locale) : field.getAsText(j, locale);
        }

        private String print(ReadablePartial readablePartial, Locale locale) {
            if (!readablePartial.isSupported(this.iFieldType)) {
                return "�";
            }
            DateTimeField field = this.iFieldType.getField(readablePartial.getChronology());
            return this.iShort ? field.getAsShortText(readablePartial, locale) : field.getAsText(readablePartial, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iShort ? 6 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int i2;
            Map map;
            Locale locale = dateTimeParserBucket.getLocale();
            Map<DateTimeFieldType, Object[]> map2 = cParseCache.get(locale);
            Map<DateTimeFieldType, Object[]> map3 = map2;
            if (map2 == null) {
                map3 = new ConcurrentHashMap<>();
                cParseCache.put(locale, map3);
            }
            Object[] objArr = map3.get(this.iFieldType);
            if (objArr == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(32);
                MutableDateTime.Property property = new MutableDateTime(0, DateTimeZone.UTC).property(this.iFieldType);
                int minimumValueOverall = property.getMinimumValueOverall();
                int maximumValueOverall = property.getMaximumValueOverall();
                if (maximumValueOverall - minimumValueOverall > 32) {
                    return i ^ -1;
                }
                int maximumTextLength = property.getMaximumTextLength(locale);
                while (minimumValueOverall <= maximumValueOverall) {
                    property.set(minimumValueOverall);
                    concurrentHashMap.put(property.getAsShortText(locale), Boolean.TRUE);
                    concurrentHashMap.put(property.getAsShortText(locale).toLowerCase(locale), Boolean.TRUE);
                    concurrentHashMap.put(property.getAsShortText(locale).toUpperCase(locale), Boolean.TRUE);
                    concurrentHashMap.put(property.getAsText(locale), Boolean.TRUE);
                    concurrentHashMap.put(property.getAsText(locale).toLowerCase(locale), Boolean.TRUE);
                    concurrentHashMap.put(property.getAsText(locale).toUpperCase(locale), Boolean.TRUE);
                    minimumValueOverall++;
                }
                i2 = maximumTextLength;
                if ("en".equals(locale.getLanguage())) {
                    i2 = maximumTextLength;
                    if (this.iFieldType == DateTimeFieldType.era()) {
                        concurrentHashMap.put("BCE", Boolean.TRUE);
                        concurrentHashMap.put("bce", Boolean.TRUE);
                        concurrentHashMap.put("CE", Boolean.TRUE);
                        concurrentHashMap.put("ce", Boolean.TRUE);
                        i2 = 3;
                    }
                }
                map3.put(this.iFieldType, new Object[]{concurrentHashMap, Integer.valueOf(i2)});
                map = concurrentHashMap;
            } else {
                map = (Map) objArr[0];
                i2 = ((Integer) objArr[1]).intValue();
            }
            for (int min = Math.min(charSequence.length(), i2 + i); min > i; min--) {
                String obj = charSequence.subSequence(i, min).toString();
                if (map.containsKey(obj)) {
                    dateTimeParserBucket.saveField(this.iFieldType, obj, locale);
                    return min;
                }
            }
            return i ^ -1;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                appendable.append(print(j, chronology, locale));
            } catch (RuntimeException e) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            try {
                appendable.append(print(readablePartial, locale));
            } catch (RuntimeException e) {
                appendable.append((char) 65533);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeFormatterBuilder$TimeZoneId.class */
    public enum TimeZoneId implements InternalPrinter, InternalParser {
        INSTANCE;
        
        private static final List<String> ALL_IDS;
        private static final List<String> BASE_GROUPED_IDS = new ArrayList();
        private static final Map<String, List<String>> GROUPED_IDS = new HashMap();
        static final int MAX_LENGTH;
        static final int MAX_PREFIX_LENGTH;

        static {
            ArrayList<String> arrayList = new ArrayList(DateTimeZone.getAvailableIDs());
            ALL_IDS = arrayList;
            Collections.sort(arrayList);
            int i = 0;
            int i2 = 0;
            for (String str : arrayList) {
                int indexOf = str.indexOf(47);
                if (indexOf >= 0) {
                    int i3 = indexOf;
                    if (indexOf < str.length()) {
                        i3 = indexOf + 1;
                    }
                    i2 = Math.max(i2, i3);
                    String substring = str.substring(0, i3 + 1);
                    String substring2 = str.substring(i3);
                    Map<String, List<String>> map = GROUPED_IDS;
                    if (!map.containsKey(substring)) {
                        map.put(substring, new ArrayList());
                    }
                    map.get(substring).add(substring2);
                } else {
                    BASE_GROUPED_IDS.add(str);
                }
                i = Math.max(i, str.length());
            }
            MAX_LENGTH = i;
            MAX_PREFIX_LENGTH = i2;
        }

        @Override // org.joda.time.format.InternalParser
        public final int estimateParsedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalPrinter
        public final int estimatePrintedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalParser
        public final int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            String str;
            int i2;
            String str2;
            List<String> list = BASE_GROUPED_IDS;
            int length = charSequence.length();
            int min = Math.min(length, MAX_PREFIX_LENGTH + i);
            int i3 = i;
            while (true) {
                if (i3 >= min) {
                    str = "";
                    i2 = i;
                    break;
                } else if (charSequence.charAt(i3) == '/') {
                    int i4 = i3 + 1;
                    str = charSequence.subSequence(i, i4).toString();
                    i2 = str.length() + i;
                    if (i3 < length) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(charSequence.charAt(i4));
                        str2 = sb.toString();
                    } else {
                        str2 = str;
                    }
                    List<String> list2 = GROUPED_IDS.get(str2);
                    list = list2;
                    if (list2 == null) {
                        return i ^ -1;
                    }
                } else {
                    i3++;
                }
            }
            String str3 = null;
            for (int i5 = 0; i5 < list.size(); i5++) {
                String str4 = list.get(i5);
                str3 = str3;
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, i2, str4)) {
                    if (str3 != null) {
                        str3 = str3;
                        if (str4.length() <= str3.length()) {
                        }
                    }
                    str3 = str4;
                }
            }
            if (str3 == null) {
                return i ^ -1;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(str3);
            dateTimeParserBucket.setZone(DateTimeZone.forID(sb2.toString()));
            return i2 + str3.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public final void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(dateTimeZone != null ? dateTimeZone.getID() : "");
        }

        @Override // org.joda.time.format.InternalPrinter
        public final void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeFormatterBuilder$TimeZoneName.class */
    public static class TimeZoneName implements InternalPrinter, InternalParser {
        static final int LONG_NAME = 0;
        static final int SHORT_NAME = 1;
        private final Map<String, DateTimeZone> iParseLookup;
        private final int iType;

        TimeZoneName(int i, Map<String, DateTimeZone> map) {
            this.iType = i;
            this.iParseLookup = map;
        }

        private String print(long j, DateTimeZone dateTimeZone, Locale locale) {
            if (dateTimeZone == null) {
                return "";
            }
            int i = this.iType;
            return i != 0 ? i != 1 ? "" : dateTimeZone.getShortName(j, locale) : dateTimeZone.getName(j, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            Map<String, DateTimeZone> map = this.iParseLookup;
            Map<String, DateTimeZone> map2 = map;
            if (map == null) {
                map2 = DateTimeUtils.getDefaultTimeZoneNames();
            }
            String str = null;
            for (String str2 : map2.keySet()) {
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, i, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return i ^ -1;
            }
            dateTimeParserBucket.setZone(map2.get(str));
            return i + str.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(print(j - ((long) i), dateTimeZone, locale));
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeFormatterBuilder$TimeZoneOffset.class */
    public static class TimeZoneOffset implements InternalPrinter, InternalParser {
        private final int iMaxFields;
        private final int iMinFields;
        private final boolean iShowSeparators;
        private final String iZeroOffsetParseText;
        private final String iZeroOffsetPrintText;

        TimeZoneOffset(String str, String str2, boolean z, int i, int i2) {
            this.iZeroOffsetPrintText = str;
            this.iZeroOffsetParseText = str2;
            this.iShowSeparators = z;
            if (i <= 0 || i2 < i) {
                throw new IllegalArgumentException();
            }
            int i3 = i;
            if (i > 4) {
                i3 = 4;
                i2 = 4;
            }
            this.iMinFields = i3;
            this.iMaxFields = i2;
        }

        private int digitCount(CharSequence charSequence, int i, int i2) {
            int i3 = 0;
            for (int min = Math.min(charSequence.length() - i, i2); min > 0 && (r0 = charSequence.charAt(i + i3)) >= '0' && r0 <= '9'; min--) {
                i3++;
            }
            return i3;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            int i = this.iMinFields;
            int i2 = (i + 1) << 1;
            int i3 = i2;
            if (this.iShowSeparators) {
                i3 = i2 + (i - 1);
            }
            String str = this.iZeroOffsetPrintText;
            int i4 = i3;
            if (str != null) {
                i4 = i3;
                if (str.length() > i3) {
                    i4 = this.iZeroOffsetPrintText.length();
                }
            }
            return i4;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            boolean z;
            int parseTwoDigits;
            int i2;
            int i3;
            int i4;
            int parseTwoDigits2;
            int parseTwoDigits3;
            char charAt;
            int length = charSequence.length() - i;
            String str = this.iZeroOffsetParseText;
            boolean z2 = false;
            if (str != null) {
                if (str.length() == 0) {
                    if (length <= 0 || !((charAt = charSequence.charAt(i)) == '-' || charAt == '+')) {
                        dateTimeParserBucket.setOffset((Integer) 0);
                        return i;
                    }
                } else if (DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i, this.iZeroOffsetParseText)) {
                    dateTimeParserBucket.setOffset((Integer) 0);
                    return i + this.iZeroOffsetParseText.length();
                }
            }
            if (length <= 1) {
                return i ^ -1;
            }
            char charAt2 = charSequence.charAt(i);
            if (charAt2 == '-') {
                z = true;
            } else if (charAt2 != '+') {
                return i ^ -1;
            } else {
                z = false;
            }
            int i5 = i + 1;
            if (digitCount(charSequence, i5, 2) >= 2 && (parseTwoDigits = FormatUtils.parseTwoDigits(charSequence, i5)) <= 23) {
                int i6 = parseTwoDigits * 3600000;
                int i7 = (length - 1) - 2;
                int i8 = i5 + 2;
                if (i7 <= 0) {
                    i2 = i6;
                    i3 = i8;
                } else {
                    char charAt3 = charSequence.charAt(i8);
                    if (charAt3 == ':') {
                        i4 = i7 - 1;
                        i3 = i8 + 1;
                        z2 = true;
                    } else {
                        i2 = i6;
                        i3 = i8;
                        if (charAt3 >= '0') {
                            i2 = i6;
                            i3 = i8;
                            if (charAt3 <= '9') {
                                i3 = i8;
                                i4 = i7;
                            }
                        }
                    }
                    int digitCount = digitCount(charSequence, i3, 2);
                    if (digitCount != 0 || z2) {
                        if (digitCount >= 2 && (parseTwoDigits2 = FormatUtils.parseTwoDigits(charSequence, i3)) <= 59) {
                            int i9 = i6 + (parseTwoDigits2 * 60000);
                            int i10 = i4 - 2;
                            int i11 = i3 + 2;
                            if (i10 <= 0) {
                                i2 = i9;
                                i3 = i11;
                            } else {
                                int i12 = i10;
                                i3 = i11;
                                if (z2) {
                                    if (charSequence.charAt(i11) != ':') {
                                        i2 = i9;
                                        i3 = i11;
                                    } else {
                                        i12 = i10 - 1;
                                        i3 = i11 + 1;
                                    }
                                }
                                int digitCount2 = digitCount(charSequence, i3, 2);
                                if (digitCount2 != 0 || z2) {
                                    if (digitCount2 >= 2 && (parseTwoDigits3 = FormatUtils.parseTwoDigits(charSequence, i3)) <= 59) {
                                        int i13 = i9 + (parseTwoDigits3 * CloseCodes.NORMAL_CLOSURE);
                                        int i14 = i3 + 2;
                                        if (i12 - 2 <= 0) {
                                            i2 = i13;
                                            i3 = i14;
                                        } else {
                                            i3 = i14;
                                            if (z2) {
                                                if (charSequence.charAt(i14) == '.' || charSequence.charAt(i14) == ',') {
                                                    i3 = i14 + 1;
                                                } else {
                                                    i2 = i13;
                                                    i3 = i14;
                                                }
                                            }
                                            int digitCount3 = digitCount(charSequence, i3, 3);
                                            if (digitCount3 == 0 && !z2) {
                                                i2 = i13;
                                            } else if (digitCount3 <= 0) {
                                                return i3 ^ -1;
                                            } else {
                                                int i15 = i3 + 1;
                                                int charAt4 = i13 + ((charSequence.charAt(i3) - '0') * 100);
                                                if (digitCount3 > 1) {
                                                    int i16 = i15 + 1;
                                                    int charAt5 = charAt4 + ((charSequence.charAt(i15) - '0') * 10);
                                                    i2 = charAt5;
                                                    i3 = i16;
                                                    if (digitCount3 > 2) {
                                                        i2 = charAt5 + (charSequence.charAt(i16) - '0');
                                                        i3 = i16 + 1;
                                                    }
                                                } else {
                                                    i3 = i15;
                                                    i2 = charAt4;
                                                }
                                            }
                                        }
                                    }
                                    return i3 ^ -1;
                                }
                                i2 = i9;
                            }
                        }
                        return i3 ^ -1;
                    }
                    i2 = i6;
                }
                int i17 = i2;
                if (z) {
                    i17 = -i2;
                }
                dateTimeParserBucket.setOffset(Integer.valueOf(i17));
                return i3;
            }
            return i5 ^ -1;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            String str;
            if (dateTimeZone != null) {
                if (i != 0 || (str = this.iZeroOffsetPrintText) == null) {
                    if (i >= 0) {
                        appendable.append('+');
                    } else {
                        appendable.append('-');
                        i = -i;
                    }
                    int i2 = i / 3600000;
                    FormatUtils.appendPaddedInteger(appendable, i2, 2);
                    if (this.iMaxFields != 1) {
                        int i3 = i - (i2 * 3600000);
                        if (i3 != 0 || this.iMinFields > 1) {
                            int i4 = i3 / 60000;
                            if (this.iShowSeparators) {
                                appendable.append(':');
                            }
                            FormatUtils.appendPaddedInteger(appendable, i4, 2);
                            if (this.iMaxFields != 2) {
                                int i5 = i3 - (i4 * 60000);
                                if (i5 != 0 || this.iMinFields > 2) {
                                    int i6 = i5 / CloseCodes.NORMAL_CLOSURE;
                                    if (this.iShowSeparators) {
                                        appendable.append(':');
                                    }
                                    FormatUtils.appendPaddedInteger(appendable, i6, 2);
                                    if (this.iMaxFields != 3) {
                                        int i7 = i5 - (i6 * CloseCodes.NORMAL_CLOSURE);
                                        if (i7 != 0 || this.iMinFields > 3) {
                                            if (this.iShowSeparators) {
                                                appendable.append('.');
                                            }
                                            FormatUtils.appendPaddedInteger(appendable, i7, 3);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                appendable.append(str);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeFormatterBuilder$TwoDigitYear.class */
    public static class TwoDigitYear implements InternalPrinter, InternalParser {
        private final boolean iLenientParse;
        private final int iPivot;
        private final DateTimeFieldType iType;

        TwoDigitYear(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.iType = dateTimeFieldType;
            this.iPivot = i;
            this.iLenientParse = z;
        }

        private int getTwoDigitYear(long j, Chronology chronology) {
            try {
                int i = this.iType.getField(chronology).get(j);
                int i2 = i;
                if (i < 0) {
                    i2 = -i;
                }
                return i2 % 100;
            } catch (RuntimeException e) {
                return -1;
            }
        }

        private int getTwoDigitYear(ReadablePartial readablePartial) {
            if (!readablePartial.isSupported(this.iType)) {
                return -1;
            }
            try {
                int i = readablePartial.get(this.iType);
                int i2 = i;
                if (i < 0) {
                    i2 = -i;
                }
                return i2 % 100;
            } catch (RuntimeException e) {
                return -1;
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iLenientParse ? 4 : 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 2;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int i4;
            int length = charSequence.length() - i;
            int i5 = 0;
            if (!this.iLenientParse) {
                i2 = i;
                if (Math.min(2, length) < 2) {
                    return i ^ -1;
                }
            } else {
                int i6 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i6 < length) {
                    char charAt = charSequence.charAt(i + i6);
                    if (i6 != 0 || (charAt != '-' && charAt != '+')) {
                        if (charAt < '0' || charAt > '9') {
                            break;
                        }
                        i6++;
                    } else {
                        z = charAt == '-';
                        if (z) {
                            i6++;
                        } else {
                            i++;
                            length--;
                        }
                        z2 = true;
                    }
                }
                if (i6 == 0) {
                    return i ^ -1;
                }
                if (z2 || i6 != 2) {
                    if (i6 >= 9) {
                        i3 = i6 + i;
                        i4 = Integer.parseInt(charSequence.subSequence(i, i3).toString());
                    } else {
                        int i7 = z ? i + 1 : i;
                        int i8 = i7 + 1;
                        try {
                            i4 = charSequence.charAt(i7) - '0';
                            int i9 = i6 + i;
                            while (i8 < i9) {
                                char charAt2 = charSequence.charAt(i8);
                                i8++;
                                i4 = (((i4 << 3) + (i4 << 1)) + charAt2) - 48;
                            }
                            if (z) {
                                i4 = -i4;
                                i3 = i9;
                            } else {
                                i3 = i9;
                            }
                        } catch (StringIndexOutOfBoundsException e) {
                            return i ^ -1;
                        }
                    }
                    dateTimeParserBucket.saveField(this.iType, i4);
                    return i3;
                }
                i2 = i;
            }
            char charAt3 = charSequence.charAt(i2);
            if (charAt3 < '0' || charAt3 > '9') {
                return i2 ^ -1;
            }
            int i10 = charAt3 - '0';
            char charAt4 = charSequence.charAt(i2 + 1);
            if (charAt4 < '0' || charAt4 > '9') {
                return i2 ^ -1;
            }
            int i11 = (((i10 << 3) + (i10 << 1)) + charAt4) - 48;
            int i12 = this.iPivot;
            if (dateTimeParserBucket.getPivotYear() != null) {
                i12 = dateTimeParserBucket.getPivotYear().intValue();
            }
            int i13 = i12 - 50;
            int i14 = i13 >= 0 ? i13 % 100 : ((i13 + 1) % 100) + 99;
            if (i11 < i14) {
                i5 = 100;
            }
            dateTimeParserBucket.saveField(this.iType, i11 + ((i13 + i5) - i14));
            return i2 + 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(j, chronology);
            if (twoDigitYear < 0) {
                appendable.append((char) 65533);
                appendable.append((char) 65533);
                return;
            }
            FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(readablePartial);
            if (twoDigitYear < 0) {
                appendable.append((char) 65533);
                appendable.append((char) 65533);
                return;
            }
            FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeFormatterBuilder$UnpaddedNumber.class */
    public static class UnpaddedNumber extends NumberFormatter {
        protected UnpaddedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z);
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendUnpaddedInteger(appendable, this.iFieldType.getField(chronology).get(j));
            } catch (RuntimeException e) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendUnpaddedInteger(appendable, readablePartial.get(this.iFieldType));
                } catch (RuntimeException e) {
                    appendable.append((char) 65533);
                }
            } else {
                appendable.append((char) 65533);
            }
        }
    }

    private DateTimeFormatterBuilder append0(Object obj) {
        this.iFormatter = null;
        this.iElementPairs.add(obj);
        this.iElementPairs.add(obj);
        return this;
    }

    private DateTimeFormatterBuilder append0(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iFormatter = null;
        this.iElementPairs.add(internalPrinter);
        this.iElementPairs.add(internalParser);
        return this;
    }

    static void appendUnknownString(Appendable appendable, int i) throws IOException {
        while (true) {
            i--;
            if (i >= 0) {
                appendable.append((char) 65533);
            } else {
                return;
            }
        }
    }

    private void checkParser(DateTimeParser dateTimeParser) {
        if (dateTimeParser == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private void checkPrinter(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter == null) {
            throw new IllegalArgumentException("No printer supplied");
        }
    }

    static boolean csStartsWith(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    static boolean csStartsWithIgnoreCase(CharSequence charSequence, int i, String str) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = charSequence.charAt(i + i2);
            char charAt2 = str.charAt(i2);
            if (!(charAt == charAt2 || (upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r0 == null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private java.lang.Object getFormatter() {
        /*
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.iFormatter
            r5 = r0
            r0 = r5
            r6 = r0
            r0 = r5
            if (r0 != 0) goto L_0x005d
            r0 = r5
            r6 = r0
            r0 = r4
            java.util.ArrayList<java.lang.Object> r0 = r0.iElementPairs
            int r0 = r0.size()
            r1 = 2
            if (r0 != r1) goto L_0x0044
            r0 = r4
            java.util.ArrayList<java.lang.Object> r0 = r0.iElementPairs
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r4
            java.util.ArrayList<java.lang.Object> r0 = r0.iElementPairs
            r1 = 1
            java.lang.Object r0 = r0.get(r1)
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L_0x0041
            r0 = r7
            r1 = r8
            if (r0 == r1) goto L_0x003c
            r0 = r5
            r6 = r0
            r0 = r8
            if (r0 != 0) goto L_0x0044
        L_0x003c:
            r0 = r7
            r6 = r0
            goto L_0x0044
        L_0x0041:
            r0 = r8
            r6 = r0
        L_0x0044:
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L_0x0056
            org.joda.time.format.DateTimeFormatterBuilder$Composite r0 = new org.joda.time.format.DateTimeFormatterBuilder$Composite
            r1 = r0
            r2 = r4
            java.util.ArrayList<java.lang.Object> r2 = r2.iElementPairs
            r1.<init>(r2)
            r5 = r0
        L_0x0056:
            r0 = r4
            r1 = r5
            r0.iFormatter = r1
            r0 = r5
            r6 = r0
        L_0x005d:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.getFormatter():java.lang.Object");
    }

    private boolean isFormatter(Object obj) {
        return isPrinter(obj) || isParser(obj);
    }

    private boolean isParser(Object obj) {
        if (!(obj instanceof InternalParser)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isParser();
        }
        return true;
    }

    private boolean isPrinter(Object obj) {
        if (!(obj instanceof InternalPrinter)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isPrinter();
        }
        return true;
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return append0(dateTimeFormatter.getPrinter0(), dateTimeFormatter.getParser0());
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    public DateTimeFormatterBuilder append(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, DateTimeParserInternalParser.of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter) {
        checkPrinter(dateTimePrinter);
        return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), null);
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        checkPrinter(dateTimePrinter);
        checkParser(dateTimeParser);
        return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), DateTimeParserInternalParser.of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser[] dateTimeParserArr) {
        if (dateTimePrinter != null) {
            checkPrinter(dateTimePrinter);
        }
        if (dateTimeParserArr != null) {
            int length = dateTimeParserArr.length;
            int i = 0;
            if (length != 1) {
                InternalParser[] internalParserArr = new InternalParser[length];
                while (i < length - 1) {
                    InternalParser of = DateTimeParserInternalParser.of(dateTimeParserArr[i]);
                    internalParserArr[i] = of;
                    if (of != null) {
                        i++;
                    } else {
                        throw new IllegalArgumentException("Incomplete parser array");
                    }
                }
                internalParserArr[i] = DateTimeParserInternalParser.of(dateTimeParserArr[i]);
                return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), new MatchingParser(internalParserArr));
            } else if (dateTimeParserArr[0] != null) {
                return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), DateTimeParserInternalParser.of(dateTimeParserArr[0]));
            } else {
                throw new IllegalArgumentException("No parser supplied");
            }
        } else {
            throw new IllegalArgumentException("No parsers supplied");
        }
    }

    public DateTimeFormatterBuilder appendCenturyOfEra(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.centuryOfEra(), i, i2);
    }

    public DateTimeFormatterBuilder appendClockhourOfDay(int i) {
        return appendDecimal(DateTimeFieldType.clockhourOfDay(), i, 2);
    }

    public DateTimeFormatterBuilder appendClockhourOfHalfday(int i) {
        return appendDecimal(DateTimeFieldType.clockhourOfHalfday(), i, 2);
    }

    public DateTimeFormatterBuilder appendDayOfMonth(int i) {
        return appendDecimal(DateTimeFieldType.dayOfMonth(), i, 2);
    }

    public DateTimeFormatterBuilder appendDayOfWeek(int i) {
        return appendDecimal(DateTimeFieldType.dayOfWeek(), i, 1);
    }

    public DateTimeFormatterBuilder appendDayOfWeekShortText() {
        return appendShortText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfWeekText() {
        return appendText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfYear(int i) {
        return appendDecimal(DateTimeFieldType.dayOfYear(), i, 3);
    }

    public DateTimeFormatterBuilder appendDecimal(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            int i3 = i2;
            if (i2 < i) {
                i3 = i;
            }
            if (i >= 0 && i3 > 0) {
                return i <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i3, false)) : append0(new PaddedNumber(dateTimeFieldType, i3, false, i));
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendEraText() {
        return appendText(DateTimeFieldType.era());
    }

    public DateTimeFormatterBuilder appendFixedDecimal(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        } else if (i > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i, false));
        } else {
            StringBuilder sb = new StringBuilder("Illegal number of digits: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public DateTimeFormatterBuilder appendFixedSignedDecimal(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        } else if (i > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i, true));
        } else {
            StringBuilder sb = new StringBuilder("Illegal number of digits: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public DateTimeFormatterBuilder appendFraction(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            int i3 = i2;
            if (i2 < i) {
                i3 = i;
            }
            if (i >= 0 && i3 > 0) {
                return append0(new Fraction(dateTimeFieldType, i, i3));
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendFractionOfDay(int i, int i2) {
        return appendFraction(DateTimeFieldType.dayOfYear(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfHour(int i, int i2) {
        return appendFraction(DateTimeFieldType.hourOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfMinute(int i, int i2) {
        return appendFraction(DateTimeFieldType.minuteOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfSecond(int i, int i2) {
        return appendFraction(DateTimeFieldType.secondOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendHalfdayOfDayText() {
        return appendText(DateTimeFieldType.halfdayOfDay());
    }

    public DateTimeFormatterBuilder appendHourOfDay(int i) {
        return appendDecimal(DateTimeFieldType.hourOfDay(), i, 2);
    }

    public DateTimeFormatterBuilder appendHourOfHalfday(int i) {
        return appendDecimal(DateTimeFieldType.hourOfHalfday(), i, 2);
    }

    public DateTimeFormatterBuilder appendLiteral(char c) {
        return append0(new CharacterLiteral(c));
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        if (str != null) {
            int length = str.length();
            return length != 0 ? length != 1 ? append0(new StringLiteral(str)) : append0(new CharacterLiteral(str.charAt(0))) : this;
        }
        throw new IllegalArgumentException("Literal must not be null");
    }

    public DateTimeFormatterBuilder appendMillisOfDay(int i) {
        return appendDecimal(DateTimeFieldType.millisOfDay(), i, 8);
    }

    public DateTimeFormatterBuilder appendMillisOfSecond(int i) {
        return appendDecimal(DateTimeFieldType.millisOfSecond(), i, 3);
    }

    public DateTimeFormatterBuilder appendMinuteOfDay(int i) {
        return appendDecimal(DateTimeFieldType.minuteOfDay(), i, 4);
    }

    public DateTimeFormatterBuilder appendMinuteOfHour(int i) {
        return appendDecimal(DateTimeFieldType.minuteOfHour(), i, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYear(int i) {
        return appendDecimal(DateTimeFieldType.monthOfYear(), i, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYearShortText() {
        return appendShortText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendMonthOfYearText() {
        return appendText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendOptional(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, new MatchingParser(new InternalParser[]{DateTimeParserInternalParser.of(dateTimeParser), null}));
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        DateTimeFormat.appendPatternTo(this, str);
        return this;
    }

    public DateTimeFormatterBuilder appendSecondOfDay(int i) {
        return appendDecimal(DateTimeFieldType.secondOfDay(), i, 5);
    }

    public DateTimeFormatterBuilder appendSecondOfMinute(int i) {
        return appendDecimal(DateTimeFieldType.secondOfMinute(), i, 2);
    }

    public DateTimeFormatterBuilder appendShortText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, true));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendSignedDecimal(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            int i3 = i2;
            if (i2 < i) {
                i3 = i;
            }
            if (i >= 0 && i3 > 0) {
                return i <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i3, true)) : append0(new PaddedNumber(dateTimeFieldType, i3, true, i));
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, false));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendTimeZoneId() {
        TimeZoneId timeZoneId = TimeZoneId.INSTANCE;
        return append0(timeZoneId, timeZoneId);
    }

    public DateTimeFormatterBuilder appendTimeZoneName() {
        return append0(new TimeZoneName(0, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(0, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, String str2, boolean z, int i, int i2) {
        return append0(new TimeZoneOffset(str, str2, z, i, i2));
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, boolean z, int i, int i2) {
        return append0(new TimeZoneOffset(str, str, z, i, i2));
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName() {
        return append0(new TimeZoneName(1, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(1, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i) {
        return appendTwoDigitWeekyear(i, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i, boolean z) {
        return append0(new TwoDigitYear(DateTimeFieldType.weekyear(), i, z));
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i) {
        return appendTwoDigitYear(i, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i, boolean z) {
        return append0(new TwoDigitYear(DateTimeFieldType.year(), i, z));
    }

    public DateTimeFormatterBuilder appendWeekOfWeekyear(int i) {
        return appendDecimal(DateTimeFieldType.weekOfWeekyear(), i, 2);
    }

    public DateTimeFormatterBuilder appendWeekyear(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.weekyear(), i, i2);
    }

    public DateTimeFormatterBuilder appendYear(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.year(), i, i2);
    }

    public DateTimeFormatterBuilder appendYearOfCentury(int i, int i2) {
        return appendDecimal(DateTimeFieldType.yearOfCentury(), i, i2);
    }

    public DateTimeFormatterBuilder appendYearOfEra(int i, int i2) {
        return appendDecimal(DateTimeFieldType.yearOfEra(), i, i2);
    }

    public boolean canBuildFormatter() {
        return isFormatter(getFormatter());
    }

    public boolean canBuildParser() {
        return isParser(getFormatter());
    }

    public boolean canBuildPrinter() {
        return isPrinter(getFormatter());
    }

    public void clear() {
        this.iFormatter = null;
        this.iElementPairs.clear();
    }

    public DateTimeFormatter toFormatter() {
        Object formatter = getFormatter();
        InternalParser internalParser = null;
        InternalPrinter internalPrinter = isPrinter(formatter) ? (InternalPrinter) formatter : null;
        if (isParser(formatter)) {
            internalParser = (InternalParser) formatter;
        }
        if (internalPrinter != null || internalParser != null) {
            return new DateTimeFormatter(internalPrinter, internalParser);
        }
        throw new UnsupportedOperationException("Both printing and parsing not supported");
    }

    public DateTimeParser toParser() {
        Object formatter = getFormatter();
        if (isParser(formatter)) {
            return InternalParserDateTimeParser.of((InternalParser) formatter);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public DateTimePrinter toPrinter() {
        Object formatter = getFormatter();
        if (isPrinter(formatter)) {
            return InternalPrinterDateTimePrinter.of((InternalPrinter) formatter);
        }
        throw new UnsupportedOperationException("Printing is not supported");
    }
}
