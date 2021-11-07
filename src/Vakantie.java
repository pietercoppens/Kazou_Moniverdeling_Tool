public class Vakantie {
    private String vakantiecode, naam, vertrekdatum, aankomstdatum;
    private int aantalVakantiegangers, aantalVVs, aantalMonitoren;

    public Vakantie( String code){
        vakantiecode = " ";
        naam = " ";
        vertrekdatum = " ";
        aankomstdatum = " ";
        aantalVakantiegangers = 0;
        aantalVVs = 0;
        aantalMonitoren = 0;
    }
    public void printInfo(){
        System.out.println("Vakantiecode: "+ vakantiecode);
        System.out.println("Naam: "+ naam);
        System.out.println("Vertrekdatum: "+ vertrekdatum);
        System.out.println("Aankomstdatum: "+ aankomstdatum);
        System.out.println("Aantal vakantiegangers: "+ aantalVakantiegangers);
        System.out.println("Aantal VV's: "+ aantalVVs);
        System.out.println("Aantal monitoren: "+ aantalMonitoren);
    }
}
