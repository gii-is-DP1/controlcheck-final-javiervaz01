package org.springframework.samples.petclinic.care;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ManyToAny;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.Visit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="care_provision")
public class CareProvision extends BaseEntity{   
   
    @ManyToOne
    @NotNull
    @JoinColumn(name="visit)")
    Visit visit;

    @Size(min=0)
    @NotNull
    double duration;

    

    @ManyToOne
    Care care;   
}
