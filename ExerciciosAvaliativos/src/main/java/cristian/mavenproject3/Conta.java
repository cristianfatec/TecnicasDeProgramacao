/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cristian.mavenproject3;

/**
 *
 * @author 1091392313047
 */
public class Conta {
    private int numeroConta;
    private double saldo;
    
    public void inicializar (int numeroConta, double saldoIncial){
        this.numeroConta=numeroConta;
        this.saldo=saldoIncial;
    }
    
    public void depositar (double valor){
        this.saldo+=valor;
    }
    
    public void sacar (double valor){
        if (this.saldo>=valor){
            this.saldo-=valor;
            contaDestino.depositar(valor);
        }else{
            System.out.println("Saldo insuficiente para transferir"+valor);
        }
    }
    
    public int getNumero(){
        return numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setNumero(int numero){
        this.numeroConta=numeroConta;
    }public void setSaldo(double saldo){
        this.saldo=saldo;
    }
}
