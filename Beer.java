/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anjan
 */
public class Beer {

    private String name;
    private String style;
    private double percentage;
    private boolean production;

    public Beer(String name, String style, double percentage) {
        this.name = name;
        this.style = style;
        this.percentage = percentage;
        this.production = true;
    }

    public String inProduction() {
        if (this.production == true) {
            return "yes";
        }
        return "no";
    }

    public String getType() {
        return this.style;
    }
    
     public String getName() {
        return this.name;
    }

    public boolean removeFromProduction(){
    if(this.production==true){
    this.production=false; }
    return true;
        }
    
    public String toString(){
    
    return this.name+" ("+this.style+") - "+this.percentage+"%, in production: "+this.inProduction(); 
    }
     
}
