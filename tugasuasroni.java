/*
*	Nama	: Roni
*	NIM		: 202013040
*	Prodi	: TIF 1B
*	Makul	: ALP
*
*/

import java.util.*;
public class tugasuasroni{
	public static void main (String[]args){


		System.out.println();
		System.out.println("\t\t\t\t\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
		System.out.println("\t\t\t\t\t|                                                                |\n");
		System.out.println("\t\t\t\t\t|                      Projek UAS Semester 1                     |\n");
		System.out.println("\t\t\t\t\t|                                                                |\n");
		System.out.println("\t\t\t\t\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
		System.out.println("\t\t\t\t\t|                                                                |\n");
		System.out.println("\t\t\t\t\t|\t\tNama\t\t: Roni                           |\n");
		System.out.println("\t\t\t\t\t|\t\tNim\t\t: 202013040                      |\n");
		System.out.println("\t\t\t\t\t|\t\tKelas\t\t: TIF 1 B                        |\n");
		System.out.println("\t\t\t\t\t|\t\tProdi\t\t: Teknik Informatika             |\n");
		System.out.println("\t\t\t\t\t|\t\tMata Kuliah\t: Algoritma dan Pemrograman      |\n");
		System.out.println("\t\t\t\t\t|                                                                |\n");
		System.out.println("\t\t\t\t\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
		System.out.println("\t\t\t\t\t|                                                                |\n");
		System.out.println("\t\t\t\t\t|        Program Perhitungan Aplikasi Volume Bangun Ruang        |\n");
		System.out.println("\t\t\t\t\t|                                                                |\n");
		System.out.println("\t\t\t\t\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
		System.out.println();


		String data[]={"Roni","202013040"};
		String username,password;
		Scanner masuk=new Scanner(System.in);
		System.out.print("\nUsername \t: ");
		username=masuk.nextLine();
		System.out.print("Password \t: ");
		password=masuk.nextLine();

		if(username.equals(data[0])&&password.equals(data[1])){
			
		System.out.println();
		System.out.println("\t\t\t\t\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
		System.out.println("\t\t\t\t\t|                                                                |\n");
		System.out.println("\t\t\t\t\t|                         Selamat Datang                         |\n");
		System.out.println("\t\t\t\t\t|                               Di                               |\n");
		System.out.println("\t\t\t\t\t|                                                                |\n");
		System.out.println("\t\t\t\t\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
		System.out.println("\t\t\t\t\t|                                                                |\n");
		System.out.println("\t\t\t\t\t|        Program Perhitungan Aplikasi Volume Bangun Ruang        |\n");
		System.out.println("\t\t\t\t\t|                                                                |\n");
		System.out.println("\t\t\t\t\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
			menu();
		}else{
			System.out.print("Maaf Data Yang Kamu Inputkan Tidak Sesuai Dengan Apapun : ");
		}
		
		
	}

// Pemilihan di menu awal

	static void menu(){
		
		String menu_utama[]={"Mulai Program","Motivation","Keluar"};
		System.out.println("1. "+menu_utama[0]);
		System.out.println("2. "+menu_utama[1]);
		System.out.println("3. "+menu_utama[2]);
		
		Scanner pilih=new Scanner(System.in);
		int menu;
		
		System.out.println();
		System.out.print("Silahkan Pilih Menu : ");
		menu=pilih.nextInt();

		if(menu==1){
			mulai();
		}else if(menu==2){
			Motivation();
		}else{
			System.out.println();
			System.out.println("Terima Kasih Telah Menggunakan Program Saya");
			System.out.println("Semoga Harimu Menyenangkan");
			System.exit(0);
		}
	}


	static void mulai(){

		int daftar_bangun;
		String bangun_ruang[]={"Volume Kubus","Volume Balok","Volume Kerucut","Volume Prisma Segitiga","Volume Tabung","Volume Limas Segitiga","Perhitungan Volume Semua Bangun Ruang","Keluar"};
		
		System.out.println();
		System.out.println();
		System.out.println("1. "+bangun_ruang[0]);
		System.out.println("2. "+bangun_ruang[1]);
		System.out.println("3. "+bangun_ruang[2]);
		System.out.println("4. "+bangun_ruang[3]);
		System.out.println("5. "+bangun_ruang[4]);
		System.out.println("6. "+bangun_ruang[5]);
		System.out.println("7. "+bangun_ruang[6]);
		System.out.println("8. "+bangun_ruang[7]);
		
		
		Scanner pilih2=new Scanner(System.in);
		int menu2;

		System.out.print("Pilih Bangun Yang Akan Dilakukan Perhitungan : ");
		menu2=pilih2.nextInt();

		switch(menu2){

			case 1 :

					System.out.println();
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println("\t|===================== Menghitung Volume Kubus ==================|\n");
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println();
					System.out.print("\t\tInputkan Nilai Sisi = ");

					double sisi,volume_kubus;

					Scanner terimasisi=new Scanner(System.in);
					sisi=terimasisi.nextDouble();

					volume_kubus=sisi*sisi*sisi;

					System.out.println();
					System.out.println("\t\tVolume Kubus Adalah "+volume_kubus);
					System.out.println("\t\t____________________");
					System.out.println();
					System.out.println("\t\tPenghitungan  Volume Kubus Telah Selesai");
					System.out.println("\t\t________________________________________");
					selanjutnya();
					break ; 


			case 2:

					System.out.println();
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println("\t|===================== Menghitung Volume Balok ==================|\n");
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println();
					System.out.print("\t\tInputkan Nilai Panjang = ");

					double panjang_balok,lebar_balok,tinggi_balok,volume_balok;

					Scanner terimapanjang=new Scanner(System.in);
					panjang_balok=terimapanjang.nextDouble();

					System.out.println();
					System.out.print("\t\tInputkan Nilai Lebar = ");
					Scanner terimalebar=new Scanner(System.in);
					lebar_balok=terimalebar.nextDouble();

					System.out.println();
					System.out.print("\t\tinputkan nilai Tinggi = ");
					Scanner terimatinggi=new Scanner(System.in);
					tinggi_balok=terimatinggi.nextDouble();

					volume_balok=panjang_balok*lebar_balok*tinggi_balok;

					System.out.println();
					System.out.println("\t\tVolume Balok Adalah "+volume_balok);
					System.out.println("\t\t____________________");
					System.out.println();
					System.out.println("\t\tPenghitungan Volume Balok Telah Selesai");
					System.out.println("\t\t_______________________________________");
					selanjutnya();

					break;

			case 3 :

					System.out.println();
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println("\t|==================== Menghitung Volume Kerucut =================|\n");
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println();
					System.out.print("\t\tInputkan NIlai Luas Alas = ");

					double luas_alas_kerucut,tinggi_kerucut,volume_kerucut;

					Scanner terimaalaskerucut=new Scanner(System.in);
					luas_alas_kerucut=terimaalaskerucut.nextDouble();

					System.out.println();
					System.out.print("\t\tInputkan Nilai Tinggi = ");
					Scanner terimatinggikerucut=new Scanner(System.in);
					tinggi_kerucut=terimatinggikerucut.nextDouble();

					volume_kerucut=luas_alas_kerucut*tinggi_kerucut/3;

					System.out.println();
					System.out.println("\t\tVolume Kerucut Adalah "+volume_kerucut);
					System.out.println("\t\t______________________");
					System.out.println();
					System.out.println("\t\tPenghitungan Volume Kerucut Telah Selesai");
					System.out.println("\t\t_________________________________________");
					selanjutnya();
					break;

			case 4 :

					System.out.println();
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println("\t|================ Menghitung Volume Prisma Segitiga =============|\n");
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println();
					System.out.print("\t\tInputkan Nilai Luas Alas = ");

					double luas_alas_prisma,tinggi_prisma,volume_prisma;

					Scanner terimaalasprisma=new Scanner(System.in);
					luas_alas_prisma=terimaalasprisma.nextDouble();

					System.out.println();
					System.out.print("\t\tInputkan Nilai Tinggi = ");
					Scanner terimatinggiprisma=new Scanner(System.in);
					tinggi_prisma=terimatinggiprisma.nextDouble();

					volume_prisma=luas_alas_prisma*tinggi_prisma/2;

					System.out.println();
					System.out.println("\t\tVolume Prisma Segitiga Adalah "+volume_prisma);
					System.out.println("\t\t_______________________________");
					System.out.println();
					System.out.println("\t\tPenghitungan Volume Prisma Segitiga Telah Selesai");
					System.out.println("\t\t_________________________________________________");
					selanjutnya();
					break;

			case 5 :

					System.out.println();
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println("\t|===================== Menghitung Volume Tabung =================|\n");
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println();
					System.out.print("\t\tInputkan Nilai Luas Alas = ");

					double luas_alas_tabung,tinggi_tabung,volume_tabung;

					Scanner terimaalastabung=new Scanner(System.in);
					luas_alas_tabung=terimaalastabung.nextDouble();

					System.out.println();
					System.out.print("\t\tInputkan Nilai Tinggi = ");
					Scanner terimatinggitabung=new Scanner(System.in);
					tinggi_tabung=terimatinggitabung.nextDouble();

					volume_tabung=luas_alas_tabung*tinggi_tabung;

					System.out.println();
					System.out.println("\t\tVolume Tabung Adalah "+volume_tabung);
					System.out.println("\t\t_____________________");
					System.out.println();
					System.out.println("\t\tPenghitungan Volume Tabung Telah Selesai");
					System.out.println("\t\t________________________________________");
					selanjutnya();
					break;

			case 6 : 

					System.out.println();
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println("\t|================= Menghitung Volume Limas Segitiga =============|\n");
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println();
					System.out.print("\t\tInputkan Luas Alas = ");

					double luas_alas_limas,tinggi_limas,volume_limas;

					Scanner terimaalaslimas=new Scanner(System.in);
					luas_alas_limas=terimaalaslimas.nextDouble();

					System.out.println();
					System.out.print("\t\tInputkan Nilai Tinggi = ");
					Scanner terimatinggilimas=new Scanner(System.in);
					tinggi_limas=terimatinggilimas.nextDouble();

					volume_limas=luas_alas_limas*tinggi_limas/2;

					System.out.println();
					System.out.println("\t\tVolume Limas Segitiga Adalah "+volume_limas);
					System.out.println("\t\t_____________________________");
					System.out.println();
					System.out.println("\t\tPenghitungan Volume Limas Segitiga Telah Selesai");
					System.out.println("\t\t________________________________________________");
					selanjutnya();
					break;
			case 7 :

				// Kubus

					System.out.println();
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println("\t|===================== Menghitung Volume Kubus ==================|\n");
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println();
					System.out.print("\t\tInputkan Nilai Sisi = ");

					double sisi1,volume_kubus1;

					Scanner terimasisi1=new Scanner(System.in);
					sisi1=terimasisi1.nextDouble();

					volume_kubus1=sisi1*sisi1*sisi1;

					System.out.println();
					System.out.println("\t\tVolume Kubus Adalah "+volume_kubus1);
					System.out.println("\t\t____________________");
					System.out.println();
					System.out.println("\t\tPenghitungan Telah Selesai");
					System.out.println("\t\t__________________________");

				// Balok 

					System.out.println();
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println("\t|===================== Menghitung Volume Balok ==================|\n");
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println();
					System.out.print("\t\tInputkan Nilai Panjang = ");

					double panjang_balok1,lebar_balok1,tinggi_balok1,volume_balok1;

					Scanner terimapanjang1=new Scanner(System.in);
					panjang_balok1=terimapanjang1.nextDouble();

					System.out.println();
					System.out.print("\t\tInputkan Nilai Lebar = ");
					Scanner terimalebar1=new Scanner(System.in);
					lebar_balok1=terimalebar1.nextDouble();

					System.out.println();
					System.out.print("\t\tinputkan nilai Tinggi = ");
					Scanner terimatinggi1=new Scanner(System.in);
					tinggi_balok1=terimatinggi1.nextDouble();

					volume_balok1=panjang_balok1*lebar_balok1*tinggi_balok1;

					System.out.println();
					System.out.println("\t\tVolume Balok Adalah "+volume_balok1);
					System.out.println("\t\t____________________");
					System.out.println();
					System.out.println("\t\tPenghitungan Telah Selesai");
					System.out.println("\t\t__________________________");

				// Kerucut

					System.out.println();
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println("\t|==================== Menghitung Volume Kerucut =================|\n");
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println();
					System.out.print("\t\tInputkan NIlai Luas Alas = ");

					double luas_alas_kerucut1,tinggi_kerucut1,volume_kerucut1;

					Scanner terimaalaskerucut1=new Scanner(System.in);
					luas_alas_kerucut1=terimaalaskerucut1.nextDouble();

					System.out.println();
					System.out.print("\t\tInputkan Nilai Tinggi = ");
					Scanner terimatinggikerucut1=new Scanner(System.in);
					tinggi_kerucut1=terimatinggikerucut1.nextDouble();

					volume_kerucut1=luas_alas_kerucut1*tinggi_kerucut1/3;

					System.out.println();
					System.out.println("\t\tVolume Kerucut Adalah "+volume_kerucut1);
					System.out.println("\t\t______________________");
					System.out.println();
					System.out.println("\t\tPenghitungan Telah Selesai");
					System.out.println("\t\t_________________________");

				// Prisma Segitiga

					System.out.println();
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println("\t|================ Menghitung Volume Prisma Segitiga =============|\n");
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println();
					System.out.print("\t\tInputkan Nilai Luas Alas = ");

					double luas_alas_prisma1,tinggi_prisma1,volume_prisma1;

					Scanner terimaalasprisma1=new Scanner(System.in);
					luas_alas_prisma1=terimaalasprisma1.nextDouble();

					System.out.println();
					System.out.print("\t\tInputkan Nilai Tinggi = ");
					Scanner terimatinggiprisma1=new Scanner(System.in);
					tinggi_prisma1=terimatinggiprisma1.nextDouble();

					volume_prisma1=luas_alas_prisma1*tinggi_prisma1/2;

					System.out.println();
					System.out.println("\t\tVolume Prisma Segitiga Adalah "+volume_prisma1);
					System.out.println("\t\t______________________________");
					System.out.println();
					System.out.println("\t\tPenghitungan Telah Selesai");
					System.out.println("\t\t__________________________");

				// Volume Tabung

					System.out.println();
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println("\t|===================== Menghitung Volume Tabung =================|\n");
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println();
					System.out.print("\t\tInputkan Nilai Luas Alas = ");

					double luas_alas_tabung1,tinggi_tabung1,volume_tabung1;

					Scanner terimaalastabung1=new Scanner(System.in);
					luas_alas_tabung1=terimaalastabung1.nextDouble();

					System.out.println();
					System.out.print("\t\tnputkan Nilai Tinggi = ");
					Scanner terimatinggitabung1=new Scanner(System.in);
					tinggi_tabung1=terimatinggitabung1.nextDouble();

					volume_tabung1=luas_alas_tabung1*tinggi_tabung1;

					System.out.println();
					System.out.println("\t\tVolume Tabung Adalah "+volume_tabung1);
					System.out.println("\t\t_____________________");
					System.out.println();
					System.out.println("\t\tPenghitungan Telah Selesai");
					System.out.println("\t\t__________________________");
					
					
				// Volume Limas Segitiga

					System.out.println();
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println("\t|================= Menghitung Volume Limas Segitiga =============|\n");
					System.out.println("\t|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
					System.out.println();
					System.out.print("\t\tInputkan Luas Alas = ");

					double luas_alas_limas1,tinggi_limas1,volume_limas1;

					Scanner terimaalaslimas1=new Scanner(System.in);
					luas_alas_limas1=terimaalaslimas1.nextDouble();

					System.out.println();
					System.out.print("\t\tInputkan Nilai Tinggi = ");
					Scanner terimatinggilimas1=new Scanner(System.in);
					tinggi_limas1=terimatinggilimas1.nextDouble();

					volume_limas1=luas_alas_limas1*tinggi_limas1/2;

					System.out.println();
					System.out.println("\t\tVolume Limas Segitiga Adalah "+volume_limas1);
					System.out.println("\t\t_____________________________");
					System.out.println();
					System.out.println("\t\tPenghitungan Telah Selesai");
					System.out.println("\t\t__________________________");
					System.out.println("\n\n\n\n\n\n");


					double hasil[]={volume_kubus1,volume_balok1,volume_kerucut1,volume_prisma1,volume_tabung1,volume_limas1};
					double penampung=0;

	
					for(int h=0; h<(hasil.length); h++){
					for(int i=0; i<(hasil.length-1); i++){
						if(hasil[i]>hasil[i+1]){
						penampung=hasil[i];
						hasil[i]=hasil[i+1];
						hasil[i+1]=penampung;
					}
		 			}
					System.out.print(h+1+"\t = ");
					for(int d=0; d<hasil.length; d++){
					System.out.print(hasil[d]+"\t\t ");
					}
					System.out.println();
					}

					System.out.print("\t\tData pada array a [] setelah di urutkan = {");
					for(int i=0; i<hasil.length; i++){
					System.out.print(hasil[i]+" , ");
					}
					System.out.print("}");
					selanjutnya();
					break;

			case 8 :

					System.out.println();
					System.out.println("Terima Kasih Telah Melakukan Pengitungan");
					System.out.println("Proses Telah Selesai");
					System.out.println("Sistem Akan Keluar");
					System.exit(0);

			default :

					System.out.println();
					System.out.print("Maaf Pilihan No."+menu2+" Tidak Ada Di Sistem");
					System.out.println();
					System.out.println("Sistem Sekarang Akan Keluar");
					System.exit(0);


		}


	}

// motivatiion

	static void Motivation(){
		System.out.println();
		System.out.println("|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
		System.out.println("|========================== Motivation ==========================|\n");
		System.out.println("|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
		System.out.println("|                                                                |\n");
		System.out.println("|=========*_  Kita Harus Bisa Menjadi lebih Baik Lagi  _*========|\n");
		System.out.println("|====================*_  Untuk Kedepan nya  _*===================|\n");
		System.out.println("|==================*_  Karena Ada Orang Tua  _*==================|\n");
		System.out.println("|============*_  Yang Harus Di Buat BAHAGIA  _*==================|\n");
		System.out.println("|===========*_  And Ada Mantan Yang Harus Di Merana  _*==========|\n");
		System.out.println("|                                                                |\n");
		System.out.println("|>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<|\n");
		System.out.println();
		selanjutnya();
	}
		
	static void selanjutnya(){

		Scanner lagi=new Scanner(System.in);
		int ulang;
		System.out.println();	
		System.out.print("\tApakah Kamu Akan Melakukan Pengitungan Lagi ? ( 1/0 ) = ");
		ulang=lagi.nextInt();
		if(ulang==1){
			mulai();
		}else{
			penutup();
		}

	}
	static void penutup(){

		System.out.println();
		System.out.println("\tTerima Kasih Telah Melakukan Pengitungan");
		System.out.println("\tProses Telah Selesai, Sistem Automatis Keluar");
		System.out.println("\tSee you, And Good bay ");

	}}