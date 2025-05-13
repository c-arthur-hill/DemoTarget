public class Circle {
    public int test = 2;
    public Circle contains = new Circle();
    public Square square = new Square();
    public IShape square2 = new Square();

    public int CircleArea() {
        var sq1 = square.Area();
        var sq2 = square2.Area();
        return sq1;
    }
}
