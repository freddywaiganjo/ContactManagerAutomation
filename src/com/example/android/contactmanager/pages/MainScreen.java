package com.example.android.contactmanager.pages;

import com.infostretch.automation.core.QAFTestBase;
import com.infostretch.automation.ui.WebDriverBaseTestPage;
import com.infostretch.automation.ui.annotations.FindBy;
import com.infostretch.automation.ui.api.PageLocator;
import com.infostretch.automation.ui.api.WebDriverTestPage;
import com.infostretch.automation.ui.webdriver.QAFWebElement;

public class MainScreen extends WebDriverBaseTestPage<WebDriverTestPage> {
	@FindBy(locator = "add contact button")
	private QAFWebElement btnAddContact;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	@Override
	public void waitForPageToLoad() {
		super.waitForPageToLoad();
		QAFTestBase.pause(3000);
	}

	public QAFWebElement getBtnAddContact() {
		return btnAddContact;
	}

}
