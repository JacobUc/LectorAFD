package practicaafd;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        /*
        ---------------- AQUI EMPIEZA EL FLUJO DEL PROGRAMA --------------------
            AUTOMATA 1. AFD que acepta las palabras en {0,1}* con un número impar de '10' 
        */

        //Instanciamos un objeto de la clase AFD
        AFD afd = new AFD();



        // -------- Establecemos los elemento del AFD  --------
        String estadosAFD [] = {"q0" , "q1", "q2", "q3"};
        String alfabetoAFD [] = {"0", "1"};
        String transicionesAFD [][] = {{"q0", "0", "q1"}, {"q0", "1", "q3"}, 
                                        {"q1", "0", "q2"}, {"q1", "1", "q3"},
                                        {"q2", "0", "q2"}, {"q2", "1", "q2"},
                                        {"q3", "0", "q3"}, {"q3", "1", "q3"}};
        String estadosFinalesAFD[] = {"q3"};
        String estadoInicialAFD = "q0";
            

        //Leemos los estados
        afd.leerEstados(estadosAFD);

        //Leemos el alfabeto
        afd.leerAlfabeto(alfabetoAFD);

        //Leemos las transiciones
        afd.leerTransiciones(transicionesAFD);

        //Leemos los estados finales
        afd.leerEstadosFinales(estadosFinalesAFD);

        //Leemos el estado incial
        afd.leerEstadoInicial(estadoInicialAFD);


        /*
        ------ VALIDANDO CADENAS ------
        */
        Scanner scanner = new Scanner(System.in);
     

        String cadenaAValidarAceptada = "0101110";
        System.out.println("Validando la cadena " + cadenaAValidarAceptada);
        afd.validarCadena(cadenaAValidarAceptada);

        String cadenaAValidarRechazada = "001001";
        System.out.println("Validando la cadena " + cadenaAValidarRechazada);
        afd.validarCadena(cadenaAValidarRechazada);


        /*
        int opcion;
        do{
            mostrarMenu();
            System.out.print("Ingrese una de las siguientes opciones: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    //Leer estados
                    System.out.print("Ingrese el número de estados: ");
                    int numeroEstados = scanner.nextInt();
                    afd.leerEstados(numeroEstados);
                    //Leer alfabeto
                    System.out.print("Ingrese el número de elementos del alfabeto: ");
                    int numeroTokens = scanner.nextInt();
                    afd.leerAlfabeto(numeroTokens);
                    //Leer transiciones
                    System.out.print("Ingrese el número de transiciones: ");
                    int numTransiciones = scanner.nextInt();
                    afd.leerTransiciones(numTransiciones);
                    //leer estados finales
                    //afd.leerEstadosFinales();
                    //Leer estado inicial
                    System.out.print("Ingrese el estado inicial ");
                    String estadoInicial = scanner.nextLine();
                    afd.leerEstadoInicial(estadoInicial);

                    break;

                case 2:
                    System.out.print("Ingrese una cadena a validar: ");
                    String cadenaAValidar = scanner.nextLine();
                    afd.validarCadena(cadenaAValidar);

                    break;
                
                case 3:
                    break;
            
                default:
                    System.out.println("Opción no disponible. Intente con uno de los valores aceptados.");
                    break;
            }

        } while (opcion != 3);
        */

        scanner.close();
    }

    public static void mostrarMenu(){
        System.out.println("\n\t\t----- AUTÓMATA FINITO DETERMINISTA -----\n\n");
        System.out.println("1. Leer especificaciones de un autómata  ");
        System.out.println("2. Validar Cadena ");
        System.out.println("3. Salir ");
    }
}
