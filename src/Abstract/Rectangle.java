package Abstract;

public class Rectangle extends GraphicObject{

    @Override
    void drawSize() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    void resize() {
        System.out.println("resizing a rectangle");
    }
}
