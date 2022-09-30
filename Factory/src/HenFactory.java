public class HenFactory {
    Hen getHen(String country){
        Hen hen = null;
        if (country.equals("Ukraine"))
           hen = new UkrainianHen();
        else if (country.equals("Moldova"))
           hen = new MoldovanHen();
        else if (country.equals("Belarus"))
            hen = new BelarusianHen();
        else if (country.equals("Russia"))
            hen = new RussianHen();
     return hen;
    }
}
