/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author USER
 */
class ModelMahasiswa {
    public String nim;
    public String nama;
    
    public ModelMahasiswa(String nim, String nama){
        this.nim=nim;
        this.nama=nama;
      
    }
    public String getNim(){
     return nim;
       }
     public String getNama(){
     return nama;
       }


}
