/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusystem.DAO;

import com.edusystem.Entity.KhoaHoc;
import com.edusystem.Entity.NguoiHoc;
import com.edusystem.Entity.NhanVien;
import com.edusystem.Ultils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quyen
 */
public class KhoaHocDAO extends EduSysDAO<KhoaHoc, Integer> {

    final String INSERT_SQL = "INSERT INTO KhoaHoc (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV) VALUES (?, ?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE KhoaHoc SET MaCD = ?, HocPhi = ?, ThoiLuong = ?, NgayKG = ?, GhiChu = ?, MaNV= ? WHERE MaKH = ? ";
    final String DELETE_SQL = "DELETE FROM KhoaHoc WHERE MaKH=?";
    final String SELECT_ALL_SQL = "SELECT * FROM KhoaHoc";
    final String SELECT_BY_ID_SQL = "SELECT * FROM KhoaHoc WHERE MaKH=?";
    final String SELECT_BY_MA_CD_SQL = "SELECT * FROM KhoaHoc WHERE MaCD=?";

    @Override
    public void insert(KhoaHoc entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getMaCD(),
                entity.getHocPhi(),
                entity.getThoiLuong(),
                entity.getNgayKG(),
                entity.getGhiChu(),
                entity.getMaNV());
    }

    @Override
    public void update(KhoaHoc entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getMaCD(),
                entity.getHocPhi(),
                entity.getThoiLuong(),
                entity.getNgayKG(),
                entity.getGhiChu(),
                entity.getMaNV(),
                entity.getMaKH());
    }

    @Override
    public void delete(Integer id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<KhoaHoc> selectAll() {
        return selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public KhoaHoc selectById(Integer id) {
         List<KhoaHoc> list = selectBySQL(SELECT_BY_ID_SQL, id);

        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);   }

    @Override
    public List<KhoaHoc> selectBySQL(String sql, Object... args) {
        List<KhoaHoc> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                KhoaHoc entity = new KhoaHoc();
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setHocPhi(rs.getDouble("HocPhi"));
                entity.setThoiLuong(rs.getInt("ThoiLuong"));
                entity.setNgayKG(rs.getDate("NgayKG"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayTao(rs.getDate("NgayTao"));
                entity.setMaCD(rs.getString("MaCD"));

                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();

        }
        return list;
    }
    
    public List<KhoaHoc> selectKhoaHocByChuyenDe(String maCD) {
        return selectBySQL(SELECT_BY_MA_CD_SQL,maCD);
    }
    
    public List<Integer> selectYear(){
        String sql = "Select DISTINCT year(NgayKG) from KhoaHoc ORDER BY year(NgayKG) DESC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
