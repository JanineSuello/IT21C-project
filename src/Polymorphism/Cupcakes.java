
package Polymorphism;


class Cupcakes extends Foods {
    Cupcakes(String name){
        super(name);
    }
    void small(){
        System.out.println(name + " are very small");
    }
    
    public void gutom(){
        System.out.println("lami kayo ang " + name);
    }
}
