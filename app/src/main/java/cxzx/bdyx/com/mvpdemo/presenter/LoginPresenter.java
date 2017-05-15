package cxzx.bdyx.com.mvpdemo.presenter;

import cxzx.bdyx.com.mvpdemo.model.LoginModel;
import cxzx.bdyx.com.mvpdemo.view.ILoginView;

/**
 * Created by QunCheung on 2017/5/15.
 */

public class LoginPresenter {
    private LoginModel loginModel;
    private ILoginView loginView;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
        loginModel = new LoginModel();
    }

    public void login() {
        loginModel.Login(loginView.getUserName(),loginView.getUserPsd(),loginView.getLoginListener());
    }

    public void setUserName() {
        loginView.setUserName(loginModel.getUserName());
    }
}
