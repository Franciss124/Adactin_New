package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseClass;
import PagesObject.BookHotel;
import PagesObject.Login;
import PagesObject.SearchHotel;
import PagesObject.SelectHotel;

public class Test1 extends BookHotel{

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		BaseClass b = new BaseClass();
		b.launchBrowser();
		b.loadUrl("https://adactinhotelapp.com/");
		// Thread.sleep(5000);
	}

	@Test(groups="smoke")
	public void tc1() throws InterruptedException {

		BaseClass b = new BaseClass();
		Login lp = new Login();
		WebElement userName = lp.getUserName();
		WebElement password = lp.getPassword();
		WebElement login = lp.getLogin();

		b.sendKeys1(userName, "Francis3535");
		b.sendKeys1(password, "Francis@123");
		b.click1(userName);
		b.click1(login);
	}
	

	@Test(groups="smoke")
	public void tc2() {
		BaseClass b = new BaseClass();
		SearchHotel sh = new SearchHotel();
		WebElement location = sh.getLocation();
		b.Select1(location, 1);
		WebElement hotels = sh.getHotels();
		b.Select1(hotels, 1);
		WebElement room_type = sh.getRoom_type();
		b.Select1(room_type, 1);
		WebElement room_nos = sh.getRoom_nos();
		b.Select1(room_nos, 3);
		WebElement datepick_in = sh.getDatepick_in();
		b.sendKeys1(datepick_in, "21/07/2022");
		WebElement datepick_out = sh.getDatepick_out();
		b.sendKeys1(datepick_out, "22/07/2022");
		WebElement adult_room = sh.getAdult_room();
		b.Select1(adult_room, 2);
		WebElement child_room = sh.getChild_room();
		b.Select1(child_room, 1);
		WebElement submit = sh.getSubmit();
		b.click1(submit);

	}

	@Test()
	public void tc3() {
		BaseClass b = new BaseClass();
		SelectHotel sh = new SelectHotel();
		WebElement radiobutto = sh.getRadiobutto();
		b.click1(radiobutto);
		WebElement continues = sh.getContinues();
		b.click1(continues);

	}

	@Test
	public void tc4() {
		BaseClass b = new BaseClass();
		BookHotel bh = new BookHotel();
		WebElement first_name = bh.getFirst_name();
		b.sendKeys1(first_name, "Francis");
		WebElement last_name = bh.getLast_name();
		b.sendKeys1(last_name, "Sanjon");
		WebElement address = bh.getAddress();
		b.sendKeys1(address, "Pallikaranai");
		WebElement cc_num = bh.getCc_num();
		b.sendKeys1(cc_num, "1234567891234567");
		WebElement cc_type = bh.getCc_type();
		b.Select1(cc_type, 1);
		WebElement cc_exp_month = bh.getCc_exp_month();
		b.Select1(cc_exp_month, 1);
		WebElement cc_exp_year = bh.getCc_exp_year();
		b.Select1(cc_exp_year, 11);
		WebElement cc_cvv = bh.getCc_cvv();
		b.sendKeys1(cc_cvv, "1234");
		WebElement book_now = bh.getBook_now();
		b.click1(book_now);

	}
	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(15000);
		driver.quit();
	}

}
