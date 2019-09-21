package com.cadima.flush.service;

import com.cadima.flush.entity.Flush;
import com.cadima.flush.repository.FlushRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Component
public class FlushCreator {

    @Autowired
    private FlushRepository repository;

//    @PostConstruct
//    public void createInitialAccounts() {
//        Flush current = new Flush("Kibel 1");
//        repository.save(current);
//
//        Flush saving = new Flush("Kibel 2");
//        repository.save(saving);
//    }
}
