package org.qrl.code.generator.modules.test.entity.dto;

import org.qrl.code.generator.modules.test.entity.po.TUser;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author QR
 * @since 2021-11-18 13:51:04
 */
@Getter
@Setter
@ApiModel(value = "TUser数据传输对象")
public class TUserInfo {

    @ApiModelProperty("记录id")
    private Integer dataId;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("昵称")
    private String nickname;




    public TUserInfo parseFromPo(TUser po) {
        dataId = po.getDataId();
        username = po.getUsername();
        password = po.getPassword();
        nickname = po.getNickname();
        return this;
    }


}
