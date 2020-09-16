package com.techproedd.excelautomation;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {

    @Test
    public void test() throws IOException {

        String dosyaYolu = "C:\\Users\\sezgi\\IdeaProjects\\MavenProje\\src\\test\\resources\\ULKELER.xlsx";

        // Java'da bir dosyayi acmak icin bu kullanilir.
        // Parametre bolumune acmak istedigimiz dosyanin adresi (dosya yolu, path) yazilir.
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

        // Workbook (excel) dosyasini okumaya basladik.
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        // Dosya uzerinde yazma islemi gerceklestirecegimiz icin buraya FileOutputStream class'indan bir tane
        // nesne olusturmamiz gerekiyor.
        FileOutputStream fileOutputStream = new FileOutputStream(dosyaYolu);

        




        fileOutputStream.close();
        workbook.close();
        fileInputStream.close();
    }
}
