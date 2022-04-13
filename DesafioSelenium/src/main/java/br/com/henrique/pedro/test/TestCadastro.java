package br.com.henrique.pedro.test;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.henrique.pedro.core.BasePage;
import br.com.henrique.pedro.core.BaseTest;
import br.com.henrique.pedro.page.Cadastro_page;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCadastro extends BaseTest {

	Cadastro_page c1 = new Cadastro_page();
	BasePage basePage = new BasePage();

	@Test
	public void test00001_Make() {
		c1.acessarTelaInicial();
		c1.setMake("Suzuki");
		Assert.assertEquals("Suzuki", c1.obterValorMake("make"));
	}

	@Test
	public void test00002_Model() {
		c1.setModel("Motorcycle");
		Assert.assertEquals("Motorcycle", c1.obterValorModel("model"));
	}

	@Test
	public void test00003_Cylinder() {
		c1.setCylinder("300");
		Assert.assertEquals("300", c1.obterCilindro("cylindercapacity"));
	}

	@Test
	public void test00004_Engine() {
		c1.setEngine("200");
		Assert.assertEquals("200", c1.obterEngine("engineperformance"));
	}

	@Test
	public void test00005_Date() {
		c1.setDate("04/19/1994");
		Assert.assertEquals("04/19/1994", c1.obterDate("dateofmanufacture"));
	}

	@Test
	public void test00006_Seats() {
		c1.setSeats("2");
		Assert.assertEquals("2", c1.obterValoSeats("numberofseats"));
	}

	@Test
	public void test00007_Hand() {
		c1.setHand();
		Assert.assertFalse(c1.validarRightHand("ideal-radiocheck-label"));
	}

	@Test
	public void test00008_Seats2() {
		c1.setSeats2("1");
		Assert.assertEquals("1", c1.obterValoSeats2("numberofseatsmotorcycle"));
	}

	@Test
	public void test00009_Fuel() {
		c1.setFuel("Other");
		Assert.assertEquals("Other", c1.obterValorType("fuel"));
	}

	@Test
	public void test0001_Payload() {
		c1.setPayload("100");
		Assert.assertEquals("100", c1.obterPayload("payload"));
	}

	@Test
	public void test0002_Weight() {
		c1.setWeight("200");
		Assert.assertEquals("200", c1.obterWeight("totalweight"));
	}

	@Test
	public void test0003_Price() {
		c1.setPrice("1000");
		Assert.assertEquals("1000", c1.obterPrice("listprice"));
	}

	@Test
	public void test0004_License() {
		c1.setLicense("abc123");
		Assert.assertEquals("abc123", c1.obterLicense("licenseplatenumber"));
	}

	@Test
	public void test0005_Mileage() {
		c1.setMileage("250");
		Assert.assertEquals("250", c1.obterMileage("annualmileage"));
	}

	@Test
	public void test0006_Next() {
		c1.setNext();
	}

	// ENTER INSURANT DATA

	@Test
	public void test0007_fisrtName() {
		c1.setFisrtName("Alguem");
		Assert.assertEquals("Alguem", c1.obterFirstName("firstname"));
	}

	@Test
	public void test0008_lastName() {
		c1.setLastName("Silva");
		Assert.assertEquals("Silva", c1.obterLastName("lastname"));
	}

	@Test
	public void test0009_DateBirth() {
		c1.setDateBirth("01/01/1990");
		Assert.assertEquals("01/01/1990", c1.obterDateBirth("birthdate"));
	}

	@Test
	public void test001_Gender() {
		c1.setGender();
		Assert.assertFalse(c1.obterGender("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span"));
	}

	@Test
	public void test002_Address() {
		c1.setAddress("Rua 123");
		Assert.assertEquals("Rua 123", c1.obterAddress("streetaddress"));
	}

	@Test
	public void test003_Country() {
		c1.setContry("Brazil");
	}

	@Test
	public void test004_Zip() {
		c1.setZip("123456");
		Assert.assertEquals("123456", c1.obterZip("zipcode"));
	}

	@Test
	public void test005_City() {
		c1.setCity("Brasília");
		Assert.assertEquals("Brasília", c1.obterCity("city"));
	}

	@Test
	public void test006_Occupation() {
		c1.setOccupation("Farmer");
		Assert.assertEquals("Farmer", c1.obterValorOccupation("occupation"));
	}

	@Test
	public void test007_Hobbies() {
		c1.setHobbies();
		Assert.assertFalse(c1.obterHobbies("(//span[contains(@class,'ideal-check')])[1]"));
	}

	@Test
	public void test008_Site() {
		c1.setSites("www.google.com");
		Assert.assertEquals("www.google.com", c1.obterSite("website"));
	}
	
	@Test
	public void test009_Picture() {
		c1.setPicture();
	}
	
	@Test
	public void test01_clicarNextData() {
		c1.setNextData();
	}

	// ENTER PRODUCT DATA

	@Test
	public void test02_StarDate() {
		c1.setStarDate("08/20/2022");
		Assert.assertEquals("08/20/2022", c1.obterStartDate("startdate"));
	}

	@Test
	public void test03_Insurance() {
		c1.setInsurance("35.000.000,00");
		Assert.assertEquals("35.000.000,00", c1.obterValorInsurance("insurancesum"));
	}

	@Test
	public void test04_MeritRating() {
		c1.setMeritRating("Bonus 3");
		Assert.assertEquals("Bonus 3", c1.obterValorMeritRating("meritrating"));
	}

	@Test
	public void test05_DamageInsurance() {
		c1.setDamageInsurance("Full Coverage");
		Assert.assertEquals("Full Coverage", c1.obterValorDamageInsurance("damageinsurance"));
		
	}

	@Test
	public void test06_OptionalProducts() {
		c1.setOptionalProducts();
		Assert.assertFalse(c1.obterOptionalProducts("//label[@class='ideal-radiocheck-label'][contains(.,'Euro Protection')]"));
	}

	@Test
	public void test07_CourtesyCar() {
		c1.setCourtesyCar("Yes");
		Assert.assertEquals("Yes", c1.obterCourtesyCar("courtesycar"));
	}

	@Test
	public void test08_clicarNextProductData() {
		c1.setNextProductData();
	}

	@Test
	public void test09_PricePerYear() {
		c1.setPricePerYear();
		Assert.assertFalse(c1.obterPricePerYear("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span"));
	}

	@Test
	@Ignore
	public void test1_Download() {
		c1.setDownload();
	}
	
	@Test
	public void test2_NextPrice() {
		c1.setNextPrice();
	}

	@Test
	public void test3_Email() {
		c1.setEmail("abc@gmail.com");
		Assert.assertEquals("abc@gmail.com", c1.obterEmail("email"));
	}
	
	@Test
	public void test4_Phone() {
		c1.setPhone("66966666666");
		Assert.assertEquals("66966666666", c1.obterPhone("phone"));
	}
	
	@Test
	public void test5_Username() {
		c1.setUsername("exemploUser");
		Assert.assertEquals("exemploUser", c1.obterUsername("username"));
	}
	
	@Test
	public void test6_Password() {
		c1.setPassword("Abcd12345678@");
		Assert.assertEquals("Abcd12345678@", c1.obterPassword("password"));
	}
	
	@Test
	public void test7_ConfirmPassword() {
		c1.setConfirmPassword("Abcd12345678@");
		Assert.assertEquals("Abcd12345678@", c1.obterConfirmPassword("confirmpassword"));
	}
	
	@Test 
	public void test8_Comments() {
		c1.setComments("Exemplo");
		Assert.assertEquals("Exemplo", c1.obterComments("Comments"));
	}
	
	@Test
	public void test9_Send() {
		c1.setSend();
	}
	
	
	
 
}
