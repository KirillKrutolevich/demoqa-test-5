package components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public CalendarComponent setDate(){
        $("#dateOfBirthInput").click();
        $("[class*='month-select']").selectOptionByValue("10");
        $("[class*='year-select']").selectOptionByValue("1996");
        $("[class*='datepicker__day--012']").click();

        return this;
    }




}
