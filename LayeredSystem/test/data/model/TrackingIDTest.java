package data.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrackingIDTest {

    @Test
    public void testSaveAndCount() {
        TrackingID listOfTrackingID = new TrackingID();
        TrackingID trackingIDOne = new TrackingID();
        TrackingID trackingIDTwo = new TrackingID();
        listOfTrackingID.save(trackingIDOne);
        listOfTrackingID.save(trackingIDTwo);
        assertEquals(2, listOfTrackingID.getCount());
    }

    @Test
    public void delete() {
        TrackingID listOfTrackingID = new TrackingID();
        TrackingID trackingIDOne = new TrackingID();
        TrackingID trackingIDTwo = new TrackingID();
        listOfTrackingID.save(trackingIDOne);
        listOfTrackingID.save(trackingIDTwo);
        listOfTrackingID.delete(trackingIDOne);
        assertEquals(1, listOfTrackingID.getCount());
    }

    @Test
    public void clear() {
        TrackingID listOfTrackingID = new TrackingID();
        TrackingID trackingIDOne = new TrackingID();
        TrackingID trackingIDTwo = new TrackingID();
        listOfTrackingID.save(trackingIDOne);
        listOfTrackingID.save(trackingIDTwo);
        listOfTrackingID.deleteAll();
        assertEquals(0, listOfTrackingID.getCount());
        assertEquals(0, listOfTrackingID.getListOfTrackingId().size());
    }
}