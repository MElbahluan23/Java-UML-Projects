import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface PyramidDAO {
    List<Pyramid> readPyramidsfromCSV(String filename) throws IOException;
}
