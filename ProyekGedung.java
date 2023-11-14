import java.util.Scanner;

public class ProyekGedung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String akun, inputUserAdmin, inputPwAdmin, inputUserMember, inputPwMember, inputKodeMenu1, inputKodeMenu2;
        String kodeVeriv[] = {"01234", "12345", "23456", "34567", "45678", "56789", "67890"};
        int tm, gd, stepLogin, menuGd1, stepGd, MmtdBayar;
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
