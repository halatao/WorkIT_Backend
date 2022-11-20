package com.portal.WorkIT.Controller;

import com.portal.WorkIT.Entity.Response;
import com.portal.WorkIT.Repository.ResponseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class ResponseController {
    private final ResponseRepository repository;

    public ResponseController(ResponseRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/responses")
    List<Response> all(){return repository.findAll();}
}
