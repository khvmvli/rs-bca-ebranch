package o;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
/* loaded from: classes-dex2jar.jar:o/getAnnualFeeBasicAmount.class */
public final class getAnnualFeeBasicAmount {
    public static String a(int i) {
        return new String[]{"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"}[i];
    }

    public static String a(int i, int i2, int i3) {
        DateTimeFormatter forPattern = DateTimeFormat.forPattern("yyyy-MM-dd");
        Calendar instance = Calendar.getInstance();
        instance.set(5, i3);
        instance.set(2, i2);
        instance.set(1, i);
        return forPattern.print(instance.getTimeInMillis());
    }

    public static String a(String str) {
        DateTimeFormatter forPattern = DateTimeFormat.forPattern("dd");
        DateTime parseDateTime = DateTimeFormat.forPattern("yyyyMMdd").parseDateTime(str);
        StringBuilder sb = new StringBuilder();
        sb.append(forPattern.print(parseDateTime));
        sb.append(" ");
        sb.append(a(parseDateTime.getMonthOfYear() - 1));
        sb.append(" ");
        sb.append(parseDateTime.getYear());
        return sb.toString();
    }

    public static String b(String str) {
        if (str == "" || str == null) {
            return "";
        }
        try {
            return new SimpleDateFormat("dd MMMM yyyy", new Locale("in", "ID")).format(new SimpleDateFormat("yyyy-MM-dd").parse(str));
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String c(int i, int i2, int i3) {
        DateTimeFormatter forPattern = DateTimeFormat.forPattern("ddMMyyyy");
        Calendar instance = Calendar.getInstance();
        instance.set(5, i3);
        instance.set(2, i2);
        instance.set(1, i);
        return forPattern.print(instance.getTimeInMillis());
    }

    public static String c(String str) {
        try {
            str = new SimpleDateFormat("MMM yyyy", new Locale("id", "ID")).format(new SimpleDateFormat("yyyyMMdd").parse(str));
        } catch (Exception e) {
        }
        return str;
    }

    public static String d(int i, int i2, int i3) {
        DateTimeFormatter forPattern = DateTimeFormat.forPattern("yyyyMMdd");
        Calendar instance = Calendar.getInstance();
        instance.set(5, i3);
        instance.set(2, i2);
        instance.set(1, i);
        return forPattern.print(instance.getTimeInMillis());
    }

    public static String d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("Mon", "Senin");
        hashMap.put("Tue", "Selasa");
        hashMap.put("Wed", "Rabu");
        hashMap.put("Thu", "Kamis");
        hashMap.put("Fri", "Jumat");
        hashMap.put("Sat", "Sabtu");
        hashMap.put("Sun", "Minggu");
        return (String) hashMap.get(DateTimeFormat.forPattern("E").withLocale(Locale.US).print(DateTimeFormat.forPattern("yyyyMMdd").parseDateTime(str)));
    }

    public static String e(int i, int i2, int i3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy", new Locale("in", "ID"));
        Calendar instance = Calendar.getInstance();
        instance.set(5, i3);
        instance.set(2, i2);
        instance.set(1, i);
        return simpleDateFormat.format(Long.valueOf(instance.getTimeInMillis()));
    }

    public static String e(String str) {
        String replace = str.replace("-", "");
        String substring = replace.substring(0, 2);
        String a = a(Integer.valueOf(replace.substring(2, 4)).intValue() - 1);
        String substring2 = replace.substring(4, 8);
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append(" ");
        sb.append(a);
        sb.append(" ");
        sb.append(substring2);
        return sb.toString();
    }

    public static String e(String str, String str2, String str3) {
        try {
            return new SimpleDateFormat(str2, new Locale("id", "ID")).format(new SimpleDateFormat(str, new Locale("id", "ID")).parse(str3));
        } catch (Exception e) {
            return str3;
        }
    }

    public static Date e(String str, String str2) {
        try {
            return new SimpleDateFormat(str).parse(str2);
        } catch (ParseException e) {
            return new Date();
        }
    }

    public static String f(String str) {
        try {
            str = new SimpleDateFormat("EEEE, dd MMM yyyy", new Locale("id", "ID")).format(new SimpleDateFormat("dd MMMM yyyy", new Locale("id", "ID")).parse(str));
        } catch (Exception e) {
        }
        return str;
    }
}
