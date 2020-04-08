package com.aspose.slides.examples.Slides.HeadersFooters;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IBaseSlide;
import com.aspose.slides.IMasterNotesSlide;
import com.aspose.slides.IShape;
import com.aspose.slides.PlaceholderType;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ManagingHeaderAndFooters {



    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ManagingHeaderAndFooters.class);

        managingHeaderAndFooters(dataDir);
    }

    //ExStart:ManagingHeaderAndFooters
    public static void managingHeaderAndFooters(String dataDir) {
        // Load Presentation
        Presentation pres = new Presentation(dataDir + "headerTest.pptx");
        try {
            // Setting Footer
            pres.getHeaderFooterManager().setAllFootersText("My Footer text");
            pres.getHeaderFooterManager().setAllFootersVisibility(true);

            // Access and Update Header
            IMasterNotesSlide masterNotesSlide = pres.getMasterNotesSlideManager().getMasterNotesSlide();
            if (null != masterNotesSlide) {
                updateHeaderFooterText(masterNotesSlide);
            }

            // Save presentation
            pres.save(dataDir + "HeaderFooterJava.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
    }

    // Method to set Header/Footer Text
    public static void updateHeaderFooterText(IBaseSlide master) {
        for (IShape shape : master.getShapes()) {
            if (shape.getPlaceholder() != null) {
                if (shape.getPlaceholder().getType() == PlaceholderType.Header) {
                    ((IAutoShape) shape).getTextFrame().setText("HI there new header");
                }
            }
        }
    }
    //ExEnd:ManagingHeaderAndFooters

}
