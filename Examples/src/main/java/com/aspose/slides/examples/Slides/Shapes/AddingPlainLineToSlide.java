package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class AddingPlainLineToSlide {

	public static void main(String[] args) {

//ExStart:AddingPlainLineToSlide
			// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddingPlainLineToSlide.class);

		// Instantiate PresentationEx class that represents the PPTX file
		Presentation pres = new Presentation();

		// Get the first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Add an AutoShape of type line
		sld.getShapes().addAutoShape(ShapeType.Line, 50, 150, 300, 0);

		// Write the PPTX to Disk
		pres.save(dataDir + "LineShape1.pptx", SaveFormat.Pptx);

//ExEnd:AddingPlainLineToSlide
	}

}
