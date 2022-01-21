package org.springframework.samples.petclinic.care;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.PetType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="care")
public class Care extends BaseEntity{

    @NotEmpty
    @Column(name="name",unique=true)
    @Size(min=5,max=30)
    String name;

    @NotEmpty
    String description;

    @ManyToMany
    @NotEmpty
    @Column(name="compatible_pet_types")
    @Cascade(CascadeType.ALL)
    Set<PetType> compatiblePetTypes;
}
