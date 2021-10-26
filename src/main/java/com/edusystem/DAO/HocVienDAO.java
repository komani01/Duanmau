/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusystem.DAO;

import com.edusystem.Entity.HocVien;
import com.edusystem.Entity.KhoaHoc;
import com.edusystem.Entity.NguoiHoc;
import com.edusystem.Ultils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quyen
 */
public class HocVienDAO extends EduSysDAO<HocVien, Integer>{
    final String INSERT_SQL = "INSERT INTO HocVien(MaKH, MaNH, Diem) VALUES(?, ?, ?)";
    final String UPDATE_SQL = "UPDATE HocVien SET MaKH=? , MaNH=?, Diem=? WHERE MaHV=?";
    final String DELETE_SQL = "DELETE FROM HocVien WHERE MaHV=?";
    final String SELECT_ALL_SQL = "SELECT * FROM HocVien";
    final String SELECT_BY_ID_SQL = "SELECT * FROM HocVien WHERE MaHV=?";
    final String SELECT_BY_KH_SQL = "SELECT * FROM HocVien WHERE MaKH=?";
    
    
    @Override
    public void insert(HocVien entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getMaKH(),
                entity.getMaNH(),
                entity.getDiem());
                
   }

    @Override
    public void update(HocVien entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getMaKH(),
                entity.getMaNH(),
                entity.getDiem(),
                entity.getMaHV());
    }

    @Override
    public void delete(Integer id) {
        JdbcHelper.update(DELETE_SQL,id);
   }

    @Override
    public List<HocVien> selectAll() {
        return selectBySQL(SELECT_ALL_SQL);
    }
    

    @Override
    public HocVien selectById(Integer id) {
        List<HocVien> list = selectBySQL(SELECT_BY_ID_SQL, id);

        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
  }
    

    @Override
    public List<HocVien> selectBySQL(String sql, Object... args) {
        List<HocVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                HocVien entity = new HocVien();
                entity.setMaHV(rs.getInt("MaHV"));
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setMaNH(rs.getString("MaNH"));
                entity.setDiem(rs.getDouble("Diem"));
                System.out.println(entity.toString());
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();

        }
        return list;
    }
    public List<HocVien> selectByKhoaHoc(int maKH){
        
        return selectBySQL(SELECT_BY_KH_SQL, maKH);
    }
    
    
}
