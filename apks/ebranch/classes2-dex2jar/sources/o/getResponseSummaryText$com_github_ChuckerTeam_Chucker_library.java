package o;

import o.ProsesTarikanFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/getResponseSummaryText$com_github_ChuckerTeam_Chucker_library.class */
public final class getResponseSummaryText$com_github_ChuckerTeam_Chucker_library {
    public static final getScheme$com_github_ChuckerTeam_Chucker_library a = new getScheme$com_github_ChuckerTeam_Chucker_library("NO_THREAD_ELEMENTS");
    private static final onClickInfo<Object, ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, Object> e = read.d;
    private static final onClickInfo<Registry$NoSourceEncoderAvailableException<?>, ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, Registry$NoSourceEncoderAvailableException<?>> b = write.a;
    private static final onClickInfo<isRequestBodyPlainText, ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, isRequestBodyPlainText> c = getResponseSummaryText$com_github_ChuckerTeam_Chucker_library$MediaBrowserCompat$CustomActionResultReceiver.d;

    /* loaded from: classes2-dex2jar.jar:o/getResponseSummaryText$com_github_ChuckerTeam_Chucker_library$read.class */
    static final class read extends subscribeDraftTxnBerkalaEvent implements onClickInfo<Object, ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, Object> {
        public static final read d = new read();

        read() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ProsesTarikanFragment_ViewBinding.IconCompatParcelizer iconCompatParcelizer = (ProsesTarikanFragment_ViewBinding.IconCompatParcelizer) obj2;
            if (!(iconCompatParcelizer instanceof Registry$NoSourceEncoderAvailableException)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            Object obj3 = iconCompatParcelizer;
            if (intValue != 0) {
                obj3 = Integer.valueOf(intValue + 1);
            }
            return obj3;
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/getResponseSummaryText$com_github_ChuckerTeam_Chucker_library$write.class */
    static final class write extends subscribeDraftTxnBerkalaEvent implements onClickInfo<Registry$NoSourceEncoderAvailableException<?>, ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, Registry$NoSourceEncoderAvailableException<?>> {
        public static final write a = new write();

        write() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            Registry$NoSourceEncoderAvailableException registry$NoSourceEncoderAvailableException = (Registry$NoSourceEncoderAvailableException) obj;
            ProsesTarikanFragment_ViewBinding.IconCompatParcelizer iconCompatParcelizer = (ProsesTarikanFragment_ViewBinding.IconCompatParcelizer) obj2;
            Registry$NoSourceEncoderAvailableException registry$NoSourceEncoderAvailableException2 = registry$NoSourceEncoderAvailableException;
            if (registry$NoSourceEncoderAvailableException == null) {
                registry$NoSourceEncoderAvailableException2 = iconCompatParcelizer instanceof Registry$NoSourceEncoderAvailableException ? (Registry$NoSourceEncoderAvailableException) iconCompatParcelizer : null;
            }
            return registry$NoSourceEncoderAvailableException2;
        }
    }

    public static final Object b(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding) {
        Object e2 = prosesTarikanFragment_ViewBinding.e(0, e);
        subscribeReservationRescheduleEvent.c(e2);
        return e2;
    }

    public static final Object b(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, Object obj) {
        Object obj2 = obj;
        if (obj == null) {
            obj2 = prosesTarikanFragment_ViewBinding.e(0, e);
            subscribeReservationRescheduleEvent.c(obj2);
        }
        return obj2 == 0 ? a : obj2 instanceof Integer ? prosesTarikanFragment_ViewBinding.e(new isRequestBodyPlainText(prosesTarikanFragment_ViewBinding, ((Number) obj2).intValue()), c) : ((Registry$NoSourceEncoderAvailableException) obj2).c(prosesTarikanFragment_ViewBinding);
    }

    public static final void d(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, Object obj) {
        if (obj != a) {
            if (obj instanceof isRequestBodyPlainText) {
                isRequestBodyPlainText isrequestbodyplaintext = (isRequestBodyPlainText) obj;
                int length = isrequestbodyplaintext.c.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        Registry$NoSourceEncoderAvailableException<Object> registry$NoSourceEncoderAvailableException = isrequestbodyplaintext.c[length];
                        subscribeReservationRescheduleEvent.c(registry$NoSourceEncoderAvailableException);
                        registry$NoSourceEncoderAvailableException.a(prosesTarikanFragment_ViewBinding, isrequestbodyplaintext.d[length]);
                        if (i >= 0) {
                            length = i;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Object e2 = prosesTarikanFragment_ViewBinding.e(null, b);
                if (e2 != null) {
                    ((Registry$NoSourceEncoderAvailableException) e2).a(prosesTarikanFragment_ViewBinding, obj);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
        }
    }
}
