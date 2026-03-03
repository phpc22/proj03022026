package org.example;

public class ExPersonalizada {
    static void sacar(double saldo, double valor) throws
        SaldoInsulficienteException{
            if (valor > saldo){
                throw new SaldoInsulficienteException("Saldo Insuficiente! Saldo: " + saldo);
            }
        }

    public static void main(String[] args) {
        try{
            sacar(100, 500);
        }catch (SaldoInsulficienteException e){
            System.out.println("Erro: " + e.getMessage());
    }
    }
}
