package ie.ul.gamesproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ListView;
public class homeScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
    }

    public void onClickMyFavourites(View view) {
        Intent intent = new Intent(this, myFavourites.class);
        startActivity(intent);
    }



    public void onClickSearchGames(View view) {
        Intent intent = new Intent(this, SearchGames.class);
        startActivity(intent);
    }

    public void onClickRecommendedForMe(View view) {
        Intent intent = new Intent(this, recommendedForMe.class);
        startActivity(intent);

    }
}

