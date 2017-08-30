package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.ErrorBarType;
import com.aspose.slides.ErrorBarValueType;
import com.aspose.slides.IChart;
import com.aspose.slides.IErrorBarsFormat;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AddingFixedErrorBarValueForChart {

	public static void main(String[] args) {

//ExStart:AddingFixedErrorBarValueForChart

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddingFixedErrorBarValueForChart.class);

		// Creating empty presentation
		Presentation pres = new Presentation();

		// Creating a bubble chart
		IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Bubble, 50, 50, 400, 300, true);

		// Adding Error bars and setting its format
		IErrorBarsFormat errBarX = chart.getChartData().getSeries().get_Item(0).getErrorBarsXFormat();
		IErrorBarsFormat errBarY = chart.getChartData().getSeries().get_Item(0).getErrorBarsYFormat();

		errBarX.isVisible();
		errBarY.isVisible();
		errBarX.setValueType((byte) ErrorBarValueType.Fixed);
		errBarX.setValue(0.1f);
		errBarY.setValueType((byte) ErrorBarValueType.Percentage);
		errBarY.setValue(5);
		errBarX.setType((byte) ErrorBarType.Plus);
		errBarY.getFormat().getLine().setWidth(2.0f);
		errBarX.hasEndCap();

		// Saving presentation
		pres.save(dataDir + "ErrorBars.pptx", SaveFormat.Pptx);
//ExEnd:AddingFixedErrorBarValueForChart
	}
}
