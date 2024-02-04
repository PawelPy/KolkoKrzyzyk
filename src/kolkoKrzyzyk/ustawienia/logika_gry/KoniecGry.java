package kolkoKrzyzyk.ustawienia.logika_gry;

import kolkoKrzyzyk.ustawienia.gracze.Gracz;

public class KoniecGry {

    Gracz graczO;
    Gracz graczX;

    public void ktoWygrywa(Gracz graczO, Gracz graczX) {

        System.out.println("\n-----------------------------");
        System.out.print("KONIEC GRY! - ");

        int scoreO = graczO.getWygraneRundy();
        int scoreX = graczX.getWygraneRundy();

        if (scoreO > scoreX) {
            System.out.println("wygrywa " + graczO.getName() + ", " + scoreO + "/" + scoreX);
        } else if (scoreO < scoreX) {
            System.out.println("wygrywa " + graczX.getName() + ", " + scoreX + "/" + scoreO);
        } else if (scoreX == 0) {
            System.out.println("nikt nie wygrał żadnej z rund");
        } else {
            System.out.println("mamy remis, " + scoreO + "/" + scoreX);
        }
    }
}
