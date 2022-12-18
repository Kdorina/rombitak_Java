/*
* File: ButtonsPanel.java
* Author: Kovács Dorina
* Copyright: 2022, Kovács Dorina
* Group: Szoft II N
* Date: 2022-12-13
* Github: https://github.com/Kdorina/
* Licenc: GNU GPL
*/

package views;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel{
    public JButton calcButton;
    public JButton aboutButton;

    public ButtonsPanel() {
        calcButton = new JButton("Számít");
        aboutButton = new JButton("Névjegy");
        addComponents();
    }
    public void addComponents() {
        add(this.calcButton);
        add(this.aboutButton);
    }

    

    
}
