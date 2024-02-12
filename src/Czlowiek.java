public class Czlowiek{
    private final String imie;
    private final int wiek;
    private final Oczy oczy;
    private final Wlosy wlosy;

    public Czlowiek(String imie, int wiek, Oczy oczy, Wlosy wlosy) {
        this.imie = imie;
        this.wiek = wiek;
        this.oczy = oczy;
        this.wlosy = wlosy;
    }

    public void wyswietlAtrybuty(){
        System.out.println("Czlowiek imieniem " + imie + " ma lat " + wiek + " oraz " + oczy + " oczy i " + wlosy + " wlosy.");
    }
}
