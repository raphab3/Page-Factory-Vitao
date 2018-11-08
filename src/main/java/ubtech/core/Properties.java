package ubtech.core;

public class Properties {
	
	public static boolean CLOSER_BROWSER = true;
	//CASO QUERIA QUE O BROWSER NAO FECHE, COLOQUE = false;
	//CASO QUERIA QUE O BROWSER  FECHE, COLOQUE = true;
	
	public static Browser browser = Browser.CHROME; //ESCOLHA DO BROWSER A SER UTILIZADO ... CASO QUERIA FIREFOX "Browser.FIREFOX"  / CASO QUERIA CHROME  "Browser.CHROME"
	
	public static String NOME_CRIADO = "New User " + System.nanoTime();
	public static String NOME_ALTERADO = "Alter User " + System.nanoTime();
	
	public enum Browser {
		CHROME,
		FIREFOX
	}

}
