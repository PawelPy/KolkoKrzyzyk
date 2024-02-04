package kolkoKrzyzyk.ustawienia.gracze;

import kolkoKrzyzyk.ustawienia.plansza.Symbol;

public class GraczO extends Gracz {

    private Symbol symbol = Symbol.O;

    public GraczO(String name) {
        super(name);
        this.symbol = getSymbol();
    }

    @Override
    public Symbol getSymbol() {
        return symbol;
    }



}
