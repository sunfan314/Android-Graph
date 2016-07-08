package com.example.realtimegraph;

import com.jjoe64.graphview.BarGraphView;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.GraphViewSeries;
import com.jjoe64.graphview.GraphView.GraphViewData;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.LinearLayout;

public class RealTimeGraph extends Activity {

	private final Handler mHandler = new Handler();
	private Runnable mTimer1;
	private Runnable mTimer2;
	private GraphView graphView;
	private GraphViewSeries exampleSeries;
	
	private LinearLayout layout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.graph);
		// init example series data
		exampleSeries = new GraphViewSeries(new GraphViewData[] {
				new GraphViewData(1, 2.0d),
				new GraphViewData(2, 1.5d),
				new GraphViewData(2.5, 3.0d) // another frequency
				, new GraphViewData(3, 2.5d), new GraphViewData(4, 1.0d),
				new GraphViewData(5, 3.0d) });
		graphView = new BarGraphView(this, "GraphViewDemo");
		graphView.addSeries(exampleSeries);
		layout=(LinearLayout)findViewById(R.id.graph1);
		layout.addView(graphView);
		
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

}
