package dz.akram.bensalem.msclient.controllers;


import dz.akram.bensalem.msclient.entities.Maison;
import dz.akram.bensalem.msclient.proxies.DeviceProxy;
import dz.akram.bensalem.msclient.repositories.MaisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api")
public class MaisonApis {

    @Autowired
    MaisonRepository maisonRepository;

    @Autowired
    DeviceProxy deviceProxy;


    @GetMapping("maison/{id}")
    Maison getMaisonWithSensorsAndActuators(
            @PathVariable("id") Long id
    ) {
        Maison maison= maisonRepository.findById(id).get();
        maison.setSensors(
                new ArrayList<>(deviceProxy.getAllSensorsOfMaisonById(id).getContent())
        );

        maison.setActuators(
                new ArrayList<>(deviceProxy.getAllActuatorsOfMaisonById(id).getContent())
        );


        return maison;
    }


    @GetMapping("maison/{id}/nbensors")
    int getMaisonWithNumberOfSensors(
            @PathVariable("id") Long id
    ) {
        Maison maison= maisonRepository.findById(id).get();
        maison.setSensors(
                new ArrayList<>(deviceProxy.getAllSensorsOfMaisonById(id).getContent())
        );

        int nbr = maison.getSensors().size();

        return nbr;
    }

}
