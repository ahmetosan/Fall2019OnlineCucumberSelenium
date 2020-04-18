package com.vytrack.step_definitions;

import com.vytrack.pages.activities.CalendarEventPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CreateCalenderEventStepDefinations {
    CalendarEventPage calendarEventPage = new CalendarEventPage();
    @Then("user clicks on create calendar event button")
    public void user_clicks_on_create_calendar_event_button() {
        System.out.println(" user clisk on create calender event button");
        calendarEventPage.clickToCreateCalendarEvent();
    }

    @Then("user enters {string} as title")
    public void user_enters_as_title(String string) {
        calendarEventPage.enterCalendarEventTitle(string);
    }

    @Then("user enters {string}  as conversation")
    public void user_enters_as_conversation(String string) {
        calendarEventPage.enterCalendarEventDescription(string);
    }
    @Then("user click on save and close button")
    public void user_click_on_save_and_close_button() {
        calendarEventPage.clickOnSaveAndClose();
    }
    @Then("user verifies that decription is {string}")
    public void user_verifies_that_decription_is(String string) {
        Assert.assertEquals(string,calendarEventPage.getGeneralInfoDescriptionText());
    }


    @Then("user verifies that title is {string}")
    public void user_verifies_that_title_is(String string) {
       Assert.assertEquals(string, calendarEventPage.getGeneralInfoTitleText());
    }


}
