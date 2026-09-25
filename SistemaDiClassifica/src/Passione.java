public class Passione {
    private String nomepassione;

    public Passione(String nomepassione) {
        this.nomepassione = nomepassione;
    }

    public String getNomepassione() {
        return nomepassione;
    }

    public void setNomepassione(String nomepassione) {
        this.nomepassione = nomepassione;
    }

    @Override
    public String toString() {
        return getNomepassione();
    }

    
}
