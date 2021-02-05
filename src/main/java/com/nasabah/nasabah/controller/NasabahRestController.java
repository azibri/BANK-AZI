/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasabah.nasabah.controller;

import com.nasabah.nasabah.entities.Nasabah;
import com.nasabah.nasabah.services.NasabahServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author asus
 */
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/api")
public class NasabahRestController {
    
    @Autowired
    private NasabahServiceImpl nasabahServiceImpl;
    
    //mendapatkan semua data
    @GetMapping("/nasabah")
    public Iterable<Nasabah> findAllNasabah() {
        return nasabahServiceImpl.findAllData();
    }
    
    //mendapatkan data berdasarkan id
    @GetMapping("/nasabah/{id}")
    public ResponseEntity<Nasabah> findNasabahById(@PathVariable Integer id){
        Nasabah nasabah = nasabahServiceImpl.findDataById(id);
        return ResponseEntity.ok(nasabah);
    }
    
    //menyimapan data
    @PostMapping("/nasabah")
    public void saveNasabah(@RequestBody Nasabah nasabah) {
        nasabahServiceImpl.saveData(nasabah);
    }
    
    //update data
    @PutMapping("/nasabah/{id}")
    public ResponseEntity<Nasabah> updateNasabah(@PathVariable Integer id, @RequestBody Nasabah nasabahdetails) {
        Nasabah nasabah = nasabahServiceImpl.findDataById(id);
        
//        nasabah.setNasabahId(nasabahdetails.getNasabahId());
        nasabah.setNasabahNama(nasabahdetails.getNasabahNama());
        nasabah.setNasabahAlamat(nasabahdetails.getNasabahAlamat());
        nasabah.setNasabahTempatlahir(nasabahdetails.getNasabahTempatlahir());
        nasabah.setNasabahTanggallahir(nasabahdetails.getNasabahTanggallahir());
        nasabah.setNasabahNoktp(nasabahdetails.getNasabahNoktp());
        nasabah.setNasabahNohandphone(nasabahdetails.getNasabahNohandphone());
        
        nasabahServiceImpl.saveData(nasabah);
        return new ResponseEntity<>(nasabah, HttpStatus.OK);
    }
    
    //menghapus data
    @DeleteMapping("/nasabah/{id}")
    public void deleteNasabah(@PathVariable Integer id) {
        nasabahServiceImpl.deleteData(id);
    }
    
    
    //mengambil data berdasarkan no KTP
    @GetMapping("nasabah/ktp/{ktp}")
    public Iterable<Nasabah> findByKTP(@PathVariable String ktp) {
//        char noktp = ktp.toCharArray();
//        for (char noktp : ktp.toCharArray()) {
//            System.out.println("noktp" + noktp);
//        }
        return nasabahServiceImpl.findByKTP(ktp);
    }
}
