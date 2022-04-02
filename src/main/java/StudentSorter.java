import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSorter implements StudentAbSorter{
    public void SortData(List<Student> v) {
        Collections.sort(v, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Float.compare(o2.getAverageScore(), o1.getAverageScore());
            }
        });
    }

}
