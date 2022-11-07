import java.util.ArrayList;

public class Person {

    String name;
    String title;
    boolean meetingInOffice;
    private ArrayList<Person> persons = new ArrayList<Person>();
    private int importance;

    Person(){

    }

    Person(String name, String title, boolean meetingInOffice, int importance){
        this.name = name;
        this.title = title;
        this.meetingInOffice = meetingInOffice;
    }

    public boolean meetingPlacePreference(boolean inOffice){
        if(inOffice){
            System.out.println("Meeting shall be in the office");
            return true;
        } else {
            System.out.println("Meeting shall be virtual");
        }
        return false;
    }
    public void addToPersons(Person person){
        persons.add(person);
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setMeetingInOffice(boolean meetingInOffice) {
        this.meetingInOffice = meetingInOffice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
