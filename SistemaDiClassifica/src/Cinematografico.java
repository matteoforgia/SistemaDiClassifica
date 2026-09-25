public class Cinematografico extends Passione{
    private int annoDiUscitaSale;
    private String nomeRegista;
    private String nomeAttore;
    private String nomeAttrice; 
    private String titoloFilm; 
    
    public Cinematografico(int annoDiUscitaSale, String nomeRegista, String nomeAttore, String nomeAttrice, String titoloFilm) {
        super(titoloFilm);
        this.annoDiUscitaSale = annoDiUscitaSale;
        this.nomeRegista = nomeRegista;
        this.nomeAttore = nomeAttore;
        this.nomeAttrice = nomeAttrice;
        this.titoloFilm = titoloFilm;
    }

    public int getAnnoDiUscitaSale() {
        return annoDiUscitaSale;
    }

    public void setAnnoDiUscitaSale(int annoDiUscitaSale) {
        this.annoDiUscitaSale = annoDiUscitaSale;
    }

    public String getNomeRegista() {
        return nomeRegista;
    }

    public void setNomeRegista(String nomeRegista) {
        this.nomeRegista = nomeRegista;
    }

    public String getNomeAttore() {
        return nomeAttore;
    }

    public void setNomeAttore(String nomeAttore) {
        this.nomeAttore = nomeAttore;
    }

    public String getNomeAttrice() {
        return nomeAttrice;
    }

    public void setNomeAttrice(String nomeAttrice) {
        this.nomeAttrice = nomeAttrice;
    }

    public String getTitoloFilm() {
        return titoloFilm;
    }

    public void setTitoloFilm(String titoloFilm) {
        this.titoloFilm = titoloFilm;
    }

    @Override
    public String toString() {
        return getTitoloFilm();
    }
           
}
