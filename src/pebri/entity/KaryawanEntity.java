/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pebri.entity;

/**
 *
 * @author Peb Dev
 */
public class KaryawanEntity {

    private int id_karyawan;
    private String kode_karyawan;
    private String nama_karyawan;
    private String alamat_karyawan;
    private String nama_toko;
    private String password;
    
    public KaryawanEntity() {
        //
    }

    public KaryawanEntity(int id_karyawan, String kode_karyawan, String nama_karyawan, String alamat_karyawan, String nama_toko) {
        this.id_karyawan = id_karyawan;
        this.kode_karyawan = kode_karyawan;
        this.nama_karyawan = nama_karyawan;
        this.alamat_karyawan = alamat_karyawan;
        this.nama_toko = nama_toko;
    }

    public int getId_karyawan() {
        return id_karyawan;
    }

    public void setId_karyawan(int id_karyawan) {
        this.id_karyawan = id_karyawan;
    }

    public String getKode_karyawan() {
        return kode_karyawan;
    }

    public void setKode_karyawan(String kode_karyawan) {
        this.kode_karyawan = kode_karyawan;
    }

    public String getNama_karyawan() {
        return nama_karyawan;
    }

    public void setNama_karyawan(String nama_karyawan) {
        this.nama_karyawan = nama_karyawan;
    }

    public String getAlamat_karyawan() {
        return alamat_karyawan;
    }

    public void setAlamat_karyawan(String alamat_karyawan) {
        this.alamat_karyawan = alamat_karyawan;
    }

    public String getNama_toko() {
        return nama_toko;
    }

    public void setNama_toko(String nama_toko) {
        this.nama_toko = nama_toko;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

}
