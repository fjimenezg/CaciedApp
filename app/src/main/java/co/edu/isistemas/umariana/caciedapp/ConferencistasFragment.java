package co.edu.isistemas.umariana.caciedapp;


import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class ConferencistasFragment extends Fragment {


    public ConferencistasFragment() {
        // Required empty public constructor
    }

    private FragmentActivity myContext;
    View view;
    Button btn1,btn2,btn3,btn4,btn5;
ImageButton bmap1,bmap2,bmap3,bmap4,bmap5;

    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view= inflater.inflate(R.layout.fragment_conferencistas, container, false);

       btn1 = (Button) view.findViewById(R.id.bvm1);
       btn2 = (Button) view.findViewById(R.id.bvm2);
       btn3 = (Button) view.findViewById(R.id.bvm3);
       btn4 = (Button) view.findViewById(R.id.bvm4);
       btn5 = (Button) view.findViewById(R.id.bvm5);
        bmap1 = (ImageButton) view.findViewById(R.id.bmap1);
        bmap2 = (ImageButton) view.findViewById(R.id.bmap2);
        bmap3 = (ImageButton) view.findViewById(R.id.bmap3);
        bmap4 = (ImageButton) view.findViewById(R.id.bmap4);
        bmap5 = (ImageButton) view.findViewById(R.id.bmap5);




       btn1.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
               cargarDatos(R.drawable.jorgevillalobos,R.string.jv,R.string.formacionjv,R.string.conferenciajv,R.string.areajv,R.string.programajv,R.string.asojv);
           }
       });
       btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cargarDatos(R.drawable.luiseduardo,R.string.lp,R.string.formacionlp,R.string.conferencialp,R.string.arealp,R.string.programalp,R.string.asolp);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cargarDatos(R.drawable.juans,R.string.eh,R.string.formacioneh,R.string.conferenciaeh,R.string.areaeh,R.string.programaeh,R.string.asoeh);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cargarDatos(R.drawable.manuelortega,R.string.mo,R.string.formacionmo,R.string.conferenciamo,R.string.areamo,R.string.programamo,R.string.asomo);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                  cargarDatos(R.drawable.hugoordo,R.string.ho,R.string.formacionho,R.string.conferenciaho,R.string.areaho,R.string.programaho,R.string.asoho);
            }
        });

        bmap1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,MapaLugFragment.class);
                miIntent.putExtra("lugar",3);
                miIntent.putExtra("titulo_l","Auditorio LUIS SANTANDER - Universidad de Nariño");
                miIntent.putExtra("titulo_n",getResources().getString(R.string.jv));
                miIntent.putExtra("titulo_c",getResources().getString(R.string.tconferenciajv));
                miIntent.putExtra("hora_c",getResources().getString(R.string.horajv));
                startActivity(miIntent);
            }
        });

        bmap2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,MapaLugFragment.class);
                miIntent.putExtra("lugar",2);
                miIntent.putExtra("titulo_l","Auditorio SAN FRANCISCO - I.U. CESMAG");
                miIntent.putExtra("titulo_n",getResources().getString(R.string.lp));
                miIntent.putExtra("titulo_c",getResources().getString(R.string.tconferencialp));
                miIntent.putExtra("hora_c",getResources().getString(R.string.horalp));
                startActivity(miIntent);
            }
        });
        bmap3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,MapaLugFragment.class);
                miIntent.putExtra("lugar",2);
                miIntent.putExtra("titulo_l","Auditorio SAN FRANCISCO - I.U. CESMAG");
                miIntent.putExtra("titulo_n",getResources().getString(R.string.eh));
                miIntent.putExtra("titulo_c",getResources().getString(R.string.tconferenciaeh));
                miIntent.putExtra("hora_c",getResources().getString(R.string.horaeh));
                startActivity(miIntent);
            }
        });
        bmap4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,MapaLugFragment.class);
                miIntent.putExtra("lugar",1);
                miIntent.putExtra("titulo_l","Auditorio Madre Caridad - Universidad Mariana");
                miIntent.putExtra("titulo_n",getResources().getString(R.string.mo));
                miIntent.putExtra("titulo_c",getResources().getString(R.string.tconferenciamo));
                miIntent.putExtra("hora_c",getResources().getString(R.string.horamo));
                startActivity(miIntent);
            }
        });
        bmap5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,MapaLugFragment.class);
                miIntent.putExtra("lugar",3);
                miIntent.putExtra("titulo_l","Auditorio LUIS SANTANDER - Universidad de Nariño");
                miIntent.putExtra("titulo_n",getResources().getString(R.string.ho));
                miIntent.putExtra("titulo_c",getResources().getString(R.string.tconferenciaho));
                miIntent.putExtra("hora_c",getResources().getString(R.string.horaho));
                startActivity(miIntent);
            }
        });

        return view;
    }

