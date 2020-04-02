package pl.client.logicClient.workingWithMail;

import pl.content.forAccount.Account;
import pl.content.forAccount.BaseAccounts;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Sending {
    public Sending(String subject, String text, String forRole) {

        final String emailProgram = "u570028@gmail.com";
        final String password = "23D-u2h-Vu4-mFu";

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(emailProgram, password);
                    }
                });

        try {
            for (Account account : BaseAccounts.baseAccounts)
                if (account.getRole().equals(forRole)) {
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(emailProgram));
                    message.setRecipients(Message.RecipientType.TO,
                            InternetAddress.parse(account.getEmail()));
                    message.setSubject(subject);
                    message.setText(text);

                    Transport.send(message);

                    System.out.println("Отправлено");
                }
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}