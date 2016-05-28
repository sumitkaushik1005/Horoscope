
package com.demohoroscope;

import android.R;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import java.net.*;

import android.os.Bundle;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	// String res = "sumit";
	TextView t;
	TextView t2;
	TextView t3;
	ConnectivityManager con;
	Button refresh;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12,b13;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(0x7f030001);

	//	t = (TextView) findViewById(0x7f08000c);
	//	t2=(TextView)findViewById(0x7f08000d);
	//	t2.setTextColor(Color.WHITE);
	//	t2.setTextSize(18);
		
		//t3=(TextView)findViewById(0x7f08000e);
		b1 = (Button) findViewById(0x7f080004);
		b2 = (Button) findViewById(0x7f080005);
		b3 = (Button) findViewById(0x7f080006);
		b4 = (Button) findViewById(0x7f080007);
		b5 = (Button) findViewById(0x7f080008);
		b6 = (Button) findViewById(0x7f080009);
		b7 = (Button) findViewById(0x7f08000a);
		b8 = (Button) findViewById(0x7f08000b);
		b9 = (Button) findViewById(0x7f08000c);
		b10 = (Button) findViewById(0x7f08000d);
		b11 = (Button) findViewById(0x7f08000e);
		b12 = (Button) findViewById(0x7f08000f);
		b13=(Button)findViewById(0x7f080010);
	
