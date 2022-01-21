package org.springframework.samples.petclinic.care;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CareProvisionRepository extends CrudRepository<CareProvision,Integer>{
    List<CareProvision> findAll();        
    Optional<CareProvision> findById(int id);
    CareProvision save(CareProvision p);
	
    
    @Query("SELECT q FROM Care q")
    List<Care> findAllCares();

    @Query("SELECT q FROM Care q WHERE ?1 IN q.compatiblePetTypes")
    List<Care> findCompatibleCares(String petTypeName);
    
    @Query("SELECT q FROM Care q WHERE q.name=?1")
    Care findCareByName(String name);
    //List<CareProvision> findCaresProvidedByVisitId(Integer visitId);
}
