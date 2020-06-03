package com.aspose.slides.examples.presentations.opening;

import com.aspose.slides.IPresentationInfo;
import com.aspose.slides.LoadFormat;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class GetFileFormat
{
    public static void main(String[] args)
    {
        //ExStart:GetFileFormat
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationOpening();
        IPresentationInfo info = PresentationFactory.getInstance().getPresentationInfo(dataDir + "HelloWorld.pptx");
        switch (info.getLoadFormat())
        {
            case LoadFormat.Pptx:
            {
                break;
            }

            case LoadFormat.Unknown:
            {
                break;
            }
        }
        //ExEnd:GetFileFormat
    }
}

