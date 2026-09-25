public class Letterario extends Passione{
    private String nomeAutore;
    private String titoloLibro;
    private String codiceISBN;
    private int numeroPagine;
    
    public Letterario(String nomeAutore, String titoloLibro, String codiceISBN, int numeroPagine) {
        super(titoloLibro);
        this.nomeAutore = nomeAutore;
        this.codiceISBN = codiceISBN;
        this.numeroPagine = numeroPagine;
        this.titoloLibro = titoloLibro;
    }

    public String getNomeAutore() {
        return nomeAutore;
    }

    public void setNomeAutore(String nomeAutore) {
        this.nomeAutore = nomeAutore;
    }

    public String getCodiceISBN() {
        return codiceISBN;
    }

    public void setCodiceISBN(String codiceISBN) {
        this.codiceISBN = codiceISBN;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }
    

    
    public String getTitoloLibro() {
        return titoloLibro;
    }
    
    public void setTitoloLibro(String titoloLibro) {
        this.titoloLibro = titoloLibro;
    }
    
    @Override
    public String toString() {
        return getTitoloLibro();
    }
    
}
