package MojNovcanik;

import java.util.ArrayList;

public class NalogKorisnika {

    //Klasa NalogKorisnika  je profil korisnika i ima polja ime (String), prezime (String) i pin (int);

    //Sva polja mogu da se dohvate i postave;

    //ToString ispisuje samo ime i prezime korisnika;

    private String ime;
    private String prezime;
    private int pin;
    private Racun racunUplatioca;
    private ArrayList<Placanje> istorijaPlacanja;


    public NalogKorisnika(String ime, String prezime, int pin){
        this.ime = ime;
        this.prezime = prezime;
        this.pin = pin;
        this.istorijaPlacanja = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Racun getRacunUplatioca() {
        return racunUplatioca;
    }

    public void setRacunUplatioca(Racun racunUplatioca) {
        this.racunUplatioca = racunUplatioca;
    }

    public ArrayList<Placanje> getIstorijaPlacanja() {
        return istorijaPlacanja;
    }

    public void setIstorijaPlacanja(ArrayList<Placanje> istorijaPlacanja) {
        this.istorijaPlacanja = istorijaPlacanja;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append("\n");

        return sb.toString();
    }
}
