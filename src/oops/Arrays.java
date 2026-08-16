package oops;

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
    int arr[]={0};
   void dynamicarray(){
         Scanner sc = new Scanner(System.in);
       int i=0;
       int k=arr.length;
       boolean choice = true;
       System.out.println("Enter elements of the array dynamically:");
       while(choice==true){
          System.out.print("a["+i+"] is: " );
           arr[i]=sc.nextInt();
           k++;
           i++;
           System.out.print("choice:" + sc.nextBoolean());
       }
       for (int j = 0; j < arr.length; j++) {
            System.out.println("a[" + j + "] is: " + arr[j]);
        }
    }

}

public class Arrays {
    public static void main(String[] args) {
        //Static s = new Static();
        //s.showstaticarray();
        Dynamic d = new Dynamic();
        d.dynamicarray();
    }
}
