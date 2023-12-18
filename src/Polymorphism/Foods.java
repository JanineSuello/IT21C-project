
package Polymorphism;


class Foods {
    String name;
    
    Foods(String name){
        this.name= name;
    }
    
    void sweet(){
        System.out.println(name + " are sweet");
    }
    
    void yum(){
        System.out.println(name + " are yummy");
    }
    
    public void gutom(){
        System.out.println("lami kayo ang " + name);
    }
}
