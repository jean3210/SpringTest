package ro.test.barbu.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class GenereazaBonService {

	public static Document genereaza(String informatie) throws Exception {
		Document document = new Document();

		PdfWriter.getInstance(document, new FileOutputStream("C:/tmp/report.pdf"));
		document.open();
		document.add(new Paragraph("table"));
		document.add(new Paragraph(new Date().toString()));
		PdfPTable table = new PdfPTable(2);

		PdfPCell cell = new PdfPCell(new Paragraph("table"));

		cell.setColspan(2);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setPadding(10.0f);
		cell.setBackgroundColor(new BaseColor(140, 221, 8));

		table.addCell(cell);
		ArrayList<String[]> row = new ArrayList<String[]>();
		String[] data = new String[2];
		data[0] = "1";
		data[1] = "2";
		String[] data1 = new String[2];
		data1[0] = "3";
		data1[1] = "4";
		row.add(data);
		row.add(data1);
		for (int i = 0; i < row.size(); i++) {
			String[] cols = row.get(i);
			for (int j = 0; j < cols.length; j++) {

				table.addCell(cols[j]);

			}

		}

		document.add(table);
		document.close();
		return document;
	}

	public static Document tiparesteBon() throws FileNotFoundException, DocumentException {
		Document document = new Document();
		// byte[] buf = new byte[1024];
		// step 1
		document = new Document();
		Paragraph p = new Paragraph();
		// step 2
		PdfWriter.getInstance(document, new FileOutputStream("bon.pdf"));
		// step 3
		document.open();
		// document.setMargins(100, 100, 100, 100);
		// step 4
		p.add("Nr. lista : " + "" + Chunk.NEWLINE);
		p.add("Nr. bon : " + "" + Chunk.NEWLINE);
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		p.add("Data bon : " + cal.get(Calendar.DAY_OF_MONTH) + " " + cal.get(Calendar.MONTH) + " "
				+ cal.get(Calendar.YEAR) + " " + Chunk.NEWLINE);
		document.add(p);
		// step 5
		document.close();
		return document;
	}

	public static File tipareste() throws Exception {
		File file = new File("itext-test.pdf");
		FileOutputStream fileout = new FileOutputStream(file);
		Document document = new Document();
		PdfWriter.getInstance(document, fileout);
		document.addAuthor("Me");
		document.addTitle("My iText Test");

		document.open();

		// Chunk chunk = new Chunk("iText Test");
		Paragraph paragraph = new Paragraph();
		paragraph.add("Hello World");
		paragraph.setAlignment(Element.ALIGN_CENTER);
		document.add(paragraph);

		document.close();

		return file;
	}
}