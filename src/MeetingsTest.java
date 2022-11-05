import org.testng.Assert;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeetingsTest {

    Person liam = new Person("Liam","waster", false);
    Person steve = new Person("Stephen", "Pro Tester", true);
    Person simCard = new Person("Szymon", "Pro Choocher", false);
    Person martimus = new Person("Martimus", "Mullin-g", true);
    Person boris = new Person("Boris", "Cute Russian a.k.a Блять", false);

    @Test
    void createMeetings() {

    }

    @Test
    void inviteToMeeting() {
    }

    @Test
    void returnRequirements() {
    }

    @Test
    void meetingTimePreferences() {
    }

    @org.junit.jupiter.api.Test
     void meetingPlacePreferenceTest1(){
        Assert.assertEquals(true ,steve.meetingPlacePreference(true));
    }
    @org.junit.jupiter.api.Test
    void meetingPlacePreferenceTest2(){
        Assert.assertEquals(true ,steve.meetingPlacePreference(false));
    }
    @org.junit.jupiter.api.Test
    void meetingPlacePreferenceTest3(){
        Assert.assertEquals(false ,steve.meetingPlacePreference(true));
    }
    @org.junit.jupiter.api.Test
    void meetingPlacePreferenceTest4(){
        Assert.assertEquals(false ,steve.meetingPlacePreference(false));
    }

    @Test
    void getPreferences() {
    }

    @org.junit.jupiter.api.Test
    void testCreateMeetings() {
    }

    @org.junit.jupiter.api.Test
    void testInviteToMeeting() {
    }

    @org.junit.jupiter.api.Test
    void testReturnRequirements() {
    }

    @org.junit.jupiter.api.Test
    void testMeetingTimePreferences() {
    }

    @org.junit.jupiter.api.Test
    void testGetPreferences() {
    }
}