package dev.ratas.slimedogcore.impl.messaging.factory;

import dev.ratas.slimedogcore.api.messaging.SDCMessage;
import dev.ratas.slimedogcore.api.messaging.context.SDCContext;
import dev.ratas.slimedogcore.api.messaging.context.factory.SDCContextFactory;
import dev.ratas.slimedogcore.api.messaging.delivery.SDCMessageDeliverer;
import dev.ratas.slimedogcore.impl.messaging.ContextMessage;

public class MessageFactory<T extends SDCContext> extends AbstractMessageFactory<T> {
    private final String raw;

    public MessageFactory(SDCContextFactory<T> contextFactory, String raw, SDCMessageDeliverer messageDeliverer) {
        super(contextFactory, messageDeliverer);
        this.raw = raw;
    }

    @Override
    public SDCMessage<T> getMessage(T context) {
        return new ContextMessage<>(raw, context, messageDeliverer);
    }

}
