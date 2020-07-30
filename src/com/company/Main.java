package com.company;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;


public class Main {

    public static void main(String[] args) {
		ComplexNumber one = new ComplexNumber(-1.5,2.5);
		ComplexNumber two = new ComplexNumber(3.5,-4.5);
		one.addition(two);
		one.Substraction(two);
		one.multiplicate(two);
    }
}
