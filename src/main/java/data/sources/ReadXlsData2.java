package data.sources;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadXlsData2 {
    public static void main(String[] args) {
        readContent();

    }


    private static void readContent() {
        String path = "C:\\Users\\jyoti\\Documents\\Xlsdata.xls";

        try {
            File myFile = new File(path);
            FileInputStream myFileInput = new FileInputStream(myFile);
            Workbook myWork = Workbook.getWorkbook(myFileInput);
            Sheet mysheet = myWork.getSheet(1);

            System.out.println("The features of the cell is" + mysheet.getCell(2, 1).getContents());
            System.out.println("The total number of rows and columns are ");
            int rowCount = mysheet.getRows();
            int colCount = mysheet.getColumns();


            System.out.println(rowCount);
            System.out.println(colCount);


            for (int i = 0; i < rowCount; i++) { // for loop running on row count

                for (int j = 0; j < colCount ; j++) { // for loop running on col count
                    System.out.print( mysheet.getCell(j, i).getContents() + "\t");
                }
                System.out.print("\n");
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }




        /*
        To write data to the excel sheet
        Work Book instance should be writable workbook --> WritableWorkbook

         */


    }
}
