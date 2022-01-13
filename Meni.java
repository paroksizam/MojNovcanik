package MojNovcanik;

public class Meni {

    //Klasa Meni ima javne staticke metode koje ispisuju opcije iz menija koje korisnik zeli da izabere;

    public static void glavniMeni() {

        System.out.println();
        System.out.println("< Meni >");
        System.out.println();
        System.out.println("1 - Pogledaj stanje");
        System.out.println("2 - Novo placanje");
        System.out.println("3 - Istorija placanja");
        System.out.println("0 - Napusti aplikaciju");
        System.out.println();
        System.out.print("Unesite broj opcije kojoj zelite da pristupite -> ");

    }

    public static void izlazIliMeni(){
        System.out.print("Ukoliko zelite da se vratite na meni unesite 1, a ako biste da izadjete iz aplikacije 0 - > ");
    }

    public static void izlaz(){
        System.out.print("Ukoliko zelite da izadjete iz aplikacije unesite 0 -> ");
    }

}
