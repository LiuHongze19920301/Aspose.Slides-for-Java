package com.aspose.slides.examples.Slides.Media;

import com.aspose.slides.HtmlFormatter;
import com.aspose.slides.HtmlOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SVGOptions;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SlideImageFormat;
import com.aspose.slides.VideoPlayerHtmlController;
import com.aspose.slides.examples.Utils;

public class ExportingMediaFilesIntoHtmlFile {

	public static void main(String[] args) {
            //ExStart:ExportingMediaFilesIntoHtmlFile

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ExportingMediaFilesIntoHtmlFile.class);

		// Loading a presentation
		Presentation pres = new Presentation(dataDir + "LineExample.pptx");
		try {
			final String path = "path";
			final String fileName = "video.html";
			final String baseUri = "http://www.example.com/";

			VideoPlayerHtmlController controller = new VideoPlayerHtmlController(path, fileName, baseUri);

			// Setting HTML options
			HtmlOptions htmlOptions = new HtmlOptions(controller);
			SVGOptions svgOptions = new SVGOptions(controller);

			htmlOptions.setHtmlFormatter(HtmlFormatter.createCustomFormatter(controller));
			htmlOptions.setSlideImageFormat(SlideImageFormat.svg(svgOptions));

			// Saving the file
			pres.save(dataDir + fileName, SaveFormat.Html, htmlOptions);
		} finally {
			if (pres != null)
				pres.dispose();
		}
            //ExEnd:ExportingMediaFilesIntoHtmlFile

	}
}
