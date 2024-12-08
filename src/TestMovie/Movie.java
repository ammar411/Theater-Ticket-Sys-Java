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
public class Movie {
    private String Movie_Title;
    private int ID;
    private String Rating;
    
    public Movie (String MT,int ID,String R)
    {
        this.Movie_Title=MT;
        this.ID=ID;
        this.Rating=R;
    }
    public void setMovie_Title(String MT)
    {
        this.Movie_Title=MT;
    }
    public void setID(int ID)
    {
        this.ID=ID;
    }
    public void setRating(String R)
    {
        this.Rating=R;
    }
    
    public String getMovie_Title()
    {
   return this.Movie_Title;
    }
    public int getID()
    {
        return this.ID;
    }
    
   public String getRating()
   {
       return this.Rating;
   }
   public double calcLateFees()
   {
       Scanner sc=new Scanner(System.in);
       System.out.printf("Enter The Number of Days The Movie Is Late : ");
       int Days=sc.nextInt();
       double fees=Days*2;
       return fees;
       
       
   }

    @Override
    public String toString() {
        return String.format("Movie_Title = %s \nID=%d \nRating=%s\n" ,this.Movie_Title,this.ID,this.Rating);
    }
   
   
}
