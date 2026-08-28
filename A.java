/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sec3_lecture7;

public class A {
    int x;
    void f(){}
}
class B extends A{
    int x;
    int y;
    void f(){}
    void g(){}
}
class Main{
    public static void main(String[] args) {
        A a=new B();
        ((B)a).g(); //casting
    }
}