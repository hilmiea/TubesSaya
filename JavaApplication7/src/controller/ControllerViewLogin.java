/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
    
    public ControllerViewLogin(Aplikasi model) {
        this.model = model;
        view = new ViewLogin();
        view.addActionListener(this);
        view.setVisible(true);
    }

        
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if (o.equals(view.getLogin())){
            m = model.getMahasiswa(view.getUsername().getText());
            if((view.getUsername().getText().equals("admin")) && (view.getPassword().getText().equals("admin"))){
                JOptionPane.showMessageDialog(view, "Selamat Datang Admin");
                new ControllerViewAdmin(model);
                view.dispose();
            }
            else if(m != null){
                if ((view.getUsername().getText().equals(m.getNim())) && (view.getPassword().getText().equals(m.getNim()))){
                    JOptionPane.showMessageDialog(view, "Selamat Datang "+m.getNama());
                    new ControllerViewMahasiswa(model);
                    view.dispose();
                }
                else{
                    view.getUsername().setText("");
                    view.getPassword().setText("");
                    JOptionPane.showMessageDialog(view, "Username/Password salah");
                }
            }
            else if(o.equals(view.getKeluarlogin())){
                JOptionPane.showMessageDialog(view, "Keluar Program");
                System.exit(1);
            }
            else{
                view.getUsername().setText("");
                view.getPassword().setText("");
                JOptionPane.showMessageDialog(view,"Username/Password tidak ada");
            }
        }
    }
    
    
}
