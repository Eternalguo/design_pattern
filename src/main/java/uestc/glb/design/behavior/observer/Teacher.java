package uestc.glb.design.behavior.observer;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course)o;
        Question question = (Question) arg;
        System.out.println(teacherName+"在课程"+course.getCourseName()+"接受到一个"+question.getQuestionContent());
    }

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }
}
