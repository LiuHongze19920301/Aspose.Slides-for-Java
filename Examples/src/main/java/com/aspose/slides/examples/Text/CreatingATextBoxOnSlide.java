package com.aspose.slides.examples.Text;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class CreatingATextBoxOnSlide {

	public static void main(String[] args) {
                  //  ExStart:CreatingATextBoxOnSlide
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(CreatingATextBoxOnSlide.class);

		// Instantiate Presentation class that represents PPTX
		Presentation pres = new Presentation();

		// Access first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Add an AutoShape of Rectangle type
		IAutoShape ashp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 150, 75, 150, 50);

		// Add TextFrame to the Rectangle
		ashp.addTextFrame(" ");

		// Accessing the text frame
		ITextFrame txtFrame = ashp.getTextFrame();

		// Create the Paragraph object for text frame
		IParagraph para = txtFrame.getParagraphs().get_Item(0);

		// Create Portion object for paragraph
		IPortion portion = para.getPortions().get_Item(0);

		// Set Text
		portion.setText("Aspose TextBox");

		// Save the PPTX to Disk
		pres.save(dataDir + "Textbox.pptx", SaveFormat.Pptx);

              //ExEnd:CreatingATextBoxOnSlide
	}

}
