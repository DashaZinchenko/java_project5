package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Objects;

public class MyDataProvider {
    static {
        int[][] arr = new int[][]{{1, 2, 3}, {2, 4, 6}, {3, 6, 9}};
    }

    @DataProvider(name = "data")
    public static Object[][] getInvalidData() {
        return new Object[][]{{null}, {""}, {" "}, {"0"}};
    }


}
