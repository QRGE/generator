package org.qrl.code.generator.modules.test.service.impl;

import org.qrl.code.generator.modules.test.entity.po.TUser;
import org.qrl.code.generator.modules.test.mapper.TUserMapper;
import org.qrl.code.generator.modules.test.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author QR
 * @since 2021-11-18 13:51:04
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
