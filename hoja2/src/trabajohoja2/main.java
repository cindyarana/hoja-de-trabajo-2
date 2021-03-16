package trabajohoja2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner datos=new Scanner(System.in);
       ArbolBinario arbolbinario=new ArbolBinario();
       List<Integer> milista=new ArrayList<>();
       int numero=0;
       char opc;
       do{
           numero=0;
           System.out.println("Digite el numero que desea añadir al arbol");
           numero=datos.nextInt();datos.nextLine();
           arbolbinario.ingresar(numero);
           System.out.println("Desea ingresar otro dato al arbol? S/N");
          opc=datos.nextLine().charAt(0); 
          
       }while(Character.toUpperCase(opc)=='S');
       arbolbinario.MetodoFronteras(arbolbinario, milista);
       System.out.println("Las Fronteras del arbol son: "+Arrays.asList(milista));
    }
}
