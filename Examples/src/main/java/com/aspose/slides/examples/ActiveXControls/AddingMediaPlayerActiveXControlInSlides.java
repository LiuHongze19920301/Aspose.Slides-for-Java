package com.aspose.slides.examples.ActiveXControls;

import com.aspose.slides.ControlType;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AddingMediaPlayerActiveXControlInSlides {

	public static void main(String[] args) {
                //ExStart:AddingMediaPlayerActiveXControlInSlides
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddingMediaPlayerActiveXControlInSlides.class);

		// Create empty presentation instance
		Presentation newPptx = new Presentation();

		// Adding the Media Player ActiveX control
		newPptx.getSlides().get_Item(0).getControls().addControl(ControlType.WindowsMediaPlayer, 100, 100, 400, 400);

		// Access the Media Player ActiveX control and set the video path
		newPptx.getSlides().get_Item(0).getControls().get_Item(0).getProperties().set_Item("URL", "Wildlife.wmv");

		// Save the Presentation
		newPptx.save(dataDir + "Output.pptx", SaveFormat.Pptx);

               //ExEnd:AddingMediaPlayerActiveXControlInSlides
	}

}
