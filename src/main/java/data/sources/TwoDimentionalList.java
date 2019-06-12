package data.sources;

import jxl.Sheet;
import jxl.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class TwoDimentionalList {
    public static void main(String[] args) {
        List<String> rowData = new ArrayList<String>();

        String data = "C:\\Users\\jyoti\\Documents\\Test2.xls";
        File newFile = new File(data);
        try {
            FileInputStream newFileInput = new FileInputStream(newFile);
            Workbook myworkbook = Workbook.getWorkbook(newFileInput);
            Sheet mySheet = myworkbook.getSheet(0);
            List<List<String>> excelData = new ArrayList<List<String>>();

            for (int j = 0; j < mySheet.getRows(); j++) {

                rowData = new ArrayList<String>();

                for (int i = 0; i < mySheet.getColumns(); i++) {
                    rowData.add(mySheet.getCell(i, j).getContents());
                }
                excelData.add(rowData);

            }

            for (List<String> eData : excelData) {
                System.out.println(eData);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
