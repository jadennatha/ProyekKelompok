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
            } else if (!akun.equalsIgnoreCase("y") || !akun.equalsIgnoreCase("t")){
                System.out.println("Pilihan tidak tersedia. Mohon masukkan huruf y/t");
            }
        } while (!akun.equalsIgnoreCase("y") || !akun.equalsIgnoreCase("t"));
    }
}
