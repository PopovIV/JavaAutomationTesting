package tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.junit.jupiter.api.BeforeAll;
import utils.User;
import static com.codeborne.selenide.Selenide.open;

// Abstract class for all Tests
public abstract class OKTest {
    private static final String URL = "https://ok.ru";
    private static final String CONFIG_PATH = "config.txt";

    // Function to read user's password and login from "config.txt" file
    // It must be created before testing
    // First line - login
    // Second line - password
    protected static User readConfig() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(CONFIG_PATH));
        return new User(in.readLine(), in.readLine());
    }

    @BeforeAll
    public static void init() {
        open(URL);
    }
}
