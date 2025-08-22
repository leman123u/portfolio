package az.ingress.service;

import az.ingress.entity.UserEntity;
import az.ingress.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements UserServiceImplement {

    private  final UserRepository userRepository;


    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity getUsersById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id:"+ id));
    }

    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public UserEntity updateUser(Long id, UserEntity user) {
        var existingUser = getUsersById(id);
        existingUser.setPassword(user.getPassword());
        existingUser.setExperience(user.getExperience());
        existingUser.setProfession(user.getProfession());
        existingUser.setSocial_links(user.getSocial_links());
        existingUser.setName(user.getName());
        return userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(Long id) {
     if (!userRepository.existsById(id)){
         throw new RuntimeException("User not found with id:"+ id);
     }
     userRepository.deleteById(id);
    }
}





