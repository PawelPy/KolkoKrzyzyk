package kolkoKrzyzyk.ustawienia.logika_gry;

import kolkoKrzyzyk.ustawienia.plansza.Plansza;
import kolkoKrzyzyk.ustawienia.plansza.Symbol;

abstract public class PustePole {


    public boolean czyPustePole(Plansza plansza, int wier, int pol) {
        Symbol s = plansza.getPlansza().get(wier).getWiersz().get(pol).getSymbol();
        return s.equals(Symbol.None);
    }
}
