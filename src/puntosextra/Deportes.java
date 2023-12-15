package puntosextra;

import java.io.Serializable;
import java.util.List;

public class Deportes implements Serializable{
    private List<Torneo> torneo;
    private String periodo;

    
    private static final long NumeroSerieUI = 777L;
    
    public Deportes() {
    }

    public Deportes(List<Torneo> torneo, String periodo) {
        this.torneo = torneo;
        this.periodo = periodo;
    }

    public List<Torneo> getTorneo() {
        return torneo;
    }

    public void setTorneo(List<Torneo> torneo) {
        this.torneo = torneo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Deportes{" + "torneo=" + torneo + ", periodo=" + periodo + '}';
    }
    
    
}
