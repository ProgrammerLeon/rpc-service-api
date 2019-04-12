package com.pgleon.rpcapi.user;

import com.pgleon.rpcapi.user.pojo.TokenIdentity;
import com.pgleon.rpcapi.user.pojo.UserType;
import com.pgleon.rpcapi.user.pojo.ValidatePhone;

import java.util.List;

/**
 * @Description: 用户服务提供的rpc接口，根据token获取userId
 */
public interface UserService {
    /**
     * @Description: 根据token获取用户id
     * @Param: token
     * @Return: userId 正常userId > 0,
     *                  若token失效则返回 -1，
     *                  若在获取userId过程中出现异常则返回 -2。
     */
    int getUserIdByToken(String token);


    /**
     * 提供短信验证码正确性验证的rpc接口
     */
    boolean validatePhoneCheck(ValidatePhone validatePhone) throws Exception;

    /**
     * 保存登录信息，生成token
     * @param accountId
     * @return
     */
    String createToken(Integer accountId);

    /**
     * 根据公司Id和代理人获取开通模块
     * @param companyId
     * @param agentId
     * @return
     */
    List<Integer> getOpenedModules(Integer companyId, Integer agentId);

    /**
     * 根据token获取账户类型
     * @param token
     * @return
     */
    UserType getUserTypeByToken(String token);


    /**
     * 根据token获取token体
     * @param token
     * @return
     */
    TokenIdentity getTokenIdentityByToken(String token);

    /**
     * 获取当前代理人最新的token
     * @param userId
     * @return
     */
    TokenIdentity getLastTokenIdentity(Integer userId,String appId);

    /**
     * 删除失效token 修改密码删除和异地登录删除
     * @param token
     * @return
     */
    boolean deleteInvalidateToken(String token);

}