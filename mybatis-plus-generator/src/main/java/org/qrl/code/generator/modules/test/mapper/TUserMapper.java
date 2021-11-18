package org.qrl.code.generator.modules.test.mapper;

import org.qrl.code.generator.modules.test.entity.po.TUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author QR
 * @since 2021-11-18 13:51:04
 */
@Mapper
public interface TUserMapper extends BaseMapper<TUser> {

}
