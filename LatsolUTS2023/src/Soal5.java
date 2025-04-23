
public class Soal5 {
	    public static void main(String[] args) {
	        String S1 = "Tangguh Chairunnisa";  // Nama mahasiswa
	        String S2 = "21120122140103";       // NIM
	        String S3 = "2022";                 // Angkatan
	        
	        // a. Penjumlahan S = S1 + S2 + S3
	        String S = S1 + S2 + S3;
	        System.out.println("Penjumlahan S = " + S);
	        
	        // b. Panjang String S = S1 + S2 + S3
	        System.out.println("Panjang String S = " + S.length());
	        
	        // c. Ganti S1 huruf 'a' dengan 'o'
	        String S1Replaced = S1.replace('a', 'o');
	        System.out.println("S1 setelah mengganti huruf 'a' dengan 'o': " + S1Replaced);
	        
	        // d. Gantilah S1 + S3 huruf kapital semua
	        String upperS1S3 = (S1 + S3).toUpperCase();
	        System.out.println("S1 + S3 dengan huruf kapital semua: " + upperS1S3);
	        
	        // e. Gantilah S1 + S3 huruf kecil semua
	        String lowerS1S3 = (S1 + S3).toLowerCase();
	        System.out.println("S1 + S3 dengan huruf kecil semua: " + lowerS1S3);
	    }
	}