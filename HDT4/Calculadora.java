/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 */
import java.util.ArrayList;

public class Calculadora {

    private static boolean instance_flag = false;
	private static Calculadora _theOnlyCalculador;

    private Calculadora() throws SingletonException {
		instance_flag = true;
	}
	
	
    /** 
     * @return Calculadora
     * metodo de Singleton
     */
    public static Calculadora getInstance() {
		if (instance_flag) {
			return _theOnlyCalculador;
		} else {
			_theOnlyCalculador = new Calculadora();
			return _theOnlyCalculador;
		}
	}

    
    /** 
     * @param expresiones
     * @param sta
     * @return int
     * metodo para calcular el valor de la expresion en postfix
     */
    public int Calculate1(ArrayList<String> expresiones, Stack<Integer> sta){
        int resultado = 0;
        ArrayList<String> operaciones = expresiones;
        for(String operacion : operaciones){
            if(verificar(operacion)){
                int numero = Integer.parseInt(operacion);
                sta.push(numero);
            }
            else if(verificar(operacion) == false){
                if(operacion.equals("+")){
                    resultado = sta.pull() + sta.pull();
                    sta.push(resultado);
                }
                else if(operacion.equals("-")){
                    resultado = sta.pull() - sta.pull();
                    sta.push(resultado);
                }
                else if(operacion.equals("*")){
                    resultado = sta.pull() * sta.pull();
                    sta.push(resultado);
                }
                else if(operacion.equals("/")){
                    resultado = sta.pull() / sta.pull();
                    sta.push(resultado);
                }
            }
        }
        return resultado;
    }



    
    /** 
     * @param operacion
     * @return boolean
     * metodo para verificar si es un numero o signo
     */
    private boolean verificar(String operacion){
        try {
            Integer.parseInt(operacion);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
    
    
    
}

