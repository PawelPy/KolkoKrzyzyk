package kolkoKrzyzyk.ustawienia.plansza;

import java.util.ArrayList;
import java.util.List;

public class Wiersz {

    private final List<Pole> wiersz;
    private int size;


    public Wiersz(int size) {
        wiersz = getPoles(size);
    }

    private List<Pole> getPoles(int size) {
        final List<Pole> wiersz;
        wiersz = new ArrayList<>();
        for (int pol = 0; pol < size; pol++) {
            wiersz.add(pol, new Pole(Symbol.None));
        }
        return wiersz;
    }

    public List<Pole> getWiersz() {
        return wiersz;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder(" ");
        for (int pol = 0; pol < wiersz.size(); pol++) {
            string.append(wiersz.get(pol).getSymbol());
            if (pol < wiersz.size() - 1) {
                string.append(" | ");
            } else {
            }
        }
        return string.toString();
    }
}


