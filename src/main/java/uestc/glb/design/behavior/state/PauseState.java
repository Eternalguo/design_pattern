package uestc.glb.design.behavior.state;

public class PauseState extends VideoState {
    @Override
    public void play() {
        super.context.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        super.context.setVideoState(VideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        System.out.println("暂停播放");
    }

    @Override
    public void stop() {
        super.context.setVideoState(VideoContext.STOP_STATE);
    }
}
