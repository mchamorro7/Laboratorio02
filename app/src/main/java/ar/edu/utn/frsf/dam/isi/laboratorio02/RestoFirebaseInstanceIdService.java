package ar.edu.utn.frsf.dam.isi.laboratorio02;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.preference.PreferenceManager;

import com.google.firebase.iid.FirebaseInstanceIdService;

public class RestoFirebaseInstanceIdService extends FirebaseInstanceIdService {
    public RestoFirebaseInstanceIdService() {
    }
    /*@Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }*/
    public void onTokenRefresh(){

    }
    private void guardarToken(String _token){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("registration_id", _token); editor.apply();
    }

    private String leerToken(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        return preferences.getString("registration_id", null);
    }



}
