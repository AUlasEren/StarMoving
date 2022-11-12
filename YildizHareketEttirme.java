package Ulas;

import java.util.Scanner;

public class YildizHareketEttirme {
	public static void main(String[] args) {
		int x = 2, y = 2;

		for (int i = 0; i < 5; i++) {
			System.out.print(" ");
			for (int j = 0; j < 5; j++) {
				if (i == y && j == x) {
					System.out.print("*");
				} else {

					System.out.print("∙");
				}

			}
			System.out.println(" ");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen ilerlemek istediğiniz yön tuşuna basınız.");
		int yonTusu = sc.nextInt();
		while (yonTusu != 0) {
			if (yonTusu == 2) {
				y++;
				if (y == 5) {
					y = 0;
				}
				for (int i = 0; i < 5; i++) {
					System.out.print(" ");
					for (int j = 0; j < 5; j++) {
						if (i == y && j == x) {
							System.out.print("*");
						} else {
							System.out.print("∙");
						}

					}
					System.out.println(" ");

				}
				System.out.println("Lütfen ilerlemek istediğiniz yön tuşuna basınız.");
				yonTusu = sc.nextInt();

			} else if (yonTusu == 8) {
				if (y == 0) {
					y = 5;
				}
				y--;

				for (int i = 0; i < 5; i++) {
					System.out.print(" ");
					for (int j = 0; j < 5; j++) {
						if (i == y && j == x) {
							System.out.print("*");

						} else {
							System.out.print("∙");
						}

					}
					System.out.println(" ");

				}
				System.out.println("Lütfen ilerlemek istediğiniz yön tuşuna basınız.");
				yonTusu = sc.nextInt();

			} else if (yonTusu == 4) {

				if (x == 0) {
					x = 5;
				}
				x--;

				for (int i = 0; i < 5; i++) {
					System.out.print(" ");
					for (int j = 0; j < 5; j++) {
						if (i == y && j == x) {
							System.out.print("*");

						} else {
							System.out.print("∙");
						}

					}

					System.out.println(" ");

				}
				System.out.println("Lütfen ilerlemek istediğiniz yön tuşuna basınız.");
				yonTusu = sc.nextInt();

			} else if (yonTusu == 6) {
				x++;

				if (x == 5) {
					x = 0;
				}

				for (int i = 0; i < 5; i++) {
					System.out.print(" ");
					for (int j = 0; j < 5; j++) {
						if (i == y && j == x) {
							System.out.print("*");

						} else {
							System.out.print("∙");
						}

					}

					System.out.println(" ");

				}
				System.out.println("Lütfen ilerlemek istediğiniz yön tuşuna basınız.");
				yonTusu = sc.nextInt();

			} else {
				System.out.println("Lütfen geçerli bir yön tuşu ( 2,4,6,8 ) giriniz. Çıkmak için 0'a basın ");
				yonTusu = sc.nextInt();
			}
		}

		System.out.println("Son hali");
		for (int i = 0; i < 5; i++) {
			System.out.print(" ");
			for (int j = 0; j < 5; j++) {
				if (i == y && j == x) {
					System.out.print("*");
				} else {

					System.out.print("∙");
				}

			}
			System.out.println(" ");
		}
	sc.close();
	}

}
