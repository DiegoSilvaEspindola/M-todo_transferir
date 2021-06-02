package Conta;

public class Principal {
    public static void main(String args []){

        Conta c1 = new Conta (000111, 01, 2500, 1000);

        Conta c2 = new Conta(000222, 02, 500, 500);

        Conta c3 = new Conta( 000222, 03, 100, 550);

        c1.tranferir(c2, 500);

        c1.tranferir(c3, 1000);

        System.out.println(c2.getSaldo());

        System.out.println(c3.getSaldo());

        c2.sacar(50);
        System.out.println(c2.getSaldo());

        c1.sacar(25000);
    }
}
