package com.leidinys;

public class LeidinysImpl implements Leidinys{
    private String rusis;
    private boolean periodinis;
    private int puslapiuSkaicius;


    public LeidinysImpl(String rusis, boolean periodinis, int puslapiuSkaicius) {
        this.rusis = rusis;
        this.periodinis = periodinis;
        this.puslapiuSkaicius = puslapiuSkaicius;
    }

    @Override
    public String getRusis() {
        return rusis;
    }

    @Override
    public void setRusis(String rusis) {
        this.rusis = rusis;
    }

    @Override
    public boolean isPeriodinis() {
        return false;
    }

    @Override
    public void setPeriodinis(boolean periodinis) {
        this.periodinis = periodinis;

    }

    @Override
    public int getpuslapiuSkaicius() {
        return puslapiuSkaicius;
    }

    @Override
    public void setPuslapiuSkaucius(int puslapiuSkaicius) {
        this.puslapiuSkaicius = puslapiuSkaicius;
    }

    @Override
    public String toString() {
        return "LeidinysImpl{" +
                "rusis='" + rusis + '\'' +
                ", periodinis=" + periodinis +
                ", puslapiuSkaicius=" + puslapiuSkaicius +
                '}';
    }
}





