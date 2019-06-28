package com.dc19einnsyn.einnsynv2;

import com.dc19einnsyn.einnsynv2.Repositories.SkjermingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//implements CommandLineRunner

@SpringBootApplication
public class EInnsynv2Application {

    @Autowired
    SkjermingRepository skjermingRepository;

    public static void main(String[] args) {
        SpringApplication.run(EInnsynv2Application.class, args);
    }

    /*@Bean
    CommandLineRunner runner(SkjermingRepository repository){
        return args -> {
            repository.save(new Skjerming("tilgang", "hjemmel", "meta", "doku", "varig", "opphoer"));
        };
    }*/

    /*
   @Override
    public void run(String... args) throws Exception {
        System.out.println("Dokumentsøk");

        skjermingRepository.save(new Skjerming("tilgang", "hjemmel", "meta", "dokum", "varig", "opphoer"));
        System.out.println(skjermingRepository.findBySkjermingDokument("dokum"));
    }
*/
}
