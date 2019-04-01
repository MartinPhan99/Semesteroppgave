package sample;

public class Arrangement {
    private String kontaktperson;
    private String lokalType;
    private String navnArrangement;
    private String artisterDeltagelse;
    private String program;
    private String sted;
    private String tidspunkt;
    private String billettpris;
    private String billettsalg;

    public Arrangement(String kontaktperson, String lokalType, String navnArrangement, String artisterDeltagelse, String program, String sted, String tidspunkt, String billettpris, String billettsalg) {
        this.kontaktperson = kontaktperson;
        this.lokalType = lokalType;
        this.navnArrangement = navnArrangement;
        this.artisterDeltagelse = artisterDeltagelse;
        this.program = program;
        this.sted = sted;
        this.tidspunkt = tidspunkt;
        this.billettpris = billettpris;
        this.billettsalg = billettsalg;
    }
    public String getKontaktperson() {
        return kontaktperson;
    }
    public void setKontaktperson(String kontaktperson) {
        this.kontaktperson = kontaktperson;
    }

    public String getLokalType() {
        return lokalType;
    }
    public void setLokalType(String lokalType) {
        this.lokalType = lokalType;
    }

    public String getnavnArrangement() {
        return navnArrangement;
    }
    public void setnavnArrangemente(String navnArrangement) {
        this.navnArrangement = navnArrangement;
    }

    public String getartisterDeltagelse() {
        return artisterDeltagelse;
    }
    public void setartisterDeltagelse(String artisterDeltagelse) {this.artisterDeltagelse = artisterDeltagelse;
    }

    public String getprogram() {
        return program;
    }
    public void setprogram(String program) {this.program = program;
    }

    public String getsted() {
        return sted;
    }
    public void setsted(String sted) {this.sted = sted;
    }

    public String gettidspunkt() {
        return tidspunkt;
    }
    public void settidspunkt(String tidspunkt) {this.tidspunkt = tidspunkt;
    }

    public String getbillettpris() {
        return billettpris;
    }
    public void setbillettpris(String billettpris) {this.billettpris = billettpris;
    }

    public String getbillettsalg() {
        return billettsalg;
    }
    public void setbillettsalg(String billettsalg) {this.billettsalg = billettsalg;
    }

    public String toString() {
        return getKontaktperson()+" "+getLokalType()+" "+getnavnArrangement()+" "+getartisterDeltagelse()+" "+getartisterDeltagelse()+ " "+getartisterDeltagelse()+" "+getprogram()+ " "+getsted()+ " " +gettidspunkt()+ " " +getbillettpris()+ " " +getbillettsalg();
    }
    public String toText() {
        return getKontaktperson()+" "+getLokalType()+" "+getnavnArrangement()+" "+getartisterDeltagelse()+" "+getartisterDeltagelse()+ " "+getartisterDeltagelse()+" "+getprogram()+ " "+getsted()+ " " +gettidspunkt()+ " " +getbillettpris()+ " " +getbillettsalg();
    }
}
