package com.company;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;


public class Main {

	public static void print (ComplexNumber cn) {

		if ((cn.realPart != 0) && (cn.imaginaryPart != 0)) {
			if (cn.imaginaryPart<0) {
				System.out.println(cn.realPart + " - " + (-cn.imaginaryPart) + 'i');
			} else if (cn.imaginaryPart>0) {
				System.out.println(cn.realPart + " + " + cn.imaginaryPart + 'i');
			}
		} else if ((cn.realPart == 0) && (cn.imaginaryPart == 0)) {
			System.out.println(0);
		} else if ((cn.realPart == 0) && (cn.imaginaryPart != 0)) {
			System.out.println(cn.imaginaryPart + 'i');
		} else if ((cn.realPart != 0) && (cn.imaginaryPart == 0)) {
			System.out.println(cn.realPart);
		}
	}

	public static void main(String[] args) {

		ComplexNumber one = new ComplexNumber(-1.5,2.5);
		System.out.print("Первое число: ");
		print(one);
		ComplexNumber two = new ComplexNumber(3.5,-4.5);
		System.out.print("Второе число: ");
		print(two);
		System.out.print("Их сумма: ");
		print(one.addition(two));
		System.out.print("Их разность: ");
		print(one.substraction(two));
		System.out.print("Их произведение: ");
		print(one.multiplicate(two));
	}
}