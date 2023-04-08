package bg.softuni.pathfinder.service;

import bg.softuni.pathfinder.dto.UserRegistrationDTO;
import bg.softuni.pathfinder.model.User;
import bg.softuni.pathfinder.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(UserRegistrationDTO userRegistrationDTO) {
        if (!userRegistrationDTO.getPassword().equals(userRegistrationDTO.getConfirmPassword())) {
            return;
        }

        Optional<User> byEmail = this.userRepository.findByEmail(userRegistrationDTO.getEmail());

        if (byEmail.isEmpty()) {
            return;
        }

        User user = new User(
                userRegistrationDTO.getUsername(),
                userRegistrationDTO.getPassword(),
                userRegistrationDTO.getFullName(),
                userRegistrationDTO.getAge(),
                userRegistrationDTO.getEmail()
        );

        this.userRepository.save(user);
    }
}
