package prj1.fund.com.example.dragoonart.fundamentals_prj1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.audiofx.BassBoost;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void goSettings(MenuItem item) {
        Intent settingsMenu = new Intent(this, SettingsActivity.class);
        startActivity(settingsMenu);
    }


    public void  viewLocation(MenuItem item) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        String weatherLocation = sharedPrefs.getString(getString(R.string.perf_location_key),getString(R.string.perf_location_default));
        Uri uri = Uri.parse("geo:0,0?q="+weatherLocation);
        intent.setData(uri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }


}
