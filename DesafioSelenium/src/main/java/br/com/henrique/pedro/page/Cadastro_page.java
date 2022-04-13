package br.com.henrique.pedro.page;

import br.com.henrique.pedro.core.BasePage;
import br.com.henrique.pedro.core.DriverFactory;

public class Cadastro_page extends BasePage {

	// ENTER VEHICLE DATA
	
	public void acessarTelaInicial(){
		DriverFactory.getDriver().get("http://sampleapp.tricentis.com/101/app.php");
	}

	public void setMake(String make) {
		selecionarMake("make", make);
	}

	public void setModel(String model) {
		selecionarModel("model", model);
	}
	
	public void setCylinder(String cylinder) {
		capacidadeCilindro("cylindercapacity", cylinder);
	}

	public void setEngine(String engine) {
		capacidadeEngine("engineperformance", engine);
	}
	
	public void setDate(String date) {
		selecionarDate("dateofmanufacture", date);
	}
	
	public void setSeats(String seats) {
		selecionarSeats("numberofseats", seats);
	}
	
	public void setHand() {
		selecionarRightHand("ideal-radiocheck-label");
	}
	
	public void setSeats2(String seats2) {
		selecionarSeats("numberofseatsmotorcycle", seats2);
	}
	
	public void setFuel(String fuel) {
		selecionarSeats("fuel", fuel);
	}
	
	public void setPayload(String payload) {
		selecionarPayload("payload", payload);
	}
	
	public void setWeight(String weight) {
		selecionarWeightd("totalweight", weight);
	}
	
	public void setPrice(String price) {
		selecionarPrice("listprice", price);
	}
	
	public void setLicense(String license) {
		selecionarLicense("licenseplatenumber", license);
	}
	
	public void setMileage(String mileage) {
		selecionarMileage("annualmileage", mileage);
	}
	
	public void setNext() {
		clicarNext("nextenterinsurantdata");
	}
	
	// ENTER INSURANT DATA
	
	
	public void setFisrtName(String firstname) {
		selecionarFirstName("firstname", firstname);
	}
	
	public void setLastName(String lastname) {
		selecionarLastName("lastname", lastname);
	}
	
	public void setDateBirth(String birth) {
		selecionarDateBirth("birthdate", birth);
	}
	
	public void setGender() {
		selecionarGender("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
	}
	
	public void setAddress(String address) {
		selecionarAddress("streetaddress", address);
	}
	
	public void setContry(String country ) {
		selecionarCountry("country", country);
	}
	
	public void setZip(String zipCode) {
		selecionarZip("zipcode", zipCode);
	}
	
	public void setCity(String city) {
		selecionarCity("city", city);
	}
	
	public void setOccupation(String occupation) {
		selecionarOccupation("occupation", occupation);
	}
	
	public void setHobbies() {
		selecionarHobbies("(//span[contains(@class,'ideal-check')])[1]");
	}
	
	public void setSites(String site) {
		selecionarSite("website", site);
	}
	
	public void setPicture(){
		selecionarPicture("//*[@id=\"open\"]");
	}
	
	public void setNextData() {
		clicarNextData("nextenterproductdata");
	}
	
	// ENTER PRODUCT DATA
	
	public void setStarDate(String starDate) {
		selecionarStartDate("startdate", starDate);
	}
	
	public void setInsurance(String insurancesum) {
		selecionarInsurance("insurancesum", insurancesum);
	}
	
	public void setMeritRating(String meritrating) {
		selecionarMeritRating("meritrating", meritrating);
	}
	
	public void setDamageInsurance(String damageinsurance) {
		selecionarMeritRating("damageinsurance", damageinsurance);
	}
	
	public void setOptionalProducts() {
		selecionarOptionalProducts("//label[@class='ideal-radiocheck-label'][contains(.,'Euro Protection')]");
	}
	
	public void setCourtesyCar(String courtesycar) {
		selecionarCourtesyCar("courtesycar", courtesycar);
	}
	
	public void setNextProductData() {
		clicarNextProductData("nextselectpriceoption");
	}
	
	public void setPricePerYear() {
		selecionarPricePerYear("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span");
	}
	
	public void setDownload() {
		download("//*[@id=\"downloadquote\"]/span");
	}
	
	public void setNextPrice() {
		clicarNextPrice("nextsendquote");
	}
	
	public void setEmail(String email) {
		selecionarEmail("email", email);
	}
	
	public void setPhone(String phone) {
		selecionarPhone("phone", phone);
	}
	
	public void setUsername(String username) {
		selecionarUsername("username", username);
	}
	
	public void setPassword(String password) {
		selecionarPassword("password", password);
	}
	
	public void setConfirmPassword(String confirmpassword) {
		selecionarConfirmPassowrd("confirmpassword", confirmpassword);
	}
	
	public void setComments(String comments) {
		selecionarComments("Comments", comments);
	}
	
	public void setSend() {
		clicarSend("sendemail");
	}
	
}
