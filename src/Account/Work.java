package Account;
import java.util.Scanner;

public class Work {
    public static Help help = new Help();

    public static void main(String[] args) {
        System.out.println("Yaddasda hesab yoxdur yeni hesab yaradin");
        hesabyaratma();
    }

    public static void hesabyaratma() {
        System.out.println("Hesab adini girin");
        Scanner scanner = new Scanner(System.in);
        String hesabname = scanner.nextLine();
        help.setHesabadi(hesabname);
        System.out.println("Hesab parolunu girin");
        String hesabpasword = scanner.nextLine();
        help.setParol(hesabpasword);
        System.out.println("Hesab ugurla yaradildi");
        hesabagiris();
    }

    public static void hesabagiris() {
        System.out.println("hesaba giris edin");
        System.out.println("hesabin adini yazin");
        Scanner scanner2 = new Scanner(System.in);
        String istifadeciadi = scanner2.nextLine();
        System.out.println("parol girin");
        Scanner scanner3 = new Scanner(System.in);
        String istifadeciparolu = scanner3.nextLine();
        if (help.getHesabadi().equals(istifadeciadi) && help.getParol().equals(istifadeciparolu)) {
            System.out.println("Hesaba giris edildi");
            System.out.println("parol deyismek isetyirsiz? beli(1) xeyr(2)");
            Scanner scanner5 = new Scanner(System.in);
            int istek1 = scanner5.nextInt();
            switch (istek1) {
                case 1:
                    help.setParol(paroldeyisim());
                    System.out.println("yeniden hesaba daxil olun");
                    hesabagiris();
                case 2:
                    break;

            }
        } else if (help.getHesabadi().equals(istifadeciadi) && !(help.getParol().equals(istifadeciparolu))) {
            System.out.println("Parol yanlisdir.");
            hesabyaratma();
        } else if (!(help.getHesabadi().equals(istifadeciadi)) && !(help.getParol().equals(istifadeciparolu))) {
            System.out.println("Hesab melumatlari yanlisdir.yeni hesab yaradin");
            hesabyaratma();
        }
    }

    public static String paroldeyisim() {
        System.out.println("Parol girin");
        Scanner scanner4 = new Scanner(System.in);
        String yeniparol = scanner4.nextLine();
        if (help.getParol().equals(yeniparol)) {
            System.out.println("ferqli parol girin");
            paroldeyisim();
        } else {
            help.setParol(yeniparol);
            System.out.println("Parol ugurla deyisdi");
        }
        return yeniparol;
    }
}