package com.workshop;
import java.util.Scanner;
public class SelectionSortOfArray {
    public void selectionSort(int array[])
    {int length = array.length; // stores the length of array
        for(int i = 0; i<length; i++) // to traverse the array elements until the length
        {
            int index1=i;
            for(int j=i+1; j<length; j++) //to find the minimum element
            {
                if(array[j]< array[index1])
                    index1= j; // it stores the minimum element
            }
            int temporaryNum = array[index1]; // swapping the element with the minimum element and store in a temporary value in order to sort
            array[index1] = array[i];
            array[i] = temporaryNum;
        }

    }

    public void displaySelectionSort(int array[])
    {int length = array.length;
        for(int i=0; i<length; i++)
            System.out.println(array[i]); //to print and display the sorted array in ascending order
        System.out.println();

    }

    public static void main(String[] args)
    {int array[]=new int[100];
        SelectionSortOfArray sort = new SelectionSortOfArray();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter 100 array elements: ");
        for(int i = 0; i <= 100; i++ )
        {
            System.out.println(array[i] = read.nextInt());
        }
        sort.selectionSort(array);
        System.out.println("The sorted arrays using selection sort are: ");
        sort.displaySelectionSort(array);
    }
}
