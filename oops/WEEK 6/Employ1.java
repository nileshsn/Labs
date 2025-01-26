/*4. Derive sub-classes of ContractEmployee namely HourlyEmployee & 
WeeklyEmployee with information number of hours & wages per hour, number 
of weeks & wages per week respectively & method calculateWages() to calculate 
their monthly salary. Also override getDesig () method depending on the type of 
contract employee.*/

class ContractEmploy {
    String desig;
    double salary;

    public void setDesignation(String desig) {
        this.desig = desig;
    }

    public String getDesignation() {
        return desig;
    }
}

class HourlyEmploy extends ContractEmploy {
    int hours, wagePerHour;

    HourlyEmploy(String design, int hours, int wagePerHour) {
        super.setDesignation(design);
        this.hours = hours;
        this.wagePerHour = wagePerHour;
    }

    int calculateWages() {
        return hours * wagePerHour * 30;
    }

    public String getDesignation() {
        return super.desig;
    }
}

class WeeklyEmploy extends ContractEmploy {
    int weeks, wagesPerWeek;

    WeeklyEmploy(String design, int weeks, int wagesPerWeek) {
        super.setDesignation(design);
        this.weeks = weeks;
        this.wagesPerWeek = wagesPerWeek;
    }

    int calculateWages() {
        return weeks * wagesPerWeek * 30;
    }

    public String getDesignation() {
        return super.desig;
    }
}

public class Employ1 {
    public static void main(String[] args) {
        HourlyEmploy he = new HourlyEmploy("Electrician", 10, 75);
        System.out.println("Hourly emp monthly salary: " + he.calculateWages());
        System.out.println("Hourly emp desig: " + he.getDesignation());
    }
}
