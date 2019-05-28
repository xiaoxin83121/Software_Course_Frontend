package com.example.alarmapp.Utils;

public class URLConf {


    // 本地测试地址
    private static final String TEST_BASE_URL = "http://10.135.31.34:8000/";
    // 服务器地址
    private static final String BASE_URL = "http://114.115.160.42:8080/";
    // 正在使用的URL
    public static final String USING_URL = TEST_BASE_URL;
//    public static final String USING_URL = BASE_URL;

    /*
    * 具体的接口
    * */
    // Account
    public static final String REGISTER = "api/account/register/";
    public static final String LOGIN = "api/account/login/";
    public static final String FRESHTOKEN = "api/accout/freshtoken/";
    public static final String INFOINDEX = "api/account/index/";
    public static final String MODINFO = "api/account/info_mod/";

    //Control
    public static final String ONOFF = "api/control/onoff/";
    public static final String RECORD = "api/control/record/";
    public static final String GETSENSOR = "api/control/getsensor/";

}
