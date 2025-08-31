package com.example.example_10.services;

import com.example.example_10.model.Contact;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = true;
        System.out.println(contact.toString());
        return isSaved;
    }
}
