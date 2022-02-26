package dev.ratas.slimedogcore.impl.messaging.factory;

import dev.ratas.slimedogcore.api.messaging.context.SDCVoidContext;
import dev.ratas.slimedogcore.api.messaging.context.factory.SDCContextFactory;
import dev.ratas.slimedogcore.api.messaging.factory.SDCVoidContextMessageFactory;

public class VoidContextMessageFactory extends MessageFactory<SDCVoidContext> implements SDCVoidContextMessageFactory {

    public VoidContextMessageFactory(Class<?> messageClass, Class<?> contextClass,
            SDCContextFactory<SDCVoidContext> contextFactory, String raw) {
        super(messageClass, contextClass, contextFactory, raw);
    }

}