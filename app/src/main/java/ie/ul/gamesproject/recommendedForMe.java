package ie.ul.gamesproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class recommendedForMe extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommended_for_me);
    }

    public void onClickHome(View view) {
        Intent intent = new Intent(this, homeScreen.class);
        startActivity(intent);
    }
}
