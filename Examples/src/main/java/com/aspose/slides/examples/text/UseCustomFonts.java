package com.aspose.slides.examples.text;

import com.aspose.slides.FontsLoader;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class UseCustomFonts
{
    public static void main(String[] args)
    {
        //ExStart:UseCustomFonts
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        String[] loadFonts = new String[]{dataDir + "CustomFonts.ttf"};

        // Load the custom font directory fonts
        FontsLoader.loadExternalFonts(loadFonts);

        // Do Some work and perform presentation/slides rendering
        Presentation presentation = new Presentation(dataDir + "DefaultFonts.pptx");
        try
        {
            presentation.save(dataDir + "NewFonts_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }

        // Clear Font Cachce
        FontsLoader.clearCache();
        //ExEnd:UseCustomFonts
    }
}
