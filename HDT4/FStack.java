/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 */
public class FStack<T> {
    
    
    /** 
     * @param tipo
     * @param tipoL
     * @return Stack<T>
     * metodo para obtener el stack seleccionado por el usuario 
     */
    public Stack<T> getInstance(int tipo, int tipoL){
        Stack<T> stacks = new Stack<T>();

        switch(tipo){
            case 1: 
            stacks = new Vector<T>();
            break;

            case 2:
            stacks = new Array<T>();
            break;
            
            case 3:
            stacks = new List<T>(tipoL);
            break;

            default:
            break;
        }
        return stacks;
    }
}
