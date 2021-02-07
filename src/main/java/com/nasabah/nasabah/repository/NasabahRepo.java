/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasabah.nasabah.repository;

import com.nasabah.nasabah.entities.Nasabah;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author asus
 */
@Repository
public interface NasabahRepo extends CrudRepository<Nasabah, Integer>{
    
    public Iterable<Nasabah> findByNasabahNoktp(@Param("nasabahNoktp") String nasabahNoktp);
    
}
