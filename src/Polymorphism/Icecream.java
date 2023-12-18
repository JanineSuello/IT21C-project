
package Polymorphism;


class Icecream extends Foods {
     Icecream(String name){
        super(name);
    }
    
    void cold(){
        System.out.println(name + " is freezing cold");
    }
    
    public void gutom(){
        System.out.println("lami kayo ang " + name);
    }
}
