package com.aspose.slides.examples.Slides.Shapes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.aspose.slides.Presentation;
import com.aspose.slides.ShapeThumbnailBounds;
import com.aspose.slides.examples.Utils;

public class GeneratingAShapeThumbnailInTheBoundsOfAShapesAppearance {

    public static void main(String[] args) throws IOException {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GeneratingAShapeThumbnailInTheBoundsOfAShapesAppearance.class);

        //ExStart:GeneratingAShapeThumbnailInTheBoundsOfAShapesAppearance
        // Instantiate a Presentation class that represents the presentation file
        Presentation p = new Presentation(dataDir + "Thumbnail.pptx");
        try {
            // Create a Appearance bound shape image
            BufferedImage image = p.getSlides().get_Item(0).getShapes().get_Item(0).getThumbnail(ShapeThumbnailBounds.Appearance, 1, 1);

            ImageIO.write(image, "jpeg", new File(dataDir + "PPTX_thumbnail.jpg"));
        } finally {
            if (p != null) p.dispose();
        }
        //ExEnd:GeneratingAShapeThumbnailInTheBoundsOfAShapesAppearance
    }

}
