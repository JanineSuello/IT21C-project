
package Inheritance;

public class Fav {
    String name;
    
    Fav(String name){
        this.name= name;
    }
    
    void read(){
        System.out.println(name + " loves reading");
    }
    void sleep(){
        System.out.println(name + " loves sleeping");
    }
}
