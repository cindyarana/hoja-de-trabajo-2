package trabajohoja2;
import java.util.List;

/**
 * @author Rodrigo V.
 */

public class ArbolBinario {
    public Nodo root;

    public ArbolBinario() {
        this.root = null;
    }

    public void ingresar(Comparable dato){
        if (root==null) {
            root=new Nodo(dato);
        } else {
            root.ingresar(dato);
        }
    }

    public void MetodoFronteras(ArbolBinario arbol,List<Integer>fronteras){
        MetodoFronteras(arbol.root,fronteras);
    }

    private void MetodoFronteras(Nodo root2, List<Integer> fronteras) {
        if(root2==null){
            return;
        }else if(root2.izquierda==null && root2.derecha==null){
            fronteras.add((Integer)root2.valor);
        }else{
            this.MetodoFronteras(root2.izquierda, fronteras);
            this.MetodoFronteras(root2.derecha, fronteras);
        }
    }

}
