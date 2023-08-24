package org.devajayantha.standart;

import java.util.Objects;

public class ObjectMain {
    public static class Data {
        public String name;
        public String desc;

        public Data(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "name='" + name + '\'' +
                    ", desc='" + desc + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        excute(new Data("Devajayantha", "Hello world!"));

        excute(null);
    }

    public static void excute(Data data) {
        System.out.println(Objects.toString(data));
    }
}
