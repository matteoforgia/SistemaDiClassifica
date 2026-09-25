public class Musicale extends Passione{
    private String titolo;
    private String nomeArtista;
    private int numeroDiTrracce;
    
    public Musicale(String nomeArtista, int numeroDiTrracce, String titolo) {
        super(titolo);
        this.titolo = titolo;
        this.nomeArtista = nomeArtista;
        this.numeroDiTrracce = numeroDiTrracce;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public int getNumeroDiTrracce() {
        return numeroDiTrracce;
    }

    public void setNumeroDiTrracce(int numeroDiTrracce) {
        this.numeroDiTrracce = numeroDiTrracce;
    }
    
    public String getTitolo() {
        return titolo;
    }
    
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public String toString() {
        return getTitolo();
    }
    public static <T> void stampaPassione(T passione) {
        System.out.println(passione.toString());
    }
    public static void main(String[] args) {
        Musicale musicale = new Musicale("eminiem", 10, "fatAssWhiteMan");
        stampaPassione("il artista e:" + '"' + musicale.nomeArtista + '"');
        stampaPassione(musicale.numeroDiTrracce);
        stampaPassione(musicale.titolo);
    }
}
