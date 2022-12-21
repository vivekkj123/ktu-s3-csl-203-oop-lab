abstract class Shape{
        public abstract void numOfSides();
}
class Rectangle extends Shape{
        public void numOfSides(){
                System.out.println("No. Of Sides: 4");
        }
}
class Triangle extends Shape{
        public void numOfSides(){
                System.out.println("No. Of Sides: 3");
        }
}
class Hexagon extends Shape{
        public void numOfSides(){
                System.out.println("No. Of Sides: 7");
        }
}
class Polymorphism{
        public static void main(String [] args){
                Rectangle r = new Rectangle();
                Triangle t = new Triangle();
                Hexagon h = new Hexagon();
                r.numOfSides();
                t.numOfSides();
                h.numOfSides();
                
        }
}
