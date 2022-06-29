package Utility;

import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.List;

public class Constant {

    public static final String URL = "https://demoqa.com/";

    /**
     * Elements
     */
    public static final String EL_URL = "https://demoqa.com/elements";
    public static final By EL_LIST = By.className("menu-list");
    public static final By EL_BUTTONS = By.cssSelector("span.text");
    public static final By EL_MAIN_HEADER = By.className("main-header");
    public static final int EL_CLICK_INDEX = 2;

    /**
     * Links
     */
    public static final String LINKS_URL = "https://demoqa.com/links";
    public static final String LINKS_PARTIAL_TEXT = "Home";
    public static final By LINKS_HOME = By.id("simpleLink");
    public static final By LINKS_CREATED = By.id("created");
    public static final By LINKS_NO_CONTENT = By.id("no-content");
    public static final By LINKS_MOVED = By.id("moved");
    public static final By LINKS_BAD_REQUEST = By.id("bad-request");
    public static final By LINKS_UNAUTHORIZED = By.id("unauthorized");
    public static final By LINKS_FORBIDDEN = By.id("forbidden");
    public static final By LINKS_NOT_FOUND = By.id("invalid-url");
    public static final By LINKS_LINK_RESPONSE = By.id("linkResponse");

    /**
     * Broken Links Images
     */
    public static final String BROKEN_URL = "https://demoqa.com/broken";
    public static final By TAG_NAME_LINKS = By.tagName("a");
    public static final By TAG_NAME_IMAGES = By.tagName("img");

    /**
     * CheckBox
     */
    public static final String CB_URL = "https://demoqa.com/checkbox";
    public static final By CB_PARENT_LIS = By.cssSelector(".rct-node.rct-node-parent");
    public static final By CB_PARENT_LIS_NOT_EXPANDED = By.cssSelector(".rct-node.rct-node-parent:not(.rct-node-expanded)");
    public static final By CB_PARENT_LIS_EXPANDED = By.cssSelector(".rct-node.rct-node-parent.rct-node-expanded");
    public static final By CB_EXPANDED_ALL_BUTTON = By.className("rct-option-expand-all");
    public static final By CB_COLLAPSE_ALL_BUTTON = By.className("rct-option-collapse-all");
    public static final By CB_CHECK_BOX_TEXT = By.className("rct-title");
    public static final By CB_LABEL = By.tagName("label");
    public static final By CB_COLLAPSE_BTN = By.className("rct-collapse-btn");
    public static final By CB_OL = By.tagName("ol");
    public static final By CB_TEXT_SUCCESS = By.className("text-success");
    public static final int CB_CHECK_INDEX = 2;

    /**
     * Dynamic Properties
     */
    public static final String DP_URL = "https://demoqa.com/dynamic-properties";
    public static final By DP_VISIBLE_AFTER = By.id("visibleAfter");
    public static final By DP_ENABLE_AFTER = By.id("enableAfter");
    public static final By DP_COLOR_CHANGE = By.id("colorChange");
    public static final By DP_TEXT_DANGER = By.cssSelector(".mt-4.text-danger");
    public static final By DP_STD_COLOR = By.cssSelector(".mt-4.btn");

    /**
     * Buttons
     */
    public static final String BUTTONS_URL = "https://demoqa.com/buttons";
    public static final By BUTTONS_DBL_CLICK = By.id("doubleClickBtn");
    public static final By BUTTONS_R_CLICK = By.id("rightClickBtn");
    public static final By BUTTONS_DY_CLICK = By.cssSelector(".mt-4>button");
    public static final By BUTTONS_DBL_MSG = By.id("doubleClickMessage");
    public static final By BUTTONS_R_MSG = By.id("rightClickMessage");
    public static final By BUTTONS_DY_MSG = By.id("dynamicClickMessage");
    public static final String BUTTONS_DY_TEXT = "Click Me";
    public static final String BUTTONS_EXP_MSG_DBL = "You have done a double click";
    public static final String BUTTONS_EXP_MSG_R = "You have done a right click";
    public static final String BUTTONS_EXP_MSG_DY = "You have done a dynamic click";

    /**
     * Radio Button
     */
    public static final String RADIO_URL = "https://demoqa.com/radio-button";
    public static final By RADIO_TEXT_SUCCESS = By.className("text-success");
    public static final By RADIO_YES = By.cssSelector("label[for='yesRadio']");
    public static final By RADIO_IMPRESSIVE = By.cssSelector("label[for='impressiveRadio']");
    public static final By RADIO_NO = By.id("noRadio");
    public static final String RADIO_BUTTON_YES = "Yes";
    public static final String RADIO_BUTTON_IMPRESSIVE = "Impressive";

