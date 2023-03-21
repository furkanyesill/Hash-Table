package veriYapilariOdev4;

import java.io.*;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		Table hTable = new Table(10);
		File file = new File("veri.txt");
		if (file.exists()) {
			System.out.println("Dosya var");
		} else {
			System.out.println("Dosya yok! ya da Dosyanın konumu yanlış!");
		}

		Scanner fileScanner = new Scanner(file);

		while (fileScanner.hasNextLine()) {
			System.out.println("dosyadan ekleme işlemi yapılıyor...");
			Thread.sleep(300);
			int key = fileScanner.nextInt();
			String name = fileScanner.next();
			String surname = fileScanner.next();
			hTable.add(key, name, surname);
		}

		Scanner scan = new Scanner(System.in);
		int choice;

		while (true) {
			System.out.println("\nYapmak istediginiz islemi seciniz:\n"
					+ "1-Ekleme\n" 
					+ "2-Arama\n" 
					+ "3-Listele\n"
					+ "4-Ortalama Adım Sayısı\n" 
					+ "5-Çıkış");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Eklemek istediğiniz müşterinin\n"
						+ "Adı:");
				String name = scan.next();
				System.out.print("Soyadı:");
				String surname = scan.next();
				System.out.print("Müşteri numarası:");
				int key = scan.nextInt();
				System.out.println("\nEkleme işlemi yapılıyor...\n");
				Thread.sleep(500);
				hTable.add(key, name, surname);
				break;
			case 2:
				System.out.print("aramak istediğiniz müşterinin\n"
						+ "Müşteri numarası:");
				key = scan.nextInt();
				System.out.println("\nArama işlemi yapılıyor...\n");
				Thread.sleep(500);
				hTable.search(key);
				break;
			case 3:
				System.out.println("\nListeleme işlemi yapılıyor...\n");
				Thread.sleep(500);
				hTable.print();
				System.out.println("\nListeleme tamamlandı.");
				break;
			case 4:
				System.out.println("\nOrtalama adım sayısı hesaplanıyor...\n");
				Thread.sleep(500);
				System.out.println(hTable.topStep / hTable.topPerson);
				break;
			case 5:
				System.out.println("\nÇıkış yapılıyor...");
				Thread.sleep(1000);
				System.out.println("Çıkış yapıldı.");
				return;
			}
		}
	}
}
