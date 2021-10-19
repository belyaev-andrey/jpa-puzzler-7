package com.jokerconf.jpapuzzlers.repositories;

import com.jokerconf.jpapuzzlers.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

    Set<Owner> findOwnersByPhoneNumber(String number);

}