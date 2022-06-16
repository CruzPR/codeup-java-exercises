package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{

    protected int length;
    protected int width;

    public int getLength() {
        return length;
    }



    public abstract void setLength(int length);


    public abstract void setWidth(int width);

    public Quadrilateral(){}

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
