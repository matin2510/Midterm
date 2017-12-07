package nyc.c4q.mustafizurmatin.midterm;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;
import android.widget.TextView;

/**
 * Created by c4q on 12/6/17.
 */

 class DoSomeTask extends AsyncTask<Integer, Integer, Integer[]> {
    private static Dialog progressDialog;
    private Context context;

    TextView textView01;




    @Override
    protected void onPreExecute() {
        //Setup precondition to execute some task
    }

    @Override
    protected Integer[] doInBackground(Integer... integers) {

        for (int i = 0; i < integers.length ; i++) {

        }

   return integers;



    }




    @Override
    protected void onProgressUpdate(Integer... progress) {
        //Update the progress of current task
        View v = (TextView) textView01.findViewById(R.id.text01);
        textView01.setText("Loops Completed");


    }

    @Override
    protected void onPostExecute(Integer[] result) {
        super.onPostExecute(result);
        DoSomeTask.progressDialog.dismiss();
        context.startActivity(new Intent(context, LoginActivity .class));





    }
}