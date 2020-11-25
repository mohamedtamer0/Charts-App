package com.example.charts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;

public class RadarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radar_chart);

        RadarChart radarChart = findViewById(R.id.radarChart);

        ArrayList<RadarEntry> visitorsForFirstWeb = new ArrayList<>();
        visitorsForFirstWeb.add(new RadarEntry(420));
        visitorsForFirstWeb.add(new RadarEntry(753));
        visitorsForFirstWeb.add(new RadarEntry(833));
        visitorsForFirstWeb.add(new RadarEntry(974));
        visitorsForFirstWeb.add(new RadarEntry(284));
        visitorsForFirstWeb.add(new RadarEntry(479));
        visitorsForFirstWeb.add(new RadarEntry(875));

        RadarDataSet radarDataSetForFirstWeb = new RadarDataSet(visitorsForFirstWeb, "Web 1");
        radarDataSetForFirstWeb.setColor(Color.RED);
        radarDataSetForFirstWeb.setLineWidth(2f);
        radarDataSetForFirstWeb.setValueTextColor(Color.RED);
        radarDataSetForFirstWeb.setValueTextSize(14f);



        ArrayList<RadarEntry> visitorsForSecondtWeb = new ArrayList<>();
        visitorsForSecondtWeb.add(new RadarEntry(834));
        visitorsForSecondtWeb.add(new RadarEntry(720));
        visitorsForSecondtWeb.add(new RadarEntry(422));
        visitorsForSecondtWeb.add(new RadarEntry(121));
        visitorsForSecondtWeb.add(new RadarEntry(343));
        visitorsForSecondtWeb.add(new RadarEntry(766));
        visitorsForSecondtWeb.add(new RadarEntry(867));


        RadarDataSet radarDataSetForSecondWeb = new RadarDataSet(visitorsForSecondtWeb, "Web 2");
        radarDataSetForSecondWeb.setColor(Color.BLUE);
        radarDataSetForSecondWeb.setLineWidth(2f);
        radarDataSetForSecondWeb.setValueTextColor(Color.BLUE);
        radarDataSetForSecondWeb.setValueTextSize(14f);




        RadarData radarData = new RadarData();
        radarData.addDataSet(radarDataSetForFirstWeb);
        radarData.addDataSet(radarDataSetForSecondWeb);


        String[] labels = {"2014","2015","2016","2017","2018","2019","2020"};

        XAxis xAxis = radarChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(labels));

        radarChart.getDescription().setText("Radar Chart Example");
        radarChart.setData(radarData);




    }
}






















