package com.example.practice1.mailSenderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class MailController {

    //Creating Object to call sendMail method
    //private MailSender mail=new LiveMailSend();
    //@Autowired // Let's have constructor and see
    private MailSender mailsender;
    /*public MailController(MailSender liveMailSend)
    {
        this.mailsender=liveMailSend;
    }
     */
    //User define beans
    //public MailController(@Qualifier("SendLiveMail") MailSender liveMail)
    public MailController(MailSender liveMail)//Removed Qualifier
    {
        this.mailsender=liveMail;
    }
    @RequestMapping("/mail")
    public String mail() throws MessagingException
    {
        mailsender.sendEmail("pgupta584@gmail.com","Dummy Mail","I am sending dummy Mail via Springboot");
        return "Mail Sent";
    }
}
