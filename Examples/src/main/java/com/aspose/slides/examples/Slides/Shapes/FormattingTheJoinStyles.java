package com.aspose.slides.examples.Slides.Shapes;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.LineJoinStyle;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class FormattingTheJoinStyles {

	public static void main(String[] args) {

	//ExStart:FormattingTheJoinStyles

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(FormattingTheJoinStyles.class);

		// Instantiate Presentation class that represents the PPTX
		Presentation pres = new Presentation();

		// Get the first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Add three AutoShapes of rectangle type
		IShape shp1 = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 100, 150, 75);

		IShape shp2 = sld.getShapes().addAutoShape(ShapeType.Rectangle, 300, 100, 150, 75);

		IShape shp3 = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 250, 150, 75);

		// Set the fill color of the rectangle shape
		shp1.getFillFormat().setFillType(FillType.Solid);
		shp1.getFillFormat().getSolidFillColor().setColor(Color.BLACK);
		shp2.getFillFormat().setFillType(FillType.Solid);
		shp2.getFillFormat().getSolidFillColor().setColor(Color.BLACK);
		shp3.getFillFormat().setFillType(FillType.Solid);
		shp3.getFillFormat().getSolidFillColor().setColor(Color.BLACK);

		// Set the line width
		shp1.getLineFormat().setWidth(15);
		shp2.getLineFormat().setWidth(15);
		shp3.getLineFormat().setWidth(15);

		// Set the color of the line of rectangle
		shp1.getLineFormat().getFillFormat().setFillType(FillType.Solid);
		shp1.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.BLUE);
		shp2.getLineFormat().getFillFormat().setFillType(FillType.Solid);
		shp2.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.BLUE);
		shp3.getLineFormat().getFillFormat().setFillType(FillType.Solid);
		shp3.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.BLUE);

		// Set the Join Style
		shp1.getLineFormat().setJoinStyle(LineJoinStyle.Miter);
		shp2.getLineFormat().setJoinStyle(LineJoinStyle.Bevel);
		shp3.getLineFormat().setJoinStyle(LineJoinStyle.Round);

		// Add text to each rectangle
		((IAutoShape) shp1).getTextFrame().setText("This is Miter Join Style");
		((IAutoShape) shp2).getTextFrame().setText("This is Bevel Join Style");
		((IAutoShape) shp3).getTextFrame().setText("This is Round Join Style");

		// Write the PPTX file to disk
		pres.save(dataDir + "RectShpLnJoin.pptx", SaveFormat.Pptx);
	//ExEnd:FormattingTheJoinStyles

	}

}
