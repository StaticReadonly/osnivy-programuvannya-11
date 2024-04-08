public class Main {
    public static void main(String[] args) {
        IConstructorRef cnstr = Pixel::new;
        Pixel p1 = cnstr.getPixel(1,1);

        IStaticMethodRef print = Pixel::printPixel;
        print.printPixel(p1);

        IObjectMethodRef oref = p1::setX;
        oref.setX(100);

        IClassMethodRef cref = Pixel::setY;
        cref.setY(p1,200);

        print.printPixel(p1);
    }
}