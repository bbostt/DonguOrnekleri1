import java.util.Scanner;

public class DongulerOrnek1 {

	static double uceBolunen(int sayi) {

		double count_3 = 0.0;
		double toplam_3 = 0.0;
		for (int i = 1; i <= sayi; i++) {

			if (i % 3 == 0) {
				toplam_3 = toplam_3 + i;
				count_3++;
			}

		}
		double sonuc_3 = (toplam_3 / count_3);
		return sonuc_3;
	}

	static double dordeBolunen(int sayi) {

		double count_4 = 0.0;
		double toplam_4 = 0.0;
		for (int i = 1; i <= sayi; i++) {

			if (i % 4 == 0) {
				toplam_4 = toplam_4 + i;
				count_4++;
			}

		}
		double sonuc_4 = (toplam_4 / count_4);
		return sonuc_4;
	}

	public static void main(String[] args) {
		// Java d�ng�ler ile 0'dan girilen say�ya kadar olan say�lardan 3 ve 4'e tam
		// b�l�nen say�lar�n ortalamas�n� hesaplayan program� yaz�n�z.
		Scanner input = new Scanner(System.in);
		System.out.print("Sayi giriniz : ");
		int sayi = input.nextInt();

		System.out.println("�� ile b�l�nenlerin ortalamasi : " + uceBolunen(sayi));
		System.out.println("Dort ile bolunenlerin ortalamasi : " + dordeBolunen(sayi));

	}

}
