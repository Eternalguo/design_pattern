package uestc.glb.design.behavior.state;

public abstract class VideoState {
    protected VideoContext context;
    public void setContext(VideoContext videoContext){
        this.context = videoContext;
    }
    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();
}
