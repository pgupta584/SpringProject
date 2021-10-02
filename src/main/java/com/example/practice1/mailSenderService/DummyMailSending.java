package com.example.practice1.mailSenderService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class DummyMailSending implements MailSender
{
    private static Log log= LogFactory.getLog(DummyMailSending.class);// Just for logs
    @Override
    public void sendEmail(String SendTo, String SendSubject, String SendBody)
    {
        log.info("Sending Dummy email to emailID"+ SendTo);
        log.info("Sending Dummy email With Subject"+ SendSubject);
        log.info("Dummy Email Body - "+ SendBody);
    }
}
