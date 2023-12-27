package interface_ch13.domain.userinfo.dao.mysql;

import interface_ch13.domain.userinfo.UserInfo;
import interface_ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao
{
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySql DB UserID = "+ userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MySql DB UserID = "+ userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from MySql DB UserID = "+ userInfo.getUserId());
    }
}
