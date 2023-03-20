import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlanItem {

    public Date planDate;
    public String planContent;
    public String peoples = "";

    public static Date getDateFromString(String strDate){
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd")
                    .parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public PlanItem(String strDate, String planContent){
        this.planDate = getDateFromString(strDate);
        this.planContent = planContent;
    }

    public Date getDate(){
        return planDate;
    }

    public void addPeople(String name){
        peoples += name + ",";
    }

    public String getStrPlanItem() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = formatter.format(planDate);
        return strDate + "," + "\"" + planContent + "\"" + "\n";
    }


}
