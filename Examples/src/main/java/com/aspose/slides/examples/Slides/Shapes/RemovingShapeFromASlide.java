package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class RemovingShapeFromASlide {

	public static void main(String[] args) {
//ExStart:RemovingShapeFromASlide

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(RemovingShapeFromASlide.class);
		Presentation presentation1 = new Presentation();
		ISlide slide = presentation1.getSlides().get_Item(0);
		String alttext = "User Defined";
		int iCount = slide.getShapes().size();
		for (int i = 0; i < iCount; i++) {
			IAutoShape ashp = (IAutoShape) slide.getShapes().get_Item(0);
			if (ashp.getAlternativeText().compareTo(alttext) == 0) {
				slide.getShapes().remove(ashp);
			}
		}
		presentation1.save(dataDir + "sample_output.pptx", SaveFormat.Pptx);
//ExEnd:RemovingShapeFromASlide

	}

}
