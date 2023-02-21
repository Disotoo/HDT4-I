
/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Principal{

    
    /** 
     * @param args
     * metodo para interactuar con el usuario
     */
    public static void main(String [] args) {
        Calculadora calculadora = Calculadora.getInstance();
        Scanner teclado = new Scanner(System.in);
        FStack<Integer> respuesta = new FStack<>();
        Stack<Integer> sta = new Stack<>();
        ArrayList<String> lineasDatos = new ArrayList<String>();


        Archivo archivo = new Archivo("./datos.txt");
        ArrayList<String> lineasOperaciones = archivo.leerArchivo();

        for(String operacion:lineasOperaciones){
            lineasDatos.add(InToPos.infixToPostfix(operacion));
        }
        
        
        try{
            System.out.println("Bienvenido a la calculadora");
            System.out.println("Que tipo de Stack quiere usar: \n1. Array \n2.Vector \n3.List");
            int tipo = teclado.nextInt();
            teclado.nextLine();

            switch(tipo){
                case 1: 
                sta = respuesta.getInstance(tipo,0);
                for (String fila : lineasDatos) {
                    ArrayList<String> oneLine = new ArrayList<String>();
                    String [] lineaSeparada = fila.split("");
                    for (String caracter : lineaSeparada) {
                        oneLine.add(caracter);
                    }    
    
                    try{
                        System.out.println("Resultado " + calculadora.Calculate1(oneLine, sta));
                    } catch(Exception e){
                        System.out.println("No se pudo realizar la operación, revise archivo de entrada");
                    }   
                }
                break;

                case 2: 
                sta = respuesta.getInstance(tipo,0);
                for (String fila : lineasDatos) {
                    ArrayList<String> oneLine = new ArrayList<String>();
                    String [] lineaSeparada = fila.split("");
                    for (String caracter : lineaSeparada) {
                        oneLine.add(caracter);
                    }    
    
                    try{
                        System.out.println("Resultado " + calculadora.Calculate1(oneLine, sta));
                    } catch(Exception e){
                        System.out.println("No se pudo realizar la operación, revise archivo de entrada");
                    }   
                }
                break;

                case 3:
                System.out.println("Que tipo de lista quiere usar: \n1. Single \n2. Double");
                int tipoL = teclado.nextInt();
                teclado.nextLine();
                
                switch(tipoL){
                    case 1: 
                    sta = respuesta.getInstance(tipo,tipoL);
                    for (String fila : lineasDatos) {
                        ArrayList<String> oneLine = new ArrayList<String>();
                        String [] lineaSeparada = fila.split("");
                        for (String caracter : lineaSeparada) {
                            oneLine.add(caracter);
                        }    
        
                        try{
                            System.out.println("Resultado " + calculadora.Calculate1(oneLine, sta));
                        } catch(Exception e){
                            System.out.println("No se pudo realizar la operación, revise archivo de entrada");
                        }   
                    }
                    break;

                    case 2: 
                    sta = respuesta.getInstance(tipo,tipoL);
                    for (String fila : lineasDatos) {
                        ArrayList<String> oneLine = new ArrayList<String>();
                        String [] lineaSeparada = fila.split("");
                        for (String caracter : lineaSeparada) {
                            oneLine.add(caracter);
                        }    
        
                        try{
                            System.out.println("Resultado " + calculadora.Calculate1(oneLine, sta));
                        } catch(Exception e){
                            System.out.println("No se pudo realizar la operación, revise archivo de entrada");
                        }   
                    }
                    break;

                    default:
                    break;
                    

                }
                break;

                default:
                break;


            }
            

        } catch (Exception e){
            teclado.nextLine();
            System.out.println("Ingreso algo incorrecto");
        }


    }
}