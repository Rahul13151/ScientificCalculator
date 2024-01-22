import org.testng.annotations.DataProvider;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomDataProvider {
    @DataProvider(name="twoParameterDataProvider")
    public Object[][] readTestData() throws IOException {
        String csvFile = "./testdata.csv";
        String line;
        String csvSplitBy = ",";

//        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//            // Calculate the number of rows in the CSV file
//            long rowCount = br.lines().count();
//
//            // Initialize the data array
//            Object[][] testData = new Object[(int) rowCount - 1][3];
//
//            // Skip the header line
//            br.readLine();
//
//            // Read data from the CSV file and populate the testData array
//            int index = 0;
//            while ((line = br.readLine()) != null) {
//                String[] stringData = line.split(csvSplitBy);
//                Double[] doubleData = new Double[stringData.length];
//
//                // Convert each string to a double and store it in the double array
//                for (int i = 0; i < stringData.length; i++) {
//                    doubleData[i] = Double.parseDouble(stringData[i]);
//                    System.out.println(doubleData[i]);
//                }
//
//                testData[index] = doubleData;
//                index++;
//            }
//
//            return testData;
//        }

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Calculate the number of rows in the CSV file
            long rowCount = br.lines().count();

            // Initialize the data array
            Object[][] testData = new Object[(int) rowCount - 1][3];

            // Skip the header line
            br.readLine();

            // Read data from the CSV file and populate the testData array
            int index = 0;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                testData[index][0] = Double.parseDouble(data[0]);  // operand1
                testData[index][1] = Double.parseDouble(data[1]);  // operand2
                testData[index][2] = Double.parseDouble(data[2]);  // expectedResult
                index++;
            }

            return testData;
        }

    }
}
