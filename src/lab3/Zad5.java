package main.java.zad5;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;
import javax.activation.*;
import java.util.*;

public class Zad5 {
    public static void zad5() throws IOException{
        EmailMessage email = EmailMessage.builder()
                .from("pallovsky@gmail.com")
                .to("pallovsky@gmail.com")
                .subject("test")
                .content("content")
                .mimeType("text/html")
                .build();

        try {
            email.send();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        System.out.println("Wysłano!");

    }
}