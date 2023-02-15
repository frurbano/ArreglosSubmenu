/*
EJERCICIO
Guardar los precios de 5 productos , utilizando para ello un arreglo.
Luego permita buscar un precio. Tambien obtener el promedio de los precios guardados
Use un Menu
 */
package org.fup;

import java.util.Scanner;

/**
 *
 * @author 4616166
 */
public class Arreglo {

    //declaro el arreglo
    int totales[] = new int[3];
    Scanner in = new Scanner(System.in);

    void registrarPrecios() {
        int valor = 0, op, total = 0, cantidad = 0;    
        for (int i = 0; i < totales.length; i++) {   
            total=0;
            do {
                System.out.println("------SUBMENU----");
                System.out.println("1. Cuaderno Norma 100 Hojas. Valor -> $8000");
                System.out.println("2. Cuaderno Norma 50 Hojas. Valor -> $5000");
                System.out.println("3. Salir");
                System.out.print("Numero del producto: ");
                op = in.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Cantidad de cuadernos del valor elegido: ");
                        cantidad = in.nextInt();
                        valor = 8000;
                        total = total +cantidad * valor;
                        break;
                    case 2:
                        System.out.println("Cantidad de cuadernos del valor elegido: ");
                        cantidad = in.nextInt();
                        valor = 5000;
                        total = total +cantidad * valor;
                        break;
                }
                
            } while (op > 0 && op < 3);
            System.out.println("total "+total);
            //registro el total del a compra en el arreglo
            totales[i] = total;
            System.out.println("+++++ FIN DE UNA COMPRA ++++++");
        }//cierre del for
    }
    
    void listar(){
        System.out.println("COMPRAS REGISTRADAS");
        for (int i = 0; i < totales.length; i++) {
            System.out.println("COMPRA-> "+totales[i]);
            
        }
    }
    
}
