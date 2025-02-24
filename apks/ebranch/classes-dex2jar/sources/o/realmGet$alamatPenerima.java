package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/realmGet$alamatPenerima.class */
final class realmGet$alamatPenerima implements ObjectEncoder<MessagingClientEvent> {
    static final realmGet$alamatPenerima a = new realmGet$alamatPenerima();
    private static final FieldDescriptor b;
    private static final FieldDescriptor c;
    private static final FieldDescriptor d;
    private static final FieldDescriptor e;
    private static final FieldDescriptor f;
    private static final FieldDescriptor g;
    private static final FieldDescriptor h;
    private static final FieldDescriptor i;
    private static final FieldDescriptor j;
    private static final FieldDescriptor k;
    private static final FieldDescriptor l;
    private static final FieldDescriptor m;
    private static final FieldDescriptor n;

    /* renamed from: o  reason: collision with root package name */
    private static final FieldDescriptor f177o;
    private static final FieldDescriptor q;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("projectNumber");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima.e(1);
        d = builder.withProperty(realmset_metodepengirimanpenerima.c()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("messageId");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima2 = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima2.e(2);
        b = builder2.withProperty(realmset_metodepengirimanpenerima2.c()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("instanceId");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima3 = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima3.e(3);
        c = builder3.withProperty(realmset_metodepengirimanpenerima3.c()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("messageType");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima4 = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima4.e(4);
        e = builder4.withProperty(realmset_metodepengirimanpenerima4.c()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("sdkPlatform");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima5 = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima5.e(5);
        h = builder5.withProperty(realmset_metodepengirimanpenerima5.c()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("packageName");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima6 = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima6.e(6);
        j = builder6.withProperty(realmset_metodepengirimanpenerima6.c()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("collapseKey");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima7 = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima7.e(7);
        g = builder7.withProperty(realmset_metodepengirimanpenerima7.c()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("priority");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima8 = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima8.e(8);
        f = builder8.withProperty(realmset_metodepengirimanpenerima8.c()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("ttl");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima9 = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima9.e(9);
        i = builder9.withProperty(realmset_metodepengirimanpenerima9.c()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("topic");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima10 = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima10.e(10);
        f177o = builder10.withProperty(realmset_metodepengirimanpenerima10.c()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("bulkId");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima11 = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima11.e(11);
        n = builder11.withProperty(realmset_metodepengirimanpenerima11.c()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("event");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima12 = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima12.e(12);
        l = builder12.withProperty(realmset_metodepengirimanpenerima12.c()).build();
        FieldDescriptor.Builder builder13 = FieldDescriptor.builder("analyticsLabel");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima13 = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima13.e(13);
        k = builder13.withProperty(realmset_metodepengirimanpenerima13.c()).build();
        FieldDescriptor.Builder builder14 = FieldDescriptor.builder("campaignId");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima14 = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima14.e(14);
        m = builder14.withProperty(realmset_metodepengirimanpenerima14.c()).build();
        FieldDescriptor.Builder builder15 = FieldDescriptor.builder("composerLabel");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima15 = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima15.e(15);
        q = builder15.withProperty(realmset_metodepengirimanpenerima15.c()).build();
    }

    private realmGet$alamatPenerima() {
    }

    public final /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(d, messagingClientEvent.getProjectNumber());
        objectEncoderContext.add(b, messagingClientEvent.getMessageId());
        objectEncoderContext.add(c, messagingClientEvent.getInstanceId());
        objectEncoderContext.add(e, messagingClientEvent.getMessageType());
        objectEncoderContext.add(h, messagingClientEvent.getSdkPlatform());
        objectEncoderContext.add(j, messagingClientEvent.getPackageName());
        objectEncoderContext.add(g, messagingClientEvent.getCollapseKey());
        objectEncoderContext.add(f, messagingClientEvent.getPriority());
        objectEncoderContext.add(i, messagingClientEvent.getTtl());
        objectEncoderContext.add(f177o, messagingClientEvent.getTopic());
        objectEncoderContext.add(n, messagingClientEvent.getBulkId());
        objectEncoderContext.add(l, messagingClientEvent.getEvent());
        objectEncoderContext.add(k, messagingClientEvent.getAnalyticsLabel());
        objectEncoderContext.add(m, messagingClientEvent.getCampaignId());
        objectEncoderContext.add(q, messagingClientEvent.getComposerLabel());
    }
}
