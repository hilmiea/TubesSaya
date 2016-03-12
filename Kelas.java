public class Kelas{
	private Matakuliah matakuliah;
	private Dosen dosen;
	private String namakelas;
	
	public Kelas(String namakelas) {
		this.namakelas=namakelas;
	}
	
	public void setDosenMatkul(Dosen dosen, Matkuliah matakuliah) {
		Dosen dosen= new Dosen();
		Matakuliah matakuliah = new Matakuliah();
	}
	
	public Dosen getDosen() {
		return dosen;
	}
	
	public Matakuliah getMatakuliah() {
		return matakuliah;
	}
	
	public String getNamaKelas(){
		return namakelas;
	}
}