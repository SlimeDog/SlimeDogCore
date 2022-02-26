package dev.ratas.slimedogcore.impl.messaging.context.delegating;

import dev.ratas.slimedogcore.api.messaging.context.SDCDoubleContext;
import dev.ratas.slimedogcore.api.messaging.context.SDCQuadrupleContext;

public class DelegatingQuadrupleDoubleDoubleContext<T1, T2, T3, T4> implements SDCQuadrupleContext<T1, T2, T3, T4> {
    private final SDCDoubleContext<T1, T2> delegate1;
    private final SDCDoubleContext<T3, T4> delegate2;

    public DelegatingQuadrupleDoubleDoubleContext(SDCDoubleContext<T1, T2> delegate1,
            SDCDoubleContext<T3, T4> delegate2) {
        this.delegate1 = delegate1;
        this.delegate2 = delegate2;
    }

    @Override
    public String fill(String msg) {
        msg = delegate1.fill(msg);
        msg = delegate2.fill(msg);
        return msg;
    }

    @Override
    public T1 getContentsOne() {
        return delegate1.getContentsOne();
    }

    @Override
    public T2 getContentsTwo() {
        return delegate1.getContentsTwo();
    }

    @Override
    public T3 getContentsThree() {
        return delegate2.getContentsOne();
    }

    @Override
    public T4 getContentsFour() {
        return delegate2.getContentsTwo();
    }

}
