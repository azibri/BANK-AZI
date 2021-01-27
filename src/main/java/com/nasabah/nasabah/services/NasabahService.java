/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasabah.nasabah.services;

import com.nasabah.nasabah.entities.Nasabah;

/**
 *
 * @author asus
 */
public interface NasabahService {
    
    public Iterable<Nasabah> findAllData();
    
    public Nasabah findDataById(Integer id);
    
    void saveData(Nasabah nasabah);
    
    void deleteData(Integer id);
    
    public Iterable<Nasabah> findByKTP(String ktp);
      
}
