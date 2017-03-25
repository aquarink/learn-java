/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pebri.intrface;

import java.sql.SQLException;
import java.util.List;
import pebri.entity.KaryawanEntity;

/**
 *
 * @author Peb Dev
 */
public interface KaryawanIntrface {
    
    KaryawanEntity insert(KaryawanEntity karyawanEntity) throws SQLException;

    void update(KaryawanEntity karyawanEntity) throws SQLException;

    void delete(int idKaryawan) throws SQLException;

    List getAll() throws SQLException;
    
}
