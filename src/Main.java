public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        System.out.println(circle1.getInfo());
        circle1.setRadius(9.2);
        System.out.println(circle1.getInfo());

        Circle circle2 = new Circle(7.0);
        System.out.println(circle2.getInfo());
        circle2.setRadius(6.2);
        System.out.println(circle2.getInfo());
        RightTriangle triangle1 = new RightTriangle(3, 4);
        RightTriangle triangle2 = new RightTriangle(6.5, 10.7);
        double triangle1Hyp = triangle1.Hypotenuse();
        double triangle2Hyp = triangle2.Hypotenuse();

        RightTriangle triangle3 = new RightTriangle(5, 12);
        double triangle3Hyp = triangle3.Hypotenuse();
        System.out.println(triangle3Hyp);

        System.out.print(triangle1Hyp + "\n" + triangle2Hyp + "\n" + triangle3Hyp);

        System.out.println("This movie is " + Math.random() * 5 + " out of 5 stars");
        System.out.println("YOU GET $" + Math.random());
        System.out.println("Your phone is " + Math.random() * 100 + "% charged");

        System.out.println(Math.random() * 10);

        for (int i = 0; i < 100; i++) {
            int randomNum = (int) (Math.random() * 36) + 50;
            System.out.println(randomNum);
//        }
            LuckyNumbers luckyNumbers1 = new LuckyNumbers();
            String info = luckyNumbers1.getLuckyNumbers();
            System.out.println(info);

            System.out.println(Math.toRadians(180));
            System.out.println(Math.log10(1000));


        }
    }
}
