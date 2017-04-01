/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pebri.implement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pebri.entity.KaryawanEntity;
import pebri.intrface.KaryawanIntrface;
import pebri.koneksi.Koneksi;

/**
 *
 * @author Peb Dev
 */
public class KaryawanImplement implements KaryawanIntrface{

    @Override
    public KaryawanEntity insert(KaryawanEntity karyawanEntity) throws SQLException {
        PreparedStatement preparedStatement = Koneksi.getKoneksi().prepareStatement("insert into karyawan_tb (kode_karyawan,nama_karyawan,alamat_karyawan,id_toko,password) values(?,?,?,?,?)");
        //preparedStatement.setInt(1, karyawanEntity.getId_karyawan());
        preparedStatement.setString(1, karyawanEntity.getKode_karyawan());
        preparedStatement.setString(2, karyawanEntity.getNama_karyawan());
        preparedStatement.setString(3, karyawanEntity.getAlamat_karyawan());
        preparedStatement.setString(4, karyawanEntity.getNama_toko());
        preparedStatement.setString(5, karyawanEntity.getPassword());
        
        preparedStatement.execute();
        
        //System.out.println(preparedStatement);

        return karyawanEntity;
    }

    @Override
    public void update(KaryawanEntity karyawanEntity) throws SQLException {
        PreparedStatement preparedStatement = Koneksi.getKoneksi().prepareStatement("update karyawan_tb set kode_karyawan = ?, nama_karyawan = ?, alamat_karyawan = ?, id_toko = ?, password = ? where id_karyawan = ?");
        preparedStatement.setInt(6, karyawanEntity.getId_karyawan());
        preparedStatement.setString(1, karyawanEntity.getKode_karyawan());
        preparedStatement.setString(2, karyawanEntity.getNama_karyawan());
        preparedStatement.setString(3, karyawanEntity.getAlamat_karyawan());
        preparedStatement.setString(4, karyawanEntity.getNama_toko());
        preparedStatement.setString(5, karyawanEntity.getPassword());

        preparedStatement.executeUpdate();
    }

    @Override
    public void delete(int idKaryawan) throws SQLException {
        PreparedStatement preparedStatement = Koneksi.getKoneksi().prepareStatement("delete from karyawan_tb where id_karyawan = ?");
        preparedStatement.setInt(1, idKaryawan);

        preparedStatement.executeUpdate();
    }

    @Override
    public List getAll() throws SQLException {
        Statement statement = Koneksi.getKoneksi().createStatement();
        ResultSet resultSet;
        resultSet = statement.executeQuery("select * from karyawan_tb");
        List list;
        list = new ArrayList();
        while (resultSet.next()) {
            KaryawanEntity karyawanEntity = new KaryawanEntity();
            karyawanEntity.setId_karyawan(resultSet.getInt("id_karyawan"));
            karyawanEntity.setKode_karyawan(resultSet.getString("kode_karyawan"));
            karyawanEntity.setNama_karyawan(resultSet.getString("nama_karyawan"));
            karyawanEntity.setAlamat_karyawan(resultSet.getString("alamat_karyawan"));
            karyawanEntity.setNama_toko(resultSet.getString("id_toko"));
            karyawanEntity.setPassword(resultSet.getString("password"));
            
            list.add(karyawanEntity);
        }
        return list;
    }

    
}
