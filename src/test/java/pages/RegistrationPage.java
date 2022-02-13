package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            userGenderSelect =$("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            userHobbies = $("[for='hobbies-checkbox-1']"),
            userSubjectsInput = $("#subjectsInput"),
            uploadPicture = $("#uploadPicture"),
            userCurrentAddress = $("#currentAddress"),
            userState = $("#state"),
            userState1 = $("#react-select-3-input"),
            city = $("#city"),
            userCity = $("#react-select-4-input"),
            submit = $("#submit"),
            thanksForRegistration = $("#example-modal-sizes-title-lg"),
            resultRegistration = $(".table-responsive");

    public components.CalendarComponent CalendarComponent = new CalendarComponent();

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

    public RegistrationPage selectUserGender(String userGender) {
        userGenderSelect.$(byText(userGender)).click();

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

    public RegistrationPage  chooseCity(){
        city.click();

        return this;
    }

    public RegistrationPage selectCity (String City){
        userCity.setValue(City).pressEnter();

        return this;
    }

    public RegistrationPage submit(){
        submit.click();

        return this;
    }

    public RegistrationPage submittedForm (String submitText){
        thanksForRegistration.shouldHave(text(submitText));

        return this;
    }

    public RegistrationPage checkResult(String value) {
        resultRegistration.shouldHave(text(value));

        return this;

    }






}


