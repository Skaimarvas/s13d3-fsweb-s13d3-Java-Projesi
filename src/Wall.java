public class Wall {

    public static void main(String[] args) {
        Wall wall1 = new Wall(2,5);
        Wall wall2 = new Wall(-1, 10);
        System.out.println("area wall1: " + wall1.getArea());

        System.out.println("area wall2 height: " + wall2.getHeight());
        System.out.println("area wall2 width: " + wall2.getWidth());
        System.out.println("area wall2 area: " + wall2.getArea());


    }

    double width;
    double height;

    public Wall(double width, double height){
        setHeight(height);
        setWidth(width);
    }

    public double getWidth(){
      return width;
    }

    public  double getHeight(){
        return height;
    }
    public double getArea(){
        return this.height*this.width;
    }

    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;

    }

    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }
}
