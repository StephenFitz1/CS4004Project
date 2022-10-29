import java.time.LocalDateTime;

public class Meetings {
    //Plenty more to add but just to get a start

    public void createMeetings(LocalDateTime dateStartOfRange, LocalDateTime dateEndOfRange){
        //Include type of meeting, Professional, private, public meeting etc
    }

    public void inviteToMeeting(Person person){
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

    public void getPreferences(Person person){
        //Important people may be asked to state preference of location
        //For ease we'll just do two locations, office 'A' or something like that
        //and online and use 'Zoom' or whatever
    }







}
