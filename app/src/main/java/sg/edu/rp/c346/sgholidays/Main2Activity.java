package sg.edu.rp.c346.sgholidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ListView lvHolidays;
    TextView tvHolidays;
    TextView tvDate;
    ArrayAdapter aa;

    ArrayList<Holidays> holiday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



            lvHolidays = (ListView) this.findViewById(R.id.lvTypesOfHolidays);
            tvHolidays = (TextView) findViewById(R.id.tvHolidays);
            tvDate = (TextView) findViewById(R.id.tvDate);


            Intent i = getIntent();
            String holidays = i.getStringExtra("holiday");
            tvHolidays.setText(holidays);


        holiday = new ArrayList<Holidays>();


            holidays.equalsIgnoreCase("secular");
            holiday.add(new Holidays("Christmas's Day", true, "25 December 2019"));

            holiday.add(new Holidays("New Year's Day", false, "1 January 2019"));



        aa = new HolidayAdapter(this, R.layout.row, holiday);
            lvHolidays.setAdapter(aa);




        }


}
