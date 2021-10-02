package com.example.practice1;

import com.example.practice1.mailSenderService.DummyMailSending;
import com.example.practice1.mailSenderService.LiveMailSend;
import com.example.practice1.mailSenderService.MailSender;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class MailConfig
{
    @Bean
    //@Profile("!Dev")
    @ConditionalOnProperty("spring.mail.host")//For Live mail send
    public LiveMailSend SendLiveMail(JavaMailSender javaMailSender)
    {
        return new LiveMailSend(javaMailSender);
    }
    @Bean
    //@Profile("Dev")
    @ConditionalOnProperty(name="spring.mail.host",havingValue = "foo",matchIfMissing = true)//For other one
    public MailSender dummyMailSending()
    {
        return new DummyMailSending();
    }
}