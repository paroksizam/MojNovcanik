package MojNovcanik;

import java.util.Scanner;

public class AplikacijaMojNovcanik {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("< Dobrodosli u Moj novcanik >");
        System.out.println("< Kreirajte svoj nalog >");

        //Kreiranje profila - objekat klase NalogKorisnika;

        System.out.print("Unesite ime -> ");
        String ime = sc.next();

        System.out.print("Unesite prezime -> ");
        String prezime = sc.next();

        System.out.print("Unesite pin -> ");
        int pin = sc.nextInt();
        NalogKorisnika korisnik = new NalogKorisnika(ime, prezime, pin);


        //Potvrda registracije;

        System.out.print("Potvrdite pin kako biste pristupili aplikaciji -> ");
        int potvrdaPina = sc.nextInt();
        if (potvrdaPina == pin) {
            System.out.println();
            System.out.println("< Kreirajte racun >");
        } else {
            System.out.print("Pin je pogresan - imate jos dva pokusaja -> ");
            potvrdaPina = sc.nextInt();
            if (potvrdaPina != pin) {
                System.out.print("Pin je pogresan - imate jos jedan pokusaj -> ");
                potvrdaPina = sc.nextInt();
                if (potvrdaPina != pin) {
                    System.out.print("Pin je pogresan, ne mozete pristupiti aplikaciji -> ");
                    return;
                } else {
                    System.out.println();
                    System.out.println("< Kreirajte racun >");
                }
            }
        }


        //Kreiranje racuna - objekat klase Racun;

        System.out.print("Unesite naziv banke -> ");
        String banka = sc.next();

        System.out.print("Unesite stanje na racunu -> ");
        double stanje = sc.nextDouble();
        Racun racunKorisnika = new Racun(korisnik, banka, stanje);


        //Nakon kreiranja racuna poziva se metoda glavniMeni koja ispisuje meni;
        Meni.glavniMeni();

        //Promenljiva "opcija" je nacin na koji se korisnik krece kroz aplikaciju;
        //Preko skrenera korisnik unosi int opcije koju zeli da izabere i na osnovu koga se pozivaju odredjene metode;
        int opcija = sc.nextInt();
        System.out.println();

        if(opcija == 1){  //Ispisujemo racun korisnika ukoliko zeli da pogleda stanje nakon cega ulazi u glavni meni;
            System.out.println(racunKorisnika);
            System.out.println();
            Meni.izlazIliMeni();
            int dalje = sc.nextInt();
            if(dalje == 1){
                Meni.glavniMeni();
            }
            else if(dalje == 0){
                return;
            }
        }
        else if(opcija == 2){  //Pozivano metodu novoPlacanje za pravljenje uplatnice i skidanje novca sa racuna;
            System.out.print("Unesite ime i prezime primaoca -> ");
            sc.nextLine();
            String mestoUplate = sc.nextLine();

            System.out.print("Unesite svrhu uplate -> ");
            String svrha = sc.nextLine();

            System.out.print("Unesite iznos u dinarima -> ");
            double iznos = sc.nextInt();

            racunKorisnika.novoPlacanje(mestoUplate, svrha, iznos);
            Meni.izlazIliMeni();
            int dalje = sc.nextInt();
            if(dalje == 1){
                Meni.glavniMeni();
            }
            else if(dalje == 0){
                return;
            }
        }
        else if(opcija == 3){  //Pozivamo metodu koja lista istoriju uplate i nakon toga ulazi u glavni meni;
            System.out.println(racunKorisnika.ispisIstorije());
            Meni.izlazIliMeni();
            int dalje = sc.nextInt();
            if(dalje == 1){
                Meni.glavniMeni();
            }
            else if(dalje == 0){
                return;
            }
        }
        else if(opcija == 0){ //Prekidamo program;
            return;
        }


        //Ponavljaju se funkcije iz menija;
        opcija = sc.nextInt();
        System.out.println();

        if(opcija == 1){
            System.out.println(racunKorisnika);
            System.out.println();
            Meni.izlazIliMeni();
            int dalje = sc.nextInt();
            if(dalje == 1){
                Meni.glavniMeni();
            }
            else if(dalje == 0){
                return;
            }
        }
        else if(opcija == 2){
            System.out.print("Unesite ime i prezime primaoca -> ");
            sc.nextLine();
            String mestoUplate = sc.nextLine();

            System.out.print("Unesite svrhu uplate -> ");
            String svrha = sc.nextLine();

            System.out.print("Unesite iznos u dinarima -> ");
            double iznos = sc.nextInt();

            racunKorisnika.novoPlacanje(mestoUplate, svrha, iznos);
            Meni.izlazIliMeni();
            int dalje = sc.nextInt();
            if(dalje == 1){
                Meni.glavniMeni();
            }
            else if(dalje == 0){
                return;
            }
        }
        else if(opcija == 3){
            System.out.println(racunKorisnika.ispisIstorije());
            Meni.izlazIliMeni();
            int dalje = sc.nextInt();
            if(dalje == 1){
                Meni.glavniMeni();
            }
            else if(dalje == 0){
                return;
            }
        }
        else if(opcija == 0){
            return;
        }


        //Ponavljaju se funkcije iz menija;
        opcija = sc.nextInt();
        System.out.println();

        if(opcija == 1){
            System.out.println(racunKorisnika);
            System.out.println();
            Meni.izlazIliMeni();
            int dalje = sc.nextInt();
            if(dalje == 1){
                Meni.glavniMeni();
            }
            else if(dalje == 0){
                return;
            }
        }
        else if(opcija == 2){
            System.out.print("Unesite ime i prezime primaoca -> ");
            sc.nextLine();
            String mestoUplate = sc.nextLine();

            System.out.print("Unesite svrhu uplate -> ");
            String svrha = sc.nextLine();

            System.out.print("Unesite iznos u dinarima -> ");
            double iznos = sc.nextInt();

            racunKorisnika.novoPlacanje(mestoUplate, svrha, iznos);
            Meni.izlazIliMeni();
            int dalje = sc.nextInt();
            if(dalje == 1){
                Meni.glavniMeni();
            }
            else if(dalje == 0){
                return;
            }
        }
        else if(opcija == 3){
            System.out.println(racunKorisnika.ispisIstorije());
            Meni.izlazIliMeni();
            int dalje = sc.nextInt();
            if(dalje == 1){
                Meni.glavniMeni();
            }
            else if(dalje == 0){
                return;
            }
        }
        else if(opcija == 0){
            return;
        }


        //Ponavljaju se funkcije iz menija;
        opcija = sc.nextInt();
        System.out.println();

        if(opcija == 1){
            System.out.println(racunKorisnika);
            System.out.println();
            Meni.izlaz();
            int izlaz = sc.nextInt();
            if(izlaz == 0){
                return;
            }
        }
        else if(opcija == 2){
            System.out.print("Unesite ime i prezime primaoca -> ");
            sc.nextLine();
            String mestoUplate = sc.nextLine();

            System.out.print("Unesite svrhu uplate -> ");
            String svrha = sc.nextLine();

            System.out.print("Unesite iznos u dinarima -> ");
            double iznos = sc.nextInt();

            racunKorisnika.novoPlacanje(mestoUplate, svrha, iznos);
            Meni.izlaz();
            int izlaz = sc.nextInt();
            if(izlaz == 0){
                return;
            }
        }
        else if(opcija == 3){
            System.out.println(racunKorisnika.ispisIstorije());
            Meni.izlaz();
            int izlaz = sc.nextInt();
            if(izlaz == 0){
                return;
            }
        }
        else{
            return;
        }
    }
}
