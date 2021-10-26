package com.edusystem.Ultils;
import java.awt.Component;
import javax.swing.JOptionPane;
public class MsgBox {
    /*
 * Hiển thị thông báo cho người dùng
 * @param parent là cửa sổ chứa thông báo
 * @param message là thông báo
 */
    public static void Alert(Component parent,String Message){
        JOptionPane.showMessageDialog(parent, Message,
        "Hệ thống quản lý đào tạo",JOptionPane.INFORMATION_MESSAGE);
    } 
    /*
 * Hiển thị thông báo và yêu cầu người dùng xác nhận
 * @param parent là cửa sổ chứa thông báo
 * @param message là câu hỏi yes/no
 * @return là kết quả nhận được true/false
 */
    public static boolean Confirm(Component parent, String Message){
        int result = JOptionPane.showConfirmDialog(parent, Message,
               "Hệ thống quản lý đào tạo",
               JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }
    
    /*
 * Hiển thị thông báo yêu cầu nhập dữ liệu
 * @param parent là cửa sổ chứa thông báo
 * @param message là thông báo nhắc nhở nhập
 * @return là kết quả nhận được từ người sử dụng nhập vào
 */
    public static String Prompt(Component parent,String Message){
        return JOptionPane.showInputDialog(parent,Message,
        "Hệ thống quản lý đào tạo",JOptionPane.INFORMATION_MESSAGE);              
    } 
}
