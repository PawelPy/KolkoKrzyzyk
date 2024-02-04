package kolkoKrzyzyk.ustawienia.gracze;

import kolkoKrzyzyk.ustawienia.plansza.Symbol;


public class GraczX extends Gracz {

    private Symbol symbol = Symbol.X;


    public GraczX(String name) {
        super(name);
        this.symbol = getSymbol();
    }

    @Override
    public Symbol getSymbol() {
        return symbol;
    }


}
