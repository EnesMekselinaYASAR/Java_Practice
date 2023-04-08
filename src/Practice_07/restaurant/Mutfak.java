package Practice_07.restaurant;

public class Mutfak {

public String yemekler="adanakebap, urfaciger, kusbasi,kusleme";

public String araSicak="yaylacorba, mercimek, duguncorba,tarhana";

public String tatlilar="baklava, sutlac, kazandibi,kunefe";

public String icecekler="ayran, salgam, kola,raki";

    public Mutfak(String yemekler, String araSicak, String tatlilar, String icecekler) {
        this.yemekler=yemekler;
        this.araSicak=araSicak;
        this.tatlilar=tatlilar;
        this.icecekler=icecekler;
    }

    public Mutfak() {
    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ",\naraSicak='" + araSicak + '\'' +
                ",\ntatlilar='" + tatlilar + '\'' +
                ",\nicecekler='" + icecekler + '\'' +
                '}';
    }
}
