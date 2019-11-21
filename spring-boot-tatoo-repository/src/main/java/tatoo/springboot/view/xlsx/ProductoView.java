package tatoo.springboot.view.xlsx;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.document.AbstractXlsxView;


import tatoo.springboot.repositorio.entity.Producto;

@Component("listarMarcas.xlsx")
public class ProductoView extends AbstractXlsxView{

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("Excel si");
		response.setHeader("Content-Disposition", "attachment; filename=\"listarProductos.xlsx\"");
		Producto producto = (Producto) model.get("productos");
		Sheet sheet = workbook.createSheet("Factura Spring");
		
		MessageSourceAccessor mensajes =  getMessageSourceAccessor();
		
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("celda1");	
		 
	}
	
	
}
