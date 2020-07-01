package com.leverx.jblog.service.mailing;

public interface EmailSenderService {

    void sendEmail(String to, String subject, String text);
}
