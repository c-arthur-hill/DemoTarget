package shapes.inner;

import shapes.*;

public class InnerSquare {
    IShape square = new Square();
    Square square2 = new Square();

    public void InnerSquare() {
        square.Area();
        square2.Area();
    }


}
