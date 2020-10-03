package creational.prototype;

class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Draw Rectangle");
    }
}
