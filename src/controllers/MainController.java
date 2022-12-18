/*
* File: MainController.java
* Author: Kovács Dorina
* Copyright: 2022, Kovács Dorina
* Group: Szoft II N
* Date: 2022-12-13
* Github: https://github.com/Kdorina/
* Licenc: GNU GPL
*/

package controllers;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import views.MainWindow;

public class MainController {

    MainWindow mainWindow;

    public MainController() {
        this.mainWindow = new MainWindow();
        this.handleEvents();
    }

    public void handleEvents(){
        JButton calcButton = this.mainWindow.buttonsPanel.calcButton;
        JButton aboutButton = this.mainWindow.buttonsPanel.aboutButton;

        calcButton.addActionListener(e-> onClickCalcButton());
        aboutButton.addActionListener(e-> onClickAboutButton());

    }

    public void onClickCalcButton(){
        String avalueString = this.mainWindow.avaluePanel.getValue();
        String alphaString = this.mainWindow.alphaPanel.getValue();

        double avalue = Double.parseDouble(avalueString);
        double alpha = Double.parseDouble(alphaString);

        Double volume = 4 * avalue;
        Double radian = alpha* Math.PI/180;
        Double area = Math.pow(avalue, 2)*Math.sin(radian);
        
        this.mainWindow.volumePanel.setValue(volume.toString());
        this.mainWindow.areaPanel.setValue(area.toString());
    }

     public void onClickAboutButton(){
        String content = "rombitak\nVerzió: 0.1\nKovács Dorina\nSzoft II N\n2022-12-13";
        JOptionPane.showMessageDialog(this.mainWindow.getContentPane(), content);
    }
}
