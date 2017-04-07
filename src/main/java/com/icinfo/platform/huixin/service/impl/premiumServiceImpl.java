package com.icinfo.platform.huixin.service.impl;

import com.icinfo.platform.huixin.service.IPremiumService;
import org.apache.commons.collections4.Put;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.poifs.filesystem.POIFSWriterEvent;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.springframework.stereotype.Service;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;

import static com.sun.tools.doclets.formats.html.markup.HtmlStyle.description;
import static com.sun.tools.doclint.Entity.nu;
import static com.sun.tools.internal.xjc.reader.Ring.add;
import static sun.tools.jconsole.Messages.DESCRIPTION;

/**
 * 加班补贴服务接口实现
 */
@Service
public class premiumServiceImpl implements IPremiumService {
    public static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    public static SimpleDateFormat dateSdf = new SimpleDateFormat("yyyy-MM-dd");

    public Map<String, List<String>> map = new HashMap<String, List<String>>(){
        {
            put("5", new ArrayList<>());
            put("11", new ArrayList<>());
        }
    };

    public static List<String> seven = new ArrayList<>();
    public static List<String> nine = new ArrayList<>();


    @Override
    public void calculate(String flag, File file) throws Exception {
        seven = new ArrayList<>();
        nine = new ArrayList<>();
        InputStream is = new FileInputStream(file);

        POIFSFileSystem ps = new POIFSFileSystem(is);
        HSSFWorkbook workbook = new HSSFWorkbook(ps);

        HSSFSheet sheetAt = workbook.getSheetAt(0);
        //总行数
        int lastRowNum = sheetAt.getLastRowNum();
        HSSFRow firstRow = sheetAt.getRow(0);

        Date sevenTime = sdf.parse("19:00");
        Date nineTime = sdf.parse("21:00");

        for (int i = 1; i <= lastRowNum; i++) {
            HSSFRow row = sheetAt.getRow(i);
            HSSFCell cell = row.getCell(11);
            String endTimeStr = cell == null || cell.equals("") ? null : cell.getStringCellValue();
            if (endTimeStr != null && !endTimeStr.equals("")) {
                Date endTime = sdf.parse(endTimeStr);
                if (endTime.after(nineTime)) {
                   nine.add(row.getCell(7).getStringCellValue());
                } else if (endTime.after(sevenTime)) {
                    seven.add(row.getCell(7).getStringCellValue());
                }
            }
        }

        writerExcel(flag);
    }

    public void writerExcel(String flag) throws Exception{
        InputStream is2 = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\kaoqin\\联连应用开发部_2017年3月加班补助情况表.xls"));
        POIFSFileSystem ps2 = new POIFSFileSystem(is2);
        HSSFWorkbook workbook2 = new HSSFWorkbook(ps2);

        HSSFSheet sheetAt2 = workbook2.getSheetAt(3);
        HSSFRow firstRow = sheetAt2.getRow(0);
        HSSFRow writeRow = sheetAt2.getRow(Integer.parseInt(flag));

        int lastCellNum = firstRow.getLastCellNum();
        FormulaEvaluator formulaEvaluator = new HSSFFormulaEvaluator(workbook2);

        for(int i= 1; i<=lastCellNum; i++){
            String dateCellValue = dateSdf.format(firstRow.getCell(i).getDateCellValue());
            if(seven.contains(dateCellValue)){
                writeRow.getCell(i).setCellValue(1);
            }else if(nine.contains(dateCellValue)){
                writeRow.getCell(i).setCellValue(10);
            }
            if(dateCellValue.equals("2017-03-31")){
                for(i++;i<lastCellNum;i++){
                    formulaEvaluator.evaluate(writeRow.getCell(i));
                }
                break;
            }
        }

        OutputStream outputStream = new FileOutputStream(new File("C:\\Users\\Administrator\\Desktop\\kaoqin\\联连应用开发部_2017年3月加班补助情况表.xls"));




        workbook2.write(outputStream);
        outputStream.flush();
        outputStream.close();
    }


}
