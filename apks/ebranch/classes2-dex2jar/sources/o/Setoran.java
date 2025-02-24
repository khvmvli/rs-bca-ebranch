package o;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2-dex2jar.jar:o/Setoran.class */
public final class Setoran {
    private Bundle b;
    final /* synthetic */ realmGet$FlagRepresentativeTransaction e;
    private final String a = "default_event_parameters";
    private final Bundle d = new Bundle();

    public Setoran(realmGet$FlagRepresentativeTransaction realmget_flagrepresentativetransaction, String str, Bundle bundle) {
        this.e = realmget_flagrepresentativetransaction;
        setFotoKtp.c("default_event_parameters");
    }

    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        SharedPreferences.Editor edit = this.e.a().edit();
        if (bundle2.size() == 0) {
            edit.remove(this.a);
        } else {
            String str = this.a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.e.q.s_().b().e("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.e.q.s_().b().e("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.b = bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6 A[Catch: NumberFormatException | JSONException -> 0x0105, NumberFormatException | JSONException -> 0x0105, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x0105, blocks: (B:11:0x0041, B:11:0x0041, B:34:0x00bb, B:34:0x00bb, B:35:0x00d2, B:35:0x00d2, B:36:0x00e4, B:37:0x00f6, B:37:0x00f6), top: B:49:0x0041, outer: #1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final android.os.Bundle c() {
        /*
        // Method dump skipped, instructions count: 333
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Setoran.c():android.os.Bundle");
    }
}
