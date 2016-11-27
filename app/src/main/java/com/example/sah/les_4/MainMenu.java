package com.example.sah.les_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MainMenu extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.SecondActivity:
                methodSecAct();
                return true;
            case R.id.Exit:
                finishAffinity();

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void methodSecAct() {
        Intent in = new Intent(this, SecondActivity.class);
        startActivity(in);
    }
       @Override
    protected void onResume() {
        super.onResume();
        overridePendingTransition(R.anim.zoom_in, R.anim.alpha);
    }
}
