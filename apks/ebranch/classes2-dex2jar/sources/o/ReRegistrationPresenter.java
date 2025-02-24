package o;

import o.Page6KLFragment;
/* loaded from: classes2-dex2jar.jar:o/ReRegistrationPresenter.class */
public final class ReRegistrationPresenter {
    public static final String e(ProsesTarikanFragment<?> prosesTarikanFragment) {
        Object obj;
        String str;
        if (prosesTarikanFragment instanceof getRequestContentType) {
            str = prosesTarikanFragment.toString();
        } else {
            try {
                Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver = Page6KLFragment.a;
                StringBuilder sb = new StringBuilder();
                sb.append(prosesTarikanFragment);
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(prosesTarikanFragment)));
                obj = Page6KLFragment.d(sb.toString());
            } catch (Throwable th) {
                Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver2 = Page6KLFragment.a;
                subscribeReservationRescheduleEvent.e(th, "");
                obj = Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(th));
            }
            String str2 = obj;
            if (Page6KLFragment.e(obj) != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) prosesTarikanFragment.getClass().getName());
                sb2.append('@');
                sb2.append(Integer.toHexString(System.identityHashCode(prosesTarikanFragment)));
                str2 = sb2.toString();
            }
            str = (String) str2;
        }
        return str;
    }
}
