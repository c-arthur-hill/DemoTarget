package shapes;


public class Rectangle implements IShape {
    int height = 5;
    int width = 10;
    
    public int Area() {
        return height * width;
    }
}
