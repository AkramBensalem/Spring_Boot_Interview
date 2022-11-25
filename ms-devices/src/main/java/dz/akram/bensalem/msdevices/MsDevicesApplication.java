package dz.akram.bensalem.msdevices;

import dz.akram.bensalem.msdevices.entities.Actuator;
import dz.akram.bensalem.msdevices.entities.Sensor;
import dz.akram.bensalem.msdevices.repositories.ActuatorRepository;
import dz.akram.bensalem.msdevices.repositories.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class MsDevicesApplication implements CommandLineRunner {

    @Autowired
    SensorRepository sensorRepository;

    @Autowired
    ActuatorRepository actuatorRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsDevicesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        sensorRepository.save(
                new Sensor(
                        null,
                        "Temperature",
                        1L
                )
        );

        sensorRepository.save(
                new Sensor(
                        null,
                        "Humidity",
                        1L
                )
        );

        sensorRepository.save(
                new Sensor(
                        null,
                        "Gas Detector",
                        2L
                )
        );



        actuatorRepository.save(
                new Actuator(
                        null,
                        "Lampe",
                        1L
                )
        );

        actuatorRepository.save(
                new Actuator(
                        null,
                        "Climatisor",
                        2L
                )
        );

        actuatorRepository.save(
                new Actuator(
                        null,
                        "Door Lock Actuator",
                        2L
                )
        );



    }
}
