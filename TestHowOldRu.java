    @BeforeClass
    public void setUp() {
        Systm.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://howoldru.m-messiah.cc/");
        howOldRuPage = new HowOldRuPage(driver);
    }

    @Test
    public void testCheckAge() {
        howOldRuPage.enterImageUrl("URL_TO_IMAGE");
        howOldRuPage.clickSubmit();

        // Add assertions to verify the results
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
