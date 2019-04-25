package sg.edu.rp.c346.sgholidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class HolidayAdapter extends ArrayAdapter<Holidays> {

    private ArrayList<Holidays> holidays;
    private Context context;
    private TextView tvHolidays;
    private ImageView ivChristmas;
    private TextView tvDate;

    public HolidayAdapter(Context context, int resource, ArrayList<Holidays> objects) {
        super(context, resource, objects);

        holidays = objects;

        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row, parent, false);


        tvHolidays = rowView.findViewById(R.id.lvHolidays);

        ivChristmas = rowView.findViewById(R.id.ivChristmas);

        tvDate = rowView.findViewById(R.id.tvDate);


        Holidays currentHoliday = holidays.get(position);



        tvDate.setText(currentHoliday.getDate());

        if (currentHoliday.isChristmas()) {
            ivChristmas.setImageResource(R.drawable.christmas);

        } else {
            ivChristmas.setImageResource(R.drawable.newyear);
        }

        return rowView;
    }


}
