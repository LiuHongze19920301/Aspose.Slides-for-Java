package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SpecifyingDoughnutChartHoleSize {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SpecifyingDoughnutChartHoleSize.class);

        //ExStart:SpecifyingDoughnutChartHoleSize
        // Creating empty presentation
        Presentation pres = new Presentation();
        try {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Doughnut, 50, 50, 400, 400);
            chart.getChartData().getSeriesGroups().get_Item(0).setDoughnutHoleSize((byte) 90);
            pres.save(dataDir + "ChartSeries.API.DoughnutHoleSize.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SpecifyingDoughnutChartHoleSize
    }

}
