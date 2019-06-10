package data.sources;

import jxl.Sheet;
import jxl.Workbook;

import java.io.File;
import java.io.FileInputStream;

public class ReadDataFromXls {


    public static void main(String[] args) {
        readData();
    }


    public static void readData() {
        String pathOfTestDataFile = "C:\\Users\\jyoti\\Documents\\TestDataSource.xls";

        //Created an instance of FileInputStream and passed a File Parameter to the object
        // When Creating an object of File - Passed a string input - Path of the file in the folder structure


        try {
            File myFile = new File(pathOfTestDataFile);
            FileInputStream myFileInputStream = new FileInputStream(myFile);

            Workbook myWorkBook = Workbook.getWorkbook(myFileInputStream);


            Sheet mySheet = myWorkBook.getSheet(0);

                    // ColumnNumber, RowNumber

            System.out.println(mySheet.getCell(3, 0));
            System.out.println(mySheet.getCell(3, 0).getContents());

            int rowCount = mySheet.getRows();
            int colCount = mySheet.getColumns();

            System.out.println("Row Count is : " + rowCount);
            System.out.println("Col Count is : " + colCount);


        } catch (Exception e) {
            e.printStackTrace();
        }



    }

}
