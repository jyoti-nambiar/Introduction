package data.sources;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.File;

public class WriteDataToXls {
    public static void main(String[] args) {
        String route = "C:\\Users\\jyoti\\Documents\\TestDataSource.xls";
        try {
            File myfile = new File(route);
            WritableWorkbook writeworkbook = Workbook.createWorkbook(myfile);
            WritableSheet myWSheet = writeworkbook.createSheet("Database", 1);
            String s = "Address";
            Label mylabel = new Label(2, 3, s);
            myWSheet.addCell(mylabel);

            writeworkbook.write();
            writeworkbook.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
