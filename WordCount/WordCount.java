import java.util.Enumeration;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCount {
    public static void main(String[] args) {
        int i = 0;
        HashMap<String, Integer> stringsTable = new HashMap<>();

        File file = new File("testfile.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] ss = data.split("\\s+");

                for (int c = 0; c < ss.length; c++) {
                    i = 1;
                    if(stringsTable.containsKey(ss[c]))
                    {
                        i = stringsTable.get(ss[c]);
                        i++;
                    }
                    stringsTable.put(ss[c], i);
                }
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        //System.out.println(stringsTable);

        stringsTable.entrySet().forEach(f -> {
            System.out.println(f.getKey() + " - " + f.getValue());
        });
    }
}