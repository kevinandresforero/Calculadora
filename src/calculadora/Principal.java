/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import calculadora.Bases.Calculadora;
import calculadora.Bases.Binaria;
import calculadora.Bases.Decimal;
import calculadora.Bases.Hexadecimal;
import calculadora.Bases.Octal;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora Virtual;
        Scanner No = new Scanner(System.in);
        
        System.out.println(" Ingrese la base de los # que quiere operar ");
        int base = No.nextInt();
        switch(base){
            case 2:
              Virtual = new Binaria();
              break;
            case 8:
                Virtual = new Octal();
                break;
            case 10:
                Virtual = new Decimal();
                break;
            default:
                Virtual = new Hexadecimal();
                break;
        }
        
        System.out.println(" Por favor ingrese el primer valor ");
        Virtual.setA(No.next());
        System.out.println("Por favor ingrese el segundo valor");
        Virtual.setB(No.next());
        
           System.out.println(" Ingrese la operacion que desea efectuar ");
           System.out.println(" 1    para   + ");
           System.out.println(" 2    para   - ");
           System.out.println(" 3    para   * ");
           System.out.println(" 4    para   / ; si segundo valor es diferente de 0 ");
        int OP = No.nextInt();
        switch(OP){
            case 1:
                
                Virtual.sumar();
                System.out.println(Virtual.mostrarA() + " + " + Virtual.mostrarB() + " = " + Virtual.mostrarResultado());
              break;
            case 2:
                Virtual.restar();
                System.out.println(Virtual.mostrarA() + " - " + Virtual.mostrarB() + " = " + Virtual.mostrarResultado());
                break;
            case 3:
                Virtual.multiplicar();
                System.out.println(Virtual.mostrarA() + " * " + Virtual.mostrarB() + " = " + Virtual.mostrarResultado());
                break;
            case 4:
                    Virtual.dividir();
                    System.out.println(Virtual.mostrarA() + " / " + Virtual.mostrarB() + " = " + Virtual.mostrarResultado());
             
                break;
            default:
                Virtual = new Hexadecimal();
                break;
        }
        
    }
    
}
