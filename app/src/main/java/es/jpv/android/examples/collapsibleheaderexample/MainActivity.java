package es.jpv.android.examples.collapsibleheaderexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            SelectionFragment fragment = SelectionFragment.newInstance();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentContainer, fragment, "theFragment")
                    .commit();
        }
    }

    @Override
    public void onFragmentInteraction(FragmentEnum sourceFragment, Bundle data) {
        switch (sourceFragment) {
            case SELECTION:
                loadFragment(data.getInt("selectedFragment"));
                break;
            case RECYCLERVIEW:
                Toast.makeText(
                        this,
                        "You've interacted with RecyclerViewFragment",
                        Toast.LENGTH_SHORT).show();
                break;
            case PARALLAX:
                Toast.makeText(
                        this,
                        "You've interacted with ParallaxFragment",
                        Toast.LENGTH_SHORT).show();
                break;
        }

    }

    private void loadFragment(int fragmentOrdinal) {
        switch (fragmentOrdinal) {
            case 1:
                RecyclerViewFragment fragmentRV = RecyclerViewFragment.newInstance();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer, fragmentRV, "theFragment")
                        .addToBackStack(null)
                        .commit();
                break;
            case 2:
                ParallaxToolbarFragment fragmentParallax = ParallaxToolbarFragment.newInstance();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer, fragmentParallax, "theFragment")
                        .addToBackStack(null)
                        .commit();
                break;

        }
    }
}
