package o;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.util.Base64;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.bca.smartbranch.data.localdb.User;
import com.facebook.stetho.server.http.HttpStatus;
import com.mobsandgeeks.saripaar.QuickRule;
import com.mobsandgeeks.saripaar.Validator;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes-dex2jar.jar:o/getPromotion.class */
public final class getPromotion {
    public static Bitmap a(String str, Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put(CC15FormKartuKreditFragment_ViewBinding.d, CC17FormKartuKreditFragment_ViewBinding.a);
        hashMap.put(CC15FormKartuKreditFragment_ViewBinding.b, 2);
        try {
            onClickBidangUsaha onclickbidangusaha = onClickBidangUsaha.m;
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Found empty contents");
            } else if (onclickbidangusaha == onClickBidangUsaha.m) {
                CC17FormKartuKreditFragment_ViewBinding cC17FormKartuKreditFragment_ViewBinding = CC17FormKartuKreditFragment_ViewBinding.b;
                if (hashMap.containsKey(CC15FormKartuKreditFragment_ViewBinding.d)) {
                    cC17FormKartuKreditFragment_ViewBinding = CC17FormKartuKreditFragment_ViewBinding.valueOf(hashMap.get(CC15FormKartuKreditFragment_ViewBinding.d).toString());
                }
                int i = 4;
                if (hashMap.containsKey(CC15FormKartuKreditFragment_ViewBinding.b)) {
                    i = Integer.parseInt(hashMap.get(CC15FormKartuKreditFragment_ViewBinding.b).toString());
                }
                CC15WiraswastaFormKartuKreditFragment c = CC15WiraswastaFormKartuKreditFragment_ViewBinding.c(onClickBankPenerbit.c(str, cC17FormKartuKreditFragment_ViewBinding, hashMap), (int) HttpStatus.HTTP_INTERNAL_SERVER_ERROR, (int) HttpStatus.HTTP_INTERNAL_SERVER_ERROR, i);
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), 2131623936);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth() / 2, decodeResource.getHeight() / 2, true);
                int i2 = c.c;
                int height = createScaledBitmap.getHeight();
                int i3 = c.e;
                int width = createScaledBitmap.getWidth();
                int i4 = c.e;
                int i5 = c.c;
                int[] iArr = new int[i4 * i5];
                r0 = context.getResources().getColor(2131099728);
                int i6 = context.getResources().getColor(2131099772);
                for (int i7 = 0; i7 < i5; i7++) {
                    for (int i8 = 0; i8 < i4; i8++) {
                        if (c.b(i8, i7)) {
                        }
                        iArr[(i7 * i4) + i8] = i6;
                    }
                }
                Bitmap createBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_4444);
                createBitmap.setPixels(iArr, 0, HttpStatus.HTTP_INTERNAL_SERVER_ERROR, 0, 0, i4, i5);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(createBitmap, new Matrix(), null);
                canvas.drawBitmap(createScaledBitmap, (float) ((i3 - width) / 2), (float) ((i2 - height) / 2), new Paint());
                return createBitmap;
            } else {
                StringBuilder sb = new StringBuilder("Can only encode QR_CODE, but got ");
                sb.append(onclickbidangusaha);
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (Exception e) {
            return null;
        }
    }

    public static String a(User user, String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        if (user.getVerified().equals("Y")) {
            if (str.length() == 1 && str.equals("0")) {
                return "";
            }
            if (str.length() > 1 && str.startsWith("0")) {
                return str.substring(1);
            }
        }
        return str;
    }

    public static String a(Double d) {
        if (d.doubleValue() == 0.0d) {
            return "";
        }
        String plainString = new BigDecimal(d.doubleValue()).setScale(2, 6).toPlainString();
        String[] split = plainString.split(".");
        String str = plainString;
        if (split.length > 1) {
            str = plainString;
            if (split[1].length() < 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(plainString);
                sb.append("0");
                str = sb.toString();
            }
        }
        return c(str, 14, 2);
    }

    public static String a(String str) {
        if (str.isEmpty()) {
            return "";
        }
        return String.format(Locale.US, "%,.2f", Double.valueOf(new BigDecimal(str.replaceAll(",", "")).setScale(2, RoundingMode.HALF_UP).doubleValue()));
    }

    public static String a(String str, int i, int i2) {
        String str2 = str;
        if (str.charAt(0) == ',') {
            StringBuilder sb = new StringBuilder("0");
            sb.append(str);
            str2 = sb.toString();
        }
        int length = str2.length();
        String str3 = "";
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str2.charAt(i5);
            if (charAt != ',' && !z) {
                i3++;
                if (i3 > i) {
                    i3 = i3;
                    str3 = str3;
                    z = true;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(charAt);
                    str3 = sb2.toString();
                    z = z;
                }
            } else if (charAt == ',') {
                i3 = i3;
                str3 = str3;
                if (!str3.contains(",")) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str3);
                    sb3.append(charAt);
                    str3 = sb3.toString();
                    i3 = i3;
                }
                z = true;
            } else {
                i4++;
                if (i4 > i2) {
                    return str3;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str3);
                sb4.append(charAt);
                str3 = sb4.toString();
                z = z;
            }
        }
        return str3;
    }

    public static String a(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        while (sb.length() + str.length() < 2) {
            sb.append(str2);
        }
        sb.append(str);
        return sb.toString();
    }

    public static String a(String str, Boolean bool) {
        if (str.isEmpty() || !str.contains(".")) {
            return "";
        }
        String[] split = str.replaceAll(",", "").split("\\.");
        return !bool.booleanValue() ? String.format("%,.0f", Double.valueOf(Double.parseDouble(split[0]))).replaceAll("\\.", ",") : split[0];
    }

    public static void a(Context context, List<TextView> list, List<LogoutDialog_ViewBinding> list2, List<View> list3, setCurrentItem setcurrentitem) {
        if (list.get(list3.indexOf(setcurrentitem)).getVisibility() == 0 && b(context, list.get(list3.indexOf(setcurrentitem)).getText().toString(), setcurrentitem)) {
            int indexOf = list3.indexOf(setcurrentitem);
            list.get(indexOf).setVisibility(8);
            list2.get(indexOf).setBackgroundResource(2131230847);
        }
    }

    public static void a(Editable editable) {
        if (editable.toString().length() > 0 && " ".equals(editable.toString().substring(0, 1))) {
            editable.replace(0, 1, "");
        }
    }

    public static void a(View view) {
        if (view instanceof EditText) {
            view.setEnabled(true);
            view.requestFocus();
            EditText editText = (EditText) view;
            editText.setSelection(editText.getText().length());
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }
    }

    public static boolean a(Context context, String str, EditText editText) {
        return str.equals(context.getString(2131820780)) ? editText.getText().toString().matches("^(?=[^@]*[A-z])(\\.?[A-z0-9_-]){0,}@[A-z0-9-]+\\.([A-z]{1,6}\\.)?[A-z]{2,6}$") : !editText.getText().toString().isEmpty();
    }

    public static String b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Log.i("EBRANCH", String.valueOf(e));
            return "";
        }
    }

    public static String b(Bitmap bitmap) {
        if (bitmap == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    public static String b(User user, String str) {
        if (user == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Email", user.getEmail());
            jSONObject.put("SessionId", user.getSessionId());
            jSONObject.put("IMEI", user.getImei());
            jSONObject.put("txn-date", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString();
    }

    public static String b(String str) {
        if (!str.contains(",")) {
            if (str.isEmpty()) {
                return "";
            }
            String replaceAll = str.replaceAll("\\.", "");
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%,.0f", Double.valueOf(Double.parseDouble(replaceAll))).replaceAll(",", "\\."));
            sb.append(",00");
            return sb.toString();
        } else if (str.isEmpty()) {
            return "";
        } else {
            String[] split = str.replaceAll("\\.", "").split(",");
            if (split[0].isEmpty()) {
                return "0";
            }
            if (split.length <= 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(String.format("%,.0f", Double.valueOf(Double.parseDouble(split[0]))).replaceAll(",", "\\."));
                sb2.append(",00");
                return sb2.toString();
            } else if (split[1].length() == 1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(String.format("%,.0f", Double.valueOf(Double.parseDouble(split[0]))).replaceAll(",", "\\."));
                sb3.append(",");
                sb3.append(split[1]);
                sb3.append("0");
                return sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(String.format("%,.0f", Double.valueOf(Double.parseDouble(split[0]))).replaceAll(",", "\\."));
                sb4.append(",");
                sb4.append(split[1]);
                return sb4.toString();
            }
        }
    }

    public static void b(Validator validator, final EditText editText) {
        validator.put(editText, new QuickRule<EditText>() { // from class: o.getPromotion.7
            private boolean e() {
                return editText.getTag().toString().equalsIgnoreCase("KTP") ? editText.getText().length() == 16 : (editText.getTag().toString().equalsIgnoreCase("Paspor") || editText.getTag().toString().equalsIgnoreCase("Kartu Pelajar")) ? !editText.getText().toString().isEmpty() : !editText.getTag().toString().equalsIgnoreCase("SIUP") || !editText.getText().toString().isEmpty();
            }

            public final String getMessage(Context context) {
                return editText.getTag().toString().equalsIgnoreCase("KTP") ? editText.getText().toString().isEmpty() ? context.getString(2131820937) : context.getString(2131820938) : editText.getTag().toString().equalsIgnoreCase("Paspor") ? editText.getText().toString().isEmpty() ? context.getString(2131820945) : context.getString(2131820946) : editText.getTag().toString().equalsIgnoreCase("Kartu Pelajar") ? editText.getText().toString().isEmpty() ? context.getString(2131820913) : context.getString(2131820932) : editText.getTag().toString().equalsIgnoreCase("SIUP") ? editText.getText().toString().isEmpty() ? context.getString(2131820926) : context.getString(2131820926) : context.getString(2131820932);
            }

            public final /* synthetic */ boolean isValid(View view) {
                return e();
            }

            public final /* synthetic */ boolean isValid(Object obj) {
                return e();
            }
        });
    }

    public static void b(Validator validator, final EditText editText, final ConfirmSubBCACardAdapter$ViewHolder confirmSubBCACardAdapter$ViewHolder) {
        validator.put(editText, new QuickRule<EditText>() { // from class: o.getPromotion.2
            public final String getMessage(Context context) {
                if (editText.getText().toString().isEmpty()) {
                    return context.getString(confirmSubBCACardAdapter$ViewHolder.c);
                }
                String obj = editText.getText().toString();
                return obj == null ? false : obj.matches("[0-9]+") ^ true ? context.getString(confirmSubBCACardAdapter$ViewHolder.a) : editText.getText().toString().length() < 6 ? context.getString(confirmSubBCACardAdapter$ViewHolder.e) : getPromotion.l(editText.getText().toString()).booleanValue() ? context.getString(confirmSubBCACardAdapter$ViewHolder.d) : (!getPromotion.f(editText.getText().toString()) || editText.getText().toString().length() < 6) ? context.getString(confirmSubBCACardAdapter$ViewHolder.d) : context.getString(confirmSubBCACardAdapter$ViewHolder.d);
            }

            public final /* synthetic */ boolean isValid(View view) {
                return getPromotion.o(editText.getText().toString());
            }

            public final /* synthetic */ boolean isValid(Object obj) {
                return getPromotion.o(editText.getText().toString());
            }
        });
    }

    public static void b(List<TextView> list, List<LogoutDialog_ViewBinding> list2, List<View> list3, EditText editText) {
        if (list.get(list3.indexOf(editText)).getVisibility() == 0 && !editText.getText().toString().isEmpty()) {
            int indexOf = list3.indexOf(editText);
            list.get(indexOf).setVisibility(8);
            list2.get(indexOf).setBackgroundResource(2131230847);
        }
    }

    public static boolean b(Context context, String str, setCurrentItem setcurrentitem) {
        boolean z = true;
        if (str.equals(context.getString(2131820933))) {
            return !setcurrentitem.e.e.isEmpty();
        }
        if (!str.equals(context.getString(2131820934))) {
            return false;
        }
        if (setcurrentitem.e.e.length() != 16) {
            z = false;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static android.net.Uri c(android.content.Context r5, android.graphics.Bitmap r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPromotion.c(android.content.Context, android.graphics.Bitmap, java.lang.String):android.net.Uri");
    }

    public static String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(Build.MODEL);
        sb.append("-Android-");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("-");
        sb.append(Build.VERSION.RELEASE);
        return sb.toString();
    }

    public static String c(User user, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (user == null) {
                jSONObject.put("Email", "");
                jSONObject.put("SessionId", "");
                jSONObject.put("IMEI", str2);
                jSONObject.put("flag-guest", str);
            } else {
                jSONObject.put("Email", user.getEmail());
                jSONObject.put("SessionId", user.getSessionId());
                jSONObject.put("IMEI", user.getImei());
                jSONObject.put("flag-guest", str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString();
    }

    public static String c(String str) {
        return String.format(Locale.US, "%.2f", Double.valueOf(Double.parseDouble(str.replaceAll("\\.", "").replace(",", "."))));
    }

    public static String c(String str, int i, int i2) {
        if (str.startsWith("0") || str.startsWith(",") || str.startsWith(".") || str.isEmpty()) {
            return "";
        }
        String[] split = str.split("\\.");
        String str2 = "";
        String str3 = str;
        if (split.length > 0) {
            if (split.length <= 1) {
                str2 = "";
                str3 = str;
                if (str.endsWith(".")) {
                    str3 = split[0];
                    str2 = ".";
                }
            } else if (!split[1].equals("")) {
                String str4 = split[1];
                StringBuilder sb = new StringBuilder(".");
                sb.append(str4);
                str2 = sb.toString();
                str3 = split[0];
            } else {
                str3 = split[0];
                str2 = "";
            }
        }
        String str5 = str3;
        if (str3.length() > i) {
            str5 = str3.substring(0, i);
        }
        String str6 = str2;
        if (str2.length() > 3) {
            str6 = str2.substring(0, 3);
        }
        DecimalFormat decimalFormat = new DecimalFormat("###,###.##", new DecimalFormatSymbols(Locale.US));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(decimalFormat.format(BigDecimal.valueOf(Double.parseDouble(str5))));
        sb2.append(str6);
        return sb2.toString();
    }

    public static void c(Context context, List<TextView> list, List<LogoutDialog_ViewBinding> list2, List<View> list3, EditText editText) {
        if (list.get(list3.indexOf(editText)).getVisibility() == 0 && a(context, list.get(list3.indexOf(editText)).getText().toString(), editText)) {
            int indexOf = list3.indexOf(editText);
            list.get(indexOf).setVisibility(8);
            list2.get(indexOf).setBackgroundResource(2131230847);
        }
    }

    public static void c(EditText editText, String str) {
        editText.setError(null);
        editText.setTag(str);
        if ("Paspor".equalsIgnoreCase(str) || "SIUP".equalsIgnoreCase(str)) {
            editText.setInputType(524288);
            editText.setFilters(new InputFilter[]{new getAnnualFeeAddOnDisplayAmount("QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890"), new InputFilter.LengthFilter(20)});
        } else if ("Kartu Pelajar".equalsIgnoreCase(str)) {
            editText.setInputType(2);
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(14)});
        } else if ("KTP".equalsIgnoreCase(str)) {
            editText.setInputType(2);
            editText.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
            editText.setFilters(new InputFilter[]{new getAnnualFeeAddOnDisplayAmount("0123456789"), new InputFilter.LengthFilter(16)});
        } else {
            editText.setInputType(2);
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(16)});
        }
    }

    public static Bitmap d(String str) {
        if ("".equalsIgnoreCase(str)) {
            return null;
        }
        byte[] decode = Base64.decode(str.getBytes(), 2);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static void d(Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        View currentFocus = ((Activity) context).getCurrentFocus();
        if (currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public static void d(Context context, List<TextView> list, List<LogoutDialog_ViewBinding> list2, List<View> list3, EditText editText) {
        if (list.get(list3.indexOf(editText)).getVisibility() == 0 && d(context, list.get(list3.indexOf(editText)).getText().toString(), editText)) {
            int indexOf = list3.indexOf(editText);
            list.get(indexOf).setVisibility(8);
            list2.get(indexOf).setBackgroundResource(2131230847);
        }
    }

    public static boolean d(Context context, String str, EditText editText) {
        boolean z = true;
        boolean z2 = true;
        if (str.equals(context.getString(2131820937)) || str.equals(context.getString(2131820945)) || str.equals(context.getString(2131820913)) || str.equals(context.getString(2131820932)) || str.equals(context.getString(2131820930))) {
            return !editText.getText().toString().isEmpty();
        }
        if (str.equals(context.getString(2131820938)) || str.equals(context.getString(2131820931))) {
            if (editText.getText().toString().length() != 16) {
                z = false;
            }
            return z;
        } else if (!str.equals(context.getString(2131820923)) && !str.equals(context.getString(2131820920))) {
            return false;
        } else {
            if (editText.getText().toString().length() != 10) {
                z2 = false;
            }
            return z2;
        }
    }

    public static String e(User user) {
        if (user == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Email", user.getEmail());
            jSONObject.put("SessionId", user.getSessionId());
            jSONObject.put("IMEI", user.getImei());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString();
    }

    public static String e(User user, String str, String str2, String str3) {
        if (!str.equals("Y")) {
            return c(user, str, "");
        }
        User user2 = new User();
        user2.setEmail(str3);
        user2.setImei(str2);
        return c(user2, str, "");
    }

    public static String e(String str) {
        char c;
        String str2 = str;
        if (str != null) {
            if (str.isEmpty()) {
                str2 = str;
            } else {
                StringBuilder sb = new StringBuilder(str.length());
                char[] charArray = str.toLowerCase().toCharArray();
                boolean z = true;
                for (char c2 : charArray) {
                    if (!Character.isLetterOrDigit(c2)) {
                        z = true;
                        c = c2;
                    } else {
                        z = z;
                        c = c2;
                        if (z) {
                            c = Character.toTitleCase(c2);
                            z = false;
                        }
                    }
                    sb.append(c);
                }
                str2 = sb.toString();
            }
        }
        return str2;
    }

    public static String e(String str, int i, int i2) {
        String replaceAll = str.replaceAll("\\.", "");
        if (replaceAll.isEmpty()) {
            return "";
        }
        String a = a(replaceAll, 12, 2);
        if (Double.parseDouble(a.replace(",", ".")) == 0.0d) {
            return "";
        }
        if (!a.contains(",")) {
            return String.format("%,.0f", Double.valueOf(Double.parseDouble(a))).replaceAll(",", "\\.");
        }
        String[] split = a.split(",");
        if (split.length > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%,.0f", Double.valueOf(Double.parseDouble(split[0]))).replaceAll(",", "\\."));
            sb.append(",");
            sb.append(split[1]);
            return sb.toString();
        } else if (split[0].isEmpty()) {
            return "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format("%,.0f", Double.valueOf(Double.parseDouble(split[0]))).replaceAll(",", "\\."));
            sb2.append(",");
            return sb2.toString();
        }
    }

    public static void e(View view) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: o.getPromotion.4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                view2.getParent().requestDisallowInterceptTouchEvent(false);
                return false;
            }
        });
    }

    public static boolean f(String str) {
        boolean z = false;
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            z = true;
            for (int i = 0; i < str.length(); i++) {
                if (charAt != str.charAt(i)) {
                    z = false;
                }
            }
        }
        return z;
    }

    public static String g(String str) {
        if (!str.contains(".")) {
            if (str.isEmpty()) {
                return "";
            }
            String replaceAll = str.replaceAll(",", "");
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%,.0f", Double.valueOf(Double.parseDouble(replaceAll))).replaceAll("\\.", ","));
            sb.append(".00");
            return sb.toString();
        } else if (str.isEmpty()) {
            return "";
        } else {
            String[] split = str.replaceAll(",", "").split("\\.");
            if (split[0].isEmpty()) {
                return "0";
            }
            if (split.length <= 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(String.format("%,.0f", Double.valueOf(Double.parseDouble(split[0]))).replaceAll("\\.", ","));
                sb2.append(".00");
                return sb2.toString();
            } else if (split[1].length() == 1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(String.format("%,.0f", Double.valueOf(Double.parseDouble(split[0]))).replaceAll("\\.", ","));
                sb3.append(",");
                sb3.append(split[1]);
                sb3.append("0");
                return sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(String.format("%,.0f", Double.valueOf(Double.parseDouble(split[0]))).replaceAll("\\.", ","));
                sb4.append(",");
                sb4.append(split[1]);
                return sb4.toString();
            }
        }
    }

    public static String h(String str) {
        String str2;
        String str3 = "";
        if (!str.contains(".")) {
            String replaceAll = str.replaceAll(",", "");
            if (replaceAll.isEmpty()) {
                return "";
            }
            if (!String.format(Locale.US, "%,.0f", Double.valueOf(Double.parseDouble(replaceAll))).equals("0")) {
                str3 = String.format(Locale.US, "%,.0f", Double.valueOf(Double.parseDouble(replaceAll)));
            }
            return str3;
        }
        String replaceAll2 = str.replaceAll(",", "");
        if (replaceAll2.isEmpty()) {
            return "";
        }
        String[] split = replaceAll2.split("\\.");
        if (split[0].isEmpty()) {
            return "";
        }
        if (split.length == 1) {
            str2 = ".00";
        } else {
            StringBuilder sb = new StringBuilder(".");
            sb.append(split[1]);
            str2 = sb.toString();
        }
        if (!String.format(Locale.US, "%,.0f", Double.valueOf(Double.parseDouble(split[0]))).equals("0")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format(Locale.US, "%,.0f", Double.valueOf(Double.parseDouble(split[0]))));
            sb2.append(str2);
            str3 = sb2.toString();
        }
        return str3;
    }

    public static String i(String str) {
        String str2 = "";
        if (!str.contains(",")) {
            String replaceAll = str.replaceAll("\\.", "");
            if (replaceAll.isEmpty()) {
                return "";
            }
            if (!String.format("%,.0f", Double.valueOf(Double.parseDouble(replaceAll))).replaceAll(",", "\\.").equals("0")) {
                str2 = String.format("%,.0f", Double.valueOf(Double.parseDouble(replaceAll))).replaceAll(",", "\\.");
            }
            return str2;
        }
        String replaceAll2 = str.replaceAll("\\.", "");
        if (replaceAll2.isEmpty()) {
            return "";
        }
        String[] split = replaceAll2.split(",");
        if (split[0].isEmpty()) {
            return "";
        }
        if (!String.format("%,.0f", Double.valueOf(Double.parseDouble(split[0]))).replaceAll(",", "\\.").equals("0")) {
            str2 = String.format("%,.0f", Double.valueOf(Double.parseDouble(split[0]))).replaceAll(",", "\\.");
        }
        return str2;
    }

    public static String j(String str) {
        if (!str.contains(",")) {
            return str.isEmpty() ? "" : String.format("%,.0f", Double.valueOf(Double.parseDouble(str.replaceAll("\\.", "")))).replaceAll(",", "\\.");
        }
        if (str.isEmpty()) {
            return "";
        }
        String[] split = str.replaceAll("\\.", "").split(",");
        if (split[0].isEmpty()) {
            return "0";
        }
        if (split.length <= 1) {
            return String.format("%,.0f", Double.valueOf(Double.parseDouble(split[0]))).replaceAll(",", "\\.");
        }
        if (split[1].length() == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%,.0f", Double.valueOf(Double.parseDouble(split[0]))).replaceAll(",", "\\."));
            sb.append(",");
            sb.append(split[1]);
            sb.append("0");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("%,.0f", Double.valueOf(Double.parseDouble(split[0]))).replaceAll(",", "\\."));
        sb2.append(",");
        sb2.append(split[1]);
        return sb2.toString();
    }

    public static Boolean k(String str) {
        return Boolean.valueOf(str.equals("0000000000000") || str.equals("1111111111111") || str.equals("2222222222222") || str.equals("3333333333333") || str.equals("4444444444444") || str.equals("5555555555555") || str.equals("6666666666666") || str.equals("7777777777777") || str.equals("8888888888888") || str.equals("9999999999999"));
    }

    public static Boolean l(String str) {
        boolean z = false;
        if (str.length() > 2) {
            z = false;
            if (str.substring(0, 2).equalsIgnoreCase("00")) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public static String n(String str) {
        String str2;
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(), 0, str.length());
            String bigInteger = new BigInteger(1, instance.digest()).toString(16);
            while (true) {
                str2 = bigInteger;
                if (bigInteger.length() >= 32) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("0");
                sb.append(bigInteger);
                bigInteger = sb.toString();
            }
        } catch (NoSuchAlgorithmException e) {
            str2 = "";
        }
        return str2;
    }

    public static boolean o(String str) {
        if (str == null || str.isEmpty() || str.length() < 6) {
            return false;
        }
        if (str == null ? false : !str.matches("[0-9]+")) {
            return false;
        }
        return !(str.isEmpty() || str == null || k(str).booleanValue() || ((str.length() > 2 && str.substring(0, 2).equalsIgnoreCase("00")) || f(str)));
    }
}
