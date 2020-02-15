package Project02;

/**
 * A class for Squares that creates Square objects with either only a side specified, with only the square's color
 * specified, or with both the side and color of the square.
 * When a Square instance is created without specifying a color, the color will default to white.
 * When a Square instance is created without specifying a side, the side will default to 1.
 * The Square object will also generate a formatted string when printing the object with all the Square's details.
 *
 * @author Mariafe Ponce
 */

public class Square extends Rectangle implements RegularPolygon {

    // CONSTRUCTORS:

    /**
     * Constructs a new instance of a Square with a side parameter specified by the user and a default color of "white"
     *
     * @param side size of side user wishes to instantiate the Square with.
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Constructs a new instance of a Square with side and color parameters specified by the user
     *
     * @param side  size of side user wishes to instantiate the Square with.
     * @param color color user wishes to instantiate the Square with.
     */
    public Square(double side, String color) {
        super(side, side, color);
    }

    /**
     * Constructs a new instance of a Square with a color parameter specified by the user and a default side of 1.
     *
     * @param color color user wishes to instantiate the Square with.
     */
    public Square(String color) {
        super(color);
    }

    /**
     * {@inheritDoc}
     *
     * @return String with square's formatted details.
     */
    @Override
    public String toString() {
        return "Shape: Square\nColor: " + this.getColor() + "\nSide: " + this.getHeight() +
                "\nArea: " + this.area() + "\nPerimeter: " + this.perimeter() + "\n";
    }
}
