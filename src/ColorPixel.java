import java.util.Comparator;

public class ColorPixel extends Pixel{
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    protected int r;
    protected int g;
    protected int b;

    public ColorPixel(int x, int y, int r, int g, int b){
        super(x, y);

        if ((r < 0 || r > 255) || (g < 0 || g > 255) || (b < 0 || b > 255))
            throw new IllegalArgumentException("RGB values must be in range from 0 to 255");

        this.r = r;
        this.g = g;
        this.b = b;
    }

    public ColorPixel(int r, int g, int b){
        super(0,0);

        if ((r < 0 || r > 255) || (g < 0 || g > 255) || (b < 0 || b > 255))
            throw new IllegalArgumentException("RGB values must be in range from 0 to 255");

        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof ColorPixel other))
            return false;

        if (this.x == other.x && this.y == other.y && this.r == other.r && this.g == other.g && this.b == other.b)
            return true;
        return false;
    }

    @Override
    public String toString(){
        return String.format("[X:%d ; Y:%d ; RGB: #%02x%02x%02x]", this.x, this.y, this.r, this.g, this.b);
    }
}