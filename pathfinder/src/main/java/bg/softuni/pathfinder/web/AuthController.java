package bg.softuni.pathfinder.web;

import bg.softuni.pathfinder.dto.UserRegistrationDTO;
import bg.softuni.pathfinder.model.User;
import bg.softuni.pathfinder.service.UserService;
import bg.softuni.pathfinder.view.UserProfileView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class AuthController {

    private final UserService userService;


    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("userRegistrationDTO")
    public UserRegistrationDTO initUser() {
        return new UserRegistrationDTO();
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String register(@Valid UserRegistrationDTO userRegistrationDTO, BindingResult bindingResult,
                           RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {

            redirectAttributes.addFlashAttribute("userRegistrationDTO", userRegistrationDTO);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userRegistrationDTO", bindingResult);

            return "redirect:/register";
        }
        this.userService.register(userRegistrationDTO);

        return "redirect:/login";

    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/profile")
    public String profile(Principal principal, Model model) {
        String username = principal.getName();
        User user = this.userService.getUser(username);
        UserProfileView userProfileView = new UserProfileView(
                username,
                user.getFullName(),
                user.getAge(),
                user.getEmail(),
                user.getLevel() != null ? user.getLevel().name() : "BEGINNER"
        );
        model.addAttribute("user", userProfileView);

        return "profile";
    }
}
