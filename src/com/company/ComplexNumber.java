package com.company;
import java.util.Scanner;

public class ComplexNumber {
     double realPart;
     double imaginaryPart;

    public ComplexNumber(double rp, double ip) {

        realPart = rp;
        imaginaryPart = ip;
    }

    public ComplexNumber addition(ComplexNumber n) {

        double a = n.realPart + this.realPart;
        double b = n.imaginaryPart + this.imaginaryPart;
        ComplexNumber sum = new ComplexNumber(a,b);
        return sum;
    }

    public ComplexNumber substraction(ComplexNumber n) {
        double a = this.realPart - n.realPart;
        double b = this.imaginaryPart - n.imaginaryPart;
        ComplexNumber difference = new ComplexNumber(a, b);
        return difference;
    }

    public ComplexNumber multiplicate(ComplexNumber n) {
        double a = n.realPart * this.realPart - n.imaginaryPart * this.imaginaryPart;
        double b = n.realPart * this.imaginaryPart + n.imaginaryPart * this.realPart;
        ComplexNumber product = new ComplexNumber(a,b);
        return product;
    }
}