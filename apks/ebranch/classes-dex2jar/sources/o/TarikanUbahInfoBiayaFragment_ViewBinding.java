package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/TarikanUbahInfoBiayaFragment_ViewBinding.class */
public final class TarikanUbahInfoBiayaFragment_ViewBinding implements setEmptyView<Object>, TransaksiBerhasilFragment_ViewBinding {
    private static final HashMap<String, String> a;
    private static final HashMap<String, String> b;
    private static final Map<Class<? extends onChooseValueStatusTempatTinggal<?>>, Integer> c;
    private static final HashMap<String, String> d;
    public static final write e = new write((byte) 0);
    private static final Map<String, String> g;
    private final Class<?> j;

    /* loaded from: classes-dex2jar.jar:o/TarikanUbahInfoBiayaFragment_ViewBinding$write.class */
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    static {
        updateDataPekerjaan updatedatapekerjaan;
        int i = 10;
        List e2 = onClickUbahDataAlamatIdentitas.e(pilihNoRek.class, T1TransaksiTarikanUbahFragment_ViewBinding.class, onClickInfo.class, TReviewTarikanReservasiUbahFragment.class, TReviewTarikanReservasiUbahFragment_ViewBinding.class, TarikanInfoBiayaFragment.class, TReviewTarikanUbahFragment_ViewBinding.class, TReviewTarikanUbahFragment.class, TarikanInfoBiayaFragment_ViewBinding.class, TarikanUbahInfoBiayaFragment.class, T1TransaksiTarikanUbahFragment.class, cabangTerdekat.class, TPilihCabangFragment.class, clearValueFieldReservationEvent.class, TPilihCabangUbahFragment.class, TPilihCabangUbahFragment_ViewBinding.class, TPilihCabangFragment_ViewBinding.class, onChooseKantorCabangTarikanEvent.class, showKantorCabang.class, inputChangeTransaksi.class, onClickUbahDataTransaksi.class, TReviewTarikanFragment_ViewBinding.class, TReviewTarikanFragment.class);
        subscribeReservationRescheduleEvent.e(e2, "");
        if (e2 instanceof Collection) {
            i = e2.size();
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (Object obj : e2) {
            if (i2 >= 0) {
                arrayList.add(new showSumberPenghasilanDialog((Class) obj, Integer.valueOf(i2)));
                i2++;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        ArrayList arrayList2 = arrayList;
        subscribeReservationRescheduleEvent.e(arrayList2, "");
        if (arrayList2 instanceof Collection) {
            ArrayList arrayList3 = arrayList2;
            int size = arrayList3.size();
            if (size == 0) {
                updateDataPekerjaan updatedatapekerjaan2 = updateDataPekerjaan.d;
                subscribeReservationRescheduleEvent.c(updatedatapekerjaan2);
                updatedatapekerjaan = updatedatapekerjaan2;
            } else if (size != 1) {
                updatedatapekerjaan = onChooseMataUangEvent.a(arrayList2, new LinkedHashMap(onChooseMataUangEvent.b(arrayList3.size())));
            } else {
                showSumberPenghasilanDialog showsumberpenghasilandialog = (showSumberPenghasilanDialog) (arrayList2 instanceof List ? arrayList2.get(0) : arrayList2.iterator().next());
                subscribeReservationRescheduleEvent.e(showsumberpenghasilandialog, "");
                updatedatapekerjaan = Collections.singletonMap(showsumberpenghasilandialog.c, showsumberpenghasilandialog.a);
                subscribeReservationRescheduleEvent.d(updatedatapekerjaan, "");
            }
        } else {
            Map<Class<? extends onChooseValueStatusTempatTinggal<?>>, Integer> a2 = onChooseMataUangEvent.a(arrayList2, new LinkedHashMap());
            subscribeReservationRescheduleEvent.e(a2, "");
            int size2 = a2.size();
            if (size2 != 0) {
                updatedatapekerjaan = a2;
                if (size2 == 1) {
                    subscribeReservationRescheduleEvent.e(a2, "");
                    Map.Entry<Class<? extends onChooseValueStatusTempatTinggal<?>>, Integer> next = a2.entrySet().iterator().next();
                    updatedatapekerjaan = Collections.singletonMap(next.getKey(), next.getValue());
                    subscribeReservationRescheduleEvent.d(updatedatapekerjaan, "");
                }
            } else {
                updateDataPekerjaan updatedatapekerjaan3 = updateDataPekerjaan.d;
                subscribeReservationRescheduleEvent.c(updatedatapekerjaan3);
                updatedatapekerjaan = updatedatapekerjaan3;
            }
        }
        c = updatedatapekerjaan;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        a = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        d = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        subscribeReservationRescheduleEvent.d(values, "");
        for (Object obj2 : values) {
            HashMap<String, String> hashMap4 = hashMap3;
            String str = (String) obj2;
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            subscribeReservationRescheduleEvent.d(str, "");
            sb.append(CheckOTPSessionPresenter.d(str, '.', str));
            sb.append("CompanionObject");
            String obj3 = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(".Companion");
            showSumberPenghasilanDialog showsumberpenghasilandialog2 = new showSumberPenghasilanDialog(obj3, sb2.toString());
            hashMap4.put(showsumberpenghasilandialog2.c, showsumberpenghasilandialog2.a);
        }
        for (Map.Entry<Class<? extends onChooseValueStatusTempatTinggal<?>>, Integer> entry : c.entrySet()) {
            Class<? extends onChooseValueStatusTempatTinggal<?>> key = entry.getKey();
            int intValue = entry.getValue().intValue();
            String name = key.getName();
            StringBuilder sb3 = new StringBuilder("kotlin.Function");
            sb3.append(intValue);
            hashMap3.put(name, sb3.toString());
        }
        b = hashMap3;
        HashMap<String, String> hashMap5 = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(onChooseMataUangEvent.b(hashMap5.size()));
        Iterator<T> it = hashMap5.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            linkedHashMap.put(entry2.getKey(), CheckOTPSessionPresenter.d((String) entry2.getValue(), '.', r2));
        }
        g = linkedHashMap;
    }

    public TarikanUbahInfoBiayaFragment_ViewBinding(Class<?> cls) {
        subscribeReservationRescheduleEvent.e(cls, "");
        this.j = cls;
    }

    @Override // o.TransaksiBerhasilFragment_ViewBinding
    public final Class<?> d() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TarikanUbahInfoBiayaFragment_ViewBinding) && subscribeReservationRescheduleEvent.b(T1TransaksiTarikanFragment.a(this), T1TransaksiTarikanFragment.a((setEmptyView) obj));
    }

    public final int hashCode() {
        return T1TransaksiTarikanFragment.a(this).hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.j.toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
