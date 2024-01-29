import com.opencsv.CSVReader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.testng.annotations.DataProvider;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


// METHOD 1 ======== USING OPEN CSV DEPENDENCY=============================
public class CustomDataProvider {
    @DataProvider(name = "twoParameterDataProvider")
    public Object[][] readTestData() throws IOException {
        String csvFile = "testdata.csv";
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            List<Object[]> testData = new ArrayList<>();
            br.readLine();
            int index = 0;
            while ((line = br.readLine()) != null) {
                String[] stringData = line.split(csvSplitBy);
                Object[] doubleData = new Object[stringData.length];
                doubleData[0]=stringData[0];
                // Convert each string to a double and store it in the double array
                for (int i = 1; i < stringData.length; i++) {
                    doubleData[i] = Double.parseDouble(stringData[i]);
                }

                testData.add(doubleData);
                index++;
            }

            return testData.toArray(new Object[0][0]);
        }
    }
    @DataProvider(name = "singleParameterDataProvider")
    public Object[][] readTestData2() throws IOException {
        String csvFile = "testdata2.csv";
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            List<Object[]> testData = new ArrayList<>();
            br.readLine();
            int index = 0;
            while ((line = br.readLine()) != null) {
                String[] stringData = line.split(csvSplitBy);
                Object[] doubleData = new Object[stringData.length];
                doubleData[0]=stringData[0];
                // Convert each string to a double and store it in the double array
                for (int i = 1; i < stringData.length; i++) {
                    doubleData[i] = Double.parseDouble(stringData[i]);
                }

                testData.add(doubleData);
                index++;
            }

            return testData.toArray(new Object[0][0]);
        }
    }

}

//// METHOD 2 ======== USING APACHE.COMMON DEPENDENCY=============================
//
//public class CustomDataProvider {
//    @DataProvider(name="twoParameterDataProvider")
//    public Object[][] readTestData() throws IOException {
//        String path = "/home/knoldus/IdeaProjects/Scientific_Calculator/testdata.csv";
//        // Create a new BufferReader object and pass the path of CSV file
//        Reader reader = Files.newBufferedReader(Paths.get(path));
//        // parse the file into csv values
////        CSVParser parse = new CSVParser(reader, CSVFormat.DEFAULT);
//        Iterable<CSVRecord> parse = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(reader);
//        int size=0;
//        for (CSVRecord csvRecord : parse) {
//            size++;
//        }
//        Object[][] testData = new Object[(int) size][3];
//
//        reader = Files.newBufferedReader(Paths.get(path));
//        parse = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(reader);
//        int index = 0;
//        for (CSVRecord csvRecord : parse) {
//
//            // Accessing Values by Column Index
//            testData[index][0] =  Double.parseDouble(csvRecord.get("operand1"));
//            testData[index][1] = Double.parseDouble(csvRecord.get("operand2"));
//            testData[index][2] = Double.parseDouble(csvRecord.get("expectedResult"));
//            index++;
//            // print the value to console
//
//        }
//        return testData;
//
//    }
//}
