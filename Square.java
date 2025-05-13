public class Square extends Rectangle implements IShape  {
    int height = 5;
    int width = 5;

    public int Area() {
        return height * width;
    }
}
