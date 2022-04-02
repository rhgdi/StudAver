import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StudentWriter implements StudentAbWriter{
    public void WriteData(List<Student> v, String filepath) {
        try(FileWriter writer = new FileWriter(filepath, false))
        {
            //FIXME: Output without spaces
            String list = Arrays.toString(v.toArray())
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", "")
                    .trim();
            writer.write(list);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
            System.out.println("Problem with file");
        }
    }
}