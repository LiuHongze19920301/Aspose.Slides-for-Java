package com.aspose.slides.examples.Presentation.Properties;

import com.aspose.slides.DocumentProperties;
import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.IPresentationInfo;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.examples.Utils;

public class SupportForAddingEMZFilesIntoImagesCollection {

	public static void main(String args[]) {
        //ExStart:SupportForAddingEMZFilesIntoImagesCollection
        String dataDir = Utils.getDataDir(SupportForAddingEMZFilesIntoImagesCollection.class); 
        Presentation presentation = new Presentation();
     try{
        FileInputStream imageFile = new FileInputStream(imagePath);
    try {
        IPPImage image = presentation.getImages().addImage(imageFile);
        presentation.getSlides().get_Item(0).getShapes().addPictureFrame(ShapeType.Rectangle, 0, 0, (float) presentation.getSlideSize().getSize().getWidth(), (float)               presentation.getSlideSize().getSize().getHeight(), image);
    }  finally {
        imageFile.close();
    }
    }    
     finally {
        presentation.dispose();
       }
      //ExEnd:SupportForAddingEMZFilesIntoImagesCollection
 
    }
}
