package handong.the.como.service;

import handong.the.como.dto.PrivateUserDto;
import handong.the.como.repository.PrivateUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PrivateRegisterService {

    private PrivateUserRepository privateUserRepository;

    @Autowired
    public PrivateRegisterService(PrivateUserRepository privateUserRepository) {
        this.privateUserRepository = privateUserRepository;
    }

    @Transactional
    public long savePrivateRegister(PrivateUserDto privateUserDto) {
        return privateUserRepository.save(privateUserDto.toEntity()).getId();
    }

}
