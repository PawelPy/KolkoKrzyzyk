package kolkoKrzyzyk.ustawienia.logika_gry;

import kolkoKrzyzyk.ustawienia.plansza.Plansza;
import kolkoKrzyzyk.ustawienia.plansza.Symbol;

import java.util.Scanner;

abstract public class Gracz {

    private String name;
    private Symbol symbol;


    public String getName() {
        return name;
    }

    public Symbol getSymbol() {
        return symbol;
    }


    public void mojRuch(Plansza plansza, int size, Gracz gracz) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(gracz.getName() + "_" + gracz.getSymbol().name() + " podaj swój ruch (wiersz/pole): ");            String ruch = scanner.nextLine();
            try {
                int wier = Integer.parseInt(ruch.substring(0, 1));
                int pol = Integer.parseInt(ruch.substring(1, 2));
                if (wier >= size || pol >= size) {
                    throw new Exception();
                }
                if (plansza.czyPustePole(plansza, wier, pol)) {
                    plansza.getPlansza().get(wier).getWiersz().get(pol).setSymbol(gracz.getSymbol());
                    return;
                }

            } catch (Exception e) {
                System.out.print("błędnie, ");
            }
        }
    }
}
