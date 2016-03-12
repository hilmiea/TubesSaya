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
public class Main{
	public static void main(String[]args){
		Dosen d1 = new Dosen("Bambang","Laki","130");
		Dosen d2 = new Dosen("Danang","Laki","140");
		
		Matakuliah m1 = new Matakuliah("PBO",3);
		Matakuliah m2 = new Matakuliah("RPL",3);
		
		Kelas k1 = new Kelas("IF-38-05");
		Kelas k2 = new Kelas("IF-39-05");
		k1.setDosenMatkul(d1,m1);
		k2.setDosenMatkul(d2,m2);
		
		Mahasiswa mhs1 = new Mahasiswa("Hilmi","Laki");
		Mahasiswa mhs2 = new Mahasiswa("Eko","Laki");
		
		mhs1.tambahKelas(k1);
		mhs1.tambahKelas(k2);
		mhs2.tambahKelas(k1);
		mhs2.tambahKelas(k2);
	
		System.out.println("Kelas : "+k1.getNamaKelas());
		System.out.println("Matakuliah : "+k1.getMatakuliah().getNamaMatkul());
		System.out.println("Dosen : "+k1.getDosen().getNama());
		System.out.println();
		System.out.println("Kelas : "+k2.getNamaKelas());
		System.out.println("Matakuliah : "+k2.getMatakuliah().getNamaMatkul());
		System.out.println("Dosen : "+k2.getDosen().getNama());
		System.out.println();
		System.out.println("Mahasiswa "+mhs1.getNama()+" mengambil kelas : ");
		for (int i=0;i<2;i++){
			System.out.println("Kelas : "+mhs1.getKelas(i).getNamaKelas()+" untuk Mata Kuliah "+mhs1.getKelas(i).getMatakuliah().getNamaMatkul()+" Dosennya "+mhs1.getKelas(i).getDosen().getNama());
		}
		System.out.println();
		System.out.println("Mahasiswa "+mhs2.getNama()+" mengambil kelas : ");
		for (int i=0;i<2;i++){
			System.out.println("Kelas : "+mhs2.getKelas(i).getNamaKelas()+" untuk Mata Kuliah "+mhs2.getKelas(i).getMatakuliah().getNamaMatkul()+" Dosennya "+mhs1.getKelas(i).getDosen().getNama());
		}
		
	}
}
