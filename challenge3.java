import java.util.*;
import java.io.*;

class Challenge3
{

    public static int largest()
    {
        int i;
        int max;
        int[] a;
        
		for (i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
 
        return max;
    }
    
    public static void Mode(int[] a, int n)
    {

        int max;
 

        int x = max + 1;
        int[] count = new int[x];
        for (int i = 0; i < x; i++)
        {
            count[i] = 0;
        }
 

        for (int i = 0; i < n; i++)
        {
            count[a[i]]++;
        }
 
        int mode = 0;
        int k = count[0];
        for (int i = 1; i < x; i++)
        {
            if (count[i] > k)
            {
                k = count[i];
                mode = i;
            }
        }
 
        System.out.println("mode = " + mode);
    }
    
	public static double Median(int a[], int n)
    {
        
        if (n % 2 != 0)
            return (double)a[n / 2];
 
        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }
 
    
    
    public static void main(String args[])
    {
        int a[] = { 47, 84, 75, 21, 14, 14, 79  };
        int n = a.length;
       
        System.out.println("Median is " + Median(a, n));
        System.out.println("Largest is "
                + largest());
        Mode(a, n);
    }

}
