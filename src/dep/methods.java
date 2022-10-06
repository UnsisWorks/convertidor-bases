/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dep;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author labtecweb10
 */
public class methods {

    public static void setWallpaper(JLabel wallpaper) {
        ImageIcon imagen = new ImageIcon("./src/image/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(wallpaper.getWidth(),
                wallpaper.getHeight(), Image.SCALE_DEFAULT));
        wallpaper.setIcon(icono);
    }

    public static String getBase(int index) {
        String base = "";
        switch (index) {
            case 0:
                base = "Hexadecimal";
                break;
            case 1:
                base = "Binario";
                break;
            case 2:
                base = "Decimal";
                break;
            case 3:
                base = "octal";
                break;
            default:
                System.err.println("Salio mal");
        }
        return base;
    }
    
   
}
