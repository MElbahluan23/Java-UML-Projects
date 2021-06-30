import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class PyramidImp implements PyramidDAO{


    @Override
    public List<Pyramid> readPyramidsfromCSV(String filename) throws IOException {
        FileReader r = new FileReader(filename);
        BufferedReader br = new BufferedReader(r);
        List<Pyramid> lst=new ArrayList<>();
        String line=br.readLine();

        do{
            line=br.readLine();
            if (line!=null){
                String[] pyramids = line.split(",");

                if (pyramids[7].length()==0){
                    Pyramid p = new Pyramid(pyramids[0], pyramids[2], pyramids[4],0 );
                    lst.add(p);
                }

                else{ Pyramid p = new Pyramid(pyramids[0], pyramids[2], pyramids[4],Double.parseDouble(pyramids[7]) );
                lst.add(p);
                }}}while(line!=null);


        return lst;
    }
}
