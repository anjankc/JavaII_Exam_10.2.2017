/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anjan
 */
import java.util.*;

public class Brewery {

    private int removed;
    private  ArrayList<String> beerType= new ArrayList<String>(); 
    private String brewName;
    private Beer newBeer;
    private ArrayList<Beer> beerStore;

    public Brewery(String brewName) {
        this.brewName = brewName;
        this.beerStore = new ArrayList<Beer>();
    }

    public void newBeer(String name, String style, double percentage) {
        this.newBeer = new Beer(name, style, percentage);
        this.beerStore.add(newBeer);
    }

    public void info() {
        System.out.println(this.brewName);
        System.out.println("Beers - " + this.beerStore.size() + ", in production - " + (this.beerStore.size() - this.removed));
        System.out.print("Styles: ");
          
        // Storing beertype in different arrayList
        for (Beer beer : this.beerStore) {
                          if(!this.beerType.contains(beer.getType())){
                   this.beerType.add(beer.getType());
                  
               }
               
            // Printing beertype arraylist    
        }
        for (String bertype: this.beerType){
         System.out.print(bertype+" "); }
        
         
        System.out.println("");
        
        System.out.println("Beers:");
        for (Beer beer : this.beerStore) {
            System.out.println(beer);
        }
    }

    public void removeFromProduction(String beerName) {
        for (Beer beer: this.beerStore){
            // too remove from Production, beer name must be same and should be in production itself
      if (beer.inProduction().equals("yes") && beer.getName().equals(beerName)){
          beer.removeFromProduction(); 
          this.removed++; 
      }
        }
}
    
    
}