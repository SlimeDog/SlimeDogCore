package dev.ratas.slimedogcore.impl.messaging.factory;

import dev.ratas.slimedogcore.api.messaging.context.SDCQuadrupleContext;
import dev.ratas.slimedogcore.api.messaging.context.factory.SDCQuadrupleContextFactory;
import dev.ratas.slimedogcore.api.messaging.delivery.MessageTarget;
import dev.ratas.slimedogcore.api.messaging.factory.SDCQuadrupleContextMessageFactory;

public class QuadrupleContextMessageFactory<T1, T2, T3, T4> extends MessageFactory<SDCQuadrupleContext<T1, T2, T3, T4>>
        implements SDCQuadrupleContextMessageFactory<T1, T2, T3, T4> {

    public QuadrupleContextMessageFactory(SDCQuadrupleContextFactory<T1, T2, T3, T4> contextFactory, String raw,
            MessageTarget msgTarget) {
        super(contextFactory, raw, msgTarget);
    }

    @Override
    public SDCQuadrupleContextFactory<T1, T2, T3, T4> getContextFactory() {
        return (SDCQuadrupleContextFactory<T1, T2, T3, T4>) super.getContextFactory();
    }

}
