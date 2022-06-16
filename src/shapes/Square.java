package shapes;

public class Square extends Quadrilateral{
    @Override
    public void setLength(int length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.length = width;

    }
    public Square(){}

    public Square(double side){
        super(side,side);
    }
}
