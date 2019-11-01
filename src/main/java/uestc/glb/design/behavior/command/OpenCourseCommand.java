package uestc.glb.design.behavior.command;

public class OpenCourseCommand implements Command {
    private CourseVideo courseVideo;

    public OpenCourseCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
