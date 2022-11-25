package dz.akram.bensalem.msdevices.repositories;

import dz.akram.bensalem.msdevices.entities.Actuator;
import dz.akram.bensalem.msdevices.entities.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource
public interface SensorRepository extends JpaRepository<Sensor, Long> {
    List<Sensor> findSensorByIdMaison(Long id);
}
