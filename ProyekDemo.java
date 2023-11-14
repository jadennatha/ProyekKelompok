import java.util.Scanner;

public class ProyekDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String akun, inputUserAdmin, inputPwAdmin, inputUserMember, inputPwMember, inputKodeMenu1, inputKodeMenu2;
        String kodeVeriv[] = {"01234", "12345", "23456", "34567", "45678", "56789", "67890"};
        int tm, gd, stepLogin, menuGd1, stepGd, mtdBayar1, mtdBayar2;
        String name, noTelp, tgl, verivikasi;
        long tarif, totalTarifPil1 = 0, totalTarifPil2 = 0,totalTarifPil3 = 0,totalTarifPil4 = 0;
        long hargaPil1, hargaPil2, hargaPil3, hargaPil4;
        int subMenu1, subMenu2, subMenu3, subMenu4;
        String brgTersedia[][]={
            {"Meja      ", "Rp.10000/pcs"},
            {"Kursi     ", "Rp.5000/pcs"},
            {"Karpet    ", "Rp.50000/pcs"},
            {"Dekorasi  ", "Rp.300000"},
         };

        String[] regUserMemb = new String[100];
        String[] regPwMemb = new String[100];
        int jmlUserMemb = 0;
        regUserMemb[jmlUserMemb] = "member";
        regPwMemb[jmlUserMemb] = "12345";
        jmlUserMemb++;
        
        

        System.out.println("\n^ SELAMAT DATANG DI WEBSITE BOOKING GDEUNG SOEHAT ^");
        System.out.println("     ! Silahkan masuk untuk melanjutkan !     ");

        do {
            System.out.print("\nApakah Anda sudah punya akun? (y/t) : ");
            akun = input.next();
            if (akun.equalsIgnoreCase("t")){
                System.out.print("Masukkan username baru: ");
                String inputUserBaru = input.next();
                System.out.print("Masukkan password baru: ");
                String inputPwBaru = input.next();
                if (jmlUserMemb < regUserMemb.length && jmlUserMemb < regPwMemb.length) {
                    regUserMemb[jmlUserMemb] = inputUserBaru;
                    regPwMemb[jmlUserMemb] = inputPwBaru;
                    jmlUserMemb++;
                    System.out.println("User member baru berhasil terdaftar!");
                } else {
                    System.out.println("Maaf, jumlah member melebihi batas yang ditentukan.");
                }

            } else if (akun.equalsIgnoreCase("y")) {
                    System.out.println(",----------------------------------------------<");
                    System.out.println("|  Selamat Datang di Website Booking Gedung:)  |");
                    System.out.println("|        Silahkan pilih halaman login!         |");
                    System.out.println("|----------------------------------------------|");
                    System.out.println("|   1. Login Admin                             |");
                    System.out.println("|   2. Login Member                            |");
                    System.out.println("|   3. Keluar                                  |");
                    System.out.println("|_____________________________________________/.");
                do {
                    System.out.print("Masukkan Pilihan Anda (1-3) : ");
                    stepLogin = input.nextInt();
                    if (stepLogin < 1 || stepLogin > 3) {
                        System.out.println("\nMohon masukkan nomor antara 1 dan 4.");
                    }
                } while (stepLogin < 1 || stepLogin > 3);

                if (stepLogin==1) {
                    String[][] users = {
                        {"admin1", "admin111"},
                        {"admin2", "admin222"}
                    };
                    boolean userAdminValid;
                    int menuAdm;
                    do {
                        System.out.print("Masukkan username: ");
                        inputUserAdmin = input.next();
                        System.out.print("Masukkan password: ");
                        inputPwAdmin = input.next();
                        userAdminValid=false;
                        for (String[] user : users) {
                            if (user[0].equals(inputUserAdmin) && user[1].equals(inputPwAdmin)) {
                            userAdminValid = true;
                                break;
                            }
                        }
                        if (userAdminValid) {
                            System.out.println("LOGIN BERHASIL!");
                            System.out.println("SELAMAT DATANG, ADMIN:)");
                        } else {
                            System.out.println("Login gagal. Username atau password salah. Silakan coba lagi.");
                        }
                    } while (!userAdminValid);
                        System.out.println("1. lihat data member");
                        System.out.println("2. Keluar");
                        System.out.print("Masukkan Pilihan : ");
                        menuAdm=input.nextInt();
                        switch (menuAdm) {
                            case 1:
                                System.out.println("\nJumlah Member : "+jmlUserMemb );
                                System.out.println("User yang telah terdaftar :\n");
                                for (int i = 0; i < jmlUserMemb; i++) {
                                    System.out.println("Username : " + regUserMemb[i]);
                                    System.out.println("Password : " + regPwMemb[i]);
                                    System.out.println("---------------------------");
                                }
                            case 2:
                                System.exit(0);
                            }   

                } else if (stepLogin==2){
                    boolean userMemberValid;
                    do {
                        System.out.print("Masukkan username: ");
                        inputUserMember = input.next();
                        System.out.print("Masukkan password: ");
                        inputPwMember = input.next();
                        userMemberValid=false;
                        for (int i = 0; i < jmlUserMemb; i++) {
                            if (inputUserMember.equals(regUserMemb[i]) && inputPwMember.equals(regPwMemb[i])) {
                                userMemberValid = true;
                                break;
                            }
                        }
                        if (userMemberValid) {
                            System.out.println("\nLOGIN BERHASIL!");
                            System.out.println("SELAMAT DATANG, MEMBER:)");
                        } else {
                            System.out.println("Login gagal. Username atau password salah. Silakan coba lagi.");
                        }
                    } while (!userMemberValid);
                    boolean inginPesanLagi=true;
                    while (inginPesanLagi) {
                        System.out.print("\nApakah Anda ingin memesan gedung (y/t)? ");
                        verivikasi = input.next();
                        if (verivikasi.equalsIgnoreCase("y")) {
                                    System.out.print("Masukkan Nama Anda : ");
                                    name = input.next();
                                    System.out.print("Masukkan No. Telepon : ");
                                    noTelp=input.next();
                                    System.out.print("Masukkan Tanggal Acara (DD-MM-YYY) : ");
                                    tgl = input.next();
                                    System.out.println("\nKapasitas Maksimal tamu 900.");
                                    System.out.println("Tarif yang harus anda bayar Rp.90000/tamu");
                                    do {
                                        System.out.print("Masukkan Jumlah Tamu : ");
                                        tm = input.nextInt();
                                        tarif = tm * 90000;
                                        if (tm > 900) {
                                            System.out.println("Mohon Maaf, jumlah tamu melebihi kapasitas maks. 900");
                                        } else if (tm < 1){
                                            System.out.println("Mohon memasukkan jumlah tamu minimal 1");
                                        }
                                    } while (tm < 1 || tm > 900);
                                    boolean langkahSelanjutnya=true;
                                    while (langkahSelanjutnya) {
                                        System.out.println("\nPilih Langkah Selanjutnya!");
                                        System.out.println("1. Sewa Barang tambahan Lain");
                                        System.out.println("2. Bayar Sekarang");
                                        do {
                                            System.out.print("Masukkan Pilihan : ");
                                            stepGd = input.nextInt();
                                            if (stepGd < 1 || stepGd > 2) {
                                                System.out.println("Mohon masukkan nomor gedung antara 1 dan 2.");
                                            }
                                        } while (stepGd < 1 || stepGd > 2);
                                        
                                        
                                        switch (stepGd) {
                                            case 1:
                                                System.out.println(",-----------------------------------------<");
                                                System.out.println("|       Daftar Barang yang tersedia!      |");
                                                System.out.println("|_________________________________________|");
                                                System.out.printf("%-5s%-20s\n", "| No.", " | Nama Barang\t | Harga\t  |");
                                                System.out.println("|-----|------------------|----------------|");
                                                for (int i = 0; i < brgTersedia.length; i++) {
                                                    System.out.print("| "+(i + 1) + ". ");
                                                    for (int j=0; j<brgTersedia[i].length; j++){
                                                        System.out.print(" | "+brgTersedia[i][j]+"\t");
                                                    }
                                                    System.out.print("  |");
                                                    System.out.println();
                                                }
                                                System.out.println("|_____|__________________|_______________/.");       
                                                do {
                                                    System.out.print("Masukkan Pilihan Anda : ");
                                                    menuGd1 = input.nextInt();
                                                    if (menuGd1 < 1 || menuGd1 > 4) {
                                                        System.out.println("Mohon masukkan angka antara 1 dan 4.");
                                                    }
                                                } while (menuGd1 < 1 || menuGd1 > 4);
                                                
                                                
                                                switch (menuGd1) {
                                                    case 1:
                                                        System.out.print("Jumlah Meja yang akan dipesan : ");
                                                        subMenu1=input.nextInt();
                                                        hargaPil1=subMenu1*10000;
                                                        totalTarifPil1 = hargaPil1+tarif;
                                                        System.out.println("GEDUNG SOEHAT");
                                                        System.out.println("\n--------Informasi Pemesanan Anda!-------");
                                                        System.out.println("Atas Nama       : " + name);
                                                        System.out.println("No. Telepon     : " + noTelp);
                                                        System.out.println("Tanggal         : " + tgl);
                                                        System.out.println("Jumlah Tamu     : " + tm);
                                                        System.out.println("Barang tambahan : " + brgTersedia[0][0]);
                                                        System.out.println("Total Biaya     : Rp." + totalTarifPil1);
                                                        System.out.println("----------------------------------------");
                                                        System.exit(0);
                                                        break;
                                                    case 2:
                                                    System.out.print("Jumlah Kursi yang akan dipesan : ");
                                                        subMenu2=input.nextInt();
                                                        hargaPil2=subMenu2*5000;
                                                        totalTarifPil2 = hargaPil2+tarif;
                                                        System.out.println("\n>---------------------------------------<");
                                                        System.out.println("|\t\tGEDUNG SOEHAT\t\t|");
                                                        System.out.println("|________Informasi Pemesanan Anda!______|");
                                                        System.out.println("Atas Nama       : " + name);
                                                        System.out.println("No. Telepon     : " + noTelp);
                                                        System.out.println("Tanggal         : " + tgl);
                                                        System.out.println("Jumlah Tamu     : " + tm);
                                                        System.out.println("Barang tambahan : " + brgTersedia[1][0]);
                                                        System.out.println("Total Biaya     : Rp." + totalTarifPil2);
                                                        System.out.println("----------------------------------------");
                                                        System.exit(0);
                                                        break;
                                                    case 3:
                                                    System.out.print("Jumlah Karpet yang akan dipesan : ");
                                                        subMenu3=input.nextInt();
                                                        hargaPil3=subMenu3*50000;
                                                        totalTarifPil3 = hargaPil3+tarif;
                                                        System.out.println("\n>---------------------------------------<");
                                                        System.out.println("|\t\tGEDUNG SOEHAT\t\t|");
                                                        System.out.println("|________Informasi Pemesanan Anda!______|");
                                                        System.out.println("Atas Nama       : " + name);
                                                        System.out.println("No. Telepon     : " + noTelp);
                                                        System.out.println("Tanggal         : " + tgl);
                                                        System.out.println("Jumlah Tamu     : " + tm);
                                                        System.out.println("Barang tambahan : " + brgTersedia[2][0]);
                                                        System.out.println("Total Biaya     : Rp." + totalTarifPil3);
                                                        System.out.println("----------------------------------------");
                                                        System.exit(0);
                                                        break;
                                                    case 4:
                                                    System.out.print("Jumlah Dekorasi yang akan dipesan : ");
                                                        subMenu4=input.nextInt();
                                                        hargaPil4=subMenu4*300000;
                                                        totalTarifPil4 = hargaPil4+tarif;
                                                        System.out.println("\n>---------------------------------------<");
                                                        System.out.println("|\t\tGEDUNG SOEHAT\t\t|");
                                                        System.out.println("|________Informasi Pemesanan Anda!______|");
                                                        System.out.println("Atas Nama       : " + name);
                                                        System.out.println("No. Telepon     : " + noTelp);
                                                        System.out.println("Tanggal         : " + tgl);
                                                        System.out.println("Jumlah Tamu     : " + tm);
                                                        System.out.println("Barang tambahan : " + brgTersedia[3][0]);
                                                        System.out.println("Total Biaya     : Rp." + totalTarifPil4);
                                                        System.out.println("----------------------------------------");
                                                        System.exit(0);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                break;
                                            case 2:
                                                System.out.println("1. Bayar lewat BRI/BNI/BCA di no.rek 2341760195 a.n Gerly Vaeyungfan");
                                                System.out.println("2. Bayar lewat DANA/ShopeePay/LinkAja di no 085604054712 a.n Gerly Vaeyungfan");
                                                do {
                                                    System.out.print("Pilih Metode Pembayaran : ");
                                                    mtdBayar1 = input.nextInt();
                                                    if (mtdBayar1 < 1 || mtdBayar1 > 2) {
                                                        System.out.println("Mohon masukkan angka antara 1 dan 2.");
                                                    }
                                                } while (mtdBayar1 < 1 || mtdBayar1 > 2);
                                                switch (mtdBayar1) {
                                                    case 1:
                                                        boolean isKode1Valid = false;
                                                        do {
                                                            System.out.println("\nKode Verifikasi dikirim melalui SMS");
                                                            System.out.print("Masukkan Kode Verivikasi : ");
                                                            inputKodeMenu1 = input.next();
                                                            isKode1Valid = false;
                                                            for (String kode : kodeVeriv) {
                                                                if (inputKodeMenu1.equals(kode)) {
                                                                    isKode1Valid = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!isKode1Valid) {
                                                                System.out.println("Kode Verifikasi Salah. Silahkan coba lagi");
                                                            } else {
                                                                System.out.println("\n>---------------------------------------<");
                                                                System.out.println("|\t\tGEDUNG SOEHAT\t\t|");
                                                                System.out.println("|________Informasi Pemesanan Anda!______|");
                                                                System.out.println("Atas Nama       : " + name);
                                                                System.out.println("No. Telepon     : " + noTelp);
                                                                System.out.println("Tanggal         : " + tgl);
                                                                System.out.println("Jumlah Tamu     : " + tm);
                                                                System.out.println("Total Biaya     : Rp." + tarif);
                                                                System.out.println("----------------------------------------");
                                                            }
                                                        } while (!isKode1Valid);
                                                        System.exit(0);;
                                                    case 2:
                                                        boolean isKode2Valid = false;
                                                        do {
                                                            System.out.println("\nKode Verifikasi dikirim melalui SMS");
                                                            System.out.print("Masukkan Kode Verivikasi : ");
                                                            inputKodeMenu2 = input.next();
                                                            isKode2Valid = false;
                                                            for (String kode : kodeVeriv) {
                                                                if (inputKodeMenu2.equals(kode)) {
                                                                    isKode2Valid = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!isKode2Valid) {
                                                                System.out.println("Kode Verifikasi Salah. Silahkan coba lagi");
                                                            } else {
                                                                System.out.println("\n>---------------------------------------<");
                                                                System.out.println("|\t\tGEDUNG SOEHAT\t\t|");
                                                                System.out.println("|________Informasi Pemesanan Anda!______|");
                                                                System.out.println("Atas Nama       : " + name);
                                                                System.out.println("No. Telepon     : " + noTelp);
                                                                System.out.println("Tanggal         : " + tgl);
                                                                System.out.println("Jumlah Tamu     : " + tm);
                                                                System.out.println("Total Biaya     : Rp." + tarif);
                                                                System.out.println("----------------------------------------");
                                                            }
                                                        } while (!isKode2Valid);
                                                        System.exit(0);;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                    break;
                                        }
                                    }
                                    break;

                        } else if (verivikasi.equalsIgnoreCase("t")) {
                            System.out.print("Terima kasih! Selamat berjumpa kembali:)");
                            System.exit(0);
                        } else {    
                            System.out.println("Maaf, pilihan anda salah! masukkan y/t.");
                        }
                    }
                } else if (stepLogin==3){
                    System.out.println("Terima kasih.");
                    System.exit(0);
                }  
            
            } else if (!akun.equalsIgnoreCase("y") || !akun.equalsIgnoreCase("t")){
                System.out.println("Pilihan tidak tersedia. Mohon masukkan huruf y/t");
            }

        } while (!akun.equalsIgnoreCase("y") || !akun.equalsIgnoreCase("t"));
    }
}
