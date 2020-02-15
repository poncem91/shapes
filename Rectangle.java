package Project02;

/**
 * A class for Rectangles that creates Rectangle objects with either only their width and height specified,
 * with only the rectangle's color specified, or with all parameters specified.
 * When a Rectangle instance is created without specifying a color, the color will default to white.
 * When a Rectangle instance is created without specifying a height or width, these will default to 1.
 * The Rectangle object will also generate a formatted string when printing the object with all the Square's details.
 *
 * @author Mariafe Ponce
 */

public class Rectangle extends Shape {

    // FIELDS:
    private double width; // width of the rectangle
    private double height; // height of the rectangle

    // CONSTRUCTORS:

    /**
     * Constructs a new instance of a Rectangle with only the height and width parameters specified
     * and a default color of "white"
     *
     * @param width  width the user wishes to instantiate the rectangle with.
     * @param height height the user wishes to instantiate the rectangle with.
     */
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    /**
     * Constructs a new instance of a Rectangle with height, width, and color parameters specified
     *
     * @param width  width the user wishes to instantiate the rectangle with.
     * @param height height the user wishes to instantiate the rectangle with.
     * @param color  color the user wishes to instantiate the rectangle with.
     */
    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    /**
     * Constructs a new instance of a Rectangle with the color parameter specified and a default width and height of 1
     *
     * @param color color the user wishes to instantiate the rectangle with.
     */
    public Rectangle(String color) {
        super(color);
        this.width = 1;
        this.height = 1;
    }

    /**
     * Gets the Rectangle's height
     *
     * @return Rectangle's height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Gets the Rectangle's width
     *
     * @return Rectangle's width
     */
    public double getWidth() {
        return width;
    }

    /**
     * {@inheritDoc}
     *
     * @return area of the Rectangle
     */
    @Override
    public double area() {
        return width * height;
    }

    /**
     * {@inheritDoc}
     *
     * @return perimeter of Rectangle
     */
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    /**
     * {@inheritDoc}
     *
     * @return String with rectangle's formatted details.
     */
    @Override
    public String toString() {
        return "Shape: Rectangle\nColor: " + this.getColor() + "\nWidth: " + this.getWidth() + "\nHeight: " +
                this.getHeight() + "\nArea: " + this.area() + "\nPerimeter: " + this.perimeter() + "\n";
    }
}
