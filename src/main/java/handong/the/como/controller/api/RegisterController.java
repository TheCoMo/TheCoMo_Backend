package handong.the.como.controller.api;

import handong.the.como.dto.UserDTO;
import handong.the.como.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    private RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @GetMapping("/")
    public String detail() {
        return "detail.html";
    }

    @GetMapping("/register")
    public String register() {
        return "register.html";
    }

    @PostMapping("/register/post")
    public String register(UserDTO userDTO) {
        registerService.saveRegister(userDTO);
        return "redirect:/";
    }
}
