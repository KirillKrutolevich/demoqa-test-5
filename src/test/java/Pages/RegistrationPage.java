package Pages;

import com.codeborne.selenide.SelenideElement;
import components.CalendarComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {


    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            userGender = $("[for=gender-radio-1]"),
            userNumberInput = $("#userNumber"),
            userHobbies = $("[for='hobbies-checkbox-1']"),
            userSubjectsInput = $("#subjectsInput"),
            uploadPicture = $("#uploadPicture"),
            userCurrentAddress = $("#currentAddress"),
            userState = $("#state"),
            userState1 = $("#react-select-3-input"),
            city = $("#city"),
            userCity = $("#react-select-4-input"),
            submit = $("#submit");

    public CalendarComponent CalendarComponent = new CalendarComponent();

    public RegistrationPage openPage() {
        open("https://demoqa.com/automation-practice-form");

        return this;
    }


    public RegistrationPage typeFirstName(String firstName) {
        firstNameInput.setValue(firstName);

        return this;
    }

    public RegistrationPage typeLastName(String lastName) {
        lastNameInput.setValue(lastName);

        return this;
    }

    public RegistrationPage typeUserEmailInput(String UserEmail) {
        userEmailInput.setValue(UserEmail);

        return this;
    }

    public RegistrationPage selectUserGender() {
        userGender.click();

        return this;
    }

    public RegistrationPage typeUserNumber(String UserNumber) {
        userNumberInput.setValue(UserNumber);

        return this;
    }

    public RegistrationPage dateOfBirth(){
        CalendarComponent.setDate();

        return this;
    }

    public RegistrationPage userSubjectsInput(String userSubjects) {
        userSubjectsInput.setValue(userSubjects).pressEnter();

        return this;
    }

    public RegistrationPage selectUserHobbies() {
        userHobbies.click();

        return this;
    }

    public RegistrationPage uploadUserPicture(String fileName) {
        uploadPicture.uploadFromClasspath(fileName);

        return this;
    }

    public RegistrationPage currentAddress(String currentAddress){
        userCurrentAddress.setValue(currentAddress);

        return this;
    }

    public RegistrationPage userStateSelect(){
        userState.click();
        return this;
    }

    public RegistrationPage userState1(String State){
        userState1.setValue("NCR").pressEnter();

        return this;
    }

    public RegistrationPage City(){
        city.click();

        return this;
    }

    public RegistrationPage selectCity (String City){
        userCity.setValue(City).pressEnter();

        return this;
    }

    public RegistrationPage Submit(){
        submit.click();

        return this;
    }





}
