package creational.prototype;

class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }
    @Override
    void draw() {
        System.out.println("Draw Circle");
    }
}
