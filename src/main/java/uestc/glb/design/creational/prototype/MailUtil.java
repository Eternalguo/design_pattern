package uestc.glb.design.creational.prototype;

import java.text.MessageFormat;

public class MailUtil {
    public static void sendMail(Mail mail){
        String output = "向{0}，地址{1}，发送邮件：{2}";
        System.out.println(MessageFormat.format(output, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }
    public static void saveMail(Mail mail){
        System.out.println(MessageFormat.format("记录邮件:{0}", mail.getContent()));
    }
}
