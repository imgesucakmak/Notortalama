import java.util.Scanner;

public class notOrt {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int ogrenciSayisi=0;
		
		while(ogrenciSayisi<=0) {
			System.out.println("kac ogrenci not girecek?");
			ogrenciSayisi=scanner.nextInt();
			
			double toplamOrtalama=0;
			
			for(int i=1;i<=ogrenciSayisi; i ++) {
				System.out.println(i+".ogrenci not ort girin:");
				double notOrtalamasi=scanner.nextDouble();
				toplamOrtalama=notOrtalamasi;}
			
			double genelOrtalama=toplamOrtalama/ogrenciSayisi;
			System.out.println("girilen öğrencilerin genel not ort:"+genelOrtalama);
				
				
			
			
		}
		

	}

}