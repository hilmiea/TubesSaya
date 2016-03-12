public class Mahasiswa extends Orang{
	private Kelas[] pilihan;
	private final int banyakkelas = 0;
	
	public Mahasiswa(String nama, string Kelamin){
		super(nama);
		super(kelamin);
	}

    public void tambahkelas(Kelas k){
		if(banyakkelas<40) {
			pilihan[banyakkelas]=k;
			k++;
		} else {
			System.out.println("Kelas Penuh!!");
		}
	}
	
	public Kelas getKelas(int id) {
		return pilihan[id];
	}
	
	public String getName() {
		return super(nama);
	}
}