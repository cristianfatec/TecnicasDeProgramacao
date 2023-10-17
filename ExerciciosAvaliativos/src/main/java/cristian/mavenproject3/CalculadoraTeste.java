/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cristian.mavenproject3;

/**
 *
 * @author 1091392313047
 */
public class CalculadoraTeste {
    public static void main(String[]args)
    {
        Calculadora calculadora= new Calculadora();
        
        int resultadoSoma=calculadora.somar(10,5);
        int resultadoSubtracao=calculadora.subtrair(10,5);
        int resultadoMultiplicacao=calculadora.multiplicar(10,5);
        int resultadoDivisao=calculadora.dividir(10,5);
        
        System.out.println("Soma: "+ resultadoSoma);
        System.out.println("Subtração: "+ resultadoSubtracao);
        System.out.println("Multiplicação: "+ resultadoMultiplicacao);
        System.out.println("Divisão: "+ resultadoDivisao);
    }
            
    
}
