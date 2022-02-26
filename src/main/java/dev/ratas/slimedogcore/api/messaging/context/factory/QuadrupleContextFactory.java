package dev.ratas.slimedogcore.api.messaging.context.factory;

import dev.ratas.slimedogcore.api.messaging.context.QuadrupleContext;

public interface QuadrupleContextFactory<T1, T2, T3, T4> extends ContextFactory<QuadrupleContext<T1, T2, T3, T4>> {

    QuadrupleContext<T1, T2, T3, T4> getContext(T1 t1, T2 t2, T3 t3, T4 t4);

}