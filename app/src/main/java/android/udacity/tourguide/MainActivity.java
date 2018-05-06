package android.udacity.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.udacity.tourguide.fragments.AKFragment;
import android.udacity.tourguide.fragments.EpcotFragment;
import android.udacity.tourguide.fragments.HollywoodFragment;
import android.udacity.tourguide.fragments.MKFragment;
import android.udacity.tourguide.fragments.MainFragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Fragment currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        if (null == savedInstanceState) {
            currentFragment = new MainFragment();
        } else {
            currentFragment = getSupportFragmentManager().getFragment(savedInstanceState,
                    getString(R.string.fragment_key));
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, currentFragment).commit();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        if (null != currentFragment) {
            getSupportFragmentManager().putFragment(outState,
                    getString(R.string.fragment_key),
                    currentFragment);
        }
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_magic_kingdom) {
            // Open Magic Kingdom Fragment
            currentFragment = new MKFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, currentFragment).commit();
        } else if (id == R.id.nav_epcot) {
            // Open Epcot fragment
            currentFragment = new EpcotFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, currentFragment).commit();

        } else if (id == R.id.nav_hollywood) {
            currentFragment = new HollywoodFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, currentFragment).commit();

        } else if (id == R.id.nav_animal) {
            currentFragment = new AKFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, currentFragment).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
