package kolkoKrzyzyk.ustawienia.plansza;

public enum Symbol {

    X("x"),
    O("o"),
    None(" ");

    private final String s;

    Symbol(String s) {
        this.s = s;
    }

    @Override
    public String toString() {   // metoda powoduje że wszędzie w kodzie mamy String s "x, o"
        return s;
    }


}
