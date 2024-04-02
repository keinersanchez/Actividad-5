/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores_java;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Hp
 */
public class Vectores_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    //1. Declarar una lista vacía
        ArrayList<String> lista_vacia = new ArrayList<>();

   // 2. Declarar una lista con más de 5 elementos
        ArrayList<Integer> lista_elementos = new ArrayList<>();
           lista_elementos.add(1);
           lista_elementos.add(2);
           lista_elementos.add(3);
           lista_elementos.add(4);
           lista_elementos.add(5);
           lista_elementos.add(6);
           lista_elementos.add(7);

   // 3. Encuentre la longitud de su lista
        System.out.println("La longitud de la lista con más de cinco elementos: " + lista_elementos.size());

   // 4. Obtener el primer elemento, el elemento central y el último elemento de la lista
        int primer_elemento = lista_elementos.get(0);
           System.out.println(primer_elemento);
        int elemento_central = lista_elementos.get(lista_elementos.size() / 2);
           System.out.println(elemento_central);
        int ultimo_elemento = lista_elementos.get(lista_elementos.size() - 1);
           System.out.println(ultimo_elemento);

    // 5. Declara una lista llamada tipos_datos_mezclados
        ArrayList<Object> tipos_datos_mezclados = new ArrayList<>();
           tipos_datos_mezclados.add("keiner");
           tipos_datos_mezclados.add(23);
           tipos_datos_mezclados.add(1.65);
           tipos_datos_mezclados.add("soltero");
           tipos_datos_mezclados.add("zaragocilla");

    // 6. Declare una variable de lista llamada it_companies y asígnele los valores iniciales
        ArrayList<String> it_companies = new ArrayList<>();
           it_companies.add("Facebook");
           it_companies.add("Google");
           it_companies.add("Microsoft");
           it_companies.add("Apple");
           it_companies.add("IBM");
           it_companies.add("Oracle");
           it_companies.add("Amazon");
        System.out.println(it_companies);

   // 7. Añadir una empresa de TI a it_companies utilizando los métodos de inserción
        it_companies.add("Movistar");
            System.out.println("las empresas de TI después de añadir Movistar con add(): " + it_companies);

   // 8. Comprobar si una determinada empresa existe en la lista it_companies
        boolean verificar = it_companies.contains("Google");
           System.out.println("¿verificar si Google está en la lista? " + verificar);

   // 9. Ordena la lista con el método sort()
        Collections.sort(it_companies);
            System.out.println(it_companies);

   // 10. Invierte la lista en orden descendente utilizando el método reverse()
        Collections.reverse(it_companies);
           System.out.println(it_companies);

   // 11. Elimine la primera empresa informática de la lista
        it_companies.remove(0);
           System.out.println(it_companies);

   // 12. Eliminar todas las empresas de TI de la lista
        it_companies.clear();
            System.out.println(it_companies);
    }
}

    
    

