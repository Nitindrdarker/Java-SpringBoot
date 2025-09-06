package com.example.example_10.controller;

import com.example.example_10.model.Contact;
import com.example.example_10.services.ContactService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ContactController {
    private final ContactService contactService;
    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("contact", new Contact()); // this is needed for validation to work
        return "contact.html"; // This will render the contact.html template
    }


//    @RequestMapping(value="/saveMsg", method = POST)
//        public ModelAndView saveMessage(@RequestParam String name,
//                                        @RequestParam String email,
//                                        @RequestParam String mobileNum,
//                                        @RequestParam String subject,
//                                        @RequestParam String message) {
//            // Here, you would typically save the message to a database or send an email
//            // For this example, we'll just print it to the console
//            System.out.println("Message received from: " + name);
//            System.out.println("Email: " + email);
//            System.out.println("Subject: " + subject);
//            System.out.println("Message: " + message);
//            System.out.println("Mobile Number: " + mobileNum);
//
//            return new ModelAndView("redirect:/contact");


//        }


    @RequestMapping(value="/saveMsg", method = POST)
    public String saveMessage(@Valid @ModelAttribute("contact") Contact contact, Errors error) {
        // Here, you would typically save the message to a database or send an email
        // For this example, we'll just print it to the console
        if(error.hasErrors()){
            System.out.println("Validation errors occurred");
            return "contact.html";
        }
        contactService.saveMessageDetails(contact);
        contactService.setCounter(contactService.getCounter() + 1);
        System.out.println("Counter: " + contactService.getCounter());
        return "redirect:/contact";

    }
}


