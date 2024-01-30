package org.example;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class DataDrivenApproach {
    @Test
    public void democall() throws IOException {
        EcelDataFetch ef = new EcelDataFetch();
        List<String> dataswr1 = ef.datafetch();
        for(String data:dataswr1)
        {
            System.out.println(data);
        }


    }


}
