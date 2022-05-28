package com.example.demo.generator;

public class Config {
    /** 包名：com.slt.zd.api.controller */
    public static final String PACKAGE_NAME_CONTROLLER = "com.jd.jdt.lcap.pageserver.controller";

    /** 包名：service */
    public static final String PACKAGE_NAME_SERVICE = "service";

    /** 包名：service.impl */
    public static final String PACKAGE_NAME_SERVICE_IMPL = "service.impl";

    /** 包名：model */
    public static final String PACKAGE_NAME_MODEL = "entity";

    /** 包名：dao */
    public static final String PACKAGE_NAME_DAO = "dao";

    /** 包名：xml */
    public static final String PACKAGE_NAME_XML = "mapper";

    /** 文件名后缀：Model */
    public static final String FILE_NAME_MODEL = "%s";

    /** 文件名后缀：Dao */
    public static final String FILE_NAME_DAO = "%sDao";

    /** 文件名后缀：Mapper */
    public static final String FILE_NAME_XML = "%sMapper";

    /** MP开头，Service结尾 */
    public static final String FILE_NAME_SERVICE = "%sService";

    /** 文件名后缀：ServiceImpl */
    public static final String FILE_NAME_SERVICE_IMPL = "%sServiceImpl";

    /** 文件名后缀：Controller */
    public static final String FILE_NAME_CONTROLLER = "%sController";


    /** 作者 */
    public static final String AUTHOR = "zzn";

    // 生成文件的输出目录
    public static String projectPath = System.getProperty("user.dir");

    // 输出目录
    public static final String outputDir = projectPath + "/src/main/java";
//    public static final String outputDir = "/Users/wenyifeng/Workspaces/code-generator";
}