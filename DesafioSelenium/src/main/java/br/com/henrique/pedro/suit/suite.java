package br.com.henrique.pedro.suit;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.henrique.pedro.core.DriverFactory;
import br.com.henrique.pedro.page.Cadastro_page;

@RunWith(Suite.class)
@SuiteClasses({
	Cadastro_page.class,

})

public class suite {
	
	@AfterClass
	public static void finaliza(){
		DriverFactory.killDriver();
	}

}
