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
