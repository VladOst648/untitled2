package com.company;
import java.util.Scanner;

public class ComplexNumber {
    String RealPart;
    String ImaginaryPart;
    private void Print(int A, int B) {
        if ((A != 0) && (B != 0)) {
            if (B < 0) {
                System.out.println(A + "" + B + "i");
            }
            else if (B>0){
                int R = A; int D = B;
                System.out.println(A + "+" + B + "i");
            }
        }
        else if ((A == 0) && (B != 0)) {
            System.out.println(B+"i");
        }
        else if ((B == 0) && (A != 0)) {
            System.out.println(A);
        }
        else if ((B == 0) && (A == 0)) {
            System.out.println(0);
        }
    }
    private void Print(double A, double B) {
        if ((A != 0) && (B != 0)) {
            if (B < 0) {
                System.out.println(A + "" + B + "i");
            }
            else if (B>0){
                System.out.println(A + "+" + B + "i");
            }
        }
        else if ((A == 0) && (B != 0)) {
            System.out.println(B+"i");
        }
        else if ((B == 0) && (A != 0)) {
            System.out.println(A);
        }
        else if ((B == 0) && (A == 0)) {
            System.out.println(0);
        }
    }
    public void Entering() {
        System.out.print("Действительная чать: ");
        Scanner sc = new Scanner(System.in);
        RealPart = sc.nextLine();
        System.out.print("Мнимая часть: ");
        Scanner sc1 = new Scanner(System.in);
        ImaginaryPart = sc1.nextLine();
        System.out.println("Полученное комплексное число: ");
        char[] IP = ImaginaryPart.toCharArray();
        if (IP[0] == '-') {
            System.out.println(RealPart+""+ImaginaryPart);
        }
        else {
            System.out.println(RealPart+"+"+ImaginaryPart);
        }
    }
    public boolean IsDouble(ComplexNumber N) {

        char[] RP = RealPart.toCharArray();

        for (int i = 0; i < RP.length; i++) {
            if ((RP[i] == ',') || (RP[i] == '.')) {
                return true;
            }
        }
        char[] IP = ImaginaryPart.toCharArray();
        for (int i = 0; i < IP.length; i++) {
            if ((IP[i] == '.') || (IP[i] == ',')) {
                return true;
            }
        }
        return false;
    }
    char[] NutNumb = {'1','2','3','4','5','6','7','8','9',',','.','-'};
    public boolean inArray(char c, char[] NN) {
        for (int i = 0; i < NN.length; i++) {
            if (c == NN[i]) {
                return true;
            }
        }
        return false;
    }
    public void Addition(ComplexNumber N) {
        if (IsDouble(N) == true) {
            //---------------------------------
            double A1 = Double.parseDouble(this.RealPart);
            double A2 = Double.parseDouble(N.RealPart);

            String l1 = "";
            char[] ds = this.ImaginaryPart.toCharArray();
            for (int i = 0; i < this.ImaginaryPart.length(); i++) {
                if (inArray(ds[i],NutNumb) == true) {
                    l1 += ds[i];
                }
            }
            int B1 = Integer.parseInt(l1);

            String l2 = "";
            char[] dc = N.ImaginaryPart.toCharArray();
            for (int j = 0; j < N.ImaginaryPart.length(); j++) {
                if (inArray(dc[j],NutNumb) == true) {
                    l2 += dc[j];
                }
            }
            double B2 = Double.parseDouble(l2);
            //---------------------------------
            double B = B1+B2; double A = A1+A2;
            System.out.print("Сумма: ");
            Print(A, B);
        }
        else if (IsDouble(N) == false) {
            int A1 = Integer.parseInt(this.RealPart);
            int A2 = Integer.parseInt(N.RealPart);

            String l1 = "";
            char[] ds = this.ImaginaryPart.toCharArray();
            for (int i = 0; i < this.ImaginaryPart.length(); i++) {
                if (inArray(ds[i],NutNumb) == true) {
                    l1 += ds[i];
                }
            }
            int B1 = Integer.parseInt(l1);

            String l2 = "";
            char[] dc = N.ImaginaryPart.toCharArray();
            for (int j = 0; j < N.ImaginaryPart.length(); j++) {
                if (inArray(dc[j],NutNumb) == true) {
                    l2 += dc[j];
                }
            }
            int B2 = Integer.parseInt(l2);
            int A = A1+A2; int B = B1+B2;
            System.out.print("Сумма: ");
            Print(A,B);
        }
    }
    public void Substraction(ComplexNumber N) {
        if (IsDouble(N) == true) {
            //---------------------------------
            double A1 = Double.parseDouble(this.RealPart);
            double A2 = Double.parseDouble(N.RealPart);

            String l1 = "";
            char[] ds = this.ImaginaryPart.toCharArray();
            for (int i = 0; i < this.ImaginaryPart.length(); i++) {
                if (inArray(ds[i],NutNumb) == true) {
                    l1 += ds[i];
                }
            }
            int B1 = Integer.parseInt(l1);

            String l2 = "";
            char[] dc = N.ImaginaryPart.toCharArray();
            for (int j = 0; j < N.ImaginaryPart.length(); j++) {
                if (inArray(dc[j],NutNumb) == true) {
                    l2 += dc[j];
                }
            }
            double B2 = Double.parseDouble(l2);
            //---------------------------------
            double B = B1-B2; double A = A1-A2;
            System.out.print("Разность: ");
            Print(A,B);
        }
        else if (IsDouble(N) == false) {
            int A1 = Integer.parseInt(this.RealPart);
            int A2 = Integer.parseInt(N.RealPart);

            String l1 = "";
            char[] ds = this.ImaginaryPart.toCharArray();
            for (int i = 0; i < this.ImaginaryPart.length(); i++) {
                if (inArray(ds[i],NutNumb) == true) {
                    l1 += ds[i];
                }
            }
            int B1 = Integer.parseInt(l1);

            String l2 = "";
            char[] dc = N.ImaginaryPart.toCharArray();
            for (int j = 0; j < N.ImaginaryPart.length(); j++) {
                if (inArray(dc[j],NutNumb) == true) {
                    l2 += dc[j];
                }
            }
            int B2 = Integer.parseInt(l2);
            int A = A1-A2; int B = B1-B2;
            System.out.print("Разность: ");
            Print(A,B);
        }
    }
    public void Multiplicate(ComplexNumber N) {
        if (IsDouble(N) == true) {
            //---------------------------------
            double A1 = Double.parseDouble(this.RealPart);
            double A2 = Double.parseDouble(N.RealPart);

            String l1 = "";
            char[] ds = this.ImaginaryPart.toCharArray();
            for (int i = 0; i < this.ImaginaryPart.length(); i++) {
                if (inArray(ds[i],NutNumb) == true) {
                    l1 += ds[i];
                }
            }
            int B1 = Integer.parseInt(l1);

            String l2 = "";
            char[] dc = N.ImaginaryPart.toCharArray();
            for (int j = 0; j < N.ImaginaryPart.length(); j++) {
                if (inArray(dc[j],NutNumb) == true) {
                    l2 += dc[j];
                }
            }
            double B2 = Double.parseDouble(l2);
            //---------------------------------
            double B = B1-B2; double A = A1-A2;
            System.out.print("Произведение: ");
            Print(A,B);
        }
        else if (IsDouble(N) == false) {
            int A1 = Integer.parseInt(this.RealPart);
            int A2 = Integer.parseInt(N.RealPart);

            String l1 = "";
            char[] ds = this.ImaginaryPart.toCharArray();
            for (int i = 0; i < this.ImaginaryPart.length(); i++) {
                if (inArray(ds[i],NutNumb) == true) {
                    l1 += ds[i];
                }
            }
            int B1 = Integer.parseInt(l1);

            String l2 = "";
            char[] dc = N.ImaginaryPart.toCharArray();
            for (int j = 0; j < N.ImaginaryPart.length(); j++) {
                if (inArray(dc[j],NutNumb) == true) {
                    l2 += dc[j];
                }
            }
            int B2 = Integer.parseInt(l2);
            int A = A1*A2-B1*B2; int B = A1*B2+B1*A2;
            System.out.print("Произведение: ");
            Print(A,B);
        }
    }
}
