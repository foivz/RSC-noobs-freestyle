package kap.trippleit.com.kapzivota;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class PreLogin extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.prelogin);

        Button b1 = (Button) findViewById(R.id.btnPreloginFacebook);
        Button b2 = (Button) findViewById(R.id.btnPreloginSignIn);
        Button b3 = (Button) findViewById(R.id.btnPreloginSignUp);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

        if (!Singleton.getUser_id(this).isEmpty()) {
            Intent i = new Intent("kap.trippleit.com.kapzivota.HOME");
            startActivity(i);
        }
    }

    @Override
    public void onClick(View v) {

        Intent i = null;
        switch (v.getId()) {
            case R.id.btnPreloginFacebook:
                Toast.makeText(PreLogin.this, "Not implemented :(", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnPreloginSignIn:
                i = new Intent("kap.trippleit.com.kapzivota.LOGIN");
                break;
            case R.id.btnPreloginSignUp:
                i = new Intent("kap.trippleit.com.kapzivota.REGISTRATION");
                break;
        }
        if (i != null)
            startActivity(i);
    }
}
