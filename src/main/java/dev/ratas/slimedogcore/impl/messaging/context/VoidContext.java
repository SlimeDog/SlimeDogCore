package dev.ratas.slimedogcore.impl.messaging.context;

import dev.ratas.slimedogcore.api.messaging.context.SDCVoidContext;

public class VoidContext implements SDCVoidContext {
    public static final VoidContext INSTANCE = new VoidContext();

    @Override
    public String fill(String msg) {
        return msg;
    }

}
