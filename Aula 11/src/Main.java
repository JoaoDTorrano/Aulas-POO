import mamiferos.Boi;
import mamiferos.Cachorro;
import mamiferos.Lontra;

public class Main {
    public static void main(String[] args) {
        Boi boi = new Boi("Boi", 150.25);
        Cachorro cachorro = new Cachorro("Cachorro", 48.5);
        Lontra lontra = new Lontra("Lontra", 35.5);

        boi.mostraInfo();
        boi.mostraInfo();
        cachorro.mostraInfo();
        cachorro.emitirSom();
        lontra.mostraInfo();
        lontra.nadar();
        lontra.emitirSom();
    }
}
