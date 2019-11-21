package tatoo.springboot.view.xlsx;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import tatoo.springboot.repositorio.entity.Producto;

public class crearReporte {
	
	private static final String EXTERNAL_FILE_PATH = "C:/repositorioWeb/archivosExportados/";
	public void crearLista(String nomArchivo) 
	{
		File archivoBorrar = new File(EXTERNAL_FILE_PATH+nomArchivo+".xlsx");
		if (archivoBorrar.delete()) System.out.println("Excel borrado");
	
		Workbook workbook = new XSSFWorkbook();
	    //Crea hoja nueva
	    Sheet sheet = workbook.createSheet("Hoja de datos");
	    
	    Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("celda1");
		
		try {
            //Se genera el documento
            FileOutputStream out = new FileOutputStream(new File(EXTERNAL_FILE_PATH+nomArchivo+".xlsx"));
            workbook.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public void crearProductos(String nomArchivo,List<Producto> productos )
	{
	
		Workbook workbook = new XSSFWorkbook();
	    //Crea hoja nueva
	    Sheet sheet = workbook.createSheet("Hoja de datos");
	    
	    Row row = sheet.createRow(0);
		//Cell cell = row.createCell(0);
		//cell.setCellValue("celda1");
	    row.createCell(0).setCellValue("style_number");
	    row.createCell(1).setCellValue("upc");
	    row.createCell(2).setCellValue("nombre");
	    row.createCell(3).setCellValue("talla");
	    row.createCell(4).setCellValue("color");
	    row.createCell(5).setCellValue("tipo");	   
	    row.createCell(6).setCellValue("oem");
	    
		for (int i = 0;i<productos.size();i++)
		{
			Row rows = sheet.createRow(i+1);
			//int filas = productos.size()-1;
			rows.createCell(0).setCellValue(String.valueOf(productos.get(i).getStyle_number()));
			rows.createCell(1).setCellValue(String.valueOf(productos.get(i).getUpc()));
			rows.createCell(2).setCellValue(String.valueOf(productos.get(i).getNombre()));
			rows.createCell(3).setCellValue(String.valueOf(productos.get(i).getTalla().toString()));
			rows.createCell(4).setCellValue(String.valueOf(productos.get(i).getColor().toString()));
			rows.createCell(5).setCellValue(String.valueOf(productos.get(i).getTipo().toString()));
			rows.createCell(6).setCellValue(String.valueOf(productos.get(i).getOem().toString()));
			
			
			
		}
		
		
		try {
            //Se genera el documento
            FileOutputStream out = new FileOutputStream(new File(EXTERNAL_FILE_PATH+nomArchivo+".xlsx"));
            workbook.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
   
}
