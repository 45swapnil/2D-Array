package javaprogram;

import java.util.*;

public class TwoDArray {

	void UserInput()
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row & col");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int array[][]=new int[row][col];
        
        for(int i=0;i<row;i++)
        {
            
            for(int j=0;j<col;j++)
            {
               
                System.out.println("Enter the value of row "+(i+1)+" col "+(j+1));
                array[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("______MTRIX______"+row+" X "+col);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.print("\n");
        }
        

	}
	void Array()
	{

    	Scanner sc=new Scanner(System.in);
    	int array[][]=new int[2][2];
    	
    	System.out.println("Enter the array element ");
    	
    	for(int i=0;i<2;i++)
    	{
    		for(int j=0;j<=1;j++)
    		{
    			array[i][j]=sc.nextInt();
    		}
    	}
    	System.out.println("_______matrix______");
    	for(int i=0;i<=1;i++)
    	{
    		for(int j=0;j<=1;j++)
    		{
    			System.out.print(array[i][j]+"\t");
    		}
    		System.out.print("\n");
    	}

	}
	

	    public static void main(String[] args) {
	    	
	    	TwoDArray td=new TwoDArray();
	    	td.UserInput();
	     }
	    
	}
	    



