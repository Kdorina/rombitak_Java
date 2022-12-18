/*
* File: MainWindow.java
* Author: Kovács Dorina
* Copyright: 2022, Kovács Dorina
* Group: Szoft II N
* Date: 2022-12-13
* Github: https://github.com/Kdorina/
* Licenc: GNU GPL
*/

package views;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame{

    TitlePanel titlePanel;
    public AvaluePanel avaluePanel;
    public AlphaPanel alphaPanel;
    public VolumePanel volumePanel;
    public AreaPanel areaPanel;
    public ButtonsPanel buttonsPanel;
    public JButton aboutButton;

    public MainWindow(){
        this.titlePanel = new TitlePanel(); 
        this.avaluePanel = new AvaluePanel();
        this.alphaPanel = new AlphaPanel();
        this.volumePanel = new VolumePanel();
        this.areaPanel = new AreaPanel();
        this.buttonsPanel = new ButtonsPanel();

        this.initWindow();
    }
    public void initWindow(){
    this.setIconImage(new ImageIcon("logo.png").getImage());
    this.setTitle("rombitak"); 
    this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
    this.addComponent();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
    

    }
    public void addComponent(){
        this.add(this.titlePanel);
        this.add(this.avaluePanel);
        this.add(this.alphaPanel);
        this.add(this.buttonsPanel);
        this.add(this.volumePanel);
        this.add(this.areaPanel);
    }
}
