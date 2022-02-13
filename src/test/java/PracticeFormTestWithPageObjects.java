import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class PracticeFormTestWithPageObjects<sleep> {

        RegistrationPage registrationPage = new RegistrationPage();


    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
    }


    String firstName = "Kirill";
    String lastName = "Krutolevich";
    String userGender = "Male";
    String userSubjects = "Arts";
    String fileName = "Hi.txt";
    String currentAddress = "Mogilev";
    String State = "NCR";
    String City = "Delhi";


    @Test
    void RegistrationFormTest() {
        registrationPage.openPage()
        .typeFirstName(firstName)
        .typeLastName(lastName)
        .typeUserEmailInput("email@mail.ru")
        .selectUserGender(userGender)
        .typeUserNumber("9379992000");
        registrationPage.dateOfBirth();
        registrationPage.selectUserHobbies()
        .userSubjectsInput(userSubjects)
        .uploadUserPicture(fileName)
        .currentAddress(currentAddress)
        .userStateSelect()
        .userState1(State)
        . chooseCity()
        .selectCity(City)
        .submit()

        .submittedForm("Thanks for submitting the form")
        .checkResult(firstName)
        .checkResult(lastName)
        .checkResult(userGender)
        .checkResult(userSubjects)
        .checkResult(currentAddress)
        .checkResult(State)
        .checkResult(City)
        .checkResult("email@mail.ru")
        .checkResult("9379992000")
        .checkResult("12 November,1996");






    }

}
