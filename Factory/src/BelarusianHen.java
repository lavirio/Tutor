public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 3;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - Беларусь. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
