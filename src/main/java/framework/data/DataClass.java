package framework.data;

import org.testng.annotations.DataProvider;

import java.io.File;
import java.util.Iterator;

public class DataClass {

    public FileOperations fileOperations;
    private static final String csvFile = "src" + File.separator + "main" +
            File.separator + "java" + File.separator + "framework" + File.separator + "resources" +
            File.separator + "login.csv";

    @DataProvider(name = "login")
    public static Object[][] loginTestData() {
        return new Object[][] {{"tomsmith","SuperSecretPassword!"}};
    }

    @DataProvider(name = "loginWithCSV")
    public Iterator<Object[]> loginTestDataCsv(){
        fileOperations = new FileOperations();
        return fileOperations.parseCsvData(csvFile);
    }

}
