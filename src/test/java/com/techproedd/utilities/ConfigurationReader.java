package com.techproedd.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    // ConfigurationReader class'ini projemizin heryerinden nesne uretmeden, miras almadan kullanabilecek sekilde tasarlayalim.

    // static: program calisir calismaz, bellekte yer tutmaya yarayan keyword

    static Properties properties;

    static{
        // okumak istedigimiz configuration.properties file'in dosya yolu
        String path = "configuration.properties";

        // dene - hata varsa yakala.
        // bu islemi dene eger hata alirsan, PROGRAMI DURDURMA
        try{
            // okumak istediginiz dosyanin path(adres)'ini yaziyorsun.
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            // fileInputStream'dan urettigim file dosyasi burada, bunu kullanabilirsiniz.
            properties.load(file);
        }catch (Exception e){

        }
    }
    // properties.getProperty("username");  --> manager2
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

    // ConfigurationReader.getProperty("fb_email") --- > hamza@techproed.com


}
