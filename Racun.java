package MojNovcanik;

import java.util.ArrayList;

public class Racun {

    //Klasa Racun je racun korisnika i ima polja korisnik (NalogKorisnika),
    // banka (String), stanje (double) i istorijaPlacanja <Placanja>;;

    //Sva polja mogu da se postave i dohvate;
    //istorijaPlacanja se ne salje i postavlja se kao prazan;

    //ToString ispisuje ime i prezime korisnika, banku, broj racuna i stanje;

    //Postoje i dve metode novoPlacaanje i ispisIstorije;

    private NalogKorisnika korisnik;
    private String banka;
    private double stanje;
    private ArrayList<Placanje> istorijaPlacanja;

    public Racun(NalogKorisnika korisnik, String banka, double stanje) {
        this.korisnik = korisnik;
        this.banka = banka;
        this.stanje = stanje;
        this.istorijaPlacanja = new ArrayList<>();
    }

    public NalogKorisnika getKorisnik() {
        return korisnik;
    }

    public String getBanka() {
        return banka;
    }

    public void setBanka(String banka) {
        this.banka = banka;
    }

    public void setKorisnik(NalogKorisnika korisnik) {
        this.korisnik = korisnik;
    }

    public double getStanje() {
        return stanje;
    }

    public void setStanje(double stanje) {
        this.stanje = stanje;
    }

    public ArrayList<Placanje> getIstorijaPlacanja() {
        return istorijaPlacanja;
    }

    public void setIstorijaPlacanja(ArrayList<Placanje> istorijaPlacanja) {
        this.istorijaPlacanja = istorijaPlacanja;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(korisnik.toString());

        sb.append("\nBanka -> ");
        sb.append(banka);
        sb.append("\n");

        sb.append("Stanje na racunu -> ");
        sb.append(stanje);
        sb.append(" dinara");

        return sb.toString();
    }

    //Metoda pomocu koje korisnik pravi uplatnicu i skida novac sa racuna;

    public void novoPlacanje(String x, String y, double z){
        Placanje p = new Placanje(x, y, z);
        istorijaPlacanja.add(p);
        stanje = stanje - z;
        System.out.println("\n< Uplata je izvrsena >\n");
    }

    //Metoda koja ispisuje istoriju placanja

    public String ispisIstorije(){
        StringBuilder sb = new StringBuilder();
        sb.append("< Istorija placanja >\n");

        for(Placanje p : istorijaPlacanja){
            sb.append(p);
            sb.append("\n");
        }

        return sb.toString();
    }
}
