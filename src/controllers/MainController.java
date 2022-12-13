package controllers;

import javax.swing.JOptionPane;

import views.MainWindow;

public class MainController {

    MainWindow mainWindow;

    public MainController() {
        this.mainWindow = new MainWindow();
        this.mainWindow.aboutButton.addActionListener(e -> showMessage());
    }

    public void showMessage(){
        String content = "rombitak\nVerzió: 0.1\nKovács Dorina\nSzoft II N\n2022-12-13";
        JOptionPane.showMessageDialog(this.mainWindow.getContentPane(), content);
    }
}
