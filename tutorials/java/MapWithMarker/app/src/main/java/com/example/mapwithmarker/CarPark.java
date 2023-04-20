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
import java.util.ArrayList;
import java.util.List;
public class CarPark extends AppCompatActivity implements OnMapReadyCallback{
    public double Lat;
//d
    public double Long;
    public int CarPark_ID;
    public LatLng CP_pos;
    public static List<CarPark> sInstances = new ArrayList<>();
    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
    }

    public double getLong() {
        return Long;
    }

    public void setLong(double aLong) {
        Long = aLong;
    }

    public int getCarPark_ID() {
        return CarPark_ID;
    }

    public void setCarPark_ID(int carPark_ID) {
        CarPark_ID = carPark_ID;
    }

    public LatLng getCP_pos() {
        return CP_pos;
    }
    public static List<CarPark> getAllInstances() {
        return sInstances;
    }

    public void setCP_pos(LatLng CP_pos) {
        this.CP_pos = CP_pos;
    }
//    public CarPark(){
//        sInstances.add(this);
//    }

    public CarPark(double Latitude, double Longitude, int CP_ID){
        CP_pos = new LatLng(Latitude, Longitude);
        Lat = Latitude;
        Long = Longitude;
        CarPark_ID = CP_ID;
        sInstances.add(this);
    }
//    public void editCarPark(double Latitude, double Longitude){
//        this.Lat = Latitude;
//        this.Long = Longitude;
//        this.CP_pos = new LatLng(Latitude, Longitude);
//        //look at auto generated setters and getters  fix ID shit
//    }
    public void displayMarker(@NonNull GoogleMap googleMap, CarPark CP_ID){
        googleMap.addMarker(new MarkerOptions()
                .position(CP_ID.CP_pos)
                .title(String.valueOf(CP_ID.CarPark_ID)));
        //use carparkID to specifcy which object
        //how to do proof of concept
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

    }
//    @Override
//    public void onMapReady(@NonNull GoogleMap googleMap) {
//        CarPark test = new CarPark(-27.4705, 153.0260, 123);
//        test.displayMarker(googleMap);
//
//
//    }


}
