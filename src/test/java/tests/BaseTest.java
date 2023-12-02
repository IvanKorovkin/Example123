package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeAll
    public static void beforeAll() {
        Configuration.pageLoadTimeout = 10000;
        Configuration.timeout = 10000;
    }

    @BeforeEach
    void setUp() {
        open("https://xn--80afcdbalict6afooklqi5o.xn--p1ai/");
    }

}
