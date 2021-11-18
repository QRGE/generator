package com.baomidou.mybatisplus.generator;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;

import static com.baomidou.mybatisplus.generator.config.Constant.*;

/**
 * @author qr
 * @date 2021/11/17 3:28 PM
 */
public class QRCodeGenerator {

    public static void main(String[] args) {
        FastAutoGenerator.create(URL, USERNAME, PASSWORD)
            // 全局配置
            .globalConfig(builder -> builder
                .author(AUTHOR)
                .enableSwagger()
                .dateType(DateType.ONLY_DATE)
                .disableOpenDir()
                .commentDate("yyyy-MM-dd HH:mm:ss")
                .outputDir(OUTPUT_DIR)
            )
            // 模版配置
            .templateConfig(
                builder -> builder
                    .entity("templates/entity.java")
                    .controller("templates/controller.java")
                    .mapper("templates/mapper.java")
                    .mapperXml("templates/mapper.xml")
                    .service("templates/service.java")
                    .serviceImpl("templates/serviceImpl.java")
                    .dto("templates/dto.java")
            )
            // 包配置
            .packageConfig(builder -> builder
                .parent(PARENT_PACKAGE)
                .moduleName(FUNCTION_MODULE)
                .entity("entity.po")
                .dto("entity.dto")
            )
            // 模版引擎配置
            .templateEngine(new FreemarkerTemplateEngine())
            // 策略配置
            .strategyConfig(builder -> builder
                .enableSkipView()
                .entityBuilder()
                    .disableSerialVersionUID()
                    .enableLombok()
                    .logicDeleteColumnName("is_del")
                    .idType(IdType.AUTO)
                    .addTableFills(new Column("create_time", FieldFill.INSERT))
                    .addTableFills(new Column("update_time", FieldFill.INSERT_UPDATE))
                    .addIgnoreColumns("test_ignore")
                .mapperBuilder()
                    .enableBaseColumnList()
                    .enableBaseResultMap()
                    .enableMapperAnnotation()
                .dtoBuilder()
                    .enableTableFieldAnnotation()
                    .addIgnoreColumns("is_del", "create_time", "update_time")
                .controllerBuilder()
                    .enableRestStyle()
            )
            .execute();
    }
}
