import Pages.RegistrationPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PracticeFormTestWithPageObjects {

     RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
    }


    String firstName = "Kirill";
    String userSubjects = "Arts";
    String fileName = "Hi.txt";
    String currentAddress = "Mogilev";
    String State = "NCR";
    String City = "Delhi";


    @Test
    void RegistrationFormTest() {
        registrationPage.openPage()
        .typeFirstName(firstName)
        .typeLastName("Krutolevich")
        .typeUserEmailInput("email@mail.ru")
        .selectUserGender()
        .typeUserNumber("9379992000");
        registrationPage.dateOfBirth();
        registrationPage.selectUserHobbies()
        .userSubjectsInput(userSubjects)
        .uploadUserPicture(fileName)
        .currentAddress(currentAddress)
        .userStateSelect()
        .userState1(State)
        .City()
        .selectCity(City)
        .Submit();
    }
}
