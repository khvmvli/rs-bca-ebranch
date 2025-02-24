package o;

import io.realm.CollectionUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* loaded from: classes-dex2jar.jar:o/realmGet$cardImageOrientation.class */
public final class realmGet$cardImageOrientation {
    private static void c(realmGet$cardDescription realmget_carddescription, StringBuilder sb, int i) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        Method[] declaredMethods = realmget_carddescription.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    d(sb, i, d(concat), setHmKecamatan.c(method2, realmget_carddescription, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    d(sb, i, d(concat2), setHmKecamatan.c(method3, realmget_carddescription, new Object[0]));
                }
            }
            String valueOf5 = String.valueOf(substring);
            if (((Method) hashMap2.get(valueOf5.length() != 0 ? CollectionUtils.SET_TYPE.concat(valueOf5) : new String(CollectionUtils.SET_TYPE))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf6 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf6.length() != 0 ? "get".concat(valueOf6) : new String("get"))) {
                    }
                }
                String valueOf7 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf8 = String.valueOf(substring.substring(1));
                String concat3 = valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7);
                String valueOf9 = String.valueOf(substring);
                Method method4 = (Method) hashMap.get(valueOf9.length() != 0 ? "get".concat(valueOf9) : new String("get"));
                String valueOf10 = String.valueOf(substring);
                Method method5 = (Method) hashMap.get(valueOf10.length() != 0 ? "has".concat(valueOf10) : new String("has"));
                if (method4 != null) {
                    Object c = setHmKecamatan.c(method4, realmget_carddescription, new Object[0]);
                    if (method5 == null) {
                        if (c instanceof Boolean) {
                            if (((Boolean) c).booleanValue()) {
                                d(sb, i, d(concat3), c);
                            }
                        } else if (c instanceof Integer) {
                            if (((Integer) c).intValue() != 0) {
                                d(sb, i, d(concat3), c);
                            }
                        } else if (c instanceof Float) {
                            if (((Float) c).floatValue() != 0.0f) {
                                d(sb, i, d(concat3), c);
                            }
                        } else if (!(c instanceof Double)) {
                            if (c instanceof String) {
                                equals = c.equals("");
                            } else if (c instanceof setCurrOfficePostCode) {
                                equals = c.equals(setCurrOfficePostCode.a);
                            } else if (!(c instanceof realmGet$cardDescription)) {
                                if ((c instanceof Enum) && ((Enum) c).ordinal() == 0) {
                                }
                                d(sb, i, d(concat3), c);
                            } else if (c != ((realmGet$cardDescription) c).l_()) {
                                d(sb, i, d(concat3), c);
                            }
                            if (!equals) {
                                d(sb, i, d(concat3), c);
                            }
                        } else if (((Double) c).doubleValue() != 0.0d) {
                            d(sb, i, d(concat3), c);
                        }
                    } else if (((Boolean) setHmKecamatan.c(method5, realmget_carddescription, new Object[0])).booleanValue()) {
                        d(sb, i, d(concat3), c);
                    }
                }
            }
        }
        if (!(realmget_carddescription instanceof setHmKelurahan)) {
            getSupplementCardLimit getsupplementcardlimit = ((setHmKecamatan) realmget_carddescription).zzc;
            if (getsupplementcardlimit != null) {
                getsupplementcardlimit.d(sb, i);
                return;
            }
            return;
        }
        setFlagBCAAccount setflagbcaaccount = ((setHmKelurahan) realmget_carddescription).zza;
        throw null;
    }

    private static final String d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static final void d(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                d(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                d(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(realmSet$incomeAmount.c(setCurrOfficePostCode.c((String) obj)));
                sb.append('\"');
            } else if (obj instanceof setCurrOfficePostCode) {
                sb.append(": \"");
                sb.append(realmSet$incomeAmount.c((setCurrOfficePostCode) obj));
                sb.append('\"');
            } else if (obj instanceof setHmKecamatan) {
                sb.append(" {");
                c((setHmKecamatan) obj, sb, i + 2);
                sb.append("\n");
                for (int i3 = 0; i3 < i; i3++) {
                    sb.append(' ');
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                d(sb, i4, "key", entry2.getKey());
                d(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                for (int i5 = 0; i5 < i; i5++) {
                    sb.append(' ');
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    public static String e(realmGet$cardDescription realmget_carddescription, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(realmget_carddescription, sb, 0);
        return sb.toString();
    }
}
