/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 */

import java.util.ArrayList;
public class Array<T> extends Stack<T> {
    ArrayList<T> stackA = new ArrayList<T>();    

    
    /** 
     * @return boolean
     * metodo para revisar si el stack esta vacio
     */
    public boolean isEmpty(){
        return stackA.isEmpty();
    }

    
    /** 
     * @param value
     * metodo para pushear un valor al stack
     */
    public void push(T value){
        stackA.add(0,value);
    }

    
    /** 
     * @return T
     * metodo para jalar un valor del stack
     */
    public T pull(){
        return stackA.remove(0);
    }

    
    /** 
     * @return T
     * metodo para observar el valor en un stack
     */
    public T peek(){
        return stackA.get(0);
    }

    
    /** 
     * @return int
     * metodo para saber el tamaño del stack
     */
    public int count(){
        return stackA.size();
    }
}





