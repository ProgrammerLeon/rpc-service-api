package com.pgleon.rpcapi.user;

import com.pgleon.rpcapi.user.pojo.Account;

/**
 * @Description: 用户服务提供的rpc接口，根据token获取userId
 */
public interface AccountService {

    /**
     * 创建账户
     * @param account
     * @return
     */
    Account createAccount(Account account);

    /**
     * 修改账户信息
     * @param account
     * @return
     */
    boolean updateAccount(Account account);
}