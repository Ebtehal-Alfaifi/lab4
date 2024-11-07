//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Circal c=new Circal(2);
        System.out.println("The area of circal "+ " = " +c.calculateArea());
        System.out.println(" The Circumference circal "+"="+ c.calculateCircumference());
        System.out.println("__________________________________");
       // ------------------------------------------------------------------------
        Rectangle r=new Rectangle(3,4);
        System.out.println("The area of Rectangle "+ " = " +r.calculateArea());
        System.out.println(" The Circumference of Rectangle "+"="+ r.calculateCircumference());
        System.out.println("__________________________________");
        //___________________________________________________________________________

        Triangle t=new Triangle(5,5.7);
        System.out.println("The area of triangle "+ " = " + t.calculateArea());
        System.out.println(" The Circumference of triangle "+"="+ t.calculateCircumference());
        System.out.println("__________________________________");
}}