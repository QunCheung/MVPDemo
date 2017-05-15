package cxzx.bdyx.com.mvpdemo.view;

import cxzx.bdyx.com.mvpdemo.model.LoginListener;

/**
 * Created by QunCheung on 2017/5/15.
 */

public interface ILoginView {
    String getUserName();

    String getUserPsd();

    LoginListener getLoginListener();

    void setUserName(String userName);
}
