
package Polymorphism;


public class Main {
    public static void main(String[] args){
       
        Foods myfoods= new Foods("Cakes");
        Icecream myicecream= new Icecream("Chocolate");
        Cupcakes mycupcakes= new Cupcakes("Choco");
        
        myfoods.sweet();
        myfoods.yum();
                
        System.out.println("-----------");
        
        myfoods.gutom();
        myicecream.gutom();
        mycupcakes.gutom();
    }
}
