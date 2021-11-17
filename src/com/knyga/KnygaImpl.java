package com.knyga;

import com.leidinys.LeidinysImpl;

public class KnygaImpl extends LeidinysImpl implements Knyga {
        private String pavadinimas;
        private boolean kietasVirselis;
        private String tipas;

    public KnygaImpl(String rusis, boolean periodinis, int puslapiuSkaicius, String pavadinimas, boolean kietasVirselis, String tipas){
        super(rusis, periodinis, puslapiuSkaicius);
        this.pavadinimas = pavadinimas;
        this.kietasVirselis = kietasVirselis;
        this.tipas = tipas;
    }


    @Override
    public String getPavadinimas() {
        return pavadinimas;
    }

    @Override
    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;

    }

    @Override
    public boolean isKietasVirselis() {
        return false;
    }

    @Override
    public void setKietasVirselis(boolean kietasVirselis) {
        this.kietasVirselis = kietasVirselis;

    }

    @Override
    public String getTipas() {
        return tipas;
    }

    @Override
    public void setTipas(String tipas) {
        this.tipas = tipas;

    }

    @Override
    public String toString() {
        return "Knygos " +
                "puslapiai = " + getpuslapiuSkaicius() +", " +
                "periodinis = " + isPeriodinis() + ", " +
                "rusis = " + getRusis() + ", " +
                "pavadinimas = '"+ pavadinimas + '\'' +
                ", kietasVirselis = "+ kietasVirselis +
                ", tipas = '" + tipas + '\'' +
                '.';
    }
}
