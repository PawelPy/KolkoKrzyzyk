package kolkoKrzyzyk.logic.gracze;

import kolkoKrzyzyk.logic.plansza.Plansza;
import kolkoKrzyzyk.logic.plansza.Symbol;

import java.util.Scanner;

public class GraczO extends Gracz {


    public GraczO(String name) {
        super(name);
    }

    @Override
    public void mojRuch(Plansza plansza, int size) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(this.name + "_" + Symbol.O.getS() + " podaj swój ruch (wiersz/pole): ");            String ruch = scanner.nextLine();
            try {
                int wier = Integer.parseInt(ruch.substring(0, 1));
                int pol = Integer.parseInt(ruch.substring(1, 2));
                if (wier >= size || pol >= size) {
                    throw new Exception();
                }
                if (czyMaPustePole(plansza, wier, pol)) {
                    plansza.getPlansza().get(wier).getWiersz().get(pol).setSymbol(Symbol.O);
                    return;
                }
            } catch (Exception e) {
                System.out.print("błędnie, ");
            }
        }
    }




}
