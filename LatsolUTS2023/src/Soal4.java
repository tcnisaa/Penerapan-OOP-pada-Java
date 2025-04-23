
public class Soal4 {
	    public static void main(String[] args) {
	        int[][] array = new int[3][5];
	        int value = 10;
	        
	        // Mengisi array 2D dengan nilai dari 10 hingga 150
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 5; j++) {
	                array[i][j] = value;
	                value += 10; // Increment nilai
	            }
	        }
	        
	        // Mencetak isi array 2D
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 5; j++) {
	                System.out.print(array[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
	}