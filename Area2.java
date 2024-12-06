/**
 * This package contains classes and interfaces that demonstrate polymorphism in Java.
 */
package Polymorhism;

import java.util.Scanner;
/**
 * This class calculates the area of a triangle using the formula: 0.5 * base * height.
 * The class also contains constants for pi and a default value for t.
 * The user is prompted to enter the height and base of the triangle.
 * The area of the triangle is then calculated and displayed.
 */
class Area2
{

double t=0.5;
double pi=3.14;
double r,l,b,h;


/**
 * Calculates the area of a circle given the radius.
 *
 * @param x The radius of the circle
 * @return The area of the circle
 */
double area(double x)
 {r=x;
  return(pi*r*r);
 }

/**
 * Calculates the area of a rectangle given its length and breadth.
 *
 * @param x The length of the rectangle
 * @param y The breadth of the rectangle
 * @return The area of the rectangle (length * breadth)
 */
double area(double x,double y)
{l=x;
 b=y;
 return(l*b);
}

/**
 * Calculates the area of a right angled triangle given its dimensions.
 *
 * @param x The height of the traingle 
 * @param y The width of the traingle
 * @param z 0.5
 * @return The area of the traingle (0.5 * height * widh)
 */

double area(double x,double y,double z)
{b=x;
 h=y;
 t=z;
 return(b*h*t);
}

/**
 * This program calculates the area of a circle , rectangle and a triangle based on user input.
 * It prompts the user to enter the radius of a circle and then calculates the area of the circle.
 * It then prompts the user to enter the height and base of a rectangle and calculates the area of the triangle
 * Again it then prompts the user to enter the height and base of a triangle and calculates the area of the triangle.
 * 
 * @param args The command line arguments
 */
public static void main(String args[])
{
 Area2 a1=new Area2();
 Scanner sc=new Scanner(System.in);

 System.out.println("Enter radius");
 double u=sc.nextDouble();
 double ci=a1.area(u);  // Calls circle version
 System.out.println("Area of circle="+ci); 
 
 System.out.println("Enter width of rectangle");
 double w=sc.nextDouble();
 System.out.println("Enter length of rectangle");
 double q=sc.nextDouble();
 double r1=a1.area(q,w);   // Calls rectangle version
 System.out.println("Area of rectangle="+r1);

 System.out.println("Enter height of triangle");
 double he=sc.nextDouble();
 System.out.println("Enter base of triangle");
 double ba=sc.nextDouble();
 double t1=a1.area(he,ba,0.5);  // Calls triangle version
 System.out.println("Area of triangle="+t1);

 sc.close();
 
}
}