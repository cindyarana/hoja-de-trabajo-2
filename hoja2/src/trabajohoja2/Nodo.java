package trabajohoja2;
/**
 * @author Rodrigo V.
 */

public class Nodo {

    Nodo izquierda;
    Nodo derecha;
    public final Comparable valor;
    
    public Nodo(Comparable valor) {
        this.izquierda = null;
        this.derecha = null;
        this.valor = valor;
    }
    
    void ingresar(Comparable dato){
        if(dato.compareTo(valor)<0){
            if(izquierda==null){
                izquierda=new Nodo(dato);
            }else{
                izquierda.ingresar(dato);
            }
        }else if(dato.compareTo(valor)>0){
            if(derecha==null){
                derecha=new Nodo(dato);
            }else{
                derecha.ingresar(dato);
            }
        }else{
            System.err.println("Cuidao!! se ingreso valor duplicao XD");
        }
    }
    

    
}
