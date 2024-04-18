package Abstract;

public class Circle extends GraphicObject{
    @Override
    void drawSize() {
        System.out.println("Drawing a circle");

    }

    @Override
    void resize() {
        System.out.println("Resizing a circle");

    }
}
