package kolkoKrzyzyk;

import kolkoKrzyzyk.ustawienia.logika_gry.CzyZwyciezcaRundy;
import kolkoKrzyzyk.ustawienia.logika_gry.UstawieniaStartGry;
import kolkoKrzyzyk.ustawienia.logika_gry.Rozgrywka;
import kolkoKrzyzyk.ustawienia.logika_gry.KoniecGry;
import kolkoKrzyzyk.ustawienia.plansza.Plansza;
import static kolkoKrzyzyk.ustawienia.logika_gry.UstawieniaStartGry.getResult;

public class Main {
    public static void main(String[] args) {

        UstawieniaStartGry.Results result = getResult();

        Plansza plansza = new Plansza(result.size());
        Rozgrywka rozgrywka = new Rozgrywka();
        CzyZwyciezcaRundy zwyciezcaRundy = new CzyZwyciezcaRundy();
        rozgrywka.rozgrywajGre(result.size(), result.ileSymboliWygrywa(), result.ileRund(), plansza, result.graczO(), result.graczX(), zwyciezcaRundy);
        KoniecGry koniecGry = new KoniecGry();
        koniecGry.ktoWygrywa(result.graczO(), result.graczX());

    }

}

