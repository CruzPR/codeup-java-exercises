package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public static void main(String[] args) {

    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }


    @Override
    public void setWidth(int width) {
        this.width = width;
    }
}
