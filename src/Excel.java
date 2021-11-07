import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
    public int Column_name = 2;
    public int Column_firstName = 3;
    public int Column_vrijwilligersNummer = 4;
    //String bestandspadMonitoren = "C:\\Users\\Gebruiker\\Documents\\Kazou\\Demo.xlsx" ;
    String bestandspad = GUI.bestandspad("Monitoren");


    public static void readCell(int row, int column){
        Excel rc = new Excel();
        String type = rc.readCellType(row, column);
        switch (type){
            case "STRING":
                String text = rc.readStringCell(row, column);
                System.out.println(text);
                break;
            case "NUMERIC":
                double number  = rc.readNumericCell(row, column);
                System.out.println(number);
                break;
        }
    }
    /* readCell print de data van een cell.*/
    public String readCellType(int vRow, int vColumn) {
        String value = null;
        Workbook wb = null;
        String type = null;

        try { FileInputStream fis=new FileInputStream(bestandspad);
            wb=new XSSFWorkbook(fis);}
        catch(FileNotFoundException e)
        {e.printStackTrace();}
        catch(IOException e1)
        {e1.printStackTrace();}

        Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index
        Row row=sheet.getRow(vRow); //returns the logical row
        Cell cell=row.getCell(vColumn); //getting the cell representing the given column
        value=cell.getCellTypeEnum().name();    //getting cell value
        return value;               //returns the cell value
    }
    /* readCellType leest het type van een specifiek cell in en geeft
    deze terug als een string*/
    public String readStringCell(int vRow, int vColumn) {
        String value = null;
        Workbook wb = null;
        try { FileInputStream fis=new FileInputStream(bestandspad);
            wb=new XSSFWorkbook(fis);}
        catch(FileNotFoundException e)
        {e.printStackTrace();}
        catch(IOException e1)
        {e1.printStackTrace();}

        Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index
        Row row=sheet.getRow(vRow); //returns the logical row
        Cell cell=row.getCell(vColumn); //getting the cell representing the given column
        value=cell.getStringCellValue();    //getting cell value
        return value;               //returns the cell value
    }
    /* readStringCell leest de data van een specifiek cell in en geeft
    deze terug als een string.*/
    public double readNumericCell(int vRow, int vColumn) {
        double value = 0.0;
        Workbook wb = null;


        try { FileInputStream fis=new FileInputStream(bestandspad);
            wb=new XSSFWorkbook(fis);}
        catch(FileNotFoundException e)
        {e.printStackTrace();}
        catch(IOException e1)
        {e1.printStackTrace();}

        Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index
        Row row=sheet.getRow(vRow); //returns the logical row
        Cell cell=row.getCell(vColumn); //getting the cell representing the given column
        value = cell.getNumericCellValue();    //getting cell value
        return value;               //returns the cell value
    }
    /* readNumericCell leest de data van een specifiek cell in en geeft
    deze terug als een double.*/


    }
