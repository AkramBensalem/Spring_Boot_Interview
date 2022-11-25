package dz.akram.bensalem.msclient.proxies;

import dz.akram.bensalem.msclient.model.Actuator;
import dz.akram.bensalem.msclient.model.Sensor;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ms-devices")
@LoadBalancerClient(name="ms-devices")
public interface DeviceProxy {


    @GetMapping("/sensors/search/findSensorByIdMaison")
    CollectionModel<Sensor> getAllSensorsOfMaisonById(@RequestParam("id") Long id);


    @GetMapping("/actuators/search/findActuatorByIdMaison")
    CollectionModel<Actuator> getAllActuatorsOfMaisonById(@RequestParam("id") Long id);

}


