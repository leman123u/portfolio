package az.ingress.controller;

import az.ingress.entity.ContactEntity;
import az.ingress.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/contact")
public class ContactController {

    private  final ContactService contactService;


    @GetMapping
    public List<ContactEntity> getAllContacts() {
        return contactService.getAllContact();
    }

    @GetMapping("/{id}")
    public ContactEntity getContactById(@PathVariable Long id) {
        return contactService.getContactById(id);
    }

    @PostMapping
    public ContactEntity createContact(@RequestBody ContactEntity contact) {
        return contactService.createContact(contact);
    }

    @PutMapping("/{id}")
    public ContactEntity updateContact(@PathVariable Long id, @RequestBody ContactEntity contact) {
        return contactService.updateContact(id, contact);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteContact(@PathVariable Long id) {
        contactService.deleteContact(id);
        return ResponseEntity .noContent().build();
    }
}










