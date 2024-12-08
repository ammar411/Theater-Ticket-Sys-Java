/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestMovie;

/**
 *
 * @author ammar
 */
public class Test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Action A=new Action("Harry Potter",2,"4 Star");
        
        Comedy C=new Comedy("Animal",3,"3 Star");
        
        Drama D=new Drama("Koi Mil gaya",4,"2 Star");
        
        System.out.printf("%s",A);
        System.out.printf("Late Fees= %f\n\n",A.calcLateFees());
        
        System.out.printf("%s",C);
        System.out.printf("Late Fees= %f\n\n",C.calcLateFees());
        
        System.out.printf("%s",D);
        System.out.printf("Late Fees= %f\n\n",D.calcLateFees());
        
        
        
        
        
       
            
               
              
    }
    
}
