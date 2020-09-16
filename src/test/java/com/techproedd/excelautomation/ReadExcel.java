package com.techproedd.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

public class ReadExcel {

    @Test
    public void test() throws IOException {

        String dosyaYolu = "C:\\Users\\sezgi\\IdeaProjects\\MavenProje\\src\\test\\resources\\ULKELER.xlsx";

        // Java'da bir dosyayi acmak icin bu kullanilir.
        // Parametre bolumune acmak istedigimiz dosyanin adresi (dosya yolu, path) yazilir.
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

        // Workbook (excel) dosyasini okumaya basladik.
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        // 1.sayfaya gider. (index degeri 0'dan baslar.)
        Sheet sheet       = workbook.getSheetAt(0);

        // 1.satira gidelim. (index degeri 0'dan baslar.)
        Row row           = sheet.getRow(0);

        // 1. Hucreyi alalim. (index degeri 0'dan baslar.)
        Cell ulkeler      = row.getCell(0);
        Cell baskentler   = row.getCell(1);
        Cell meshurlar    = row.getCell(2);

        System.out.println(ulkeler);
        System.out.println(baskentler);
        System.out.println(meshurlar);

        // Excel'e git -> Sheet 0'a git -> 3.indexteki satira git -> 1. indexteki hucre
        System.out.println(workbook.getSheetAt(0).getRow(3).getCell(1));

        System.out.println(workbook.getSheetAt(0).getRow(7).getCell(2));

        System.out.println(workbook.getSheetAt(0).getRow(10).getCell(0));

        // Son satir(Row) in numarasini almak icin (indexini, index 0'dan baslar)
        int satirSayisi = workbook.getSheetAt(0).getLastRowNum() + 1;
        System.out.println("Satir sayisi : " + satirSayisi);

        // Icerisinde veri olan satir sayisini almak isterseniz index'i 1'den basliyor.
        int doluSatirSayisi = workbook.getSheetAt(0).getPhysicalNumberOfRows();
        System.out.println("Dolu satir sayisi : " + doluSatirSayisi);

        int sonSatirinIndexi = workbook.getSheetAt(0).getLastRowNum(); //4

        // tum ulkeleri yazdirdik
        for (int i = 0 ; i <= sonSatirinIndexi ; i++){
            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(0));
        }

        // tum baskentleri yazdiralim.
        for (int j = 0 ; j <= sonSatirinIndexi ; j++){
            System.out.println(workbook.getSheetAt(0).getRow(j).getCell(1));
        }

        // bir satirin son sütunun indexini alma
        // 1'den basliyor.
        int sonSütunIndex = workbook.getSheetAt(0).getRow(0).getLastCellNum();
        System.out.println("Son Sütun Index : " + sonSütunIndex);

        for (int i = 0 ; i < sonSütunIndex ; i++){
            System.out.println("4. Satır " + i +". Sütun :" +workbook.getSheetAt(0).getRow(3).getCell(i));
        }
    }
}
