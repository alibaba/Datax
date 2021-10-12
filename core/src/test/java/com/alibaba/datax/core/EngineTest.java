package com.alibaba.datax.core;


public class EngineTest {

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.library.path"));
//        String[] params = {"-mode", "standalone", "-jobid", "-1", "-job", "/Users/yangzy/workspace/DataX/job/opentsdb2stream.json"};
        String[] params = {"-mode", "standalone", "-jobid", "-1", "-job", "/Users/yangzy/workspace/DataX/job/opentsdb2tdengine.json"};
        System.setProperty("datax.home", "/Users/yangzy/workspace/DataX/target/datax/datax");
        try {
            Engine.entry(params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}