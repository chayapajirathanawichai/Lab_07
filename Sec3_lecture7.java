/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sec3_lecture7;

class A{
        int x=1;
        void f(){
            System.out.println("A");
        }
    }
class B extends A{
    int x=2;
    void f(){
        System.out.println("B");
    }
}
public class Sec3_lecture7 {
    public static void main(String[] args) {
        B b=new B();
        A a=b;
        System.out.println(a.x+", "+b.x);
        a.f(); //B
        b.f(); //B
    }
}
