public class Vrijwilliger {
    private String voornaam, familienaam, geboorteDatum, rijksregisternummer, vrijwilligersnummer;
    private int leeftijd;


    public Vrijwilliger(){
        voornaam = " ";
        familienaam = " ";
        geboorteDatum = " ";
        rijksregisternummer = " ";
        leeftijd = 0;
    }
    public void printInfo(){
        System.out.println("Vrijwilligersnummer: "+ vrijwilligersnummer);
        System.out.println("Voornaam: "+ voornaam);
        System.out.println("Familienaam: "+ familienaam);
        System.out.println("Rijksregeisternummer: "+ rijksregisternummer);
        System.out.println("Geboortedatum: "+ geboorteDatum);
        System.out.println("Leeftijd: "+ leeftijd);
    }

}
