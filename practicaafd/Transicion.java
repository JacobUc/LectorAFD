package practicaafd;


/**
 * @author yo
 */
public class Transicion {
    
    private String estadoOrigen;
    private String caracter;
    private String estadoDestino;

    
    public Transicion(String estadoOrigen, String caracter, String estadoDestino){
        this.setEstadoOrigen(estadoOrigen);
        this.setCaracter(caracter); 
        this.setEstadoDestino(estadoDestino);
    }
    

    public String getEstadoOrigen() {
        return estadoOrigen;
    }

    public void setEstadoOrigen(String estadoOrigen) {
        this.estadoOrigen = estadoOrigen;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public String getEstadoDestino() {
        return estadoDestino;
    }

    public void setEstadoDestino(String estadoDestino) {
        this.estadoDestino = estadoDestino;
    }

}