b13.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent("android.intent.action.ABOUTUS");
				startActivityForResult(i,-1);
			}
		});
		b1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String url = "http://www.horoscope.com/us/mobile/horoscopes/horoscope-general-daily.aspx?sign=1";
				Toast.makeText(getBaseContext(), "Please Wait...", Toast.LENGTH_LONG).show();
				Aries mt = new Aries();
				ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
				
				NetworkInfo nw=	cm.getActiveNetworkInfo();
				if(nw!=null){
				mt.execute(url);
				}else
				{
					Toast.makeText(getBaseContext(), "Not Connected", Toast.LENGTH_LONG).show();
				}

			}
		});
		b2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String url = "http://www.horoscope.com/us/mobile/horoscopes/horoscope-general-daily.aspx?sign=2";
				Toast.makeText(getBaseContext(), "Please Wait...", Toast.LENGTH_LONG).show();
				Aries mt = new Aries();
				ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
				NetworkInfo nw=	cm.getActiveNetworkInfo();
				if(nw!=null){
				mt.execute(url);
				}else
				{
					Toast.makeText(getBaseContext(), "You are not connected to internet", Toast.LENGTH_LONG).show();
				}
			}
		});
		b3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String url = "http://www.horoscope.com/us/mobile/horoscopes/horoscope-general-daily.aspx?sign=3";
				Toast.makeText(getBaseContext(), "Please Wait...", Toast.LENGTH_LONG).show();
				Aries mt = new Aries();
				ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
				NetworkInfo nw=	cm.getActiveNetworkInfo();
				if(nw!=null){
				mt.execute(url);
				}else
				{
					Toast.makeText(getBaseContext(), "You are not connected to internet", Toast.LENGTH_LONG).show();
				}
			}
		});
		b4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String url = "http://www.horoscope.com/us/mobile/horoscopes/horoscope-general-daily.aspx?sign=4";
				Toast.makeText(getBaseContext(), "Please Wait...", Toast.LENGTH_LONG).show();
				Aries mt = new Aries();
				ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
				NetworkInfo nw=	cm.getActiveNetworkInfo();
				if(nw!=null){
				mt.execute(url);
				}else
				{
					Toast.makeText(getBaseContext(), "You are not connected to internet", Toast.LENGTH_LONG).show();
				}
			}
		});
		b5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String url = "http://www.horoscope.com/us/mobile/horoscopes/horoscope-general-daily.aspx?sign=5";
				Toast.makeText(getBaseContext(), "Please Wait...", Toast.LENGTH_LONG).show();
				Aries mt = new Aries();
				ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
				NetworkInfo nw=	cm.getActiveNetworkInfo();
				if(nw!=null){
				mt.execute(url);
				}else
				{
					Toast.makeText(getBaseContext(), "You are not connected to internet", Toast.LENGTH_LONG).show();
				}
			}
		});
		b6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String url = "http://www.horoscope.com/us/mobile/horoscopes/horoscope-general-daily.aspx?sign=6";
				Toast.makeText(getBaseContext(), "Please Wait...", Toast.LENGTH_LONG).show();
				Aries mt = new Aries();
				ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
				NetworkInfo nw=	cm.getActiveNetworkInfo();
				if(nw!=null){
				mt.execute(url);
				}else
				{
					Toast.makeText(getBaseContext(), "You are not connected to internet", Toast.LENGTH_LONG).show();
				}
			}
		});
		b7.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String url = "http://www.horoscope.com/us/mobile/horoscopes/horoscope-general-daily.aspx?sign=7";
				Toast.makeText(getBaseContext(), "Please Wait...", Toast.LENGTH_LONG).show();
				Aries mt = new Aries();
				ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
				NetworkInfo nw=	cm.getActiveNetworkInfo();
				if(nw!=null){
				mt.execute(url);
				}else
				{
					Toast.makeText(getBaseContext(), "You are not connected to internet", Toast.LENGTH_LONG).show();
				}
			}
		});
		b8.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String url = "http://www.horoscope.com/us/mobile/horoscopes/horoscope-general-daily.aspx?sign=8";
				Toast.makeText(getBaseContext(), "Please Wait...", Toast.LENGTH_LONG).show();
				Aries mt = new Aries();
				ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
				NetworkInfo nw=	cm.getActiveNetworkInfo();
				if(nw!=null){
				mt.execute(url);
				}else
				{
					Toast.makeText(getBaseContext(), "You are not connected to internet", Toast.LENGTH_LONG).show();
				}
			}
		});
		b9.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String url = "http://www.horoscope.com/us/mobile/horoscopes/horoscope-general-daily.aspx?sign=9";
				Toast.makeText(getBaseContext(), "Please Wait...", Toast.LENGTH_LONG).show();
				Aries mt = new Aries();
				ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
				NetworkInfo nw=	cm.getActiveNetworkInfo();
				if(nw!=null){
				mt.execute(url);
				}else
				{
					Toast.makeText(getBaseContext(), "You are not connected to internet", Toast.LENGTH_LONG).show();
				}
			}
		});
		b10.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String url = "http://www.horoscope.com/us/mobile/horoscopes/horoscope-general-daily.aspx?sign=10";
				Toast.makeText(getBaseContext(), "Please Wait...", Toast.LENGTH_LONG).show();
				Aries mt = new Aries();
				ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
				NetworkInfo nw=	cm.getActiveNetworkInfo();
				if(nw!=null){
				mt.execute(url);
				}else
				{
					Toast.makeText(getBaseContext(), "You are not connected to Internet", Toast.LENGTH_LONG).show();
				}
			}
		});
		b11.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String url = "http://www.horoscope.com/us/mobile/horoscopes/horoscope-general-daily.aspx?sign=11";
				Toast.makeText(getBaseContext(), "Please Wait...", Toast.LENGTH_LONG).show();
				Aries mt = new Aries();
				ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
				NetworkInfo nw=	cm.getActiveNetworkInfo();
				if(nw!=null){
				mt.execute(url);
				}else
				{
					Toast.makeText(getBaseContext(), "You are not Connected to Intenet", Toast.LENGTH_LONG).show();
				}
			}
		});
		b12.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String url = "http://www.horoscope.com/us/mobile/horoscopes/horoscope-general-daily.aspx?sign=12";
				Toast.makeText(getBaseContext(), "Please Wait...", Toast.LENGTH_LONG).show();
				Aries mt=new Aries();
				ConnectivityManager cm=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
				NetworkInfo nw=	cm.getActiveNetworkInfo();
				if(nw!=null){
				mt.execute(url);
				}else
				{
					Toast.makeText(getBaseContext(), "You are not Connected to Internet", Toast.LENGTH_LONG).show();
				}

			}
		});

	}

	

	class Aries extends AsyncTask<String, Integer, String> {
		

		protected String doInBackground(String...urls) {
			
			String res = null;
			String horoscope = null;
			try {
				URL url = new URL(urls[0]);
				InputStream ins = url.openStream();
				DataInputStream dis = new DataInputStream(ins);
				String s;
				while ((s = dis.readLine()) != null) {
					res += s;
				}

			} catch (Exception e) {

			}
			String temp = "block-horoscope-text f16 l20";
			int index1, index2;
			index1 = res.indexOf(temp) + temp.length() + 5;
			index2 = res.indexOf("</div>", index1);
			horoscope = res.substring(index1, index2);
			horoscope = horoscope.trim();
			return horoscope;
		}

		protected void onPostExecute(String result) {
		Intent i=new Intent("android.intent.action.TEST");
			i.putExtra("hor", result);
			startActivityForResult(i,-1);
		//	t.setText(result);

		}

	}

}
