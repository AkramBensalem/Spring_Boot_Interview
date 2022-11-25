package dz.akram.bensalem.msclient.repositories;


import dz.akram.bensalem.msclient.entities.Maison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MaisonRepository extends JpaRepository<Maison, Long> {
}
