package oop_concepts.polimorphism.withInterface;

public class Runner {
    public static void main(String[] args) {

        Circle circle=new Circle();
        circle.draw();
        circle.fill();

        //circle=new Square();

        Square square=new Square();
        square.draw();

        //2.yol :polimorphism
        //değişkeni çok biçimli kullnamak istiyoruz.
        Shape shape=new Circle();
        shape.draw();//circle
      //  shape.fill();

        shape=new Square();
        shape.draw();//square

        //-------------------------------
        drawShape(circle);
        drawShape(square);
        drawShape(shape);


    }

    //overload
//    public static void drawShape(Circle shape){
//        shape.draw();
//    }
//
//    public static void drawShape(Square shape){//overload
//        shape.draw();
//    }

    public static void drawShape(Shape shape){//overload
        shape.draw();
    }
    //NOT:uygulamalar GELİŞİM'e AÇIK DEĞİŞİM'e KAPALI olmalı!!!



}
