package com.aspose.slides.examples.Slides.Shapes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.aspose.slides.IPPImage;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class AddingSimplePictureFramesToSlides {

	public static void main(String[] args) {
//ExStart:AddingSimplePictureFramesToSlides

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddingSimplePictureFramesToSlides.class);

		// Instantiate Presentation class that represents the PPTX
		Presentation pres = new Presentation();

		// Get the first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Instantiate the Image class
		IPPImage imgx = null;

		try {
			imgx = pres.getImages().addImage(new FileInputStream(new File(dataDir + "asp1.jpg")));
		} catch (IOException e) {
		}
		
		// Add Picture Frame with height and width equivalent of Picture
		sld.getShapes().addPictureFrame(ShapeType.Rectangle, 50, 150, imgx.getWidth(), imgx.getHeight(), imgx);

		// Write the PPTX file to disk
		pres.save(dataDir + "RectPicFrame.pptx", SaveFormat.Pptx);

	//ExEnd:AddingSimplePictureFramesToSlides
}

}
