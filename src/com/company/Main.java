package com.company;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
	ComplexNumber One = new ComplexNumber();
	ComplexNumber Two = new ComplexNumber();
	One.Entering();
	Two.Entering();
	One.Addition(Two);
	One.Substraction(Two);
	One.Multiplicate(Two);
    }
}
