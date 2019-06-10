package data.sources;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class InputData {


    public static void main(String[] args) {
        inputData();

    }

    private static void inputData() {
        String route = "C:\\Users\\jyoti\\Documents\\Xlsdata1.xls";

        try {
            File myFile = new File(route);

            // Creates a writable workbook
            WritableWorkbook myworkbook = Workbook.createWorkbook(myFile);


            WritableSheet mysheet = myworkbook.createSheet("Address Data", 1);


            String data = "Address";
            Label label = new Label(5, 0, data);
            mysheet.addCell(label);

            myworkbook.write();
            myworkbook.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}


