package uestc.glb.design.behavior.chainofresponsibility;

import lombok.NonNull;

/**
 * 责任链模式中的请求处理对象，将handler组织成一个链，请求在这个链上从前向后依次处理
 */
public abstract class Handler {
    protected Handler handler;

    public void setNextHandler(Handler handler){
        this.handler = handler;
    }
    public abstract void deploy(@NonNull Course course);
}
