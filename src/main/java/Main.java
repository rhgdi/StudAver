import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> v = new ArrayList<Student>();

        StudentReader myFileReader = new StudentReader();
        myFileReader.ReadData(v, "C:\\ProgrammingProjects\\time\\StudAver\\notes3.txt");

        StudentSorter mySort = new StudentSorter();
        mySort.SortData(v);

        StudentWriter myFileWriter = new StudentWriter();
        myFileWriter.WriteData(v,"C:\\ProgrammingProjects\\time\\StudAver\\out.txt");
    }
}
