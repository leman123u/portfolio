package az.ingress.servic;


import az.ingress.entity.UserEntity;
import az.ingress.exception.NotFoundException;
import az.ingress.model.request.UpdatePasswordRequest;
import az.ingress.model.request.UserRequest;
import az.ingress.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private  final UserRepository userRepository;


    public  void saveUser(UserRequest userRequest){
        userRepository.save(
                UserEntity.builder()
                        .experience(userRequest.getExperience())
                        .password(userRequest.getPassword())
                        .name(userRequest.getName())
                        .profession(userRequest.getProfession())
                        .social_links(userRequest.getSocial_links())
                        .build()


        );
    }

      public  void updatePassword(Long id ,
                                  UpdatePasswordRequest request){
               var user = userRepository.findById(id)
                       .orElseThrow(RuntimeException::new);

               user.setPassword(request.getPassword());

               userRepository.save(user);
      }


}
