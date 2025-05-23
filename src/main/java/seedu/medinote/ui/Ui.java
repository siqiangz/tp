package seedu.medinote.ui;

public class Ui {

    public static final String UI_LINE_BREAK = "===============================================" +
            "===============================================";
    private static final String MEDINOTE_ART =
            "\t··················································" + System.lineSeparator() +
            "\t: __  __            _  _  _   _         _        :" + System.lineSeparator() +
            "\t:|  \\/  |  ___   __| |(_)| \\ | |  ___  | |_  ___ :" + System.lineSeparator() +
            "\t:| |\\/| | / _ \\ / _` || ||  \\| | / _ \\ | __|/ _ \\:" + System.lineSeparator() +
            "\t:| |  | ||  __/| (_| || || |\\  || (_) || |_|  __/:" + System.lineSeparator() +
            "\t:|_|  |_| \\___| \\__,_||_||_| \\_| \\___/  \\__|\\___|:" + System.lineSeparator() +
            "\t··················································";
    private static final String WELCOME_TO_MEDINOTE =
            "\tWelcome to MediNote! Type command 'help' to see" + System.lineSeparator() +
            "\tavailable commands.";
    private static final String ARROW_POINT = ">";

    public static void printHelpTable() {
        String format = "%-20s | %-80s%n"; // Formatting for alignment

        System.out.println(UI_LINE_BREAK);
        System.out.printf(format, "Keyword", "Action");
        System.out.println(UI_LINE_BREAK);

        printRow("help", "Shows a list of commands for navigating the database");
        printEmptyRow();

        printRow("register", "Registers new patient with necessary details:");
        printRow("", ARROW_POINT + " <NAME>");
        printRow("", ARROW_POINT + " <SYMPTOMS>");
        printRow("", ARROW_POINT + " <ADMISSION TIME> in yyyy-MM-dd HH:mm:ss format");
        printRow("", ARROW_POINT + " <MEDICAL HISTORY>");
        printRow("", "Format: register <NAME> / <SYMPTOMS> / <ADMISSION TIME> / <MEDICAL HISTORY>");
        printEmptyRow();

        printRow("oncall", "Register on-call doctor(s) with necessary details:");
        printRow("", ARROW_POINT + " <NAME>");
        printRow("", ARROW_POINT + " <SPECIALISATION>");
        printRow("", "Format: oncall <NAME> / <SPECIALISATION>");
        printEmptyRow();

        printRow("patient", "Displays specific patient information such as:");
        printRow("", ARROW_POINT + " Name");
        printRow("", ARROW_POINT + " Symptoms");
        printRow("", ARROW_POINT + " Admission time");
        printRow("", ARROW_POINT + " Medical history");
        printRow("", ARROW_POINT + " Treatment status (if any)");
        printRow("", ARROW_POINT + " Doctors assigned (if any)");
        printRow("", "Format: patient <NAME_1> / ... / <NAME_X>");
        printRow("", "Note: <NAME> inputted does not need to be case-sensitive");
        printEmptyRow();

        printRow("view patient", "Displays each patient's specific attribute one by one:");
        printRow("", "Available attributes:");
        printRow("", "\t" + ARROW_POINT + " name");
        printRow("", "\t" + ARROW_POINT + " symptoms");
        printRow("", "\t" + ARROW_POINT + " timestamp");
        printRow("", "\t" + ARROW_POINT + " history");
        printRow("", "\t" + ARROW_POINT + " treatment");
        printRow("", "\t" + ARROW_POINT + " doctor");
        printRow("", "Format: view patient <ATTRIBUTE>");
        printEmptyRow();

        printRow("doctor", "Displays specific doctor information such as:");
        printRow("", ARROW_POINT + " Specialisation");
        printRow("", ARROW_POINT + " Availability");
        printRow("", ARROW_POINT + " Patients under the doctor (if any)");
        printRow("", "Format: doctor <NAME_1> / ... / <NAME_X>");
        printRow("", "Note: <NAME> inputted does not need to be case-sensitive");
        printEmptyRow();

        printRow("view doctor", "Displays each doctor's specific attribute one by one:");
        printRow("", "Available attributes:");
        printRow("", "\t" + ARROW_POINT + " name");
        printRow("", "\t" + ARROW_POINT + " specialisation");
        printRow("", "\t" + ARROW_POINT + " availability");
        printRow("", "\t" + ARROW_POINT + " treating");
        printRow("", "\t" + ARROW_POINT + " numtreated");
        printRow("", "Format: view doctor <ATTRIBUTE>");
        printEmptyRow();

        printRow("list patient",
                "Displays all the patients in the patients class array that are yet to be discharged");
        printRow("list doctor", "Displays all doctors available in the hospital");
        printEmptyRow();

        printRow("update patient", "Updates corresponding patient’s information on:");
        printRow("", ARROW_POINT + " <TREATMENT STATUS> whether they are still in queue or being treated");
        printRow("", ARROW_POINT + " <DOCTOR ASSIGNED> the doctor that they are assigned");
        printEmptyRow();

        printRow("update doctor", "Updates corresponding doctor information on:");
        printRow("", ARROW_POINT + " <AVAILABILITY> their current working status");
        printRow("", ARROW_POINT + " <PATIENT NAME> the patient they are currently treating (if any)");
        printEmptyRow();

        printRow("discharge patient", "Deletes patient and corresponding information from the database.");
        printRow("delete doctor", "Deletes doctor and corresponding information from the database");
        printEmptyRow();

        printRow("popular", "Displays most popular doctors based on specified attributes");
        printRow("", "Available options:");
        printRow("", "\t" + ARROW_POINT + " doctor type");
        printRow("", "\t" + ARROW_POINT + " visited doctor");
        printEmptyRow();

        printRow("stats", "Prints an overview of hospital metrics");
        printRow("", "\t" + ARROW_POINT + " Total number of patients");
        printRow("", "\t" + ARROW_POINT + " Number of patients currently being treated");
        printRow("", "\t" + ARROW_POINT + " Total number of doctors");
        printRow("", "\t" + ARROW_POINT + " Most active doctor (by patient count)");
        printRow("", "\t" + ARROW_POINT + " Average patients per doctor");
        printEmptyRow();

        printRow("exit", "Exits the program");

        System.out.println(UI_LINE_BREAK);
    }

    public static void printRow(String keyword, String action) {
        System.out.printf("%-20s | %-80s%n", keyword, action);
    }

    public static void printEmptyRow() {
        System.out.printf("%-20s | %-80s%n", "", "");
    }

    public static void printGreetings() {
        System.out.println(UI_LINE_BREAK);
        System.out.println(MEDINOTE_ART);
        System.out.println(WELCOME_TO_MEDINOTE);
        System.out.println(UI_LINE_BREAK);
    }

}
