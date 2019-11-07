package uestc.glb.design.behavior.state;

public class StopState extends VideoState{
    @Override
    public void play() {
        super.context.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("ERROR 不能快进");
    }

    @Override
    public void pause() {
        System.out.println("ERROR 不能暂停");
    }

    @Override
    public void stop() {
        System.out.println("停止播放");
    }
}
