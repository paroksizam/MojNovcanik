package MojNovcanik;

import java.util.ArrayList;

public class Placanje {

    //Klasa Placanje ima polja imeIPrezime (String), svrhaUplate (String) i iznosUplate (double);

    //Sva polja mogu da se postave i dohvate;

    //ToString ispisuje ime i prezime, svrhu uplate i iznos uplate;

    private String imeIPrezime;
    private String svrhaUplate;
    private double iznosUplate;

    public Placanje(String imeIPrezime, String svrhaUplate, double iznosUplate) {
        this.imeIPrezime = imeIPrezime;
        this.svrhaUplate = svrhaUplate;
        this.iznosUplate = iznosUplate;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getSvrhaUplate() {
        return svrhaUplate;
    }

    public void setSvrhaUplate(String svrhaUplate) {
        this.svrhaUplate = svrhaUplate;
    }

    public double getIznosUplate() {
        return iznosUplate;
    }

    public void setIznosUplate(double iznosUplate) {
        this.iznosUplate = iznosUplate;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Uplata na racun - ");
        sb.append(imeIPrezime);
        sb.append("\n");

        sb.append("Svrha uplate - ");
        sb.append(svrhaUplate);
        sb.append("\n");

        sb.append("Iznos uplate - ");
        sb.append(iznosUplate);
        sb.append(" dinara\n");

        return sb.toString();
    }

}
