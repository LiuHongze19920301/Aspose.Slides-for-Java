package com.aspose.slides.examples.charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
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


public class DoughnutChartHole
{
    public static void main(String[] args)
    {
        //ExStart:DoughnutChartHole
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        // Create an instance of Presentation class
        Presentation presentation = new Presentation();

        IChart chart = presentation.getSlides().get_Item(0).getShapes().addChart(ChartType.Doughnut, 50, 50, 400, 400);
        chart.getChartData().getSeriesGroups().get_Item(0).setDoughnutHoleSize((byte) 90);

        // Write presentation to disk
        presentation.save(dataDir + "DoughnutHoleSize_out.pptx", SaveFormat.Pptx);
        //ExEnd:DoughnutChartHole
    }
}