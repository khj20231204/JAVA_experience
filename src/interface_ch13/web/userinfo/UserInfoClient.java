package interface_ch13.web.userinfo;

import interface_ch13.domain.userinfo.UserInfo;
import interface_ch13.domain.userinfo.dao.UserInfoDao;
import interface_ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import interface_ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        //기본 db.properties의 주소 : /home/khj2023/IdeaProjects/JAVA_Lecture/db.properties
        //FileInputStream fis = new FileInputStream("interface_ch13/web/userinfo/db.properties");

        FileInputStream fis = new FileInputStream("/home/khj2023/IdeaProjects/JAVA_Lecture/src/interface_ch13/web/userinfo/db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        System.out.println(dbType);

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("1234");
        userInfo.setUserName("kim");
        userInfo.setPassword("abcd");

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        }else if (dbType.equals("MYSQL")){
            userInfoDao = new UserInfoMySqlDao();
        }else {
            System.out.println("db error");
            return;
        }

        if(userInfoDao != null){
            userInfoDao.insertUserInfo(userInfo);
            userInfoDao.updateUserInfo(userInfo);
            userInfoDao.deleteUserInfo(userInfo);
        }
    }
}
