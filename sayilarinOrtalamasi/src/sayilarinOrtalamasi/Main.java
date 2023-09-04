package sayilarinOrtalamasi;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Bir sayı giriniz : ");
		int k = input.nextInt();

		int total = 0;
		int index = 0;

		for (int i = 1; i <= k; i++) {

			if (i % 3 == 0 && i % 4 == 0) {
				index++;
				total = total + i;
				System.out.println(i);

			}
		}
		int average = total / index;
		System.out.println("3 ve 4 ile kalansız bölünen sayıların toplamı : " + total);
		System.out.println("3 ve 4 ile kalansız bölünen sayı adedi : " + index);
		System.out.println("Ortalama : " + average);

	}

}
