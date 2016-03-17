/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Hilmi EA
 */
import java.util.Scanner;

public class Main{
	public static void main(String[]args){
            
                Scanner input = new Scanner(System.in);
                int menu;
                Aplikasi ap = new Aplikasi();
                
                // Membuat 4 objek Dosen
		Dosen d1 = new Dosen("Hay","Laki - Laki","112233");
                Dosen d2 = new Dosen("Dude","Laki - Laki","445566");
                Dosen d3 = new Dosen("Come","Perempuan","335577");
                Dosen d4 = new Dosen("With","Perempuan","123123");
                
                // Membuat 3 objek Mata Kuliah
                Matakuliah m1 = new Matakuliah("PBO",3);
                Matakuliah m2 = new Matakuliah("RPL",3);
                Matakuliah m3 = new Matakuliah("Probstat",3);
                 
                // Membuat 3 objek kelas
		Kelas k1 = new Kelas("IF 38-05");
                Kelas k2 = new Kelas("IF 38-06");
                   
                // Membuat 3 objek Mahasiswa
                Mahasiswa mhs1 = new Mahasiswa("Hilmi","Laki - Laki");
                Mahasiswa mhs2 = new Mahasiswa("Eko","Laki - Laki");
                Mahasiswa mhs3 = new Mahasiswa("Arianto","Laki - Laki");
                
                // Kelas set dosen dan matkul
                k1.setDosenMatkul(d1,m1);
                k1.setDosenMatkul(d3,m2);
                
                // Aplikasi input dosen,matkul, dan mahasiswa
                ap.addDosen(d1);
                ap.addDosen(d2);
                ap.addDosen(d3);
                ap.addDosen(d4);
                
                ap.addMatakuliah(m1);
                ap.addMatakuliah(m2);
                ap.addMatakuliah(m3);
                
                ap.addMahasiswa(mhs1);
                ap.addMahasiswa(mhs2);
                ap.addMahasiswa(mhs3);
                
                //Mahasiswa Mengambil Mata Kuliah
                mhs1.tambahKelas(k1,m1);
                mhs1.tambahKelas(k2,m2);
                mhs2.tambahKelas(k1,m3);
                
                              
                System.out.println("Nama : "+mhs1.getNama());
                for(int i=0;i<=3;i++){
                    if (mhs1.getKelas(i) != null){
                        System.out.println("Kelas : "+mhs1.getKelas(i).getNamaKelas());
                        System.out.println("Matkul : "+mhs1.getMatkul(i).getNamaMatkul());
                        System.out.println("Dosen : "+k1.getDosen(i).getNama());
                        System.out.println();
                    }
                    else{
                        break;
                    }
                }
                
                System.out.println("Nama : "+mhs2.getNama());
                for(int i=0;i<=3;i++){
                    if (mhs2.getKelas(i) != null){
                        System.out.println("Kelas : "+mhs2.getKelas(i).getNamaKelas());
                        System.out.println("Matkul : "+mhs2.getMatkul(i).getNamaMatkul());
                        System.out.println("Dosen : "+k1.getDosen(i).getNama());
                        System.out.println();
                    }
                    else{
                        break;
                    }
                }
                
	}
}
