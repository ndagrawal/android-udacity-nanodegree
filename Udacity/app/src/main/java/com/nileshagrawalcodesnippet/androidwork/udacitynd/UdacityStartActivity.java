package com.nileshagrawalcodesnippet.androidwork.udacitynd;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class UdacityStartActivity extends ActionBarActivity implements View.OnClickListener {

    Button bSpotifyStreamer,bBuildItBigger,bScoresApp,bLibraryApp,bXYZReader,bCapstoneApp;



    public void UIViewInitialise(){
        bSpotifyStreamer = (Button)findViewById(R.id.bSpotifyStreamer);
        bBuildItBigger = (Button)findViewById(R.id.bBuilditBiggerApp);
        bLibraryApp = (Button)findViewById(R.id.bLibraryApp);
        bXYZReader = (Button)findViewById(R.id.bXYZReaderApp);
        bScoresApp = (Button)findViewById(R.id.bScoresApp);
        bCapstoneApp = (Button)findViewById(R.id.bCapstoneApp);

        bSpotifyStreamer.setOnClickListener(this);
        bBuildItBigger.setOnClickListener(this);
        bLibraryApp.setOnClickListener(this);
        bXYZReader.setOnClickListener(this);
        bScoresApp.setOnClickListener(this);
        bCapstoneApp.setOnClickListener(this);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udacity_start);
        UIViewInitialise();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_udacity_start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bSpotifyStreamer:
                Intent spotifyStreamerStartActivity = new Intent(this,SpotifyStreamerStartActivity.class);
                startActivity(spotifyStreamerStartActivity);
                break;
            case R.id.bScoresApp:
                Intent scoresAppStartActivity = new Intent(this,ScroresAppStartActivity.class);
                startActivity(scoresAppStartActivity);
                break;
            case R.id.bLibraryApp:
                Intent libraryStartActivity = new Intent(this,LibraryAppStartActivity.class);
                startActivity(libraryStartActivity);
                break;
            case R.id.bXYZReaderApp:
                Intent xyzStartActivity = new Intent(this,XYZReaderStartActivity.class);
                startActivity(xyzStartActivity);
                break;
            case R.id.bBuilditBiggerApp:
                Intent buildItBiggerApp = new Intent(this,BuildItBiggerActivity.class);
                startActivity(buildItBiggerApp);
                break;
            case R.id.bCapstoneApp:
                Toast.makeText(this,"This button will start Capstone App !",Toast.LENGTH_SHORT);
                Intent capstoneApp = new Intent(this,CapstoneProjectStartActivity.class);
                startActivity(capstoneApp);
                break;
        }

    }
}
