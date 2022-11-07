import java.time.LocalDateTime;
import java.util.ArrayList;

public class Meetings {
    //Plenty more to add but just to get a start
    LocalDateTime timeOfMeeting;
    private ArrayList<Meetings> meetings = new ArrayList<>();
    boolean prof, priv, pub;

    public Meetings(LocalDateTime meetingStart, ArrayList<Person> personList, boolean prof, boolean priv){
    this.prof = prof;

    this.priv = priv;

    }

    public void add(Meetings meeting){
        meetings.add(meeting);
    }

    public void cancel(Meetings meeting){
        meetings.remove(meeting);
    }

    public void createMeetings(Person person, LocalDateTime dateStartOfRange, LocalDateTime dateEndOfRange){
        //Include type of meeting, Professional, private, public meeting etc
        boolean pro, priv, pub;
    }

    public void inviteToMeeting(ArrayList<Person> person){

    }

    public void returnRequirements(){ //What devices are needed etc
    }

    /*
      For this we need to make it so there can be constraints put on the meeting
      i,e time, but also allow flexibility.
      Also needs to be able to use both formats for dates
      DD-MM-YYYY(standard) and MM-DD-YYYY(american).
      Non-privileged participants shouldn't be aware of constraints, only higher ups
       */
    public void meetingTimePreferences(Person person){
    }


    public void getPreferences(Person person, boolean inOffice){
        //Important people may be asked to state preference of location
        //For ease we'll just do two locations, office 'A' or something like that
        //and online and use 'Zoom' or whatever
    }

    //test







}
