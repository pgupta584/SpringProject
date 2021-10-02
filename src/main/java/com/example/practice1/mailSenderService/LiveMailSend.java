package com.example.practice1.mailSenderService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

//@Component("liveMail")
//@Qualifier("SendLiveMail")
public class LiveMailSend implements MailSender {
    private static Log log= LogFactory.getLog(DummyMailSending.class);// Just for logs
    private JavaMailSender javaMailSender;
    //SMTP mail
    public LiveMailSend(JavaMailSender javaMailSender) {

        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendEmail(String SendTo, String SendSubject, String SendBody) throws MessagingException {
        /*log.info("Sending Live email to emailID"+ SendTo);
        log.info("Sending Live email With Subject"+ SendSubject);
        log.info("Live Email Body - "+ SendBody);
         */
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper;

        helper = new MimeMessageHelper(message, true); // true indicates
        // multipart message
        helper.setSubject(SendSubject);
        helper.setTo(SendTo);
        helper.setText(SendBody, true); // true indicates html

        // continue using helper for more functionalities
        // like adding attachments, etc.

        javaMailSender.send(message);
    }
}
