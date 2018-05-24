package com.litchi.controller.login;

import com.litchi.common.utils.GeetestLib;
import com.litchi.config.GeetestConfig;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

/**
 * @author gehuadong
 * @create 2018-05-21 14:51
 **/
@RestController
@RequestMapping(value = "login")
public class LoginController {

    @PostMapping("verifyLogin")
    public void VerifyLogin(@RequestBody(required=false) Map<String,String> conditions, HttpServletRequest request) throws ServletException, IOException {
        GeetestLib gtSdk = new GeetestLib(GeetestConfig.getGeetest_id(), GeetestConfig.getGeetest_key(),
                GeetestConfig.isnewfailback());
//
//        String challenge = request.getParameter(GeetestLib.fn_geetest_challenge);
//        String validate = request.getParameter(GeetestLib.fn_geetest_validate);
//        String seccode = request.getParameter(GeetestLib.fn_geetest_seccode);
//
//        //从session中获取gt-server状态
//        int gt_server_status_code = (Integer) request.getSession().getAttribute(gtSdk.gtServerStatusSessionKey);
//        //从session中获取userid
//        String userid = (String)request.getSession().getAttribute("userid");
//
//        //自定义参数,可选择添加
//        HashMap<String, String> param = new HashMap<String, String>();
//        param.put("user_id", userid); //网站用户id
//        param.put("client_type", "web"); //web:电脑上的浏览器；h5:手机上的浏览器，包括移动应用内完全内置的web_view；native：通过原生SDK植入APP应用的方式
//        param.put("ip_address", "127.0.0.1"); //传输用户请求验证时所携带的IP
//
//        int gtResult = 0;
//        if (gt_server_status_code == 1) {
//            //gt-server正常，向gt-server进行二次验证
//            gtResult = gtSdk.enhencedValidateRequest(challenge, validate, seccode, param);
//            System.out.println(gtResult);
//        } else {
//            // gt-server非正常情况下，进行failback模式验证
//            System.out.println("failback:use your own server captcha validate");
//            gtResult = gtSdk.failbackValidateRequest(challenge, validate, seccode);
//            System.out.println(gtResult);
//        }
//
//        if (gtResult == 1) {
//            // 验证成功
//            PrintWriter out = response.getWriter();
//            JSONObject data = new JSONObject();
//            try {
//                data.put("status", "success");
//                data.put("version", gtSdk.getVersionInfo());
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            out.println(data.toString());
//        }
//        else {
//            // 验证失败
//            JSONObject data = new JSONObject();
//            try {
//                data.put("status", "fail");
//                data.put("version", gtSdk.getVersionInfo());
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            PrintWriter out = response.getWriter();
//            out.println(data.toString());
//        }
    }
}
