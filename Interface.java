//interface declaration
interface Polygon_Shape {
    void calculateArea(int base, int height);
}
 
//implement the interface
class Triangle implements Polygon_Shape {
    //implement the interface method
    public void calculateArea(int base, int height) {
        System.out.println("The area of the Triangle is " + ((base * height * 0.5)));
    }
}
 
class Main {
    public static void main(String[] args) {
        Triangle rect = new Triangle();       //declare a class object
        rect.calculateArea(15, 20);             //call the method
    }
}