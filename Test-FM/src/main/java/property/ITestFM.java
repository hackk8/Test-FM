package property;

import utility.WebPageElements;

public interface ITestFM {
	
	String FIELD_DESC = "//th[text()='Field Description']";
	WebPageElements field_desc = new WebPageElements("Field description table text", "xpath", FIELD_DESC);
	
	String FIELD_NAME = "//th[text()='Field Name']";
	WebPageElements field_name = new WebPageElements("Field Name table text", "xpath", FIELD_NAME);
	
	String GATEWAY_FIELD = "//label[text()='Gateway']";
	WebPageElements gateway_field = new WebPageElements("Gateway field text", "xpath", GATEWAY_FIELD);

	String AMOUNT_FIELD = "//label[text()='Amount']";
	WebPageElements amount_field = new WebPageElements("Amount field text", "xpath", AMOUNT_FIELD);

	String MOBILE_FIELD = "//label[text()='Amount']";
	WebPageElements mobile_field = new WebPageElements("Mobile field text", "xpath", MOBILE_FIELD);
	
	String LENDER_FIELD = "//label[text()='Lender (Bank code)']";
	WebPageElements lender_field = new WebPageElements("Lender field text", "xpath", LENDER_FIELD);
	
	String GATEWAY = "//td/select[@id='GID']";
	WebPageElements gateway = new WebPageElements("Gateway field dropdown", "xpath", GATEWAY);
	
	String LENDER = "//td/select[@id='bank_code_fm']";
	WebPageElements lender = new WebPageElements("Lender field dropdown", "xpath", LENDER);
	
	String TPSL_OPTION = "//td/select/option[text()='TPSL']";
	WebPageElements tpsl_option = new WebPageElements("TPSL option", "xpath", TPSL_OPTION);
	
	String CASHFREE_OPTION = "//td/select/option[text()='Cashfree']";
	WebPageElements cashfree_option = new WebPageElements("Cashfree option", "xpath", CASHFREE_OPTION);

	String RAZORPAY_OPTION = "//td/select/option[text()='Razorpay']";
	WebPageElements razorpay_option = new WebPageElements("Razorpay option", "xpath", RAZORPAY_OPTION);

	String AMAZON_OPTION = "//td/select/option[text()='Amazon']";
	WebPageElements amazon_option = new WebPageElements("Amazon option", "xpath", AMAZON_OPTION);

	String WORLDLINE_OPTION = "//td/select/option[text()='World Line']";
	WebPageElements worldline_option = new WebPageElements("World Line option", "xpath", WORLDLINE_OPTION);

	String BENOW_OPTION = "//td/select/option[text()='Benow']";
	WebPageElements benow_option = new WebPageElements("Benow option", "xpath", BENOW_OPTION);
	
	String FISERV_OPTION = "//td/select/option[text()='Fiserv']";
	WebPageElements fiserv_option = new WebPageElements("Fiserv option", "xpath", FISERV_OPTION);
	
	String CONTINUE_BTN = "//button[@id='continueBtn']";
	WebPageElements continue_btn = new WebPageElements("Continue button", "xpath", CONTINUE_BTN);
}

