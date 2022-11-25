package dz.akram.bensalem.msclient.entities;


import dz.akram.bensalem.msclient.model.Actuator;
import dz.akram.bensalem.msclient.model.Sensor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Maison {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private GPS cordonnes;

    @ManyToOne
    private Client client;

     @Transient
     private Collection<Sensor> sensors;

     @Transient
     private Collection<Actuator> actuators;
}
