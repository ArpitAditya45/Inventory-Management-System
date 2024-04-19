/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import dao.InventoryUtils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author exterminator
 */
public class openPdf {
    public static void openById(String id){
        try {
            if(new File(InventoryUtils.billPath+id+".pdf").exists()){
                Process p=Runtime.getRuntime().exec("xdg-open "+InventoryUtils.billPath+""+id+".pdf");
            }else{
                JOptionPane.showMessageDialog(null, "File does not exsists");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
