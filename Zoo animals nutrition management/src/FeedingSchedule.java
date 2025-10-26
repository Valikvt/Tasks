import java.util.LinkedHashMap;
import java.util.Map;

public class FeedingSchedule {

    private Map<String, String> feedingTime = new LinkedHashMap<>();

    public void addFeedingTime(String time, String description){
        feedingTime.put(time, description);
    }

    public void printSchedule(){
        System.out.println("Feeding Schedule: ");
        for (Map.Entry<String, String> entry : feedingTime.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
