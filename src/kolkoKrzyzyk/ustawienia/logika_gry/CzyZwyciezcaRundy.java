package kolkoKrzyzyk.ustawienia.logika_gry;

import kolkoKrzyzyk.ustawienia.gracze.Gracz;
import kolkoKrzyzyk.ustawienia.plansza.Plansza;
import kolkoKrzyzyk.ustawienia.plansza.Symbol;


public class CzyZwyciezcaRundy {


    public boolean czyZwyciezcaRundy(Plansza plansza, int size, Gracz gracz, int ileWygrywa) {

        if (czyZwyciezcaWiersze(plansza, size, gracz, ileWygrywa)) {
            return true;
        } else if (czyZwyciezcaKolumny(plansza, size, gracz,ileWygrywa)) {
            return true;
        } else if (czyZwyciezcaBackSlash(plansza, size, gracz, ileWygrywa) ) {
            return true;
        } else if (czyZwyciezcaSlash(plansza, size, gracz, ileWygrywa)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean czyZwyciezcaKolumny(Plansza plansza, int size, Gracz gracz, int ileWygrywa) {
        int kol = 0;
        while (kol < size) {
            int wiera = 0, wierb = 1, parowanie = 0, ileZgodnych = 0;
            while (parowanie < size - 1) {
                Symbol a = plansza.getPlansza().get(wiera).getWiersz().get(kol).getSymbol();
                Symbol b = plansza.getPlansza().get(wierb).getWiersz().get(kol).getSymbol();
                if (a.equals(gracz.getSymbol()) && b.equals(gracz.getSymbol())) {
                    ileZgodnych++;
                    wierb++;
                } else {
                    wiera = wierb;
                    wierb = wierb + 1;
                    ileZgodnych = 0;
                }
                if (ileZgodnych == ileWygrywa - 1) {
                    gracz.setWygraneRundy(1);
                    System.out.println(gracz.getName() + " wygrywa rundę po raz: " + gracz.getWygraneRundy() + "\n");
                    return true;
                }
                parowanie++;
            }
            kol++;
        }
        return false;
    }

    private static boolean czyZwyciezcaBackSlash(Plansza plansza, int size, Gracz gracz, int ileWygrywa) {
        int count = 0;
        while (count < size) {
            int kola = 0, kolb = 1, wiera = 0, wierb = 1;
            int parowanie = 0, ileZgodnych = 0;
            while (parowanie < size - 1) {
                Symbol a = plansza.getPlansza().get(wiera).getWiersz().get(kola).getSymbol();
                Symbol b = plansza.getPlansza().get(wierb).getWiersz().get(kolb).getSymbol();
                if (a.equals(gracz.getSymbol()) && b.equals(gracz.getSymbol())) {
                    ileZgodnych++;
                    kolb++;
                    wierb++;
                } else {
                    kola = kolb;
                    wiera = wierb;
                    kolb = kolb + 1;
                    wierb = wierb + 1;
                    ileZgodnych = 0;
                }
                if (ileZgodnych == ileWygrywa - 1) {
                    gracz.setWygraneRundy(1);
                    System.out.println(gracz.getName() + " wygrywa rundę po raz: " + gracz.getWygraneRundy() + "\n");
                    return true;
                }
                parowanie++;
            }
            count++;
        }
        return false;
    }

    private static boolean czyZwyciezcaSlash(Plansza plansza, int size, Gracz gracz, int ileWygrywa) {
        int count = 0;
        while (count < size) {
            int wiera = 0, kola = size - 1, wierb = 1, kolb = size - 2;
            int parowanie = 0, ileZgodnych = 0;
            while (parowanie < size - 1) {
                Symbol a = plansza.getPlansza().get(wiera).getWiersz().get(kola).getSymbol();
                Symbol b = plansza.getPlansza().get(wierb).getWiersz().get(kolb).getSymbol();
                if (a.equals(gracz.getSymbol()) && b.equals(gracz.getSymbol())) {
                    ileZgodnych++;
                    kolb--;
                    wierb++;
                } else {
                    kola = kolb;
                    wiera = wierb;
                    kolb = kolb - 1;
                    wierb = wierb + 1;
                    ileZgodnych = 0;
                }
                if (ileZgodnych == ileWygrywa - 1) {
                    gracz.setWygraneRundy(1);
                    System.out.println(gracz.getName() + " wygrywa rundę po raz: " + gracz.getWygraneRundy() + "\n");
                    return true;
                }
                parowanie++;
            }
            count++;
        }
        return false;
    }

    private static boolean czyZwyciezcaWiersze(Plansza plansza, int size, Gracz gracz, int ileWygrywa) {
        int wier = 0;
        while (wier < size) {
            int kola = 0, kolb = 1, parowanie = 0, ileZgodnych = 0;
            while (parowanie < size - 1) {
                Symbol a = plansza.getPlansza().get(wier).getWiersz().get(kola).getSymbol();
                Symbol b = plansza.getPlansza().get(wier).getWiersz().get(kolb).getSymbol();
                if (a.equals(gracz.getSymbol()) && b.equals(gracz.getSymbol())) {
                    ileZgodnych++;
                    kolb++;
                } else {
                    kola = kolb;
                    kolb = kolb + 1;
                    ileZgodnych = 0;
                }
                if (ileZgodnych == ileWygrywa - 1) {
                    gracz.setWygraneRundy(1);
                    System.out.println(gracz.getName() + " wygrywa rundę po raz: " + gracz.getWygraneRundy() + "\n");
                    return true;
                }
                parowanie++;
            }
            wier++;
        }
        return false;
    }




}
