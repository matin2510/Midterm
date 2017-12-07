package nyc.c4q.mustafizurmatin.midterm;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by c4q on 12/6/17.
 */

public class FragmentContainer extends Fragment {View rootView;

public FragmentContainer() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.activity_list,container);
        Button button = (Button) rootView.findViewById(R.id.fragment_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                android.app.FragmentManager fragmentManager = getActivity().getFragmentManager();
                android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Bundle bundle = new Bundle();
                bundle.putString("main", null);
                fragmentTransaction.replace(R.id.fragment_container_framelayout, null);
                fragmentTransaction.addToBackStack("next");
                fragmentTransaction.commit();
            }
        });
        return rootView;
    }

}
