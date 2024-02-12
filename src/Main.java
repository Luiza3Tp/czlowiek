import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String imie,oczy,wlosy;
        int wiek;
        System.out.println("podaj imie");
        imie = scanner.nextLine();
        System.out.println("podaj wiek");
        wiek = scanner.nextInt();
        scanner.nextLine();
        System.out.println("podaj kolor oczu");
        oczy = scanner.nextLine();
        Oczy wyborOczu = switch (oczy) {
            case "Niebieskie" -> Oczy.NIEBIESKIE;
            case "Brazowy" -> Oczy.BRAZOWE;
            case "Zielony" -> Oczy.ZIELONE;
            case "Czarny" -> Oczy.CZARNE;
            default -> null;
        };
        System.out.println("Podaj Kolor włosów");
        wlosy = scanner.nextLine();

        Wlosy wyborWlosow = switch (wlosy) {
            case "Czarne" -> Wlosy.CZARNE;
            case "Brazowe" -> Wlosy.BRAZOWE;
            case "Blond" -> Wlosy.BLOND;
            default -> null;
        };
        Czlowiek czlowiek = new Czlowiek(imie, wiek, wyborOczu, wyborWlosow);
        czlowiek.wyswietlAtrybuty();

    }
}
