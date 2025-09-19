abstract class Shape {
    abstract double calculateArea();
}
  class Circle extends Shape{
    int r;
    final double pi= 3.14;

    void area(int r){
        this.r=r;
    }
      @Override
      double calculateArea(){
          return pi*r*r;
      }
  }
  class Rectangle extends Shape{
    int length;
    int width;

    void area(int length, int width){
        this.length= length;
        this.width= width;
    }
    @Override
      double calculateArea(){
        return length*width;
    }
}
  class Triangle extends Shape{
    int base;
    int height;
    void area(int base, int height){
        this.base= base;
        this.height= height;
    }
    @Override
      double calculateArea(){

        return 0.5*base*height;
    }
  }
