package com.aspose.slides.examples.Text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class ImportingHTMLTextInParagraphs {

    public static void main(String[] args) throws Exception {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ImportingHTMLTextInParagraphs.class);

        importingHTMLTextInParagraphs(dataDir);
    }

    //ExStart:ImportingHTMLTextInParagraphs
    public static void importingHTMLTextInParagraphs(String dataDir) throws IOException {

        // Create Empty presentation instance
        Presentation pres = new Presentation();
        try {
            // Access the default first slide of presentation
            ISlide slide = pres.getSlides().get_Item(0);

            // Adding the AutoShape to accommodate the HTML content
            IAutoShape ashape = slide.getShapes().addAutoShape(ShapeType.Rectangle, 10, 10, (float) pres.getSlideSize().getSize().getWidth(), (float) pres.getSlideSize().getSize().getHeight());

            ashape.getFillFormat().setFillType(FillType.NoFill);

            // Adding text frame to the shape
            ashape.addTextFrame("");

            // Clearing all paragraphs in added text frame
            ashape.getTextFrame().getParagraphs().clear();

            // Loading the HTML file using InputStream
            InputStream inputStream = new FileInputStream(dataDir + "file.html");
            Reader reader = new InputStreamReader(inputStream);

            int data = reader.read();
            String content = readFile(dataDir + "file.html");

            // Adding text from HTML stream reader in text frame
            ashape.getTextFrame().getParagraphs().addFromHtml(content);

            // Saving Presentation
            pres.save(dataDir + "output.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
    }

    public static String readFile(String FileName) throws IOException {

        File file = new File(FileName);
        StringBuilder contents = new StringBuilder();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            // repeat until all lines is read
            while ((text = reader.readLine()) != null) {
                contents.append(text).append(System.getProperty("line.separator"));
            }
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
        return contents.toString();
    }
    //ExEnd:ImportingHTMLTextInParagraphs

}
