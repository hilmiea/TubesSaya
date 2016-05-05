/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.Database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Aplikasi;
import model.Mahasiswa;
import view.ViewLogin;

/**
 *
 * @author Hilmi EA
 */
public class ControllerViewLogin implements ActionListener{
    private Aplikasi model;
    private ViewLogin view;
    private Mahasiswa m;
    Database connection;
    
    public ControllerViewLogin(Aplikasi model) {
        this.model = model;
        view = new ViewLogin();
        view.addActionListener(this);
        view.setVisible(true);
        connection = new Database();
        connection.connect();
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if (view.getUsername().getText().equals("")){
            JOptionPane.showMessageDialog(view, "Username/Password tidak boleh kosong");
        }
        else if (view.getPassword().getText().equals("")){
            JOptionPane.showMessageDialog(view, "Username/Password tidak boleh kosong");
        }
        else if (o.equals(view.getLogin())){
            if((view.getUsername().getText().equals("admin")) && (view.getPassword().getText().equals("admin"))){             
                new ControllerViewAdmin(model);
                view.dispose();
                JOptionPane.showMessageDialog(view, "Selamat Datang Admin");
            }
            else if((view.getUsername().getText() != "admin") && (view.getPassword().getText() != "admin")){
                m = connection.authm(view.getUsername().getText(), view.getPassword().getText());
                if(m != null){
                    model.setA(Integer.parseInt(view.getUsername().getText()));
                    new ControllerViewMahasiswa(model);
                    view.dispose();                                  
                    JOptionPane.showMessageDialog(view, "Selamat Datang");
                }
                else{
                    view.getUsername().setText("");
                    view.getPassword().setText("");
                    JOptionPane.showMessageDialog(view,"Username/Password tidak ada");
                }
            }  
            else{
                view.getUsername().setText("");
                view.getPassword().setText("");
                JOptionPane.showMessageDialog(view,"Username/Password tidak ada");
            }
        }
    }
    
    
}
