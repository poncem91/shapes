package Project02;

/**
 * An abstract class for shapes that creates Shape objects with either a specified color or a default of "white,"
 * is able to set a new color for the shape, get the shape's color, can calculate the shape's area and perimeter,
 * and generates a formatted String with the shape's details.
 *
 * @author Mariafe Ponce
 */

public abstract class Shape {

    // FIELDS:
    private String color; // the color of the shape


    // CONSTRUCTORS:

    /**
     * Constructs a new instance of Shape with no parameters and a default color of "white"
     */
    public Shape() {
        this.color = "white";
    }

    /**
     * Constructs a new instance of Shape with a color String parameter specified by the user
     *
     * @param color color the user wishes to instantiate the shape to.
     */
    public Shape(String color) {
        this.color = color;
    }


    // METHODS:

    /**
     * Setter method that sets the shape's color to a user-selected color
     *
     * @param color color that user wishes to set the shape to
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter method that gets and returns the shape's color
     *
     * @return current color of the shape
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Calculates and returns the shape's area
     *
     * @return shape's area
     */
    abstract public double area();

    /**
     * Calculates and returns the shape's perimeter
     *
     * @return shape's perimeter
     */
    abstract public double perimeter();

    /**
     * Generates a nicely formatted String that includes the shape's details
     *
     * @return formatted String of shape's details
     */
    abstract public String toString();
}
