/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusystem.Ultils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

public class XImage {
    //Set ảnh trên tiêu đề của JDialog
    public static Image getAppIcon(){
        URL url = XImage.class.getResource("/com/edusystem/Icon/fpt.png");
        return new ImageIcon(url).getImage();
    }
    //Hỗ trợ save ảnh ở JDialog chuyên đề
    public static boolean  save(File src){
        File dst = new File("src\\main\\Resources\\com\\edusystem\\logos",src.getName());
        if(!dst.getParentFile().exists()){
            dst.getParentFile().mkdirs();//tao thu muc
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to,StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception e) {
            
            return false;
        }
    }
    //Hỗ trợ đọc ảnh ở JDialog chuyên đề
    public static ImageIcon read(String fileName){
        File path = new File("src\\main\\Resources\\com\\edusystem\\logos",fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
}
