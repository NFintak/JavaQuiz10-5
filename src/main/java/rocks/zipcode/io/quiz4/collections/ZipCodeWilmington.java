package rocks.zipcode.io.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    private Map<Student, Double> studyMap;

    public ZipCodeWilmington(Map<Student, Double> studyMap) {
        this.studyMap = studyMap;
    }

    public ZipCodeWilmington() {
        this.studyMap = new HashMap<>();
    }

    public void enroll(Student student) {
        studyMap.put(student, student.getTotalStudyTime());
    }

    public Boolean isEnrolled(Student student) {
        return this.studyMap.containsKey(student);
    }

    public void lecture(double numberOfHours) {
        for (Map.Entry<Student, Double> entry : this.studyMap.entrySet()) {
            entry.getKey().learn(numberOfHours);
            this.studyMap.put(entry.getKey(), entry.getKey().getTotalStudyTime());
        }
    }

    public Map<Student, Double> getStudyMap() {
        return studyMap;
    }
}
