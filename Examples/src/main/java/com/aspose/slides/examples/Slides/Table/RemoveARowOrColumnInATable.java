package com.aspose.slides.examples.Slides.Table;

import com.aspose.slides.ISlide;
import com.aspose.slides.ITable;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class RemoveARowOrColumnInATable {

	public static void main(String[] args) {
	//ExStart:RemoveARowOrColumnInATable
	
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(RemoveARowOrColumnInATable.class);

		Presentation pres = new Presentation();

		ISlide slide = pres.getSlides().get_Item(0);
		double[] colWidth = { 100, 50, 30 };
		double[] rowHeight = { 30, 50, 30 };

		ITable table = slide.getShapes().addTable(100, 100, colWidth, rowHeight);

		table.getRows().removeAt(1, false);
		table.getColumns().removeAt(1, false);

		pres.save(dataDir + "TestTable.pptx", SaveFormat.Pptx);

	//ExEnd:RemoveARowOrColumnInATable
		}

}
