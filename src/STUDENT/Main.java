
package STUDENT;


public class Main {
    public static void main(String[] args) {
    
        Student ako = new Student("Janine Grace P. Suello", "IT21-C", "Fall down seven times, stand up eight");
        
        System.out.println("Name: " + ako.getName());
        System.out.println("Section: " + ako.getSection());
        System.out.println("Motto: " + ako.getMotto());
    }
}
