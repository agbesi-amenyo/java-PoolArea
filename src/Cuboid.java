public class Cuboid extends Rectangle{
    double height;


    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return this.height * getArea();
    }


    public Cuboid(double width, double length, double height) {
        super(width, length);
//        this.height = height;
        if ( height < 0 ){
            this.height= 0;
        } else {this.height = height;

        }

    }
}
