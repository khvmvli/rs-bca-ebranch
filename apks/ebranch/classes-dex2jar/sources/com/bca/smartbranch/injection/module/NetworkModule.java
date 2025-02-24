package com.bca.smartbranch.injection.module;

import android.content.Context;
import com.facebook.stetho.okhttp3.StethoInterceptor;
import io.realm.internal.Property;
import java.util.concurrent.TimeUnit;
import o.CC25CFormKartuKreditFragment;
import o.Page6ILFragment_ViewBinding;
import o.getBenefit;
import o.onChooseValueDescPekerjaan;
import o.setIncomeDisplayAmount;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/injection/module/NetworkModule.class */
public class NetworkModule {
    private static char[] a = {137, 154, 138, 156, 154, 137, 149, 155, 'W', 'W', 'b', 155, 152, 156, 156, 144, 'W', 150, 137, 154, 138, 155, 'W', 140, 145, 'V', 151, 139, 'V', 137, 139, 138, 'V', 144, 139, 150};
    private static int b;
    private static int d;
    private Context e;

    public NetworkModule(Context context) {
        this.e = context;
    }

    private static void e(boolean z, int[] iArr, byte[] bArr, Object[] objArr) {
        String str;
        synchronized (CC25CFormKartuKreditFragment.b) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(a, i, cArr, 0, i2);
            char[] cArr2 = cArr;
            if (bArr != null) {
                cArr2 = new char[i2];
                CC25CFormKartuKreditFragment.d = 0;
                char c = 0;
                while (CC25CFormKartuKreditFragment.d < i2) {
                    if (bArr[CC25CFormKartuKreditFragment.d] == 1) {
                        cArr2[CC25CFormKartuKreditFragment.d] = (char) ((char) (((cArr[CC25CFormKartuKreditFragment.d] << 1) + 1) - c));
                    } else {
                        cArr2[CC25CFormKartuKreditFragment.d] = (char) ((char) ((cArr[CC25CFormKartuKreditFragment.d] << 1) - c));
                    }
                    c = cArr2[CC25CFormKartuKreditFragment.d];
                    CC25CFormKartuKreditFragment.d++;
                }
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr2, i5, i4);
                System.arraycopy(cArr3, i4, cArr2, 0, i5);
            }
            char[] cArr4 = cArr2;
            if (z) {
                cArr4 = new char[i2];
                CC25CFormKartuKreditFragment.d = 0;
                while (CC25CFormKartuKreditFragment.d < i2) {
                    cArr4[CC25CFormKartuKreditFragment.d] = (char) cArr2[(i2 - CC25CFormKartuKreditFragment.d) - 1];
                    CC25CFormKartuKreditFragment.d++;
                }
            }
            if (i3 > 0) {
                CC25CFormKartuKreditFragment.d = 0;
                while (CC25CFormKartuKreditFragment.d < i2) {
                    cArr4[CC25CFormKartuKreditFragment.d] = (char) ((char) (cArr4[CC25CFormKartuKreditFragment.d] - iArr[2]));
                    CC25CFormKartuKreditFragment.d++;
                }
            }
            str = new String(cArr4);
        }
        objArr[0] = str;
    }

    @onChooseValueDescPekerjaan
    public setIncomeDisplayAmount a(@Page6ILFragment_ViewBinding(d = "ebranchRetrofit") Retrofit retrofit) {
        d = (b + 55) % Property.TYPE_ARRAY;
        setIncomeDisplayAmount setincomedisplayamount = (setIncomeDisplayAmount) retrofit.create(setIncomeDisplayAmount.class);
        try {
            b = (d + 81) % Property.TYPE_ARRAY;
            return setincomedisplayamount;
        } catch (Exception e) {
            throw e;
        }
    }

    @Page6ILFragment_ViewBinding(d = "ebranchHttpUrl")
    @onChooseValueDescPekerjaan
    public HttpUrl a() {
        d = (b + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC) % Property.TYPE_ARRAY;
        Object[] objArr = new Object[1];
        e(true, new int[]{0, 36, 40, 16}, null, objArr);
        HttpUrl parse = HttpUrl.parse(((String) objArr[0]).intern());
        b = (d + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB) % Property.TYPE_ARRAY;
        return parse;
    }

    @Page6ILFragment_ViewBinding(d = "ebranchRetrofit")
    @onChooseValueDescPekerjaan
    public Retrofit a(@Page6ILFragment_ViewBinding(d = "ebranchHttpUrl") HttpUrl httpUrl, @Page6ILFragment_ViewBinding(d = "ebranchOkHttpClient") OkHttpClient okHttpClient) {
        Retrofit build = new Retrofit.Builder().baseUrl(httpUrl).client(okHttpClient).addConverterFactory(GsonConverterFactory.create()).build();
        b = (d + 41) % Property.TYPE_ARRAY;
        return build;
    }

    @Page6ILFragment_ViewBinding(d = "ebranchOkHttpClient")
    @onChooseValueDescPekerjaan
    public OkHttpClient d() {
        OkHttpClient build = new OkHttpClient.Builder().addNetworkInterceptor(new StethoInterceptor()).addInterceptor(new getBenefit()).connectTimeout(30, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS).writeTimeout(30, TimeUnit.SECONDS).build();
        int i = d + 63;
        b = i % Property.TYPE_ARRAY;
        if ((i % 2 == 0 ? 3 : '(') != 3) {
            return build;
        }
        throw new NullPointerException();
    }
}
