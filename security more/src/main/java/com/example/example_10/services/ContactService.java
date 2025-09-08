package com.example.example_10.services;

import com.example.example_10.model.Contact;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Service
//@RequestScope // each HTTP request will have its own instance of ContactService
//@SessionScope // each user session will have its own instance of ContactService
@ApplicationScope // single instance of ContactService will be created for the entire application
public class ContactService {

    private int counter = 0;

    public ContactService(){
        System.out.println("ContactService instance created");
    }

    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = true;
        System.out.println(contact.toString());
        return isSaved;
    }

    public int getCounter(){
        return counter;
    }

    public void setCounter(int counter){
        this.counter = counter;

    }


}
