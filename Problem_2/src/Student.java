public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        if (averageMark > 5)
            System.out.println("Average mark must be less than 5");
        else if (averageMark > 0)
            this.averageMark = averageMark;
        else
            System.out.println("Average mark must be greater than 0");
    }

    public int getScholarship() {
        int amount;
        if (averageMark == 5)
            amount = 100;
        else if (averageMark > 0 && averageMark < 5)
            amount = 80;
        else
            amount = 0;
        return amount;
    }
}
