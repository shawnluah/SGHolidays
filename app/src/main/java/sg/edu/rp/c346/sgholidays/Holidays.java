package sg.edu.rp.c346.sgholidays;

public class Holidays {

    private String holiday;
    private boolean christmas;
    private String date;
    public Holidays(String holiday, boolean christmas, String date) {
        this.holiday = holiday;
        this.christmas = christmas;
        this.date = date;
    }
    public String getHoliday() {
        return holiday;
    }
    public boolean isChristmas() {
        return christmas;
    }
    public String getDate () {
        return date;
    }

}
