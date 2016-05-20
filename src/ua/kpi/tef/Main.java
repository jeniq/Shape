package ua.kpi.tef;

import javax.xml.bind.SchemaOutputResolver;

public class Main {

    public static void main(String[] args) {
	    Circle shape1 = new Circle(new Point(0, 0), 2);
        Circle shape2 = shape1.clone();
        Rectangle rect1 = new Rectangle(new Point(0,0), new Point(2,2));
        Rectangle rect2 = rect1.clone();

        System.out.println(shape1.toString());
        System.out.println(shape2.toString());

        shape1.setCenterCircle(new Point(1,1));

        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println("====================================================");
        System.out.println(rect1.toString());
        System.out.println(rect2.toString());

        rect1.setLeftTop(new Point(0,2));
        rect1.setRightBottom(new Point(5,5));

        System.out.println(rect1.toString());
        System.out.println(rect2.toString());
    }
}
