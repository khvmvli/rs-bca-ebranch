package o;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes-dex2jar.jar:o/setTxnType.class */
public final class setTxnType extends getAdditionalInfo<InputStream> {
    private static final UriMatcher a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public setTxnType(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    @Override // o.getAdditionalInfo
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected final /* synthetic */ java.io.InputStream a(android.net.Uri r5, android.content.ContentResolver r6) throws java.io.FileNotFoundException {
        /*
            r4 = this;
            android.content.UriMatcher r0 = o.setTxnType.a
            r1 = r5
            int r0 = r0.match(r1)
            r7 = r0
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L_0x002a
            r0 = r7
            r1 = 3
            if (r0 == r1) goto L_0x0020
            r0 = r7
            r1 = 5
            if (r0 == r1) goto L_0x002a
            r0 = r6
            r1 = r5
            java.io.InputStream r0 = r0.openInputStream(r1)
            r6 = r0
            goto L_0x003e
        L_0x0020:
            r0 = r6
            r1 = r5
            r2 = 1
            java.io.InputStream r0 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r0, r1, r2)
            r6 = r0
            goto L_0x003e
        L_0x002a:
            r0 = r6
            r1 = r5
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.lookupContact(r0, r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L_0x0060
            r0 = r6
            r1 = r8
            r2 = 1
            java.io.InputStream r0 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r0, r1, r2)
            r6 = r0
        L_0x003e:
            r0 = r6
            if (r0 == 0) goto L_0x0044
            r0 = r6
            return r0
        L_0x0044:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "InputStream is null for "
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L_0x0060:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r1 = r0
            java.lang.String r2 = "Contact cannot be found"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTxnType.a(android.net.Uri, android.content.ContentResolver):java.lang.Object");
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable
    public final Class<InputStream> e() {
        return InputStream.class;
    }

    @Override // o.getAdditionalInfo
    protected final /* synthetic */ void e(InputStream inputStream) throws IOException {
        inputStream.close();
    }
}
