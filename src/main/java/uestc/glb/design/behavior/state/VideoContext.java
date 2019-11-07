package uestc.glb.design.behavior.state;

/**
 * VideoState作为视频的上下文，封装了视频的状态
 */
public class VideoContext {
    private VideoState videoState;
    public static final VideoState PLAY_STATE = new PlayState();
    public static final VideoState STOP_STATE = new StopState();
    public static final VideoState PAUSE_STATE = new PauseState();
    public static final VideoState SPEED_STATE = new SpeedState();

    public VideoState getVideoState() {
        return videoState;
    }

    public void setVideoState(VideoState videoState) {
        this.videoState = videoState;
        this.videoState.setContext(this);
    }
}
