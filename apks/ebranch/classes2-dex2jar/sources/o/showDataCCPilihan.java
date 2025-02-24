package o;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.firebase.analytics.FirebaseAnalytics;
/* loaded from: classes2-dex2jar.jar:o/showDataCCPilihan.class */
final class showDataCCPilihan extends onChooseNomorRekening {
    private static final UriMatcher c;
    private final Context b;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        c = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public showDataCCPilihan(Context context) {
        this.b = context;
    }

    @Override // o.onChooseNomorRekening
    public final boolean c(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) {
        Uri uri = cC9FormKartuKreditFragment_ViewBinding.q;
        return FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && c.match(cC9FormKartuKreditFragment_ViewBinding.q) != -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    @Override // o.onChooseNomorRekening
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final o.onChooseNomorRekening.IconCompatParcelizer d(o.CC9FormKartuKreditFragment_ViewBinding r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = r5
            android.content.Context r0 = r0.b
            android.content.ContentResolver r0 = r0.getContentResolver()
            r7 = r0
            r0 = r6
            android.net.Uri r0 = r0.q
            r8 = r0
            android.content.UriMatcher r0 = o.showDataCCPilihan.c
            r1 = r8
            int r0 = r0.match(r1)
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r9
            r1 = 1
            if (r0 == r1) goto L_0x005b
            r0 = r9
            r1 = 2
            if (r0 == r1) goto L_0x0052
            r0 = r8
            r6 = r0
            r0 = r9
            r1 = 3
            if (r0 == r1) goto L_0x006c
            r0 = r9
            r1 = 4
            if (r0 != r1) goto L_0x0036
            goto L_0x0052
        L_0x0036:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "Invalid uri: "
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L_0x0052:
            r0 = r7
            r1 = r8
            java.io.InputStream r0 = r0.openInputStream(r1)
            r6 = r0
            goto L_0x0073
        L_0x005b:
            r0 = r7
            r1 = r8
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.lookupContact(r0, r1)
            r8 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            if (r0 != 0) goto L_0x006c
            r0 = 0
            r6 = r0
            goto L_0x0073
        L_0x006c:
            r0 = r7
            r1 = r6
            r2 = 1
            java.io.InputStream r0 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r0, r1, r2)
            r6 = r0
        L_0x0073:
            r0 = r6
            if (r0 == 0) goto L_0x0084
            o.onChooseNomorRekening$IconCompatParcelizer r0 = new o.onChooseNomorRekening$IconCompatParcelizer
            r1 = r0
            r2 = r6
            o.onChooseTanggalJatuhTempo$write r3 = o.onChooseTanggalJatuhTempo.write.DISK
            r1.<init>(r2, r3)
            r10 = r0
        L_0x0084:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.showDataCCPilihan.d(o.CC9FormKartuKreditFragment_ViewBinding):o.onChooseNomorRekening$IconCompatParcelizer");
    }
}
