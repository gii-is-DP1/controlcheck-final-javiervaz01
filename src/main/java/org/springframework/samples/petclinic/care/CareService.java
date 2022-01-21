package org.springframework.samples.petclinic.care;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CareService { 
    
    @Autowired
    private CareProvisionRepository careProvisionRepository;

    @Transactional
    public List<CareProvision> getAllCares(){
        List<CareProvision> lista = new ArrayList<>();
        lista = careProvisionRepository.findAll();
        return lista;
    }
    @Transactional
    public List<Care> getAllCompatibleCares(String petTypeName){
        return null;
    }
    @Transactional
    public Care getCare(String careName) {
        Care care = careProvisionRepository.findCareByName(careName);
        return care;
    }

    @Transactional
    public CareProvision save(CareProvision p) throws NonCompatibleCaresException, UnfeasibleCareException {
        return null;   
    }
    @Transactional
    public List<CareProvision> getAllCaresProvided(){
        return null;
    }
    @Transactional
    public List<CareProvision> getCaresProvided(Integer visitId){
        return null;

    }
    
}
