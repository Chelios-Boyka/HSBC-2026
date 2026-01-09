package org.example.triangles;

public class Triangles_I {

    /// RIGHT TRIANGLE
    public static void rightTriangle(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /// LEFT TRIANGLE
    public static void leftTriangle(int a){
        System.out.println("\nLeft Triangle\n");
        for(int i = 0; i <= a; i++){

            for(int j =2 * (a - i); j >= 0; j--){
                System.out.print(' ');
            }

            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /// PYRAMID NUMBER
    public static void pyramidNumber(int n){

        int x = 0;

        for (int i = 1; i <= n; i++){
            x = i - 1;


            for (int j = i; j <= n - 1; j++){
                System.out.print("   ");
            }

            for (int j = 0; j <= x; j++){
                System.out.print((i + j) < 10 ? (i + j) + "  " : (i + j) + " ");
            }

           // for (int j = 1; j <= x; j++){
             //   System.out.print((i + x - j) < 10 ? (i + x - j) + "  " : (i + x - j) + " ");
            //}

            System.out.println();
        }

        System.out.println();

    }
}
