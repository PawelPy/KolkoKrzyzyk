package kolkoKrzyzyk.ustawienia.plansza;

import kolkoKrzyzyk.ustawienia.logika_gry.CzyPustePole;
import java.util.ArrayList;
import java.util.List;

public class Plansza extends CzyPustePole {

    private final List<Wiersz> plansza = new ArrayList<>();

    public Plansza(int size) {
        extracted(size);
    }

    private void extracted(int size) {
        for (int wier = 0; wier < size; wier++) {
            plansza.add(new Wiersz(size));
        }
    }


    @Override
    public String toString() {
        String string = "";
        for (int wier = 0; wier < plansza.size(); wier++) {
            string += plansza.get(wier) + "\n";
            if (wier < plansza.size() - 1 ) {
                for (int i = 0; i < plansza.size(); i++) {
                    if (i < plansza.size() - 1) {
                        string += "---+";
                    } else {
                        string += "---\n";
                    }
                }
            }
        }
        return string;
    }

    public List<Wiersz> getPlansza() {
        return plansza;
    }





}
