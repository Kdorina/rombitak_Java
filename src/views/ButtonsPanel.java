package views;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel{
    JButton calcButton;
    JButton aButton;

    public ButtonsPanel() {
        this.calcButton = new JButton("Számít");
        this.aButton = new JButton("Névjegy");
        this.addComponents();
    }
    public void addComponents() {
        this.add(this.calcButton);
        this.add(this.aButton);
    }

    
}
