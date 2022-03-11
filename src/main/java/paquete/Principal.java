package paquete;

import entidades.paises.Paises;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String res = "";
        TreeSet<Paises> paises = new TreeSet();
        do {
            System.out.println("Ingrese un pais");
            res = leer.next();
            paises.add(new Paises(res));
            System.out.println("Quiere ingresar otro pais");
            res = leer.next();
        } while (res.equalsIgnoreCase("Si"));
        for (Paises paise : paises) {
            System.out.println(paise.getNombre());
        }
        String respuesta="";
       
        System.out.println("Ingrese el pais a borrar");
        respuesta=leer.next();
        
         System.out.println("A continuacion la nueva lista");
       Iterator<Paises> aux = paises.iterator();
       int band=0;
        while (aux.hasNext()) {
            Paises next = aux.next();
            if(next.getNombre().equalsIgnoreCase(respuesta)){
            aux.remove();
            band=1;
          }
        }
         for (Paises paise : paises) {
             System.out.println(paise.getNombre());
        }
         if(band==0){
             System.out.println("No se encontro el pais a borrar");
         }
    }

}
