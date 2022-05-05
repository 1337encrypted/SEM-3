import java.util.Scanner;
abstract class Shape{
double area;
double perimeter;
String type;
abstract void computeArea();
abstract void computePerimeter();
}
class Rectangle extends Shape{
double length, width;
Rectangle(){
Scanner in = new Scanner(System.in);
System.out.println("Enter the length and width: ");
length = in.nextDouble();
width = in.nextDouble();
}
void computeArea() {
area = length * width;
System.out.println("Area of the rectangle is: " + area);
}
void computePerimeter() {
perimeter = 2 * (length + width);
System.out.println("Perimeter of the rectangle is: " + perimeter);
}
}
class Circle extends Shape{
double radius;
Circle(){
Scanner in = new Scanner(System.in);
System.out.println("Enter the radius: ");
radius = in.nextDouble();
}
void computeArea() {
area = Math.PI * radius * radius;
System.out.println("Area of the circle is: " + area);
}
void computePerimeter() {
    perimeter = 2 * Math.PI * radius;
System.out.println("Perimeter of the circle is: " + perimeter);
}
}
class Triangle extends Shape{
double a, b, c, s;
Triangle(){
Scanner in = new Scanner(System.in);
System.out.println("Enter the 3 sides: ");
a = in.nextDouble();
b = in.nextDouble();
c = in.nextDouble();
}
void computeArea() {
s = (a + b + c) / 2.0;
area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
System.out.println("Area of the triangle is: " + area);
}
void computePerimeter() {
perimeter = a + b + c;
System.out.println("Perimeter of the triangle is: " + perimeter);
}
}
public class TW20_ShapeRectangleCircleTriangle {
public static void main(String[] args) {
Rectangle r = new Rectangle();
r.computeArea();
r.computePerimeter();
Circle c = new Circle();
c.computeArea();
c.computePerimeter();
Triangle t = new Triangle();
t.computeArea();
t.computePerimeter();
}

}