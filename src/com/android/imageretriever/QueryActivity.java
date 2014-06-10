package com.android.imageretriever;

import java.util.ArrayList;

import com.android.imageretriever.modelo.CaracteristicaFisica;
import com.android.imageretriever.modelo.Individuo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class QueryActivity extends Activity {
	
	private Spinner cabelloTamaño;
	private Spinner cabelloForma;
	private Spinner cabelloColor;
	private Spinner pielColor;
	private Spinner ojosColor;
	private String cabelloT;
	private String cabelloF;
	private String cabelloC;
	private String pielC;
	private String ojosC;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.query_activity);
		
		llenarPorDefecto();
	}
	
	protected void llenarPorDefecto(){
		
		// Cabello
		cabelloTamaño = (Spinner) findViewById(R.id.cabello_tamanio_spinner);
		llenar(cabelloTamaño, R.array.cabello_tamanio);
		cabelloTamaño.setOnItemSelectedListener(new OnItemSelectedListener() {
			
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				Toast.makeText(arg0.getContext(), "Seleccionado: " + arg0.getItemAtPosition(arg2).toString(), Toast.LENGTH_SHORT).show();
				cabelloT = arg0.getItemAtPosition(arg2).toString();
			}
			
			@Override
				public void onNothingSelected(AdapterView<?> arg0) {
			}
		});
		
		
		cabelloForma = (Spinner) findViewById(R.id.cabello_forma_spinner);
		llenar(cabelloForma, R.array.cabello_forma);
		cabelloForma.setOnItemSelectedListener(new OnItemSelectedListener() {
			
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				Toast.makeText(arg0.getContext(), "Seleccionado: " + arg0.getItemAtPosition(arg2).toString(), Toast.LENGTH_SHORT).show();
				cabelloF = arg0.getItemAtPosition(arg2).toString();
			}
			
			@Override
				public void onNothingSelected(AdapterView<?> arg0) {
			}
		});

		cabelloColor = (Spinner) findViewById(R.id.cabello_color_spinner);
		llenar(cabelloColor, R.array.cabello_color);
		cabelloColor.setOnItemSelectedListener(new OnItemSelectedListener() {
			
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				Toast.makeText(arg0.getContext(), "Seleccionado: " + arg0.getItemAtPosition(arg2).toString(), Toast.LENGTH_SHORT).show();
				cabelloC = arg0.getItemAtPosition(arg2).toString();
			}
			
			@Override
				public void onNothingSelected(AdapterView<?> arg0) {
			}
		});
		
		// Piel
		pielColor = (Spinner) findViewById(R.id.piel_color_spinner);
		llenar(pielColor, R.array.piel_color);
		pielColor.setOnItemSelectedListener(new OnItemSelectedListener() {
			
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				Toast.makeText(arg0.getContext(), "Seleccionado: " + arg0.getItemAtPosition(arg2).toString(), Toast.LENGTH_SHORT).show();
				pielC = arg0.getItemAtPosition(arg2).toString();
			}
			
			@Override
				public void onNothingSelected(AdapterView<?> arg0) {
			}
		});
		
		// Ojos
		ojosColor = (Spinner) findViewById(R.id.ojo_color_spinner);
		llenar(ojosColor, R.array.ojo_color);
		ojosColor.setOnItemSelectedListener(new OnItemSelectedListener() {
			
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				Toast.makeText(arg0.getContext(), "Seleccionado: " + arg0.getItemAtPosition(arg2).toString(), Toast.LENGTH_SHORT).show();
				ojosC = arg0.getItemAtPosition(arg2).toString();
			}
			
			@Override
				public void onNothingSelected(AdapterView<?> arg0) {
			}
		});
	}
	
	protected void llenar(Spinner spinner, int arrayValues){
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
				arrayValues, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinner.setAdapter(adapter);
	}
	
	public void consultar(View view){
		//obtenerCaracteristicas();
		Intent i = new Intent(this, ListActivity.class);
		startActivity(i);
	}
	
//	public ArrayList<String> obtenerCaracteristicas(){
//		ArrayList<String> caracteristicas;
//		caracteristicas.add(cabelloTamaño.);
//		return caracteristicas;
//	}

}
