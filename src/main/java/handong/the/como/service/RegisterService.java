package handong.the.como.service;

import handong.the.como.dto.UserDto;
import handong.the.como.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RegisterService {

    private UserRepository userRepository;

    @Autowired
    public RegisterService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public long saveRegister(UserDto userDTO) {
        return userRepository.save(userDTO.toEntity()).getId();
    }
}
