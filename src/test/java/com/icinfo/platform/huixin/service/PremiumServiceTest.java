package com.icinfo.platform.huixin.service;

import com.icinfo.platform.common.test.SpringTxTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;

/**
 * TODO
 */
public class PremiumServiceTest extends SpringTxTestCase {
    @Autowired
    private IPremiumService premiumService;

    @Test
    public void testCalculate() throws Exception {
        File file = new File("C:\\Users\\Administrator\\Desktop\\kaoqin\\明细");
        File[] files = file.listFiles();
        for (File f : files) {
            String flag = f.getName().substring(0, f.getName().indexOf("."));
            premiumService.calculate(flag, f);
        }
    }
}
