package practicaafd;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jacob Uc
 * @version 1.0
 */

 /**
  * Esta clase representa a un Autómata Finito Determinista, donde se puede establecer los elementos que
  componen a un AFD, así como la validación de alguna cadena que puede ser aceptada o rechazada según
  el lenguaje del AFD.
  */
public class AFD {
    
    private ArrayList <String> estadosAFD; //donde se almacenaran los estados
    private ArrayList <String> alfabetoAFD; //donde se almacenaran los estados
    private ArrayList <Transicion> transicionesAFD; //donde almacenaremos las transiciones
    private String estadoInicialAFD;
    private ArrayList <String> estadosFinalesAFD; //donde se almacenaran los estados finales


    /*
                    --------------------- MÉTODOS AFD ---------------------
    */


    /**
     * Metodo constructor
     * Incializa el arrayList donde se almacenaran las transiciones
     */
    public AFD(){
        this.estadosAFD = new ArrayList <String> ();
        this.alfabetoAFD = new ArrayList <String> ();
        this.transicionesAFD = new ArrayList <Transicion> ();
        this.estadoInicialAFD = null;
        this.estadosFinalesAFD = new ArrayList <String> ();
    }



    /*
    ----------------- LEER ESTADOS -----------------
    */
    /**
     * Establece los estados del AFD.
     * Usa la lectura mediante el teclado para obtener los estados.
     * @param numeroEstados es la cantidad de estados que componen el AFD.
     */
    public void leerEstados(int numeroEstados){
        Scanner scanner = new Scanner(System.in);
        String estado;

        for(int i = 0; i < numeroEstados; i++){
            System.out.println("Ingrese un Estado del AFD: ");
            estado = scanner.nextLine();
            this.estadosAFD.add(estado);
        }

        scanner.close();
    }

    /**
     * Establece los estados del AFD.
     * @param estados es un array unidimensional en donde se encuentran los estados que componen el AFD.
     */
    public void leerEstados(String estados []){

        for(int i = 0; i < estados.length; i++){
            this.estadosAFD.add(estados[i]);
            System.out.println("El nuevo estado es: " + this.estadosAFD.get(i));
        }
        
    }



    /*
    ----------------- LEER ALFABETO -----------------
    */
    /**
     * Establece el alfabeto del AFD.
     * Usa la lectura mediante el teclado para obtener el alfabeto.
     * @param numeroTokens es la cantidad de elementos que tiene el alfabeto.
     */
    public void leerAlfabeto(int numeroTokens){
        Scanner scanner = new Scanner(System.in);
        String tokenAlfabeto;

        for(int i = 0; i < numeroTokens; i++){
            System.out.println("Ingrese un elemento del alfabeto: ");
            tokenAlfabeto = scanner.nextLine();
            this.alfabetoAFD.add(tokenAlfabeto);
        }

        scanner.close();
    }

    /**
     * Establece el alfabeto del AFD.
     * @param alfabeto es un array unidimensional en donde se encuentran los elementos del alfabeto.
     */
    public void leerAlfabeto(String alfabeto []){

        for(int i = 0; i < alfabeto.length; i++){
            this.alfabetoAFD.add(alfabeto[i]);
            System.out.println("El nuevo elemento del alfabeto es: " + this.alfabetoAFD.get(i));
        }
        
    }



    /*
    -------------- LEER ESTADO INICIAL --------------
    */
    /**
     * Establece el estado inical del Autómata.
     * Usa la lectura mediante el teclado para obtener el alfabeto.
     */
    public void leerEstadoInicial(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el Estado Inicial: ");
        this.estadoInicialAFD = scanner.nextLine();

        scanner.close();
    }

    /**
     * Establece el estado inical del Autómata.
     * @param estadoInicial el estado que se establecerá como el Estado Inicial del AFD.
     */
    public void leerEstadoInicial(String estadoInicial){
        this.estadoInicialAFD = estadoInicial;
    }


    /*
    --------------- LEER ESTADOS FINALES ---------------
    */
    /**
     * Establece los estados que serán los finales/terminales del AFD.
     * @param numeroEstadosFinales es la cantidad de estados finales que se establecerán en el AFD.
     */
    public void leerEstadosFinales(int numeroEstadosFinales){

        Scanner scanner = new Scanner(System.in);
        String nuevoEstadoFinal;

        for(int i = 0; i < numeroEstadosFinales; i++){
            System.out.println("Ingrese el Estado Final: ");
            nuevoEstadoFinal = scanner.nextLine();
            this.estadosFinalesAFD.add(nuevoEstadoFinal);
        }

        scanner.close();

    }

    /**
     * Establece los estados que serán los finales/terminales del AFD.
     * @param estadosFinales son los estados que se establecerán como Estados Finales en el AFD.
     */
    public void leerEstadosFinales(String estadosFinales[]){

        for(int i = 0; i < estadosFinales.length; i++){
            this.estadosFinalesAFD.add(estadosFinales[i]);
            System.out.println("El nuevo estado final es: " + this.estadosFinalesAFD.get(i));
        }
    }

    
    /*
    ----------- LEER TRANSICIONES -----------
    */

