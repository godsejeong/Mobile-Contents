package com.wark.stop_road_;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;

import java.util.ArrayList;

/**
 * Created by pc on 2017-07-21.
 */

public class test extends AppCompatActivity{

    PieChart pieChart;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_one);

        //chart
        Log.d("chart", "asdf");
        pieChart = (PieChart) findViewById(R.id.Piechart);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add( new Entry(4f, 0));
        entries.add(new Entry(8f, 1));
        entries.add(new Entry(6f, 2));
        entries.add(new Entry(12f, 3));
        entries.add( new Entry(18f, 4));
        entries.add( new Entry(9f, 5));



        ArrayList<String> lables = new ArrayList<>();
        lables.add("A");
        lables.add("B");
        lables.add("C");
        lables.add("D");
        lables.add("E");
        lables.add("F");
        PieDataSet dataset = new PieDataSet(entries,"Asd");
        PieData Data = new PieData(lables, dataset);
        pieChart.setDescription("xfdsd");//차트 설명
        pieChart.setRotationEnabled(true);
        pieChart.setHoleRadius(25f);
        pieChart.setCenterText("super Cool Chart");//중앙 텍스트
        pieChart.setCenterTextSize(10);
        pieChart.setData(Data);

    }

    public test(){}
}
