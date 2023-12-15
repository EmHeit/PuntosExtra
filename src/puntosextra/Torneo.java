package puntosextra;

import java.io.Serializable;
import java.util.List;

public class Torneo implements Serializable{
    private String nombre;
    private List<Equipos> equipo;
    private List<Partidos> partido;

    private static final long NumeroSerieUI = 777L;
    
    public Torneo() {
    }

    public Torneo(String nombre, List<Equipos> equipo, List<Partidos> partido) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.partido = partido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Equipos> getEquipo() {
        return equipo;
    }

    public void setEquipo(List<Equipos> equipo) {
        this.equipo = equipo;
    }

    public List<Partidos> getPartido() {
        return partido;
    }

    public void setPartido(List<Partidos> partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return "Torneo{" + "nombre=" + nombre + ", equipo=" + equipo + ", partido=" + partido + '}';
    }
    
    
}
