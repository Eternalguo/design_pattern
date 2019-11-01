package uestc.glb.design.behavior.observer;

public class Test {
    public static void main(String[] args) {
        Teacher geely = new Teacher("geely");
        Course designPattern = new Course("java 设计模式");
        Course jvm = new Course("java 虚拟机");
        designPattern.addObserver(geely);
        jvm.addObserver(geely);
        Question q1 = new Question();
        q1.setUserName("glb");
        q1.setQuestionContent("如何学好设计模式");
        /**
         * obserable被观察对象Course调用produceQuestion更新了状态，观察者teacher对象收到了通知，调用update方法
         */
        designPattern.produceQuestion(designPattern, q1);
    }
}
