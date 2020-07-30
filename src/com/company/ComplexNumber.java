package com.company;
import java.util.Scanner;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double rp, double ip) {
        realPart = rp;
        imaginaryPart = ip;
    }

    public void addition(ComplexNumber n) {
        double a = n.realPart + this.realPart;
        double b = n.imaginaryPart + this.imaginaryPart;
        print(a, b);
    }

    public void Substraction(ComplexNumber n) {
        double a = this.realPart - n.realPart;
        double b = this.imaginaryPart - n.imaginaryPart;
        print(a, b);
    }

    public void multiplicate(ComplexNumber n) {
        double a = n.realPart * this.realPart - n.imaginaryPart * this.imaginaryPart;
        double b = n.realPart * this.imaginaryPart + n.imaginaryPart * this.realPart;
        print(a, b);
    }

    private void print(double a, double b) {
        if ((a != 0) && (b != 0)) {
            if (b<0) {
                System.out.println(a + " - " + (-b) + 'i');
            }
            else if (b>0) {
                System.out.println(a + " + " + b + 'i');
            }
        }
        else if ((a == 0) && (b == 0)) {
            System.out.println(0);
        }

        else if ((a == 0) && (b != 0)) {
            System.out.println(b + 'i');
        }

        else if ((a != 0) && (b == 0)) {
            System.out.println(a);
        }
    }
}
