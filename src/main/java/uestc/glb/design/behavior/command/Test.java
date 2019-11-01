package uestc.glb.design.behavior.command;

public class Test {
    /**
     * 命令模式：将请求封装为命令对象，以便使用不同的命令
     * @param args
     */
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("java 设计模式");
        Staff staff = new Staff();
        // 向命令接收者发送一个命令，将命令封装为一个命令对象
        staff.addCommand(new OpenCourseCommand(courseVideo));
        staff.addCommand(new CloseCourseCommand(courseVideo));
        // 命令接收者执行命令
        staff.executeCommands();
    }
}
