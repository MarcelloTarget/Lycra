package Lycra.core;

import Lycra.core.BasePage;
import static Lycra.core.DriverFactory.getDriver;

public class Login extends BasePage  {



	public void acessarTelaInicial() {
		getDriver().get("http://server.target1.com.br:8120/#/");
	}


}
