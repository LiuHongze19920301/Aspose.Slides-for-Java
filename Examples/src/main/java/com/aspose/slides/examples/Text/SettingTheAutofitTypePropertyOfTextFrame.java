package com.aspose.slides.examples.Text;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.TextAutofitType;
import com.aspose.slides.examples.Utils;

public class SettingTheAutofitTypePropertyOfTextFrame {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SettingTheAutofitTypePropertyOfTextFrame.class);

        //ExStart:SettingTheAutofitTypePropertyOfTextFrame
        // Create an instance of Presentation class
        Presentation pres = new Presentation();
        try {
            // Access the first slide
            ISlide slide = pres.getSlides().get_Item(0);

            // Add an AutoShape of Rectangle type
            IAutoShape ashp = slide.getShapes().addAutoShape(ShapeType.Rectangle, 150, 75, 350, 350);

            // Add TextFrame to the Rectangle
            ashp.addTextFrame(" ");
            ashp.getFillFormat().setFillType(FillType.NoFill);

            // Accessing the text frame
            ITextFrame txtFrame = ashp.getTextFrame();

            // Setting text autofit type

            txtFrame.getTextFrameFormat().setAutofitType(TextAutofitType.Shape);

            // Create the Paragraph object for text frame
            IParagraph para = txtFrame.getParagraphs().get_Item(0);

            // Create Portion object for paragraph
            IPortion portion = para.getPortions().get_Item(0);
            portion.setText("A quick brown fox jumps over the lazy dog. A quick brown fox jumps over the lazy dog.");
            portion.getPortionFormat().getFillFormat().setFillType(FillType.Solid);
            portion.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLACK);

            // Save Presentation
            pres.save(dataDir + "formatText.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SettingTheAutofitTypePropertyOfTextFrame
    }

}
