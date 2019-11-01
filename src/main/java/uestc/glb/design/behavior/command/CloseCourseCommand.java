package uestc.glb.design.behavior.command;

public class CloseCourseCommand implements Command {
    private CourseVideo courseVideo;

    public CloseCourseCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
