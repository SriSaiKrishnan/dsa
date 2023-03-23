package com.sai.patterns;

public class Pattern12 {

    public static void main(String[] args) {
        int n = 5;
        pattern12(n);
    }

    private static void pattern12(int n) {
        int k = 0;
        int c = 1;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<2*n; j++)
            {
                    if (j <= 4) {
                        ++k;
                        if(k<=c)
                            System.out.print(k);
                        else
                            System.out.print(" ");
                    } else {
                        if(k<=c)
                            System.out.print(k);
                        else
                            System.out.print(" ");
                        --k;
                    }
            }
            c++;
            System.out.println();
        }
    }

}
