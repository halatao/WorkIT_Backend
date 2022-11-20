package com.portal.WorkIT;

import com.portal.WorkIT.Entity.*;
import com.portal.WorkIT.Repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(CategoryRepository catRepo, LocationRepository locRepo, OfferRepository offRepo, ResponseRepository resRepo, RoleRepository rolRepo,UserRepository usrRepo){
        return args -> {
//            Role user = new Role("user");
//            Role recruiter = new Role("recruiter");
//            log.info("Preloading"+rolRepo.save(user));
//            log.info("Preloading"+rolRepo.save(recruiter));
//
//            Location prague = new Location("Prague");
//            Location brno = new Location("Brno");
//            Location ostrava = new Location("Ostrava");
//            log.info("Preloading"+locRepo.save(prague));
//            log.info("Preloading"+locRepo.save(brno));
//            log.info("Preloading"+locRepo.save(ostrava));
//
//            Category backend = new Category("Backend");
//            Category frontend = new Category("Frontend");
//            Category fullstack = new Category("Fullstack");
//            log.info("Preloading"+catRepo.save(backend));
//            log.info("Preloading"+catRepo.save(frontend));
//            log.info("Preloading"+catRepo.save(fullstack));
//
//            User applier = new User("applier","applier",user);
//            User employer = new User("employer","employer",recruiter);
//            log.info("Preloading"+usrRepo.save(applier));
//            log.info("Preloading"+usrRepo.save(employer));
//
//            Offer offer1 = new Offer(".NET Core developer",35000,55000,ostrava,backend,employer);
//            Offer offer2 = new Offer("React developer",33000,42000,brno,frontend,employer);
//            log.info("Preloading"+offRepo.save(offer1));
//            log.info("Preloading"+offRepo.save(offer2));
//
//            Response response1 = new Response("hire me","",applier,offer1);
//            Response response2 = new Response("hire me","",applier,offer2);
//            log.info("Preloading"+resRepo.save(response1));
//            log.info("Preloading"+resRepo.save(response2));
        };
    }
}
