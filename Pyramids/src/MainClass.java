import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

public class MainClass {
    public static void main(String[] args) throws IOException {
        PyramidImp pDAO = new PyramidImp();
        List<Pyramid> pyramids =pDAO.readPyramidsfromCSV("E:\\My Study\\Artificial Intelligence\\AI-Pro Program\\S1 Foundation Semester\\1-Java & UML\\Java\\FileHandling\\build\\classes\\PyramidDAO\\pyramids.csv");
        Set<Pyramid> Pyramids = new TreeSet<>();
        Map py = new HashMap();

        for (Pyramid p:pyramids){
            Pyramids.add(p);}


        System.out.println(Pyramids);

        Map<String,Integer>CpyS=new LinkedHashMap< >();
        for (Pyramid Py:pyramids) {
            String site = Py.getSite();
            Integer count = CpyS.get(site);
            if (count ==null){count=1;}
            else {count++;}
            CpyS.put(site,count);
        }
        System.out.println(CpyS);









    }
}
