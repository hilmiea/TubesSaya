/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import model.*;
import controller.*;
import database.Database;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hilmi EA
 */
public class Console {  
    
    public void menulogin(){
        System.out.println("1. Login Admin");
        System.out.println("2. Login Mahasiswa");
        System.out.println("9. Keluar");
    }
    
    public void menuadmin(){
        System.out.println("1. Kelola Dosen");
        System.out.println("2. Kelola Matakuliah");
        System.out.println("3. Kelola Kelas");
        System.out.println("4. Kelola Mahasiswa");
        System.out.println("9. Keluar");
    }
    
    public void menumahasiswa(){
        System.out.println("1. Ambil matakuliah");
        System.out.println("9. Keluar");
    }
    
    public void menudosen(){
        System.out.println("1. Tambah Dosen");
        System.out.println("2. Edit Dosen");
        System.out.println("3. Hapus Dosen");
        System.out.println("4. Lihat Dosen");
        System.out.println("9. Keluar");
    }
    
    public void menumatakuliah(){
        System.out.println("1. Tambah Mata Kuliah");
        System.out.println("2. Edit Mata Kuliah");
        System.out.println("3. Hapus Mata Kuliah");
        System.out.println("4. Lihat Mata Kuliah");
        System.out.println("9. Keluar");
    }
    
    public void menukelas(){
        System.out.println("1. Tambah Kelas");
        System.out.println("2. Edit Kelas");
        System.out.println("3. Hapus Kelas");
        System.out.println("4. Set Kelas");
        System.out.println("5. Lihat Kelas");
        System.out.println("6. Lihat Set Kelas");
        System.out.println("9. Keluar");
    }
    
    public void menukelolamahasiswa(){
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Edit Mahasiswa");
        System.out.println("3. Hapus Mahasiswa");
        System.out.println("4. Lihat Mahasiswa");
        System.out.println("9. Keluar");
    }
    
    public static void main(String[]args){
        Aplikasi model = new Aplikasi();
        Database connection = new Database();
        connection.connect();
        model.setDaftarKelas(connection.loadAllKelas());
        model.setDaftarDosen(connection.loadAllDosen());
        model.setDaftarMahasiswa(connection.loadAllMahasiswa());
        model.setDaftarMatakuliah(connection.loadAllMatkul());      
        model.setDaftarKelasMatkulDosen(connection.loadAllSetKelas(model));
        model.setDaftarNgambilMatkul(connection.loadAllRegistrasiKelas(model));
        
        
        Console c = new Console();
        Scanner s = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int e = 0;
        String user,password;
        
        while(a != 9){
            c.menulogin();
            System.out.print("Input Menu : ");
            a = s.nextInt();
            if(a == 1){
                while(e != 9){
                    c.menuadmin();
                    System.out.println("Input Menu Admin : ");
                    e = s.nextInt();
                    if(e == 1){
                        while(b != 9){
                            c.menudosen();
                            b = s.nextInt();
                             if (b == 1){
                                 System.out.println("tambahdosen");
                            }
                            else if(b == 2){
                                System.out.println("editdosen");
                            }
                            else if (b == 3){
                                System.out.println("hapusdosen");
                            }
                            else if(b == 4){
                                System.out.println("lihatdosen");
                            }
                            else{
                                System.out.println("input dengan benar");
                            }
                        }
                    }
                    else if (e == 2){
                        while(b != 9){
                            c.menumatakuliah();
                            b = s.nextInt();
                             if (b == 1){
                                 System.out.println("tambahmatakuliah");
                            }
                            else if(b == 2){
                                System.out.println("editmatakuliah");
                            }
                            else if (b == 3){
                                System.out.println("hapusmatakuliah");
                            }
                            else if(b == 4){
                                System.out.println("lihatmatakuliah");
                            }
                            else{
                                System.out.println("input dengan benar");
                            }
                        }
                    
                    }
                    else if (e == 3){
                        while(b != 9){
                            c.menukelas();
                            b = s.nextInt();
                            if (b == 1){
                                 System.out.println("tambahkelas");
                            }
                            else if(b == 2){
                                System.out.println("editkelas");
                            }
                            else if (b == 3){
                                System.out.println("hapuskelas");
                            }
                            else if(b == 4){
                                System.out.println("setkelas");
                            }
                            else if (b == 5){
                                System.out.println("lihat data kelas");
                            }
                            else if(b == 6){
                                System.out.println("lihat data set kelas");
                            }
                            else{
                                System.out.println("input dengan benar");
                            }
                        }
                    }
                    else if (e == 4){
                        while(b != 9){
                            c.menumahasiswa();
                            b = s.nextInt();
                             if (b == 1){
                                 System.out.println("tambahmahasiswa");
                            }
                            else if(b == 2){
                                System.out.println("editmahasiswa");
                            }
                            else if (b == 3){
                                System.out.println("hapusmahasiswa");
                            }
                            else if(b == 4){
                                System.out.println("lihatmahasiswa");
                            }
                            else{
                                System.out.println("input dengan benar");
                            }
                        }
                    }
                }   
                
            }
        }
    }
}
