package cxzx.bdyx.com.mvpdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cxzx.bdyx.com.mvpdemo.R;
import cxzx.bdyx.com.mvpdemo.model.LoginListener;
import cxzx.bdyx.com.mvpdemo.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements ILoginView, LoginListener {

    public EditText userNameEt;
    public EditText userPsdEt;
    public Button signUpBtn;
    private LoginPresenter presenter = new LoginPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        createParamater();
    }

    private void createParamater() {
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.login();
            }
        });
        presenter.setUserName();
    }

    private void initView() {
        userNameEt = ((EditText) findViewById(R.id.act_login_user_name_et));
        userPsdEt = ((EditText) findViewById(R.id.act_login_user_psd_et));
        signUpBtn = ((Button) findViewById(R.id.act_login_sign_up_btn));
    }

    @Override
    public String getUserName() {
        return userNameEt.getText().toString();
    }

    @Override
    public String getUserPsd() {
        return userPsdEt.getText().toString();
    }

    @Override
    public LoginListener getLoginListener() {
        return this;
    }

    @Override
    public void setUserName(String userName) {
        userNameEt.setText(userName);
    }

    @Override
    public void onLoginSuccess() {
        Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginFailed() {
        Toast.makeText(this,"登录失败",Toast.LENGTH_SHORT).show();
    }
}
