import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class PracticeFormTest {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
    }


    @Test
    void RegistrationFormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Kirill");
        $("#lastName").setValue("Krutolevich");
        $("#userEmail").setValue("email@mail.ru");
        $("[for='gender-radio-1']").click();
        $("#userNumber").setValue("9379992000");
        $("#dateOfBirthInput").click();
        $("[class*='month-select']").selectOptionByValue("10");
        $("[class*='year-select']").selectOptionByValue("1996");
        $("[class*='datepicker__day--012']").click();
        $("#subjectsInput").setValue("Arts").pressEnter();
        $("[for='hobbies-checkbox-1']").click();
        $("#uploadPicture").uploadFromClasspath("Hi.txt");
        $("#currentAddress").setValue("Mogilev");
        $("#state").click();
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#city").click();
        $("#react-select-4-input").setValue("Delhi").pressEnter();
        $("#submit").click();


    }
}
