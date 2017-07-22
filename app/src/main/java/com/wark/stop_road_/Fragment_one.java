package com.wark.stop_road_;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;

import java.util.ArrayList;

/**
 * Created by pc on 2017-07-14.
 */

public class Fragment_one extends Fragment {
    PieChart pieChart;
    public static final int[] CHART_RED = {Color.rgb(229,10,1)};
    public static final int[] CHART_GREAE = {Color.rgb(223,223,223)};


    public Fragment_one(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.custom_one, container, false);



        pieChart = (PieChart)view.findViewById(R.id.Piechart);
        ArrayList<Entry> entries = new ArrayList<>();
        entries.add( new Entry(3600f,10));
        ArrayList<Entry> entries1 = new ArrayList<>();
        entries.add(new Entry(60f,10));



        ArrayList<String> lables = new ArrayList<>();
        lables.add("");
        lables.add("시간");

        PieDataSet dataset = new PieDataSet(entries,"휴대폰 사용시간");
        PieDataSet datacustom = new PieDataSet(entries1,"1");
        datacustom.setColors(CHART_GREAE);
        dataset.setColors(CHART_RED);
        PieData Data1 = new PieData(lables, datacustom);
        PieData Data = new PieData(lables, dataset);
        pieChart.setDescription("");//차트 설명
        pieChart.setRotationEnabled(false);//차트 돌려지는거
        pieChart.setHoleRadius(90f);//차트 크기설정
        pieChart.setCenterText("5분");//중앙 텍스트
        //pieChart.setCenterTextSize(10);//차트 텍스트 크기
        pieChart.setData(Data);//데이터를 보여줌
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}

