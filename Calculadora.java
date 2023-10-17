/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cristian.mavenproject3;

/**
 *
 * @author 1091392313047
 */
public class Calculadora {
    public int somar (int a, int b){
        return a+b;
    }
    public int subtrair (int a, int b){
        return a-b;
    }
    public int multiplicar (int a, int b){
        return a*b;
    }
    public int dividir (int a, int b){
        if (b==0){
            throw new
ArithmeticException("Divisao por zero nao e permitida");
        }
        return a/b;
    }
}
