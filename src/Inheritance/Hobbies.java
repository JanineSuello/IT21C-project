
package Inheritance;

class Hobbies extends Fav {
     Hobbies(String name){
        super(name);
    }
    
    void watch(){
        System.out.println(name + " loves watching movies");
    }
}
