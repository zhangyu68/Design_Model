package com.zhangyu;

import com.zhangyu.brand.HandSetBrand;
import com.zhangyu.brand.HandSetBrandN;
import com.zhangyu.soft.HandSetAddressList;
import com.zhangyu.soft.HandSetGame;
import com.zhangyu.soft.HandSetSoft;

public class Test {
    public static void main(String[] args) {
        HandSetBrand brand = new HandSetBrandN();
        HandSetSoft soft = new HandSetGame();
        HandSetSoft soft1 = new HandSetAddressList();

        brand.SetHandSoft(soft);
        brand.run();

        brand.SetHandSoft(soft1);
        brand.run();
    }
}
