package uestc.glb.design.behavior.state;

public class PlayState extends VideoState {
    @Override
    public void play() {
        System.out.println("视频正常播放");
    }

    /**
     * 设置对象的状态
     */
    @Override
    public void speed() {
        super.context.setVideoState(VideoContext.SPEED_STATE);
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
