public class Musician {
  Instrument instrument;

    public Musician(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    void startPlay(){
        System.out.println("Берем в руки инструмент");
        instrument.play();
    }
}
