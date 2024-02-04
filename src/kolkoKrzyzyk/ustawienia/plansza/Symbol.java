package kolkoKrzyzyk.ustawienia.plansza;

public enum Symbol {

    X("X"),
    O("O"),
    None(" ");

    private final String s;

    Symbol(String s) {
        this.s = s;
    }


    public String getS() {
        return s;
    }






}
