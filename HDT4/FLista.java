/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 */
public class FLista<T> {
    MadreLista<T> lista;

    
    /** 
     * @param tipoL
     * @return MadreLista<T>
     * metodo que retonar el tipo de lista como stack
     */
    public MadreLista<T> getInstance(int tipoL){
        

        switch(tipoL){
            case 1:
            lista = new SingleLinkedList<T>();
            break;

            case 2:
            lista = new DoubleLinkedList<T>();
        }

        return lista;
    }
}
