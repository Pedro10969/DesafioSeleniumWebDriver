package br.com.henrique.pedro.core;

import static br.com.henrique.pedro.core.DriverFactory.getDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	// Make

	public void selecionarMake(String id_Make, String valor) {
		WebElement element = getDriver().findElement(By.id(id_Make));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public String obterValorMake(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	// Model

	public void selecionarModel(String id_Model, String valor) {
		WebElement element = getDriver().findElement(By.id(id_Model));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public String obterValorModel(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	// Cylinder Capacity [ccm]

	public void capacidadeCilindro(String id_cilindro, String texto) {
		getDriver().findElement(By.id(id_cilindro)).sendKeys(texto);
	}

	public String obterCilindro(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Engine Performance [kW]

	public void capacidadeEngine(String id_engine, String texto) {
		getDriver().findElement(By.id(id_engine)).sendKeys(texto);
	}

	public String obterEngine(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Date of Manufacture

	public void selecionarDate(String id_date, String texto) {
		getDriver().findElement(By.id(id_date)).sendKeys(texto);
	}

	public String obterDate(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Number of Seats

	public void selecionarSeats(String id_seats, String valor) {
		WebElement element = getDriver().findElement(By.id(id_seats));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public String obterValoSeats(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	// Right Hand Drive

	public void selecionarRightHand(String id_hand) {
		getDriver().findElement(By.className(id_hand)).click();
	}

	public boolean validarRightHand(String id) {
		return getDriver().findElement(By.className(id)).isSelected();
	}

	// Number of Seats

	public void selecionarSeats2(String id_seats2, String valor) {
		WebElement element = getDriver().findElement(By.id(id_seats2));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	
	public String obterValoSeats2(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	// Fuel Type

	public void selecionarFuel(String id_fuel, String valor) {
		WebElement element = getDriver().findElement(By.id(id_fuel));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public String obterValorType(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	// Payload [kg]

	public void selecionarPayload(String id_payload, String text) {
		getDriver().findElement(By.id(id_payload)).sendKeys(text);
	}

	public String obterPayload(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Total Weight [kg]

	public void selecionarWeightd(String id_weight, String text) {
		getDriver().findElement(By.id(id_weight)).sendKeys(text);
	}

	public String obterWeight(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// List Price [$]

	public void selecionarPrice(String id_price, String text) {
		getDriver().findElement(By.id(id_price)).sendKeys(text);
	}

	public String obterPrice(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// License Plate Number

	public void selecionarLicense(String id_license, String text) {
		getDriver().findElement(By.id(id_license)).sendKeys(text);
	}

	public String obterLicense(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Annual Mileage [mi]

	public void selecionarMileage(String id_mileage, String text) {
		getDriver().findElement(By.id(id_mileage)).sendKeys(text);
	}

	public String obterMileage(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Next

	public void clicarNext(String id_next) {
		getDriver().findElement(By.id(id_next)).click();
	}

	// CADASTRO ENTER INSURANT DATA

	// First Name

	public void selecionarFirstName(String id_fisrt, String text) {
		getDriver().findElement(By.id(id_fisrt)).sendKeys(text);
	}

	public String obterFirstName(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Last Name

	public void selecionarLastName(String id_last, String text) {
		getDriver().findElement(By.id(id_last)).sendKeys(text);
	}

	public String obterLastName(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Date of Birth

	public void selecionarDateBirth(String id_dateBirth, String texto) {
		getDriver().findElement(By.id(id_dateBirth)).sendKeys(texto);
	}

	public String obterDateBirth(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Gender

	public void selecionarGender(String id_gender) {
		getDriver().findElement(By.xpath(id_gender)).click();
	}

	public boolean obterGender(String id) {
		return getDriver().findElement(By.xpath(id)).isSelected();
	}

	// Street Address

	public void selecionarAddress(String id_address, String texto) {
		getDriver().findElement(By.id(id_address)).sendKeys(texto);
	}

	public String obterAddress(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Country

	public void selecionarCountry(String id_country, String valor) {
		WebElement element = getDriver().findElement(By.id(id_country));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public void obterCountry(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		Assert.assertEquals(31, options.size());

		boolean encontrou = false;
		for (WebElement option : options) {
			if (option.getText().equals("Brazil")) {
				encontrou = true;
				break;
			}
		}
		Assert.assertTrue(encontrou);
	}

	// Zip Code

	public void selecionarZip(String id_zip, String texto) {
		getDriver().findElement(By.id(id_zip)).sendKeys(texto);
	}

	public String obterZip(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// City

	public void selecionarCity(String id_city, String texto) {
		getDriver().findElement(By.id(id_city)).sendKeys(texto);
	}

	public String obterCity(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Occupation

	public void selecionarOccupation(String id_occupation, String valor) {
		WebElement element = getDriver().findElement(By.id(id_occupation));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public String obterValorOccupation(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	// Hobbies

	public void selecionarHobbies(String id_hobbies) {
		getDriver().findElement(By.xpath(id_hobbies)).click();
	}

	public boolean obterHobbies(String id) {
		return getDriver().findElement(By.xpath(id)).isSelected();
	}

	// WebSite

	public void selecionarSite(String id_site, String texto) {
		getDriver().findElement(By.id(id_site)).sendKeys(texto);
	}

	public String obterSite(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Picture

	public void selecionarPicture(String id_picture) {
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String filePath = "C:\\Users\\Pedro\\Desktop\\Selenium_logo.png";
		WebElement chooseFile = getDriver().findElement(By.xpath("//*[@id=\"open\"]"));
		chooseFile.sendKeys(filePath);
		getDriver().findElement(By.xpath("//*[@id=\"open\"]")).click();		
	}

	// Next Data

	public void clicarNextData(String id_nextData) {
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getDriver().findElement(By.id(id_nextData)).click();
	}

	// ENTER PRODUCT DATA

	// Start Date

	public void selecionarStartDate(String id_starDate, String texto) {
		getDriver().findElement(By.id(id_starDate)).sendKeys(texto);
	}

	public String obterStartDate(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Insurance Sum [$]

	public void selecionarInsurance(String id_Insurance, String valor) {
		WebElement element = getDriver().findElement(By.id(id_Insurance));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public String obterValorInsurance(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	// Merit Rating

	public void selecionarMeritRating(String id_MeritRating, String valor) {
		WebElement element = getDriver().findElement(By.id(id_MeritRating));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public String obterValorMeritRating(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	// Damage Insurance

	public void selecionarDamageInsurance(String id_DamageInsurance, String valor) {
		WebElement element = getDriver().findElement(By.id(id_DamageInsurance));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public String obterValorDamageInsurance(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	// Optional Products

	public void selecionarOptionalProducts(String id_OptionalProducts) {
		getDriver().findElement(By.xpath(id_OptionalProducts)).click();
	}

	public boolean obterOptionalProducts(String id) {
		return getDriver().findElement(By.xpath(id)).isSelected();
	}

	// Courtesy Car

	public void selecionarCourtesyCar(String id_CourtesyCar, String valor) {
		WebElement element = getDriver().findElement(By.id(id_CourtesyCar));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public String obterCourtesyCar(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	// Next Product Data

	public void clicarNextProductData(String id_nextProductData) {
		getDriver().findElement(By.id(id_nextProductData)).click();
	}

	// SELECT PRICE OPTION

	public void selecionarPricePerYear(String id_price) {
		getDriver().findElement(By.xpath(id_price)).click();
	}

	public boolean obterPricePerYear(String id) {
		return getDriver().findElement(By.xpath(id)).isSelected();
	}

	// Download

	public void download(String id_download) {
		getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		getDriver().findElement(By.xpath(id_download)).click();
	}

	// Next

	public void clicarNextPrice(String id_nextPrice) {
		getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		getDriver().findElement(By.id(id_nextPrice)).click();
	}

	// SEND QUOTE

	// E-mail

	public void selecionarEmail(String id_email, String texto) {
		getDriver().findElement(By.id(id_email)).sendKeys(texto);
	}

	public String obterEmail(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Phone

	public void selecionarPhone(String id_phone, String texto) {
		getDriver().findElement(By.id(id_phone)).sendKeys(texto);
	}

	public String obterPhone(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Username

	public void selecionarUsername(String id_username, String texto) {
		getDriver().findElement(By.id(id_username)).sendKeys(texto);
	}

	public String obterUsername(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Password

	public void selecionarPassword(String id_password, String texto) {
		getDriver().findElement(By.id(id_password)).sendKeys(texto);
	}

	public String obterPassword(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Confirm Password

	public void selecionarConfirmPassowrd(String id_confirmPassword, String texto) {
		getDriver().findElement(By.id(id_confirmPassword)).sendKeys(texto);
	}

	public String obterConfirmPassword(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Comments

	public void selecionarComments(String id_comments, String texto) {
		getDriver().findElement(By.id(id_comments)).sendKeys(texto);
	}

	public String obterComments(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	// Send

	public void clicarSend(String id_send) {
		getDriver().findElement(By.id(id_send)).click();
	}
}