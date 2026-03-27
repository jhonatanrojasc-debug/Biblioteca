package dominio;

import java.util.*;

public class Collect {

    public void listarProductos(){

        List<String> Productlist = new ArrayList<>();
        Productlist.add("Shampoo");          // agrega elemento
        Productlist.add("Arroz");
        Productlist.add("Agua");
        System.out.println("- tamaño inicial de la lista: " + Productlist.size() + " elementos");
        System.out.println("- Elementos iniciales de la lista: " + Productlist);

        System.out.println("- Eliminación de producto: " + Productlist.remove("Agua"));            // elimina por valor
        Productlist.set(1, "Jabón");         // reemplaza en índice

        System.out.println("- tamaño final de la lista: " + Productlist.size() + " elementos");          // Calcular el tamaño
        System.out.println("- Elementos finales de la lista: " + Productlist);                 // [Uno, NuevoTres]
    }


    public void listaNumeros(){
        Set<Integer> numberList = new HashSet<>();
        numberList.add(5);
        numberList.add(10);
        numberList.add(15);
        System.out.println("- Tamaño de la lista de números: " + numberList.size());

        System.out.println(numberList.contains(10)); // true
        System.out.println("- Eliminación de elemento: " + numberList.remove(5));                        // elimina
        System.out.println("- Lista vacia: " + numberList.isEmpty());    // false
        System.out.println("- tamaño final de la lista de números: " + numberList);              // [10, 15]
    }
    public void EjemploMap() {
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 25);
        edades.put("Luis", 30);

        System.out.println(edades.get("Ana"));    // 25
        edades.replace("Luis", 31);               // actualiza valor
        edades.remove("Ana");                     // elimina clave
        System.out.println(edades.containsKey("Luis")); // true
        System.out.println(edades.containsValue(31));   // true
        System.out.println(edades);               // {Luis=31}
    }
}
