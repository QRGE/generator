package com.baomidou.mybatisplus.generator;

import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import static com.baomidou.mybatisplus.generator.config.Constant.*;

/**
 * @author qr
 * @date 2021/11/17 3:28 PM
 */
public class QRCodeGenerator {

    public static void main(String[] args) {
        FastAutoGenerator.create(URL, USERNAME, PASSWORD)
            .globalConfig(builder -> builder
                .author(AUTHOR)
                .enableSwagger()
                .outputDir(OUTPUT_DIR)
            )
            .packageConfig(builder -> builder
                .parent(PARENT_PACKAGE)
                .moduleName(FUNCTION_MODULE)
            )
            .templateEngine(new FreemarkerTemplateEngine())
            .execute();
    }
}
