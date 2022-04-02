import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class StudentReader implements StudentAbReader{
    String line = null;
    public void ReadData(List<Student> v, String filepath) {
        try {
            FileReader fileReader = new FileReader(filepath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(" ");
                v.add(new Student(arr[0], arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), Integer.parseInt(arr[4])));
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
