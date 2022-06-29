package Forms;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utility.Constant.*;

public class PracticeForm {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public PracticeForm(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public void goToPracticeForm() {
        driver.navigate().to(FORM_URL);
    }

    public WebElement getFirstName() {
        return driver.findElement(FORM_FIRST_NAME_INPUT);
    }

    public WebElement getLastName() {
        return driver.findElement(FORM_LAST_NAME_INPUT);
    }

    public WebElement getEmail() {
        return driver.findElement(FORM_EMAIL_INPUT);
    }

    public WebElement getRadioMale() {
        return driver.findElement(FORM_MALE);
    }

    public WebElement getRadioFemale() {
        return driver.findElement(FORM_FEMALE);
    }

    public WebElement getRadioOther() {
        return driver.findElement(FORM_OTHER);
    }

    public WebElement getNumberInput() {
        return driver.findElement(FORM_NUMBER_INPUT);
    }

    public WebElement getBirthdayInput() {
        return driver.findElement(FORM_BIRTH_DATE_INPUT);
    }

    public WebElement getSubject() {
        return driver.findElement(FORM_SUBJECT_INPUT);
    }

    public WebElement getSportCheckBox() {
        return driver.findElement(FORM_SPORT_BUTTON);
    }

    public WebElement getReadingCheckBox() {
        return driver.findElement(FORM_READING_BUTTON);
    }

    public WebElement getMusicCheckBox() {
        return driver.findElement(FORM_MUSIC_BUTTON);
    }

    public WebElement getUploadPicture() {
        return driver.findElement(FORM_CHOOSE_PICTURE);
    }

    public WebElement getCurrAddressInput() {
        return driver.findElement(FORM_CURR_ADDRESS_INPUT);
    }

    public WebElement getState() {
        return driver.findElement(FORM_STATE);
    }

    public WebElement getCity() {
        return driver.findElement(FORM_CITY);
    }

    public WebElement getSubmit() {
        return driver.findElement(FORM_SUBMIT);
    }

    public WebElement getStudentName() {
        return driver.findElement(FORM_RESULT_STUDENT_NAME);
    }

    public WebElement getStudentEmail() {
        return driver.findElement(FORM_RESULT_STUDENT_EMAIL);
    }

    public WebElement getStudentGender() {
        return driver.findElement(FORM_RESULT_STUDENT_CHECKED);
    }

    public WebElement getStudentMobileNumber() {
        return driver.findElement(FORM_RESULT_STUDENT_MOBILE);
    }

    public WebElement getStudentBirthday() {
        return driver.findElement(FORM_RESULT_STUDENT_DATE);
    }

    public WebElement getStudentSubjects() {
        return driver.findElement(FORM_RESULT_STUDENT_SUBJECTS);
    }

    public WebElement getStudentHobbies() {
        return driver.findElement(FORM_RESULT_STUDENT_HOBBIES);
    }

    public WebElement getStudentPicture() {
        return driver.findElement(FORM_RESULT_STUDENT_PICTURE);
    }

    public WebElement getStudentAddress() {
        return driver.findElement(FORM_RESULT_STUDENT_ADDRESS);
    }

    public WebElement getStudentStateCity() {
        return driver.findElement(FORM_RESULT_STUDENT_STATE_CITY);
    }

    public void inputFirstName(String firstName) {
        getFirstName().sendKeys(firstName);
    }

    public void inputLastname(String lastName) {
        getLastName().sendKeys(lastName);
    }

    public void inputEmail(String email) {
        getEmail().sendKeys(email);
    }

    public void chooseGenderMale() {
        getRadioMale().click();
    }

    public void chooseGenderFemale() {
        getRadioFemale().click();
    }

    public void chooseGenderOther() {
        getRadioOther().click();
    }

    public void inputNumber(String number) {
        getNumberInput().sendKeys(number);
    }

    public void inputBirthDate(String date) {
        getBirthdayInput().sendKeys(Keys.chord(Keys.CONTROL, "a"), date, Keys.ENTER);
    }

    public void inputSubjects(String subject) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getSubject()).click().sendKeys(subject).sendKeys(Keys.ENTER).build().perform();
    }

    public void clickHobbiesSport() {
        getSportCheckBox().click();
    }

    public void clickHobbiesReading() {
        getReadingCheckBox().click();
    }

    public void clickHobbiesMusic() {
        getMusicCheckBox().click();
    }

    public void uploadPicture(String path) {
        getUploadPicture().sendKeys(path);
    }

    public void inputCurrentAddress(String address) {
        getCurrAddressInput().sendKeys(address);
    }

    public void pickState(String state) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getState()).click().sendKeys(state).sendKeys(Keys.ENTER).build().perform();
    }

    public void pickCity(String city) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getCity()).click().sendKeys(city).sendKeys(Keys.ENTER).build().perform();
    }

    public void clickSubmit() {
        getSubmit().submit();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(FORM_MODAL_CONTENT));
    }
}
