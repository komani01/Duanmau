/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusystem.Ultils;

import com.edusystem.Entity.NhanVien;

public class Auth {
    public static NhanVien user = null;
    
    //Clear thông tin người dùng
    public static void Clear(){
        Auth.user = null;
    }
    //Xác nhận đã đăng nhập
    
    public static boolean isLogin(){
        return Auth.user !=null;
    }
    //Xác nhận là trưởng phòng vì có vai trò - Nếu là nhân viên thì vai trò là Null
    public static boolean isManager(){
        return Auth.isLogin() && user.isVaiTro();
    }
}
