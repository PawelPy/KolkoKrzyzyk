package kolkoKrzyzyk.ustawienia.logika_gry;

import kolkoKrzyzyk.ustawienia.gracze.Gracz;
import kolkoKrzyzyk.ustawienia.gracze.GraczO;
import kolkoKrzyzyk.ustawienia.gracze.GraczX;

import java.util.Scanner;

public class UstawieniaGry {

    public static Results getResult() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPodaj rozmiar planszy ");
        int size = scanner.nextInt();

        System.out.println("Podaj ile rund ma mieć gra");
        int ileRund = scanner.nextInt();

        System.out.println("Podaj ile symboli wygrywa / min 2, max " + size);
        int ileSymboliWygrywa = scanner.nextInt();

        System.out.println("Podaj imię Gracza O");
        String nameGraczO = scanner.next();
        Gracz graczO = new GraczO(nameGraczO);

        System.out.println("Podaj imię Gracza X");
        String nameGraczX = scanner.next();
        Gracz graczX = new GraczX(nameGraczX);

        return new Results(size, ileSymboliWygrywa, ileRund, graczO, graczX);
    }

    public record Results(int size, int ileSymboliWygrywa, int ileRund, Gracz graczO, Gracz graczX) {
    }

}
