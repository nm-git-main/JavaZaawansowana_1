package przyklad3;

import java.time.LocalDate;

public class Paszport {
    private final String numerPaszposrtu;
    private final LocalDate dataWydania;
    private final Osoba wlascicielPaszposrtu;

    public Paszport(String numerPaszposrtu, LocalDate dataWydania, Osoba wlascicielPaszposrtu) {
        this.numerPaszposrtu = numerPaszposrtu;
        this.dataWydania = dataWydania;
        this.wlascicielPaszposrtu = wlascicielPaszposrtu;
    }

    public String getNumerPaszposrtu() {
        return numerPaszposrtu;
    }

    public LocalDate getDataWydania() {
        return dataWydania;
    }

    public Osoba getWlascicielPaszposrtu() {
        return wlascicielPaszposrtu;
    }
}
