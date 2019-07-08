package com.dc19einnsyn.einnsynv2;

import com.dc19einnsyn.einnsynv2.packages.Registrering.Registrering;
import com.dc19einnsyn.einnsynv2.packages.Registrering.RegistreringRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//implements CommandLineRunner

@SpringBootApplication
public class EInnsynv2Application{
private long tall;
    public static void main(String[] args) {
        SpringApplication.run(EInnsynv2Application.class, args);
    }

  //  @Autowired
  //  SkjermingRepository skjermingRepository;

/*Registrering registrering;
    @Bean
    CommandLineRunner runner(RegistreringRepository repository){
        return args -> {
            repository.save( new Registrering(123, "hjemmel", "meta", "doku", "varig", "opphoer"));
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