    /**
     * TextBox
     */
    public static final String TB_URL = "https://demoqa.com/text-box";
    public static final By TB_NAME_INPUT = By.id("userName");
    public static final By TB_EMAIL_INPUT = By.id("userEmail");
    public static final By TB_CURR_ADDRESS_INPUT = By.id("currentAddress");
    public static final By TB_PERMA_ADDRESS_INPUT = By.id("permanentAddress");
    public static final By TB_SUBMIT = By.id("submit");
    public static final By TB_OUTPUT = By.id("output");
    public static final By TB_OUTPUT_NAME = By.id("name");
    public static final By TB_OUTPUT_EMAIL = By.id("email");
    public static final By TB_OUTPUT_CURR_ADDRESS = By.cssSelector("p#currentAddress");
    public static final By TB_OUTPUT_PERMA_ADDRESS = By.cssSelector("p#permanentAddress");
    public static final String TB_USERNAME = "Lidija";
    public static final String TB_EMAIL = "lidija@lidija.com";
    public static final String TB_CURR_ADDRESS = "zvzvzv";
    public static final String TB_PERMA_ADDRESS = "agagag";

    /**
     * Upload Download
     */
    public static final String UD_URL = "https://demoqa.com/upload-download";
    public static final By UD_UPLOAD_FILE = By.id("uploadFile");
    public static final By UD_DOWNLOAD_BUTTON = By.id("downloadButton");
    public static final By UD_FAKE_PATH = By.id("uploadedFilePath");
    public static final String UD_FILENAME = "sampleFile.jpeg";
    public static final String UD_DOWNLOAD_PATH = "/Downloads/sampleFile.jpeg";
    public static final String UD_UPLOAD_PATH = "src/main/resources/sampleFile.jpeg";

    /**
     * WebTables
     */
    public static final String WT_URL = "https://demoqa.com/webtables";
    public static final By WT_ADD_NEW_RECORD = By.id("addNewRecordButton");
    public static final By WT_MODAL = By.className("modal");
    public static final By WT_TABLE_CELL = By.className("rt-td");
    public static final By WT_SEARCH_BOX = By.id("searchBox");
    public static final By WT_TABLE_ROWS = By.cssSelector("select[aria-label='rows per page']");
    public static final By WT_NUM_OF_ROWS = By.className("rt-tr-group");
    public static final By WT_FIRST_NAME = By.id("firstName");
    public static final By WT_LAST_NAME = By.id("lastName");
    public static final By WT_USER_EMAIL = By.id("userEmail");
    public static final By WT_AGE = By.id("age");
    public static final By WT_SALARY = By.id("salary");
    public static final By WT_DEPARTMENT = By.id("department");
    public static final By WT_SUBMIT = By.id("submit");
    public static final List<String> WT_NEW_RECORD = Arrays.asList("Lidija", "Milosevic", "lidija@test.com",
            "36", "1500", "QA");
    public static final List<String> WT_NEW_RECORD_2 = Arrays.asList("Marko", "Markovic", "marko@test.com",
            "40", "1500", "QA");
    public static final int WT_DELETE_RECORD_INDEX = 1;
    public static final int WT_EDIT_RECORD_INDEX = 2;
    public static final String WT_SET_NUM_OF_ROWS = "25";

