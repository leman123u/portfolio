package az.ingress.service;

import az.ingress.entity.UserEntity;

import java.util.List;

public interface UserServiceImplement {

    List<UserEntity> getAllUsers();


    UserEntity getUsersById(Long id);

    UserEntity createUser(UserEntity user);

    UserEntity updateUser(Long id ,UserEntity user);

    void  deleteUser(Long id);

}
