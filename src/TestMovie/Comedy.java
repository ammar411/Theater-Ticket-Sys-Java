/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestMovie;

import java.util.Scanner;

/**
 *
 * @author ammar
 */
public class Comedy extends Movie
{
    public Comedy(String MT,int ID,String R)
    {
        super(MT,ID,R);
    }
    @Override
    public double calcLateFees()
   {
       Scanner sc=new Scanner(System.in);
       System.out.printf("Enter The Number of Days The Movie Is Late : ");
       int Days=sc.nextInt();
       double fees=Days*2.5;
       return fees;
       

    
}
}
