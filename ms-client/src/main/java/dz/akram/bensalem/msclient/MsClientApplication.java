package dz.akram.bensalem.msclient;

import dz.akram.bensalem.msclient.entities.Client;
import dz.akram.bensalem.msclient.entities.GPS;
import dz.akram.bensalem.msclient.entities.Maison;
import dz.akram.bensalem.msclient.repositories.ClientRepository;
import dz.akram.bensalem.msclient.repositories.MaisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class MsClientApplication implements CommandLineRunner {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    MaisonRepository maisonRepository;


    public static void main(String[] args) {
        SpringApplication.run(MsClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Client c1 = clientRepository.save(
             new Client(
                     null,
                     "Akram",
                     "ak.bensale@email.com",
                     null
             )
        );

        Client c2 = clientRepository.save(
                new Client(
                        null,
                        "Ilyes",
                        "ak.bensale@email.com",
                        null
                )
        );


        maisonRepository.save(
                new Maison(
                        null,
                        new GPS(1.0,1.0),
                        c1,
                        null,
                        null
                )
        );


        maisonRepository.save(
                new Maison(
                        null,
                        new GPS(8.0,7.0),
                        c1,
                        null,
                        null
                )
        );


        maisonRepository.save(
                new Maison(
                        null,
                        new GPS(1.0,2.0),
                        c2,
                        null,
                        null
                )
        );

    }
}
