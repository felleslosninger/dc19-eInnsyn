package com.dc19einnsyn.einnsynv2.Repositories;

import com.dc19einnsyn.einnsynv2.Models.Dokumentobjekt;
import org.springframework.data.repository.CrudRepository;

public interface DokumentobjektRepository extends CrudRepository<Dokumentobjekt, Long> {

   // Set<Dokumentobjekt> findbyFUCK(String opprettetAv); //JPA lar deg lage custom findbymethodos apparently??

}
