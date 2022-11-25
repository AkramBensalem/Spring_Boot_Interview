package dz.akram.bensalem.msclient.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nbsensor", types = Maison.class)
public interface NbrSensorsProjection {
    @Value("#{target.id}")
    String getId();

    @Value("#{target.sensors.size()}")
    int getNbrSensors();
}


