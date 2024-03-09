// If /else/elseif statements - 1
// Scrivere un programma che stampi i numeri da 1 a 100. Per i multipli di 3 stampi "Fizz" al posto del numero e per i multipli di 5 stampi "Buzz".
// Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".

import java.lang.reflect.Constructor;

public class Esercizio15 {
    public static void main (String[] args) {
        Circle myCircle = new Circle (10, 10);
        System.out.println("PRIMA\n" +
                            "X: " + myCircle.getX () +
                            "\nY: " + myCircle.getY ());
        moveCircle(myCircle, 23, 56);
        System.out.println("DOPO\n" +
                            "X: " + myCircle.getX () +
                            "\nY: " + myCircle.getY ());
    }

    public static void moveCircle(Circle circle, int deltaX, int deltaY) {
        // code to move origin of circle to x+deltaX, y+deltaY
        circle.setX(circle.getX() + deltaX);
        circle.setY(circle.getY() + deltaY);

        // code to assign a new reference to circle
        circle = new Circle(0, 0);
        System.out.println("DURANTE\n" +
                "X: " + circle.getX () +
                "\nY: " + circle.getY ());
    }

    public static class Circle {
        private int x = 0;
        private int y = 0;

        public Circle (int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX () {
            return x;
        }

        public void setX (int x) {
            this.x = x;
        }

        public int getY () {
            return y;
        }

        public void setY (int y) {
            this.y = y;
        }
    }
}