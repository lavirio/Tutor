public class Main {
    public static void main(String[] args) {
        Hen hen1 = new BelarusianHen();
        Hen hen2 = new MoldovanHen();
        Hen hen3 = new RussianHen();
        Hen hen4 = new UkrainianHen();

        HenFactory henFactory = new HenFactory();

        System.out.println(hen1.getCountOfEggsPerMonth());
        System.out.println(hen1.getDescription());
        System.out.println(henFactory.getHen("Belarus"));

        System.out.printf("%n");

        System.out.println(hen2.getCountOfEggsPerMonth());
        System.out.println(hen2.getDescription());
        System.out.println(henFactory.getHen("Moldova"));

        System.out.printf("%n");

        System.out.println(hen3.getCountOfEggsPerMonth());
        System.out.println(hen3.getDescription());
        System.out.println(henFactory.getHen("Russia"));

        System.out.printf("%n");

        System.out.println(hen4.getCountOfEggsPerMonth());
        System.out.println(hen4.getDescription());
        System.out.println(henFactory.getHen("Ukraine"));
    }
}
