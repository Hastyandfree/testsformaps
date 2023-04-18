package com.example.mapwithmarker;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
public class CarPark extends AppCompatActivity implements OnMapReadyCallback{
    public double Lat;

    public double Long;
    public int CarPark_ID;
    public LatLng CP_pos;
    public CarPark(double Latitude, double Longitude, int CP_ID){
        CP_pos = new LatLng(Latitude, Longitude);
        Lat = Latitude;
        Long = Longitude;
        CarPark_ID = CP_ID;
    }
    public void editCarPark(double Latitude, double Longitude){
        this.Lat = Latitude;
        this.Long = Longitude;
        this.CP_pos = new LatLng(Latitude, Longitude);
        //look at auto generated setters and getters  fix ID shit
    }
    public void displayMarker(@NonNull GoogleMap googleMap){
        googleMap.addMarker(new MarkerOptions()
                .position(this.CP_pos)
                .title(String.valueOf(this.CarPark_ID)));
        //use carparkID to specifcy which object
        //how to do proof of concept
    }
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        CarPark test = new CarPark(-27.4705, 153.0260, 123);
        test.displayMarker(googleMap);


    }
}
