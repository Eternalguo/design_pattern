package uestc.glb.design.behavior.state;

public class SpeedState extends VideoState {
    @Override
    public void play() {
        super.context.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("快进");
    }

    @Override
    public void pause() {
        super.context.setVideoState(VideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.context.setVideoState(VideoContext.STOP_STATE);
    }
}
