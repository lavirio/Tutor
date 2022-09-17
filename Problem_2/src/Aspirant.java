public class Aspirant extends Student{

    public Aspirant(String firstName, String lastName, String group) {
        super(firstName, lastName, group);
    }

    @Override
    public int getScholarship() {
        int amount;
        if (super.getAverageMark() == 5)
            amount = 200;
        else if (super.getAverageMark() > 0 && super.getAverageMark() < 5)
            amount = 180;
        else
            amount = 0;
        return amount;
    }
}
