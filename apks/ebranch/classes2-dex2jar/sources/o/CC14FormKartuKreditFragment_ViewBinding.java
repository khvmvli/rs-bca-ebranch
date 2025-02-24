package o;

import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes2-dex2jar.jar:o/CC14FormKartuKreditFragment_ViewBinding.class */
public final class CC14FormKartuKreditFragment_ViewBinding {
    public static LatLng a(LatLng latLng, double d, double d2) {
        double d3 = d / 6371009.0d;
        double radians = Math.toRadians(d2);
        double radians2 = Math.toRadians(latLng.c);
        double radians3 = Math.toRadians(latLng.a);
        double cos = Math.cos(d3);
        double sin = Math.sin(d3);
        double sin2 = Math.sin(radians2);
        double cos2 = sin * Math.cos(radians2);
        double cos3 = (cos * sin2) + (Math.cos(radians) * cos2);
        return new LatLng(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(radians3 + Math.atan2(cos2 * Math.sin(radians), cos - (sin2 * cos3))));
    }
}
