package nyc.c4q.mustafizurmatin.midterm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

public class LoopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop);
        RecyclerView movieRecyclerView = (RecyclerView) findViewById(R.id.movie_recyclerview);

    }
}