    /**
     * Establece las transiciones del AFD.
     * @param numTransiciones es la cantidad de transiciones que se establecerán en el AFD.
     */
    public void leerTransiciones(int numTransiciones){
        Transicion nuevaTransicion;
        Scanner scanner = new Scanner(System.in);
        String edoOrigenTemp;
        String caracterTemp;
        String edoDestinoTemp;

        for(int i = 0; i < numTransiciones; i++){
            System.out.println("Ingrese el estado Origen: ");
            edoOrigenTemp = scanner.nextLine();
            System.out.println("Ingrese el caracter: ");
            caracterTemp = scanner.nextLine();
            System.out.println("Ingrese el estado Destino: ");
            edoDestinoTemp = scanner.nextLine();

            nuevaTransicion = new Transicion(edoOrigenTemp, caracterTemp, edoDestinoTemp);
            this.transicionesAFD.add(nuevaTransicion);
        }

        scanner.close();
        
    }

    /**
     * Establece las transiciones del AFD.
     * @param transiciones es un array bidimensional donde cada elemento del arreglo contiene 3 partes.
     * La primera es el Estado Origen, la segunda es el caracter (miembro del alfabeto) y la tercera
     * es el Estado Destino. 
     */
    public void leerTransiciones(String transiciones[][]){
        Transicion nuevaTransicion;
        String edoOrigenTemp;
        String caracterTemp;
        String edoDestinoTemp;

        for(int i = 0; i < transiciones.length; i++){

            edoOrigenTemp = transiciones[i][0];
            caracterTemp = transiciones[i][1];
            edoDestinoTemp = transiciones[i][2];

            nuevaTransicion = new Transicion(edoOrigenTemp, caracterTemp, edoDestinoTemp);
            
            this.transicionesAFD.add(nuevaTransicion);
            System.out.println("La nueva transicion es " + nuevaTransicion.getEstadoOrigen() + 
            " " + nuevaTransicion.getCaracter() + " " + nuevaTransicion.getEstadoDestino());
        }
        
    }

    /**
     * Valida si el caracter de una cadena pertenece al alfabeto del autómata.
     * @param caracter es un elemento que compone la cadena.
     * @return true si el caracter pertenece al alfabeto. Devuelve false en cualquier otro caso.
     */
    public boolean validarCaracter(String caracter){

        for(int i = 0; i < this.transicionesAFD.size(); i++){
            if(caracter.equals(this.transicionesAFD.get(i).getCaracter())){
                return true;
            }
        }

        return false;
    }

    /**
     * Determina si una cadena pertenece o no al lenguaje generado por el AFD.
     * @param cadenaAValidar es la cadena a evaluar para determinar si pertenece o no al lenguaje del AFD.
     */
    public void validarCadena(String cadenaAValidar){
        
        String cadenaConsumida;
        String estadoActual = "";
        String estadoDestino = "";
        boolean validacion;
        int i;

        //valida si el elemento de la posicion i se encuentra dentro del alfabeto dado
        for(i = 0; i < cadenaAValidar.length(); i++){

            //Esto va consumiendo de izq->der la cadena dependiendo de i.
            //Si i == 0, la cadena es la original
            //cadenaConsumida = cadenaAValidar.substring(i);
            cadenaConsumida = (String.valueOf(cadenaAValidar.charAt(i)) );
            //es mejor charAt pq se empareja con el contador i (ambos inician en 0)
            validacion = this.validarCaracter(String.valueOf(cadenaAValidar.charAt(i)) );

            if(validacion){
                //calcular el estadoDestino
                if(i == 0){
                    estadoActual = this.estadoInicialAFD;
                    estadoDestino = calcularEstadoDestino(estadoActual, cadenaConsumida);
                    estadoActual = estadoDestino;
                }else{
                    estadoDestino = calcularEstadoDestino(estadoActual, cadenaConsumida);
                    estadoActual = estadoDestino;
                }

            } else {
                System.out.println("El caracter de alguna transicion no pertenece al alfabeto ");
                break;
            }

            if(i == cadenaAValidar.length() - 1){
                //mostrar mensaje
                validarEstadoFinal(estadoActual);
            }
        }

    }

    /**
     * Determina si el estado en el que se encuentra un caracter de una cadena es un Estado Final.
     * @param estadoActual es el estado en el que se encuentra el ultimo token de la cadena.
     */
    public void validarEstadoFinal(String estadoActual){
        //Validamos si el estadoActual es un final
        if(this.estadosFinalesAFD.contains(estadoActual)){
            System.out.println("--- Cadena Aceptada ---");
        }else{
            System.out.println("--- Cadena Rechazada ---");
        }
    }


    /**
     * Determina el Estado Destino a partir del Estado Origen y el caracter consumido.
     * @param estadoOrigen es el estado en el que se encuentra el tokem de la cadena.
     * @param caracter es el caracter de la cadena.
     * @return el Estado Destino dado por las transiciones.
     */
    public String calcularEstadoDestino(String estadoOrigen, String caracter){

        String estadoDestino = "";

        for(int i = 0; i < this.transicionesAFD.size(); i++){

            if(estadoOrigen.equals(this.transicionesAFD.get(i).getEstadoOrigen()) && 
                caracter.equals(this.transicionesAFD.get(i).getCaracter())){

                    estadoDestino = this.transicionesAFD.get(i).getEstadoDestino();
                    break;
                }

        }

        return estadoDestino;
    }

    
}
