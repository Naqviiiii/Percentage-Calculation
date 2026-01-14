import java.util.*;
public class circle {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the radius of the circle  :");
        double Radi=input.nextDouble();
        double Area;
        double Circ;
        Area=Radi*Radi*3.14159;
        Circ=2*3.14159*Radi;
        System.out.println("The Area of this cricle is " + Area);
        System.out.println("The Circumference of this circle is " + Circ);
        input.close();
    }

}
