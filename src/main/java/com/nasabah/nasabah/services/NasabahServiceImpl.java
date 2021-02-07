/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasabah.nasabah.services;

import com.nasabah.nasabah.entities.Nasabah;
import com.nasabah.nasabah.repository.NasabahRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asus
 */
@Service
public class NasabahServiceImpl implements NasabahService {

    @Autowired
    private NasabahRepo nasabahRepo;
    
    @Override
    public Iterable<Nasabah> findAllData() {
        return nasabahRepo.findAll();
    }

    @Override
    public Nasabah findDataById(Integer id) {
        return nasabahRepo.findById(id).get();
    }

    @Override
    public void saveData(Nasabah nasabah) {
        nasabahRepo.save(nasabah);
    }

    @Override
    public void deleteData(Integer id) {
        nasabahRepo.deleteById(id);
    }

    @Override
    public Iterable<Nasabah> findByNasabahNoktp(String nasabahNoktp) {
        return nasabahRepo.findByNasabahNoktp(nasabahNoktp);
    }
    
}
