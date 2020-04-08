package com.aspose.slides.examples.Slides.Rendering;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class GeneratingThumbnailFromSlide {

    public static void main(String[] args) throws IOException {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GeneratingThumbnailFromSlide.class);

        //ExStart:GeneratingThumbnailFromSlide
        // Instantiate a Presentation class that represents the presentation file
        Presentation pres = new Presentation(dataDir + "Sample.pptx");
        try {
            // Access the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Create a full scale image
            BufferedImage image = sld.getThumbnail(1f, 1f);

            // Save the image to disk in JPEG format
            ImageIO.write(image, "jpeg", new File(dataDir + "ContentBG_tnail.jpg"));
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GeneratingThumbnailFromSlide
    }

}
