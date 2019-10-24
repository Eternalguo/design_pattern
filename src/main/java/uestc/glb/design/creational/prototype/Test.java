package uestc.glb1.design.creational.prototype;

/**
 * 在使用原型模式的时候要注意浅拷贝和深拷贝的问题而引发的bug，Jdk中默认实现是浅拷贝
 * 要实现深拷贝，可以通过实现Cloneable，重写Object中的clone方法,先调用super.clone完成浅拷贝
 * 再对对象中的可变属性进行拷贝
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setValue(1);
        mail.setName("init");
        mail.setEmailAddress("init@qq.com");
        mail.setContent("初始化内容");
        for (int i = 0; i < 5; i++) {
//            Mail mailTemp = mail;
            Mail mailTemp = (Mail) mail.clone();
//            mailTemp.setName(""+i);
//            mailTemp.setEmailAddress(i+"@qq.com");
//            mailTemp.setContent(i+"好好学习");
//            MailUtil.sendMail(mail);
            System.out.println(mailTemp);
        }
        MailUtil.saveMail(mail);
    }
}
