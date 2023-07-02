package org.devajayantha;

import static org.devajayantha.data.Constant.*; // import all static members
import org.devajayantha.utils.MathUtil;

public class StaticMain {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,2,3,4,5,6,7));

        Country.City city = new Country.City();
        city.setName("Denpasar");

        System.out.println(city.getName());
    }
}
