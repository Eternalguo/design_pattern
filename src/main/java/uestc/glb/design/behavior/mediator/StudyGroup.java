package uestc.glb.design.behavior.mediator;

import java.util.Date;

/**
 * 封装一组对象交互的对象，例如此例中的StudyGroup是User之间交互的对象，User直接将消息传递给StudyGroup完成交互
 */
public class StudyGroup {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + ":"+user.getName()+":"+message);
    }
}
