package cxzx.bdyx.com.mvpdemo.model;

import android.text.TextUtils;

/**
 * Created by QunCheung on 2017/5/15.
 */

public class LoginModel implements ILoginModel{
    public void Login(String userName,String userPsd,LoginListener listener){
        if (!TextUtils.isEmpty(userName) && !TextUtils.isEmpty(userPsd)){
            listener.onLoginSuccess();
        }else{
            listener.onLoginFailed();
        }
    }

    @Override
    public String getUserName() {
        return "1234567890";
    }
}
