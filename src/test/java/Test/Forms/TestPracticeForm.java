package Test.Forms;

import BasePage.Page;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utility.Constant.*;

public class TestPracticeForm extends Page {

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();
    }

    @Test
    public void testPracticeForm() {
        practiceform.goToPracticeForm();
        practiceform.inputFirstName(FORM_FIRST_NAME);
        practiceform.inputLastname(FORM_LAST_NAME);
        practiceform.inputEmail(FORM_EMAIL);
        practiceform.chooseGenderMale();
        practiceform.chooseGenderFemale();
        practiceform.chooseGenderOther();
        practiceform.inputNumber(FORM_NUM);
        practiceform.inputBirthDate(FORM_BIRTHDAY);
        practiceform.inputSubjects(FORM_SUBJECT);
        practiceform.clickHobbiesSport();
        practiceform.clickHobbiesReading();
        practiceform.clickHobbiesMusic();
        practiceform.uploadPicture(FORM_PATH);
        practiceform.inputCurrentAddress(FORM_CURR_ADDRESS);
        practiceform.pickState(FORM_RANDOM_STATE);
        practiceform.pickCity(FORM_RANDOM_CITY);
        practiceform.clickSubmit();

        Assert.assertTrue(practiceform.getStudentName().getText().contains(FORM_FIRST_NAME));
        Assert.assertTrue(practiceform.getStudentName().getText().contains(FORM_LAST_NAME));
        Assert.assertTrue(practiceform.getStudentEmail().getText().contains(FORM_EMAIL));
        Assert.assertTrue(practiceform.getStudentGender().getText().contains(FORM_GENDER));
        Assert.assertTrue(practiceform.getStudentMobileNumber().getText().contains(FORM_NUM));
        Assert.assertTrue(practiceform.getStudentBirthday().getText().contains(FORM_BIRTHDAY));
        Assert.assertTrue(practiceform.getStudentSubjects().getText().contains(FORM_SUBJECT));
        Assert.assertTrue(practiceform.getStudentHobbies().getText().contains(FORM_HOBBIES));
        Assert.assertTrue(practiceform.getStudentPicture().getText().contains(FORM_PICTURE));
        Assert.assertTrue(practiceform.getStudentAddress().getText().contains(FORM_CURR_ADDRESS));
        Assert.assertTrue(practiceform.getStudentStateCity().getText().contains(FORM_RANDOM_STATE));
        Assert.assertTrue(practiceform.getStudentStateCity().getText().contains(FORM_RANDOM_CITY));
    }
}
