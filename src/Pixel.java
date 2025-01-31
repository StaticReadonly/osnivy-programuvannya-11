import java.util.Comparator;

public class Pixel {
    public static void printPixel(Pixel p){
        System.out.println(p);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    protected int x;
    protected int y;

    public Pixel(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Pixel other))
            return false;

        if (this.x == other.x && this.y == other.y)
            return true;
        return false;
    }

    @Override
    public String toString(){
        return String.format("[X:%d ; Y:%d]", this.x, this.y);
    }
}