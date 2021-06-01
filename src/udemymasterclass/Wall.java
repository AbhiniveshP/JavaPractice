package udemymasterclass;

public class Wall {

    private double width, height;

    public Wall() {

    }

    public Wall(double width, double height){
        this.width = width;
        this.height = height;
        if (width < 0) this.width = 0;
        if (height < 0) this.height = 0;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width;
        if (width < 0) this.width = 0;
    }

    public void setHeight(double height) {
        this.height = height;
        if (height < 0) this.height = 0;
    }

    public double getArea() {
        return this.width * this.height;
    }

}
