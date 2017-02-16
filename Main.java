/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anjan
 */
public class Main {
    
    public static void main(String[] args){
    
   Brewery brewery = new Brewery("Mikkeller"); 
   brewery.newBeer("American Dream", "Pils", 4.2);
   brewery.newBeer("Dark Horizon", "Stout", 15); 
   brewery.newBeer("Tjekket Pils", "Pils", 4.7); 
   
   brewery.info();
   
     brewery.newBeer("Santa's Little Helper", "Porter", 9);
     brewery.removeFromProduction("Dark Horizon");
     
     System.out.println("");
     
     brewery.info();
    }
}
