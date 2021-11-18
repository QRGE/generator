package org.qrl.code.generator.modules.test.entity.po;

import org.qrl.code.generator.modules.test.entity.dto.TUserInfo;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
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
@TableName("t_user")
public class TUser {

    /**
     * 记录id
     */
    @TableId(value = "data_id", type = IdType.AUTO)
    private Integer dataId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 删除状态, 1-是-0否
     */
    @TableLogic
    private Integer isDel;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    private TUser init() {
        isDel = 0;
        createTime = new Date();
        return this;
    }

    public TUser parseFromDto(TUserInfo dto) {
        dataId = dto.getDataId();
        username = dto.getUsername();
        password = dto.getPassword();
        nickname = dto.getNickname();
        return this;
    }


}
