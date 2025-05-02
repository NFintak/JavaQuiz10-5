package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {

    private Integer id;
    private Double amountOfHours;

    public Student() {
        this(null);
    }

    public Student(Integer id) {
        this.id = id;
        this.amountOfHours = 0.0;
    }

    public Student(Integer id, Double amountOfHours) {
        this.id = id;
        this.amountOfHours = amountOfHours;
    }

    public void learn(Double amountOfHours) {
        this.amountOfHours += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return amountOfHours;
    }
}
