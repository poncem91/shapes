package Project02;

public class ShapeDemo {

    // Driver class to test all shape classes using different initialization methods

    public static void main(String[] args) {
        // creates a Rectangle using the Shape class with the constructor that specifies all fields
        Shape myRectangle = new Rectangle(3.5, 4, "periwinkle");
        System.out.println(myRectangle);

        // uses the parent setColor() method to change the rectangle's color
        myRectangle.setColor("blue");
        System.out.println(myRectangle);

        // creates a Rectangle using the Rectangle class with the constructor that specifies only the color field
        Rectangle myRectangleTwo = new Rectangle("orange");
        System.out.println(myRectangleTwo);

        // creates a Rectangle using the Shape class with the constructor that specifies only the size fields
        Shape myRectangleThree = new Rectangle(2.5, 6);
        System.out.println(myRectangleThree);

        // creates a Circle using the Circle class with the constructor that specifies only the radius field
        Circle myCircle = new Circle(1);
        System.out.println(myCircle);

        // creates a Circle using the Shape class with the constructor that specifies only the color field
        Shape myCircleTwo = new Circle("red");
        System.out.println(myCircleTwo);

        // creates a Circle using the Circle class with the constructor that specifies all fields
        Circle myCircleThree = new Circle(3, "magenta");
        System.out.println(myCircleThree);
        System.out.println(myCircleThree.getColor() + "\n"); // uses getColor() method to get and print circle's color

        // creates a Square using the RegularPolygon class with the constructor that specifies only the side field
        RegularPolygon mySquare = new Square(3);
        System.out.println(mySquare);

        // creates a Square using the Rectangle class with the constructor that specifies only the color field
        Rectangle mySquareTwo = new Square("red"); // this works because a square "is a" rectangle.
        System.out.println(mySquareTwo);

        // creates a Square using the Shape class with the constructor that specifies all fields
        Shape mySquareThree = new Square(4.5, "yellow");
        System.out.println(mySquareThree);

        // creates a Square using the Square class with the constructor that specifies only the side field
        Square mySquareFour = new Square(5);
        System.out.println(mySquareFour);

        // creates an EquilateralTriangle using the RegularPolygon class with the constructor that specifies only the side field
        RegularPolygon myEquilateralTriangle = new EquilateralTriangle(8);
        System.out.println(myEquilateralTriangle);

        // creates an EquilateralTriangle using the Shape class with the constructor that specifies only the color field
        Shape myEquilateralTriangleTwo = new EquilateralTriangle("black");
        System.out.println(myEquilateralTriangleTwo);

        // creates an EquilateralTriangle using the EquilateralTriangle class with the constructor that specifies all fields
        EquilateralTriangle myEquilateralTriangleThree = new EquilateralTriangle(10, "brown");
        System.out.println(myEquilateralTriangleThree);

    }

}
