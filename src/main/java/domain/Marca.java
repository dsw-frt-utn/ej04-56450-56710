package domain;
/**
 *
 * @author Fabri519
 */
public class Marca {
    private String nombre;
    private String paisDeOrigen;
    
     public Marca(String nombre, String paisDeOrigen) {
        this.nombre = nombre;
        this.paisDeOrigen = paisDeOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}