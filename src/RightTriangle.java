public class RightTriangle {
//    The class should have two instance variables, base and height, both of type double.
//    Add a constructor that takes in both base and height as parameters and initializes the instance variables to those values.
//    Add a hypotenuse method that has no parameters and returns a double. This method should return the length of the hypotenuse using the Pythagorean Theorem:
//    a2  + b2 = c2, where a is base and b is height.  Use
//            c =a2+b2to find c, the hypotenuse, which gets returned by the method.
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double Hypotenuse() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height,2));
    }
}
