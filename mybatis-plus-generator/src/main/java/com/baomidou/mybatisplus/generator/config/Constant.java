package com.baomidou.mybatisplus.generator.config;

import java.io.File;

public interface Constant {

    String PARENT_PACKAGE = "org.qrl.code.generator";

    String PARENT_PACKAGE_PATH = PARENT_PACKAGE.replace(".", File.separator);

    String FUNCTION_MODULE = "test";

    String AUTHOR = "QR";

    String URL = "jdbc:mysql://127.0.0.1:3306/dtrd?characterEncoding=UTF-8&useUnicode=true&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Shanghai";

    String USERNAME = "root";

    String PASSWORD = "QRWUDI666";

    String PROJECT_PATH = System.getProperty("user.dir");

    String OUTPUT_DIR = PROJECT_PATH + "src/main/java";

    String MAPPER_XML_PATH = OUTPUT_DIR + File.separator + PARENT_PACKAGE_PATH + File.separator + FUNCTION_MODULE + "mapper/xml";

    String TABLE = "";

}
