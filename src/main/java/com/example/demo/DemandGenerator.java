package com.example.demo;

import com.baomidou.mybatisplus.annotation.DbType;
import com.example.demo.generator.MBGCommonUtils;


/**
 * 用于生产MBG的代码
 * Created by macro on 2018/4/26.
 */
public class DemandGenerator {
    public static void main(String[] args) throws Exception {
        DbType dbType = DbType.MYSQL;
        String dbUrl = "jdbc:mysql://localhost:3306/mybatis?useUnicode=true&amp&characterEncoding=utf8";
        String username = "root";
        String password = "123456";
        String driver = "com.mysql.cj.jdbc.Driver";
        // 表前缀，生成的实体类，不含前缀
        String[] tablePrefixes = {""};
        // 表名，为空，生成所有的表 可以指定 表名字
      //  String[] tableNames = {"material_component_store","material_component","material_component_version","material_store_user","material_store_label","material_store_component"};
        // 表名，为空，生成所有的表 可以指定 表名字
        String[] tableNames = {"user"};
        // 字段前缀
        String[] fieldPrefixes = {""};
        // 基础包名
        String packageName = "com.example.demo";
        // 模块名
        String module = "";
        // 是否生成 Mapper  Service  true 生成
        boolean config = true;

        MBGCommonUtils.execute(dbType, dbUrl, username, password, driver, tablePrefixes, tableNames, packageName, fieldPrefixes, module, config);
    }
}
