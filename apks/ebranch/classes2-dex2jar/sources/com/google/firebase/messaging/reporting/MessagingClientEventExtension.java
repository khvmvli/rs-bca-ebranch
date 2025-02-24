package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.annotations.Encodable;
import java.io.IOException;
import java.io.OutputStream;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/messaging/reporting/MessagingClientEventExtension.class */
public final class MessagingClientEventExtension {
    private static final MessagingClientEventExtension DEFAULT_INSTANCE = new Builder().build();
    private final MessagingClientEvent messaging_client_event_;

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/messaging/reporting/MessagingClientEventExtension$Builder.class */
    public static final class Builder {
        private MessagingClientEvent messaging_client_event_ = null;

        Builder() {
        }

        public final MessagingClientEventExtension build() {
            return new MessagingClientEventExtension(this.messaging_client_event_);
        }

        public final Builder setMessagingClientEvent(MessagingClientEvent messagingClientEvent) {
            this.messaging_client_event_ = messagingClientEvent;
            return this;
        }
    }

    MessagingClientEventExtension(MessagingClientEvent messagingClientEvent) {
        this.messaging_client_event_ = messagingClientEvent;
    }

    public static MessagingClientEventExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Encodable.Ignore
    public final MessagingClientEvent getMessagingClientEvent() {
        MessagingClientEvent messagingClientEvent = this.messaging_client_event_;
        MessagingClientEvent messagingClientEvent2 = messagingClientEvent;
        if (messagingClientEvent == null) {
            messagingClientEvent2 = MessagingClientEvent.getDefaultInstance();
        }
        return messagingClientEvent2;
    }

    @Encodable.Field(name = "messagingClientEvent")
    public final MessagingClientEvent getMessagingClientEventInternal() {
        return this.messaging_client_event_;
    }

    public final byte[] toByteArray() {
        return realmGet.norekPenerima.c(this);
    }

    public final void writeTo(OutputStream outputStream) throws IOException {
        realmGet.norekPenerima.c(this, outputStream);
    }
}
