import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;


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
    String userGender = "Male";
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
        .selectUserGender(userGender)
        .typeUserNumber(userNumber)
        .dateOfBirth()
        .selectUserHobbies()
        .userSubjectsInput(userSubjects)
        .uploadUserPicture(fileName)
        .currentAddress(currentAddress)
        .userStateSelect()
        .userState1(State)
        .chooseCity()
        .selectCity(City)
        .submit()

        .submittedForm("Thanks for submitting the form")
        .checkResult(firstName)
        .checkResult(lastName)
        .checkResult(userEmail)
        .checkResult(userGender)
        .checkResult(currentAddress)
        .checkResult(userNumber)
        .checkResult(userSubjects)
        .checkResult(fileName)
        .checkResult(State)
        .checkResult(City)
        .checkResult("12 November,1996");

    }

}
