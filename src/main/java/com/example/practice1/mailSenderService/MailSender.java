package com.example.practice1.mailSenderService;

import javax.mail.MessagingException;

public interface MailSender
{
    public void sendEmail(String SendTo,String SendSubject,String SendBody) throws MessagingException;
}
