package kolkoKrzyzyk;

import kolkoKrzyzyk.logic.gracze.GraczO;
import kolkoKrzyzyk.logic.gracze.GraczX;
import kolkoKrzyzyk.logic.plansza.Plansza;
import kolkoKrzyzyk.logic.plansza.Symbol;

public class Main {
    public static void main(String[] args) {

        int size = 3;
        Plansza plansza = new Plansza(size);
        System.out.println(plansza);

        GraczX graczX = new GraczX("Ada");
        GraczO graczO = new GraczO("Ola");


        while (true) {
            graczX.mojRuch(plansza, size);
            System.out.println(plansza);

            graczO.mojRuch(plansza, size);
            System.out.println(plansza);

        }
    }

//        if (czyZwyciezca(plansza, wier, pol)) {
//        System.out.println("WYGRAŁ: " + this.name + "_" + Symbol.O.getS() + ", brawo!!!");
//        break;
//    }




}
