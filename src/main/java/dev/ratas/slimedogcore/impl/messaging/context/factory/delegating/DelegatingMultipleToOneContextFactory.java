package dev.ratas.slimedogcore.impl.messaging.context.factory.delegating;

import dev.ratas.slimedogcore.api.messaging.context.SDCSingleContext;
import dev.ratas.slimedogcore.api.messaging.context.factory.SDCSingleContextFactory;
import dev.ratas.slimedogcore.impl.messaging.context.delegating.DelegatingMultipleToOneContext;

public class DelegatingMultipleToOneContextFactory<T> implements SDCSingleContextFactory<T> {
    private final SDCSingleContextFactory<T>[] delegates;

    @SafeVarargs
    public DelegatingMultipleToOneContextFactory(SDCSingleContextFactory<T>... delegates) {
        this.delegates = delegates;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SDCSingleContext<T> getContext(T t) {
        SDCSingleContext<T>[] arr = new SDCSingleContext[delegates.length];
        for (int i = 0; i < delegates.length; i++) {
            arr[i] = delegates[i].getContext(t);
        }
        return new DelegatingMultipleToOneContext<>(arr);
    }

}
