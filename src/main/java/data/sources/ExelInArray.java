package data.sources;


import jxl.Sheet;
import jxl.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExelInArray {
    public static void main(String[] args) {

        datafromexcel();
    }

    private static void datafromexcel() {
        String path = "C:\\Users\\jyoti\\Documents\\TestDataSource.xls";
        File myfile = new File(path);
        try {
            FileInputStream myfileinputstream = new FileInputStream(myfile);
            Workbook myworkbook = Workbook.getWorkbook(myfileinputstream);
            Sheet mysheet = myworkbook.getSheet(0);
            int rowCount = mysheet.getRows();
            int colCount = mysheet.getColumns();

            List<String> addData = new ArrayList<String>();

            for (int i = 0; i < colCount; i++) {
                for (int j = 0; j < rowCount; j++) {
                    addData.add(mysheet.getCell(i, j).getContents());
                }
            }

            System.out.println("Printing data now");
            for (String s : addData) {
                System.out.println(s);
            }
            System.out.println("Printing data again");


            for(int k=0;k<addData.size();k++) {
//                System.out.println(addData);
                System.out.println(addData.get(k));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

