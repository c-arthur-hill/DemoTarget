package shapes;

public class ShapeBasket {
    public Circle circle = new Circle();
    public Circle circle2 = new Circle();
    public IShape circle3 = new Circle();
    public Square square = new Square();
    public IShape square2 = new Square();
    public Square square3 = new Square();
    public Rectangle rectangle = new Rectangle();
    public Shape shape = new Shape();

    public void ShapeBasket() {
       circle.Area();
       circle.Circumference();
       circle2.Area();
       circle3.Area();
       square.Area();
       square.Width();
       square2.Area();
       square3.Area();
       rectangle.Area();
       shape.Area();
    }
}
