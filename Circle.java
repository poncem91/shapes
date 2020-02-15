package Project02;

/**
 * A class for Circles that creates Circle objects with either only their radius specified, with only its color
 * specified, or with both the radius and color specified.
 * When a Circle instance is created without specifying a color, the color will default to white.
 * When a Circle instance is created without specifying a radius, the radius will default to 1.
 * The Circle object will also generate a formatted string when printing the object with all the Circle's details.
 *
 * @author Mariafe Ponce
 */

public class Circle extends Shape {

    // FIELD:
    private double radius; // the radius of the circle

    // CONSTRUCTORS:

    /**
     * Constructs a new instance of a Circle with a radius parameter specified by the user and a default color of "white"
     *
     * @param radius radius user wishes to instantiate the Circle with.
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Constructs a new instance of a Circle with radius and color parameters specified by the user
     *
     * @param radius radius user wishes to instantiate the Circle with.
     * @param color  color user wishes to instantiate the Circle with.
     */
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    /**
     * Constructs a new instance of a Circle with a color parameters specified by the user and a default radius of 1.
     *
     * @param color color user wishes to instantiate the Circle with.
     */
    public Circle(String color) {
        super(color);
        this.radius = 1;
    }

    /**
     * Gets and returns the Circle's radius.
     *
     * @return radius of circle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * {@inheritDoc}
     *
     * @return area of circle.
     */
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * {@inheritDoc}
     *
     * @return circumference of circle
     */
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * {@inheritDoc}
     *
     * @return String with circle's formatted details.
     */
    @Override
    public String toString() {
        return "Shape: Circle\nColor: " + this.getColor() + "\nRadius: " + this.getRadius() +
                "\nArea: " + this.area() + "\nCircumference: " + this.perimeter() + "\n";
    }
}
