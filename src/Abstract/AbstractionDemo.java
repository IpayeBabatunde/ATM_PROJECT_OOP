package Abstract;

public class AbstractionDemo {
    public static void main(String[] args) {
        GraphicObject circle = new Circle();
        circle.drawSize();
        circle.resize();

        GraphicObject rectangle = new Rectangle();
        rectangle.drawSize();
        rectangle.resize();
    }
}
