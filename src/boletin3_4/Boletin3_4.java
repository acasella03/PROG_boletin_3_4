package boletin3_4;

import java.util.Scanner;

public class Boletin3_4 {

    public static void main(String[] args) {
        Scanner billete = new Scanner(System.in);
        System.out.println("Indique Importe Total");
        int totalimporte = billete.nextInt();
        int b100 = totalimporte / 100;
        int resto1 = totalimporte % 100;
        int b20 = resto1 / 20;
        int resto2 = resto1 % 20;
        int b5 = resto2 / 5;
        int m1 = (resto2 % 5) / 1;
        System.out.println("Desgloce : " + "\nBilletes de 100 euros = " + b100 + "\nBilletes de 20 euros = " + b20 + "\nBilletes de 5 euros = " + b5 + "\nMonedas de 1 euro = " + m1);
    }

}
