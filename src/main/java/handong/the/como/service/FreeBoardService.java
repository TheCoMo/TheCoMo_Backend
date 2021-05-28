package handong.the.como.service;

import handong.the.como.dto.FreeBoardDto;
import handong.the.como.repository.FreeBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class FreeBoardService {

    private FreeBoardRepository freeBoardRepository;

    @Autowired
    public FreeBoardService(FreeBoardRepository freeBoardRepository) {
        this.freeBoardRepository = freeBoardRepository;
    }

    @Transactional
    public long savePost(FreeBoardDto freeBoardDto) {
        return freeBoardRepository.save(freeBoardDto.toEntity()).getId();
    }


}
