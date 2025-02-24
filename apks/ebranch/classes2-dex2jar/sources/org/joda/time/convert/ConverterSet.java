package org.joda.time.convert;
/* loaded from: classes2-dex2jar.jar:org/joda/time/convert/ConverterSet.class */
class ConverterSet {
    private final Converter[] iConverters;
    private Entry[] iSelectEntries = new Entry[16];

    /* loaded from: classes2-dex2jar.jar:org/joda/time/convert/ConverterSet$Entry.class */
    static class Entry {
        final Converter iConverter;
        final Class<?> iType;

        Entry(Class<?> cls, Converter converter) {
            this.iType = cls;
            this.iConverter = converter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConverterSet(Converter[] converterArr) {
        this.iConverters = converterArr;
    }

    private static Converter selectSlow(ConverterSet converterSet, Class<?> cls) {
        Converter[] converterArr = converterSet.iConverters;
        int length = converterArr.length;
        int i = length;
        ConverterSet converterSet2 = converterSet;
        Converter[] converterArr2 = converterArr;
        while (true) {
            int i2 = length - 1;
            if (i2 >= 0) {
                Converter converter = converterArr2[i2];
                Class<?> supportedType = converter.getSupportedType();
                if (supportedType == cls) {
                    return converter;
                }
                if (supportedType != null) {
                    length = i2;
                    if (cls != null) {
                        length = i2;
                        if (!supportedType.isAssignableFrom(cls)) {
                        }
                    }
                }
                converterSet2 = converterSet2.remove(i2, (Converter[]) null);
                converterArr2 = converterSet2.iConverters;
                i = converterArr2.length;
                length = i2;
            } else if (cls == null || i == 0) {
                return null;
            } else {
                if (i == 1) {
                    return converterArr2[0];
                }
                int i3 = i;
                int i4 = i;
                while (true) {
                    int i5 = i4 - 1;
                    if (i5 < 0) {
                        break;
                    }
                    Class<?> supportedType2 = converterArr2[i5].getSupportedType();
                    int i6 = i3;
                    int i7 = i3;
                    int i8 = i5;
                    while (true) {
                        int i9 = i7 - 1;
                        if (i9 >= 0) {
                            i7 = i9;
                            if (i9 != i8) {
                                i7 = i9;
                                if (converterArr2[i9].getSupportedType().isAssignableFrom(supportedType2)) {
                                    converterSet2 = converterSet2.remove(i9, (Converter[]) null);
                                    converterArr2 = converterSet2.iConverters;
                                    i6 = converterArr2.length;
                                    i8 = i6 - 1;
                                    i7 = i9;
                                }
                            }
                        }
                    }
                    i4 = i8;
                    i3 = i6;
                }
                if (i3 == 1) {
                    return converterArr2[0];
                }
                StringBuilder sb = new StringBuilder("Unable to find best converter for type \"");
                sb.append(cls.getName());
                sb.append("\" from remaining set: ");
                for (int i10 = 0; i10 < i3; i10++) {
                    Converter converter2 = converterArr2[i10];
                    Class<?> supportedType3 = converter2.getSupportedType();
                    sb.append(converter2.getClass().getName());
                    sb.append('[');
                    sb.append(supportedType3 == null ? null : supportedType3.getName());
                    sb.append("], ");
                }
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConverterSet add(Converter converter, Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        int length = converterArr2.length;
        for (int i = 0; i < length; i++) {
            Converter converter2 = converterArr2[i];
            if (converter.equals(converter2)) {
                if (converterArr != null) {
                    converterArr[0] = null;
                }
                return this;
            } else if (converter.getSupportedType() == converter2.getSupportedType()) {
                Converter[] converterArr3 = new Converter[length];
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 != i) {
                        converterArr3[i2] = converterArr2[i2];
                    } else {
                        converterArr3[i2] = converter;
                    }
                }
                if (converterArr != null) {
                    converterArr[0] = converter2;
                }
                return new ConverterSet(converterArr3);
            }
        }
        Converter[] converterArr4 = new Converter[length + 1];
        System.arraycopy(converterArr2, 0, converterArr4, 0, length);
        converterArr4[length] = converter;
        if (converterArr != null) {
            converterArr[0] = null;
        }
        return new ConverterSet(converterArr4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void copyInto(Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        System.arraycopy(converterArr2, 0, converterArr, 0, converterArr2.length);
    }

    ConverterSet remove(int i, Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        int length = converterArr2.length;
        if (i < length) {
            if (converterArr != null) {
                converterArr[0] = converterArr2[i];
            }
            Converter[] converterArr3 = new Converter[length - 1];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                i2 = i2;
                if (i3 != i) {
                    converterArr3[i2] = converterArr2[i3];
                    i2++;
                }
            }
            return new ConverterSet(converterArr3);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConverterSet remove(Converter converter, Converter[] converterArr) {
        Converter[] converterArr2 = this.iConverters;
        int length = converterArr2.length;
        for (int i = 0; i < length; i++) {
            if (converter.equals(converterArr2[i])) {
                return remove(i, converterArr);
            }
        }
        if (converterArr != null) {
            converterArr[0] = null;
        }
        return this;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004f A[EDGE_INSN: B:39:0x004f->B:15:0x004f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    org.joda.time.convert.Converter select(java.lang.Class<?> r6) throws java.lang.IllegalStateException {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.convert.ConverterSet.select(java.lang.Class):org.joda.time.convert.Converter");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int size() {
        return this.iConverters.length;
    }
}
