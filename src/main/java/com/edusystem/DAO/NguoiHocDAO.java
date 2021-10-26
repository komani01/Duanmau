/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusystem.DAO;

import com.edusystem.Entity.NguoiHoc;
import com.edusystem.Entity.NhanVien;
import com.edusystem.Ultils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quyen
 */
public class NguoiHocDAO extends EduSysDAO<NguoiHoc, String> {

    final String INSERT_SQL = "INSERT INTO NguoiHoc (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE NguoiHoc SET HoTen= ? , NgaySinh= ? , GioiTinh= ? , DienThoai= ? , Email= ?, GhiChu= ? ,MaNV= ?  WHERE MaNH= ? ";
    final String DELETE_SQL = "DELETE FROM NguoiHoc WHERE MaNH = ? ";
    final String SELECT_ALL_SQL = "SELECT * FROM NguoiHoc";
    final String SELECT_BY_ID_SQL = "SELECT * FROM NguoiHoc WHERE MaNH= ? ";
    final String SELECT_NOT_IN_COURSE_SQL ="SELECT * FROM NguoiHoc WHERE HoTen like ? AND MaNH not in(Select MaNH FROM HocVien WHERE MaKH=?)";
    final String SELECT_BY_KEYWORD_SQL="SELECT * FROM NguoiHoc WHERE HoTen LIKE ?";
    @Override
    public void insert(NguoiHoc entity) {
        JdbcHelper.update(INSERT_SQL,
             entity.getMaNH(),
             entity.getHoTen(),
             entity.getNgaySinh(),
             entity.isGioiTinh(),
             entity.getDienThoai(),
             entity.getEmail(),
             entity.getGhiChu(),
             entity.getMaNV());
    }

    @Override
    public void update(NguoiHoc entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getHoTen(),
                entity.getNgaySinh(),
                entity.isGioiTinh(),
                entity.getDienThoai(),
                entity.getEmail(),
                entity.getGhiChu(),
                entity.getMaNV(),
                entity.getMaNH());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<NguoiHoc> selectAll() {
        return selectBySQL(SELECT_ALL_SQL);

    }

    @Override
    public NguoiHoc selectById(String id) {
        List<NguoiHoc> list = selectBySQL(SELECT_BY_ID_SQL, id);

        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NguoiHoc> selectBySQL(String sql, Object... args) {
        List<NguoiHoc> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                NguoiHoc entity = new NguoiHoc();
                entity.setMaNH(rs.getString("MaNH"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setDienThoai(rs.getString("DienThoai"));
                entity.setEmail(rs.getString("Email"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayDK(rs.getDate("NgayDK"));
                list.add(entity);

            }
        } catch (Exception e) {
            throw new RuntimeException();

        }
        return list;
    }
    public List<NguoiHoc> selectNotInCourse(int maKH,String keyword){
        
        return  selectBySQL(SELECT_NOT_IN_COURSE_SQL,"%"+keyword+"%",maKH);
    }
    
    public List<NguoiHoc> selectByKeyword(String keyword) {
        
        return this.selectBySQL(SELECT_BY_KEYWORD_SQL, "%"+keyword+"%");
    }
    
}