public void cargarDatos(int imagen,int name,int formac,int conf,int area,int programa,int aso){
    AlertDialog.Builder uBuilder = new AlertDialog.Builder(ConferencistasFragment.super.getContext());
    View aView = getLayoutInflater().inflate(R.layout.activity_ponentestatico, null);
    uBuilder.setView(aView);
    final AlertDialog dialog = uBuilder.create();
    dialog.show();
    //TextView formacion=(TextView) aView.findViewById(R.id.formacion);
    WebView formacion=(WebView) aView.findViewById(R.id.formacion);
    TextView nombre=(TextView) aView.findViewById(R.id.nombre);
    //TextView conferencia=(TextView)aView.findViewById(R.id.conferencia);
    WebView conferencia=(WebView)aView.findViewById(R.id.conferencia);
    //TextView areas=(TextView) aView.findViewById(R.id.areas);
    WebView areas=(WebView)aView.findViewById(R.id.areas);
    //TextView progra=(TextView) aView.findViewById(R.id.programas);
    WebView progra=(WebView)aView.findViewById(R.id.programas);
    //TextView asociaciones=(TextView) aView.findViewById(R.id.asociacion);
    WebView asociaciones=(WebView)aView.findViewById(R.id.asociacion);
    ImageView img=(ImageView) aView.findViewById(R.id.ponente);
    Button cerrar = (Button) aView.findViewById(R.id.close);
    cerrar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            dialog.cancel();
        }
    });
    img.setImageResource(imagen);
    nombre.setText(name);

    //formacion.setText(formac);
    formacion.loadData(getResources().getString(formac), "text/html","utf-8");
    formacion.setBackgroundColor(Color.TRANSPARENT);

    //conferencia.setText(conf);
    conferencia.loadData(getResources().getString(conf), "text/html","utf-8");
    conferencia.setBackgroundColor(Color.TRANSPARENT);

    //areas.setText(area);
    areas.loadData(getResources().getString(area), "text/html","utf-8");
    areas.setBackgroundColor(Color.TRANSPARENT);

    //progra.setText(programa);
    progra.loadData(getResources().getString(programa), "text/html","utf-8");
    progra.setBackgroundColor(Color.TRANSPARENT);


    //asociaciones.setText(aso);
    asociaciones.loadData(getResources().getString(aso), "text/html","utf-8");
    asociaciones.setBackgroundColor(Color.TRANSPARENT);


    if(getResources().getString(area).equals("-")){
        areas.setVisibility(aView.GONE);
        TextView tareas=(TextView) aView.findViewById(R.id.tareas);
        tareas.setVisibility(aView.GONE);
    }

    if(getResources().getString(programa).equals("-")){
        progra.setVisibility(aView.GONE);
        TextView tprogramas=(TextView) aView.findViewById(R.id.tprogramas);
        tprogramas.setVisibility(aView.GONE);
    }
    if(getResources().getString(aso).equals("-")){
        asociaciones.setVisibility(aView.GONE);
        TextView tasociacion=(TextView) aView.findViewById(R.id.tasociacion);
        tasociacion.setVisibility(aView.GONE);
    }
}


}