/*
* File: TitlePanel.java
* Author: Kovács Dorina
* Copyright: 2022, Kovács Dorina
* Group: Szoft II N
* Date: 2022-12-13
* Github: https://github.com/Kdorina/
* Licenc: GNU GPL
*/

package views;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class TitlePanel extends JPanel {
    JLabel mainLabel;

    public TitlePanel() {
        this.mainLabel = new JLabel("Rombusz kerület/terület");        
        this.mainLabel.setFont(new Font("Sans serif", Font.BOLD, 20));
        this.mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.mainLabel.setBorder(new EmptyBorder(10, 10, 10, 100));

        this.add(this.mainLabel);
    }
    
}