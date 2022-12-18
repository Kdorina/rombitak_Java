package views;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame{

    TitlePanel titlePanel;
    public AvaluePanel avaluePanel;
    public ResultPanel resultPanel;
    public ButtonsPanel buttonsPanel;
    public JButton aboutButton;

    public MainWindow(){
        this.titlePanel = new TitlePanel(); 
        this.avaluePanel = new AvaluePanel();
        this.resultPanel = new ResultPanel();
        this.buttonsPanel = new ButtonsPanel();

        this.initWindow();
    }
    public void initWindow(){
        // this.aboutButton = new JButton( "Névjegy");
    this.setTitle("rombitak"); 
    this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
    this.addComponent();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // this.setSize(400, 300);
    this.pack();
    this.setVisible(true);
    

    }
    public void addComponent(){
        this.add(this.titlePanel);
        this.add(this.avaluePanel);
        this.add(this.buttonsPanel);
        this.add(this.resultPanel);
    }
}
