package data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrackingID {
    private List<TrackingID> listOfTrackingId = new ArrayList<>();
    private int count;
    private int id;

    public TrackingID save(TrackingID trackingID){
        if(trackingID == null) throw new IllegalArgumentException("TrackingID cannot be null");
        listOfTrackingId.add(trackingID);
        count++;
        return trackingID;
    }

    public void delete(TrackingID trackingID){
        listOfTrackingId.remove(trackingID);
        count--;
    }

    public void deleteAll(){
        listOfTrackingId.clear();
        count = 0;
    }

    public void saveALl(List<TrackingID> trackingIDS){
        for (TrackingID trackingID : trackingIDS){
            listOfTrackingId.add(trackingID);
        }
    }

    public int getCount(){
        return count;
    }

    private int getId(){
        return id;
    }

    public List<TrackingID> getListOfTrackingId(){
        return listOfTrackingId;
    }



}
