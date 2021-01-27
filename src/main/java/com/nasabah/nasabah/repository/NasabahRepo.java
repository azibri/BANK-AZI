/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasabah.nasabah.repository;

import com.nasabah.nasabah.entities.Nasabah;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author asus
 */
@Repository
public interface NasabahRepo extends CrudRepository<Nasabah, Integer>{
    
    @Query(value = "SELECT * FROM nasabah WHERE nasabah_noktp = ?1", nativeQuery = true)
    public Iterable<Nasabah> findByKTP(String ktp);
    
}
