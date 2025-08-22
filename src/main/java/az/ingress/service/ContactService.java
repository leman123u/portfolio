package az.ingress.service;

import az.ingress.entity.ContactEntity;
import az.ingress.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactService  implements ContactServiceImp {

    private  final ContactRepository contactRepository;


    @Override
    public List<ContactEntity> getAllContact() {
        return contactRepository.findAll();
    }

    @Override
    public ContactEntity getContactById(Long id) {
        return contactRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contact not found wth id:"+ id));
    }

    @Override
    public ContactEntity createContact(ContactEntity contact) {
        return contactRepository.save(contact);
    }

    @Override
    public ContactEntity updateContact(Long id, ContactEntity contact) {
        var existingContact = getContactById(id);
        existingContact.setEmail(contact.getEmail());
        existingContact.setName(contact.getName());
        existingContact.setMessage(contact.getMessage());
        existingContact.setCreatedAt(contact.getCreatedAt());

        return contactRepository.save(existingContact);
    }

    @Override
    public void deleteContact(Long id) {
        if (!contactRepository.existsById(id)){
            throw  new RuntimeException("Contact not found with id : + id");

        }
        contactRepository.deleteById(id);
    }
}
