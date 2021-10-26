/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusystem.DAO;

import com.edusystem.Ultils.JdbcHelper;
import com.edusystem.Ultils.UtilityHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ThongKeDAO {
    
    private List<Object[]> getListOfArray(String sql, String[] cols, Object...args){
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {                
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public List<Object[]> getBangDiem(Integer maKH){
        String sql ="{Call sp_BangDiem (?)}";
        String [] cols = {"MaNH","HoTen","Diem"};
        return getListOfArray(sql, cols, maKH);
    }
    
    public List<Object[]> getLuongNguoiHoc(){
        String sql ="{Call sp_ThongKeNguoiHoc}";
        String [] cols = {"Nam","SoLuong","DauTien","CuoiCung"};
        return getListOfArray(sql, cols);
    }
    
    public List<Object[]> getDiemChuyenDe(){
        String sql ="{Call sp_ThongKeDiem }";
        String [] cols = {"ChuyenDe","SoHV","ThapNhat","CaoNhat","TrungBinh"};
        return getListOfArray(sql, cols);
    }
    
    public List<Object[]> getDoanhThu(Integer Nam){
        String sql ="{call sp_ThongKeDoanhThu (?)}";
        String [] cols = {"ChuyenDe","SoKH","SoHV","DoanhThu","ThapNhat","CaoNhat","TrungBinh"};
        return getListOfArray(sql, cols, Nam);
    }
    
    
}
