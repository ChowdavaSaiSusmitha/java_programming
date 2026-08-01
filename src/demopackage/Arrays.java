package demopackage;

import java.util.Scanner;

class Static {
    private int[] arr;

    public Static() {
        Scanner sc = new Scanner(System.in);
        int[] values = new int[5];

        System.out.println("Enter 5 elements for the static array:");
        for (int i = 0; i < 5; i++) {
            values[i] = sc.nextInt();
        }

        this.arr = values;
    }

    void showstaticarray() {
        for (int i = 0; i < 5; i++) {
            System.out.println("a[" + i + "] is: " + arr[i]);
        }
    }
}

class Dynamic {
    int[] array;

    public Dynamic() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of dynamic array");
        int size=sc.nextInt() ;

        this.array = new int[size];

        System.out.println("Enter " + size + " elements for the dynamic array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
    }

    void showdynamicarray() {
        System.out.println("The elements of the dynamic array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("a[" + i + "] is: " + array[i]);
        }
    }
}

public class Arrays {
    public static void main(String[] args) {
        Static s = new Static();
        s.showstaticarray();
        Dynamic d = new Dynamic();
        d.showdynamicarray();
    }
}
