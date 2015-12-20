package com.application.lovelybluestudio.asmpchartexample.UtilityKit;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import java.util.ArrayList;

/**
 * Created by spider1203 on 15/12/20.
 */
public class UKBarChartDiagram implements OnChartValueSelectedListener{
    BarChart m_oBarchart;
    float m_oValueTextSize;
    ArrayList<MBBarChartModel> m_oDataList;

    UKBarChartDiagram(BarChart initBarChart,ArrayList<MBBarChartModel> initDataList)
    {
        m_oBarchart = initBarChart;

        m_oDataList = initDataList;

        m_oBarchart.setOnChartValueSelectedListener(this);

        m_oBarchart.setDrawBarShadow(false);
        m_oBarchart.setDrawValueAboveBar(true);

        m_oBarchart.setDescription("");
    }

    @Override
    public void onValueSelected(Entry entry, int i, Highlight highlight) {

    }

    @Override
    public void onNothingSelected() {

    }

    public void genDiagram()
    {
        setData();
    }

    private void setData()
    {
        ArrayList<String> xVals = new ArrayList<>();

        ArrayList<BarEntry> yVals = new ArrayList<>();

        int iBarChartCount = 0;

        for (MBBarChartModel aModel: m_oDataList
             ) {

            xVals.add(aModel.xValue);

            yVals.add(new BarEntry(aModel.yValue,iBarChartCount));

            iBarChartCount++;

        }
    }
}