    /**
     * Practice Form
     */
    public static final String FORM_URL = "https://demoqa.com/automation-practice-form";
    public static final By FORM_FIRST_NAME_INPUT = By.id("firstName");
    public static final By FORM_LAST_NAME_INPUT = By.id("lastName");
    public static final By FORM_EMAIL_INPUT = By.id("userEmail");
    public static final By FORM_MALE = By.cssSelector("label[for='gender-radio-1']");
    public static final By FORM_FEMALE = By.cssSelector("label[for='gender-radio-2']");
    public static final By FORM_OTHER = By.cssSelector("label[for='gender-radio-3']");
    public static final By FORM_NUMBER_INPUT = By.id("userNumber");
    public static final By FORM_BIRTH_DATE_INPUT = By.id("dateOfBirthInput");
    public static final By FORM_SUBJECT_INPUT = By.id("subjectsInput");
    public static final By FORM_SPORT_BUTTON = By.cssSelector("label[for='hobbies-checkbox-1']");
    public static final By FORM_READING_BUTTON = By.cssSelector("label[for='hobbies-checkbox-2']");
    public static final By FORM_MUSIC_BUTTON = By.cssSelector("label[for='hobbies-checkbox-3']");
    public static final By FORM_CHOOSE_PICTURE = By.id("uploadPicture");
    public static final By FORM_CURR_ADDRESS_INPUT = By.id("currentAddress");
    public static final By FORM_STATE = By.id("state");
    public static final By FORM_CITY = By.id("city");
    public static final By FORM_SUBMIT = By.id("submit");
    public static final By FORM_MODAL_CONTENT = By.className("modal-content");
    public static final By FORM_RESULT_STUDENT_NAME = By.xpath("//table/tbody/tr[1]/td[2]");
    public static final By FORM_RESULT_STUDENT_EMAIL = By.xpath("//table/tbody/tr[2]/td[2]");
    public static final By FORM_RESULT_STUDENT_CHECKED = By.xpath("//table/tbody/tr[3]/td[2]");
    public static final By FORM_RESULT_STUDENT_MOBILE = By.xpath("//table/tbody/tr[4]/td[2]");
    public static final By FORM_RESULT_STUDENT_DATE = By.xpath("//table/tbody/tr[5]/td[2]");
    public static final By FORM_RESULT_STUDENT_SUBJECTS = By.xpath("//table/tbody/tr[6]/td[2]");
    public static final By FORM_RESULT_STUDENT_HOBBIES = By.xpath("//table/tbody/tr[7]/td[2]");
    public static final By FORM_RESULT_STUDENT_PICTURE = By.xpath("//table/tbody/tr[8]/td[2]");
    public static final By FORM_RESULT_STUDENT_ADDRESS = By.xpath("//table/tbody/tr[9]/td[2]");
    public static final By FORM_RESULT_STUDENT_STATE_CITY = By.xpath("//table/tbody/tr[10]/td[2]");
    public static final String FORM_FIRST_NAME = "Lidija";
    public static final String FORM_LAST_NAME = "Milosevic";
    public static final String FORM_EMAIL = "lidija@test.com";
    public static final String FORM_NUM = "0601234567";
    public static final String FORM_BIRTHDAY = "21 October,1985";
    public static final String FORM_PATH = "C:/Users/Lidija Milosevic/it boot camp/6.TDD.BDD.PNG";
    public static final String FORM_CURR_ADDRESS = "Address";
    public static final String FORM_RANDOM_STATE = "Uttar Pradesh";
    public static final String FORM_RANDOM_CITY = "Agra";
    public static final String FORM_SUBJECT = "Maths";
    public static final String FORM_GENDER = "Other";
    public static final String FORM_HOBBIES = "Sports, Reading, Music";
    public static final String FORM_PICTURE = "6.TDD.BDD.PNG";

    /**
     * Login Book Store
     */
    public static final String LBS_URL = "https://demoqa.com/login";
    public static final String LBS_PASSWORD = "Lidija123!";
    public static final String LBS_USERNAME = "Lidija";

    /**
     * BookStore
     */
    public static final String BS_URL = "https://demoqa.com/books";
    public static final By BS_MAIN_HEADER = By.className("main-header");
    public static final By BS_ADD_TO_COLLECTION = By.cssSelector(".text-right.fullButton button");
    public static final By BS_TEXT = By.cssSelector("#title-wrapper #userName-value");
    public static final String BS_ALERT = "Book already present in the your collection!";
    public static final String BS_ADDED = "Book added to your collection.";
    public static final By BS_GO_TO_STORE = By.cssSelector(".text-left.fullButton button");

    /**
     * Profile
     */
    public static final String P_URL = "https://demoqa.com/profile";
    public static final By P_MAIN_HEADER = By.className("main-header");
    public static final By P_LOGOUT = By.id("submit");
    public static final By P_GO_TO_STORE = By.id("gotoStore");
    public static final By P_DELETE_ACCOUNT_BUTTON = By.cssSelector(".text-center.button button");
    public static final By P_DELETE_ALL_BOOKS_BUTTON = By.cssSelector(".text-right.button button");
    public static final By P_MODAL_OK_BUTTON = By.id("closeSmallModal-ok");
    public static final By P_TABLE_ROWS = By.className("rt-tr");
    public static final By P_DELETE_BOOK_BUTTON = By.id("delete-record-undefined");
    public static final By P_BOOK_TITLE_BY = By.cssSelector("#title-wrapper #userName-value");
    public static final String P_BOOK_TITLE_GIT = "Git Pocket Guide";
    public static final String P_USER_DELETED = "User Deleted.";
    public static final String P_ALL_BOOKS_DELETED = "All Books deleted.";
    public static final String P_BOOK_DELETED = "Book deleted.";
    public static final int P_DELETE_INDEX = 0;
    public static By LBS_NAME = By.id("userName");
    public static By LBS_PASS = By.id("password");
    public static By LBS_LOGIN_BUTTON = By.id("login");
    public static By LBS_USERNAME_VALUE = By.id("userName-value");
}
