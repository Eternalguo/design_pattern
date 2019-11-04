package uestc.glb.design.behavior.chainofresponsibility;

public class VideoHandler extends Handler {
    @Override
    public void deploy(Course course) {
        if(course.getVideo() != null && !course.getVideo().isEmpty()){
            System.out.println(course.getName() + "含有视频，批准");
            if(this.handler != null){
                this.handler.deploy(course);
            }
        } else {
            System.out.println("不含视频，不批准，流程结束");
            return;
        }
    }
}
