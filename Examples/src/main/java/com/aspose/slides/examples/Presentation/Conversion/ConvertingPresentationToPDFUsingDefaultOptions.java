package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToPDFUsingDefaultOptions {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertingPresentationToPDFUsingDefaultOptions.class);

        //ExStart:ConvertingPresentationToPDFUsingDefaultOptions
        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "demo.pptx");
        try {
            // Save the presentation to PDF with default options
            pres.save(dataDir + "demoDefault.pdf", SaveFormat.Pdf);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertingPresentationToPDFUsingDefaultOptions
    }

}
