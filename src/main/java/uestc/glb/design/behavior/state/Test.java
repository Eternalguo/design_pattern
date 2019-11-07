package uestc.glb.design.behavior.state;

public class Test {
    public static void main(String[] args) {
        VideoContext context = new VideoContext();
        context.setVideoState(VideoContext.PLAY_STATE);
        System.out.println("当前状态："+context.getVideoState().getClass().getSimpleName());
        context.getVideoState().pause();
        System.out.println("当前状态："+context.getVideoState().getClass().getSimpleName());
        context.getVideoState().speed();
        System.out.println("当前状态："+context.getVideoState().getClass().getSimpleName());
        context.getVideoState().stop();
        System.out.println("当前状态："+context.getVideoState().getClass().getSimpleName());
    }
}
