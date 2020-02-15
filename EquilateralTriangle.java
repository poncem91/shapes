package Project02;

/**
 * A class for Equilateral Triangles that creates EquilateralTriangle objects with either only their side specified,
 * with only its color specified, or with both the side and color specified.
 * When an EquilateralTriangle instance is created without specifying a color, the color will default to white.
 * When an EquilateralTriangle instance is created without specifying a side, the side will default to 1.
 * The EquilateralTriangle object will also generate a formatted string when printing the object with all of its details.
 *
 * @author Mariafe Ponce
 */

public class EquilateralTriangle extends Shape implements RegularPolygon {

    // FIELD:
    private double side; // size of side of triangle

    // CONSTRUCTORS:

    /**
     * Constructs a new instance of a EquilateralTriangle with a side parameter specified by the user and a defaul color of "white"
     *
     * @param side size of side user wishes to instantiate the EquilateralTriangle with.
     */
    public EquilateralTriangle(double side) {
        super();
        this.side = side;
    }

    /**
     * Constructs a new instance of a EquilateralTriangle with side and color parameters specified by the user.
     *
     * @param side  size of side user wishes to instantiate the EquilateralTriangle with.
     * @param color color user wishes to instantiate the EquilateralTriangle with.
     */
    public EquilateralTriangle(double side, String color) {
        super(color);
        this.side = side;
    }

    /**
     * Constructs a new instance of a EquilateralTriangle with a color parameter specified by the user and a default side of 1.
     *
     * @param color color user wishes to instantiate the EquilateralTriangle with.
     */
    public EquilateralTriangle(String color) {
        super(color);
        this.side = 1;
    }

    /**
     * {@inheritDoc}
     *
     * @return area of Equilateral Triangle
     */
    public double area() {
        return (Math.sqrt(3) / 4) * (side * side);
    }

    /**
     * {@inheritDoc}
     *
     * @return perimeter of Equilateral Triangle
     */
    public double perimeter() {
        return 3 * side;
    }

    /**
     * Gets and returns side of Equilateral Triangle
     *
     * @return side of Equilateral Triangle
     */
    public double getSide() {
        return side;
    }

    /**
     * {@inheritDoc}
     *
     * @return String with equilateral triangle's formatted details.
     */
    @Override
    public String toString() {
        return "Shape: Equilateral Triangle\nColor: " + this.getColor() + "\nSide: " + this.getSide() +
                "\nArea: " + this.area() + "\nPerimeter: " + this.perimeter() + "\n";
    }
}
