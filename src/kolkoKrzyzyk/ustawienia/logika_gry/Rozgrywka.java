package kolkoKrzyzyk.ustawienia.logika_gry;

import kolkoKrzyzyk.ustawienia.gracze.Gracz;
import kolkoKrzyzyk.ustawienia.plansza.Plansza;

public class InicjacjaGry {

    public void inicjujGre(int size, int ileSymboliWygrywa, int ileRund, Plansza plansza, Gracz graczO, Gracz graczX, CzyZwyciezcaRundy zwyciezcaRundy) {

        int rundaNumer = 1;

        while (rundaNumer <= ileRund) {

            System.out.println("\nRUNDA nr: " + rundaNumer + "\n");
            int iloscRuchowTotal = (int) Math.pow(size, 2);
            int iloscRuchow = 0;
            boolean zwyciezcaR = false;
            plansza = new Plansza(size);
            System.out.println(plansza);

            Gracz gracz;

            if (rundaNumer % 2 != 0) {
                gracz = graczO;
            } else {
                gracz = graczX;
            }
            while (iloscRuchow < iloscRuchowTotal - 1) {
                gracz.mojRuch(plansza, size, gracz);
                System.out.println(plansza);
                iloscRuchow++;
                if (zwyciezcaRundy.czyZwyciezcaRundy(plansza, size, gracz, ileSymboliWygrywa)) {
                    zwyciezcaR = true;
                    break;
                }
                if (gracz.equals(graczO)) {
                    gracz = graczX;
                } else if (gracz.equals(graczX)){
                    gracz = graczO;
                }
            }
            if (!zwyciezcaR) {
                System.out.println("Nikt nie wygrał tej rundy");
            }
            rundaNumer++;
        }
    }
}
