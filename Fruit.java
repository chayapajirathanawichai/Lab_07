/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sec3_lecture7;

public class Fruit {
    
}
class Apple extends Fruit{
    public void makeApple(){
        System.out.println("Apple");
    }
}
class Orange extends Fruit{
    public void makeOrangeJuice(){
        System.out.println("Orange");
    }
}
class GoldenDelicious extends Apple{
    
}
class Mcintoch extends Apple{
    
}
class Main{
    public static void main(String[] args) {
        Fruit fruit=new GoldenDelicious(); //polymorphism
        Orange orange=new Orange();
        System.out.println("Is fruit instance of Orange: "+(fruit instanceof Orange));
        System.out.println("Is fruit instance of Apple: "+(fruit instanceof Apple));
        System.out.println("Is fruit instance of GoldenDelicious: "+(fruit instanceof GoldenDelicious));
        System.out.println("Is fruit instance of Mcintoch: "+(fruit instanceof Mcintoch));
        System.out.println("Is orange instance of Orange: "+(orange instanceof Orange));
        System.out.println("Is orange instance of Fruit: "+(orange instanceof Fruit));
        
        //casting
        //System.out.println("Is orange instance of Apple: "+(orange instanceof Apple));
        
        if(fruit instanceof Apple){
            ((Apple)fruit).makeApple(); //Apple
        }
        /*if(fruit instanceof Orange){
            ((Orange)fruit).makeApple();
        }*/
        if(orange instanceof Orange){
            orange.makeOrangeJuice(); //Orange
        }
        if(fruit instanceof Orange){
            ((Orange) fruit).makeOrangeJuice();
        }
    }
    
}
