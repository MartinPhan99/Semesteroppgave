package sample;

public class Lokale {

    private String lokaleNavn;
    private String typeLokale;
    private String antallPlasser;

    public Lokale(String lokaleNavn, String typeLokale, String antallPlasser) {
        this.lokaleNavn = lokaleNavn;
        this.typeLokale = typeLokale;
        this.antallPlasser = antallPlasser;
    }
    public String getLokaleNavn() {
        return lokaleNavn;
    }
    public void setLokaleNavn(String lokaleNavn) {
        this.lokaleNavn = lokaleNavn;
    }
    public String getTypeLokale() {
        return typeLokale;
    }
    public void setTypeLokale(String typeLokale) {
        this.typeLokale = typeLokale;
    }
    public String getAntallPlasser() {
        return antallPlasser;
    }
    public void setAntallPlasser(String antallPlasser) {
        this.antallPlasser = antallPlasser;
    }

    public String toString() {
        return getLokaleNavn()+" "+getTypeLokale()+" "+getAntallPlasser()+"\n";
    }
    public String toText() {
        return getLokaleNavn()+" "+getTypeLokale()+" "+getAntallPlasser();
    }


}
