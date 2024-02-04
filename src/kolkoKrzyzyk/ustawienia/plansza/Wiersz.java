package kolkoKrzyzyk.logic.plansza;

import java.util.ArrayList;
import java.util.List;

public class Wiersz {

    private final List<Pole> wiersz;
    private int size;


    public Wiersz(int size) {
        wiersz = new ArrayList<>();
        for (int pol = 0; pol < size; pol++) {
            wiersz.add(pol, new Pole(Symbol.None));
        }
    }

    public List<Pole> getWiersz() {
        return wiersz;
    }

    @Override
    public String toString() {
        String string = " ";
        for (int pol = 0; pol < wiersz.size(); pol++) {
            string += String.valueOf(wiersz.get(pol).getSymbol().getS());
            if (pol < wiersz.size() - 1) {
                string += " | ";
            } else {
                string += "";
            }
        }
        return string;
    }
}

