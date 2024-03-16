package Wikipedia_BDD.utils;

import Wikipedia_BDD.models.WikipediaBDDJsonHandler;
import aquality.selenium.browser.AqualityServices;
import com.google.gson.Gson;
import lombok.experimental.UtilityClass;

import java.io.FileReader;

@UtilityClass
public  class JsonToObjectBDD {
    public static final String RESOURCE_FILE_PATH = System.getProperty("user.dir")+ "/src/test/resources/";

    private static final String WIKIPEDIA_ENV_PATH = RESOURCE_FILE_PATH+"WikipediaBDDRoute.json";
    private static Gson gson = new Gson();


    public static WikipediaBDDJsonHandler getEnvData() {
        try {
            return gson.fromJson(new FileReader(WIKIPEDIA_ENV_PATH), WikipediaBDDJsonHandler.class);
        }catch (Exception e){
            AqualityServices.getLogger().error(e.getMessage());
            throw  new RuntimeException(e.getMessage());
        }

    }
}
