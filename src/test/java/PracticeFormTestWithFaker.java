import Pages.RegistrationPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class PracticeFormTestWithFaker {

     RegistrationPage registrationPage = new RegistrationPage();
     Faker faker = new Faker();

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
    }


    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userEmail = faker.internet().emailAddress();
    String userNumber = faker.number().digits(10);
    String currentAddress = faker.address().cityName();
    String userSubjects = "Arts";
    String fileName = "Hi.txt";
    String State = "NCR";
    String City = "Delhi";


    @Test
    void RegistrationFormTest() {
        registrationPage.openPage()
        .typeFirstName(firstName)
        .typeLastName(lastName)
        .typeUserEmailInput(userEmail)
        .selectUserGender()
        .typeUserNumber(userNumber);
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
