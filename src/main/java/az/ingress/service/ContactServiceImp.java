package az.ingress.service;

import az.ingress.entity.ContactEntity;

import java.util.List;

public interface ContactServiceImp {

       List<ContactEntity> getAllContact();


       ContactEntity getContactById(Long id);

       ContactEntity createContact(ContactEntity contact);

       ContactEntity updateContact(Long id, ContactEntity contact);

       void deleteContact(Long id );
}
