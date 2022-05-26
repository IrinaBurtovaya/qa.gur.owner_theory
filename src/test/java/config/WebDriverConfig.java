package config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("baseUrl") // зачитываем данные из командной строки
    @DefaultValue("https://github.com")  //обрабатываем дефолтое значение
    String getBaseUrl(); // конвертируем в возвращаемый тип


    @Key("browser") // зачитываем данные из командной строки
    @DefaultValue("FIREFOX")  //обрабатываем дефолтое значение
    Browser getBrowser(); // конвертируем в возвращаемый тип


    @Key("remoteUrl")// зачитываем данные из командной строки
        //@DefaultValue("")  //обрабатываем дефолтое значение
    URL getRemoteUrl(); // конвертируем в возвращаемый тип

}
