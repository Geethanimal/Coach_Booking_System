/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CBS;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Geethan
 */
public class GUI_Methods {
    //this method for setting sidebar hover color
    public void hoverset_sidebar_button(JPanel pane){
        pane.setBackground(new Color(34,40,44));
    }
    public void hoverreset_sidebar_button(JPanel pane){
        pane.setBackground(new Color(21,25,28));
    }
    public void hoverset_pnlcenter_button(JPanel pane){
        pane.setBackground(new Color(21,25,28));
        
    }
    public void hoverreset_pnlcenter_addbutton(JPanel pane){
        pane.setBackground(new Color(0,102,255));
    }
    public void hoverreset_pnlcenter_cancelbutton(JPanel pane){
        pane.setBackground(new Color(60,63,65));
    }
    //this method for changing side bar button color when clicked     
    public void setcolor_sidebar_button(JPanel pane1,JPanel pane2){
        pane1.setBackground(new Color(34,40,44));
        pane2.setBackground(new Color(0,102,255));
    }
    //this method for changing side bar button color when deactivated
    public void resetcolor_sidebar_button(JPanel pane1,JPanel pane2){
        pane1.setBackground(new Color(21,25,28));
        pane2.setBackground(new Color(21,25,28));
    }
}
