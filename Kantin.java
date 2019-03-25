//Kantin
//jumlah makanan : int
//jumlah kursi : int
//jumlah meja : int
//jumlah pembeli: int
//jumlah penjual: int
//jumlah wc : int
//jenis meja : string
//jenis kursi : string
//jumlah minuman : int

public class Kantin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canteen Kantin = new Canteen();
		Kantin.jual_makanan=" Cireng";
		Kantin.jual_minuman=" Pop Ice";
		Kantin.jml_Meja=10;
		Kantin.jml_Kursi=10;
		Kantin.jml_Penjual=10;
		Kantin.jml_Pembeli=50;
		Kantin.jml_WC=3;
		Kantin.Meja=" Kayu Jati";
		Kantin.Kursi=" Plastik";
		Kantin.Penjual=" Sistem Pesan Antar";
		Kantin.jualMakanan();
		Kantin.jualMinuman();
		Kantin.JumlahMeja();
		Kantin.JumlahKursi();
		Kantin.JumlahPenjual();
		Kantin.JumlahPembeli();
		Kantin.JumlahWC();
		Kantin.JenisMeja();
		Kantin.JenisKursi();
		Kantin.CaraPenjual();
	}

}
	class Canteen{
		String Meja,Kursi,Penjual,jual_makanan,jual_minuman;
		int jml_Meja,jml_Kursi,jml_Penjual,jml_WC,jml_Pembeli;
		
		void jualMakanan(){
			System.out.println("Jenis Makanan"+jual_makanan);
		}
		
		void jualMinuman() {
			System.out.println("Jenis Minuman"+jual_minuman);
		}	
		void JumlahMeja(){
			System.out.println("Jumlah Meja "+jml_Meja);
		}
		void JumlahKursi(){
			System.out.println("Jumlah Kursi "+jml_Kursi);
		}
		void JumlahPenjual(){
			System.out.println("Jumlah Penjual "+jml_Penjual);
		}
		void JumlahPembeli(){
			System.out.println("Jumlah Pembeli "+jml_Pembeli);
		}
		void JumlahWC(){
			System.out.println("Jumalh WC dalam kantin "+jml_WC);
		}
		void JenisMeja(){
			System.out.println("Jenis Mejanya adalah"+Meja);
		}
		void JenisKursi(){
			System.out.println("Jenis Kursinya adalah"+Kursi);
		}
		void CaraPenjual(){
			System.out.println("Cara menjualnya dengan sistem"+Penjual);
		}
	}